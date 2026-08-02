package com.google.protobuf.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00008\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00028\u00018\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableMapEntry;", "K", "V", "", "delegate", "<init>", "(Ljava/util/Map$Entry;)V", "getKey", "()Ljava/lang/Object;", "key", "getValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UnmodifiableMapEntry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMappedMarker {
    private final /* synthetic */ java.util.Map.Entry<K, V> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntry(java.util.Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        this.$$delegate_0 = entry;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.$$delegate_0.getKey();
    }
}
