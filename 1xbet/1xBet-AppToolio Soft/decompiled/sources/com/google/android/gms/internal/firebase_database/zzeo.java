package com.google.android.gms.internal.firebase_database;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzeo implements Callable<List<? extends zzgy>> {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ zzja zzkz;
    private final /* synthetic */ zzee zzlb;

    zzeo(zzee zzeeVar, zzch zzchVar, zzja zzjaVar) {
        this.zzlb = zzeeVar;
        this.zzgy = zzchVar;
        this.zzkz = zzjaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends zzgy> call() throws Exception {
        zzfv zzfvVar;
        List<? extends zzgy> zza;
        zzfvVar = this.zzlb.zzkp;
        zzfvVar.zza(zzhh.zzal(this.zzgy), this.zzkz);
        zza = this.zzlb.zza(new zzfp(zzfn.zzmv, this.zzgy, this.zzkz));
        return zza;
    }
}
