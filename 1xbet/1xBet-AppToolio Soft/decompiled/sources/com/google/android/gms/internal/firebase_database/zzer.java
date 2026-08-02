package com.google.android.gms.internal.firebase_database;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzer implements Callable<List<? extends zzgy>> {
    private final /* synthetic */ zzee zzlb;
    private final /* synthetic */ zzex zzlc;

    zzer(zzee zzeeVar, zzex zzexVar) {
        this.zzlb = zzeeVar;
        this.zzlc = zzexVar;
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
        zzfvVar = this.zzlb.zzkp;
        zzfvVar.zzi(zzb);
        zza = this.zzlb.zza(zzb, new zzfj(zzfn.zzc(zzb.zzen()), zzch.zzbt()));
        return zza;
    }
}
