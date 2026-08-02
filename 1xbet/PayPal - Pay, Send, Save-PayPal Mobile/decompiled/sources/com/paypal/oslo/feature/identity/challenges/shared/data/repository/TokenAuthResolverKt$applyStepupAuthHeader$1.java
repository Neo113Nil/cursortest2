package com.paypal.oslo.feature.identity.challenges.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt", f = "TokenAuthResolver.kt", i = {0, 0, 0, 0}, l = {52}, m = "applyStepupAuthHeader", n = {"$this$applyStepupAuthHeader", "partialToken", "tokenStorage", "noTokenErrorMessage"}, nl = {53}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class TokenAuthResolverKt$applyStepupAuthHeader$1<T extends com.apollographql.apollo.api.Operation.Data> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt.applyStepupAuthHeader(null, null, null, null, this);
    }

    TokenAuthResolverKt$applyStepupAuthHeader$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt$applyStepupAuthHeader$1> continuation) {
        super(continuation);
    }
}
