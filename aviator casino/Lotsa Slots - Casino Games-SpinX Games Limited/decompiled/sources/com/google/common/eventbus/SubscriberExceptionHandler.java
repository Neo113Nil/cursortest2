package com.google.common.eventbus;

@com.google.common.eventbus.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface SubscriberExceptionHandler {
    void handleException(java.lang.Throwable exception, com.google.common.eventbus.SubscriberExceptionContext context);
}
