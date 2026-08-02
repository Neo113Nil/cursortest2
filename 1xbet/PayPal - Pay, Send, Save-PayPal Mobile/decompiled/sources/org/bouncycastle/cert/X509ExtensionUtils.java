package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class X509ExtensionUtils {
    private org.bouncycastle.operator.DigestCalculator getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.x509.AuthorityKeyIdentifier createAuthorityKeyIdentifier(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) {
        org.bouncycastle.asn1.x509.Extension extension;
        return new org.bouncycastle.asn1.x509.AuthorityKeyIdentifier((x509CertificateHolder.getVersionNumber() != 3 || (extension = x509CertificateHolder.getExtension(org.bouncycastle.asn1.x509.Extension.subjectKeyIdentifier)) == null) ? Camera2StreamConfigurationMap(x509CertificateHolder.getSubjectPublicKeyInfo()) : org.bouncycastle.asn1.ASN1OctetString.getInstance(extension.getParsedValue()).getOctets(), new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(x509CertificateHolder.getIssuer())), x509CertificateHolder.getSerialNumber());
    }

    public org.bouncycastle.asn1.x509.SubjectKeyIdentifier createTruncatedSubjectKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(subjectPublicKeyInfo);
        byte[] bArr = new byte[8];
        java.lang.System.arraycopy(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap.length - 8, bArr, 0, 8);
        byte b = (byte) (bArr[0] & com.google.common.base.Ascii.SI);
        bArr[0] = b;
        bArr[0] = (byte) (b | 64);
        return new org.bouncycastle.asn1.x509.SubjectKeyIdentifier(bArr);
    }

    public org.bouncycastle.asn1.x509.SubjectKeyIdentifier createSubjectKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new org.bouncycastle.asn1.x509.SubjectKeyIdentifier(Camera2StreamConfigurationMap(subjectPublicKeyInfo));
    }

    public org.bouncycastle.asn1.x509.AuthorityKeyIdentifier createAuthorityKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.asn1.x509.GeneralNames generalNames, java.math.BigInteger bigInteger) {
        return new org.bouncycastle.asn1.x509.AuthorityKeyIdentifier(Camera2StreamConfigurationMap(subjectPublicKeyInfo), generalNames, bigInteger);
    }

    public org.bouncycastle.asn1.x509.AuthorityKeyIdentifier createAuthorityKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new org.bouncycastle.asn1.x509.AuthorityKeyIdentifier(Camera2StreamConfigurationMap(subjectPublicKeyInfo));
    }

    private byte[] Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        java.io.OutputStream outputStream = this.getHighSpeedVideoFpsRangesFor.getOutputStream();
        try {
            outputStream.write(bytes);
            outputStream.close();
            return this.getHighSpeedVideoFpsRangesFor.getDigest();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to calculate identifier: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertRuntimeException(sb.toString(), e);
        }
    }

    public X509ExtensionUtils(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        this.getHighSpeedVideoFpsRangesFor = digestCalculator;
    }
}
