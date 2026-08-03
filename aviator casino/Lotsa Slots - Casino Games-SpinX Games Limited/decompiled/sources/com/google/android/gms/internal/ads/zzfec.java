package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfec implements com.google.android.gms.internal.ads.zzfck {
    private final org.json.JSONObject zza;

    zzfec(android.content.Context context) {
        this.zza = com.google.android.gms.internal.ads.zzcaz.zzc(context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznu)).booleanValue() ? com.google.android.gms.internal.ads.zzhbw.zza(com.google.android.gms.internal.ads.zzfea.zza) : com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfci() { // from class: com.google.android.gms.internal.ads.zzfeb
            @Override // com.google.android.gms.internal.ads.zzfci
            public final /* synthetic */ void zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzfec.this.zzc((org.json.JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 46;
    }

    final /* synthetic */ void zzc(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (org.json.JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
