package com.moloco.sdk.internal.error.crash.filters;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.internal.error.crash.filters.a {
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6961a = "MolocoSDKExceptionFilter";

    @Override // com.moloco.sdk.internal.error.crash.filters.a
    public boolean a(java.lang.Throwable crash) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crash, "crash");
        java.lang.StackTraceElement[] stackTrace = crash.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            java.lang.String className = stackTraceElement.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) className, (java.lang.CharSequence) "com.moloco.sdk", false, 2, (java.lang.Object) null)) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.f6961a, "SDK detected in stacktrace", null, false, 12, null);
                return true;
            }
        }
        java.lang.Throwable cause = crash.getCause();
        if (cause == null) {
            return false;
        }
        java.lang.StackTraceElement[] stackTrace2 = cause.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
        for (java.lang.StackTraceElement stackTraceElement2 : stackTrace2) {
            java.lang.String className2 = stackTraceElement2.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) className2, (java.lang.CharSequence) "com.moloco.sdk", false, 2, (java.lang.Object) null)) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.f6961a, "SDK detected in stacktrace", null, false, 12, null);
                return true;
            }
        }
        return false;
    }
}
