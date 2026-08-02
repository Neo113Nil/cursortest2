package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ElGamalPrivateKeyParameters extends org.bouncycastle.crypto.params.ElGamalKeyParameters {
    private java.math.BigInteger Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return getX().hashCode();
    }

    public java.math.BigInteger getX() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(java.lang.Object obj) {
        if ((obj instanceof org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters) && ((org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters) obj).getX().equals(this.Camera2StreamConfigurationMap)) {
            return super.equals(obj);
        }
        return false;
    }

    public ElGamalPrivateKeyParameters(java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.ElGamalParameters elGamalParameters) {
        super(true, elGamalParameters);
        this.Camera2StreamConfigurationMap = bigInteger;
    }
}
