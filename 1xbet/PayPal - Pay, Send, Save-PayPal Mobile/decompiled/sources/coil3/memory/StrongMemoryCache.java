package coil3.memory;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\u00020\f8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0019\"\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/memory/StrongMemoryCache;", "", "Lcoil3/memory/MemoryCache$Key;", "key", "Lcoil3/memory/MemoryCache$Value;", "get", "(Lcoil3/memory/MemoryCache$Key;)Lcoil3/memory/MemoryCache$Value;", "Lcoil3/Image;", "image", "", "", "extras", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "set", "(Lcoil3/memory/MemoryCache$Key;Lcoil3/Image;Ljava/util/Map;J)V", "", "remove", "(Lcoil3/memory/MemoryCache$Key;)Z", "trimToSize", "(J)V", "clear", "()V", "getSize", "()J", "getMaxSize", "setMaxSize", "maxSize", "getInitialMaxSize", "initialMaxSize", "", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StrongMemoryCache {
    void clear();

    coil3.memory.MemoryCache.Value get(coil3.memory.MemoryCache.Key key);

    long getInitialMaxSize();

    java.util.Set<coil3.memory.MemoryCache.Key> getKeys();

    long getMaxSize();

    long getSize();

    boolean remove(coil3.memory.MemoryCache.Key key);

    void set(coil3.memory.MemoryCache.Key key, coil3.Image image, java.util.Map<java.lang.String, ? extends java.lang.Object> extras, long size);

    void setMaxSize(long j);

    void trimToSize(long size);
}
