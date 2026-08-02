package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class XDHParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    public static final java.lang.String X25519 = "X25519";
    public static final java.lang.String X448 = "X448";
    private final java.lang.String getHighSpeedVideoSizes;

    public java.lang.String getCurveName() {
        return this.getHighSpeedVideoSizes;
    }

    public XDHParameterSpec(java.lang.String str) {
        if (str.equalsIgnoreCase("X25519")) {
            this.getHighSpeedVideoSizes = "X25519";
            return;
        }
        if (str.equalsIgnoreCase("X448")) {
            this.getHighSpeedVideoSizes = "X448";
        } else if (str.equals(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X25519.getId())) {
            this.getHighSpeedVideoSizes = "X25519";
        } else {
            if (!str.equals(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448.getId())) {
                throw new java.lang.IllegalArgumentException("unrecognized curve name: ".concat(java.lang.String.valueOf(str)));
            }
            this.getHighSpeedVideoSizes = "X448";
        }
    }
}
