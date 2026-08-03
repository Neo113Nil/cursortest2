package com.google.common.eventbus;

@com.google.common.eventbus.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public class AsyncEventBus extends com.google.common.eventbus.EventBus {
    public AsyncEventBus(java.lang.String identifier, java.util.concurrent.Executor executor) {
        super(identifier, executor, com.google.common.eventbus.Dispatcher.legacyAsync(), com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE);
    }

    public AsyncEventBus(java.util.concurrent.Executor executor, com.google.common.eventbus.SubscriberExceptionHandler subscriberExceptionHandler) {
        super(com.unity3d.ads.BuildConfig.FLAVOR, executor, com.google.common.eventbus.Dispatcher.legacyAsync(), subscriberExceptionHandler);
    }

    public AsyncEventBus(java.util.concurrent.Executor executor) {
        super(com.unity3d.ads.BuildConfig.FLAVOR, executor, com.google.common.eventbus.Dispatcher.legacyAsync(), com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE);
    }
}
