package com.google.common.eventbus;

/* loaded from: classes9.dex */
abstract class Dispatcher {
    abstract void dispatch(java.lang.Object obj, java.util.Iterator<com.google.common.eventbus.Subscriber> it);

    Dispatcher() {
    }

    static com.google.common.eventbus.Dispatcher perThreadDispatchQueue() {
        return new com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher();
    }

    static com.google.common.eventbus.Dispatcher legacyAsync() {
        return new com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher();
    }

    static com.google.common.eventbus.Dispatcher immediate() {
        return com.google.common.eventbus.Dispatcher.ImmediateDispatcher.INSTANCE;
    }

    static final class PerThreadQueuedDispatcher extends com.google.common.eventbus.Dispatcher {
        private final java.lang.ThreadLocal<java.lang.Boolean> dispatching;
        private final java.lang.ThreadLocal<java.util.Queue<com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event>> queue;

        private PerThreadQueuedDispatcher() {
            this.queue = new java.lang.ThreadLocal<java.util.Queue<com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event>>() { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // java.lang.ThreadLocal
                public java.util.Queue<com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event> initialValue() {
                    return new java.util.ArrayDeque();
                }
            };
            this.dispatching = new java.lang.ThreadLocal<java.lang.Boolean>() { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.2
                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.lang.ThreadLocal
                public java.lang.Boolean initialValue() {
                    return java.lang.Boolean.FALSE;
                }
            };
        }

        @Override // com.google.common.eventbus.Dispatcher
        final void dispatch(java.lang.Object obj, java.util.Iterator<com.google.common.eventbus.Subscriber> it) {
            com.google.common.base.Preconditions.checkNotNull(obj);
            com.google.common.base.Preconditions.checkNotNull(it);
            java.util.Queue queue = (java.util.Queue) java.util.Objects.requireNonNull(this.queue.get());
            queue.offer(new com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event(obj, it));
            if (this.dispatching.get().booleanValue()) {
                return;
            }
            this.dispatching.set(java.lang.Boolean.TRUE);
            while (true) {
                try {
                    com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event event = (com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event) queue.poll();
                    if (event == null) {
                        return;
                    }
                    while (event.subscribers.hasNext()) {
                        ((com.google.common.eventbus.Subscriber) event.subscribers.next()).dispatchEvent(event.event);
                    }
                } finally {
                    this.dispatching.remove();
                    this.queue.remove();
                }
            }
        }

        static final class Event {
            private final java.lang.Object event;
            private final java.util.Iterator<com.google.common.eventbus.Subscriber> subscribers;

            private Event(java.lang.Object obj, java.util.Iterator<com.google.common.eventbus.Subscriber> it) {
                this.event = obj;
                this.subscribers = it;
            }
        }
    }

    static final class LegacyAsyncDispatcher extends com.google.common.eventbus.Dispatcher {
        private final java.util.concurrent.ConcurrentLinkedQueue<com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber> queue;

        private LegacyAsyncDispatcher() {
            this.queue = new java.util.concurrent.ConcurrentLinkedQueue<>();
        }

        @Override // com.google.common.eventbus.Dispatcher
        final void dispatch(java.lang.Object obj, java.util.Iterator<com.google.common.eventbus.Subscriber> it) {
            com.google.common.base.Preconditions.checkNotNull(obj);
            while (it.hasNext()) {
                this.queue.add(new com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber(obj, it.next()));
            }
            while (true) {
                com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber poll = this.queue.poll();
                if (poll == null) {
                    return;
                } else {
                    poll.subscriber.dispatchEvent(poll.event);
                }
            }
        }

        static final class EventWithSubscriber {
            private final java.lang.Object event;
            private final com.google.common.eventbus.Subscriber subscriber;

            private EventWithSubscriber(java.lang.Object obj, com.google.common.eventbus.Subscriber subscriber) {
                this.event = obj;
                this.subscriber = subscriber;
            }
        }
    }

    static final class ImmediateDispatcher extends com.google.common.eventbus.Dispatcher {
        private static final com.google.common.eventbus.Dispatcher.ImmediateDispatcher INSTANCE = new com.google.common.eventbus.Dispatcher.ImmediateDispatcher();

        private ImmediateDispatcher() {
        }

        @Override // com.google.common.eventbus.Dispatcher
        final void dispatch(java.lang.Object obj, java.util.Iterator<com.google.common.eventbus.Subscriber> it) {
            com.google.common.base.Preconditions.checkNotNull(obj);
            while (it.hasNext()) {
                it.next().dispatchEvent(obj);
            }
        }
    }
}
