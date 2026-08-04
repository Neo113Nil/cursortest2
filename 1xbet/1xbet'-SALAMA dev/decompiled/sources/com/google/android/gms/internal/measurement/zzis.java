package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class zzis extends zziu {
    final /* synthetic */ zzjb zza;
    private int zzb = 0;
    private final int zzc;

    public zzis(zzjb zzjbVar) {
        this.zza = zzjbVar;
        this.zzc = zzjbVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final byte zza() {
        int i7 = this.zzb;
        if (i7 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i7 + 1;
        return this.zza.zzb(i7);
    }
}
