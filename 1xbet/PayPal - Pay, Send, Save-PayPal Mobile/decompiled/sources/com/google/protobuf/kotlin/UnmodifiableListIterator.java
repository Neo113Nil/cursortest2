package com.google.protobuf.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u000e"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableListIterator;", "E", "", "delegate", "<init>", "(Ljava/util/ListIterator;)V", "", "hasNext", "()Z", "hasPrevious", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "nextIndex", "()I", "previous", "previousIndex"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UnmodifiableListIterator<E> implements java.util.ListIterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
    private final /* synthetic */ java.util.ListIterator<E> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableListIterator(java.util.ListIterator<? extends E> listIterator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listIterator, "");
        this.$$delegate_0 = listIterator;
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.$$delegate_0.previousIndex();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        return this.$$delegate_0.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.$$delegate_0.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        return this.$$delegate_0.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.$$delegate_0.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
