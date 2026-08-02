package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaX509ExtensionUtils extends org.bouncycastle.cert.X509ExtensionUtils {
    public org.bouncycastle.asn1.x509.SubjectKeyIdentifier createTruncatedSubjectKeyIdentifier(java.security.PublicKey publicKey) {
        return super.createTruncatedSubjectKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public org.bouncycastle.asn1.x509.SubjectKeyIdentifier createSubjectKeyIdentifier(java.security.PublicKey publicKey) {
        return super.createSubjectKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public org.bouncycastle.asn1.x509.AuthorityKeyIdentifier createAuthorityKeyIdentifier(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateEncodingException {
        return super.createAuthorityKeyIdentifier(new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate));
    }

    public org.bouncycastle.asn1.x509.AuthorityKeyIdentifier createAuthorityKeyIdentifier(java.security.PublicKey publicKey, org.bouncycastle.asn1.x509.GeneralNames generalNames, java.math.BigInteger bigInteger) {
        return super.createAuthorityKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()), generalNames, bigInteger);
    }

    public org.bouncycastle.asn1.x509.AuthorityKeyIdentifier createAuthorityKeyIdentifier(java.security.PublicKey publicKey, javax.security.auth.x500.X500Principal x500Principal, java.math.BigInteger bigInteger) {
        return super.createAuthorityKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()), new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()))), bigInteger);
    }

    public org.bouncycastle.asn1.x509.AuthorityKeyIdentifier createAuthorityKeyIdentifier(java.security.PublicKey publicKey) {
        return super.createAuthorityKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public static org.bouncycastle.asn1.ASN1Primitive parseExtensionValue(byte[] bArr) throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(org.bouncycastle.asn1.ASN1OctetString.getInstance(bArr).getOctets());
    }

    static class SHA1DigestCalculator implements org.bouncycastle.operator.DigestCalculator {
        private java.security.MessageDigest Camera2StreamConfigurationMap;
        private java.io.ByteArrayOutputStream getHighSpeedVideoFpsRanges = new java.io.ByteArrayOutputStream();

        @Override // org.bouncycastle.operator.DigestCalculator
        public java.io.OutputStream getOutputStream() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // org.bouncycastle.operator.DigestCalculator
        public byte[] getDigest() {
            byte[] digest = this.Camera2StreamConfigurationMap.digest(this.getHighSpeedVideoFpsRanges.toByteArray());
            this.getHighSpeedVideoFpsRanges.reset();
            return digest;
        }

        @Override // org.bouncycastle.operator.DigestCalculator
        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        }

        public SHA1DigestCalculator(java.security.MessageDigest messageDigest) {
            this.Camera2StreamConfigurationMap = messageDigest;
        }
    }

    public static java.util.Collection getSubjectAlternativeNames(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateParsingException {
        return getHighSpeedVideoFpsRangesFor(x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.subjectAlternativeName.getId()));
    }

    public static java.util.Collection getIssuerAlternativeNames(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateParsingException {
        return getHighSpeedVideoFpsRangesFor(x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.issuerAlternativeName.getId()));
    }

    private static java.util.Collection getHighSpeedVideoFpsRangesFor(byte[] bArr) throws java.security.cert.CertificateParsingException {
        java.lang.Object aSN1Primitive;
        if (bArr == null) {
            return java.util.Collections.EMPTY_LIST;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Enumeration objects = org.bouncycastle.asn1.DERSequence.getInstance(parseExtensionValue(bArr)).getObjects();
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

    public JcaX509ExtensionUtils(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        super(digestCalculator);
    }

    public JcaX509ExtensionUtils() throws java.security.NoSuchAlgorithmException {
        super(new org.bouncycastle.cert.jcajce.JcaX509ExtensionUtils.SHA1DigestCalculator(java.security.MessageDigest.getInstance("SHA1")));
    }
}
