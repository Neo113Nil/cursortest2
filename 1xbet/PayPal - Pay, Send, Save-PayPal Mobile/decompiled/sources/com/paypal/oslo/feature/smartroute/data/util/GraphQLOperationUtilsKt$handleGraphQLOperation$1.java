package com.paypal.oslo.feature.smartroute.data.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt", f = "GraphQLOperationUtils.kt", i = {0, 0, 0, 0, 0, 0}, l = {103}, m = "handleGraphQLOperation", n = {com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "execute", "errorFactory", "nullDataErrorMessage", "partialSuccessNullDataErrorMessage", "mapSuccess"}, nl = {174}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes15.dex */
final class GraphQLOperationUtilsKt$handleGraphQLOperation$1<D, R, E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt.handleGraphQLOperation(null, null, null, null, null, null, this);
    }

    GraphQLOperationUtilsKt$handleGraphQLOperation$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt$handleGraphQLOperation$1> continuation) {
        super(continuation);
    }
}
