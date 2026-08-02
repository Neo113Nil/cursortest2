package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel", f = "AutoReloadViewModel.kt", i = {0, 0}, l = {151}, m = "onFetchSuccess", n = {"input", "config"}, nl = {148}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class AutoReloadViewModel$onFetchSuccess$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.access$onFetchSuccess(this.getInputSizeshNQ4ISI, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadViewModel$onFetchSuccess$1(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel autoReloadViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$onFetchSuccess$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = autoReloadViewModel;
    }
}
