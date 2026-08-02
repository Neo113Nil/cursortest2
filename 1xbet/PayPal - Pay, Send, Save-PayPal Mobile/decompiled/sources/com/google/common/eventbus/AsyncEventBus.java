package com.google.common.eventbus;

/* loaded from: classes9.dex */
public class AsyncEventBus extends com.google.common.eventbus.EventBus {
    public AsyncEventBus(java.lang.String str, java.util.concurrent.Executor executor) {
        super(str, executor, com.google.common.eventbus.Dispatcher.legacyAsync(), com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE);
    }

    public AsyncEventBus(java.util.concurrent.Executor executor, com.google.common.eventbus.SubscriberExceptionHandler subscriberExceptionHandler) {
        super(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, executor, com.google.common.eventbus.Dispatcher.legacyAsync(), subscriberExceptionHandler);
    }

    public AsyncEventBus(java.util.concurrent.Executor executor) {
        super(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, executor, com.google.common.eventbus.Dispatcher.legacyAsync(), com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE);
    }
}
