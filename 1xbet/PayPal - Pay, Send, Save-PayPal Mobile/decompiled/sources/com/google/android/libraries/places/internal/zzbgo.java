package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbgo implements java.util.ListIterator, kotlin.jvm.internal.markers.KMappedMarker {
    private final /* synthetic */ java.util.ListIterator zza;

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return this.zza.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        return this.zza.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public zzbgo(java.util.ListIterator listIterator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listIterator, "");
        this.zza = listIterator;
    }
}
