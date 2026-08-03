package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzihm implements java.util.Iterator, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ java.util.Iterator zza;
    private final /* synthetic */ java.util.Iterator zzb;

    zzihm(java.util.Iterator it) {
        this.zza = it;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return new com.google.android.gms.internal.ads.zziho((java.util.Map.Entry) this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
