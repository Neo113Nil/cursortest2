package io.ktor.utils.io.pool;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H$¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\tJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010\u001a\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lio/ktor/utils/io/pool/DefaultPool;", "", "T", "Lio/ktor/utils/io/pool/ObjectPool;", "", "capacity", "<init>", "(I)V", "produceInstance", "()Ljava/lang/Object;", "instance", "clearInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "validateInstance", "(Ljava/lang/Object;)V", "disposeInstance", "borrow", "recycle", "dispose", "()V", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getCapacity", "()I", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoSizes", "[I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DefaultPool<T> implements io.ktor.utils.io.pool.ObjectPool<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(io.ktor.utils.io.pool.DefaultPool.class, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReferenceArray<T> getHighSpeedVideoFpsRangesFor;
    private final int capacity;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int[] getHighResolutionOutputSizeshNQ4ISI;
    private volatile /* synthetic */ long top;

    protected abstract T produceInstance();

    @Override // io.ktor.utils.io.pool.ObjectPool, java.lang.AutoCloseable
    public void close() {
        io.ktor.utils.io.pool.ObjectPool.DefaultImpls.close(this);
    }

    public DefaultPool(int i) {
        this.capacity = i;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("capacity should be positive but it is ".concat(java.lang.String.valueOf(i)).toString());
        }
        if (i > 536870911) {
            throw new java.lang.IllegalArgumentException("capacity should be less or equal to 536870911 but it is ".concat(java.lang.String.valueOf(i)).toString());
        }
        this.top = 0L;
        int highestOneBit = java.lang.Integer.highestOneBit((i * 4) - 1) * 2;
        this.getHighSpeedVideoFpsRanges = highestOneBit;
        this.Camera2StreamConfigurationMap = java.lang.Integer.numberOfLeadingZeros(highestOneBit) + 1;
        int i2 = highestOneBit + 1;
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReferenceArray<>(i2);
        this.getHighResolutionOutputSizeshNQ4ISI = new int[i2];
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final int getCapacity() {
        return this.capacity;
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final T borrow() {
        T clearInstance;
        T Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        return (Camera2StreamConfigurationMap == null || (clearInstance = clearInstance(Camera2StreamConfigurationMap)) == null) ? produceInstance() : clearInstance;
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void recycle(T instance) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
        validateInstance(instance);
        int identityHashCode = ((java.lang.System.identityHashCode(instance) * (-1640531527)) >>> this.Camera2StreamConfigurationMap) + 1;
        for (int i = 0; i < 8; i++) {
            if (com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, identityHashCode, null, instance)) {
                if (identityHashCode <= 0) {
                    throw new java.lang.IllegalArgumentException("index should be positive".toString());
                }
                do {
                    j = this.top;
                    this.getHighResolutionOutputSizeshNQ4ISI[identityHashCode] = (int) (j & 4294967295L);
                } while (!getHighSpeedVideoFpsRangesFor.compareAndSet(this, j, (((4294967295L & (j >> 32)) + 1) << 32) | identityHashCode));
                return;
            }
            identityHashCode--;
            if (identityHashCode == 0) {
                identityHashCode = this.getHighSpeedVideoFpsRanges;
            }
        }
        disposeInstance(instance);
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void dispose() {
        while (true) {
            T Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap == null) {
                return;
            } else {
                disposeInstance(Camera2StreamConfigurationMap);
            }
        }
    }

    private final T Camera2StreamConfigurationMap() {
        int i;
        int i2;
        while (true) {
            long j = this.top;
            i = 0;
            if (j == 0 || (i2 = (int) (j & 4294967295L)) == 0) {
                break;
            }
            if (getHighSpeedVideoFpsRangesFor.compareAndSet(this, j, (((4294967295L & (j >> 32)) + 1) << 32) | this.getHighResolutionOutputSizeshNQ4ISI[i2])) {
                i = i2;
                break;
            }
        }
        if (i == 0) {
            return null;
        }
        return this.getHighSpeedVideoFpsRangesFor.getAndSet(i, null);
    }

    protected void validateInstance(T instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
    }

    protected void disposeInstance(T instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
    }

    public T clearInstance(T instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
        return instance;
    }
}
