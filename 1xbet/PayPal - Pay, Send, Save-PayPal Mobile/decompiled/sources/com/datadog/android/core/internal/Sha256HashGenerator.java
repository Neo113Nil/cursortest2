package com.datadog.android.core.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/core/internal/Sha256HashGenerator;", "Lcom/datadog/android/core/internal/HashGenerator;", "<init>", "()V", "", "input", "generate", "(Ljava/lang/String;)Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Sha256HashGenerator implements com.datadog.android.core.internal.HashGenerator {
    public static final java.lang.String SHA_256_HASH_GENERATION_ERROR = "Cannot generate SHA-256 hash.";

    @Override // com.datadog.android.core.internal.HashGenerator
    public final java.lang.String generate(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            byte[] bytes = input.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "");
            return kotlin.collections.ArraysKt.joinToString$default(digest, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.Byte, java.lang.CharSequence>() { // from class: com.datadog.android.core.internal.Sha256HashGenerator$generate$1
                public final java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(byte b) {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.CharSequence invoke(java.lang.Byte b) {
                    return getHighResolutionOutputSizeshNQ4ISI(b.byteValue());
                }
            }, 30, (java.lang.Object) null);
        } catch (java.security.NoSuchAlgorithmException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.core.internal.utils.RuntimeUtilsKt.getUnboundInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.Sha256HashGenerator$generate$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.Sha256HashGenerator.SHA_256_HASH_GENERATION_ERROR;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }
}
