package com.paypal.oslo.feature.cardconnect.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cardconnect.shared.data.repository.BaseRepository", f = "BaseRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {119}, m = "executeMutation", n = {"$this$executeMutation", "mutation", "mapper", "networkMapper", "headers", "fetchPolicy", "callConfig", "errorMapper", "apolloCall", "includeClientMetadataIdHeader"}, nl = {140}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0"}, v = 2)
/* loaded from: classes11.dex */
final class BaseRepository$executeMutation$1<R, D extends com.apollographql.apollo.api.Mutation.Data> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.data.repository.BaseRepository getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.executeMutation(null, null, null, null, null, null, false, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseRepository$executeMutation$1(com.paypal.oslo.feature.cardconnect.shared.data.repository.BaseRepository baseRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.shared.data.repository.BaseRepository$executeMutation$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = baseRepository;
    }
}
