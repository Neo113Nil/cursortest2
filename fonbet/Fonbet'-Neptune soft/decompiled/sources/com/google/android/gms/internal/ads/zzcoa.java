package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzcoa {
    private final zzdsj zza;
    private final zzfcn zzb;

    zzcoa(zzdsj zzdsjVar, zzfcn zzfcnVar) {
        this.zza = zzdsjVar;
        this.zzb = zzfcnVar;
    }

    public final void zza(long j, int i) {
        zzdsi zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb("ad_format", "app_open_ad");
        int i2 = i - 1;
        zza.zzb("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zza.zzj();
    }
}
