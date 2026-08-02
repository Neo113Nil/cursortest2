package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel", f = "CashInStoresListViewModel.kt", i = {0}, l = {115}, m = "mapRetailerToUiModel", n = {"retailer"}, nl = {116}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class CashInStoresListViewModel$mapRetailerToUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel.access$mapRetailerToUiModel(this.getHighSpeedVideoSizesFor, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInStoresListViewModel$mapRetailerToUiModel$1(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$mapRetailerToUiModel$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = cashInStoresListViewModel;
    }
}
