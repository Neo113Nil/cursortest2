package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class ECPrivateKeySpec extends org.bouncycastle.jce.spec.ECKeySpec {
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;

    public java.math.BigInteger getD() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public ECPrivateKeySpec(java.math.BigInteger bigInteger, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
    }
}
