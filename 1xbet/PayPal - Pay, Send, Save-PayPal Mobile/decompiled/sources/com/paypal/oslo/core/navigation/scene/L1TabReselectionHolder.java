package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/L1TabReselectionHolder;", "", "<init>", "()V", "", "notifyReselected$navigation_release", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L1TabReselectionHolder {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> events;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> Camera2StreamConfigurationMap;

    public L1TabReselectionHolder() {
        kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> MutableSharedFlow = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(0, 1, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST);
        this.Camera2StreamConfigurationMap = MutableSharedFlow;
        this.events = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow);
    }

    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getEvents() {
        return this.events;
    }

    public final void notifyReselected$navigation_release() {
        this.Camera2StreamConfigurationMap.tryEmit(kotlin.Unit.INSTANCE);
    }
}
