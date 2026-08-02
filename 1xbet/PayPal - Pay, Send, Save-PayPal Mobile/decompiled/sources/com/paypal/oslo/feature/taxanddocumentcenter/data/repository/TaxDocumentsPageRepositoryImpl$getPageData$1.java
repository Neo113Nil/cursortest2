package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl", f = "TaxDocumentsPageRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {75}, m = "getPageData", n = {"fiscalYear", "countryCode", "ipsParams", "taxReportsInput", "ipsArticlesInput", "apolloCall"}, nl = {77}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes15.dex */
final class TaxDocumentsPageRepositoryImpl$getPageData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.getPageData(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxDocumentsPageRepositoryImpl$getPageData$1(com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl taxDocumentsPageRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl$getPageData$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = taxDocumentsPageRepositoryImpl;
    }
}
