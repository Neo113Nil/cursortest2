package com.paypal.android.threeds.security;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/android/threeds/security/JwsValidator;", "", "<init>", "()V", "", "jws", "", "Ljava/security/cert/X509Certificate;", "rootCertificates", "Lorg/json/JSONObject;", "jwsValidateSignatureAndReturnAcsPayload", "(Ljava/lang/String;Ljava/util/List;)Lorg/json/JSONObject;", "Lcom/nimbusds/jose/util/Base64;", "encodedChainCerts", "rootCerts", "", "isCertificateChainValid", "(Ljava/util/List;Ljava/util/List;)Z", "validateChain", "Ljava/security/KeyStore;", "createKeyStore", "(Ljava/util/List;)Ljava/security/KeyStore;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class JwsValidator {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor = "JWS parsing failed";

    public final org.json.JSONObject jwsValidateSignatureAndReturnAcsPayload(java.lang.String jws, java.util.List<? extends java.security.cert.X509Certificate> rootCertificates) {
        com.nimbusds.jose.crypto.ECDSAVerifier eCDSAVerifier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootCertificates, "");
        try {
            com.nimbusds.jose.JWSObject parse = com.nimbusds.jose.JWSObject.parse(jws);
            kotlin.jvm.internal.Intrinsics.checkNotNull(parse);
            com.nimbusds.jose.JWSAlgorithm algorithm = parse.getHeader().getAlgorithm();
            if (isCertificateChainValid(parse.getHeader().getX509CertChain(), rootCertificates)) {
                com.nimbusds.jose.JWSHeader header = parse.getHeader();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(header, "");
                java.util.List x509CertChain = header.getX509CertChain();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(x509CertChain, "");
                java.security.PublicKey publicKey = com.nimbusds.jose.util.X509CertUtils.parse(((com.nimbusds.jose.util.Base64) kotlin.collections.CollectionsKt.first(x509CertChain)).decode()).getPublicKey();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publicKey, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(algorithm, com.nimbusds.jose.JWSAlgorithm.PS256)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(publicKey, "");
                    eCDSAVerifier = new com.nimbusds.jose.crypto.RSASSAVerifier((java.security.interfaces.RSAPublicKey) publicKey);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(algorithm, com.nimbusds.jose.JWSAlgorithm.ES256)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(publicKey, "");
                    eCDSAVerifier = new com.nimbusds.jose.crypto.ECDSAVerifier((java.security.interfaces.ECPublicKey) publicKey);
                } else {
                    com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Invalid JWS Algorithm: ".concat(java.lang.String.valueOf(algorithm)), null, null, 6, null);
                    throw new com.paypal.android.threeds.exceptions.SDKRuntimeException("Invalid JWS Algorithm", null, null, 6, null);
                }
                if (!parse.verify(eCDSAVerifier)) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JWS signature verification failed", null, null, 6, null);
                    throw new com.paypal.android.threeds.exceptions.SDKRuntimeException("JWS validation failed.", null, null, 6, null);
                }
                return new org.json.JSONObject(parse.getPayload().toString());
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "CertificateChain Validation failed", null, null, 6, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException("CertificateChain Validation failed.", null, null, 6, null);
        } catch (java.text.ParseException e) {
            com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Parse exception";
            }
            com.paypal.android.logger.Logger.i$default(logger, str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exception", message)), null, 4, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(this.getHighSpeedVideoFpsRangesFor, null, null, 6, null);
        }
    }

    public final boolean isCertificateChainValid(java.util.List<? extends com.nimbusds.jose.util.Base64> encodedChainCerts, java.util.List<? extends java.security.cert.X509Certificate> rootCerts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootCerts, "");
        java.util.List<? extends com.nimbusds.jose.util.Base64> list = encodedChainCerts;
        if (list == null || list.isEmpty()) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JWSHeader's X.509 certificate chain is null or empty", null, null, 6, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException("JWSHeader's X.509 certificate chain is null or empty", null, null, 6, null);
        }
        if (rootCerts.isEmpty()) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Root certificates are empty", null, null, 6, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException("Root certificates are empty", null, null, 6, null);
        }
        return validateChain(encodedChainCerts, rootCerts);
    }

    public final boolean validateChain(java.util.List<? extends com.nimbusds.jose.util.Base64> encodedChainCerts, java.util.List<? extends java.security.cert.X509Certificate> rootCerts) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedChainCerts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootCerts, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.android.threeds.security.JwsValidator jwsValidator = this;
            java.util.List<java.security.cert.X509Certificate> parse = com.nimbusds.jose.util.X509CertChainUtils.parse((java.util.List<com.nimbusds.jose.util.Base64>) encodedChainCerts);
            java.security.KeyStore createKeyStore = createKeyStore(rootCerts);
            java.security.cert.X509CertSelector x509CertSelector = new java.security.cert.X509CertSelector();
            x509CertSelector.setCertificate(parse.get(0));
            java.security.cert.PKIXBuilderParameters pKIXBuilderParameters = new java.security.cert.PKIXBuilderParameters(createKeyStore, x509CertSelector);
            pKIXBuilderParameters.setRevocationEnabled(false);
            pKIXBuilderParameters.addCertStore(java.security.cert.CertStore.getInstance("Collection", new java.security.cert.CollectionCertStoreParameters(parse)));
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.security.cert.CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return kotlin.Result.m23442isSuccessimpl(m23436constructorimpl);
    }

    public final java.security.KeyStore createKeyStore(java.util.List<? extends java.security.cert.X509Certificate> rootCerts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootCerts, "");
        java.security.KeyStore keyStore = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
        keyStore.load(null, null);
        int i = 0;
        for (java.lang.Object obj : rootCerts) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "ca_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            keyStore.setCertificateEntry(format, rootCerts.get(i));
            i++;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(keyStore);
        return keyStore;
    }
}
