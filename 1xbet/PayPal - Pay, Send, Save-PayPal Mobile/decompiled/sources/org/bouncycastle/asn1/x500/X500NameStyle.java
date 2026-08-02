package org.bouncycastle.asn1.x500;

/* loaded from: classes17.dex */
public interface X500NameStyle {
    boolean areEqual(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x500.X500Name x500Name2);

    org.bouncycastle.asn1.ASN1ObjectIdentifier attrNameToOID(java.lang.String str);

    int calculateHashCode(org.bouncycastle.asn1.x500.X500Name x500Name);

    org.bouncycastle.asn1.x500.RDN[] fromString(java.lang.String str);

    java.lang.String[] oidToAttrNames(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier);

    java.lang.String oidToDisplayName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier);

    org.bouncycastle.asn1.ASN1Encodable stringToValue(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str);

    java.lang.String toString(org.bouncycastle.asn1.x500.X500Name x500Name);
}
