package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbul implements com.google.android.gms.internal.ads.zzbqg {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbum zza;
    private final com.google.android.gms.internal.ads.zzbto zzb;
    private final com.google.android.gms.internal.ads.zzcfw zzc;

    public zzbul(com.google.android.gms.internal.ads.zzbum zzbumVar, com.google.android.gms.internal.ads.zzbto zzbtoVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        java.util.Objects.requireNonNull(zzbumVar);
        this.zza = zzbumVar;
        this.zzb = zzbtoVar;
        this.zzc = zzcfwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zza(org.json.JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (java.lang.IllegalStateException unused) {
            } catch (org.json.JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzb(java.lang.String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new com.google.android.gms.internal.ads.zzbtx());
            } else {
                this.zzc.zzd(new com.google.android.gms.internal.ads.zzbtx(str));
            }
        } catch (java.lang.IllegalStateException unused) {
        } catch (java.lang.Throwable th) {
            this.zzb.zza();
            throw th;
        }
        this.zzb.zza();
    }
}
