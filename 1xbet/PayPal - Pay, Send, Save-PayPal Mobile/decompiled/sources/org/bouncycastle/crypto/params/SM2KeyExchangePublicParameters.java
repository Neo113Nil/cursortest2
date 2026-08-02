package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class SM2KeyExchangePublicParameters implements org.bouncycastle.crypto.CipherParameters {
    private final org.bouncycastle.crypto.params.ECPublicKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.params.ECPublicKeyParameters getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.crypto.params.ECPublicKeyParameters getStaticPublicKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.crypto.params.ECPublicKeyParameters getEphemeralPublicKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public SM2KeyExchangePublicParameters(org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters2) {
        if (eCPublicKeyParameters == null) {
            throw new java.lang.NullPointerException("staticPublicKey cannot be null");
        }
        if (eCPublicKeyParameters2 == null) {
            throw new java.lang.NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!eCPublicKeyParameters.getParameters().equals(eCPublicKeyParameters2.getParameters())) {
            throw new java.lang.IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
        this.getHighSpeedVideoFpsRangesFor = eCPublicKeyParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPublicKeyParameters2;
    }
}
