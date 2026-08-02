package com.paypal.oslo.core.pushnotification.domain;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionEventBus;", "", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionEvent;", "event", "", "emit", "(Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "events"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface PushNotificationPermissionEventBus {
    java.lang.Object emit(com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionEvent pushNotificationPermissionEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionEvent> getEvents();
}
