package io.ktor.util.collections;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ.\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0017\u0010\u0012\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lio/ktor/util/collections/CopyOnWriteHashMap;", "", "K", "V", "<init>", "()V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "remove", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "producer", "computeIfAbsent", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CopyOnWriteHashMap<K, V> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.collections.CopyOnWriteHashMap.class, java.lang.Object.class, "current");
    private volatile /* synthetic */ java.lang.Object current = kotlin.collections.MapsKt.emptyMap();

    public final V put(K key, V value) {
        java.util.Map map;
        java.util.HashMap hashMap;
        V v;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        do {
            map = (java.util.Map) this.current;
            if (map.get(key) == value) {
                return value;
            }
            hashMap = new java.util.HashMap(map);
            v = (V) hashMap.put(key, value);
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRanges, this, map, hashMap));
        return v;
    }

    public final V get(K key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return (V) ((java.util.Map) this.current).get(key);
    }

    public final void set(K key, V value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        put(key, value);
    }

    public final V remove(K key) {
        java.util.Map map;
        java.util.HashMap hashMap;
        V v;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        do {
            map = (java.util.Map) this.current;
            if (map.get(key) == null) {
                return null;
            }
            hashMap = new java.util.HashMap(map);
            v = (V) hashMap.remove(key);
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRanges, this, map, hashMap));
        return v;
    }

    public final V computeIfAbsent(K key, kotlin.jvm.functions.Function1<? super K, ? extends V> producer) {
        java.util.Map map;
        java.util.HashMap hashMap;
        V invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(producer, "");
        do {
            map = (java.util.Map) this.current;
            V v = (V) map.get(key);
            if (v != null) {
                return v;
            }
            hashMap = new java.util.HashMap(map);
            invoke = producer.invoke(key);
            hashMap.put(key, invoke);
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRanges, this, map, hashMap));
        return invoke;
    }
}
