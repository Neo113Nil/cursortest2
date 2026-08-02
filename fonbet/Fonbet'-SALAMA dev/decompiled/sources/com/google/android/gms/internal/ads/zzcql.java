package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcql {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final I3.b zzc;
    private volatile boolean zzd = true;

    public zzcql(Executor executor, ScheduledExecutorService scheduledExecutorService, I3.b bVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = bVar;
    }

    public static /* synthetic */ I3.b zza(zzcql zzcqlVar, zzgay zzgayVar, I3.b bVar, zzcpw zzcpwVar) {
        if (zzcpwVar != null) {
            zzgayVar.zzb(zzcpwVar);
        }
        return zzgbc.zzo(bVar, ((Long) zzbel.zza.zze()).longValue(), TimeUnit.MILLISECONDS, zzcqlVar.zzb);
    }

    public static /* bridge */ /* synthetic */ void zzc(final zzcql zzcqlVar, List list, final zzgay zzgayVar) {
        if (list == null || list.isEmpty()) {
            zzcqlVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqg
                @Override // java.lang.Runnable
                public final void run() {
                    zzgay.this.zza(new zzdus(3));
                }
            });
            return;
        }
        I3.b zzh = zzgbc.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final I3.b bVar = (I3.b) it.next();
            zzh = zzgbc.zzn(zzgbc.zzf(zzh, Throwable.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzcqh
                @Override // com.google.android.gms.internal.ads.zzgaj
                public final I3.b zza(Object obj) {
                    zzgay.this.zza((Throwable) obj);
                    return zzgbc.zzh(null);
                }
            }, zzcqlVar.zza), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzcqi
                @Override // com.google.android.gms.internal.ads.zzgaj
                public final I3.b zza(Object obj) {
                    return zzcql.zza(zzcql.this, zzgayVar, bVar, (zzcpw) obj);
                }
            }, zzcqlVar.zza);
        }
        zzgbc.zzr(zzh, new zzcqk(zzcqlVar, zzgayVar), zzcqlVar.zza);
    }

    public final void zze(zzgay zzgayVar) {
        zzgbc.zzr(this.zzc, new zzcqj(this, zzgayVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
