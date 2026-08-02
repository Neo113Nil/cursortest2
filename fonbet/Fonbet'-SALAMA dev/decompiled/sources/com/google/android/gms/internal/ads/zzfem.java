package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
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
        zzgbn zzgbnVar;
        zzgba zzb = zzgbc.zzb(this.zzc);
        I3.b zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfel
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzbza.zzg);
        zzgbnVar = this.zza.zzb;
        I3.b zza2 = zzb.zza(callable, zzgbnVar);
        return new zzfeu(this.zza, this.zzb, zza, this.zzc, zza2);
    }
}
