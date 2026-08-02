package com.paypal.oslo.feature.savings.domain.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator", f = "GoalsFieldValidator.kt", i = {0, 0}, l = {114}, m = "isDuplicateGoalName", n = {"goalName", "excludeGoalId"}, nl = {118}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class GoalsFieldValidator$isDuplicateGoalName$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.isDuplicateGoalName(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoalsFieldValidator$isDuplicateGoalName$1(com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator$isDuplicateGoalName$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = goalsFieldValidator;
    }
}
