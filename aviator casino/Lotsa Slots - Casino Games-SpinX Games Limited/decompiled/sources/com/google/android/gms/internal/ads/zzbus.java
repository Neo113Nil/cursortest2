package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbus implements com.google.android.gms.internal.ads.zzbqg {
    private final com.google.android.gms.internal.ads.zzcfw zza;

    public zzbus(com.google.android.gms.internal.ads.zzbuu zzbuuVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        java.util.Objects.requireNonNull(zzbuuVar);
        this.zza = zzcfwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zza(org.json.JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (java.lang.IllegalStateException unused) {
        } catch (org.json.JSONException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzb(java.lang.String str) {
        try {
            if (str == null) {
                this.zza.zzd(new com.google.android.gms.internal.ads.zzbtx());
            } else {
                this.zza.zzd(new com.google.android.gms.internal.ads.zzbtx(str));
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }
}
