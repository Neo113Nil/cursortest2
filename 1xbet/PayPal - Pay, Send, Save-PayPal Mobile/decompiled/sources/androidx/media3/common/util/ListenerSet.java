package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class ListenerSet<T> {
    private final java.util.ArrayDeque<java.lang.Runnable> Camera2StreamConfigurationMap;
    private final androidx.media3.common.util.Clock getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> getHighSpeedVideoFpsRanges;
    private final androidx.media3.common.util.HandlerWrapper getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> getHighSpeedVideoSizes;
    private final java.lang.Thread getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private final java.lang.Object getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private final java.util.ArrayDeque<java.lang.Runnable> getOutputMinFrameDuration;

    public interface Event<T> {
        void invoke(T t);
    }

    public interface IterationFinishedEvent<T> {
        void invoke(T t, androidx.media3.common.FlagSet flagSet);
    }

    public ListenerSet(android.os.Looper looper) {
        this(looper.getThread());
    }

    public ListenerSet(java.lang.Thread thread) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public ListenerSet(android.os.Looper looper, androidx.media3.common.util.Clock clock, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), looper, looper.getThread(), clock, iterationFinishedEvent, true);
    }

    private ListenerSet(java.util.concurrent.CopyOnWriteArraySet<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> copyOnWriteArraySet, android.os.Looper looper, java.lang.Thread thread, androidx.media3.common.util.Clock clock, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = clock;
        this.getHighSpeedVideoSizesFor = thread;
        this.getHighSpeedVideoSizes = copyOnWriteArraySet;
        this.getHighSpeedVideoFpsRanges = iterationFinishedEvent;
        this.getInputSizeshNQ4ISI = new java.lang.Object();
        this.Camera2StreamConfigurationMap = new java.util.ArrayDeque<>();
        this.getOutputMinFrameDuration = new java.util.ArrayDeque<>();
        if (looper != null && clock != null && iterationFinishedEvent != null) {
            this.getHighSpeedVideoFpsRangesFor = clock.createHandler(looper, new android.os.Handler.Callback() { // from class: androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda0
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(android.os.Message message) {
                    return androidx.media3.common.util.ListenerSet.m9177$r8$lambda$rFcF5Pkb99AL585p52u78YfNkY(androidx.media3.common.util.ListenerSet.this, message);
                }
            });
        } else {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        this.getOutputFormats = z;
    }

    public final androidx.media3.common.util.ListenerSet<T> copy(android.os.Looper looper, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        return copy(looper, this.getHighResolutionOutputSizeshNQ4ISI, iterationFinishedEvent);
    }

    public final androidx.media3.common.util.ListenerSet<T> copy(android.os.Looper looper) {
        return copy(looper, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
    }

    public final androidx.media3.common.util.ListenerSet<T> copy(androidx.media3.common.util.Clock clock) {
        androidx.media3.common.util.HandlerWrapper handlerWrapper = this.getHighSpeedVideoFpsRangesFor;
        if (handlerWrapper != null) {
            return copy(handlerWrapper.getLooper(), clock, this.getHighSpeedVideoFpsRanges);
        }
        return new androidx.media3.common.util.ListenerSet<>(this.getHighSpeedVideoSizes, null, this.getHighSpeedVideoSizesFor, clock, null, this.getOutputFormats);
    }

    public final androidx.media3.common.util.ListenerSet<T> copy(android.os.Looper looper, androidx.media3.common.util.Clock clock, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        com.google.common.base.Preconditions.checkState(clock != null || iterationFinishedEvent == null);
        return new androidx.media3.common.util.ListenerSet<>(this.getHighSpeedVideoSizes, looper, looper.getThread(), clock, iterationFinishedEvent, this.getOutputFormats);
    }

    public final void add(T t) {
        com.google.common.base.Preconditions.checkNotNull(t);
        synchronized (this.getInputSizeshNQ4ISI) {
            if (this.getInputFormats) {
                return;
            }
            this.getHighSpeedVideoSizes.add(new androidx.media3.common.util.ListenerSet.ListenerHolder<>(t));
        }
    }

    public final void queueEvent(androidx.media3.common.util.ListenerSet.Event<T> event) {
        queueEvent(-1, event);
    }

    static /* synthetic */ void getHighSpeedVideoSizes(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, int i, androidx.media3.common.util.ListenerSet.Event event) {
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            androidx.media3.common.util.ListenerSet.ListenerHolder listenerHolder = (androidx.media3.common.util.ListenerSet.ListenerHolder) it.next();
            if (!listenerHolder.Camera2StreamConfigurationMap) {
                if (i != -1) {
                    listenerHolder.getHighSpeedVideoFpsRanges.add(i);
                }
                listenerHolder.getHighSpeedVideoSizes = true;
                event.invoke(listenerHolder.getHighResolutionOutputSizeshNQ4ISI);
            }
        }
    }

    public final void sendEvent(androidx.media3.common.util.ListenerSet.Event<T> event) {
        sendEvent(-1, event);
    }

    public final void sendEvent(int i, androidx.media3.common.util.ListenerSet.Event<T> event) {
        queueEvent(i, event);
        flushEvents();
    }

    @java.lang.Deprecated
    public final void setThrowsWhenUsingWrongThread(boolean z) {
        this.getOutputFormats = z;
    }

    static final class ListenerHolder<T> {
        boolean Camera2StreamConfigurationMap;
        public final T getHighResolutionOutputSizeshNQ4ISI;
        androidx.media3.common.FlagSet.Builder getHighSpeedVideoFpsRanges = new androidx.media3.common.FlagSet.Builder();
        boolean getHighSpeedVideoSizes;

        public ListenerHolder(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(((androidx.media3.common.util.ListenerSet.ListenerHolder) obj).getHighResolutionOutputSizeshNQ4ISI);
        }

        public final int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.media3.common.util.ListenerSet.ListenerHolder listenerHolder, androidx.media3.common.util.ListenerSet.IterationFinishedEvent iterationFinishedEvent) {
            listenerHolder.Camera2StreamConfigurationMap = true;
            if (iterationFinishedEvent == null || !listenerHolder.getHighSpeedVideoSizes) {
                return;
            }
            listenerHolder.getHighSpeedVideoSizes = false;
            iterationFinishedEvent.invoke(listenerHolder.getHighResolutionOutputSizeshNQ4ISI, listenerHolder.getHighSpeedVideoFpsRanges.build());
        }
    }

    /* renamed from: $r8$lambda$rFcF5Pkb99AL585p5-2u78YfNkY, reason: not valid java name */
    public static /* synthetic */ boolean m9177$r8$lambda$rFcF5Pkb99AL585p52u78YfNkY(androidx.media3.common.util.ListenerSet listenerSet, android.os.Message message) {
        androidx.media3.common.util.ListenerSet.IterationFinishedEvent iterationFinishedEvent = (androidx.media3.common.util.ListenerSet.IterationFinishedEvent) com.google.common.base.Preconditions.checkNotNull(listenerSet.getHighSpeedVideoFpsRanges);
        java.util.Iterator<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> it = listenerSet.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.media3.common.util.ListenerSet.ListenerHolder<T> next = it.next();
            if (!next.Camera2StreamConfigurationMap && next.getHighSpeedVideoSizes) {
                androidx.media3.common.FlagSet build = next.getHighSpeedVideoFpsRanges.build();
                next.getHighSpeedVideoFpsRanges = new androidx.media3.common.FlagSet.Builder();
                next.getHighSpeedVideoSizes = false;
                iterationFinishedEvent.invoke(next.getHighResolutionOutputSizeshNQ4ISI, build);
            }
            if (((androidx.media3.common.util.HandlerWrapper) com.google.common.base.Preconditions.checkNotNull(listenerSet.getHighSpeedVideoFpsRangesFor)).hasMessages(1)) {
                break;
            }
        }
        return true;
    }

    public final void clear() {
        if (this.getOutputFormats) {
            com.google.common.base.Preconditions.checkState(java.lang.Thread.currentThread() == this.getHighSpeedVideoSizesFor);
        }
        java.util.Iterator<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.media3.common.util.ListenerSet.ListenerHolder.getHighResolutionOutputSizeshNQ4ISI(it.next(), this.getHighSpeedVideoFpsRanges);
        }
        this.getHighSpeedVideoSizes.clear();
    }

    public final void flushEvents() {
        if (this.getOutputFormats) {
            com.google.common.base.Preconditions.checkState(java.lang.Thread.currentThread() == this.getHighSpeedVideoSizesFor);
        }
        if (this.getOutputMinFrameDuration.isEmpty()) {
            return;
        }
        if (this.getHighSpeedVideoFpsRanges != null && !((androidx.media3.common.util.HandlerWrapper) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRangesFor)).hasMessages(1)) {
            androidx.media3.common.util.HandlerWrapper handlerWrapper = this.getHighSpeedVideoFpsRangesFor;
            handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(1));
        }
        boolean isEmpty = this.Camera2StreamConfigurationMap.isEmpty();
        this.Camera2StreamConfigurationMap.addAll(this.getOutputMinFrameDuration);
        this.getOutputMinFrameDuration.clear();
        if (isEmpty) {
            while (!this.Camera2StreamConfigurationMap.isEmpty()) {
                this.Camera2StreamConfigurationMap.peekFirst().run();
                this.Camera2StreamConfigurationMap.removeFirst();
            }
        }
    }

    public final void queueEvent(final int i, final androidx.media3.common.util.ListenerSet.Event<T> event) {
        if (this.getOutputFormats) {
            com.google.common.base.Preconditions.checkState(java.lang.Thread.currentThread() == this.getHighSpeedVideoSizesFor);
        }
        final java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet(this.getHighSpeedVideoSizes);
        this.getOutputMinFrameDuration.add(new java.lang.Runnable() { // from class: androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.ListenerSet.getHighSpeedVideoSizes(copyOnWriteArraySet, i, event);
            }
        });
    }

    public final void release() {
        if (this.getOutputFormats) {
            com.google.common.base.Preconditions.checkState(java.lang.Thread.currentThread() == this.getHighSpeedVideoSizesFor);
        }
        synchronized (this.getInputSizeshNQ4ISI) {
            this.getInputFormats = true;
        }
        java.util.Iterator<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.media3.common.util.ListenerSet.ListenerHolder.getHighResolutionOutputSizeshNQ4ISI(it.next(), this.getHighSpeedVideoFpsRanges);
        }
        this.getHighSpeedVideoSizes.clear();
    }

    public final void remove(T t) {
        if (this.getOutputFormats) {
            com.google.common.base.Preconditions.checkState(java.lang.Thread.currentThread() == this.getHighSpeedVideoSizesFor);
        }
        java.util.Iterator<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.media3.common.util.ListenerSet.ListenerHolder<T> next = it.next();
            if (next.getHighResolutionOutputSizeshNQ4ISI.equals(t)) {
                androidx.media3.common.util.ListenerSet.ListenerHolder.getHighResolutionOutputSizeshNQ4ISI(next, this.getHighSpeedVideoFpsRanges);
                this.getHighSpeedVideoSizes.remove(next);
            }
        }
    }

    public final int size() {
        if (this.getOutputFormats) {
            com.google.common.base.Preconditions.checkState(java.lang.Thread.currentThread() == this.getHighSpeedVideoSizesFor);
        }
        return this.getHighSpeedVideoSizes.size();
    }
}
