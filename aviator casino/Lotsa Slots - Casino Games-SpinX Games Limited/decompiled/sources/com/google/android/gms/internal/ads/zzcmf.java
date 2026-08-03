package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcmf {
    private final com.google.android.gms.internal.ads.zzcme zza;
    private final com.google.android.gms.internal.ads.zzcmg zzb;

    public zzcmf(com.google.android.gms.internal.ads.zzcmg zzcmgVar, com.google.android.gms.internal.ads.zzcme zzcmeVar) {
        this.zza = zzcmeVar;
        this.zzb = zzcmgVar;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getClickSignals(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        com.google.android.gms.internal.ads.zzcmg zzcmgVar = this.zzb;
        com.google.android.gms.internal.ads.zzbap zzS = ((com.google.android.gms.internal.ads.zzcmn) zzcmgVar).zzS();
        if (zzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        com.google.android.gms.internal.ads.zzbak zzb = zzS.zzb();
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcmgVar.getContext() != null) {
            return zzb.zzf(zzcmgVar.getContext(), str, ((com.google.android.gms.internal.ads.zzcmp) zzcmgVar).zzE(), zzcmgVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getViewSignals() {
        com.google.android.gms.internal.ads.zzcmg zzcmgVar = this.zzb;
        com.google.android.gms.internal.ads.zzbap zzS = ((com.google.android.gms.internal.ads.zzcmn) zzcmgVar).zzS();
        if (zzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        com.google.android.gms.internal.ads.zzbak zzb = zzS.zzb();
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcmgVar.getContext() != null) {
            return zzb.zzj(zzcmgVar.getContext(), ((com.google.android.gms.internal.ads.zzcmp) zzcmgVar).zzE(), zzcmgVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getViewSignalsJson() {
        com.google.android.gms.internal.ads.zzcmg zzcmgVar = this.zzb;
        com.google.android.gms.internal.ads.zzbiq.zza(zzcmgVar.getContext());
        java.lang.String viewSignals = getViewSignals();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpj)).booleanValue()) {
            return viewSignals;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ms", viewSignals);
            com.google.android.gms.internal.ads.zzcms zzP = ((com.google.android.gms.internal.ads.zzcku) zzcmgVar).zzP();
            com.google.android.gms.internal.ads.zzdbn zzK = zzP != null ? zzP.zzK() : null;
            if (zzK != null) {
                long zza = zzK.zza();
                if (zza > 0) {
                    jSONObject.put("plcmtid", zza);
                }
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Error constructing JSON.", e);
            return "";
        }
    }

    @android.webkit.JavascriptInterface
    public void notify(final java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcmc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcmf.this.zza(str);
                }
            });
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty, ignoring message");
        }
    }

    final /* synthetic */ void zza(java.lang.String str) {
        this.zza.zza(android.net.Uri.parse(str));
    }
}
