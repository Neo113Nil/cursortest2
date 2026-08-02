package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel", f = "DataAccessSelectSourcesViewModel.kt", i = {}, l = {65}, m = "loadAvailableSources", n = {}, nl = {68}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DataAccessSelectSourcesViewModel$loadAvailableSources$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.access$loadAvailableSources(this.getHighSpeedVideoFpsRangesFor, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataAccessSelectSourcesViewModel$loadAvailableSources$1(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$loadAvailableSources$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = dataAccessSelectSourcesViewModel;
    }
}
