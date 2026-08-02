package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class MQVPrivateParameters implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.params.ECPrivateKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.ECPublicKeyParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.ECPrivateKeyParameters getHighSpeedVideoSizes;

    public org.bouncycastle.crypto.params.ECPrivateKeyParameters getStaticPrivateKey() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.crypto.params.ECPublicKeyParameters getEphemeralPublicKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.crypto.params.ECPrivateKeyParameters getEphemeralPrivateKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public MQVPrivateParameters(org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters2, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters) {
        if (eCPrivateKeyParameters == null) {
            throw new java.lang.NullPointerException("staticPrivateKey cannot be null");
        }
        if (eCPrivateKeyParameters2 == null) {
            throw new java.lang.NullPointerException("ephemeralPrivateKey cannot be null");
        }
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        if (!parameters.equals(eCPrivateKeyParameters2.getParameters())) {
            throw new java.lang.IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        }
        if (eCPublicKeyParameters == null) {
            eCPublicKeyParameters = new org.bouncycastle.crypto.params.ECPublicKeyParameters(new org.bouncycastle.math.ec.FixedPointCombMultiplier().multiply(parameters.getG(), eCPrivateKeyParameters2.getD()), parameters);
        } else if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new java.lang.IllegalArgumentException("Ephemeral public key has different domain parameters");
        }
        this.getHighSpeedVideoSizes = eCPrivateKeyParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeyParameters2;
        this.getHighSpeedVideoFpsRangesFor = eCPublicKeyParameters;
    }

    public MQVPrivateParameters(org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters2) {
        this(eCPrivateKeyParameters, eCPrivateKeyParameters2, null);
    }
}
