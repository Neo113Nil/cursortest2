package com.paypal.oslo.feature.oneonboarding.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository", f = "CosFlowStepRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {85, 118}, m = "getFlow", n = {"intentId", "collectedItems", "raise$iv$iv$iv", "$this$getFlow_u24lambda_u240", "input", "authType", androidx.core.app.NotificationCompat.CATEGORY_CALL, "isFlowStart", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CosFlowStepRepository$getFlow$2", "intentId", "collectedItems", "raise$iv$iv$iv", "$this$getFlow_u24lambda_u240", "input", "authType", androidx.core.app.NotificationCompat.CATEGORY_CALL, "onboardData", "parsedSteps", "contextualInfoList", "status", "statusDetails", "graphQLData", "tokenFragment", "isFlowStart", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CosFlowStepRepository$getFlow$2", "$i$a$-let-CosFlowStepRepository$getFlow$2$1"}, nl = {86, 119}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "Z$0", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes13.dex */
final class CosFlowStepRepository$getFlow$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository ArtificialStackFrames;
    int Camera2StreamConfigurationMap;
    int CoroutineDebuggingKt;
    /* synthetic */ java.lang.Object coroutineBoundary;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    boolean isOutputSupportedFor;
    java.lang.Object isOutputSupportedForhNQ4ISI;
    java.lang.Object toString;
    java.lang.Object unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.coroutineBoundary = obj;
        this.CoroutineDebuggingKt |= Integer.MIN_VALUE;
        return this.ArtificialStackFrames.getFlow(null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CosFlowStepRepository$getFlow$1(com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository cosFlowStepRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository$getFlow$1> continuation) {
        super(continuation);
        this.ArtificialStackFrames = cosFlowStepRepository;
    }
}
