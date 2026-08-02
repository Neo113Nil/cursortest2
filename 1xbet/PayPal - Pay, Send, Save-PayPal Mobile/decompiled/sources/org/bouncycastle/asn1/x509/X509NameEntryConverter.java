package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public abstract class X509NameEntryConverter {
    public abstract org.bouncycastle.asn1.ASN1Primitive getConvertedValue(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str);

    protected org.bouncycastle.asn1.ASN1Primitive convertHexEncoded(java.lang.String str, int i) throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(org.bouncycastle.util.encoders.Hex.decodeStrict(str, i, str.length() - i));
    }

    protected boolean canBePrintable(java.lang.String str) {
        return org.bouncycastle.asn1.ASN1PrintableString.isPrintableString(str);
    }
}
