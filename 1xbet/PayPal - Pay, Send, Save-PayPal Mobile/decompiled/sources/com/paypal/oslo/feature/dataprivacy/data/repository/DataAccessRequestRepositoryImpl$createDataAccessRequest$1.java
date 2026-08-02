package com.paypal.oslo.feature.dataprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl", f = "DataAccessRequestRepositoryImpl.kt", i = {0, 0}, l = {48}, m = "createDataAccessRequest", n = {"request", "partyId"}, nl = {114}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class DataAccessRequestRepositoryImpl$createDataAccessRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.createDataAccessRequest(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataAccessRequestRepositoryImpl$createDataAccessRequest$1(com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl dataAccessRequestRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$createDataAccessRequest$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = dataAccessRequestRepositoryImpl;
    }
}
