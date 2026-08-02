package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class DHExtendedPublicKeySpec extends javax.crypto.spec.DHPublicKeySpec {
    private final javax.crypto.spec.DHParameterSpec getHighSpeedVideoSizes;

    public javax.crypto.spec.DHParameterSpec getParams() {
        return this.getHighSpeedVideoSizes;
    }

    public DHExtendedPublicKeySpec(java.math.BigInteger bigInteger, javax.crypto.spec.DHParameterSpec dHParameterSpec) {
        super(bigInteger, dHParameterSpec.getP(), dHParameterSpec.getG());
        this.getHighSpeedVideoSizes = dHParameterSpec;
    }
}
