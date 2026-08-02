package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl", f = "TaxReportsRepositoryImpl.kt", i = {0, 0}, l = {83}, m = "getTaxReportSections", n = {"fiscalYear", "countryCode"}, nl = {85}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class TaxReportsRepositoryImpl$getTaxReportSections$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getTaxReportSections(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxReportsRepositoryImpl$getTaxReportSections$1(com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl taxReportsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl$getTaxReportSections$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = taxReportsRepositoryImpl;
    }
}
