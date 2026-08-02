package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DHPrivateKeyParameters extends org.bouncycastle.crypto.params.DHKeyParameters {
    private java.math.BigInteger Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode() ^ super.hashCode();
    }

    public java.math.BigInteger getX() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof org.bouncycastle.crypto.params.DHPrivateKeyParameters) && ((org.bouncycastle.crypto.params.DHPrivateKeyParameters) obj).getX().equals(this.Camera2StreamConfigurationMap) && super.equals(obj);
    }

    public DHPrivateKeyParameters(java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.DHParameters dHParameters) {
        super(true, dHParameters);
        this.Camera2StreamConfigurationMap = bigInteger;
    }
}
