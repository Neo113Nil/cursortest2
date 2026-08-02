package com.paypal.oslo.feature.activity.domain.common.provider;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider", f = "ActivityUserInfoProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {33}, m = "fetchUserProfile$activity_prodRelease", n = {"userStore", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$fetchUserProfile_u24lambda_u241", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-ActivityUserInfoProvider$fetchUserProfile$3"}, nl = {32}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityUserInfoProvider$fetchUserProfile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
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
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.fetchUserProfile$activity_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityUserInfoProvider$fetchUserProfile$1(com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider activityUserInfoProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider$fetchUserProfile$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = activityUserInfoProvider;
    }
}
