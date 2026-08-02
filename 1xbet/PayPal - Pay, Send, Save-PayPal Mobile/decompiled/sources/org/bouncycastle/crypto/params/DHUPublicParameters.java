package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DHUPublicParameters implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.params.DHPublicKeyParameters Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.params.DHPublicKeyParameters getHighSpeedVideoFpsRanges;

    public org.bouncycastle.crypto.params.DHPublicKeyParameters getStaticPublicKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.crypto.params.DHPublicKeyParameters getEphemeralPublicKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public DHUPublicParameters(org.bouncycastle.crypto.params.DHPublicKeyParameters dHPublicKeyParameters, org.bouncycastle.crypto.params.DHPublicKeyParameters dHPublicKeyParameters2) {
        if (dHPublicKeyParameters == null) {
            throw new java.lang.NullPointerException("staticPublicKey cannot be null");
        }
        if (dHPublicKeyParameters2 == null) {
            throw new java.lang.NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!dHPublicKeyParameters.getParameters().equals(dHPublicKeyParameters2.getParameters())) {
            throw new java.lang.IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
        this.getHighSpeedVideoFpsRanges = dHPublicKeyParameters;
        this.Camera2StreamConfigurationMap = dHPublicKeyParameters2;
    }
}
