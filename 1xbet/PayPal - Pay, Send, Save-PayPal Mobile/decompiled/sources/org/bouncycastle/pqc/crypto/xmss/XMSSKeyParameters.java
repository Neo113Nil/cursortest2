package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public class XMSSKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    public static final java.lang.String SHAKE128 = "SHAKE128";
    public static final java.lang.String SHAKE256 = "SHAKE256";
    public static final java.lang.String SHA_256 = "SHA-256";
    public static final java.lang.String SHA_512 = "SHA-512";
    private final java.lang.String Camera2StreamConfigurationMap;

    public java.lang.String getTreeDigest() {
        return this.Camera2StreamConfigurationMap;
    }

    public XMSSKeyParameters(boolean z, java.lang.String str) {
        super(z);
        this.Camera2StreamConfigurationMap = str;
    }
}
