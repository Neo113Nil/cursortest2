package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class GOST3410PublicKeyParameters extends org.bouncycastle.crypto.params.GOST3410KeyParameters {
    private java.math.BigInteger Camera2StreamConfigurationMap;

    public java.math.BigInteger getY() {
        return this.Camera2StreamConfigurationMap;
    }

    public GOST3410PublicKeyParameters(java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.GOST3410Parameters gOST3410Parameters) {
        super(false, gOST3410Parameters);
        this.Camera2StreamConfigurationMap = bigInteger;
    }
}
