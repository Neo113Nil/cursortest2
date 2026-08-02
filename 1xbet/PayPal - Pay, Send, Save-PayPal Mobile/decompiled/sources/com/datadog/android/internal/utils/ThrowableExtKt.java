package com.datadog.android.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "loggableStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThrowableExtKt {
    public static final java.lang.String loggableStackTrace(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        java.lang.String obj = stringWriter.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
