package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdth {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzdtc zzb;
    private final com.google.android.gms.internal.ads.zzdzg zzc;

    zzdth(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdtc zzdtcVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar) {
        this.zza = executor;
        this.zzb = zzdtcVar;
        this.zzc = zzdzgVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(org.json.JSONObject jSONObject, java.lang.String str) {
        com.google.common.util.concurrent.ListenableFuture zza;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(java.util.Collections.emptyList());
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcU)).booleanValue()) {
            this.zzc.zzf(com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_CUSTOM_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zza = com.google.android.gms.internal.ads.zzhbw.zza(null);
            } else {
                final java.lang.String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zza = com.google.android.gms.internal.ads.zzhbw.zza(null);
                } else {
                    java.lang.String optString2 = optJSONObject.optString("type");
                    zza = "string".equals(optString2) ? com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzdte(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? com.google.android.gms.internal.ads.zzhbw.zzk(this.zzb.zza(optJSONObject, "image_value", null), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzdtf
                        @Override // com.google.android.gms.internal.ads.zzgta
                        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                            return new com.google.android.gms.internal.ads.zzdte(optString, (com.google.android.gms.internal.ads.zzblp) obj);
                        }
                    }, this.zza) : com.google.android.gms.internal.ads.zzhbw.zza(null);
                }
            }
            arrayList.add(zza);
        }
        return com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzhbw.zzm(arrayList), com.google.android.gms.internal.ads.zzdtg.zza, this.zza);
    }
}
