package io.ktor.utils.io.pool;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00028\u0000H$¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H$¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0005R\u0011\u0010\u0012\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lio/ktor/utils/io/pool/SingleInstancePool;", "", "T", "Lio/ktor/utils/io/pool/ObjectPool;", "<init>", "()V", "produceInstance", "()Ljava/lang/Object;", "instance", "", "disposeInstance", "(Ljava/lang/Object;)V", "borrow", "recycle", "dispose", "", "getCapacity", "()I", "capacity"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SingleInstancePool<T> implements io.ktor.utils.io.pool.ObjectPool<T> {
    private volatile /* synthetic */ int borrowed = 0;
    private volatile /* synthetic */ int disposed = 0;
    private volatile /* synthetic */ java.lang.Object instance = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.utils.io.pool.SingleInstancePool.class, "borrowed");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.utils.io.pool.SingleInstancePool.class, "disposed");

    protected abstract void disposeInstance(T instance);

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final int getCapacity() {
        return 1;
    }

    protected abstract T produceInstance();

    @Override // io.ktor.utils.io.pool.ObjectPool, java.lang.AutoCloseable
    public void close() {
        io.ktor.utils.io.pool.ObjectPool.DefaultImpls.close(this);
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void recycle(T instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
        if (this.instance != instance) {
            if (this.instance == null && this.borrowed != 0) {
                throw new java.lang.IllegalStateException("Already recycled or an irrelevant instance tried to be recycled".toString());
            }
            throw new java.lang.IllegalStateException("Unable to recycle irrelevant instance".toString());
        }
        this.instance = null;
        if (!Camera2StreamConfigurationMap.compareAndSet(this, 0, 1)) {
            throw new java.lang.IllegalStateException("An instance is already disposed".toString());
        }
        disposeInstance(instance);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void dispose() {
        java.lang.Object obj;
        if (!Camera2StreamConfigurationMap.compareAndSet(this, 0, 1) || (obj = this.instance) == null) {
            return;
        }
        this.instance = null;
        disposeInstance(obj);
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final T borrow() {
        int i;
        do {
            i = this.borrowed;
            if (i != 0) {
                throw new java.lang.IllegalStateException("Instance is already consumed".toString());
            }
        } while (!getHighSpeedVideoSizes.compareAndSet(this, i, 1));
        T produceInstance = produceInstance();
        this.instance = produceInstance;
        return produceInstance;
    }
}
