package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/MD5HashGenerator;", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/HashGenerator;", "Lcom/datadog/android/api/InternalLogger;", "logger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "input", "", "generate", "([B)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MD5HashGenerator implements com.datadog.android.sessionreplay.internal.recorder.resources.HashGenerator {
    private static final com.datadog.android.sessionreplay.internal.recorder.resources.MD5HashGenerator.Companion Companion = new com.datadog.android.sessionreplay.internal.recorder.resources.MD5HashGenerator.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;

    public MD5HashGenerator(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRanges = internalLogger;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.HashGenerator
    public final java.lang.String generate(byte[] input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(input);
            byte[] digest = messageDigest.digest();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "");
            return com.datadog.android.internal.utils.ByteArrayExtKt.toHexString(digest);
        } catch (java.security.NoSuchAlgorithmException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.resources.MD5HashGenerator$generate$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Cannot generate MD5 hash.";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/MD5HashGenerator$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
