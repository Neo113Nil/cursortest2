package com.paypal.oslo.core.pushnotification.data;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/data/PushNotificationPermissionEventBusImpl;", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionEventBus;", "<init>", "()V", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionEvent;", "event", "", "emit", "(Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PushNotificationPermissionEventBusImpl implements com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionEventBus {
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionEvent> events;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionEvent> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PushNotificationPermissionEventBusImpl() {
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionEvent> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 4, null);
        this.getHighSpeedVideoFpsRangesFor = MutableSharedFlow$default;
        this.events = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionEventBus
    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionEvent> getEvents() {
        return this.events;
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionEventBus
    public final java.lang.Object emit(com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionEvent pushNotificationPermissionEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object emit = this.getHighSpeedVideoFpsRangesFor.emit(pushNotificationPermissionEvent, continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }
}
