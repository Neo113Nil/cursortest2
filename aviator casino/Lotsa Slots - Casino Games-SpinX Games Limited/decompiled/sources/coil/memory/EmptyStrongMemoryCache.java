package coil.memory;

/* compiled from: StrongMemoryCache.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J,\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcoil/memory/EmptyStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "weakMemoryCache", "Lcoil/memory/WeakMemoryCache;", "<init>", "(Lcoil/memory/WeakMemoryCache;)V", "size", "", "getSize", "()I", "maxSize", "getMaxSize", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "", "Lcoil/memory/MemoryCache$Key;", "getKeys", "()Ljava/util/Set;", "get", "Lcoil/memory/MemoryCache$Value;", com.ironsource.X3.i.W, "set", "", "bitmap", "Landroid/graphics/Bitmap;", "extras", "", "", "", "remove", "", "clearMemory", "trimMemory", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyStrongMemoryCache implements coil.memory.StrongMemoryCache {
    private final coil.memory.WeakMemoryCache weakMemoryCache;

    @Override // coil.memory.StrongMemoryCache
    public void clearMemory() {
    }

    @Override // coil.memory.StrongMemoryCache
    public coil.memory.MemoryCache.Value get(coil.memory.MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.StrongMemoryCache
    public int getMaxSize() {
        return 0;
    }

    @Override // coil.memory.StrongMemoryCache
    public int getSize() {
        return 0;
    }

    @Override // coil.memory.StrongMemoryCache
    public boolean remove(coil.memory.MemoryCache.Key key) {
        return false;
    }

    @Override // coil.memory.StrongMemoryCache
    public void trimMemory(int level) {
    }

    public EmptyStrongMemoryCache(coil.memory.WeakMemoryCache weakMemoryCache) {
        this.weakMemoryCache = weakMemoryCache;
    }

    @Override // coil.memory.StrongMemoryCache
    public java.util.Set<coil.memory.MemoryCache.Key> getKeys() {
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // coil.memory.StrongMemoryCache
    public void set(coil.memory.MemoryCache.Key key, android.graphics.Bitmap bitmap, java.util.Map<java.lang.String, ? extends java.lang.Object> extras) {
        this.weakMemoryCache.set(key, bitmap, extras, coil.util.Bitmaps.getAllocationByteCountCompat(bitmap));
    }
}
