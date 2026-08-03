package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzerz extends com.google.android.gms.internal.ads.zzbxd {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzbxb zzb;
    private final com.google.android.gms.internal.ads.zzcfw zzc;
    private final org.json.JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzerz(java.lang.String str, com.google.android.gms.internal.ads.zzbxb zzbxbVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar, long j) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcfwVar;
        this.zza = str;
        this.zzb = zzbxbVar;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbxbVar.zzf().toString());
            jSONObject.put("sdk_version", zzbxbVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (android.os.RemoteException | java.lang.NullPointerException | org.json.JSONException unused) {
        }
    }

    public static synchronized void zzd(java.lang.String str, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        synchronized (com.google.android.gms.internal.ads.zzerz.class) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcl)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzcfwVar.zzc(jSONObject);
            } catch (org.json.JSONException unused) {
            }
        }
    }

    private final synchronized void zzh(java.lang.String str, int i) {
        if (this.zzf) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = this.zzd;
            jSONObject.put("signal_error", str);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcm)).booleanValue()) {
                jSONObject.put("latency", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zze);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcl)).booleanValue()) {
                jSONObject.put("signal_error_code", i);
            }
        } catch (org.json.JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzb() {
        if (this.zzf) {
            return;
        }
        try {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcl)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (org.json.JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbxe
    public final synchronized void zze(java.lang.String str) throws android.os.RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            org.json.JSONObject jSONObject = this.zzd;
            jSONObject.put("signals", str);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcm)).booleanValue()) {
                jSONObject.put("latency", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zze);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcl)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (org.json.JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxe
    public final synchronized void zzf(java.lang.String str) throws android.os.RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbxe
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
