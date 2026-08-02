package com.google.android.gms.internal.firebase_database;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzes implements Callable<List<? extends zzgy>> {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ zzee zzlb;
    private final /* synthetic */ zzex zzlc;
    private final /* synthetic */ zzja zzln;

    zzes(zzee zzeeVar, zzex zzexVar, zzch zzchVar, zzja zzjaVar) {
        this.zzlb = zzeeVar;
        this.zzlc = zzexVar;
        this.zzgy = zzchVar;
        this.zzln = zzjaVar;
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
        zzhh zzal = zza2.isEmpty() ? zzb : zzhh.zzal(this.zzgy);
        zzfvVar = this.zzlb.zzkp;
        zzfvVar.zza(zzal, this.zzln);
        zza = this.zzlb.zza(zzb, new zzfp(zzfn.zzc(zzb.zzen()), zza2, this.zzln));
        return zza;
    }
}
