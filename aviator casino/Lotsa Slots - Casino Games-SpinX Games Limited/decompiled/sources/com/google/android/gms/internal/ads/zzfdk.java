package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfdk implements com.google.android.gms.internal.ads.zzfci {
    private final com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzgcg zzc;

    public zzfdk(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info, java.lang.String str, com.google.android.gms.internal.ads.zzgcg zzgcgVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzgcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        try {
            org.json.JSONObject zzh = com.google.android.gms.ads.internal.util.zzbp.zzh((org.json.JSONObject) obj, "pii");
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = this.zza;
            if (info == null || android.text.TextUtils.isEmpty(info.getId())) {
                java.lang.String str = this.zzb;
                if (str != null) {
                    zzh.put("pdid", str);
                    zzh.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzh.put("rdid", info.getId());
            zzh.put("is_lat", info.isLimitAdTrackingEnabled());
            zzh.put("idtype", "adid");
            com.google.android.gms.internal.ads.zzgcg zzgcgVar = this.zzc;
            if (zzgcgVar.zzc()) {
                zzh.put("paidv1_id_android_3p", zzgcgVar.zza());
                zzh.put("paidv1_creation_time_android_3p", zzgcgVar.zzb());
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
