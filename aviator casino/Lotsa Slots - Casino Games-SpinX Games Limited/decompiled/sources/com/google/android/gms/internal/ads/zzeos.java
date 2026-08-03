package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzeos implements com.google.android.gms.internal.ads.zzels {
    private static android.os.Bundle zzd(android.os.Bundle bundle) {
        return bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        return !android.text.TextUtils.isEmpty(zzfkfVar.zzv.optString("pubid", ""));
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        org.json.JSONObject jSONObject = zzfkfVar.zzv;
        java.lang.String optString = jSONObject.optString("pubid", "");
        com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
        com.google.android.gms.internal.ads.zzfkx zzfkxVar = new com.google.android.gms.internal.ads.zzfkx();
        zzfkxVar.zzA(zzfkyVar);
        zzfkxVar.zzg(optString);
        zzfkxVar.zzy(true);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkyVar.zzd;
        android.os.Bundle zzd = zzd(zzmVar.zzm);
        android.os.Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        java.lang.String optString2 = jSONObject.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        java.lang.String optString3 = jSONObject.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        org.json.JSONObject jSONObject2 = zzfkfVar.zzD;
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.String optString4 = jSONObject2.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        zzfkxVar.zza(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, zzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, zzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz, zzmVar.zzA));
        zzfkxVar.zzz(zzfkfVar.zzaH);
        com.google.android.gms.internal.ads.zzfky zzB = zzfkxVar.zzB();
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.internal.ads.zzfki zzfkiVar = zzfkqVar.zzb.zzb;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putStringArrayList("nofill_urls", new java.util.ArrayList<>(zzfkiVar.zza));
        bundle2.putInt("refresh_interval", zzfkiVar.zzc);
        bundle2.putString("gws_query_id", zzfkiVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        java.lang.String str = zzfkyVar.zzg;
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzfkfVar.zzw);
        bundle3.putString("ad_source_name", zzfkfVar.zzF);
        bundle3.putStringArrayList("click_urls", new java.util.ArrayList<>(zzfkfVar.zzc));
        bundle3.putStringArrayList("imp_urls", new java.util.ArrayList<>(zzfkfVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new java.util.ArrayList<>(zzfkfVar.zzp));
        bundle3.putStringArrayList("fill_urls", new java.util.ArrayList<>(zzfkfVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new java.util.ArrayList<>(zzfkfVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new java.util.ArrayList<>(zzfkfVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new java.util.ArrayList<>(zzfkfVar.zzi));
        bundle3.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.TRANSACTION_ID, zzfkfVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfkfVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfkfVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfkfVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzfkfVar.zzW);
        com.google.android.gms.internal.ads.zzccb zzccbVar = zzfkfVar.zzl;
        if (zzccbVar != null) {
            android.os.Bundle bundle4 = new android.os.Bundle();
            bundle4.putInt("rb_amount", zzccbVar.zzb);
            bundle4.putString("rb_type", zzccbVar.zza);
            bundle3.putParcelableArray("rewards", new android.os.Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzB, bundle, zzfkfVar, zzfkqVar);
    }

    protected abstract com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfky zzfkyVar, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar);
}
