package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes5.dex */
public interface SimpleLock {
    public static final kotlin.reflect.jvm.internal.impl.storage.SimpleLock.Companion Companion = kotlin.reflect.jvm.internal.impl.storage.SimpleLock.Companion.Camera2StreamConfigurationMap;

    void lock();

    void unlock();

    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.SimpleLock.Companion Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.storage.SimpleLock.Companion();

        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock simpleLock(java.lang.Runnable runnable, kotlin.jvm.functions.Function1<? super java.lang.InterruptedException, kotlin.Unit> function1) {
            if (runnable != null && function1 != null) {
                return new kotlin.reflect.jvm.internal.impl.storage.CancellableSimpleLock(runnable, function1);
            }
            return new kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock(null, 1, null);
        }
    }
}
