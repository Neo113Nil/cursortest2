package com.unity3d.ads.core.extensions;

/* compiled from: ExceptionExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0006"}, d2 = {"getShortenedStackTrace", "", "", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "retrieveUnityCrashValue", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExceptionExtensionsKt {
    public static final java.lang.String retrieveUnityCrashValue(java.lang.Throwable th) {
        java.lang.StackTraceElement stackTraceElement;
        java.lang.String className;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "<this>");
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "this.stackTrace");
        java.lang.StackTraceElement[] stackTraceElementArr = stackTrace;
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            stackTraceElement = null;
            if (i >= length) {
                break;
            }
            java.lang.StackTraceElement stackTraceElement2 = stackTraceElementArr[i];
            java.lang.StackTraceElement stackTraceElement3 = stackTraceElement2;
            if (stackTraceElement3 != null && (className = stackTraceElement3.getClassName()) != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "className");
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) className, (java.lang.CharSequence) com.unity3d.services.SDKErrorHandler.UNITY_PACKAGE, false, 2, (java.lang.Object) null)) {
                    stackTraceElement = stackTraceElement2;
                    break;
                }
            }
            i++;
        }
        java.lang.StackTraceElement stackTraceElement4 = stackTraceElement;
        if (stackTraceElement4 == null) {
            return "unknown";
        }
        java.lang.String fileName = stackTraceElement4.getFileName();
        if (fileName == null) {
            fileName = "unknown";
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName ?: SDKErrorHandler.UNKNOWN_FILE");
        }
        java.lang.String str = fileName + '_' + stackTraceElement4.getLineNumber();
        return str != null ? str : "unknown";
    }

    public static /* synthetic */ java.lang.String getShortenedStackTrace$default(java.lang.Throwable th, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 15;
        }
        return getShortenedStackTrace(th, i);
    }

    public static final java.lang.String getShortenedStackTrace(java.lang.Throwable th, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "<this>");
        try {
            java.io.PrintWriter stringWriter = new java.io.StringWriter();
            try {
                java.io.StringWriter stringWriter2 = stringWriter;
                stringWriter = new java.io.PrintWriter(stringWriter2);
                try {
                    th.printStackTrace(stringWriter);
                    java.lang.String stringWriter3 = stringWriter2.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringWriter3, "stringWriter.toString()");
                    java.lang.String joinToString$default = kotlin.sequences.SequencesKt.joinToString$default(kotlin.sequences.SequencesKt.take(kotlin.text.StringsKt.lineSequence(kotlin.text.StringsKt.trim((java.lang.CharSequence) stringWriter3).toString()), i), "\n", null, null, 0, null, null, 62, null);
                    kotlin.io.CloseableKt.closeFinally(stringWriter, null);
                    kotlin.io.CloseableKt.closeFinally(stringWriter, null);
                    return joinToString$default;
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }
}
