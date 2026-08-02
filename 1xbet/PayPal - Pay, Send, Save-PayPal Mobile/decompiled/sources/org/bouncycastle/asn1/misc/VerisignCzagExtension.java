package org.bouncycastle.asn1.misc;

/* loaded from: classes17.dex */
public class VerisignCzagExtension extends org.bouncycastle.asn1.DERIA5String {
    @Override // org.bouncycastle.asn1.ASN1IA5String
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VerisignCzagExtension: ");
        sb.append(getString());
        return sb.toString();
    }

    public VerisignCzagExtension(org.bouncycastle.asn1.ASN1IA5String aSN1IA5String) {
        super(aSN1IA5String.getString());
    }
}
