package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u001a/\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "", "initialCapacity", "", "createMapForCache", "(I)Ljava/util/Map;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CreateMapForCacheKt {
    public static final <K, V> java.util.Map<K, V> createMapForCache(int i) {
        return new java.util.concurrent.ConcurrentHashMap(i);
    }
}
