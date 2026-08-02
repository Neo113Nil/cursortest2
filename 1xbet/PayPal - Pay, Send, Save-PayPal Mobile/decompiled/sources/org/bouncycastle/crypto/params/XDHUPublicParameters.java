package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class XDHUPublicParameters implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getStaticPublicKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getEphemeralPublicKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public XDHUPublicParameters(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter2) {
        if (asymmetricKeyParameter == null) {
            throw new java.lang.NullPointerException("staticPublicKey cannot be null");
        }
        if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X448PublicKeyParameters) && !(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X25519PublicKeyParameters)) {
            throw new java.lang.IllegalArgumentException("only X25519 and X448 paramaters can be used");
        }
        if (asymmetricKeyParameter2 == null) {
            throw new java.lang.NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!asymmetricKeyParameter.getClass().isAssignableFrom(asymmetricKeyParameter2.getClass())) {
            throw new java.lang.IllegalArgumentException("static and ephemeral public keys have different domain parameters");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = asymmetricKeyParameter;
        this.getHighSpeedVideoFpsRangesFor = asymmetricKeyParameter2;
    }
}
