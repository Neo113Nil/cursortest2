package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel", f = "EmailViewModel.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 238, 225, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m = "performEmailCheck-E4ilnuY", n = {"email", "email", "this_$iv", "checkResult", "$i$f$fold", "$i$a$-fold-EmailViewModel$performEmailCheck$4", "email", "this_$iv", "$i$f$fold", "$i$a$-fold-EmailViewModel$performEmailCheck$3", "email", "this_$iv", "$i$f$fold", "$i$a$-fold-EmailViewModel$performEmailCheck$3"}, nl = {381, 239, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class EmailViewModel$performEmailCheck$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel.m16367access$performEmailCheckE4ilnuY(this.getOutputMinFrameDuration, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailViewModel$performEmailCheck$1(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$performEmailCheck$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = emailViewModel;
    }
}
