package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJK\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b#\u0010\"J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010&J\u0019\u0010\u0019\u001a\u0004\u0018\u00010'2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010("}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecIntermediateResultBuilder;", "", "<init>", "()V", "", "faceScanBase64", "auditTrailBase64", "sessionId", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "entityId", "deviceCaptureDataJson", "", "isStage", "buildIntermediatePayload", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "Lorg/json/JSONObject;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;", "plaintext", "seed", "aesGcmEncrypt$verification_capture_prodRelease", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calculateSHA256$verification_capture_prodRelease", "([B)Ljava/lang/String;", "calculateMD5$verification_capture_prodRelease", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "encryptDocString$verification_capture_prodRelease", "(Ljava/lang/String;Z)Ljava/lang/String;", "Ljava/security/PublicKey;", "(Z)Ljava/security/PublicKey;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FaceTecIntermediateResultBuilder {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder INSTANCE = new com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder();

    private FaceTecIntermediateResultBuilder() {
    }

    public final java.lang.String buildIntermediatePayload(java.lang.String faceScanBase64, java.lang.String auditTrailBase64, java.lang.String sessionId, java.lang.String flowName, java.lang.String entityId, java.lang.String deviceCaptureDataJson, boolean isStage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceScanBase64, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entityId, "");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, flowName);
            jSONObject2.put("context", jSONObject3);
            jSONArray.put(getHighResolutionOutputSizeshNQ4ISI(faceScanBase64, "face_map", sessionId, entityId, deviceCaptureDataJson, null, isStage));
            java.lang.String str = auditTrailBase64;
            if (str != null && str.length() != 0) {
                jSONArray.put(getHighResolutionOutputSizeshNQ4ISI(auditTrailBase64, "high_quality_image", sessionId, entityId, deviceCaptureDataJson, "high_quality_image", isStage));
            }
            jSONObject.put("action", "facetec_pending_result");
            jSONObject2.put("idCaptureResults", jSONArray);
            jSONObject2.put(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, "file");
            jSONObject.put("result", jSONObject2);
            java.lang.String jSONObject4 = jSONObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject4, "");
            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(jSONObject4, "\\", "\\\\", false, 4, (java.lang.Object) null), "\"", "\\\"", false, 4, (java.lang.Object) null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
            sb.append(replace$default);
            sb.append("\"");
            return sb.toString();
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            com.paypal.android.logger.Logger.e$default(logger, "Failed to build intermediate FaceTec payload", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
            return "\"Json exception\"";
        }
    }

    private final org.json.JSONObject getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, boolean p6) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("docContext", p0);
        jSONObject.put("referenceId", p1);
        jSONObject.put("isManual", false);
        jSONObject.put("sessionId", p2);
        jSONObject.put("metadata", getHighSpeedVideoFpsRanges(p0, p3, p1, p4, p5, p6));
        return jSONObject;
    }

    private final org.json.JSONObject getHighSpeedVideoFpsRanges(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5) {
        java.lang.String str;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, p2, null, null, 6, null);
        try {
            byte[] decode = android.util.Base64.decode(p0, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(decode);
            java.lang.String calculateMD5$verification_capture_prodRelease = calculateMD5$verification_capture_prodRelease(decode);
            jSONObject.put("md5", calculateMD5$verification_capture_prodRelease);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(p1);
            sb.append("#");
            sb.append(calculateMD5$verification_capture_prodRelease);
            jSONObject.put("checksum", encryptDocString$verification_capture_prodRelease(sb.toString(), p5));
            jSONObject.put("side", "FIRST_PAGE");
            if (p4 == null) {
                jSONObject.put("associationType", "main");
                jSONObject.put("associatedRefId", "");
            } else {
                jSONObject.put("associationType", "associated");
                jSONObject.put("associatedRefId", p4);
            }
            try {
                str = com.facetec.sdk.FaceTecSDK.version();
            } catch (java.lang.Exception unused) {
                str = "9.7.108";
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Native");
            jSONObject2.put("version", str);
            jSONObject.put("sdkInfo", jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Android");
            jSONObject3.put("manufacturer", android.os.Build.MANUFACTURER);
            jSONObject3.put("model", android.os.Build.MODEL);
            jSONObject.put("deviceInfo", jSONObject3);
            if (p3 != null) {
                try {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject(p3);
                    java.lang.String optString = jSONObject4.optString("captureDataSha256");
                    jSONObject4.remove("captureDataSha256");
                    kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
                    if (optString.length() > 0) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(p1);
                        sb2.append("#");
                        sb2.append(calculateMD5$verification_capture_prodRelease);
                        sb2.append("#");
                        sb2.append(optString);
                        jSONObject4.put("checksum", encryptDocString$verification_capture_prodRelease(sb2.toString(), p5));
                    }
                    jSONObject.put("captureData", jSONObject4);
                } catch (java.lang.Exception e) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                    java.lang.String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown";
                    }
                    com.paypal.android.logger.Logger.w$default(logger, "Failed to parse device capture data JSON", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, 4, null);
                }
            }
        } catch (java.lang.Exception e2) {
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message2 = e2.getMessage();
            com.paypal.android.logger.Logger.w$default(logger2, "Failed to build metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message2 != null ? message2 : "Unknown")), null, 4, null);
        }
        return jSONObject;
    }

    public final java.lang.String aesGcmEncrypt$verification_capture_prodRelease(java.lang.String plaintext, java.lang.String seed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plaintext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seed, "");
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            byte[] bytes = seed.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(messageDigest.digest(bytes), org.jose4j.keys.AesKey.ALGORITHM);
            byte[] bArr = new byte[12];
            new java.security.SecureRandom().nextBytes(bArr);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME);
            cipher.init(1, secretKeySpec, new javax.crypto.spec.GCMParameterSpec(128, bArr));
            byte[] bytes2 = plaintext.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
            byte[] doFinal = cipher.doFinal(bytes2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(doFinal);
            java.lang.String encodeToString = android.util.Base64.encodeToString(kotlin.collections.ArraysKt.plus(bArr, doFinal), 2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(encodeToString);
            return encodeToString;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            com.paypal.android.logger.Logger.e$default(logger, "AES-GCM encryption failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
            return "";
        }
    }

    public final java.lang.String calculateSHA256$verification_capture_prodRelease(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        byte[] digest = java.security.MessageDigest.getInstance("SHA-256").digest(data);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "");
        return kotlin.collections.ArraysKt.joinToString$default(digest, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder.$r8$lambda$xGeXlvtZabcR7qoQS_rV0FQqLg0(((java.lang.Byte) obj).byteValue());
            }
        }, 30, (java.lang.Object) null);
    }

    public final java.lang.String calculateMD5$verification_capture_prodRelease(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(data);
        kotlin.jvm.internal.Intrinsics.checkNotNull(digest);
        return kotlin.collections.ArraysKt.joinToString$default(digest, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder.$r8$lambda$7YcmIT082zRtrAZT7Vr47ndVosk(((java.lang.Byte) obj).byteValue());
            }
        }, 30, (java.lang.Object) null);
    }

    public final java.lang.String encryptDocString$verification_capture_prodRelease(java.lang.String value, boolean isStage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        try {
            java.security.PublicKey highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(isStage);
            if (highSpeedVideoFpsRanges == null) {
                return "";
            }
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, highSpeedVideoFpsRanges);
            byte[] bytes = value.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            java.lang.String encodeToString = android.util.Base64.encodeToString(cipher.doFinal(bytes), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
            return new kotlin.text.Regex("[\r\n]").replace(encodeToString, "");
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            com.paypal.android.logger.Logger.e$default(logger, "RSA encryption failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
            return "";
        }
    }

    private static java.security.PublicKey getHighSpeedVideoFpsRanges(boolean p0) {
        java.lang.String str;
        if (p0) {
            str = "MIIDbTCCAlWgAwIBAgIJBOn+F5PgxgKMMA0GCSqGSIb3DQEBCwUAMHYxHTAbBgNVBAMMFGlkZW50aXR5ZG9jdW1lbnRzZXJ2MQkwBwYDVQQLDAAxFTATBgNVBAoMDFBheVBhbCwgSW5jLjERMA8GA1UEBwwIU2FuIEpvc2UxEzARBgNVBAgMCkNhbGlmb3JuaWExCzAJBgNVBAYTAlVTMB4XDTIxMDcyNzA2MDQyMloXDTIzMDcyNzA2MDQyMlowdjEdMBsGA1UEAwwUaWRlbnRpdHlkb2N1bWVudHNlcnYxCTAHBgNVBAsMADEVMBMGA1UECgwMUGF5UGFsLCBJbmMuMREwDwYDVQQHDAhTYW4gSm9zZTETMBEGA1UECAwKQ2FsaWZvcm5pYTELMAkGA1UEBhMCVVMwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCzDavOLEB5uVsPNxkeCxC1bplO2yKo+tPRQqGRaexiLs/AQ+2vUmJ0ccX1DK7mLfY1aeu+dS10aW59FzAEWUFv0RkckzKJwoQctfTasEUBfNP3wPvEZ2fSF4+v5fzQXGN1QWhTJfcByhxEl+kRIYRYETk7yYWGhXiEJd/NLWYRPeYplkNdk0o4K6nFNyHVcXbDl5ZZFNrxvUHxB/Dlxc8fsYDZoC/+HfS8d2hpAJI4PfnWRXxC+2ghy1aFU+kFTKPucMKTFB/GmvzPbNs7XcGoznwz79JZhyubO91P7E+h0vZNisIrqYPg2JYFfCSQaGBf3siymdNt0Yc6sD4Adc8TAgMBAAEwDQYJKoZIhvcNAQELBQADggEBAACooUp6LCN40Irv8nQSKDjVIZllYHtnLpAb6Ex4GVFUpASKDO3IBwIE9UwX3lp+JbxmjqdzNhR6ZJZ8F9wPkitfYhsGqOC+cQaNKpvXpIifblNvPBhI308RhoaJB6tl6NY8Xp0/eLSWb4xEYx1wZ07Tu5a/I47H0dEB+WMOrOD50/Kh5kKPnAz6M0rYbgQ+5nJaSKaHYZ311eyeDUjBGxwf5O7ZNxvQVAvw5cPhELGyhaSwHjRs/02pYI2OSlx8Ui8wUnuidIBeSuOPUSskkudD0Dw224m/U2sZcKGjyKqJYesXiGGztfE3YOe+HmtbH7NK0aodz2Vt0geYEWlBpOw=";
        } else {
            str = "MIIDkTCCAnmgAwIBAgIJBQ3C6UrS6EroMA0GCSqGSIb3DQEBCwUAMIGHMR0wGwYDVQQDDBRpZGVudGl0eWRvY3VtZW50c2VydjEaMBgGA1UECwwRUGF5cGFsIFByb2R1Y3Rpb24xFTATBgNVBAoMDFBheVBhbCwgSW5jLjERMA8GA1UEBwwIU2FuIEpvc2UxEzARBgNVBAgMCkNhbGlmb3JuaWExCzAJBgNVBAYTAlVTMB4XDTI1MDQwODA3MzkzOVoXDTI3MDQwODA3MzkzOVowgYcxHTAbBgNVBAMMFGlkZW50aXR5ZG9jdW1lbnRzZXJ2MRowGAYDVQQLDBFQYXlwYWwgUHJvZHVjdGlvbjEVMBMGA1UECgwMUGF5UGFsLCBJbmMuMREwDwYDVQQHDAhTYW4gSm9zZTETMBEGA1UECAwKQ2FsaWZvcm5pYTELMAkGA1UEBhMCVVMwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCKD4LnB6Zkwcr4N9iiKdOXV/VWPg248U5ZxS6fCHCep3nk+nMLMMyvHXBeROA8SDYr29fpU+geZpJpKQFk0axFkhooBkmhrX9giKPciGhbplmw6+F/TYzE2i4Tp5qV66uRWzFzeLZ+mLOH67O7flusAScfhDywb6ChwGxDKMvJrdXUJGmW3R0Aszx1Vxe8VtfDqbdvMzQkYs4FgVA/hAg3+4CWIyKKWmjpwqoymxVFZUZNsBsuGDymrvZ5jWyBemTh9zHx0UTiO22YlKT6NUdn/Fe4T6JdSR9iYLm35VWU+3CP2tmdLtZf5CKSngXs2yzoeFj7FalbU3S39D4ETY8pAgMBAAEwDQYJKoZIhvcNAQELBQADggEBADVq5PD8E9JUWKxiOx45r/MOnyrfWx4LXL260RjotAZzm8nePxvPXwy+xmiKbtJgFL4U7ARC/Hl3g54JJO7LZp8Yms5XUnw1g/ckrfL/zi4ixUm3w845Nmlj3wd4Uu4DAZGDG/KWNB8JmaAcXZFQ8el/ZPMK8erj1HNrT3RFtFDovG7noSDWWbdfHpL59t5/P+Bz8Z9jVtoCbztZ3T68gZ2jzW5WVl6W+pFeXmkUneMVJRNawKDs5IPCoYM7PwXM57uyGJiemIxJxsGXPkf4f+o8TiyGRYxElciHtSjbGCd/g00cfG6CrCUbJqxs7NU4Bf7FuJQLF86h+EErc4iDi4o=";
        }
        try {
            java.security.cert.Certificate generateCertificate = java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(android.util.Base64.decode(str, 0)));
            kotlin.jvm.internal.Intrinsics.checkNotNull(generateCertificate, "");
            return ((java.security.cert.X509Certificate) generateCertificate).getPublicKey();
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            com.paypal.android.logger.Logger.e$default(logger, "Failed to load public key", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
            return null;
        }
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$7YcmIT082zRtrAZT7Vr47ndVosk(byte b) {
        java.lang.String format = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$xGeXlvtZabcR7qoQS_rV0FQqLg0(byte b) {
        java.lang.String format = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
