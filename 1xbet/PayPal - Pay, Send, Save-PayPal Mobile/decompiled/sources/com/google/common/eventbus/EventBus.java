package com.google.common.eventbus;

/* loaded from: classes9.dex */
public class EventBus {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.eventbus.EventBus.class.getName());
    private final com.google.common.eventbus.Dispatcher dispatcher;
    private final com.google.common.eventbus.SubscriberExceptionHandler exceptionHandler;
    private final java.util.concurrent.Executor executor;
    private final java.lang.String identifier;
    private final com.google.common.eventbus.SubscriberRegistry subscribers;

    public EventBus() {
        this(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);
    }

    public EventBus(java.lang.String str) {
        this(str, com.google.common.util.concurrent.MoreExecutors.directExecutor(), com.google.common.eventbus.Dispatcher.perThreadDispatchQueue(), com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE);
    }

    public EventBus(com.google.common.eventbus.SubscriberExceptionHandler subscriberExceptionHandler) {
        this(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, com.google.common.util.concurrent.MoreExecutors.directExecutor(), com.google.common.eventbus.Dispatcher.perThreadDispatchQueue(), subscriberExceptionHandler);
    }

    EventBus(java.lang.String str, java.util.concurrent.Executor executor, com.google.common.eventbus.Dispatcher dispatcher, com.google.common.eventbus.SubscriberExceptionHandler subscriberExceptionHandler) {
        this.subscribers = new com.google.common.eventbus.SubscriberRegistry(this);
        this.identifier = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
        this.executor = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull(executor);
        this.dispatcher = (com.google.common.eventbus.Dispatcher) com.google.common.base.Preconditions.checkNotNull(dispatcher);
        this.exceptionHandler = (com.google.common.eventbus.SubscriberExceptionHandler) com.google.common.base.Preconditions.checkNotNull(subscriberExceptionHandler);
    }

    public final java.lang.String identifier() {
        return this.identifier;
    }

    final java.util.concurrent.Executor executor() {
        return this.executor;
    }

    void handleSubscriberException(java.lang.Throwable th, com.google.common.eventbus.SubscriberExceptionContext subscriberExceptionContext) {
        com.google.common.base.Preconditions.checkNotNull(th);
        com.google.common.base.Preconditions.checkNotNull(subscriberExceptionContext);
        try {
            this.exceptionHandler.handleException(th, subscriberExceptionContext);
        } catch (java.lang.Throwable th2) {
            logger.log(java.util.logging.Level.SEVERE, java.lang.String.format(java.util.Locale.ROOT, "Exception %s thrown while handling exception: %s", th2, th), th2);
        }
    }

    public void register(java.lang.Object obj) {
        this.subscribers.register(obj);
    }

    public void unregister(java.lang.Object obj) {
        this.subscribers.unregister(obj);
    }

    public void post(java.lang.Object obj) {
        java.util.Iterator<com.google.common.eventbus.Subscriber> subscribers = this.subscribers.getSubscribers(obj);
        if (subscribers.hasNext()) {
            this.dispatcher.dispatch(obj, subscribers);
        } else {
            if (obj instanceof com.google.common.eventbus.DeadEvent) {
                return;
            }
            post(new com.google.common.eventbus.DeadEvent(this, obj));
        }
    }

    public java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).addValue(this.identifier).toString();
    }

    static final class LoggingHandler implements com.google.common.eventbus.SubscriberExceptionHandler {
        static final com.google.common.eventbus.EventBus.LoggingHandler INSTANCE = new com.google.common.eventbus.EventBus.LoggingHandler();

        LoggingHandler() {
        }

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public final void handleException(java.lang.Throwable th, com.google.common.eventbus.SubscriberExceptionContext subscriberExceptionContext) {
            java.util.logging.Logger logger = logger(subscriberExceptionContext);
            if (logger.isLoggable(java.util.logging.Level.SEVERE)) {
                logger.log(java.util.logging.Level.SEVERE, message(subscriberExceptionContext), th);
            }
        }

        private static java.util.logging.Logger logger(com.google.common.eventbus.SubscriberExceptionContext subscriberExceptionContext) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.google.common.eventbus.EventBus.class.getName());
            sb.append(".");
            sb.append(subscriberExceptionContext.getEventBus().identifier());
            return java.util.logging.Logger.getLogger(sb.toString());
        }

        private static java.lang.String message(com.google.common.eventbus.SubscriberExceptionContext subscriberExceptionContext) {
            java.lang.reflect.Method subscriberMethod = subscriberExceptionContext.getSubscriberMethod();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception thrown by subscriber method ");
            sb.append(subscriberMethod.getName());
            sb.append('(');
            sb.append(subscriberMethod.getParameterTypes()[0].getName());
            sb.append(") on subscriber ");
            sb.append(subscriberExceptionContext.getSubscriber());
            sb.append(" when dispatching event: ");
            sb.append(subscriberExceptionContext.getEvent());
            return sb.toString();
        }
    }
}
