package com.google.common.eventbus;

import com.google.common.eventbus.EventBus;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(String identifier, Executor executor) {
        super(identifier, executor, Dispatcher.legacyAsync(), EventBus.LoggingHandler.INSTANCE);
    }

    public AsyncEventBus(Executor executor, SubscriberExceptionHandler subscriberExceptionHandler) {
        super(BuildConfig.FLAVOR, executor, Dispatcher.legacyAsync(), subscriberExceptionHandler);
    }

    public AsyncEventBus(Executor executor) {
        super(BuildConfig.FLAVOR, executor, Dispatcher.legacyAsync(), EventBus.LoggingHandler.INSTANCE);
    }
}
