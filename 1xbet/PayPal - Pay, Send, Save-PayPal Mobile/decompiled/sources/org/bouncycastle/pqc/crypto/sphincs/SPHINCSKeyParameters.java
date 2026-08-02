package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
public class SPHINCSKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    public static final java.lang.String SHA3_256 = "SHA3-256";
    public static final java.lang.String SHA512_256 = "SHA-512/256";
    private final java.lang.String Camera2StreamConfigurationMap;

    public java.lang.String getTreeDigest() {
        return this.Camera2StreamConfigurationMap;
    }

    protected SPHINCSKeyParameters(boolean z, java.lang.String str) {
        super(z);
        this.Camera2StreamConfigurationMap = str;
    }
}
