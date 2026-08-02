package androidx.compose.ui.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b \u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/internal/PlatformOptimizedCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "", "message", "<init>", "(Ljava/lang/String;)V", "", "fillInStackTrace", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PlatformOptimizedCancellationException extends java.util.concurrent.CancellationException {
    public static final int $stable = 8;

    public PlatformOptimizedCancellationException(java.lang.String str) {
        super(str);
    }

    public /* synthetic */ PlatformOptimizedCancellationException(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        java.lang.StackTraceElement[] stackTraceElementArr;
        stackTraceElementArr = androidx.compose.ui.internal.PlatformOptimizedCancellationException_jvmKt.getHighSpeedVideoSizes;
        setStackTrace(stackTraceElementArr);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformOptimizedCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
