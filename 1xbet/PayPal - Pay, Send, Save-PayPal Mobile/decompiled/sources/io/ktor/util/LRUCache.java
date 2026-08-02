package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B9\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lio/ktor/util/LRUCache;", "K", "V", "Ljava/util/LinkedHashMap;", "Lkotlin/Function1;", "supplier", "", "close", "", "maxSize", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LRUCache<K, V> extends java.util.LinkedHashMap<K, V> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<K, V> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function1<V, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return (java.util.Set<java.util.Map.Entry<K, V>>) getEntries();
    }

    public final java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> getEntries() {
        return super.entrySet();
    }

    public final java.util.Set<java.lang.Object> getKeys() {
        return super.keySet();
    }

    public final int getSize() {
        return super.size();
    }

    public final java.util.Collection<java.lang.Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        return (java.util.Set<K>) getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Collection<V> values() {
        return (java.util.Collection<V>) getValues();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LRUCache(kotlin.jvm.functions.Function1<? super K, ? extends V> function1, kotlin.jvm.functions.Function1<? super V, kotlin.Unit> function12, int i) {
        super(10, 0.75f, true);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRangesFor = function12;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry<? extends K, ? extends V> eldest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eldest, "");
        boolean z = size() > this.getHighSpeedVideoFpsRanges;
        if (z) {
            this.getHighSpeedVideoFpsRangesFor.invoke(eldest.getValue());
        }
        return z;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object key) {
        if (this.getHighSpeedVideoFpsRanges == 0) {
            return this.getHighResolutionOutputSizeshNQ4ISI.invoke(key);
        }
        synchronized (this) {
            V v = (V) super.get(key);
            if (v != null) {
                return v;
            }
            V invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(key);
            put(key, invoke);
            return invoke;
        }
    }
}
