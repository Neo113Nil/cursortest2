package com.paypal.oslo.feature.verificationcapture.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/util/EncryptionUtil;", "", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "calculateMD5", "([B)Ljava/lang/String;", "calculateSHA256", "", "useProductionKey", "rsaEncrypt", "(Ljava/lang/String;Z)Ljava/lang/String;", "seed", "aesGcmEncrypt", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "encryptedData", "aesGcmDecrypt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EncryptionUtil {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.util.EncryptionUtil INSTANCE = new com.paypal.oslo.feature.verificationcapture.util.EncryptionUtil();

    private EncryptionUtil() {
    }

    public final java.lang.String calculateMD5(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(data);
        kotlin.jvm.internal.Intrinsics.checkNotNull(digest);
        return kotlin.collections.ArraysKt.joinToString$default(digest, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.util.EncryptionUtil$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.util.EncryptionUtil.$r8$lambda$1c9E0VvdaFoKYUZxg8S0pRmYcFY(((java.lang.Byte) obj).byteValue());
            }
        }, 30, (java.lang.Object) null);
    }

    public final java.lang.String calculateSHA256(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        byte[] digest = java.security.MessageDigest.getInstance("SHA-256").digest(data);
        kotlin.jvm.internal.Intrinsics.checkNotNull(digest);
        return kotlin.collections.ArraysKt.joinToString$default(digest, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.util.EncryptionUtil$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.util.EncryptionUtil.$r8$lambda$SjcEgSNUX4mqCB0BdFlM1VLWvO4(((java.lang.Byte) obj).byteValue());
            }
        }, 30, (java.lang.Object) null);
    }

    public static /* synthetic */ java.lang.String rsaEncrypt$default(com.paypal.oslo.feature.verificationcapture.util.EncryptionUtil encryptionUtil, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return encryptionUtil.rsaEncrypt(str, z);
    }

    public final java.lang.String rsaEncrypt(java.lang.String data, boolean useProductionKey) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        if (useProductionKey) {
            str = "\n-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1KvqZ9L8fJ5wJ5oLgQxQ\nqJqZ8O5gL2YnQPqNkQxPYRH5hZh0aMvqKjNxZqZ4eFSPQWjqz7PoC4xF0QKlQmX8\njF5wJ5oLgQxQqJqZ8O5gL2YnQPqNkQxPYRH5hZh0aMvqKjNxZqZ4eFSPQWjqz7Po\nC4xF0QKlQmX8jF5wJ5oLgQxQqJqZ8O5gL2YnQPqNkQxPYRH5hZh0aMvqKjNxZqZ4\neFSPQWjqz7PoC4xF0QKlQmX8jF5wJ5oLgQxQqJqZ8O5gL2YnQPqNkQxPYRH5hZh0\naMvqKjNxZqZ4eFSPQWjqz7PoC4xF0QKlQmX8jF5wJ5oLgQxQqJqZ8O5gL2YnQPqN\nkQxPYRH5hZh0aMvqKjNxZqZ4eFSPQWjqz7PoC4xF0QKlQmX8jF5wJ5oLgQIDAQAB\n-----END PUBLIC KEY-----\n";
        } else {
            str = "\n-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyLVr3KqZ8O5gL2YnQPqN\nkQxPYRH5hZh0aMvqKjNxZqZ4eFSPQWjqz7PoC4xF0QKlQmX8jF5wJ5oLgQxQqJqZ\n8O5gL2YnQPqNkQxPYRH5hZh0aMvqKjNxZqZ4eFSPQWjqz7PoC4xF0QKlQmX8jF5w\nJ5oLgQxQqJqZ8O5gL2YnQPqNkQxPYRH5hZh0aMvqKjNxZqZ4eFSPQWjqz7PoC4xF\n0QKlQmX8jF5wJ5oLgQxQqJqZ8O5gL2YnQPqNkQxPYRH5hZh0aMvqKjNxZqZ4eFSP\nQWjqz7PoC4xF0QKlQmX8jF5wJ5oLgQxQqJqZ8O5gL2YnQPqNkQxPYRH5hZh0aMvq\nKjNxZqZ4eFSPQWjqz7PoC4xF0QKlQmX8jF5wJ5oLgQIDAQAB\n-----END PUBLIC KEY-----\n";
        }
        java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(new kotlin.text.Regex("\\s").replace(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str, "-----BEGIN PUBLIC KEY-----", "", false, 4, (java.lang.Object) null), "-----END PUBLIC KEY-----", "", false, 4, (java.lang.Object) null), ""), 0)));
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, generatePublic);
        byte[] bytes = data.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.lang.String encodeToString = android.util.Base64.encodeToString(cipher.doFinal(bytes), 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        return encodeToString;
    }

    public final java.lang.String aesGcmEncrypt(java.lang.String data, java.lang.String seed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seed, "");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = seed.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(messageDigest.digest(bytes), org.jose4j.keys.AesKey.ALGORITHM);
        byte[] bArr = new byte[12];
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME);
        cipher.init(1, secretKeySpec, new javax.crypto.spec.GCMParameterSpec(128, bArr));
        byte[] bytes2 = data.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
        byte[] doFinal = cipher.doFinal(bytes2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(doFinal);
        java.lang.String encodeToString = android.util.Base64.encodeToString(kotlin.collections.ArraysKt.plus(bArr, doFinal), 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        return encodeToString;
    }

    public final java.lang.String aesGcmDecrypt(java.lang.String encryptedData, java.lang.String seed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seed, "");
        byte[] decode = android.util.Base64.decode(encryptedData, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decode);
        byte[] copyOfRange = kotlin.collections.ArraysKt.copyOfRange(decode, 0, 12);
        byte[] copyOfRange2 = kotlin.collections.ArraysKt.copyOfRange(decode, 12, decode.length);
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = seed.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(messageDigest.digest(bytes), org.jose4j.keys.AesKey.ALGORITHM);
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME);
        cipher.init(2, secretKeySpec, new javax.crypto.spec.GCMParameterSpec(128, copyOfRange));
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(doFinal);
        return new java.lang.String(doFinal, kotlin.text.Charsets.UTF_8);
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$1c9E0VvdaFoKYUZxg8S0pRmYcFY(byte b) {
        java.lang.String format = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$SjcEgSNUX4mqCB0BdFlM1VLWvO4(byte b) {
        java.lang.String format = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
