package com.paypal.oslo.core.network.graphql.interceptor;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor", f = "StepupChallengeInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 200, 197, 204}, m = "handleStepupChallenge", n = {"request", "originalResponse", "stepupError", "chain", "emit", "input", "responseWithContext", "request", "originalResponse", "stepupError", "chain", "emit", "input", "request", "originalResponse", "stepupError", "chain", "emit", "input", "this_$iv", "it", "$i$f$fold", "$i$a$-fold-StepupChallengeInterceptor$handleStepupChallenge$3", "request", "originalResponse", "stepupError", "chain", "emit", "input", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-StepupChallengeInterceptor$handleStepupChallenge$2", "request", "originalResponse", "stepupError", "chain", "emit", "input", "e"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 383, 201, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 206}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
/* loaded from: classes4.dex */
final class StepupChallengeInterceptor$handleStepupChallenge$1<D extends com.apollographql.apollo.api.Operation.Data> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor getOutputSizeshNQ4ISI;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getOutputSizes = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(null, null, null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupChallengeInterceptor$handleStepupChallenge$1(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor stepupChallengeInterceptor, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$handleStepupChallenge$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = stepupChallengeInterceptor;
    }
}
