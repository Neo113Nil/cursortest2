package coil3.memory;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001a\u001a\u00060 j\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010\u0015\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R$\u0010'\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00148W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010$\"\u0004\b&\u0010\u0017R\u0014\u0010)\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0*8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,"}, d2 = {"Lcoil3/memory/RealMemoryCache;", "Lcoil3/memory/MemoryCache;", "Lcoil3/memory/StrongMemoryCache;", "strongMemoryCache", "Lcoil3/memory/WeakMemoryCache;", "weakMemoryCache", "<init>", "(Lcoil3/memory/StrongMemoryCache;Lcoil3/memory/WeakMemoryCache;)V", "Lcoil3/memory/MemoryCache$Key;", "key", "Lcoil3/memory/MemoryCache$Value;", "get", "(Lcoil3/memory/MemoryCache$Key;)Lcoil3/memory/MemoryCache$Value;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Lcoil3/memory/MemoryCache$Key;Lcoil3/memory/MemoryCache$Value;)V", "", "remove", "(Lcoil3/memory/MemoryCache$Key;)Z", "", io.ktor.http.ContentDisposition.Parameters.Size, "trimToSize", "(J)V", "clear", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/memory/StrongMemoryCache;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcoil3/memory/WeakMemoryCache;", "getHighSpeedVideoFpsRanges", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "Ljava/lang/Object;", "getSize", "()J", "getMaxSize", "setMaxSize", "maxSize", "getInitialMaxSize", "initialMaxSize", "", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealMemoryCache implements coil3.memory.MemoryCache {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final coil3.memory.WeakMemoryCache getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final coil3.memory.StrongMemoryCache getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

    public RealMemoryCache(coil3.memory.StrongMemoryCache strongMemoryCache, coil3.memory.WeakMemoryCache weakMemoryCache) {
        this.getHighSpeedVideoSizes = strongMemoryCache;
        this.getHighSpeedVideoFpsRanges = weakMemoryCache;
    }

    @Override // coil3.memory.MemoryCache
    public final long getSize() {
        long size;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            size = this.getHighSpeedVideoSizes.getSize();
        }
        return size;
    }

    @Override // coil3.memory.MemoryCache
    public final long getMaxSize() {
        long maxSize;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            maxSize = this.getHighSpeedVideoSizes.getMaxSize();
        }
        return maxSize;
    }

    @Override // coil3.memory.MemoryCache
    public final void setMaxSize(long j) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizes.setMaxSize(j);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // coil3.memory.MemoryCache
    public final long getInitialMaxSize() {
        long initialMaxSize;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            initialMaxSize = this.getHighSpeedVideoSizes.getInitialMaxSize();
        }
        return initialMaxSize;
    }

    @Override // coil3.memory.MemoryCache
    public final java.util.Set<coil3.memory.MemoryCache.Key> getKeys() {
        java.util.Set<coil3.memory.MemoryCache.Key> plus;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            plus = kotlin.collections.SetsKt.plus((java.util.Set) this.getHighSpeedVideoSizes.getKeys(), (java.lang.Iterable) this.getHighSpeedVideoFpsRanges.getKeys());
        }
        return plus;
    }

    @Override // coil3.memory.MemoryCache
    public final coil3.memory.MemoryCache.Value get(coil3.memory.MemoryCache.Key key) {
        coil3.memory.MemoryCache.Value value;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            value = this.getHighSpeedVideoSizes.get(key);
            if (value == null) {
                value = this.getHighSpeedVideoFpsRanges.get(key);
            }
            if (value != null && !value.getImage().getShareable()) {
                remove(key);
            }
        }
        return value;
    }

    @Override // coil3.memory.MemoryCache
    public final void set(coil3.memory.MemoryCache.Key key, coil3.memory.MemoryCache.Value value) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            long size = value.getImage().getSize();
            if (size < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Image size must be non-negative: ");
                sb.append(size);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            this.getHighSpeedVideoSizes.set(key, value.getImage(), value.getExtras(), size);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // coil3.memory.MemoryCache
    public final boolean remove(coil3.memory.MemoryCache.Key key) {
        boolean z;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            z = this.getHighSpeedVideoSizes.remove(key) || this.getHighSpeedVideoFpsRanges.remove(key);
        }
        return z;
    }

    @Override // coil3.memory.MemoryCache
    public final void trimToSize(long size) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizes.trimToSize(size);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // coil3.memory.MemoryCache
    public final void clear() {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizes.clear();
            this.getHighSpeedVideoFpsRanges.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
