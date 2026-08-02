package com.google.common.eventbus;

/* loaded from: classes9.dex */
public class SubscriberExceptionContext {
    private final java.lang.Object event;
    private final com.google.common.eventbus.EventBus eventBus;
    private final java.lang.Object subscriber;
    private final java.lang.reflect.Method subscriberMethod;

    SubscriberExceptionContext(com.google.common.eventbus.EventBus eventBus, java.lang.Object obj, java.lang.Object obj2, java.lang.reflect.Method method) {
        this.eventBus = (com.google.common.eventbus.EventBus) com.google.common.base.Preconditions.checkNotNull(eventBus);
        this.event = com.google.common.base.Preconditions.checkNotNull(obj);
        this.subscriber = com.google.common.base.Preconditions.checkNotNull(obj2);
        this.subscriberMethod = (java.lang.reflect.Method) com.google.common.base.Preconditions.checkNotNull(method);
    }

    public com.google.common.eventbus.EventBus getEventBus() {
        return this.eventBus;
    }

    public java.lang.Object getEvent() {
        return this.event;
    }

    public java.lang.Object getSubscriber() {
        return this.subscriber;
    }

    public java.lang.reflect.Method getSubscriberMethod() {
        return this.subscriberMethod;
    }
}
