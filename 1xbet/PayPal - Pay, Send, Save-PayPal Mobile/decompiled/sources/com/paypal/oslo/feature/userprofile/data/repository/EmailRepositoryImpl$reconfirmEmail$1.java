package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl", f = "EmailRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m = "reconfirmEmail", n = {"emailId", "raise$iv$iv$iv", "$this$reconfirmEmail_u24lambda_u240", "input", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$reconfirmEmail$2", "emailId", "raise$iv$iv$iv", "$this$reconfirmEmail_u24lambda_u240", "input", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$reconfirmEmail$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 231}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class EmailRepositoryImpl$reconfirmEmail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.reconfirmEmail(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailRepositoryImpl$reconfirmEmail$1(com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl emailRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reconfirmEmail$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = emailRepositoryImpl;
    }
}
