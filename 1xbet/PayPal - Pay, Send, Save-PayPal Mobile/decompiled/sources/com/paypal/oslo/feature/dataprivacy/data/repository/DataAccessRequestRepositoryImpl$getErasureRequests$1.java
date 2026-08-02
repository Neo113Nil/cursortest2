package com.paypal.oslo.feature.dataprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl", f = "DataAccessRequestRepositoryImpl.kt", i = {0}, l = {69}, m = "getErasureRequests", n = {"partyId"}, nl = {114}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class DataAccessRequestRepositoryImpl$getErasureRequests$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getErasureRequests(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataAccessRequestRepositoryImpl$getErasureRequests$1(com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl dataAccessRequestRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$getErasureRequests$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = dataAccessRequestRepositoryImpl;
    }
}
