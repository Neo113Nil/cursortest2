package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR:\u0010\u0012\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "<init>", "()V", "Ljava/lang/Class;", "", "p0", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", "(Ljava/lang/Class;)Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Camera2StreamConfigurationMap", "Ljava/util/WeakHashMap;", "getHighSpeedVideoFpsRanges", "Ljava/util/WeakHashMap;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WeakMapCtorCache extends kotlinx.coroutines.internal.CtorCache {
    public static final kotlinx.coroutines.internal.WeakMapCtorCache INSTANCE = new kotlinx.coroutines.internal.WeakMapCtorCache();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.concurrent.locks.ReentrantReadWriteLock Camera2StreamConfigurationMap = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> getHighSpeedVideoFpsRangesFor = new java.util.WeakHashMap<>();

    private WeakMapCtorCache() {
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> get(java.lang.Class<? extends java.lang.Throwable> p0) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = Camera2StreamConfigurationMap;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> function1 = getHighSpeedVideoFpsRangesFor.get(p0);
            if (function1 != null) {
                return function1;
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock2.unlock();
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> weakHashMap = getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> function12 = weakHashMap.get(p0);
                if (function12 != null) {
                    return function12;
                }
                kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> access$createConstructor = kotlinx.coroutines.internal.ExceptionsConstructorKt.access$createConstructor(p0);
                weakHashMap.put(p0, access$createConstructor);
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
                return access$createConstructor;
            } finally {
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
