package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DHUPrivateParameters implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.params.DHPrivateKeyParameters getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.params.DHPublicKeyParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.DHPrivateKeyParameters getHighSpeedVideoSizes;

    public org.bouncycastle.crypto.params.DHPrivateKeyParameters getStaticPrivateKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.crypto.params.DHPublicKeyParameters getEphemeralPublicKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.crypto.params.DHPrivateKeyParameters getEphemeralPrivateKey() {
        return this.getHighSpeedVideoSizes;
    }

    public DHUPrivateParameters(org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters, org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters2, org.bouncycastle.crypto.params.DHPublicKeyParameters dHPublicKeyParameters) {
        if (dHPrivateKeyParameters == null) {
            throw new java.lang.NullPointerException("staticPrivateKey cannot be null");
        }
        if (dHPrivateKeyParameters2 == null) {
            throw new java.lang.NullPointerException("ephemeralPrivateKey cannot be null");
        }
        org.bouncycastle.crypto.params.DHParameters parameters = dHPrivateKeyParameters.getParameters();
        if (!parameters.equals(dHPrivateKeyParameters2.getParameters())) {
            throw new java.lang.IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (dHPublicKeyParameters == null) {
            dHPublicKeyParameters = new org.bouncycastle.crypto.params.DHPublicKeyParameters(parameters.getG().modPow(dHPrivateKeyParameters2.getX(), parameters.getP()), parameters);
        } else if (!parameters.equals(dHPublicKeyParameters.getParameters())) {
            throw new java.lang.IllegalArgumentException("ephemeral public key has different domain parameters");
        }
        this.getHighSpeedVideoFpsRanges = dHPrivateKeyParameters;
        this.getHighSpeedVideoSizes = dHPrivateKeyParameters2;
        this.getHighSpeedVideoFpsRangesFor = dHPublicKeyParameters;
    }

    public DHUPrivateParameters(org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters, org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters2) {
        this(dHPrivateKeyParameters, dHPrivateKeyParameters2, null);
    }
}
