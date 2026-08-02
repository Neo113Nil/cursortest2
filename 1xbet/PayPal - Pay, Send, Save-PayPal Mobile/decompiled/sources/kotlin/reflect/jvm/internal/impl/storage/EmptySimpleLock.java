package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes5.dex */
public final class EmptySimpleLock implements kotlin.reflect.jvm.internal.impl.storage.SimpleLock {
    public static final kotlin.reflect.jvm.internal.impl.storage.EmptySimpleLock INSTANCE = new kotlin.reflect.jvm.internal.impl.storage.EmptySimpleLock();

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public final void lock() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public final void unlock() {
    }

    private EmptySimpleLock() {
    }
}
