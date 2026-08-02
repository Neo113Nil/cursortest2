package org.bouncycastle.jce.interfaces;

/* loaded from: classes17.dex */
public interface PKCS12BagAttributeCarrier {
    org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier);

    java.util.Enumeration getBagAttributeKeys();

    void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable);
}
