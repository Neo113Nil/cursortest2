package org.bouncycastle.x509.extension;

/* loaded from: classes17.dex */
public class X509ExtensionUtil {
    public static java.util.Collection getSubjectAlternativeNames(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateParsingException {
        return getHighResolutionOutputSizeshNQ4ISI(x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.subjectAlternativeName.getId()));
    }

    public static java.util.Collection getIssuerAlternativeNames(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateParsingException {
        return getHighResolutionOutputSizeshNQ4ISI(x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.issuerAlternativeName.getId()));
    }

    private static java.util.Collection getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws java.security.cert.CertificateParsingException {
        java.lang.Object aSN1Primitive;
        if (bArr == null) {
            return java.util.Collections.EMPTY_LIST;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Enumeration objects = org.bouncycastle.asn1.DERSequence.getInstance(fromExtensionValue(bArr)).getObjects();
            while (objects.hasMoreElements()) {
                org.bouncycastle.asn1.x509.GeneralName generalName = org.bouncycastle.asn1.x509.GeneralName.getInstance(objects.nextElement());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(org.bouncycastle.util.Integers.valueOf(generalName.getTagNo()));
                switch (generalName.getTagNo()) {
                    case 0:
                    case 3:
                    case 5:
                        aSN1Primitive = generalName.getName().toASN1Primitive();
                        break;
                    case 1:
                    case 2:
                    case 6:
                        aSN1Primitive = ((org.bouncycastle.asn1.ASN1String) generalName.getName()).getString();
                        break;
                    case 4:
                        aSN1Primitive = org.bouncycastle.asn1.x500.X500Name.getInstance(generalName.getName()).toString();
                        break;
                    case 7:
                        aSN1Primitive = org.bouncycastle.asn1.DEROctetString.getInstance(generalName.getName()).getOctets();
                        break;
                    case 8:
                        aSN1Primitive = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(generalName.getName()).getId();
                        break;
                    default:
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Bad tag number: ");
                        sb.append(generalName.getTagNo());
                        throw new java.io.IOException(sb.toString());
                }
                arrayList2.add(aSN1Primitive);
                arrayList.add(arrayList2);
            }
            return java.util.Collections.unmodifiableCollection(arrayList);
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CertificateParsingException(e.getMessage());
        }
    }

    public static org.bouncycastle.asn1.ASN1Primitive fromExtensionValue(byte[] bArr) throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(((org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)).getOctets());
    }
}
