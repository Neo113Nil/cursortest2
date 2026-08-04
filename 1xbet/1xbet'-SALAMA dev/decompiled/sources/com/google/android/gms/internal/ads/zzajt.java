package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class zzajt implements zzacy {
    private final zzacy zzb;
    private final zzajq zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzajt(zzacy zzacyVar, zzajq zzajqVar) {
        this.zzb = zzacyVar;
        this.zzc = zzajqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final void zzG() {
        this.zzb.zzG();
        if (this.zze) {
            for (int i7 = 0; i7 < this.zzd.size(); i7++) {
                ((zzajv) this.zzd.valueAt(i7)).zzb(true);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final void zzP(zzadu zzaduVar) {
        this.zzb.zzP(zzaduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final zzaeb zzw(int i7, int i8) {
        if (i8 != 3) {
            this.zze = true;
            return this.zzb.zzw(i7, i8);
        }
        zzajv zzajvVar = (zzajv) this.zzd.get(i7);
        if (zzajvVar != null) {
            return zzajvVar;
        }
        zzajv zzajvVar2 = new zzajv(this.zzb.zzw(i7, 3), this.zzc);
        this.zzd.put(i7, zzajvVar2);
        return zzajvVar2;
    }
}
