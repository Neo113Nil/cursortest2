package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzeqt implements zzesh {
    private final zzesh zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeqt(zzesh zzeshVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeshVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    public static I3.b zzc(zzeqt zzeqtVar, Throwable th) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcu)).booleanValue()) {
            zzesh zzeshVar = zzeqtVar.zza;
            o.f1952C.f1961g.zzw(th, "OptionalSignalTimeout:" + zzeshVar.zza());
        }
        return zzgbc.zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        I3.b bVarZzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcv)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            bVarZzb = zzgbc.zzo(bVarZzb, j, timeUnit, this.zzc);
        }
        return zzgbc.zzf(bVarZzb, Throwable.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzeqs
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzeqt.zzc(this.zza, (Throwable) obj);
            }
        }, zzbza.zzg);
    }
}
