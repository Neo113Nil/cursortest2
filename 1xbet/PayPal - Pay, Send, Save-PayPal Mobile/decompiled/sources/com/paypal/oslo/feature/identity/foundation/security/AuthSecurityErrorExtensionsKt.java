package com.paypal.oslo.feature.identity.foundation.security;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\"\u0017\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "", "keyType", "toErrorMessageWithLogging", "(Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;Ljava/lang/String;)Ljava/lang/String;", "toErrorMessage", "", "getRootCause", "(Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;)Ljava/lang/Throwable;", "rootCause"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthSecurityErrorExtensionsKt {
    public static final java.lang.String toErrorMessageWithLogging(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError authSecurityError, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authSecurityError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed) {
            com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed keyGenerationFailed = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed) authSecurityError;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to generate ".concat(java.lang.String.valueOf(str)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", keyGenerationFailed.getReason())), null, keyGenerationFailed.getCause(), 4, null);
            java.lang.String reason = keyGenerationFailed.getReason();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to generate ");
            sb.append(str);
            sb.append(": ");
            sb.append(reason);
            return sb.toString();
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed) {
            com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed signatureOperationFailed = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed) authSecurityError;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Signature operation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", signatureOperationFailed.getReason())), null, signatureOperationFailed.getCause(), 4, null);
            return "Signature operation failed: ".concat(java.lang.String.valueOf(signatureOperationFailed.getReason()));
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed) {
            com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed keyStoreOperationFailed = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed) authSecurityError;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "KeyStore operation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", keyStoreOperationFailed.getReason())), null, keyStoreOperationFailed.getCause(), 4, null);
            return "KeyStore operation failed: ".concat(java.lang.String.valueOf(keyStoreOperationFailed.getReason()));
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError) {
            com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError deviceCompatibilityError = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError) authSecurityError;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Device compatibility issue", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", deviceCompatibilityError.getReason())), null, deviceCompatibilityError.getCause(), 4, null);
            return "Device compatibility issue: ".concat(java.lang.String.valueOf(deviceCompatibilityError.getReason()));
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Validation error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(authSecurityError.getClass()).getSimpleName())), null, null, 12, null);
            return "Validation error: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(authSecurityError.getClass()).getSimpleName()));
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.UserAuthenticationRequired) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "User authentication required", null, null, null, 14, null);
            return "User authentication required";
        }
        if (!(authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
        com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown unknown = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown) authSecurityError;
        java.lang.Throwable cause = unknown.getCause();
        java.lang.String message = unknown.getMessage();
        if (message == null) {
            message = "No message";
        }
        com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", message)), null, cause, 4, null);
        java.lang.String message2 = unknown.getMessage();
        return "Unknown error: ".concat(java.lang.String.valueOf(message2 != null ? message2 : "No message"));
    }

    public static final java.lang.Throwable getRootCause(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError authSecurityError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authSecurityError, "");
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed) {
            return ((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed) authSecurityError).getCause();
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed) {
            return ((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed) authSecurityError).getCause();
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed) {
            return ((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed) authSecurityError).getCause();
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError) {
            return ((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError) authSecurityError).getCause();
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown) {
            return ((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown) authSecurityError).getCause();
        }
        return null;
    }

    public static final java.lang.String toErrorMessage(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError authSecurityError, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authSecurityError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed) {
            java.lang.String reason = ((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed) authSecurityError).getReason();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to generate ");
            sb.append(str);
            sb.append(": ");
            sb.append(reason);
            return sb.toString();
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed) {
            return "Signature operation failed: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed) authSecurityError).getReason()));
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed) {
            return "KeyStore operation failed: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed) authSecurityError).getReason()));
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError) {
            return "Device compatibility issue: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError) authSecurityError).getReason()));
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError) {
            return "Validation error: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(authSecurityError.getClass()).getSimpleName()));
        }
        if (authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.UserAuthenticationRequired) {
            return "User authentication required";
        }
        if (!(authSecurityError instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String message = ((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown) authSecurityError).getMessage();
        if (message == null) {
            message = "No message";
        }
        return "Unknown error: ".concat(java.lang.String.valueOf(message));
    }
}
