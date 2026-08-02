package com.google.android.gms.internal.firebase_database;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzel implements Callable<List<? extends zzgy>> {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ long zzjh;
    private final /* synthetic */ boolean zzkx;
    private final /* synthetic */ zzee zzlb;
    private final /* synthetic */ zzbv zzlj;
    private final /* synthetic */ zzbv zzlk;

    zzel(zzee zzeeVar, boolean z, zzch zzchVar, zzbv zzbvVar, long j, zzbv zzbvVar2) {
        this.zzlb = zzeeVar;
        this.zzkx = z;
        this.zzgy = zzchVar;
        this.zzlj = zzbvVar;
        this.zzjh = j;
        this.zzlk = zzbvVar2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends zzgy> call() throws Exception {
        zzfd zzfdVar;
        List<? extends zzgy> zza;
        zzfv zzfvVar;
        if (this.zzkx) {
            zzfvVar = this.zzlb.zzkp;
            zzfvVar.zza(this.zzgy, this.zzlj, this.zzjh);
        }
        zzfdVar = this.zzlb.zzkr;
        zzfdVar.zza(this.zzgy, this.zzlk, Long.valueOf(this.zzjh));
        zza = this.zzlb.zza(new zzfk(zzfn.zzmu, this.zzgy, this.zzlk));
        return zza;
    }
}
