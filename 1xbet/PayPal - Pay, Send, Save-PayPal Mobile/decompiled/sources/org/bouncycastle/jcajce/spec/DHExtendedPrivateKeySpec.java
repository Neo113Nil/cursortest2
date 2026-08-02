package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class DHExtendedPrivateKeySpec extends javax.crypto.spec.DHPrivateKeySpec {
    private final javax.crypto.spec.DHParameterSpec getHighSpeedVideoSizes;

    public javax.crypto.spec.DHParameterSpec getParams() {
        return this.getHighSpeedVideoSizes;
    }

    public DHExtendedPrivateKeySpec(java.math.BigInteger bigInteger, javax.crypto.spec.DHParameterSpec dHParameterSpec) {
        super(bigInteger, dHParameterSpec.getP(), dHParameterSpec.getG());
        this.getHighSpeedVideoSizes = dHParameterSpec;
    }
}
