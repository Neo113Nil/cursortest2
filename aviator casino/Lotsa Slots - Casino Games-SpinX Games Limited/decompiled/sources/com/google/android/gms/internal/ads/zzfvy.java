package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzfvy {
    private final java.lang.String zza;
    private com.google.android.gms.internal.ads.zzfxa zzb;
    private long zzc;
    private int zzd;

    public zzfvy(java.lang.String str) {
        zzp();
        this.zza = str;
        this.zzb = new com.google.android.gms.internal.ads.zzfxa(null);
    }

    public void zza() {
    }

    public void zzb() {
        this.zzb.clear();
    }

    final void zzc(android.webkit.WebView webView) {
        this.zzb = new com.google.android.gms.internal.ads.zzfxa(webView);
    }

    public final android.webkit.WebView zzd() {
        return (android.webkit.WebView) this.zzb.get();
    }

    public final boolean zze() {
        return this.zzb.get() != null;
    }

    public final void zzf(boolean z) {
        if (zze()) {
            com.google.android.gms.internal.ads.zzfvp.zza().zzf(zzd(), this.zza, true != z ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzg(boolean z) {
        if (zze()) {
            com.google.android.gms.internal.ads.zzfvp.zza().zzg(zzd(), this.zza, true != z ? "unlocked" : "locked");
        }
    }

    public final void zzh(java.lang.String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            com.google.android.gms.internal.ads.zzfvp.zza().zze(zzd(), this.zza, str);
        }
    }

    public final void zzi(java.lang.String str, long j) {
        if (j < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        com.google.android.gms.internal.ads.zzfvp.zza().zze(zzd(), this.zza, str);
    }

    public final void zzj(com.google.android.gms.internal.ads.zzful zzfulVar) {
        com.google.android.gms.internal.ads.zzfvp.zza().zzb(zzd(), this.zza, zzfulVar.zzb());
    }

    public void zzk(com.google.android.gms.internal.ads.zzfuo zzfuoVar, com.google.android.gms.internal.ads.zzfum zzfumVar) {
        zzl(zzfuoVar, zzfumVar, null);
    }

    protected final void zzl(com.google.android.gms.internal.ads.zzfuo zzfuoVar, com.google.android.gms.internal.ads.zzfum zzfumVar, org.json.JSONObject jSONObject) {
        java.lang.String zzh = zzfuoVar.zzh();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject2, "environment", "app");
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject2, "adSessionType", zzfumVar.zzi());
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 2 + java.lang.String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject3, "deviceType", sb.toString());
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject3, "osVersion", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject3, com.ironsource.M6.F, com.ironsource.X3.d);
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject2, "deviceInfo", jSONObject3);
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject2, "deviceCategory", com.google.android.gms.internal.ads.zzfwd.zzb().toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject2, "supports", jSONArray);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject4, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER, zzfumVar.zzc().zzb());
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject4, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, zzfumVar.zzc().zzc());
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject2, "omidNativeInfo", jSONObject4);
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject5, com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, com.google.android.gms.internal.ads.zzfvn.zza().zzb().getApplicationContext().getPackageName());
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject2, "app", jSONObject5);
        if (zzfumVar.zzg() != null) {
            com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject2, "contentUrl", zzfumVar.zzg());
        }
        if (zzfumVar.zzh() != null) {
            com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject2, "customReferenceData", zzfumVar.zzh());
        }
        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
        java.util.Iterator it = zzfumVar.zzd().iterator();
        if (it.hasNext()) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzfvp.zza().zzc(zzd(), zzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzm() {
        com.google.android.gms.internal.ads.zzfvp.zza().zzd(zzd(), this.zza);
    }

    public final void zzn(java.util.Date date) {
        if (date == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzfwe.zzc(jSONObject, com.ironsource.C4.a.d, java.lang.Long.valueOf(date.getTime()));
        com.google.android.gms.internal.ads.zzfvp.zza().zzi(zzd(), jSONObject);
    }

    public final void zzo(float f) {
        com.google.android.gms.internal.ads.zzfvp.zza().zzh(zzd(), this.zza, f);
    }

    public final void zzp() {
        this.zzc = java.lang.System.nanoTime();
        this.zzd = 1;
    }
}
