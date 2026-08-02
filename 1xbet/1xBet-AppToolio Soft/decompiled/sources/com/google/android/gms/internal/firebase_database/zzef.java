package com.google.android.gms.internal.firebase_database;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzef implements Callable<List<? extends zzgy>> {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ long zzjh;
    private final /* synthetic */ boolean zzkx;
    private final /* synthetic */ zzja zzky;
    private final /* synthetic */ zzja zzkz;
    private final /* synthetic */ boolean zzla;
    private final /* synthetic */ zzee zzlb;

    zzef(zzee zzeeVar, boolean z, zzch zzchVar, zzja zzjaVar, long j, zzja zzjaVar2, boolean z2) {
        this.zzlb = zzeeVar;
        this.zzkx = z;
        this.zzgy = zzchVar;
        this.zzky = zzjaVar;
        this.zzjh = j;
        this.zzkz = zzjaVar2;
        this.zzla = z2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends zzgy> call() throws Exception {
        zzfd zzfdVar;
        List<? extends zzgy> zza;
        zzfv zzfvVar;
        if (this.zzkx) {
            zzfvVar = this.zzlb.zzkp;
            zzfvVar.zza(this.zzgy, this.zzky, this.zzjh);
        }
        zzfdVar = this.zzlb.zzkr;
        zzfdVar.zza(this.zzgy, this.zzkz, Long.valueOf(this.zzjh), this.zzla);
        if (!this.zzla) {
            return Collections.emptyList();
        }
        zza = this.zzlb.zza(new zzfp(zzfn.zzmu, this.zzgy, this.zzkz));
        return zza;
    }
}
