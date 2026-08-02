package com.paypal.oslo.feature.dataprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl", f = "DataAccessRequestRepositoryImpl.kt", i = {0}, l = {56}, m = "getExistingRequests", n = {"partyId"}, nl = {114}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class DataAccessRequestRepositoryImpl$getExistingRequests$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getExistingRequests(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataAccessRequestRepositoryImpl$getExistingRequests$1(com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl dataAccessRequestRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$getExistingRequests$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = dataAccessRequestRepositoryImpl;
    }
}
