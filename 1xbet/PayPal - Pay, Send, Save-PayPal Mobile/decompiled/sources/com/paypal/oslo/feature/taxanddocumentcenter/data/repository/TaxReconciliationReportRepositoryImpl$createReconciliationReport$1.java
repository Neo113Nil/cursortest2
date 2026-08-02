package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl", f = "TaxReconciliationReportRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {58}, m = "createReconciliationReport", n = {"fiscalYear", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$createReconciliationReport_u24lambda_u241", "input", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-TaxReconciliationReportRepositoryImpl$createReconciliationReport$3"}, nl = {59}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes15.dex */
final class TaxReconciliationReportRepositoryImpl$createReconciliationReport$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl isOutputSupportedFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.isOutputSupportedFor.createReconciliationReport(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxReconciliationReportRepositoryImpl$createReconciliationReport$1(com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl taxReconciliationReportRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl$createReconciliationReport$1> continuation) {
        super(continuation);
        this.isOutputSupportedFor = taxReconciliationReportRepositoryImpl;
    }
}
