package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "isMainThread", "()Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LifecycleRegistry_androidKt {
    public static final boolean isMainThread() {
        return androidx.arch.core.executor.ArchTaskExecutor.getInstance().isMainThread();
    }
}
