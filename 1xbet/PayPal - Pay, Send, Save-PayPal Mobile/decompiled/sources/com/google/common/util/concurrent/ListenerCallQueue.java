package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
final class ListenerCallQueue<L> {
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.ListenerCallQueue.class);
    private final java.util.List<com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue<L>> listeners = java.util.Collections.synchronizedList(new java.util.ArrayList());

    interface Event<L> {
        void call(L l);
    }

    ListenerCallQueue() {
    }

    public final void addListener(L l, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(l, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.google.common.base.Preconditions.checkNotNull(executor, "executor");
        this.listeners.add(new com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue<>(l, executor));
    }

    public final void enqueue(com.google.common.util.concurrent.ListenerCallQueue.Event<L> event) {
        enqueueHelper(event, event);
    }

    public final void enqueue(com.google.common.util.concurrent.ListenerCallQueue.Event<L> event, java.lang.String str) {
        enqueueHelper(event, str);
    }

    private void enqueueHelper(com.google.common.util.concurrent.ListenerCallQueue.Event<L> event, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(event, "event");
        com.google.common.base.Preconditions.checkNotNull(obj, "label");
        synchronized (this.listeners) {
            java.util.Iterator<com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue<L>> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().add(event, obj);
            }
        }
    }

    public final void dispatch() {
        for (int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).dispatch();
        }
    }

    static final class PerListenerQueue<L> implements java.lang.Runnable {
        final java.util.concurrent.Executor executor;
        boolean isThreadScheduled;
        final L listener;
        final java.util.Queue<com.google.common.util.concurrent.ListenerCallQueue.Event<L>> waitQueue = new java.util.ArrayDeque();
        final java.util.Queue<java.lang.Object> labelQueue = new java.util.ArrayDeque();

        PerListenerQueue(L l, java.util.concurrent.Executor executor) {
            this.listener = (L) com.google.common.base.Preconditions.checkNotNull(l);
            this.executor = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull(executor);
        }

        final void add(com.google.common.util.concurrent.ListenerCallQueue.Event<L> event, java.lang.Object obj) {
            synchronized (this) {
                this.waitQueue.add(event);
                this.labelQueue.add(obj);
            }
        }

        final void dispatch() {
            boolean z;
            synchronized (this) {
                if (this.isThreadScheduled) {
                    z = false;
                } else {
                    z = true;
                    this.isThreadScheduled = true;
                }
            }
            if (z) {
                try {
                    this.executor.execute(this);
                } catch (java.lang.Exception e) {
                    synchronized (this) {
                        this.isThreadScheduled = false;
                        java.util.logging.Logger logger = com.google.common.util.concurrent.ListenerCallQueue.logger.get();
                        java.util.logging.Level level = java.util.logging.Level.SEVERE;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception while running callbacks for ");
                        sb.append(this.listener);
                        sb.append(" on ");
                        sb.append(this.executor);
                        logger.log(level, sb.toString(), (java.lang.Throwable) e);
                        throw e;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            com.google.common.util.concurrent.ListenerCallQueue.Event<L> poll;
            java.lang.Object poll2;
            while (true) {
                try {
                } catch (java.lang.Throwable th) {
                    synchronized (this) {
                    }
                }
                synchronized (this) {
                    com.google.common.base.Preconditions.checkState(this.isThreadScheduled);
                    poll = this.waitQueue.poll();
                    poll2 = this.labelQueue.poll();
                    if (poll == null) {
                        this.isThreadScheduled = false;
                        return;
                    }
                    synchronized (this) {
                        this.isThreadScheduled = false;
                        throw th;
                    }
                }
                try {
                    poll.call(this.listener);
                } catch (java.lang.Exception e) {
                    java.util.logging.Logger logger = com.google.common.util.concurrent.ListenerCallQueue.logger.get();
                    java.util.logging.Level level = java.util.logging.Level.SEVERE;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Exception while executing callback: ");
                    sb.append(this.listener);
                    sb.append(" ");
                    sb.append(poll2);
                    logger.log(level, sb.toString(), (java.lang.Throwable) e);
                }
            }
        }
    }
}
