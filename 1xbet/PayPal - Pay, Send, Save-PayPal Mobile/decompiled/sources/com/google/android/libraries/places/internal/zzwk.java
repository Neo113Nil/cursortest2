package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzwk implements java.util.Iterator {
    final /* synthetic */ com.google.android.libraries.places.internal.zzwl zza;
    private int zzb;

    zzwk(com.google.android.libraries.places.internal.zzwl zzwlVar) {
        java.util.Objects.requireNonNull(zzwlVar);
        this.zza = zzwlVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        com.google.android.libraries.places.internal.zzwl zzwlVar = this.zza;
        return i < zzwlVar.zzc() - zzwlVar.zzb();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.zzb;
        com.google.android.libraries.places.internal.zzwl zzwlVar = this.zza;
        if (i >= zzwlVar.zzc() - zzwlVar.zzb()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = zzwlVar.zzb.zzb()[zzwlVar.zzb() + i];
        this.zzb = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
