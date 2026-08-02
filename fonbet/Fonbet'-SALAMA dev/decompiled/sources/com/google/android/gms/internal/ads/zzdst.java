package com.google.android.gms.internal.ads;

import E2.o;
import android.os.SystemClock;

/* loaded from: classes.dex */
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
        zzdrb zzdrbVar;
        zzdbo zzdboVar;
        zzfgb zzfgbVar;
        synchronized (this.zza) {
            zzdsu zzdsuVar = this.zzf;
            String str2 = this.zzb;
            o.f1952C.j.getClass();
            zzdsuVar.zzv(str2, false, str, (int) (SystemClock.elapsedRealtime() - this.zzc));
            zzdrbVar = this.zzf.zzl;
            zzdrbVar.zzb(this.zzb, "error");
            zzdboVar = this.zzf.zzo;
            zzdboVar.zzb(this.zzb, "error");
            zzfgbVar = this.zzf.zzp;
            zzffn zzffnVar = this.zzd;
            zzffnVar.zzc(str);
            zzffnVar.zzg(false);
            zzfgbVar.zzc(zzffnVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zzf() {
        zzdrb zzdrbVar;
        zzdbo zzdboVar;
        zzfgb zzfgbVar;
        synchronized (this.zza) {
            zzdsu zzdsuVar = this.zzf;
            String str = this.zzb;
            o.f1952C.j.getClass();
            zzdsuVar.zzv(str, true, "", (int) (SystemClock.elapsedRealtime() - this.zzc));
            zzdrbVar = this.zzf.zzl;
            zzdrbVar.zzd(this.zzb);
            zzdboVar = this.zzf.zzo;
            zzdboVar.zzd(this.zzb);
            zzfgbVar = this.zzf.zzp;
            zzffn zzffnVar = this.zzd;
            zzffnVar.zzg(true);
            zzfgbVar.zzc(zzffnVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
