package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class XDHUPrivateParameters implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getStaticPrivateKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getEphemeralPublicKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getEphemeralPrivateKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public XDHUPrivateParameters(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter2, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter3) {
        if (asymmetricKeyParameter == null) {
            throw new java.lang.NullPointerException("staticPrivateKey cannot be null");
        }
        boolean z = asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X448PrivateKeyParameters;
        if (!z && !(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X25519PrivateKeyParameters)) {
            throw new java.lang.IllegalArgumentException("only X25519 and X448 paramaters can be used");
        }
        if (asymmetricKeyParameter2 == null) {
            throw new java.lang.NullPointerException("ephemeralPrivateKey cannot be null");
        }
        if (!asymmetricKeyParameter.getClass().isAssignableFrom(asymmetricKeyParameter2.getClass())) {
            throw new java.lang.IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (asymmetricKeyParameter3 == null) {
            asymmetricKeyParameter3 = asymmetricKeyParameter2 instanceof org.bouncycastle.crypto.params.X448PrivateKeyParameters ? ((org.bouncycastle.crypto.params.X448PrivateKeyParameters) asymmetricKeyParameter2).generatePublicKey() : ((org.bouncycastle.crypto.params.X25519PrivateKeyParameters) asymmetricKeyParameter2).generatePublicKey();
        } else {
            if ((asymmetricKeyParameter3 instanceof org.bouncycastle.crypto.params.X448PublicKeyParameters) && !z) {
                throw new java.lang.IllegalArgumentException("ephemeral public key has different domain parameters");
            }
            if ((asymmetricKeyParameter3 instanceof org.bouncycastle.crypto.params.X25519PublicKeyParameters) && !(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X25519PrivateKeyParameters)) {
                throw new java.lang.IllegalArgumentException("ephemeral public key has different domain parameters");
            }
        }
        this.getHighSpeedVideoFpsRangesFor = asymmetricKeyParameter;
        this.Camera2StreamConfigurationMap = asymmetricKeyParameter2;
        this.getHighResolutionOutputSizeshNQ4ISI = asymmetricKeyParameter3;
    }

    public XDHUPrivateParameters(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter2) {
        this(asymmetricKeyParameter, asymmetricKeyParameter2, null);
    }
}
