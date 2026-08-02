package com.paypal.oslo.feature.identity.login.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl", f = "LoginRepositoryImpl.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {99, 125, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 179}, m = "login", n = {"loginRequest", "loginRequest", "rememberedUserEmail", "authInput", "mutation", "loginRequest", "rememberedUserEmail", "authInput", "mutation", "riskAdditionalData", "mutationCall", "finalMutationCall", "callConfig", "loginRequest", "rememberedUserEmail", "authInput", "mutation", "riskAdditionalData", "mutationCall", "finalMutationCall", "callConfig", "this_$iv", "response", "$i$f$fold", "$i$a$-fold-LoginRepositoryImpl$login$3", "loginRequest", "rememberedUserEmail", "authInput", "mutation", "riskAdditionalData", "mutationCall", "finalMutationCall", "callConfig", "this_$iv", "error", "response", "loginError", "$i$f$fold", "$i$a$-fold-LoginRepositoryImpl$login$4"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 171, 303, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class LoginRepositoryImpl$login$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    /* synthetic */ java.lang.Object isOutputSupportedForhNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl toString;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.isOutputSupportedForhNQ4ISI = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.toString.login(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoginRepositoryImpl$login$1(com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl loginRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl$login$1> continuation) {
        super(continuation);
        this.toString = loginRepositoryImpl;
    }
}
