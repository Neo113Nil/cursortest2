package androidx.tracing;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nR\u0011\u0010\u0010\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/tracing/TraceApi29Impl;", "", "<init>", "()V", "", "methodName", "", "cookie", "", "beginAsyncSection", "(Ljava/lang/String;I)V", "endAsyncSection", "counterName", "counterValue", "setCounter", "", "isEnabled", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TraceApi29Impl {
    public static final androidx.tracing.TraceApi29Impl INSTANCE = new androidx.tracing.TraceApi29Impl();

    private TraceApi29Impl() {
    }

    public final boolean isEnabled() {
        return android.os.Trace.isEnabled();
    }

    public final void beginAsyncSection(java.lang.String methodName, int cookie) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "");
        android.os.Trace.beginAsyncSection(methodName, cookie);
    }

    public final void endAsyncSection(java.lang.String methodName, int cookie) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "");
        android.os.Trace.endAsyncSection(methodName, cookie);
    }

    public final void setCounter(java.lang.String counterName, int counterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(counterName, "");
        android.os.Trace.setCounter(counterName, counterValue);
    }
}
