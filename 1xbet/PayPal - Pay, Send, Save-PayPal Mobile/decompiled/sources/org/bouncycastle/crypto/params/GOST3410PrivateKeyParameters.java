package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class GOST3410PrivateKeyParameters extends org.bouncycastle.crypto.params.GOST3410KeyParameters {
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;

    public java.math.BigInteger getX() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public GOST3410PrivateKeyParameters(java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.GOST3410Parameters gOST3410Parameters) {
        super(true, gOST3410Parameters);
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
    }
}
