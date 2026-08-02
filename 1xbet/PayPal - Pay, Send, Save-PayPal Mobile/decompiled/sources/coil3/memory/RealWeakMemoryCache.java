package coil3.memory;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0003RV\u0010\u001e\u001a>\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c0\u0019j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c`\u001d8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Lcoil3/memory/RealWeakMemoryCache;", "Lcoil3/memory/WeakMemoryCache;", "<init>", "()V", "Lcoil3/memory/MemoryCache$Key;", "key", "Lcoil3/memory/MemoryCache$Value;", "get", "(Lcoil3/memory/MemoryCache$Key;)Lcoil3/memory/MemoryCache$Value;", "Lcoil3/Image;", "image", "", "", "", "extras", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "set", "(Lcoil3/memory/MemoryCache$Key;Lcoil3/Image;Ljava/util/Map;J)V", "", "remove", "(Lcoil3/memory/MemoryCache$Key;)Z", "clear", "cleanUp$coil_core", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lcoil3/memory/RealWeakMemoryCache$InternalValue;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "Lkotlin/collections/getHighSpeedVideoSizes;", com.datadog.trace.api.DDSpanTypes.CACHE, "Ljava/util/LinkedHashMap;", "getCache$coil_core", "()Ljava/util/LinkedHashMap;", "", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Companion", "InternalValue"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealWeakMemoryCache implements coil3.memory.WeakMemoryCache {
    private final java.util.LinkedHashMap<coil3.memory.MemoryCache.Key, java.util.ArrayList<coil3.memory.RealWeakMemoryCache.InternalValue>> cache = new java.util.LinkedHashMap<>();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    public final java.util.LinkedHashMap<coil3.memory.MemoryCache.Key, java.util.ArrayList<coil3.memory.RealWeakMemoryCache.InternalValue>> getCache$coil_core() {
        return this.cache;
    }

    @Override // coil3.memory.WeakMemoryCache
    public final java.util.Set<coil3.memory.MemoryCache.Key> getKeys() {
        return kotlin.collections.CollectionsKt.toSet(this.cache.keySet());
    }

    @Override // coil3.memory.WeakMemoryCache
    public final coil3.memory.MemoryCache.Value get(coil3.memory.MemoryCache.Key key) {
        java.util.ArrayList<coil3.memory.RealWeakMemoryCache.InternalValue> arrayList = this.cache.get(key);
        coil3.memory.MemoryCache.Value value = null;
        if (arrayList == null) {
            return null;
        }
        java.util.ArrayList<coil3.memory.RealWeakMemoryCache.InternalValue> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            coil3.memory.RealWeakMemoryCache.InternalValue internalValue = arrayList2.get(i);
            coil3.Image image = internalValue.getImage().get();
            coil3.memory.MemoryCache.Value value2 = image != null ? new coil3.memory.MemoryCache.Value(image, internalValue.getExtras()) : null;
            if (value2 != null) {
                value = value2;
                break;
            }
            i++;
        }
        int i2 = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = i2 + 1;
        if (i2 >= 10) {
            cleanUp$coil_core();
        }
        return value;
    }

    @Override // coil3.memory.WeakMemoryCache
    public final void set(coil3.memory.MemoryCache.Key key, coil3.Image image, java.util.Map<java.lang.String, ? extends java.lang.Object> extras, long size) {
        java.util.LinkedHashMap<coil3.memory.MemoryCache.Key, java.util.ArrayList<coil3.memory.RealWeakMemoryCache.InternalValue>> linkedHashMap = this.cache;
        java.util.ArrayList<coil3.memory.RealWeakMemoryCache.InternalValue> arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            linkedHashMap.put(key, arrayList);
        }
        java.util.ArrayList<coil3.memory.RealWeakMemoryCache.InternalValue> arrayList2 = arrayList;
        coil3.memory.RealWeakMemoryCache.InternalValue internalValue = new coil3.memory.RealWeakMemoryCache.InternalValue(new java.lang.ref.WeakReference(image), extras, size);
        if (arrayList2.isEmpty()) {
            arrayList2.add(internalValue);
        } else {
            int size2 = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size2) {
                    break;
                }
                coil3.memory.RealWeakMemoryCache.InternalValue internalValue2 = arrayList2.get(i);
                if (size < internalValue2.getSize()) {
                    i++;
                } else if (internalValue2.getImage().get() == image) {
                    arrayList2.set(i, internalValue);
                } else {
                    arrayList2.add(i, internalValue);
                }
            }
        }
        int i2 = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = i2 + 1;
        if (i2 >= 10) {
            cleanUp$coil_core();
        }
    }

    @Override // coil3.memory.WeakMemoryCache
    public final boolean remove(coil3.memory.MemoryCache.Key key) {
        return this.cache.remove(key) != null;
    }

    @Override // coil3.memory.WeakMemoryCache
    public final void clear() {
        this.getHighSpeedVideoSizes = 0;
        this.cache.clear();
    }

    public final void cleanUp$coil_core() {
        java.lang.ref.WeakReference<coil3.Image> image;
        this.getHighSpeedVideoSizes = 0;
        java.util.Iterator<java.util.ArrayList<coil3.memory.RealWeakMemoryCache.InternalValue>> it = this.cache.values().iterator();
        while (it.hasNext()) {
            java.util.ArrayList<coil3.memory.RealWeakMemoryCache.InternalValue> next = it.next();
            if (next.size() <= 1) {
                coil3.memory.RealWeakMemoryCache.InternalValue internalValue = (coil3.memory.RealWeakMemoryCache.InternalValue) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) next);
                if (((internalValue == null || (image = internalValue.getImage()) == null) ? null : image.get()) == null) {
                    it.remove();
                }
            } else {
                java.util.ArrayList<coil3.memory.RealWeakMemoryCache.InternalValue> arrayList = next;
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (arrayList.get(i3).getImage().get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcoil3/memory/RealWeakMemoryCache$InternalValue;", "", "Ljava/lang/ref/WeakReference;", "Lcoil3/Image;", "Lcoil3/util/getHighResolutionOutputSizeshNQ4ISI;", "image", "", "", "extras", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(Ljava/lang/ref/WeakReference;Ljava/util/Map;J)V", "Ljava/lang/ref/WeakReference;", "getImage", "()Ljava/lang/ref/WeakReference;", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "J", "getSize", "()J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalValue {
        private final java.util.Map<java.lang.String, java.lang.Object> extras;
        private final java.lang.ref.WeakReference<coil3.Image> image;
        private final long size;

        public InternalValue(java.lang.ref.WeakReference<coil3.Image> weakReference, java.util.Map<java.lang.String, ? extends java.lang.Object> map, long j) {
            this.image = weakReference;
            this.extras = map;
            this.size = j;
        }

        public final java.lang.ref.WeakReference<coil3.Image> getImage() {
            return this.image;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getExtras() {
            return this.extras;
        }

        public final long getSize() {
            return this.size;
        }
    }
}
