package com.google.common.eventbus;

/* loaded from: classes9.dex */
class Subscriber {
    private final com.google.common.eventbus.EventBus bus;
    private final java.util.concurrent.Executor executor;
    private final java.lang.reflect.Method method;
    final java.lang.Object target;

    static com.google.common.eventbus.Subscriber create(com.google.common.eventbus.EventBus eventBus, java.lang.Object obj, java.lang.reflect.Method method) {
        if (isDeclaredThreadSafe(method)) {
            return new com.google.common.eventbus.Subscriber(eventBus, obj, method);
        }
        return new com.google.common.eventbus.Subscriber.SynchronizedSubscriber(eventBus, obj, method);
    }

    private Subscriber(com.google.common.eventbus.EventBus eventBus, java.lang.Object obj, java.lang.reflect.Method method) {
        this.bus = eventBus;
        this.target = com.google.common.base.Preconditions.checkNotNull(obj);
        this.method = method;
        method.setAccessible(true);
        this.executor = eventBus.executor();
    }

    final void dispatchEvent(final java.lang.Object obj) {
        this.executor.execute(new java.lang.Runnable() { // from class: com.google.common.eventbus.Subscriber$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.eventbus.Subscriber.this.m10325lambda$dispatchEvent$0$comgooglecommoneventbusSubscriber(obj);
            }
        });
    }

    /* renamed from: lambda$dispatchEvent$0$com-google-common-eventbus-Subscriber, reason: not valid java name */
    /* synthetic */ void m10325lambda$dispatchEvent$0$comgooglecommoneventbusSubscriber(java.lang.Object obj) {
        try {
            invokeSubscriberMethod(obj);
        } catch (java.lang.reflect.InvocationTargetException e) {
            this.bus.handleSubscriberException(e.getCause(), context(obj));
        }
    }

    void invokeSubscriberMethod(java.lang.Object obj) throws java.lang.reflect.InvocationTargetException {
        try {
            this.method.invoke(this.target, com.google.common.base.Preconditions.checkNotNull(obj));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.Error("Method became inaccessible: ".concat(java.lang.String.valueOf(obj)), e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new java.lang.Error("Method rejected target/argument: ".concat(java.lang.String.valueOf(obj)), e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            if (e3.getCause() instanceof java.lang.Error) {
                throw ((java.lang.Error) e3.getCause());
            }
            throw e3;
        }
    }

    private com.google.common.eventbus.SubscriberExceptionContext context(java.lang.Object obj) {
        return new com.google.common.eventbus.SubscriberExceptionContext(this.bus, obj, this.target, this.method);
    }

    public final int hashCode() {
        return ((this.method.hashCode() + 31) * 31) + java.lang.System.identityHashCode(this.target);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.common.eventbus.Subscriber)) {
            return false;
        }
        com.google.common.eventbus.Subscriber subscriber = (com.google.common.eventbus.Subscriber) obj;
        return this.target == subscriber.target && this.method.equals(subscriber.method);
    }

    private static boolean isDeclaredThreadSafe(java.lang.reflect.Method method) {
        return method.getAnnotation(com.google.common.eventbus.AllowConcurrentEvents.class) != null;
    }

    static final class SynchronizedSubscriber extends com.google.common.eventbus.Subscriber {
        private SynchronizedSubscriber(com.google.common.eventbus.EventBus eventBus, java.lang.Object obj, java.lang.reflect.Method method) {
            super(eventBus, obj, method);
        }

        @Override // com.google.common.eventbus.Subscriber
        final void invokeSubscriberMethod(java.lang.Object obj) throws java.lang.reflect.InvocationTargetException {
            synchronized (this) {
                super.invokeSubscriberMethod(obj);
            }
        }
    }
}
