package com.izettle.android.auth.log;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "withStackTrace", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StackTraceKt {
    public static final java.lang.String withStackTrace(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.ExceptionsKt.stackTraceToString(new com.izettle.android.auth.log.SwallowExceptionInfo(str));
    }
}
