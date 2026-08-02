package com.paypal.oslo.feature.identity.foundation.security;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0013J#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d0\f2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecureKeyWrapper;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthKeyOperations;", "Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "base64Encoder", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;)V", "Landroid/content/Context;", "context", "", "keyName", "", "userAuthRequired", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "generateEncodedPublicKey", "(Landroid/content/Context;Ljava/lang/String;Z)Larrow/core/Either;", "keyAlias", "Ljava/security/Signature;", "generateSignature", "(Ljava/lang/String;)Larrow/core/Either;", "signature", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "signDataAndBase64Encode", "(Ljava/security/Signature;Ljava/lang/String;)Larrow/core/Either;", "publicKey", "", "verifySignature", "(Ljava/lang/String;[BLjava/lang/String;)Larrow/core/Either;", "keyExists", "", "deleteKey", "base64AndUrlSafeEncodedStringFromBytes", "([B)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthSecureKeyWrapper implements com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.Base64Encoder getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AuthSecureKeyWrapper(com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64Encoder, "");
        this.getHighResolutionOutputSizeshNQ4ISI = base64Encoder;
    }

    @Override // com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations
    public final java.lang.String base64AndUrlSafeEncodedStringFromBytes(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.encodeUrlSafe(data);
    }

    @Override // com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations
    public final arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.String> generateEncodedPublicKey(android.content.Context context, java.lang.String keyName, boolean userAuthRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyName, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (context != null) {
                if (!kotlin.text.StringsKt.isBlank(keyName)) {
                    try {
                        java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                        android.security.keystore.KeyGenParameterSpec.Builder userAuthenticationRequired = new android.security.keystore.KeyGenParameterSpec.Builder(keyName, 12).setDigests("SHA-256").setAlgorithmParameterSpec(new java.security.spec.ECGenParameterSpec("secp256r1")).setUserAuthenticationRequired(userAuthRequired);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(userAuthenticationRequired, "");
                        if (userAuthRequired) {
                            userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(-1);
                        }
                        android.security.keystore.KeyGenParameterSpec build = userAuthenticationRequired.build();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                        keyPairGenerator.initialize(build);
                        java.security.PublicKey publicKey = keyPairGenerator.generateKeyPair().getPublic();
                        com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder = this.getHighResolutionOutputSizeshNQ4ISI;
                        byte[] encoded = publicKey.getEncoded();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encoded, "");
                        java.lang.String encodeStandard = base64Encoder.encodeStandard(encoded);
                        defaultRaise.complete();
                        return new arrow.core.Either.Right(encodeStandard);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Exception in generateEncodedPublicKey", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("keyName", keyName)), null, nonFatalOrThrow, 4, null);
                        defaultRaise2.raise(new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed("Key generation failed", nonFatalOrThrow));
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
                defaultRaise2.raise(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.BlankKeyAlias.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise2.raise(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.NullContext.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th2) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }

    @Override // com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations
    public final arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.security.Signature> generateSignature(java.lang.String keyAlias) {
        com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError deviceCompatibilityError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyAlias, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (!kotlin.text.StringsKt.isBlank(keyAlias)) {
                try {
                    java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    java.security.Key key = keyStore.getKey(keyAlias, null);
                    if (key == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Key not found in generateSignature", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("keyAlias", keyAlias)), null, null, 12, null);
                        defaultRaise2.raise(new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed("Key not found in KeyStore", null));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(key, "");
                    java.security.Signature signature = java.security.Signature.getInstance("SHA256withECDSA");
                    signature.initSign((java.security.PrivateKey) key);
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(signature);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    if (nonFatalOrThrow instanceof java.security.InvalidKeyException) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Device compatibility issue detected in generateSignature", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("keyAlias", keyAlias)), null, nonFatalOrThrow, 4, null);
                        deviceCompatibilityError = new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError("Device compatibility issue with key", nonFatalOrThrow);
                    } else {
                        java.lang.String message = nonFatalOrThrow.getMessage();
                        if (message != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "User authentication required", false, 2, (java.lang.Object) null)) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "UserNotAuthenticatedException in generateSignature", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("keyAlias", keyAlias)), null, nonFatalOrThrow, 4, null);
                            deviceCompatibilityError = com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.UserAuthenticationRequired.INSTANCE;
                        } else {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Exception in generateSignature", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("keyAlias", keyAlias)), null, nonFatalOrThrow, 4, null);
                            deviceCompatibilityError = new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed("Signature operation failed", nonFatalOrThrow);
                        }
                    }
                    defaultRaise2.raise(deviceCompatibilityError);
                    throw new kotlin.KotlinNothingValueException();
                }
            }
            defaultRaise2.raise(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.BlankKeyAlias.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th2) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }

    @Override // com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations
    public final arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.String> signDataAndBase64Encode(java.security.Signature signature, java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (signature != null) {
                if (!kotlin.text.StringsKt.isBlank(data)) {
                    try {
                        byte[] bytes = data.getBytes(kotlin.text.Charsets.UTF_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                        signature.update(bytes);
                        byte[] sign = signature.sign();
                        com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder = this.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(sign);
                        java.lang.String encodeUrlSafe = base64Encoder.encodeUrlSafe(sign);
                        defaultRaise.complete();
                        return new arrow.core.Either.Right(encodeUrlSafe);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Exception in signDataAndBase64Encode", kotlin.collections.MapsKt.emptyMap(), null, nonFatalOrThrow, 4, null);
                        defaultRaise2.raise(new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed("Signature operation failed during encoding", nonFatalOrThrow));
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
                defaultRaise2.raise(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.EmptyData.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise2.raise(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.NullSignature.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th2) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }

    @Override // com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations
    public final arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.Boolean> verifySignature(java.lang.String publicKey, byte[] data, java.lang.String signature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "");
        boolean z = false;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (!kotlin.text.StringsKt.isBlank(publicKey)) {
                if (!kotlin.text.StringsKt.isBlank(signature)) {
                    try {
                        java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance("EC").generatePublic(new java.security.spec.X509EncodedKeySpec(this.getHighResolutionOutputSizeshNQ4ISI.decodeUrlSafe(publicKey)));
                        byte[] decodeUrlSafe = this.getHighResolutionOutputSizeshNQ4ISI.decodeUrlSafe(signature);
                        java.security.Signature signature2 = java.security.Signature.getInstance("SHA256withECDSA");
                        signature2.initVerify(generatePublic);
                        signature2.update(data);
                        z = signature2.verify(decodeUrlSafe);
                    } catch (java.lang.Throwable th) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Exception in verifySignature", kotlin.collections.MapsKt.emptyMap(), null, arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th), 4, null);
                    }
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(java.lang.Boolean.valueOf(z));
                }
                defaultRaise2.raise(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.EmptyData.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise2.raise(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.BlankKeyAlias.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th2) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }

    @Override // com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations
    public final arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.Boolean> keyExists(java.lang.String keyAlias) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyAlias, "");
        boolean z = false;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (!kotlin.text.StringsKt.isBlank(keyAlias)) {
                try {
                    java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    z = keyStore.containsAlias(keyAlias);
                } catch (java.lang.Throwable th) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Exception while checking key existence", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("keyAlias", keyAlias)), null, arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th), 4, null);
                }
                defaultRaise.complete();
                return new arrow.core.Either.Right(java.lang.Boolean.valueOf(z));
            }
            defaultRaise2.raise(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.BlankKeyAlias.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th2) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }

    @Override // com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations
    public final arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, kotlin.Unit> deleteKey(java.lang.String keyAlias) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyAlias, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (!kotlin.text.StringsKt.isBlank(keyAlias)) {
                try {
                    java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    keyStore.deleteEntry(keyAlias);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    com.paypal.oslo.feature.identity.LoggerKt.log.e("Exception while deleting key", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("keyAlias", keyAlias)), arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th));
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                defaultRaise.complete();
                return new arrow.core.Either.Right(unit3);
            }
            defaultRaise2.raise(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.BlankKeyAlias.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th2) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }
}
