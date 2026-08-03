package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbjt extends com.google.android.gms.ads.query.QueryInfoGenerationCallback {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbjv zzb;

    zzbjt(com.google.android.gms.internal.ads.zzbjv zzbjvVar, java.lang.String str) {
        this.zza = str;
        java.util.Objects.requireNonNull(zzbjvVar);
        this.zzb = zzbjvVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(java.lang.String str) {
        java.lang.String.valueOf(str);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to generate query info for Custom Tab error: ".concat(java.lang.String.valueOf(str)));
        try {
            com.google.android.gms.internal.ads.zzbjv zzbjvVar = this.zzb;
            zzbjvVar.zzi().postMessage(zzbjvVar.zze(this.zza, str).toString(), null);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(com.google.android.gms.ads.query.QueryInfo queryInfo) {
        java.lang.String query = queryInfo.getQuery();
        try {
            com.google.android.gms.internal.ads.zzbjv zzbjvVar = this.zzb;
            zzbjvVar.zzi().postMessage(zzbjvVar.zzf(this.zza, query).toString(), null);
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
