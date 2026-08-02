package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzvf implements java.util.Iterator {
    final /* synthetic */ com.google.android.libraries.places.internal.zzvg zza;
    private int zzb;

    zzvf(com.google.android.libraries.places.internal.zzvg zzvgVar) {
        java.util.Objects.requireNonNull(zzvgVar);
        this.zza = zzvgVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        int i = this.zzb;
        this.zzb = i + 1;
        com.google.android.libraries.places.internal.zzvi zzviVar = this.zza.zza;
        return zzviVar.zzd(zzviVar.zzf()[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zza.zzg();
    }
}
