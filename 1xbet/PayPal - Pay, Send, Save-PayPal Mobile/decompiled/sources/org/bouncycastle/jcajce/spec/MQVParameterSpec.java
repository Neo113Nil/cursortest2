package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class MQVParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private final java.security.PublicKey Camera2StreamConfigurationMap;
    private final java.security.PublicKey getHighResolutionOutputSizeshNQ4ISI;
    private final java.security.PrivateKey getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoSizes;

    public byte[] getUserKeyingMaterial() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public java.security.PublicKey getOtherPartyEphemeralKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.security.PublicKey getEphemeralPublicKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.security.PrivateKey getEphemeralPrivateKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public MQVParameterSpec(java.security.PublicKey publicKey, java.security.PrivateKey privateKey, java.security.PublicKey publicKey2, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = publicKey;
        this.getHighSpeedVideoFpsRanges = privateKey;
        this.Camera2StreamConfigurationMap = publicKey2;
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr);
    }

    public MQVParameterSpec(java.security.PublicKey publicKey, java.security.PrivateKey privateKey, java.security.PublicKey publicKey2) {
        this(publicKey, privateKey, publicKey2, null);
    }

    public MQVParameterSpec(java.security.PrivateKey privateKey, java.security.PublicKey publicKey, byte[] bArr) {
        this(null, privateKey, publicKey, bArr);
    }

    public MQVParameterSpec(java.security.PrivateKey privateKey, java.security.PublicKey publicKey) {
        this(null, privateKey, publicKey, null);
    }

    public MQVParameterSpec(java.security.KeyPair keyPair, java.security.PublicKey publicKey, byte[] bArr) {
        this(keyPair.getPublic(), keyPair.getPrivate(), publicKey, bArr);
    }

    public MQVParameterSpec(java.security.KeyPair keyPair, java.security.PublicKey publicKey) {
        this(keyPair.getPublic(), keyPair.getPrivate(), publicKey, null);
    }
}
