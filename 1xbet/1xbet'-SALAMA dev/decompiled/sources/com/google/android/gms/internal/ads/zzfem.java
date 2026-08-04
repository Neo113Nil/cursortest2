package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfem {
    final /* synthetic */ zzfew zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfem(zzfew zzfewVar, Object obj, List list, zzfev zzfevVar) {
        this.zza = zzfewVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfeu zza(Callable callable) {
        zzgba zzgbaVarZzb = zzgbc.zzb(this.zzc);
        I3.b bVarZza = zzgbaVarZzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfel
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzbza.zzg);
        I3.b bVarZza2 = zzgbaVarZzb.zza(callable, this.zza.zzb);
        return new zzfeu(this.zza, this.zzb, bVarZza, this.zzc, bVarZza2);
    }
}
