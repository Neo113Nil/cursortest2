package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcut {
    private final com.google.android.gms.internal.ads.zzdzl zza;
    private final com.google.android.gms.internal.ads.zzfkq zzb;

    zzcut(com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        this.zza = zzdzlVar;
        this.zzb = zzfkqVar;
    }

    public final void zza(long j, int i) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zza(this.zzb.zzb.zzb);
        zza.zzc("action", "ad_closed");
        zza.zzc("show_time", java.lang.String.valueOf(j));
        zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        int i2 = i - 1;
        zza.zzc("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS);
        zza.zzd();
    }
}
