package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public final class ListenerSet<T> {
    private static final int MSG_ITERATION_FINISHED = 0;
    private final com.google.android.exoplayer2.util.Clock clock;
    private final java.util.ArrayDeque<java.lang.Runnable> flushingEvents;
    private final com.google.android.exoplayer2.util.HandlerWrapper handler;
    private final com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent;
    private final java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet.ListenerHolder<T>> listeners;
    private final java.util.ArrayDeque<java.lang.Runnable> queuedEvents;
    private boolean released;

    public interface Event<T> {
        void invoke(T t);
    }

    public interface IterationFinishedEvent<T> {
        void invoke(T t, com.google.android.exoplayer2.util.FlagSet flagSet);
    }

    public ListenerSet(android.os.Looper looper, com.google.android.exoplayer2.util.Clock clock, com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent);
    }

    private ListenerSet(java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet.ListenerHolder<T>> copyOnWriteArraySet, android.os.Looper looper, com.google.android.exoplayer2.util.Clock clock, com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        this.clock = clock;
        this.listeners = copyOnWriteArraySet;
        this.iterationFinishedEvent = iterationFinishedEvent;
        this.flushingEvents = new java.util.ArrayDeque<>();
        this.queuedEvents = new java.util.ArrayDeque<>();
        this.handler = clock.createHandler(looper, new android.os.Handler.Callback() { // from class: com.google.android.exoplayer2.util.ListenerSet$$ExternalSyntheticLambda1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                boolean handleMessage;
                handleMessage = com.google.android.exoplayer2.util.ListenerSet.this.handleMessage(message);
                return handleMessage;
            }
        });
    }

    public com.google.android.exoplayer2.util.ListenerSet<T> copy(android.os.Looper looper, com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        return copy(looper, this.clock, iterationFinishedEvent);
    }

    public com.google.android.exoplayer2.util.ListenerSet<T> copy(android.os.Looper looper, com.google.android.exoplayer2.util.Clock clock, com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        return new com.google.android.exoplayer2.util.ListenerSet<>(this.listeners, looper, clock, iterationFinishedEvent);
    }

    public void add(T t) {
        if (this.released) {
            return;
        }
        com.google.android.exoplayer2.util.Assertions.checkNotNull(t);
        this.listeners.add(new com.google.android.exoplayer2.util.ListenerSet.ListenerHolder<>(t));
    }

    public void remove(T t) {
        java.util.Iterator<com.google.android.exoplayer2.util.ListenerSet.ListenerHolder<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.util.ListenerSet.ListenerHolder<T> next = it.next();
            if (next.listener.equals(t)) {
                next.release(this.iterationFinishedEvent);
                this.listeners.remove(next);
            }
        }
    }

    public void clear() {
        this.listeners.clear();
    }

    public int size() {
        return this.listeners.size();
    }

    public void queueEvent(final int i, final com.google.android.exoplayer2.util.ListenerSet.Event<T> event) {
        final java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet(this.listeners);
        this.queuedEvents.add(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.util.ListenerSet$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.util.ListenerSet.lambda$queueEvent$0(copyOnWriteArraySet, i, event);
            }
        });
    }

    static /* synthetic */ void lambda$queueEvent$0(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, int i, com.google.android.exoplayer2.util.ListenerSet.Event event) {
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.google.android.exoplayer2.util.ListenerSet.ListenerHolder) it.next()).invoke(i, event);
        }
    }

    public void flushEvents() {
        if (this.queuedEvents.isEmpty()) {
            return;
        }
        if (!this.handler.hasMessages(0)) {
            com.google.android.exoplayer2.util.HandlerWrapper handlerWrapper = this.handler;
            handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(0));
        }
        boolean z = !this.flushingEvents.isEmpty();
        this.flushingEvents.addAll(this.queuedEvents);
        this.queuedEvents.clear();
        if (z) {
            return;
        }
        while (!this.flushingEvents.isEmpty()) {
            this.flushingEvents.peekFirst().run();
            this.flushingEvents.removeFirst();
        }
    }

    public void sendEvent(int i, com.google.android.exoplayer2.util.ListenerSet.Event<T> event) {
        queueEvent(i, event);
        flushEvents();
    }

    public void release() {
        java.util.Iterator<com.google.android.exoplayer2.util.ListenerSet.ListenerHolder<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().release(this.iterationFinishedEvent);
        }
        this.listeners.clear();
        this.released = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(android.os.Message message) {
        java.util.Iterator<com.google.android.exoplayer2.util.ListenerSet.ListenerHolder<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().iterationFinished(this.iterationFinishedEvent);
            if (this.handler.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ListenerHolder<T> {
        private com.google.android.exoplayer2.util.FlagSet.Builder flagsBuilder = new com.google.android.exoplayer2.util.FlagSet.Builder();
        public final T listener;
        private boolean needsIterationFinishedEvent;
        private boolean released;

        public ListenerHolder(T t) {
            this.listener = t;
        }

        public void release(com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
            this.released = true;
            if (this.needsIterationFinishedEvent) {
                this.needsIterationFinishedEvent = false;
                iterationFinishedEvent.invoke(this.listener, this.flagsBuilder.build());
            }
        }

        public void invoke(int i, com.google.android.exoplayer2.util.ListenerSet.Event<T> event) {
            if (this.released) {
                return;
            }
            if (i != -1) {
                this.flagsBuilder.add(i);
            }
            this.needsIterationFinishedEvent = true;
            event.invoke(this.listener);
        }

        public void iterationFinished(com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
            if (this.released || !this.needsIterationFinishedEvent) {
                return;
            }
            com.google.android.exoplayer2.util.FlagSet build = this.flagsBuilder.build();
            this.flagsBuilder = new com.google.android.exoplayer2.util.FlagSet.Builder();
            this.needsIterationFinishedEvent = false;
            iterationFinishedEvent.invoke(this.listener, build);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.listener.equals(((com.google.android.exoplayer2.util.ListenerSet.ListenerHolder) obj).listener);
        }

        public int hashCode() {
            return this.listener.hashCode();
        }
    }
}
