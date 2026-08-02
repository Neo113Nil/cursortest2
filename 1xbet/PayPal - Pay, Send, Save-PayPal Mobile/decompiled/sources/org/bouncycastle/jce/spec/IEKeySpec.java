package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class IEKeySpec implements java.security.spec.KeySpec, org.bouncycastle.jce.interfaces.IESKey {
    private java.security.PrivateKey Camera2StreamConfigurationMap;
    private java.security.PublicKey getHighSpeedVideoFpsRanges;

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return null;
    }

    @Override // org.bouncycastle.jce.interfaces.IESKey
    public java.security.PublicKey getPublic() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.jce.interfaces.IESKey
    public java.security.PrivateKey getPrivate() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "IES";
    }

    public IEKeySpec(java.security.PrivateKey privateKey, java.security.PublicKey publicKey) {
        this.Camera2StreamConfigurationMap = privateKey;
        this.getHighSpeedVideoFpsRanges = publicKey;
    }
}
