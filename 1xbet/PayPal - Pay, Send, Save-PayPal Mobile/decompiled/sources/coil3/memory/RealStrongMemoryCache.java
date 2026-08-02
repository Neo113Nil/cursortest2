package coil3.memory;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u00011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0013\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 R$\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\u001dR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\b0-8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Lcoil3/memory/RealStrongMemoryCache;", "Lcoil3/memory/StrongMemoryCache;", "", "initialMaxSize", "Lcoil3/memory/WeakMemoryCache;", "weakMemoryCache", "<init>", "(JLcoil3/memory/WeakMemoryCache;)V", "Lcoil3/memory/MemoryCache$Key;", "key", "Lcoil3/memory/MemoryCache$Value;", "get", "(Lcoil3/memory/MemoryCache$Key;)Lcoil3/memory/MemoryCache$Value;", "Lcoil3/Image;", "image", "", "", "", "extras", io.ktor.http.ContentDisposition.Parameters.Size, "", "set", "(Lcoil3/memory/MemoryCache$Key;Lcoil3/Image;Ljava/util/Map;J)V", "", "remove", "(Lcoil3/memory/MemoryCache$Key;)Z", "clear", "()V", "trimToSize", "(J)V", "J", "getInitialMaxSize", "()J", "Camera2StreamConfigurationMap", "Lcoil3/memory/WeakMemoryCache;", "getHighSpeedVideoFpsRanges", "Lcoil3/memory/RealStrongMemoryCache$cache$1;", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/memory/RealStrongMemoryCache$cache$1;", "getHighSpeedVideoFpsRangesFor", "getSize", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getMaxSize", "setMaxSize", "maxSize", "", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "InternalValue"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealStrongMemoryCache implements coil3.memory.StrongMemoryCache {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final coil3.memory.WeakMemoryCache getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final coil3.memory.RealStrongMemoryCache$cache$1 getHighSpeedVideoFpsRangesFor;
    private final long initialMaxSize;

    /* JADX WARN: Type inference failed for: r1v1, types: [coil3.memory.RealStrongMemoryCache$cache$1] */
    public RealStrongMemoryCache(long j, coil3.memory.WeakMemoryCache weakMemoryCache) {
        this.initialMaxSize = j;
        this.getHighSpeedVideoFpsRanges = weakMemoryCache;
        final long initialMaxSize = getInitialMaxSize();
        this.getHighSpeedVideoFpsRangesFor = new coil3.content.LruCache<coil3.memory.MemoryCache.Key, coil3.memory.RealStrongMemoryCache.InternalValue>(initialMaxSize) { // from class: coil3.memory.RealStrongMemoryCache$cache$1
            @Override // coil3.content.LruCache
            public final long sizeOf(coil3.memory.MemoryCache.Key key, coil3.memory.RealStrongMemoryCache.InternalValue value) {
                return value.getCamera2StreamConfigurationMap();
            }

            @Override // coil3.content.LruCache
            public final void entryRemoved(coil3.memory.MemoryCache.Key key, coil3.memory.RealStrongMemoryCache.InternalValue oldValue, coil3.memory.RealStrongMemoryCache.InternalValue newValue) {
                coil3.memory.WeakMemoryCache weakMemoryCache2;
                weakMemoryCache2 = coil3.memory.RealStrongMemoryCache.this.getHighSpeedVideoFpsRanges;
                weakMemoryCache2.set(key, oldValue.getHighSpeedVideoSizes, oldValue.getHighSpeedVideoFpsRanges, oldValue.getCamera2StreamConfigurationMap());
            }
        };
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getInitialMaxSize() {
        return this.initialMaxSize;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getSize() {
        return getSize();
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getMaxSize() {
        return getMaxSize();
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void setMaxSize(long j) {
        setMaxSize(j);
    }

    @Override // coil3.memory.StrongMemoryCache
    public final java.util.Set<coil3.memory.MemoryCache.Key> getKeys() {
        return getKeys();
    }

    @Override // coil3.memory.StrongMemoryCache
    public final coil3.memory.MemoryCache.Value get(coil3.memory.MemoryCache.Key key) {
        coil3.memory.RealStrongMemoryCache.InternalValue internalValue = get(key);
        if (internalValue != null) {
            return new coil3.memory.MemoryCache.Value(internalValue.getHighSpeedVideoSizes, internalValue.getHighSpeedVideoFpsRanges);
        }
        return null;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void set(coil3.memory.MemoryCache.Key key, coil3.Image image, java.util.Map<java.lang.String, ? extends java.lang.Object> extras, long size) {
        if (size <= getMaxSize()) {
            put(key, new coil3.memory.RealStrongMemoryCache.InternalValue(image, extras, size));
        } else {
            remove(key);
            this.getHighSpeedVideoFpsRanges.set(key, image, extras, size);
        }
    }

    @Override // coil3.memory.StrongMemoryCache
    public final boolean remove(coil3.memory.MemoryCache.Key key) {
        return remove(key) != null;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void clear() {
        clear();
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void trimToSize(long size) {
        trimToSize(size);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000e\u0010\u0011"}, d2 = {"Lcoil3/memory/RealStrongMemoryCache$InternalValue;", "", "Lcoil3/Image;", "p0", "", "", "p1", "", "p2", "<init>", "(Lcoil3/Image;Ljava/util/Map;J)V", "Camera2StreamConfigurationMap", "Lcoil3/Image;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "J", "()J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class InternalValue {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final coil3.Image getHighSpeedVideoSizes;
        final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final long Camera2StreamConfigurationMap;

        public InternalValue(coil3.Image image, java.util.Map<java.lang.String, ? extends java.lang.Object> map, long j) {
            this.getHighSpeedVideoSizes = image;
            this.getHighSpeedVideoFpsRanges = map;
            this.Camera2StreamConfigurationMap = j;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final long getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }
    }
}
