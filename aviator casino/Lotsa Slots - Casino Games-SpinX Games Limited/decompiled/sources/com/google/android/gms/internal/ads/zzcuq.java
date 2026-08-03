package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcuq implements com.google.android.gms.internal.ads.zzbeq {
    private com.google.android.gms.internal.ads.zzcku zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcuc zzc;
    private final com.google.android.gms.common.util.Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final com.google.android.gms.internal.ads.zzcuf zzg = new com.google.android.gms.internal.ads.zzcuf();

    public zzcuq(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcuc zzcucVar, com.google.android.gms.common.util.Clock clock) {
        this.zzb = executor;
        this.zzc = zzcucVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final org.json.JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcup
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzcuq.this.zzf(zzb);
                    }
                });
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        this.zza = zzckuVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
        boolean z = this.zzf ? false : zzbepVar.zzj;
        com.google.android.gms.internal.ads.zzcuf zzcufVar = this.zzg;
        zzcufVar.zza = z;
        zzcufVar.zzd = this.zzd.elapsedRealtime();
        zzcufVar.zzf = zzbepVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    final /* synthetic */ void zzf(org.json.JSONObject jSONObject) {
        java.lang.String obj = jSONObject.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 31);
        sb.append("Calling AFMA_updateActiveView(");
        sb.append(obj);
        sb.append(")");
        java.lang.String sb2 = sb.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
