package com.datadog.android.rum.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "maxBytes", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lkotlin/Pair;", "truncateToUtf8ByteSize", "(Ljava/lang/String;ILcom/datadog/android/api/InternalLogger;)Lkotlin/Pair;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StringExtKt {
    public static /* synthetic */ kotlin.Pair truncateToUtf8ByteSize$default(java.lang.String str, int i, com.datadog.android.api.InternalLogger internalLogger, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            internalLogger = null;
        }
        return truncateToUtf8ByteSize(str, i, internalLogger);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> truncateToUtf8ByteSize(java.lang.String str, int i, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.nio.charset.CharsetEncoder newEncoder = java.nio.charset.StandardCharsets.UTF_8.newEncoder();
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i);
        java.nio.CharBuffer wrap = java.nio.CharBuffer.wrap(str);
        try {
            newEncoder.encode(wrap, allocate, true);
            java.lang.String substring = str.substring(0, wrap.position());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            return new kotlin.Pair<>(substring, java.lang.Integer.valueOf(allocate.position()));
        } catch (java.lang.IllegalStateException e) {
            if (internalLogger != null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.utils.StringExtKt$logTruncationFailure$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Failed to truncate string to UTF-8 byte limit";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
            return new kotlin.Pair<>("", 0);
        } catch (java.lang.NullPointerException e2) {
            if (internalLogger != null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.utils.StringExtKt$logTruncationFailure$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Failed to truncate string to UTF-8 byte limit";
                    }
                }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
            return new kotlin.Pair<>("", 0);
        } catch (java.nio.charset.CoderMalfunctionError e3) {
            if (internalLogger != null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.utils.StringExtKt$logTruncationFailure$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Failed to truncate string to UTF-8 byte limit";
                    }
                }, (java.lang.Throwable) e3, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
            return new kotlin.Pair<>("", 0);
        }
    }
}
