package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class zzma {
    private final zzv zza;
    private final SparseArray zzb;

    public zzma(zzv zzvVar, SparseArray sparseArray) {
        this.zza = zzvVar;
        SparseArray sparseArray2 = new SparseArray(zzvVar.zzb());
        for (int i7 = 0; i7 < zzvVar.zzb(); i7++) {
            int zza = zzvVar.zza(i7);
            zzlz zzlzVar = (zzlz) sparseArray.get(zza);
            zzlzVar.getClass();
            sparseArray2.append(zza, zzlzVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i7) {
        return this.zza.zza(i7);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlz zzc(int i7) {
        zzlz zzlzVar = (zzlz) this.zzb.get(i7);
        zzlzVar.getClass();
        return zzlzVar;
    }

    public final boolean zzd(int i7) {
        return this.zza.zzc(i7);
    }
}
