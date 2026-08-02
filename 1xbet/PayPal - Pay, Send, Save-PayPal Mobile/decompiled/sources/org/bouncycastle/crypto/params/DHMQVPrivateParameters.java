package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DHMQVPrivateParameters implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.params.DHPrivateKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.DHPrivateKeyParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.DHPublicKeyParameters getHighSpeedVideoSizes;

    public org.bouncycastle.crypto.params.DHPrivateKeyParameters getStaticPrivateKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.crypto.params.DHPublicKeyParameters getEphemeralPublicKey() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.crypto.params.DHPrivateKeyParameters getEphemeralPrivateKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public DHMQVPrivateParameters(org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters, org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters2, org.bouncycastle.crypto.params.DHPublicKeyParameters dHPublicKeyParameters) {
        if (dHPrivateKeyParameters == null) {
            throw new java.lang.NullPointerException("staticPrivateKey cannot be null");
        }
        if (dHPrivateKeyParameters2 == null) {
            throw new java.lang.NullPointerException("ephemeralPrivateKey cannot be null");
        }
        org.bouncycastle.crypto.params.DHParameters parameters = dHPrivateKeyParameters.getParameters();
        if (!parameters.equals(dHPrivateKeyParameters2.getParameters())) {
            throw new java.lang.IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        }
        if (dHPublicKeyParameters == null) {
            dHPublicKeyParameters = new org.bouncycastle.crypto.params.DHPublicKeyParameters(parameters.getG().multiply(dHPrivateKeyParameters2.getX()), parameters);
        } else if (!parameters.equals(dHPublicKeyParameters.getParameters())) {
            throw new java.lang.IllegalArgumentException("Ephemeral public key has different domain parameters");
        }
        this.getHighSpeedVideoFpsRangesFor = dHPrivateKeyParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = dHPrivateKeyParameters2;
        this.getHighSpeedVideoSizes = dHPublicKeyParameters;
    }

    public DHMQVPrivateParameters(org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters, org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters2) {
        this(dHPrivateKeyParameters, dHPrivateKeyParameters2, null);
    }
}
