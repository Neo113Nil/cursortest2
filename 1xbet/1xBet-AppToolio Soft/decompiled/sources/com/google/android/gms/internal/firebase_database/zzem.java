package com.google.android.gms.internal.firebase_database;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzem implements Callable<List<? extends zzgy>> {
    private final /* synthetic */ long zzjh;
    private final /* synthetic */ boolean zzkx;
    private final /* synthetic */ zzee zzlb;
    private final /* synthetic */ boolean zzll;
    private final /* synthetic */ zzkf zzlm;

    zzem(zzee zzeeVar, boolean z, long j, boolean z2, zzkf zzkfVar) {
        this.zzlb = zzeeVar;
        this.zzkx = z;
        this.zzjh = j;
        this.zzll = z2;
        this.zzlm = zzkfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends zzgy> call() throws Exception {
        zzfd zzfdVar;
        zzfd zzfdVar2;
        List<? extends zzgy> zza;
        zzfv zzfvVar;
        zzfv zzfvVar2;
        zzfv zzfvVar3;
        if (this.zzkx) {
            zzfvVar3 = this.zzlb.zzkp;
            zzfvVar3.zza(this.zzjh);
        }
        zzfdVar = this.zzlb.zzkr;
        zzfa zzk = zzfdVar.zzk(this.zzjh);
        zzfdVar2 = this.zzlb.zzkr;
        boolean zzl = zzfdVar2.zzl(this.zzjh);
        if (zzk.isVisible() && !this.zzll) {
            Map<String, Object> zza2 = zzdu.zza(this.zzlm);
            if (zzk.zzcq()) {
                zzja zza3 = zzdu.zza(zzk.zzco(), zza2);
                zzfvVar2 = this.zzlb.zzkp;
                zzfvVar2.zzk(zzk.zzg(), zza3);
            } else {
                zzbv zza4 = zzdu.zza(zzk.zzcp(), zza2);
                zzfvVar = this.zzlb.zzkp;
                zzfvVar.zzc(zzk.zzg(), zza4);
            }
        }
        if (!zzl) {
            return Collections.emptyList();
        }
        zzgj zzdl = zzgj.zzdl();
        if (zzk.zzcq()) {
            zzdl = zzdl.zzb(zzch.zzbt(), (zzch) true);
        } else {
            Iterator<Map.Entry<zzch, zzja>> it = zzk.zzcp().iterator();
            while (it.hasNext()) {
                zzdl = zzdl.zzb(it.next().getKey(), (zzch) true);
            }
        }
        zza = this.zzlb.zza(new zzfi(zzk.zzg(), zzdl, this.zzll));
        return zza;
    }
}
