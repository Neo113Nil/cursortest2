package com.google.protobuf.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u001e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableSet;", "E", "Lcom/google/protobuf/kotlin/UnmodifiableCollection;", "", "", "delegate", "<init>", "(Ljava/util/Collection;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UnmodifiableSet<E> extends com.google.protobuf.kotlin.UnmodifiableCollection<E> implements java.util.Set<E>, kotlin.jvm.internal.markers.KMappedMarker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableSet(java.util.Collection<? extends E> collection) {
        super(collection);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
    }
}
