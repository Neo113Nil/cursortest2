package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class ElGamalPublicKeySpec extends org.bouncycastle.jce.spec.ElGamalKeySpec {
    private java.math.BigInteger Camera2StreamConfigurationMap;

    public java.math.BigInteger getY() {
        return this.Camera2StreamConfigurationMap;
    }

    public ElGamalPublicKeySpec(java.math.BigInteger bigInteger, org.bouncycastle.jce.spec.ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.Camera2StreamConfigurationMap = bigInteger;
    }
}
