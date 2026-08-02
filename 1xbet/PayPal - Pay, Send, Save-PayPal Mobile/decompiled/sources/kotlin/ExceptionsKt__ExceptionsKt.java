package kotlin;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00008G¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\"!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f*\u00020\u00008G¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"", "", "stackTraceToString", "(Ljava/lang/Throwable;)Ljava/lang/String;", "exception", "", "addSuppressed", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "Ljava/lang/StackTraceElement;", "getStackTrace", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "getStackTrace$annotations", "(Ljava/lang/Throwable;)V", "stackTrace", "", "getSuppressedExceptions", "(Ljava/lang/Throwable;)Ljava/util/List;", "getSuppressedExceptions$annotations", "suppressedExceptions"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/ExceptionsKt")
/* loaded from: classes3.dex */
public class ExceptionsKt__ExceptionsKt {
    public static /* synthetic */ void getStackTrace$annotations(java.lang.Throwable th) {
    }

    public static /* synthetic */ void getSuppressedExceptions$annotations(java.lang.Throwable th) {
    }

    public static final java.lang.StackTraceElement[] getStackTrace(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNull(stackTrace);
        return stackTrace;
    }

    public static final java.lang.String stackTraceToString(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String obj = stringWriter.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static final void addSuppressed(java.lang.Throwable th, java.lang.Throwable th2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th2, "");
        if (th != th2) {
            kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(th, th2);
        }
    }

    public static final java.util.List<java.lang.Throwable> getSuppressedExceptions(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        return kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS.getSuppressed(th);
    }
}
