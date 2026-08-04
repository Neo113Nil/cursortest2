package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class zzgvq extends zzgvr {
    final /* synthetic */ zzgvy zza;
    private int zzb = 0;
    private final int zzc;

    public zzgvq(zzgvy zzgvyVar) {
        this.zza = zzgvyVar;
        this.zzc = zzgvyVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final byte zza() {
        int i7 = this.zzb;
        if (i7 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i7 + 1;
        return this.zza.zzb(i7);
    }
}
