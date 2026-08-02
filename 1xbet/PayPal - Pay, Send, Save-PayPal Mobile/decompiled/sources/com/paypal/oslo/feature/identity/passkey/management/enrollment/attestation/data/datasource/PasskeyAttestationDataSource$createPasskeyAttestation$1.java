package com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource", f = "PasskeyAttestationDataSource.kt", i = {0, 0, 0, 0, 0}, l = {78}, m = "createPasskeyAttestation", n = {"activityContext", "requestJson", "credentialManager", "createPublicKeyCredentialRequest", "preferImmediatelyAvailableCredentials"}, nl = {84}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class PasskeyAttestationDataSource$createPasskeyAttestation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputFormats.createPasskeyAttestation(null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyAttestationDataSource$createPasskeyAttestation$1(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource passkeyAttestationDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource$createPasskeyAttestation$1> continuation) {
        super(continuation);
        this.getOutputFormats = passkeyAttestationDataSource;
    }
}
