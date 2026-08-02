package com.paypal.oslo.feature.checkcapture.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository", f = "GraphQLCheckCaptureRepository.kt", i = {0, 0, 0, 0, 0, 0}, l = {90}, m = "handleGraphQLOperation", n = {com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "execute", "errorFactory", "nullDataErrorMessage", "partialSuccessNullDataErrorMessage", "mapSuccess"}, nl = {151}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes5.dex */
final class GraphQLCheckCaptureRepository$handleGraphQLOperation$1<D, R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputMinFrameDuration.getHighSpeedVideoSizes(null, null, null, null, null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLCheckCaptureRepository$handleGraphQLOperation$1(com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository graphQLCheckCaptureRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository$handleGraphQLOperation$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = graphQLCheckCaptureRepository;
    }
}
