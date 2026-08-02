package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt", f = "EmailRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {79}, m = "executeMutation", n = {"apolloClient", "mutation", "sourceId", "operationName", "dataExtractor", "raise$iv$iv$iv", "$this$executeMutation_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImplKt$executeMutation$2"}, nl = {82}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes15.dex */
final class EmailRepositoryImplKt$executeMutation$1<T extends com.apollographql.apollo.api.Mutation.Data, R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        highSpeedVideoSizes = com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt.getHighSpeedVideoSizes(null, null, null, null, null, this);
        return highSpeedVideoSizes;
    }

    EmailRepositoryImplKt$executeMutation$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt$executeMutation$1> continuation) {
        super(continuation);
    }
}
