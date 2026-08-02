package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class zzang implements zzamz {
    final /* synthetic */ zzani zza;
    private final zzec zzb = new zzec(new byte[4], 4);

    public zzang(zzani zzaniVar) {
        this.zza = zzaniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzed zzedVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i7;
        if (zzedVar.zzm() == 0 && (zzedVar.zzm() & 128) != 0) {
            zzedVar.zzM(6);
            int zzb = zzedVar.zzb() / 4;
            for (int i8 = 0; i8 < zzb; i8++) {
                zzedVar.zzG(this.zzb, 4);
                zzec zzecVar = this.zzb;
                int zzd = zzecVar.zzd(16);
                zzecVar.zzn(3);
                if (zzd == 0) {
                    this.zzb.zzn(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    sparseArray2 = this.zza.zzg;
                    if (sparseArray2.get(zzd2) == null) {
                        zzani zzaniVar = this.zza;
                        sparseArray3 = zzaniVar.zzg;
                        sparseArray3.put(zzd2, new zzana(new zzanh(zzaniVar, zzd2)));
                        zzani zzaniVar2 = this.zza;
                        i7 = zzaniVar2.zzm;
                        zzaniVar2.zzm = i7 + 1;
                    }
                }
            }
            sparseArray = this.zza.zzg;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzek zzekVar, zzacy zzacyVar, zzanm zzanmVar) {
    }
}
