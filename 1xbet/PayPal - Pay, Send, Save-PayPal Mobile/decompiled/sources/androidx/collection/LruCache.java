package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00012\b\u0010\u0010\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\nJ\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\fJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\fJ\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\fJ\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\fJ\u0017\u0010\u001e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\nJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001H\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\fJ\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001H\u0014¢\u0006\u0004\b#\u0010!J\u0019\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+"}, d2 = {"Landroidx/collection/LruCache;", "", "K", "V", "", "maxSize", "<init>", "(I)V", "key", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "createCount", "()I", "", "evicted", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "evictAll", "()V", "evictionCount", "get", "hitCount", "missCount", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putCount", "remove", "resize", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", io.ktor.http.ContentDisposition.Parameters.Size, "sizeOf", "", "snapshot", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "trimToSize", com.visa.cbp.getEncExpo.warmup, "Landroidx/collection/internal/Lock;", "lock", "Landroidx/collection/internal/Lock;", "Landroidx/collection/internal/LruHashMap;", "map", "Landroidx/collection/internal/LruHashMap;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final androidx.collection.internal.Lock lock;
    private final androidx.collection.internal.LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        this.maxSize = i;
        if (i <= 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        this.map = new androidx.collection.internal.LruHashMap<>(0, 0.75f);
        this.lock = new androidx.collection.internal.Lock();
    }

    public final V get(K key) {
        V v;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        synchronized (this.lock) {
            V v2 = this.map.get(key);
            if (v2 != null) {
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V create = create(key);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                this.createCount++;
                v = (V) this.map.put(key, create);
                if (v != null) {
                    this.map.put(key, v);
                } else {
                    this.size += safeSizeOf(key, create);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
            if (v != null) {
                entryRemoved(false, key, create, v);
                return v;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final V put(K key, V value) {
        V put;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        synchronized (this.lock) {
            this.putCount++;
            this.size += safeSizeOf(key, value);
            put = this.map.put(key, value);
            if (put != null) {
                this.size -= safeSizeOf(key, put);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (put != null) {
            entryRemoved(false, key, put, value);
        }
        trimToSize(this.maxSize);
        return put;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void trimToSize(int maxSize) {
        java.lang.Object key;
        java.lang.Object value;
        while (true) {
            synchronized (this.lock) {
                if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                    androidx.collection.internal.RuntimeHelpersKt.throwIllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if (this.size <= maxSize || this.map.isEmpty()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) kotlin.collections.CollectionsKt.firstOrNull(this.map.getEntries());
                if (entry == null) {
                    return;
                }
                key = entry.getKey();
                value = entry.getValue();
                this.map.remove(key);
                this.size -= safeSizeOf(key, value);
                this.evictionCount++;
            }
            entryRemoved(true, key, value, null);
        }
    }

    public final V remove(K key) {
        V remove;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        synchronized (this.lock) {
            remove = this.map.remove(key);
            if (remove != null) {
                this.size -= safeSizeOf(key, remove);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (remove != null) {
            entryRemoved(false, key, remove, null);
        }
        return remove;
    }

    private final int safeSizeOf(K key, V value) {
        int sizeOf = sizeOf(key, value);
        if (sizeOf < 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalStateException("Negative size: " + key + '=' + value);
        }
        return sizeOf;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.Map<K, V> snapshot() {
        java.util.LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(this.map.getEntries().size());
            java.util.Iterator<T> it = this.map.getEntries().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
            linkedHashMap = linkedHashMap2;
        }
        return linkedHashMap;
    }

    public java.lang.String toString() {
        java.lang.String str;
        synchronized (this.lock) {
            int i = this.hitCount;
            int i2 = this.missCount + i;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    public void resize(int maxSize) {
        if (maxSize <= 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = maxSize;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        trimToSize(maxSize);
    }

    protected int sizeOf(K key, V value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return 1;
    }

    public void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldValue, "");
    }

    protected V create(K key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return null;
    }
}
