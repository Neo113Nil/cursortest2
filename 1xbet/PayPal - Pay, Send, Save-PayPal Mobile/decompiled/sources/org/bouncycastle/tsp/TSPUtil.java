package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public class TSPUtil {
    private static final java.util.Map getHighResolutionOutputSizeshNQ4ISI;
    private static java.util.List getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(new java.util.ArrayList());
    private static final java.util.Map getHighSpeedVideoSizes;

    public static void validateCertificate(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.tsp.TSPValidationException {
        if (x509CertificateHolder.toASN1Structure().getVersionNumber() != 3) {
            throw new java.lang.IllegalArgumentException("Certificate must have an ExtendedKeyUsage extension.");
        }
        org.bouncycastle.asn1.x509.Extension extension = x509CertificateHolder.getExtension(org.bouncycastle.asn1.x509.Extension.extendedKeyUsage);
        if (extension == null) {
            throw new org.bouncycastle.tsp.TSPValidationException("Certificate must have an ExtendedKeyUsage extension.");
        }
        if (!extension.isCritical()) {
            throw new org.bouncycastle.tsp.TSPValidationException("Certificate must have an ExtendedKeyUsage extension marked as critical.");
        }
        org.bouncycastle.asn1.x509.ExtendedKeyUsage extendedKeyUsage = org.bouncycastle.asn1.x509.ExtendedKeyUsage.getInstance(extension.getParsedValue());
        if (!extendedKeyUsage.hasKeyPurposeId(org.bouncycastle.asn1.x509.KeyPurposeId.id_kp_timeStamping) || extendedKeyUsage.size() != 1) {
            throw new org.bouncycastle.tsp.TSPValidationException("ExtendedKeyUsage not solely time stamping.");
        }
    }

    public static java.util.Collection getSignatureTimestamps(org.bouncycastle.cms.SignerInformation signerInformation, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.tsp.TSPValidationException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.bouncycastle.asn1.cms.AttributeTable unsignedAttributes = signerInformation.getUnsignedAttributes();
        if (unsignedAttributes != null) {
            org.bouncycastle.asn1.ASN1EncodableVector all = unsignedAttributes.getAll(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_aa_signatureTimeStampToken);
            for (int i = 0; i < all.size(); i++) {
                org.bouncycastle.asn1.ASN1Set attrValues = ((org.bouncycastle.asn1.cms.Attribute) all.get(i)).getAttrValues();
                for (int i2 = 0; i2 < attrValues.size(); i2++) {
                    try {
                        org.bouncycastle.tsp.TimeStampToken timeStampToken = new org.bouncycastle.tsp.TimeStampToken(org.bouncycastle.asn1.cms.ContentInfo.getInstance(attrValues.getObjectAt(i2)));
                        org.bouncycastle.tsp.TimeStampTokenInfo timeStampInfo = timeStampToken.getTimeStampInfo();
                        org.bouncycastle.operator.DigestCalculator digestCalculator = digestCalculatorProvider.get(timeStampInfo.getHashAlgorithm());
                        java.io.OutputStream outputStream = digestCalculator.getOutputStream();
                        outputStream.write(signerInformation.getSignature());
                        outputStream.close();
                        if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(digestCalculator.getDigest(), timeStampInfo.getMessageImprintDigest())) {
                            throw new org.bouncycastle.tsp.TSPValidationException("Incorrect digest in message imprint");
                        }
                        arrayList.add(timeStampToken);
                    } catch (org.bouncycastle.operator.OperatorCreationException unused) {
                        throw new org.bouncycastle.tsp.TSPValidationException("Unknown hash algorithm specified in timestamp");
                    } catch (java.lang.Exception unused2) {
                        throw new org.bouncycastle.tsp.TSPValidationException("Timestamp could not be parsed");
                    }
                }
            }
        }
        return arrayList;
    }

    static java.util.List getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.Extensions extensions) {
        return extensions == null ? getHighSpeedVideoFpsRangesFor : java.util.Collections.unmodifiableList(java.util.Arrays.asList(extensions.getExtensionOIDs()));
    }

    static int Camera2StreamConfigurationMap(java.lang.String str) throws org.bouncycastle.tsp.TSPException {
        java.lang.Integer num = (java.lang.Integer) getHighResolutionOutputSizeshNQ4ISI.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new org.bouncycastle.tsp.TSPException("digest algorithm cannot be found.");
    }

    static void Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.ExtensionsGenerator extensionsGenerator, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.tsp.TSPIOException {
        try {
            extensionsGenerator.addExtension(aSN1ObjectIdentifier, z, aSN1Encodable);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode extension: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.tsp.TSPIOException(sb.toString(), e);
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighResolutionOutputSizeshNQ4ISI = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap2;
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5.getId(), org.bouncycastle.util.Integers.valueOf(16));
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1.getId(), org.bouncycastle.util.Integers.valueOf(20));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224.getId(), org.bouncycastle.util.Integers.valueOf(28));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256.getId(), org.bouncycastle.util.Integers.valueOf(32));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384.getId(), org.bouncycastle.util.Integers.valueOf(48));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512.getId(), org.bouncycastle.util.Integers.valueOf(64));
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128.getId(), org.bouncycastle.util.Integers.valueOf(16));
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160.getId(), org.bouncycastle.util.Integers.valueOf(20));
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256.getId(), org.bouncycastle.util.Integers.valueOf(32));
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411.getId(), org.bouncycastle.util.Integers.valueOf(32));
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256.getId(), org.bouncycastle.util.Integers.valueOf(32));
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512.getId(), org.bouncycastle.util.Integers.valueOf(64));
        hashMap.put(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm3.getId(), org.bouncycastle.util.Integers.valueOf(32));
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5.getId(), "MD5");
        hashMap2.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1.getId(), "SHA1");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224.getId(), "SHA224");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256.getId(), "SHA256");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384.getId(), "SHA384");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512.getId(), "SHA512");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha1WithRSAEncryption.getId(), "SHA1");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption.getId(), "SHA224");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption.getId(), "SHA256");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption.getId(), "SHA384");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption.getId(), "SHA512");
        hashMap2.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128.getId(), "RIPEMD128");
        hashMap2.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160.getId(), "RIPEMD160");
        hashMap2.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256.getId(), "RIPEMD256");
        hashMap2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411.getId(), "GOST3411");
        hashMap2.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256.getId(), "GOST3411-2012-256");
        hashMap2.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512.getId(), "GOST3411-2012-512");
        hashMap2.put(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm3.getId(), "SM3");
    }
}
