package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdys implements com.google.android.gms.internal.ads.zzdfx, com.google.android.gms.internal.ads.zzdef, com.google.android.gms.internal.ads.zzdcu, com.google.android.gms.internal.ads.zzdlk {
    private final com.google.android.gms.internal.ads.zzdzg zza;
    private final com.google.android.gms.internal.ads.zzdzq zzb;

    zzdys(com.google.android.gms.internal.ads.zzdzg zzdzgVar, com.google.android.gms.internal.ads.zzdzq zzdzqVar) {
        this.zza = zzdzgVar;
        this.zzb = zzdzqVar;
    }

    private final void zzc(android.os.Bundle bundle, com.google.android.gms.internal.ads.zzgwm zzgwmVar) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(com.google.android.gms.internal.ads.zzdyu.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        com.google.android.gms.internal.ads.zzdzg zzdzgVar = this.zza;
        zzdzgVar.zzh();
        if (bundle.containsKey("ls")) {
            zzdzgVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgwmVar.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.internal.ads.zzdyv zzdyvVar = (com.google.android.gms.internal.ads.zzdyv) zzgwmVar.get(i);
            long j = bundle.getLong(zzdyvVar.zzb().zza(), -1L);
            long j2 = bundle.getLong(zzdyvVar.zzc().zza(), -1L);
            if (j > 0 && j2 > 0) {
                zzdzgVar.zzd(zzdyvVar.zza(), java.lang.String.valueOf(j2 - j));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
    }

    private final void zzf(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (java.lang.String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzd(str, java.lang.String.valueOf(j));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    @Override // com.google.android.gms.internal.ads.zzdlk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        java.lang.String str;
        com.google.android.gms.internal.ads.zzcbd zzcbdVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhT)).booleanValue()) {
            if (zzbcVar == null) {
                com.google.android.gms.internal.ads.zzdzg zzdzgVar = this.zza;
                zzdzgVar.zzc().put("action", "sgs");
                zzdzgVar.zzc().put("request_id", com.ironsource.C2945a2.f);
                this.zzb.zzb(zzdzgVar.zzc());
                return;
            }
            com.google.android.gms.internal.ads.zzcbd zzcbdVar2 = zzbcVar.zzc;
            if (zzcbdVar2 != null) {
                zzc(zzcbdVar2.zzm, com.google.android.gms.internal.ads.zzdyv.zza);
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(zzbcVar.zzb);
                com.google.android.gms.internal.ads.zzdzg zzdzgVar2 = this.zza;
                zzdzgVar2.zzc().put("action", "sgs");
                java.util.Map zzc = zzdzgVar2.zzc();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlc)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (org.json.JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving JSONObject from the requestJson, ", e);
                    }
                    zzc.put("tpc", str);
                    zzcbdVar = zzbcVar.zzc;
                    if (zzcbdVar != null) {
                        this.zza.zzb(zzcbdVar.zza);
                    }
                    com.google.android.gms.internal.ads.zzdzg zzdzgVar3 = this.zza;
                    zzdzgVar3.zzi();
                    this.zzb.zzb(zzdzgVar3.zzc());
                }
                str = "na";
                zzc.put("tpc", str);
                zzcbdVar = zzbcVar.zzc;
                if (zzcbdVar != null) {
                }
                com.google.android.gms.internal.ads.zzdzg zzdzgVar32 = this.zza;
                zzdzgVar32.zzi();
                this.zzb.zzb(zzdzgVar32.zzc());
            } catch (org.json.JSONException unused) {
                com.google.android.gms.internal.ads.zzdzg zzdzgVar4 = this.zza;
                zzdzgVar4.zzc().put("action", "sgf");
                zzdzgVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdzgVar4.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzdzg zzdzgVar = this.zza;
        zzdzgVar.zzc().put("action", "ftl");
        zzdzgVar.zzd("ftl", java.lang.String.valueOf(zzeVar.zza));
        zzdzgVar.zzd("ed", zzeVar.zzc);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzii)).booleanValue()) {
            zzdzgVar.zzd("emsg", zzeVar.zzb);
        }
        zzdzgVar.zzi();
        this.zzb.zzb(zzdzgVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        this.zza.zzb(zzcbdVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        this.zza.zza(zzfkqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zze(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhT)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdzg zzdzgVar = this.zza;
            zzdzgVar.zzc().put("action", "sgf");
            zzdzgVar.zzd("sgf_reason", str);
            zzdzgVar.zzi();
            this.zzb.zzb(zzdzgVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        com.google.android.gms.internal.ads.zzdzg zzdzgVar = this.zza;
        zzdzgVar.zzc().put("action", com.ironsource.X3.i.r);
        zzc(zzdzgVar.zze(), com.google.android.gms.internal.ads.zzdyv.zzb);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzod)).booleanValue()) {
            zzdzgVar.zzc().put("mafe", true != androidx.webkit.WebViewFeature.isFeatureSupported("MUTE_AUDIO") ? "0" : "1");
        }
        zzdzgVar.zzi();
        this.zzb.zzb(zzdzgVar.zzc());
    }
}
