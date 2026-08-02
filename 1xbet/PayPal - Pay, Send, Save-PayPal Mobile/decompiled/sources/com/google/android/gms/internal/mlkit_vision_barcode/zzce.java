package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
abstract class zzce implements java.util.Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzci zze;

    /* synthetic */ zzce(com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar, com.google.android.gms.internal.mlkit_vision_barcode.zzcd zzcdVar) {
        int i;
        this.zze = zzciVar;
        i = zzciVar.zzf;
        this.zzb = i;
        this.zzc = zzciVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i;
        i = this.zze.zzf;
        if (i != this.zzb) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        zzb();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        java.lang.Object zza = zza(i);
        this.zzc = this.zze.zzf(this.zzc);
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zzf(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar = this.zze;
        zzciVar.remove(com.google.android.gms.internal.mlkit_vision_barcode.zzci.zzg(zzciVar, i));
        this.zzc--;
        this.zzd = -1;
    }

    abstract java.lang.Object zza(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }
}
