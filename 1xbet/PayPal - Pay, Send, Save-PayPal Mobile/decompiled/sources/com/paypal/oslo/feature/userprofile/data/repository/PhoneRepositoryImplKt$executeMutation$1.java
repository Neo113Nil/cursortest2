package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImplKt", f = "PhoneRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {77}, m = "executeMutation", n = {"apolloClient", "mutation", "sourceId", "operationName", "dataExtractor", "raise$iv$iv$iv", "$this$executeMutation_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneRepositoryImplKt$executeMutation$2"}, nl = {80}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes15.dex */
final class PhoneRepositoryImplKt$executeMutation$1<T extends com.apollographql.apollo.api.Mutation.Data, R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImplKt.getHighSpeedVideoFpsRangesFor(null, null, null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    PhoneRepositoryImplKt$executeMutation$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImplKt$executeMutation$1> continuation) {
        super(continuation);
    }
}
