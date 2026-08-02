package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public class XMSSMTKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    private final java.lang.String Camera2StreamConfigurationMap;

    public java.lang.String getTreeDigest() {
        return this.Camera2StreamConfigurationMap;
    }

    public XMSSMTKeyParameters(boolean z, java.lang.String str) {
        super(z);
        this.Camera2StreamConfigurationMap = str;
    }
}
