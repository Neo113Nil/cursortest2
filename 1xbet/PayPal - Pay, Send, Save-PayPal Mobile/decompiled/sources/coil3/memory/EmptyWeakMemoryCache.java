package coil3.memory;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcoil3/memory/EmptyWeakMemoryCache;", "Lcoil3/memory/WeakMemoryCache;", "<init>", "()V", "Lcoil3/memory/MemoryCache$Key;", "key", "Lcoil3/memory/MemoryCache$Value;", "get", "(Lcoil3/memory/MemoryCache$Key;)Lcoil3/memory/MemoryCache$Value;", "Lcoil3/Image;", "image", "", "", "", "extras", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "set", "(Lcoil3/memory/MemoryCache$Key;Lcoil3/Image;Ljava/util/Map;J)V", "", "remove", "(Lcoil3/memory/MemoryCache$Key;)Z", "clear", "", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyWeakMemoryCache implements coil3.memory.WeakMemoryCache {
    @Override // coil3.memory.WeakMemoryCache
    public final void clear() {
    }

    @Override // coil3.memory.WeakMemoryCache
    public final coil3.memory.MemoryCache.Value get(coil3.memory.MemoryCache.Key key) {
        return null;
    }

    @Override // coil3.memory.WeakMemoryCache
    public final boolean remove(coil3.memory.MemoryCache.Key key) {
        return false;
    }

    @Override // coil3.memory.WeakMemoryCache
    public final void set(coil3.memory.MemoryCache.Key key, coil3.Image image, java.util.Map<java.lang.String, ? extends java.lang.Object> extras, long size) {
    }

    @Override // coil3.memory.WeakMemoryCache
    public final java.util.Set<coil3.memory.MemoryCache.Key> getKeys() {
        return kotlin.collections.SetsKt.emptySet();
    }
}
