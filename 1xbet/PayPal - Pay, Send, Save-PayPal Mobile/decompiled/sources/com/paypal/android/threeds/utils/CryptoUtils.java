package com.paypal.android.threeds.utils;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J%\u0010*\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J#\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u0002092\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004¢\u0006\u0004\b=\u00104J\u0015\u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020>2\u0006\u0010A\u001a\u00020\u0004¢\u0006\u0004\bB\u0010@J\u0015\u0010C\u001a\u00020>2\u0006\u0010A\u001a\u00020\u0004¢\u0006\u0004\bC\u0010@"}, d2 = {"Lcom/paypal/android/threeds/utils/CryptoUtils;", "", "<init>", "()V", "", "p0", "Ljava/security/interfaces/RSAPublicKey;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/security/interfaces/RSAPublicKey;)Ljava/lang/String;", "Ljava/security/interfaces/ECPublicKey;", "p2", "(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;)Ljava/lang/String;", "Ljava/security/KeyPair;", "generateEphemeralKeyPair", "()Ljava/security/KeyPair;", "Ljava/security/PublicKey;", "publicKey", "generateSdkEphemeralKey", "(Ljava/security/PublicKey;)Ljava/lang/String;", "ecPublicKey", "Ljava/security/interfaces/ECPrivateKey;", "ecPrivateKey", "sdkReferenceId", "Ljavax/crypto/SecretKey;", "generateECDHSecret", "(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;Ljava/lang/String;)Ljavax/crypto/SecretKey;", "Lcom/paypal/android/threeds/data/model/AcsData;", "acsData", "sdkReferenceNumber", "generateSecretKeyWithAcsData", "(Lcom/paypal/android/threeds/data/model/AcsData;Ljava/lang/String;)Ljavax/crypto/SecretKey;", "Lcom/paypal/android/threeds/security/JwsValidator;", "jwsValidator", "acsSignedContent", "validateAndGetAcsData", "(Lcom/paypal/android/threeds/security/JwsValidator;Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/AcsData;", "Landroid/content/Context;", "context", "directoryServerId", "Lcom/paypal/android/threeds/data/model/DeviceDataModel;", "deviceInformation", "getEncryptedDeviceData", "(Landroid/content/Context;Ljava/lang/String;Lcom/paypal/android/threeds/data/model/DeviceDataModel;)Ljava/lang/String;", "deviceData", "encodedCert", "encrypt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ephemPubkey", "parsePublicKey", "(Ljava/lang/Object;)Ljava/security/interfaces/ECPublicKey;", "getCertificateFileName", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/security/cert/X509Certificate;", "getRootCertificatesFromAsset", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "", "getBrandLogo", "(Ljava/lang/String;)I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "decodeBase64Url", "", "isValidBase64String", "(Ljava/lang/String;)Z", "vale", "isValidBase64URLEncodedString", "isValidBase64URLEncodedStringForAcsHtml"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CryptoUtils {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.utils.CryptoUtils INSTANCE = new com.paypal.android.threeds.utils.CryptoUtils();

    private CryptoUtils() {
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, java.security.interfaces.RSAPublicKey p1) {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Starting JWE RSA encryption", null, null, 6, null);
        try {
            com.nimbusds.jwt.JWTClaimsSet parse = com.nimbusds.jwt.JWTClaimsSet.parse(p0);
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JWT claims set parsed successfully", null, null, 6, null);
            com.nimbusds.jwt.EncryptedJWT encryptedJWT = new com.nimbusds.jwt.EncryptedJWT(new com.nimbusds.jose.JWEHeader(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_256, com.nimbusds.jose.EncryptionMethod.A128CBC_HS256), parse);
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Encrypted JWT created with RSA_OAEP_256 and A128CBC_HS256", null, null, 6, null);
            encryptedJWT.encrypt(new com.nimbusds.jose.crypto.RSAEncrypter(p1));
            java.lang.String serialize = encryptedJWT.serialize();
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JWE RSA encryption completed successfully", null, null, 6, null);
            return serialize;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JWE RSA encryption failed: ".concat(java.lang.String.valueOf(e.getMessage())), null, null, e, 6, null);
            return null;
        }
    }

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.security.interfaces.ECPublicKey eCPublicKey) {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Starting JWE ECDH encryption", null, null, 6, null);
        try {
            java.security.KeyPair generateEphemeralKeyPair = generateEphemeralKeyPair();
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Ephemeral key pair generated", null, null, 6, null);
            java.security.PrivateKey privateKey = generateEphemeralKeyPair.getPrivate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(privateKey, "");
            javax.crypto.SecretKey generateECDHSecret = generateECDHSecret(eCPublicKey, (java.security.interfaces.ECPrivateKey) privateKey, com.paypal.android.threeds.utils.ThreeDsSdkUtils.SDK_REFERENCE_NUMBER);
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "ECDH secret key generated", null, null, 6, null);
            com.nimbusds.jose.jwk.Curve curve = com.nimbusds.jose.jwk.Curve.P_256;
            java.security.PublicKey publicKey = generateEphemeralKeyPair.getPublic();
            kotlin.jvm.internal.Intrinsics.checkNotNull(publicKey, "");
            com.nimbusds.jose.jwk.ECKey build = new com.nimbusds.jose.jwk.ECKey.Builder(curve, (java.security.interfaces.ECPublicKey) publicKey).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JWK created from ephemeral public key", null, null, 6, null);
            com.nimbusds.jose.JWEHeader build2 = new com.nimbusds.jose.JWEHeader.Builder(com.nimbusds.jose.JWEAlgorithm.DIR, com.nimbusds.jose.EncryptionMethod.A128CBC_HS256).ephemeralPublicKey(com.nimbusds.jose.jwk.ECKey.parse(build.toJSONString())).build();
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JWE header created with DIR algorithm", null, null, 6, null);
            com.nimbusds.jose.JWEObject jWEObject = new com.nimbusds.jose.JWEObject(build2, new com.nimbusds.jose.Payload(str));
            jWEObject.encrypt(new com.nimbusds.jose.crypto.DirectEncrypter(generateECDHSecret));
            java.lang.String serialize = jWEObject.serialize();
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JWE ECDH encryption completed successfully", null, null, 6, null);
            return serialize;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JWE ECDH encryption failed", null, null, e, 6, null);
            return null;
        }
    }

    public final java.security.KeyPair generateEphemeralKeyPair() throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.jce.provider.BouncyCastleProvider bouncyCastleProvider = new org.bouncycastle.jce.provider.BouncyCastleProvider();
        java.security.spec.ECGenParameterSpec eCGenParameterSpec = new java.security.spec.ECGenParameterSpec(org.jose4j.keys.EllipticCurves.P_256);
        java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("ECDH", bouncyCastleProvider);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keyPairGenerator, "");
        keyPairGenerator.initialize(eCGenParameterSpec, new java.security.SecureRandom());
        java.security.KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generateKeyPair, "");
        return generateKeyPair;
    }

    public final javax.crypto.SecretKey generateECDHSecret(java.security.interfaces.ECPublicKey ecPublicKey, java.security.interfaces.ECPrivateKey ecPrivateKey, java.lang.String sdkReferenceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ecPublicKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ecPrivateKey, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Generating ECDH shared secret with SDK reference: ".concat(java.lang.String.valueOf(sdkReferenceId)), null, null, 6, null);
        try {
            javax.crypto.SecretKey deriveSharedSecret = com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(ecPublicKey, ecPrivateKey, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deriveSharedSecret, "");
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Initial shared secret derived", null, null, 6, null);
            javax.crypto.SecretKey deriveKey = new com.nimbusds.jose.crypto.impl.ConcatKDF("SHA-256").deriveKey(deriveSharedSecret, 256, com.nimbusds.jose.crypto.impl.ConcatKDF.encodeStringData(null), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeDataWithLength((com.nimbusds.jose.util.Base64URL) null), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeDataWithLength(com.nimbusds.jose.util.Base64URL.encode(sdkReferenceId)), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeIntData(256), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeNoData());
            kotlin.jvm.internal.Intrinsics.checkNotNull(deriveKey);
            return deriveKey;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Failed to generate ECDH secret", null, null, e, 6, null);
            throw new java.lang.RuntimeException();
        }
    }

    public final javax.crypto.SecretKey generateSecretKeyWithAcsData(com.paypal.android.threeds.data.model.AcsData acsData, java.lang.String sdkReferenceNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkReferenceNumber, "");
        java.security.PrivateKey privateKey = com.paypal.android.threeds.transaction.ThreeDsTransactionSession.INSTANCE.getEphemeralKeyPair().getPrivate();
        java.security.interfaces.ECPublicKey acsEphemPubKey = acsData.getAcsEphemPubKey();
        kotlin.jvm.internal.Intrinsics.checkNotNull(privateKey, "");
        return generateECDHSecret(acsEphemPubKey, (java.security.interfaces.ECPrivateKey) privateKey, sdkReferenceNumber);
    }

    public final com.paypal.android.threeds.data.model.AcsData validateAndGetAcsData(com.paypal.android.threeds.security.JwsValidator jwsValidator, java.lang.String acsSignedContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwsValidator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsSignedContent, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Validating and extracting ACS data from signed content", null, null, 6, null);
        try {
            org.json.JSONObject jwsValidateSignatureAndReturnAcsPayload = jwsValidator.jwsValidateSignatureAndReturnAcsPayload(acsSignedContent, com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getRootCertificates());
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JWS signature validated successfully", null, null, 6, null);
            return new com.paypal.android.threeds.data.model.AcsData(jwsValidateSignatureAndReturnAcsPayload.get(com.paypal.android.threeds.utils.ConstantUtil.FIELD_ACS_URL).toString(), parsePublicKey(jwsValidateSignatureAndReturnAcsPayload.get(com.paypal.android.threeds.utils.ConstantUtil.FIELD_ACS_EPHEM_PUB_KEY)), parsePublicKey(jwsValidateSignatureAndReturnAcsPayload.get(com.paypal.android.threeds.utils.ConstantUtil.FIELD_SDK_EPHEM_PUB_KEY)));
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Failed to validate and get ACS data", null, null, e, 6, null);
            java.lang.String message = e.getMessage();
            kotlin.jvm.internal.Intrinsics.checkNotNull(message);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(message, null, null, 6, null);
        }
    }

    public final java.lang.String getEncryptedDeviceData(android.content.Context context, java.lang.String directoryServerId, com.paypal.android.threeds.data.model.DeviceDataModel deviceInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directoryServerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInformation, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Starting device data encryption for directory server: ".concat(java.lang.String.valueOf(directoryServerId)), null, null, 6, null);
        java.lang.String certificateFileName = getCertificateFileName(directoryServerId);
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Certificate file name: ".concat(java.lang.String.valueOf(certificateFileName)), null, null, 6, null);
        java.lang.String readTextFromAsset = com.paypal.android.threeds.extension.ExtensionFunctionsKt.readTextFromAsset(context, certificateFileName);
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Certificate loaded from assets", null, null, 6, null);
        java.lang.String json = new com.google.gson.Gson().toJson(deviceInformation);
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Device data serialized to JSON", null, null, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(json);
        java.lang.String encrypt = encrypt(json, readTextFromAsset, directoryServerId);
        if (encrypt != null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Device data encrypted successfully", null, null, 6, null);
            return encrypt;
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Device data encryption returned null", null, null, new com.paypal.android.threeds.exceptions.SDKRuntimeException("Encryption returned null", null, null, 6, null), 6, null);
        throw new com.paypal.android.threeds.exceptions.SDKRuntimeException("Device Data Encryption Failed", null, null, 6, null);
    }

    public final java.lang.String encrypt(java.lang.String deviceData, java.lang.String encodedCert, java.lang.String directoryServerId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedCert, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directoryServerId, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Starting encryption process for directory server: ".concat(java.lang.String.valueOf(directoryServerId)), null, null, 6, null);
        java.security.cert.X509Certificate parse = com.nimbusds.jose.util.X509CertUtils.parse(encodedCert);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "X509 certificate parsed successfully", null, null, 6, null);
        java.security.PublicKey publicKey = parse.getPublicKey();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publicKey, "");
        if (publicKey instanceof java.security.interfaces.RSAPublicKey) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Using RSA encryption", null, null, 6, null);
            return getHighResolutionOutputSizeshNQ4ISI(deviceData, (java.security.interfaces.RSAPublicKey) publicKey);
        }
        if (publicKey instanceof java.security.interfaces.ECPublicKey) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Using ECDH encryption", null, null, 6, null);
            return getHighResolutionOutputSizeshNQ4ISI(deviceData, (java.security.interfaces.ECPublicKey) publicKey);
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Unsupported public key type: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(publicKey.getClass()).getSimpleName())), null, null, null, 14, null);
        return null;
    }

    public final java.security.interfaces.ECPublicKey parsePublicKey(java.lang.Object ephemPubkey) {
        com.nimbusds.jose.jwk.ECKey parse;
        if (ephemPubkey instanceof java.util.Map) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(ephemPubkey, "");
            parse = com.nimbusds.jose.jwk.ECKey.parse((java.util.Map<java.lang.String, java.lang.Object>) ephemPubkey);
        } else {
            java.lang.String obj = ephemPubkey != null ? ephemPubkey.toString() : null;
            if (obj == null) {
                obj = "";
            }
            parse = com.nimbusds.jose.jwk.ECKey.parse(obj);
        }
        java.security.interfaces.ECPublicKey eCPublicKey = parse.toECPublicKey();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eCPublicKey, "");
        return eCPublicKey;
    }

    public final java.lang.String getCertificateFileName(java.lang.String directoryServerId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directoryServerId, "");
        return com.paypal.android.threeds.security.DirectoryServer.INSTANCE.lookup(directoryServerId).getPublicKeyFile().get(0);
    }

    public final java.util.List<java.security.cert.X509Certificate> getRootCertificatesFromAsset(android.content.Context context, java.lang.String directoryServerId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directoryServerId, "");
        com.paypal.android.threeds.init.ConfigurationParams configParams = com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getConfigParams();
        if ((configParams != null ? configParams.getCamera2StreamConfigurationMap() : null) == com.paypal.android.threeds.init.ThreeEnvironment.STAGING) {
            directoryServerId = "PaypalStage";
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Loading root certificates from assets for directory server: ".concat(java.lang.String.valueOf(directoryServerId)), null, null, 6, null);
        com.paypal.android.threeds.security.DirectoryServer lookup = com.paypal.android.threeds.security.DirectoryServer.INSTANCE.lookup(directoryServerId);
        java.lang.String readTextFromAsset = com.paypal.android.threeds.extension.ExtensionFunctionsKt.readTextFromAsset(context, lookup.getPublicKeyFile().get(kotlin.collections.CollectionsKt.getLastIndex(lookup.getPublicKeyFile())));
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Root certificate content loaded from assets", null, null, 6, null);
        java.security.cert.X509Certificate parse = com.nimbusds.jose.util.X509CertUtils.parse(readTextFromAsset);
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Root certificate parsed successfully", null, null, 6, null);
        if (parse != null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Root certificate available", null, null, 6, null);
            return kotlin.collections.CollectionsKt.listOf(parse);
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public final int getBrandLogo(java.lang.String directoryServerId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directoryServerId, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Getting brand logo for directory server: ".concat(java.lang.String.valueOf(directoryServerId)), null, null, 6, null);
        return com.paypal.android.threeds.security.DirectoryServer.INSTANCE.lookup(directoryServerId).getLogo();
    }

    public final java.lang.String decodeBase64Url(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        byte[] decode = android.util.Base64.decode(value, 9);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
        return new java.lang.String(decode, kotlin.text.Charsets.UTF_8);
    }

    public final boolean isValidBase64String(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)?$");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "");
        java.util.regex.Matcher matcher = compile.matcher(value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "");
        return matcher.find();
    }

    public final boolean isValidBase64URLEncodedString(java.lang.String vale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vale, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Validating Base64 URL encoded string format", null, null, 6, null);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^([0-9a-zA-Z_-])*$");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "");
        java.util.regex.Matcher matcher = compile.matcher(vale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "");
        return matcher.find();
    }

    public final boolean isValidBase64URLEncodedStringForAcsHtml(java.lang.String vale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vale, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Validating Base64 URL encoded string format for ACS HTML", null, null, 6, null);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^([0-9a-zA-Z=_-])*$");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "");
        java.util.regex.Matcher matcher = compile.matcher(vale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "");
        return matcher.find();
    }

    public final java.lang.String generateSdkEphemeralKey(java.security.PublicKey publicKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicKey, "");
        com.nimbusds.jose.jwk.Curve curve = com.nimbusds.jose.jwk.Curve.P_256;
        kotlin.jvm.internal.Intrinsics.checkNotNull(publicKey, "");
        com.nimbusds.jose.jwk.ECKey publicJWK = new com.nimbusds.jose.jwk.ECKey.Builder(curve, (java.security.interfaces.ECPublicKey) publicKey).build().toPublicJWK();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publicJWK, "");
        java.lang.String jSONString = publicJWK.toJSONString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONString, "");
        return jSONString;
    }
}
