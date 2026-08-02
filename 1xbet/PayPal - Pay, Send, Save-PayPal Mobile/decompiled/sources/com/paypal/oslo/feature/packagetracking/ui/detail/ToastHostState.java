package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/ToastHostState;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "message", "", "showToast", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/channels/Channel;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/Flow;", "messages", "Lkotlinx/coroutines/flow/Flow;", "getMessages$package_tracking_prodRelease", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ToastHostState {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.packagetracking.domain.UiString> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.packagetracking.domain.UiString> messages;

    public ToastHostState() {
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.packagetracking.domain.UiString> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.Camera2StreamConfigurationMap = Channel$default;
        this.messages = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.packagetracking.domain.UiString> getMessages$package_tracking_prodRelease() {
        return this.messages;
    }

    public final java.lang.Object showToast(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object send = this.Camera2StreamConfigurationMap.send(uiString, continuation);
        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
    }
}
