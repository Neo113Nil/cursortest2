package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfeu {
    final /* synthetic */ zzfew zza;
    private final Object zzb;
    private final String zzc;
    private final I3.b zzd;
    private final List zze;
    private final I3.b zzf;

    private zzfeu(zzfew zzfewVar, Object obj, String str, I3.b bVar, List list, I3.b bVar2) {
        this.zza = zzfewVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = bVar;
        this.zze = list;
        this.zzf = bVar2;
    }

    public final zzfek zza() {
        zzfex zzfexVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfek zzfekVar = new zzfek(obj, str, this.zzf);
        zzfexVar = this.zza.zzd;
        zzfexVar.zza(zzfekVar);
        I3.b bVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfes
            @Override // java.lang.Runnable
            public final void run() {
                zzfex zzfexVar2;
                zzfexVar2 = zzfeu.this.zza.zzd;
                zzfexVar2.zzc(zzfekVar);
            }
        };
        zzgbn zzgbnVar = zzbza.zzg;
        bVar.addListener(runnable, zzgbnVar);
        zzgbc.zzr(zzfekVar, new zzfet(this, zzfekVar), zzgbnVar);
        return zzfekVar;
    }

    public final zzfeu zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfeu zzc(Class cls, zzgaj zzgajVar) {
        zzgbn zzgbnVar;
        zzgbnVar = this.zza.zzb;
        return new zzfeu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgbc.zzf(this.zzf, cls, zzgajVar, zzgbnVar));
    }

    public final zzfeu zzd(final I3.b bVar) {
        return zzg(new zzgaj() { // from class: com.google.android.gms.internal.ads.zzfer
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return I3.b.this;
            }
        }, zzbza.zzg);
    }

    public final zzfeu zze(final zzfei zzfeiVar) {
        return zzf(new zzgaj() { // from class: com.google.android.gms.internal.ads.zzfeq
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzgbc.zzh(zzfei.this.zza(obj));
            }
        });
    }

    public final zzfeu zzf(zzgaj zzgajVar) {
        zzgbn zzgbnVar;
        zzgbnVar = this.zza.zzb;
        return zzg(zzgajVar, zzgbnVar);
    }

    public final zzfeu zzg(zzgaj zzgajVar, Executor executor) {
        return new zzfeu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgbc.zzn(this.zzf, zzgajVar, executor));
    }

    public final zzfeu zzh(String str) {
        return new zzfeu(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfeu zzi(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zza.zzc;
        return new zzfeu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgbc.zzo(this.zzf, j, timeUnit, scheduledExecutorService));
    }
}
