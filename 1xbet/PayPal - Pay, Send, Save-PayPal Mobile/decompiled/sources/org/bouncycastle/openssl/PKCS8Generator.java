package org.bouncycastle.openssl;

/* loaded from: classes17.dex */
public class PKCS8Generator implements org.bouncycastle.util.io.pem.PemObjectGenerator {
    private org.bouncycastle.operator.OutputEncryptor getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.pkcs.PrivateKeyInfo getHighSpeedVideoSizes;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier AES_128_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier AES_192_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier AES_256_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier DES3_CBC = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PBE_SHA1_RC4_128 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PBE_SHA1_RC4_40 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PBE_SHA1_3DES = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PBE_SHA1_2DES = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PBE_SHA1_RC2_128 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PBE_SHA1_RC2_40 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC;
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_HMACSHA1 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_HMACSHA224 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_HMACSHA256 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_HMACSHA384 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_HMACSHA512 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_HMACGOST3411 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411Hmac, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_HMACSHA3_224 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_224, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_HMACSHA3_256 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_256, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_HMACSHA3_384 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_384, org.bouncycastle.asn1.DERNull.INSTANCE);
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier PRF_HMACSHA3_512 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512, org.bouncycastle.asn1.DERNull.INSTANCE);

    @Override // org.bouncycastle.util.io.pem.PemObjectGenerator
    public org.bouncycastle.util.io.pem.PemObject generate() throws org.bouncycastle.util.io.pem.PemGenerationException {
        org.bouncycastle.operator.OutputEncryptor outputEncryptor = this.getHighSpeedVideoFpsRangesFor;
        return outputEncryptor != null ? getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, outputEncryptor) : getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, null);
    }

    private static org.bouncycastle.util.io.pem.PemObject getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo, org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws org.bouncycastle.util.io.pem.PemGenerationException {
        try {
            byte[] encoded = privateKeyInfo.getEncoded();
            if (outputEncryptor == null) {
                return new org.bouncycastle.util.io.pem.PemObject(org.bouncycastle.openssl.PEMParser.TYPE_PRIVATE_KEY, encoded);
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.OutputStream outputStream = outputEncryptor.getOutputStream(byteArrayOutputStream);
            outputStream.write(privateKeyInfo.getEncoded());
            outputStream.close();
            return new org.bouncycastle.util.io.pem.PemObject(org.bouncycastle.openssl.PEMParser.TYPE_ENCRYPTED_PRIVATE_KEY, new org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo(outputEncryptor.getAlgorithmIdentifier(), byteArrayOutputStream.toByteArray()).getEncoded());
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process encoded key data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.io.pem.PemGenerationException(sb.toString(), e);
        }
    }

    public PKCS8Generator(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo, org.bouncycastle.operator.OutputEncryptor outputEncryptor) {
        this.getHighSpeedVideoSizes = privateKeyInfo;
        this.getHighSpeedVideoFpsRangesFor = outputEncryptor;
    }
}
