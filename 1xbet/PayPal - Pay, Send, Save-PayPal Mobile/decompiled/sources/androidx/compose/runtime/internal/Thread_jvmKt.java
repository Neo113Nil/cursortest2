package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentThreadId", "()J", "", "currentThreadName", "()Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Thread_jvmKt {
    public static final long currentThreadId() {
        return java.lang.Thread.currentThread().getId();
    }

    public static final java.lang.String currentThreadName() {
        return java.lang.Thread.currentThread().getName();
    }
}
