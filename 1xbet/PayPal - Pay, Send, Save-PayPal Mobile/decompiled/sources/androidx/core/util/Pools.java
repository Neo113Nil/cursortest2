package androidx.core.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/core/util/Pools;", "", "<init>", "()V", "Pool", "SimplePool", "SynchronizedPool"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Pools {

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/core/util/Pools$Pool;", "", "T", "acquire", "()Ljava/lang/Object;", "instance", "", "release", "(Ljava/lang/Object;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Pool<T> {
        T acquire();

        boolean release(T instance);
    }

    private Pools() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/core/util/Pools$SimplePool;", "", "T", "Landroidx/core/util/Pools$Pool;", "", "maxPoolSize", "<init>", "(I)V", "acquire", "()Ljava/lang/Object;", "instance", "", "release", "(Ljava/lang/Object;)Z", "", "getHighSpeedVideoSizes", "[Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class SimplePool<T> implements androidx.core.util.Pools.Pool<T> {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private int Camera2StreamConfigurationMap;
        private final java.lang.Object[] getHighSpeedVideoSizes;

        public SimplePool(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("The max pool size must be > 0".toString());
            }
            this.getHighSpeedVideoSizes = new java.lang.Object[i];
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i = this.Camera2StreamConfigurationMap;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T t = (T) this.getHighSpeedVideoSizes[i2];
            kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
            this.getHighSpeedVideoSizes[i2] = null;
            this.Camera2StreamConfigurationMap--;
            return t;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
            int i = this.Camera2StreamConfigurationMap;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.getHighSpeedVideoSizes[i2] == instance) {
                    throw new java.lang.IllegalStateException("Already in the pool!".toString());
                }
            }
            int i3 = this.Camera2StreamConfigurationMap;
            java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
            if (i3 >= objArr.length) {
                return false;
            }
            objArr[i3] = instance;
            this.Camera2StreamConfigurationMap = i3 + 1;
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/core/util/Pools$SynchronizedPool;", "", "T", "Landroidx/core/util/Pools$SimplePool;", "", "maxPoolSize", "<init>", "(I)V", "acquire", "()Ljava/lang/Object;", "instance", "", "release", "(Ljava/lang/Object;)Z", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class SynchronizedPool<T> extends androidx.core.util.Pools.SimplePool<T> {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.Object getHighSpeedVideoFpsRangesFor;

        public SynchronizedPool(int i) {
            super(i);
            this.getHighSpeedVideoFpsRangesFor = new java.lang.Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t;
            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            boolean release;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                release = super.release(instance);
            }
            return release;
        }
    }
}
