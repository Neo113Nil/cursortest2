package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcmx {
    private final zzdqq zza;
    private final zzfar zzb;

    public zzcmx(zzdqq zzdqqVar, zzfar zzfarVar) {
        this.zza = zzdqqVar;
        this.zzb = zzfarVar;
    }

    public final void zza(long j, int i7) {
        zzdqp zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb("ad_format", "app_open_ad");
        int i8 = i7 - 1;
        zza.zzb("acr", i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zza.zzj();
    }
}
