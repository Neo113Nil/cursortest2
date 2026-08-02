package org.bouncycastle.openssl;

/* loaded from: classes17.dex */
public class MiscPEMGenerator implements org.bouncycastle.util.io.pem.PemObjectGenerator {
    private final org.bouncycastle.openssl.PEMEncryptor getHighSpeedVideoFpsRanges;
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;
    private static final org.bouncycastle.asn1.ASN1ObjectIdentifier[] getHighSpeedVideoSizes = {org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1};
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 65, 66, 67, 68, 69, 70};

    @Override // org.bouncycastle.util.io.pem.PemObjectGenerator
    public org.bouncycastle.util.io.pem.PemObject generate() throws org.bouncycastle.util.io.pem.PemGenerationException {
        byte[] encoded;
        java.lang.String str;
        org.bouncycastle.util.io.pem.PemObject pemObject;
        try {
            java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
            if (obj instanceof org.bouncycastle.util.io.pem.PemObject) {
                return (org.bouncycastle.util.io.pem.PemObject) obj;
            }
            if (obj instanceof org.bouncycastle.util.io.pem.PemObjectGenerator) {
                return ((org.bouncycastle.util.io.pem.PemObjectGenerator) obj).generate();
            }
            if (obj instanceof org.bouncycastle.cert.X509CertificateHolder) {
                encoded = ((org.bouncycastle.cert.X509CertificateHolder) obj).getEncoded();
                str = org.bouncycastle.openssl.PEMParser.TYPE_CERTIFICATE;
            } else if (obj instanceof org.bouncycastle.cert.X509CRLHolder) {
                encoded = ((org.bouncycastle.cert.X509CRLHolder) obj).getEncoded();
                str = org.bouncycastle.openssl.PEMParser.TYPE_X509_CRL;
            } else if (obj instanceof org.bouncycastle.openssl.X509TrustedCertificateBlock) {
                encoded = ((org.bouncycastle.openssl.X509TrustedCertificateBlock) obj).getEncoded();
                str = org.bouncycastle.openssl.PEMParser.TYPE_TRUSTED_CERTIFICATE;
            } else if (obj instanceof org.bouncycastle.asn1.pkcs.PrivateKeyInfo) {
                org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = (org.bouncycastle.asn1.pkcs.PrivateKeyInfo) obj;
                org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
                if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption)) {
                    encoded = privateKeyInfo.parsePrivateKey().toASN1Primitive().getEncoded();
                    str = org.bouncycastle.openssl.PEMParser.TYPE_RSA_PRIVATE_KEY;
                } else {
                    org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = getHighSpeedVideoSizes;
                    if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifierArr[0]) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifierArr[1])) {
                        org.bouncycastle.asn1.x509.DSAParameter dSAParameter = org.bouncycastle.asn1.x509.DSAParameter.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
                        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
                        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(0L));
                        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(dSAParameter.getP()));
                        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(dSAParameter.getQ()));
                        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(dSAParameter.getG()));
                        java.math.BigInteger value = org.bouncycastle.asn1.ASN1Integer.getInstance(privateKeyInfo.parsePrivateKey()).getValue();
                        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(dSAParameter.getG().modPow(value, dSAParameter.getP())));
                        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(value));
                        encoded = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded();
                        str = org.bouncycastle.openssl.PEMParser.TYPE_DSA_PRIVATE_KEY;
                    } else if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey)) {
                        encoded = privateKeyInfo.parsePrivateKey().toASN1Primitive().getEncoded();
                        str = org.bouncycastle.openssl.PEMParser.TYPE_EC_PRIVATE_KEY;
                    } else {
                        encoded = privateKeyInfo.getEncoded();
                        str = org.bouncycastle.openssl.PEMParser.TYPE_PRIVATE_KEY;
                    }
                }
            } else if (obj instanceof org.bouncycastle.asn1.x509.SubjectPublicKeyInfo) {
                encoded = ((org.bouncycastle.asn1.x509.SubjectPublicKeyInfo) obj).getEncoded();
                str = org.bouncycastle.openssl.PEMParser.TYPE_PUBLIC_KEY;
            } else if (obj instanceof org.bouncycastle.cert.X509AttributeCertificateHolder) {
                encoded = ((org.bouncycastle.cert.X509AttributeCertificateHolder) obj).getEncoded();
                str = org.bouncycastle.openssl.PEMParser.TYPE_ATTRIBUTE_CERTIFICATE;
            } else if (obj instanceof org.bouncycastle.pkcs.PKCS10CertificationRequest) {
                encoded = ((org.bouncycastle.pkcs.PKCS10CertificationRequest) obj).getEncoded();
                str = org.bouncycastle.openssl.PEMParser.TYPE_CERTIFICATE_REQUEST;
            } else if (obj instanceof org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo) {
                encoded = ((org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo) obj).getEncoded();
                str = org.bouncycastle.openssl.PEMParser.TYPE_ENCRYPTED_PRIVATE_KEY;
            } else {
                if (!(obj instanceof org.bouncycastle.asn1.cms.ContentInfo)) {
                    throw new org.bouncycastle.util.io.pem.PemGenerationException("unknown object passed - can't encode.");
                }
                encoded = ((org.bouncycastle.asn1.cms.ContentInfo) obj).getEncoded();
                str = org.bouncycastle.openssl.PEMParser.TYPE_PKCS7;
            }
            org.bouncycastle.openssl.PEMEncryptor pEMEncryptor = this.getHighSpeedVideoFpsRanges;
            if (pEMEncryptor != null) {
                java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(pEMEncryptor.getAlgorithm());
                if (upperCase.equals("DESEDE")) {
                    upperCase = "DES-EDE3-CBC";
                }
                byte[] iv = this.getHighSpeedVideoFpsRanges.getIV();
                byte[] encrypt = this.getHighSpeedVideoFpsRanges.encrypt(encoded);
                java.util.ArrayList arrayList = new java.util.ArrayList(2);
                arrayList.add(new org.bouncycastle.util.io.pem.PemHeader("Proc-Type", "4,ENCRYPTED"));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(upperCase);
                sb.append(",");
                sb.append(getHighResolutionOutputSizeshNQ4ISI(iv));
                arrayList.add(new org.bouncycastle.util.io.pem.PemHeader("DEK-Info", sb.toString()));
                pemObject = new org.bouncycastle.util.io.pem.PemObject(str, arrayList, encrypt);
            } else {
                pemObject = new org.bouncycastle.util.io.pem.PemObject(str, encoded);
            }
            return pemObject;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding exception: ");
            sb2.append(e.getMessage());
            throw new org.bouncycastle.util.io.pem.PemGenerationException(sb2.toString(), e);
        }
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws java.io.IOException {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            byte[] bArr2 = getHighResolutionOutputSizeshNQ4ISI;
            cArr[i2] = (char) bArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = (char) bArr2[b & com.google.common.base.Ascii.SI];
        }
        return new java.lang.String(cArr);
    }

    public MiscPEMGenerator(java.lang.Object obj, org.bouncycastle.openssl.PEMEncryptor pEMEncryptor) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges = pEMEncryptor;
    }

    public MiscPEMGenerator(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges = null;
    }
}
