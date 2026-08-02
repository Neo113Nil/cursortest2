package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class EdDSAParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    public static final java.lang.String Ed25519 = "Ed25519";
    public static final java.lang.String Ed448 = "Ed448";
    private final java.lang.String getHighSpeedVideoSizes;

    public java.lang.String getCurveName() {
        return this.getHighSpeedVideoSizes;
    }

    public EdDSAParameterSpec(java.lang.String str) {
        if (str.equalsIgnoreCase("Ed25519")) {
            this.getHighSpeedVideoSizes = "Ed25519";
            return;
        }
        if (str.equalsIgnoreCase("Ed448")) {
            this.getHighSpeedVideoSizes = "Ed448";
        } else if (str.equals(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519.getId())) {
            this.getHighSpeedVideoSizes = "Ed25519";
        } else {
            if (!str.equals(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448.getId())) {
                throw new java.lang.IllegalArgumentException("unrecognized curve name: ".concat(java.lang.String.valueOf(str)));
            }
            this.getHighSpeedVideoSizes = "Ed448";
        }
    }
}
