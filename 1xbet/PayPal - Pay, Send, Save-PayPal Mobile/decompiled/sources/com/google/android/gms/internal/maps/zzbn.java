package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
final class zzbn extends com.google.android.gms.internal.maps.zzbx {
    private final java.lang.Object zza;
    private boolean zzb;

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.zzb) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    zzbn(java.lang.Object obj) {
        this.zza = obj;
    }
}
