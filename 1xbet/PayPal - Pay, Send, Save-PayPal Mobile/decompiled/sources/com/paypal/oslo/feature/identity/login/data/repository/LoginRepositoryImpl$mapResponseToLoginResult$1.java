package com.paypal.oslo.feature.identity.login.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl", f = "LoginRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m = "mapResponseToLoginResult", n = {"authInput", "response", "callError", "authResult", "tokenResult", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "tokenData"}, nl = {238}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
/* loaded from: classes5.dex */
final class LoginRepositoryImpl$mapResponseToLoginResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputFormats.getHighSpeedVideoFpsRangesFor(null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoginRepositoryImpl$mapResponseToLoginResult$1(com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl loginRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl$mapResponseToLoginResult$1> continuation) {
        super(continuation);
        this.getOutputFormats = loginRepositoryImpl;
    }
}
