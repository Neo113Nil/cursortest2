package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel", f = "CashInStoresListViewModel.kt", i = {0, 0}, l = {128}, m = "formatFee", n = {"fee", "config"}, nl = {167}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class CashInStoresListViewModel$formatFee$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInStoresListViewModel$formatFee$1(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$formatFee$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = cashInStoresListViewModel;
    }
}
