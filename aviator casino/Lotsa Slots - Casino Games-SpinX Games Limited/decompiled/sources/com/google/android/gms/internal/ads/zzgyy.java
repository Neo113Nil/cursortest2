package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzgyy implements java.util.Iterator {
    final java.util.Iterator zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    abstract java.lang.Object zza(java.lang.Object obj);

    zzgyy(java.util.Iterator it) {
        it.getClass();
        this.zzb = it;
    }
}
