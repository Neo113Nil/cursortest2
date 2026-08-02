package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl", f = "ManageAccountRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {53}, m = "updateCreditInstrumentStatus", n = {"creditProductIdentifier", "creditAccountId", "creditInstrumentId", "status", "mutation"}, nl = {58}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes14.dex */
final class ManageAccountRepositoryImpl$updateCreditInstrumentStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputFormats.updateCreditInstrumentStatus(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageAccountRepositoryImpl$updateCreditInstrumentStatus$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl manageAccountRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateCreditInstrumentStatus$1> continuation) {
        super(continuation);
        this.getOutputFormats = manageAccountRepositoryImpl;
    }
}
