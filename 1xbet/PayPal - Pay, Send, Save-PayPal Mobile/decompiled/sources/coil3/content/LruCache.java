package coil3.content;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0003\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00012\b\u0010\r\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0007J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u000bR \u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0007R$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048G@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&8G¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Lcoil3/util/LruCache;", "", "K", "V", "", "maxSize", "<init>", "(J)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)J", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "", "entryRemoved", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "remove", io.ktor.http.ContentDisposition.Parameters.Size, "trimToSize", "clear", "()V", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "J", "getMaxSize", "()J", "setMaxSize", "getSize", "", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class LruCache<K, V> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<K, V> getHighSpeedVideoFpsRanges = coil3.content.Collections_jvmCommonKt.LruMutableMap$default(0, 0.0f, 3, null);
    private long maxSize;
    private long size;

    public void entryRemoved(K key, V oldValue, V newValue) {
    }

    public long sizeOf(K key, V value) {
        return 1L;
    }

    public LruCache(long j) {
        this.maxSize = j;
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0".toString());
        }
    }

    public final long getMaxSize() {
        return this.maxSize;
    }

    public final void setMaxSize(long j) {
        this.maxSize = j;
        trimToSize(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getSize() {
        if (this.size == -1) {
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.entrySet().iterator();
            long j = 0;
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                j += getHighSpeedVideoFpsRangesFor(entry.getKey(), entry.getValue());
            }
            this.size = j;
        }
        return this.size;
    }

    public final java.util.Set<K> getKeys() {
        return kotlin.collections.CollectionsKt.toSet(this.getHighSpeedVideoFpsRanges.keySet());
    }

    public final V put(K key, V value) {
        V put = this.getHighSpeedVideoFpsRanges.put(key, value);
        this.size = getSize() + getHighSpeedVideoFpsRangesFor(key, value);
        if (put != null) {
            this.size = getSize() - getHighSpeedVideoFpsRangesFor(key, put);
            entryRemoved(key, put, value);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final V get(K key) {
        return this.getHighSpeedVideoFpsRanges.get(key);
    }

    public final V remove(K key) {
        V remove = this.getHighSpeedVideoFpsRanges.remove(key);
        if (remove != null) {
            this.size = getSize() - getHighSpeedVideoFpsRangesFor(key, remove);
            entryRemoved(key, remove, null);
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void trimToSize(long size) {
        while (getSize() > size) {
            if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                if (getSize() != 0) {
                    throw new java.lang.IllegalStateException("sizeOf() is returning inconsistent values".toString());
                }
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) kotlin.collections.CollectionsKt.first(this.getHighSpeedVideoFpsRanges.entrySet());
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            this.getHighSpeedVideoFpsRanges.remove(key);
            this.size = getSize() - getHighSpeedVideoFpsRangesFor(key, value);
            entryRemoved(key, value, null);
        }
    }

    public final void clear() {
        trimToSize(-1L);
    }

    private final long getHighSpeedVideoFpsRangesFor(K p0, V p1) {
        try {
            long sizeOf = sizeOf(p0, p1);
            if (sizeOf >= 0) {
                return sizeOf;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("sizeOf(");
            sb.append(p0);
            sb.append(", ");
            sb.append(p1);
            sb.append(") returned a negative value: ");
            sb.append(sizeOf);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        } catch (java.lang.Exception e) {
            this.size = -1L;
            throw e;
        }
    }
}
