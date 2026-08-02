package com.paypal.oslo.feature.revolvingcreditservicing.event;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEvent;", "event", "", "emit", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DataInvalidationEventBus {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent> events;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DataInvalidationEventBus() {
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent> MutableSharedFlow = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(1, 10, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST);
        this.getHighSpeedVideoFpsRanges = MutableSharedFlow;
        this.events = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow);
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent> getEvents() {
        return this.events;
    }

    public final java.lang.Object emit(com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent dataInvalidationEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object emit = this.getHighSpeedVideoFpsRanges.emit(dataInvalidationEvent, continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }

    public final void resetEvents() {
        this.getHighSpeedVideoFpsRanges.resetReplayCache();
    }
}
