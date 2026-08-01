package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcvl {
    private final zzeaj zza;
    private final zzflo zzb;

    zzcvl(zzeaj zzeajVar, zzflo zzfloVar) {
        this.zza = zzeajVar;
        this.zzb = zzfloVar;
    }

    public final void zza(long j, int i) {
        zzeai zza = this.zza.zza();
        zza.zza(this.zzb.zzb.zzb);
        zza.zzc("action", "ad_closed");
        zza.zzc("show_time", String.valueOf(j));
        zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        int i2 = i - 1;
        zza.zzc("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME : "cb" : "cc" : "bb" : "h");
        zza.zzd();
    }
}
