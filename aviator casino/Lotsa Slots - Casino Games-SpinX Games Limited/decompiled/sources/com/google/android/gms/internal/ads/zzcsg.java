package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcsg implements com.google.android.gms.internal.ads.zzcrt {
    zzcsg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final void zza(java.util.Map map) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlP)).booleanValue() || map.isEmpty()) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get("is_topics_ad_personalization_allowed");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzy(java.lang.Boolean.parseBoolean(str));
    }
}
