package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl", f = "EmailRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {282}, m = "reinitiateEmailConfirmation", n = {"emailId", "authId", "challengeId", "raise$iv$iv$iv", "$this$reinitiateEmailConfirmation_u24lambda_u240", "input", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$reinitiateEmailConfirmation$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class EmailRepositoryImpl$reinitiateEmailConfirmation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.reinitiateEmailConfirmation(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailRepositoryImpl$reinitiateEmailConfirmation$1(com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl emailRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reinitiateEmailConfirmation$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = emailRepositoryImpl;
    }
}
