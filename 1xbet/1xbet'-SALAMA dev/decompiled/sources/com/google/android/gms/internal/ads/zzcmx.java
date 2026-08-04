package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzcmx {
    private final zzdqq zza;
    private final zzfar zzb;

    public zzcmx(zzdqq zzdqqVar, zzfar zzfarVar) {
        this.zza = zzdqqVar;
        this.zzb = zzfarVar;
    }

    public final void zza(long j, int i7) {
        String str;
        zzdqp zzdqpVarZza = this.zza.zza();
        zzdqpVarZza.zzd(this.zzb.zzb.zzb);
        zzdqpVarZza.zzb("action", "ad_closed");
        zzdqpVarZza.zzb("show_time", String.valueOf(j));
        zzdqpVarZza.zzb("ad_format", "app_open_ad");
        int i8 = i7 - 1;
        if (i8 == 0) {
            str = "h";
        } else if (i8 == 1) {
            str = "bb";
        } else if (i8 == 2) {
            str = "cc";
        } else if (i8 != 3) {
            str = i8 != 4 ? "u" : "ac";
        } else {
            str = "cb";
        }
        zzdqpVarZza.zzb("acr", str);
        zzdqpVarZza.zzj();
    }
}
