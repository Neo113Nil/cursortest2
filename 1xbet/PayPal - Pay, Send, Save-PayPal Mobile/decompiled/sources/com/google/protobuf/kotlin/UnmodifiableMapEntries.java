package com.google.protobuf.kotlin;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableMapEntries;", "K", "V", "Lcom/google/protobuf/kotlin/UnmodifiableCollection;", "", "", "delegate", "<init>", "(Ljava/util/Set;)V", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/Set;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UnmodifiableMapEntries<K, V> extends com.google.protobuf.kotlin.UnmodifiableCollection<java.util.Map.Entry<? extends K, ? extends V>> implements java.util.Set<java.util.Map.Entry<? extends K, ? extends V>>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.Set<java.util.Map.Entry<K, V>> delegate;

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return contains((java.util.Map.Entry<? extends java.lang.Object, ? extends java.lang.Object>) obj);
        }
        return false;
    }

    public final /* bridge */ boolean contains(java.util.Map.Entry<? extends java.lang.Object, ? extends java.lang.Object> entry) {
        return super.contains((com.google.protobuf.kotlin.UnmodifiableMapEntries<K, V>) entry);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntries(java.util.Set<? extends java.util.Map.Entry<? extends K, ? extends V>> set) {
        super(set);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.delegate = set;
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new com.google.protobuf.kotlin.UnmodifiableMapEntries$iterator$1(this.delegate.iterator());
    }
}
