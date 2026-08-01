package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzecl extends zzbsk {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfqw zzd;
    final /* synthetic */ zzcgo zze;
    final /* synthetic */ zzecu zzf;

    zzecl(zzecu zzecuVar, Object obj, String str, long j, zzfqw zzfqwVar, zzcgo zzcgoVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfqwVar;
        this.zze = zzcgoVar;
        Objects.requireNonNull(zzecuVar);
        this.zzf = zzecuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zze() {
        synchronized (this.zza) {
            zzecu zzecuVar = this.zzf;
            String str = this.zzb;
            zzecuVar.zzm(str, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzecuVar.zzr().zzb(str);
            zzecuVar.zzs().zzb(str);
            zzfrj zzt = zzecuVar.zzt();
            zzfqw zzfqwVar = this.zzd;
            zzfqwVar.zzd(true);
            zzt.zzb(zzfqwVar.zzm());
            this.zze.zzc(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zzf(String str) {
        synchronized (this.zza) {
            zzecu zzecuVar = this.zzf;
            String str2 = this.zzb;
            zzecuVar.zzm(str2, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzecuVar.zzr().zzc(str2, "error");
            zzecuVar.zzs().zzc(str2, "error");
            zzfrj zzt = zzecuVar.zzt();
            zzfqw zzfqwVar = this.zzd;
            zzfqwVar.zzk(str);
            zzfqwVar.zzd(false);
            zzt.zzb(zzfqwVar.zzm());
            this.zze.zzc(false);
        }
    }
}
