package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"", "MainThreadId", "J", "getMainThreadId", "()J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Thread_androidKt {
    private static final long MainThreadId;

    public static final long getMainThreadId() {
        return MainThreadId;
    }

    static {
        long j;
        try {
            j = android.os.Looper.getMainLooper().getThread().getId();
        } catch (java.lang.Exception unused) {
            j = -1;
        }
        MainThreadId = j;
    }
}
