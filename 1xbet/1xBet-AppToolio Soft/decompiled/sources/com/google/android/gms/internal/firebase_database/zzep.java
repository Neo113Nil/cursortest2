package com.google.android.gms.internal.firebase_database;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzep implements Callable<List<? extends zzgy>> {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ zzee zzlb;
    private final /* synthetic */ Map zzld;

    zzep(zzee zzeeVar, Map map, zzch zzchVar) {
        this.zzlb = zzeeVar;
        this.zzld = map;
        this.zzgy = zzchVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends zzgy> call() throws Exception {
        zzfv zzfvVar;
        List<? extends zzgy> zza;
        zzbv zzg = zzbv.zzg((Map<zzch, zzja>) this.zzld);
        zzfvVar = this.zzlb.zzkp;
        zzfvVar.zzd(this.zzgy, zzg);
        zza = this.zzlb.zza(new zzfk(zzfn.zzmv, this.zzgy, zzg));
        return zza;
    }
}
