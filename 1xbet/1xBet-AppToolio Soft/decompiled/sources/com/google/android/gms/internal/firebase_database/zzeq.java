package com.google.android.gms.internal.firebase_database;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzeq implements Callable<List<? extends zzgy>> {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ zzee zzlb;

    zzeq(zzee zzeeVar, zzch zzchVar) {
        this.zzlb = zzeeVar;
        this.zzgy = zzchVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends zzgy> call() throws Exception {
        zzfv zzfvVar;
        List<? extends zzgy> zza;
        zzfvVar = this.zzlb.zzkp;
        zzfvVar.zzi(zzhh.zzal(this.zzgy));
        zza = this.zzlb.zza(new zzfj(zzfn.zzmv, this.zzgy));
        return zza;
    }
}
