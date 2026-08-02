package org.bouncycastle.asn1.x500.style;

/* loaded from: classes17.dex */
public class BCStrictStyle extends org.bouncycastle.asn1.x500.style.BCStyle {
    public static final org.bouncycastle.asn1.x500.X500NameStyle INSTANCE = new org.bouncycastle.asn1.x500.style.BCStrictStyle();

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle, org.bouncycastle.asn1.x500.X500NameStyle
    public boolean areEqual(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x500.X500Name x500Name2) {
        org.bouncycastle.asn1.x500.RDN[] rDNs = x500Name.getRDNs();
        org.bouncycastle.asn1.x500.RDN[] rDNs2 = x500Name2.getRDNs();
        if (rDNs.length != rDNs2.length) {
            return false;
        }
        for (int i = 0; i != rDNs.length; i++) {
            if (!rdnAreEqual(rDNs[i], rDNs2[i])) {
                return false;
            }
        }
        return true;
    }
}
