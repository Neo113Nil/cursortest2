package com.google.android.gms.internal.ads;

import E2.o;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class zzdst extends zzbla {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzffn zzd;
    final /* synthetic */ zzbzf zze;
    final /* synthetic */ zzdsu zzf;

    public zzdst(zzdsu zzdsuVar, Object obj, String str, long j, zzffn zzffnVar, zzbzf zzbzfVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzffnVar;
        this.zze = zzbzfVar;
        this.zzf = zzdsuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zze(String str) {
        synchronized (this.zza) {
            zzdsu zzdsuVar = this.zzf;
            String str2 = this.zzb;
            o.f1952C.j.getClass();
            zzdsuVar.zzv(str2, false, str, (int) (SystemClock.elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzfgb zzfgbVar = this.zzf.zzp;
            zzffn zzffnVar = this.zzd;
            zzffnVar.zzc(str);
            zzffnVar.zzg(false);
            zzfgbVar.zzc(zzffnVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zzf() {
        synchronized (this.zza) {
            zzdsu zzdsuVar = this.zzf;
            String str = this.zzb;
            o.f1952C.j.getClass();
            zzdsuVar.zzv(str, true, "", (int) (SystemClock.elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfgb zzfgbVar = this.zzf.zzp;
            zzffn zzffnVar = this.zzd;
            zzffnVar.zzg(true);
            zzfgbVar.zzc(zzffnVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
