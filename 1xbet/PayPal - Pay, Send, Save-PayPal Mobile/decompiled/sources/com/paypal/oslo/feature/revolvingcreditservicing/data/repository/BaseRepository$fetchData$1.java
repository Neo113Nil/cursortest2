package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository", f = "BaseRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {102}, m = "fetchData", n = {"$this$fetchData", "query", "errorMapper", "dataMapper", "fetchPolicy", "additionalLogs", "queryName", "apolloCall", "observabilityWrapper"}, nl = {259}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"}, v = 2)
/* loaded from: classes14.dex */
final class BaseRepository$fetchData$1<E, R, D extends com.apollographql.apollo.api.Query.Data> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputSizes.fetchData(null, null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseRepository$fetchData$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository baseRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository$fetchData$1> continuation) {
        super(continuation);
        this.getOutputSizes = baseRepository;
    }
}
