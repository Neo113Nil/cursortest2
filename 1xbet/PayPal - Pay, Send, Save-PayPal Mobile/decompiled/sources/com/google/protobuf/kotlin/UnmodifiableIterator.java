package com.google.protobuf.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableIterator;", "E", "", "delegate", "<init>", "(Ljava/util/Iterator;)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UnmodifiableIterator<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
    private final /* synthetic */ java.util.Iterator<E> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableIterator(java.util.Iterator<? extends E> it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "");
        this.$$delegate_0 = it;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final E next() {
        return this.$$delegate_0.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }
}
