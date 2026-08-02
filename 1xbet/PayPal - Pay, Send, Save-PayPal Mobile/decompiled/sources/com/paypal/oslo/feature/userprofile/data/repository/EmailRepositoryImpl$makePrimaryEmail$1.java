package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl", f = "EmailRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {186, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m = "makePrimaryEmail", n = {"emailId", "raise$iv$iv$iv", "$this$makePrimaryEmail_u24lambda_u240", "input", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$makePrimaryEmail$2", "emailId", "raise$iv$iv$iv", "$this$makePrimaryEmail_u24lambda_u240", "input", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$makePrimaryEmail$2"}, nl = {192, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class EmailRepositoryImpl$makePrimaryEmail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl getOutputMinFrameDurationlomOqCM;
    int getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.makePrimaryEmail(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailRepositoryImpl$makePrimaryEmail$1(com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl emailRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$makePrimaryEmail$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = emailRepositoryImpl;
    }
}
