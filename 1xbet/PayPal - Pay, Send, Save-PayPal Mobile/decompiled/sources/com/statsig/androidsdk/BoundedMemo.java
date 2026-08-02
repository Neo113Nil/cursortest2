package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0005J)\u0010\u000b\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/statsig/androidsdk/BoundedMemo;", "K", "V", "", "<init>", "()V", "", "clear", "key", "Lkotlin/Function1;", "mappingFunction", "computeIfAbsent", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", io.ktor.http.ContentDisposition.Parameters.Size, "()I", "Ljava/util/concurrent/ConcurrentHashMap;", com.datadog.trace.api.DDSpanTypes.CACHE, "Ljava/util/concurrent/ConcurrentHashMap;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BoundedMemo<K, V> {
    private static final int MAX_CACHE_SIZE = 1000;
    private final java.util.concurrent.ConcurrentHashMap<K, V> cache = new java.util.concurrent.ConcurrentHashMap<>();

    public final V computeIfAbsent(K key, kotlin.jvm.functions.Function1<? super K, ? extends V> mappingFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingFunction, "");
        if (this.cache.size() >= 1000) {
            this.cache.clear();
        }
        java.util.concurrent.ConcurrentHashMap<K, V> concurrentHashMap = this.cache;
        V v = concurrentHashMap.get(key);
        if (v != null) {
            return v;
        }
        V invoke = mappingFunction.invoke(key);
        V putIfAbsent = concurrentHashMap.putIfAbsent(key, invoke);
        return putIfAbsent == null ? invoke : putIfAbsent;
    }

    public final int size() {
        return this.cache.size();
    }

    public final void clear() {
        this.cache.clear();
    }
}
