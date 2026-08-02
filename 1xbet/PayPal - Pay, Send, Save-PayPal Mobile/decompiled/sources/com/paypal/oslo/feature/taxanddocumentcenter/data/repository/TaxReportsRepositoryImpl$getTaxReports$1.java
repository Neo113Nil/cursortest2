package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl", f = "TaxReportsRepositoryImpl.kt", i = {0, 0, 0}, l = {53}, m = "getTaxReports", n = {"fiscalYear", "input", "apolloCall"}, nl = {54}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class TaxReportsRepositoryImpl$getTaxReports$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.getTaxReports(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxReportsRepositoryImpl$getTaxReports$1(com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl taxReportsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl$getTaxReports$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = taxReportsRepositoryImpl;
    }
}
