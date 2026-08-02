package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes5.dex */
public class DefaultSimpleLock implements kotlin.reflect.jvm.internal.impl.storage.SimpleLock {
    private final java.util.concurrent.locks.Lock getHighSpeedVideoSizes;

    public DefaultSimpleLock(java.util.concurrent.locks.Lock lock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lock, "");
        this.getHighSpeedVideoSizes = lock;
    }

    public /* synthetic */ DefaultSimpleLock(java.util.concurrent.locks.ReentrantLock reentrantLock, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.concurrent.locks.ReentrantLock() : reentrantLock);
    }

    protected final java.util.concurrent.locks.Lock getLock() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        this.getHighSpeedVideoSizes.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
        this.getHighSpeedVideoSizes.unlock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSimpleLock() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
