package com.visa.cbp.encryptionutils.common;

/* loaded from: classes16.dex */
public final class Util {
    public static org.bouncycastle.pkcs.PKCS10CertificationRequest generateCSR(java.security.KeyPair keyPair, org.bouncycastle.asn1.x500.X500Name x500Name) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.pkcs.jcajce.JcaPKCS10CertificationRequestBuilder(x500Name, keyPair.getPublic()).build(new org.bouncycastle.operator.jcajce.JcaContentSignerBuilder("SHA256withRSA").build(keyPair.getPrivate()));
    }

    public static java.security.cert.X509Certificate signCSR(org.bouncycastle.pkcs.PKCS10CertificationRequest pKCS10CertificationRequest, com.visa.cbp.encryptionutils.common.CertMetaData certMetaData, java.security.PrivateKey privateKey, java.security.KeyPair keyPair) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.SignatureException, java.io.IOException, org.bouncycastle.operator.OperatorCreationException, javax.security.cert.CertificateException, java.security.cert.CertificateException {
        java.security.Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        org.bouncycastle.asn1.x509.AlgorithmIdentifier find = new org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder().find("SHA256withRSA");
        org.bouncycastle.asn1.x509.AlgorithmIdentifier find2 = new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder().find(find);
        org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey = org.bouncycastle.crypto.util.PrivateKeyFactory.createKey(privateKey.getEncoded());
        return (java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(new org.bouncycastle.cert.X509v3CertificateBuilder(certMetaData.getIssuer(), new java.math.BigInteger(certMetaData.getSerial()), new java.util.Date(certMetaData.getNotBefore()), new java.util.Date(certMetaData.getNotAfter()), pKCS10CertificationRequest.getSubject(), org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(keyPair.getPublic().getEncoded())).build(new org.bouncycastle.operator.bc.BcRSAContentSignerBuilder(find, find2).build(createKey)).toASN1Structure().getEncoded()));
    }

    public static java.security.cert.X509Certificate signCSR(org.bouncycastle.asn1.x500.X500Name x500Name, com.visa.cbp.encryptionutils.common.CertMetaData certMetaData, java.security.PrivateKey privateKey, byte[] bArr, java.lang.String str) throws java.io.IOException, org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException {
        java.security.Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        org.bouncycastle.asn1.x509.AlgorithmIdentifier find = new org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder().find(str);
        org.bouncycastle.asn1.x509.AlgorithmIdentifier find2 = new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder().find(find);
        org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey = org.bouncycastle.crypto.util.PrivateKeyFactory.createKey(privateKey.getEncoded());
        return (java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(new org.bouncycastle.cert.X509v3CertificateBuilder(certMetaData.getIssuer(), new java.math.BigInteger(certMetaData.getSerial()), new java.util.Date(certMetaData.getNotBefore()), new java.util.Date(certMetaData.getNotAfter()), x500Name, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(bArr)).build(new org.bouncycastle.operator.bc.BcRSAContentSignerBuilder(find, find2).build(createKey)).toASN1Structure().getEncoded()));
    }

    public static com.visa.cbp.encryptionutils.common.DeviceKeyPair generateDeviceKeyPair(java.lang.String str, org.bouncycastle.asn1.x500.X500Name x500Name, com.visa.cbp.encryptionutils.common.CertMetaData certMetaData, java.security.PrivateKey privateKey) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.SignatureException, java.io.IOException, org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException, javax.security.cert.CertificateException {
        java.security.Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048, java.security.SecureRandom.getInstance("SHA1PRNG"));
        java.security.KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        return new com.visa.cbp.encryptionutils.common.DeviceKeyPair(new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(((java.security.interfaces.RSAPrivateCrtKey) generateKeyPair.getPrivate()).getPrivateExponent().toByteArray())), com.visa.cbp.encryptionutils.common.PemConverter.convert(signCSR(generateCSR(generateKeyPair, x500Name), certMetaData, privateKey, generateKeyPair).getEncoded(), org.bouncycastle.openssl.PEMParser.TYPE_CERTIFICATE));
    }

    public static java.lang.String generateDeviceCertificate(org.bouncycastle.asn1.x500.X500Name x500Name, com.visa.cbp.encryptionutils.common.CertMetaData certMetaData, java.security.PrivateKey privateKey, byte[] bArr, java.lang.String str) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.SignatureException, java.io.IOException, org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException, javax.security.cert.CertificateException {
        return com.visa.cbp.encryptionutils.common.PemConverter.convert(signCSR(x500Name, certMetaData, privateKey, bArr, str).getEncoded(), org.bouncycastle.openssl.PEMParser.TYPE_CERTIFICATE);
    }

    public static byte[] readKey(java.io.ByteArrayOutputStream byteArrayOutputStream, boolean z) {
        java.lang.String str = new java.lang.String(byteArrayOutputStream.toByteArray());
        return org.bouncycastle.util.encoders.Base64.decode(z ? str.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "") : str.replace("-----BEGIN RSA PRIVATE KEY-----", "").replace("-----END RSA PRIVATE KEY-----", ""));
    }

    public static final java.lang.String createRSAPKIJwe(java.io.ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, java.lang.String str) throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
        if (byteArrayOutputStream == null || bArr == null || bArr.length == 0) {
            throw new com.visa.cbp.encryptionutils.exceptions.InvalidInputException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_900.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_900.getMessage());
        }
        byte[] generateSalt = generateSalt(12);
        byte[] generateKey = generateKey(32);
        byte[] encryptCEKWithRSAKey = encryptCEKWithRSAKey(byteArrayOutputStream, generateKey);
        if (str == null) {
            str = "";
        }
        java.lang.String buildPKIJWEHeaderBase64String = com.visa.dmpd.token.JWTUtility.buildPKIJWEHeaderBase64String(str);
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.visa.dmpd.encryption.GenericEncryptionUtility.CipherTextData encryptData = com.visa.dmpd.encryption.GenericEncryptionUtility.encryptData(generateKey, generateSalt, bArr, com.visa.dmpd.encryption.GenericEncryptionUtility.bs64Decode(buildPKIJWEHeaderBase64String));
            sb.append(buildPKIJWEHeaderBase64String);
            sb.append(".");
            sb.append(com.visa.dmpd.encryption.GenericEncryptionUtility.bs64Encode(encryptCEKWithRSAKey));
            sb.append(".");
            sb.append(com.visa.dmpd.encryption.GenericEncryptionUtility.bs64Encode(generateSalt));
            sb.append(".");
            sb.append(encryptData.getCipherText());
            sb.append(".");
            sb.append(encryptData.getAuthTag());
            return sb.toString();
        } catch (org.bouncycastle.util.encoders.DecoderException unused) {
            throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getMessage());
        }
    }

    public static final byte[] generateSalt(int i) throws java.security.NoSuchAlgorithmException {
        byte[] bArr = new byte[i];
        new org.bouncycastle.crypto.prng.DigestRandomGenerator(new org.bouncycastle.crypto.digests.SHA512Digest()).nextBytes(bArr);
        return bArr;
    }

    public static final byte[] generateKey(int i) throws java.security.NoSuchAlgorithmException {
        byte[] bArr = new byte[i];
        new org.bouncycastle.crypto.prng.DigestRandomGenerator(new org.bouncycastle.crypto.digests.SHA512Digest()).nextBytes(bArr);
        byte[] encode = org.bouncycastle.util.encoders.Base64.encode(bArr);
        java.lang.System.arraycopy(encode, 0, bArr, 0, i);
        if (encode != null) {
            java.util.Arrays.fill(encode, (byte) 0);
        }
        return bArr;
    }

    public static byte[] encryptCEKWithRSAKey(java.io.ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException {
        java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(readKey(byteArrayOutputStream, true)));
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/NONE/PKCS1Padding");
        cipher.init(1, generatePublic);
        return cipher.doFinal(bArr);
    }

    public static void validateInput(java.lang.String str, java.lang.String str2, com.visa.cbp.encryptionutils.exceptions.ErrorType errorType) {
        validateInput(str, -1, str2, errorType);
    }

    public static void validateInput(java.lang.String str, int i, byte[] bArr, com.visa.cbp.encryptionutils.exceptions.ErrorType errorType) {
        if (errorType != null) {
            if (str == null || str.trim().equalsIgnoreCase("")) {
                throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_900.getCode(), "you must provide a valid name");
            }
            if (bArr == null || bArr.length == 0) {
                throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(errorType.getCode(), errorType.getMessage());
            }
            if (i >= 0 && bArr.length != i) {
                throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(errorType.getCode(), errorType.getMessage());
            }
            return;
        }
        throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_900.getCode(), "you must provide a valid ERROR type");
    }

    public static void validateInput(java.lang.String str, int i, java.lang.String str2, com.visa.cbp.encryptionutils.exceptions.ErrorType errorType) {
        if (errorType != null) {
            if (str == null || str.trim().equalsIgnoreCase("")) {
                throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_900.getCode(), "you must provide a valid name");
            }
            if (str2 == null || str2.trim().equalsIgnoreCase("")) {
                throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(errorType.getCode(), errorType.getMessage());
            }
            if (i > 0 && str2.trim().length() != i) {
                throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(errorType.getCode(), errorType.getMessage());
            }
            return;
        }
        throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_900.getCode(), "you must provide a valid ERROR type");
    }

    public static java.lang.String hashOfSHA256(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        try {
            return hashOfSHA256(str.getBytes("UTF-8"));
        } catch (java.io.UnsupportedEncodingException unused) {
            throw new java.lang.RuntimeException("UnsupportedEncodingException");
        }
    }

    public static java.lang.String hashOfSHA256(byte[] bArr) throws java.security.NoSuchAlgorithmException {
        byte[] sha256 = sha256(bArr);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (byte b : sha256) {
            java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static byte[] sha256(byte[] bArr) throws java.security.NoSuchAlgorithmException {
        return java.security.MessageDigest.getInstance("SHA-256").digest(bArr);
    }

    public static java.io.ByteArrayOutputStream getByteOutputStream(java.lang.Class cls, java.lang.String str) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.InputStream resourceAsStream = cls.getClassLoader().getResourceAsStream(str);
        while (true) {
            int read = resourceAsStream.read();
            if (read == -1) {
                return byteArrayOutputStream;
            }
            byteArrayOutputStream.write(read);
        }
    }

    public static java.io.ByteArrayOutputStream getByteOutputStream(java.io.File file) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        while (true) {
            int read = fileInputStream.read();
            if (read == -1) {
                return byteArrayOutputStream;
            }
            byteArrayOutputStream.write(read);
        }
    }
}
