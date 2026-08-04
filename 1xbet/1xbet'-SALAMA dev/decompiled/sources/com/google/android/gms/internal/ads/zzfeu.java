package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
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
        Object obj = this.zzb;
        String strZzf = this.zzc;
        if (strZzf == null) {
            strZzf = this.zza.zzf(obj);
        }
        final zzfek zzfekVar = new zzfek(obj, strZzf, this.zzf);
        this.zza.zzd.zza(zzfekVar);
        I3.b bVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfes
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzd.zzc(zzfekVar);
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
        return new zzfeu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgbc.zzf(this.zzf, cls, zzgajVar, this.zza.zzb));
    }

    public final zzfeu zzd(final I3.b bVar) {
        return zzg(new zzgaj() { // from class: com.google.android.gms.internal.ads.zzfer
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return bVar;
            }
        }, zzbza.zzg);
    }

    public final zzfeu zze(final zzfei zzfeiVar) {
        return zzf(new zzgaj() { // from class: com.google.android.gms.internal.ads.zzfeq
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzgbc.zzh(zzfeiVar.zza(obj));
            }
        });
    }

    public final zzfeu zzf(zzgaj zzgajVar) {
        return zzg(zzgajVar, this.zza.zzb);
    }

    public final zzfeu zzg(zzgaj zzgajVar, Executor executor) {
        return new zzfeu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgbc.zzn(this.zzf, zzgajVar, executor));
    }

    public final zzfeu zzh(String str) {
        return new zzfeu(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfeu zzi(long j, TimeUnit timeUnit) {
        return new zzfeu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgbc.zzo(this.zzf, j, timeUnit, this.zza.zzc));
    }
}
