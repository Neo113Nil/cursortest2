package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzeax {
    private java.lang.Long zza;
    private final java.lang.String zzb;
    private java.lang.String zzc;
    private java.lang.Integer zzd;
    private java.lang.String zze;
    private java.lang.Integer zzf;

    /* synthetic */ zzeax(java.lang.String str, byte[] bArr) {
        this.zzb = str;
    }

    final /* synthetic */ java.lang.String zza() {
        java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlt);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("objectId", this.zza);
            jSONObject.put("eventCategory", this.zzb);
            jSONObject.putOpt(androidx.core.app.NotificationCompat.CATEGORY_EVENT, this.zzc);
            jSONObject.putOpt("errorCode", this.zzd);
            jSONObject.putOpt("rewardType", this.zze);
            jSONObject.putOpt(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, this.zzf);
        } catch (org.json.JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 14 + java.lang.String.valueOf(jSONObject2).length() + 2);
        sb.append(str);
        sb.append("(\"h5adsEvent\",");
        sb.append(jSONObject2);
        sb.append(");");
        return sb.toString();
    }

    final /* synthetic */ void zzb(java.lang.Long l) {
        this.zza = l;
    }

    final /* synthetic */ void zzc(java.lang.String str) {
        this.zzc = str;
    }

    final /* synthetic */ void zzd(java.lang.Integer num) {
        this.zzd = num;
    }

    final /* synthetic */ void zze(java.lang.String str) {
        this.zze = str;
    }

    final /* synthetic */ void zzf(java.lang.Integer num) {
        this.zzf = num;
    }
}
