package coil3.memory;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0012\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00118\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010!\"\u0004\b%\u0010\u001aR\u0014\u0010'\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010!R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*"}, d2 = {"Lcoil3/memory/EmptyStrongMemoryCache;", "Lcoil3/memory/StrongMemoryCache;", "Lcoil3/memory/WeakMemoryCache;", "weakMemoryCache", "<init>", "(Lcoil3/memory/WeakMemoryCache;)V", "Lcoil3/memory/MemoryCache$Key;", "key", "Lcoil3/memory/MemoryCache$Value;", "get", "(Lcoil3/memory/MemoryCache$Key;)Lcoil3/memory/MemoryCache$Value;", "Lcoil3/Image;", "image", "", "", "", "extras", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "set", "(Lcoil3/memory/MemoryCache$Key;Lcoil3/Image;Ljava/util/Map;J)V", "", "remove", "(Lcoil3/memory/MemoryCache$Key;)Z", "trimToSize", "(J)V", "clear", "()V", "getHighSpeedVideoSizes", "Lcoil3/memory/WeakMemoryCache;", "Camera2StreamConfigurationMap", "getSize", "()J", "maxSize", "J", "getMaxSize", "setMaxSize", "getInitialMaxSize", "initialMaxSize", "", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStrongMemoryCache implements coil3.memory.StrongMemoryCache {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final coil3.memory.WeakMemoryCache Camera2StreamConfigurationMap;
    private long maxSize;

    @Override // coil3.memory.StrongMemoryCache
    public final void clear() {
    }

    @Override // coil3.memory.StrongMemoryCache
    public final coil3.memory.MemoryCache.Value get(coil3.memory.MemoryCache.Key key) {
        return null;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getInitialMaxSize() {
        return 0L;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getSize() {
        return 0L;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final boolean remove(coil3.memory.MemoryCache.Key key) {
        return false;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void trimToSize(long size) {
    }

    public EmptyStrongMemoryCache(coil3.memory.WeakMemoryCache weakMemoryCache) {
        this.Camera2StreamConfigurationMap = weakMemoryCache;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getMaxSize() {
        return this.maxSize;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void setMaxSize(long j) {
        this.maxSize = j;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final java.util.Set<coil3.memory.MemoryCache.Key> getKeys() {
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void set(coil3.memory.MemoryCache.Key key, coil3.Image image, java.util.Map<java.lang.String, ? extends java.lang.Object> extras, long size) {
        this.Camera2StreamConfigurationMap.set(key, image, extras, size);
    }
}
