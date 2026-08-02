package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class X509DefaultEntryConverter extends org.bouncycastle.asn1.x509.X509NameEntryConverter {
    @Override // org.bouncycastle.asn1.x509.X509NameEntryConverter
    public org.bouncycastle.asn1.ASN1Primitive getConvertedValue(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.X509Name.EmailAddress) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.X509Name.DC)) ? new org.bouncycastle.asn1.DERIA5String(str) : aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.X509Name.DATE_OF_BIRTH) ? new org.bouncycastle.asn1.DERGeneralizedTime(str) : (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.X509Name.C) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.X509Name.SN) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.X509Name.DN_QUALIFIER) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.X509Name.TELEPHONE_NUMBER)) ? new org.bouncycastle.asn1.DERPrintableString(str) : new org.bouncycastle.asn1.DERUTF8String(str);
        }
        try {
            return convertHexEncoded(str, 1);
        } catch (java.io.IOException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("can't recode value for oid ");
            sb.append(aSN1ObjectIdentifier.getId());
            throw new java.lang.RuntimeException(sb.toString());
        }
    }
}
