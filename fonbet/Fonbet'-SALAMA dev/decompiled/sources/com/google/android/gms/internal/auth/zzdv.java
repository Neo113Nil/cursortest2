package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzdv extends zzdx {
    final /* synthetic */ zzee zza;
    private int zzb = 0;
    private final int zzc;

    public zzdv(zzee zzeeVar) {
        this.zza = zzeeVar;
        this.zzc = zzeeVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzdz
    public final byte zza() {
        int i7 = this.zzb;
        if (i7 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i7 + 1;
        return this.zza.zzb(i7);
    }
}
