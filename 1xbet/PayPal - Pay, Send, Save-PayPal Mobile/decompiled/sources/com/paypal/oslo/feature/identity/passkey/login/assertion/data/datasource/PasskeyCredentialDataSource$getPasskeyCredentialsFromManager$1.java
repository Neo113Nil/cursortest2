package com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource", f = "PasskeyCredentialDataSource.kt", i = {0, 0, 0, 0, 0, 0}, l = {76}, m = "getPasskeyCredentialsFromManager", n = {"activityContext", "requestJson", "credentialManager", "publicKeyCredOption", "getCredentialRequest", "preferImmediatelyAvailableCredentials"}, nl = {82}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class PasskeyCredentialDataSource$getPasskeyCredentialsFromManager$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.getPasskeyCredentialsFromManager(null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyCredentialDataSource$getPasskeyCredentialsFromManager$1(com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource passkeyCredentialDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource$getPasskeyCredentialsFromManager$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = passkeyCredentialDataSource;
    }
}
