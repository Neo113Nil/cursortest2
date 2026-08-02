package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "NonFatal", "(Ljava/lang/Throwable;)Z"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "arrow/core/NonFatalKt")
/* loaded from: classes3.dex */
final /* synthetic */ class NonFatalKt__NonFatalKt {
    public static final boolean NonFatal(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        return ((th instanceof java.lang.VirtualMachineError) || (th instanceof java.lang.ThreadDeath) || (th instanceof java.lang.InterruptedException) || (th instanceof java.lang.LinkageError) || (th instanceof java.util.concurrent.CancellationException)) ? false : true;
    }
}
