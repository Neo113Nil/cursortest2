package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel", f = "TaxDocumentsViewModel.kt", i = {0, 0}, l = {377}, m = "loadReportsOnly", n = {"fiscalYear", "countryCode"}, nl = {382}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class TaxDocumentsViewModel$loadReportsOnly$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.access$loadReportsOnly(this.getHighSpeedVideoSizes, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxDocumentsViewModel$loadReportsOnly$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadReportsOnly$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = taxDocumentsViewModel;
    }
}
