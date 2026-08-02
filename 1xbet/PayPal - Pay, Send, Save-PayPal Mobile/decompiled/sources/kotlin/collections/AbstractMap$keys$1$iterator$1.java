package kotlin.collections;

/* JADX INFO: Add missing generic type declarations: [K] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/collections/AbstractMap$keys$1$iterator$1;", "", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AbstractMap$keys$1$iterator$1<K> implements java.util.Iterator<K>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ java.util.Iterator<java.util.Map.Entry<K, V>> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    AbstractMap$keys$1$iterator$1(java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> it) {
        this.getHighResolutionOutputSizeshNQ4ISI = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        return (K) ((java.util.Map.Entry) this.getHighResolutionOutputSizeshNQ4ISI.next()).getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
