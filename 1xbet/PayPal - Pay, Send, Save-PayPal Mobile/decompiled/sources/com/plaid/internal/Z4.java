package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Z4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0456b0 f5987a;
    public final com.plaid.internal.C0564k0 b;
    public final com.plaid.internal.M2 c;

    public Z4(com.plaid.internal.C0456b0 c0456b0, com.plaid.internal.C0564k0 c0564k0, com.plaid.internal.M2 m2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0456b0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0564k0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m2, "");
        this.f5987a = c0456b0;
        this.b = c0564k0;
        this.c = m2;
    }

    public final void a() {
        final java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: com.plaid.internal.Z4$$ExternalSyntheticLambda0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
                com.plaid.internal.Z4.a(com.plaid.internal.Z4.this, defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    public static final void a(com.plaid.internal.Z4 z4, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, java.lang.Thread thread, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(thread);
        kotlin.jvm.internal.Intrinsics.checkNotNull(th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thread, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        java.lang.Throwable cause = th.getCause();
        if (cause != null) {
            java.lang.StackTraceElement[] stackTrace = cause.getStackTrace();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                java.lang.String className = stackTraceElement.getClassName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "");
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = className.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) "com.plaid", false, 2, (java.lang.Object) null)) {
                }
                try {
                    break;
                } catch (java.lang.Exception e) {
                    com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, e);
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    } else {
                        java.lang.System.exit(2);
                        throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                    }
                }
            }
        }
        java.lang.StackTraceElement[] stackTrace2 = th.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace2, "");
        for (java.lang.StackTraceElement stackTraceElement2 : stackTrace2) {
            java.lang.String className2 = stackTraceElement2.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "");
            java.util.Locale locale2 = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
            java.lang.String lowerCase2 = className2.toLowerCase(locale2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) "com.plaid", false, 2, (java.lang.Object) null)) {
            }
            break;
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.plaid.internal.Y4(z4, th, null), 1, null);
            if (z4.c.a(th)) {
                return;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
                return;
            } else {
                java.lang.System.exit(2);
                throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            java.lang.System.exit(2);
            throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }
}
