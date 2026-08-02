package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class RepeatedSecretKeySpec implements javax.crypto.SecretKey {
    private java.lang.String Camera2StreamConfigurationMap;

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return null;
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    public RepeatedSecretKeySpec(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }
}
