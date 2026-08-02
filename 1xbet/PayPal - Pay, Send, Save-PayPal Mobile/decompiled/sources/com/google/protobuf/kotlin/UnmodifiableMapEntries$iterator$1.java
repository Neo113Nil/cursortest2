package com.google.protobuf.kotlin;

/* JADX INFO: Add missing generic type declarations: [V, K] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableMapEntries$iterator$1;", "", "", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/util/Map$Entry;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UnmodifiableMapEntries$iterator$1<K, V> implements java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>>, kotlin.jvm.internal.markers.KMappedMarker {
    private final /* synthetic */ java.util.Iterator<java.util.Map.Entry<K, V>> $$delegate_0;
    final /* synthetic */ java.util.Iterator<java.util.Map.Entry<K, V>> $itr;

    /* JADX WARN: Multi-variable type inference failed */
    UnmodifiableMapEntries$iterator$1(java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> it) {
        this.$itr = it;
        this.$$delegate_0 = it;
    }

    @Override // java.util.Iterator
    public final java.util.Map.Entry<K, V> next() {
        return new com.google.protobuf.kotlin.UnmodifiableMapEntry(this.$itr.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }
}
