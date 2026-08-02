package com.google.android.gms.internal.firebase_database;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzeg implements Callable<List<? extends zzgy>> {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ zzee zzlb;
    private final /* synthetic */ zzex zzlc;
    private final /* synthetic */ Map zzld;

    zzeg(zzee zzeeVar, zzex zzexVar, zzch zzchVar, Map map) {
        this.zzlb = zzeeVar;
        this.zzlc = zzexVar;
        this.zzgy = zzchVar;
        this.zzld = map;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends zzgy> call() throws Exception {
        zzhh zzb;
        zzfv zzfvVar;
        List<? extends zzgy> zza;
        zzb = this.zzlb.zzb(this.zzlc);
        if (zzb == null) {
            return Collections.emptyList();
        }
        zzch zza2 = zzch.zza(zzb.zzg(), this.zzgy);
        zzbv zzg = zzbv.zzg((Map<zzch, zzja>) this.zzld);
        zzfvVar = this.zzlb.zzkp;
        zzfvVar.zzd(this.zzgy, zzg);
        zza = this.zzlb.zza(zzb, new zzfk(zzfn.zzc(zzb.zzen()), zza2, zzg));
        return zza;
    }
}
