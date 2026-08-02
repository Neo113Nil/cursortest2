package com.paypal.oslo.feature.dataprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl", f = "DataAccessRequestRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {87}, m = "createErasureRequest", n = {"request", "state", "partyId", "emailFromRequest", "emailFromUser", "email", "it", "$i$a$-let-DataAccessRequestRepositoryImpl$createErasureRequest$2"}, nl = {88}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class DataAccessRequestRepositoryImpl$createErasureRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.createErasureRequest(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataAccessRequestRepositoryImpl$createErasureRequest$1(com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl dataAccessRequestRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$createErasureRequest$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = dataAccessRequestRepositoryImpl;
    }
}
