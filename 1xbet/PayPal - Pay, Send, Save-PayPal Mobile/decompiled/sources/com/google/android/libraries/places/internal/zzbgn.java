package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbgn implements java.util.Iterator, kotlin.jvm.internal.markers.KMappedMarker {
    private final /* synthetic */ java.util.Iterator zza;

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public zzbgn(java.util.Iterator it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "");
        this.zza = it;
    }
}
