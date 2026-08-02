package org.bouncycastle.asn1.x500.style;

/* loaded from: classes17.dex */
public abstract class AbstractX500NameStyle implements org.bouncycastle.asn1.x500.X500NameStyle {
    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public boolean areEqual(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x500.X500Name x500Name2) {
        org.bouncycastle.asn1.x500.RDN[] rDNs = x500Name.getRDNs();
        org.bouncycastle.asn1.x500.RDN[] rDNs2 = x500Name2.getRDNs();
        if (rDNs.length != rDNs2.length) {
            return false;
        }
        boolean z = (rDNs[0].getFirst() == null || rDNs2[0].getFirst() == null) ? false : !rDNs[0].getFirst().getType().equals((org.bouncycastle.asn1.ASN1Primitive) rDNs2[0].getFirst().getType());
        for (int i = 0; i != rDNs.length; i++) {
            org.bouncycastle.asn1.x500.RDN rdn = rDNs[i];
            if (z) {
                for (int length = rDNs2.length - 1; length >= 0; length--) {
                    org.bouncycastle.asn1.x500.RDN rdn2 = rDNs2[length];
                    if (rdn2 != null && rdnAreEqual(rdn, rdn2)) {
                        rDNs2[length] = null;
                    }
                }
                return false;
            }
            for (int i2 = 0; i2 != rDNs2.length; i2++) {
                org.bouncycastle.asn1.x500.RDN rdn3 = rDNs2[i2];
                if (rdn3 != null && rdnAreEqual(rdn, rdn3)) {
                    rDNs2[i2] = null;
                }
            }
            return false;
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public int calculateHashCode(org.bouncycastle.asn1.x500.X500Name x500Name) {
        org.bouncycastle.asn1.x500.RDN[] rDNs = x500Name.getRDNs();
        int i = 0;
        for (int i2 = 0; i2 != rDNs.length; i2++) {
            if (rDNs[i2].isMultiValued()) {
                org.bouncycastle.asn1.x500.AttributeTypeAndValue[] typesAndValues = rDNs[i2].getTypesAndValues();
                for (int i3 = 0; i3 != typesAndValues.length; i3++) {
                    i = (i ^ typesAndValues[i3].getType().hashCode()) ^ org.bouncycastle.asn1.x500.style.IETFUtils.canonicalString(typesAndValues[i3].getValue()).hashCode();
                }
            } else {
                i = (i ^ rDNs[i2].getFirst().getType().hashCode()) ^ org.bouncycastle.asn1.x500.style.IETFUtils.canonicalString(rDNs[i2].getFirst().getValue()).hashCode();
            }
        }
        return i;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public org.bouncycastle.asn1.ASN1Encodable stringToValue(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return encodeStringValue(aSN1ObjectIdentifier, str);
        }
        try {
            return org.bouncycastle.asn1.x500.style.IETFUtils.valueFromHexString(str, 1);
        } catch (java.io.IOException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("can't recode value for oid ");
            sb.append(aSN1ObjectIdentifier.getId());
            throw new org.bouncycastle.asn1.ASN1ParsingException(sb.toString());
        }
    }

    protected boolean rdnAreEqual(org.bouncycastle.asn1.x500.RDN rdn, org.bouncycastle.asn1.x500.RDN rdn2) {
        return org.bouncycastle.asn1.x500.style.IETFUtils.rDNAreEqual(rdn, rdn2);
    }

    protected org.bouncycastle.asn1.ASN1Encodable encodeStringValue(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        return new org.bouncycastle.asn1.DERUTF8String(str);
    }

    public static java.util.Hashtable copyHashTable(java.util.Hashtable hashtable) {
        java.util.Hashtable hashtable2 = new java.util.Hashtable();
        java.util.Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            java.lang.Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }
}
