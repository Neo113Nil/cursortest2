package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl", f = "EmailRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {167, 175}, m = "updateEmail", n = {"emailId", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "raise$iv$iv$iv", "$this$updateEmail_u24lambda_u240", "input", "mutation", "isPrimary", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$updateEmail$2", "emailId", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "raise$iv$iv$iv", "$this$updateEmail_u24lambda_u240", "input", "mutation", "email", "isPrimary", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$updateEmail$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 176}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class EmailRepositoryImpl$updateEmail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    int getOutputMinFrameDurationlomOqCM;
    boolean getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.updateEmail(null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailRepositoryImpl$updateEmail$1(com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl emailRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$updateEmail$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = emailRepositoryImpl;
    }
}
