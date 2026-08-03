package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzecf implements com.google.android.gms.internal.ads.zzdcu, com.google.android.gms.internal.ads.zzdfx, com.google.android.gms.internal.ads.zzdej {
    private final com.google.android.gms.internal.ads.zzecr zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private com.google.android.gms.internal.ads.zzdck zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private org.json.JSONObject zzk;
    private org.json.JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private java.lang.String zzj = "";
    private int zzd = 0;
    private com.google.android.gms.internal.ads.zzece zze = com.google.android.gms.internal.ads.zzece.AD_REQUESTED;

    zzecf(com.google.android.gms.internal.ads.zzecr zzecrVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, java.lang.String str) {
        this.zza = zzecrVar;
        this.zzc = str;
        this.zzb = zzfkyVar.zzg;
    }

    private final org.json.JSONObject zzh(com.google.android.gms.internal.ads.zzdck zzdckVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("winningAdapterClassName", zzdckVar.zze());
        jSONObject.put("responseSecsSinceEpoch", zzdckVar.zzc());
        jSONObject.put("responseId", zzdckVar.zzf());
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkF)).booleanValue()) {
            java.lang.String zzd = zzdckVar.zzd();
            if (!android.text.TextUtils.isEmpty(zzd)) {
                java.lang.String.valueOf(zzd);
                java.lang.String valueOf = java.lang.String.valueOf(zzd);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Bidding data: ".concat(valueOf));
                jSONObject.put("biddingData", new org.json.JSONObject(zzd));
            }
        }
        if (!android.text.TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!android.text.TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!android.text.TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        java.lang.Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        java.lang.Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkI)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.google.android.gms.ads.internal.client.zzv zzvVar : zzdckVar.zzg()) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.zza);
            jSONObject2.put("latencyMillis", zzvVar.zzb);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkG)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzay.zza().zzo(zzvVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : zzi(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static org.json.JSONObject zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzi(zzeVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zza(com.google.android.gms.internal.ads.zzcxt zzcxtVar) {
        com.google.android.gms.internal.ads.zzecr zzecrVar = this.zza;
        if (zzecrVar.zzs()) {
            this.zzf = zzcxtVar.zzn();
            this.zze = com.google.android.gms.internal.ads.zzece.AD_LOADED;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkM)).booleanValue()) {
                zzecrVar.zzk(this.zzb, this);
            }
        }
    }

    public final boolean zzc() {
        return this.zze != com.google.android.gms.internal.ads.zzece.AD_REQUESTED;
    }

    public final java.lang.String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzecr zzecrVar = this.zza;
        if (zzecrVar.zzs()) {
            this.zze = com.google.android.gms.internal.ads.zzece.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkM)).booleanValue()) {
                zzecrVar.zzk(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkM)).booleanValue()) {
            return;
        }
        com.google.android.gms.internal.ads.zzecr zzecrVar = this.zza;
        if (zzecrVar.zzs()) {
            zzecrVar.zzk(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        com.google.android.gms.internal.ads.zzecr zzecrVar = this.zza;
        if (zzecrVar.zzs()) {
            com.google.android.gms.internal.ads.zzfkp zzfkpVar = zzfkqVar.zzb;
            java.util.List list = zzfkpVar.zza;
            if (!list.isEmpty()) {
                this.zzd = ((com.google.android.gms.internal.ads.zzfkf) list.get(0)).zzb;
            }
            com.google.android.gms.internal.ads.zzfki zzfkiVar = zzfkpVar.zzb;
            java.lang.String str = zzfkiVar.zzl;
            if (!android.text.TextUtils.isEmpty(str)) {
                this.zzh = str;
            }
            java.lang.String str2 = zzfkiVar.zzm;
            if (!android.text.TextUtils.isEmpty(str2)) {
                this.zzi = str2;
            }
            org.json.JSONObject jSONObject = zzfkiVar.zzp;
            if (jSONObject.length() > 0) {
                this.zzl = jSONObject;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkI)).booleanValue()) {
                if (!zzecrVar.zzm()) {
                    this.zzo = true;
                    return;
                }
                java.lang.String str3 = zzfkiVar.zzn;
                if (!android.text.TextUtils.isEmpty(str3)) {
                    this.zzj = str3;
                }
                org.json.JSONObject jSONObject2 = zzfkiVar.zzo;
                if (jSONObject2.length() > 0) {
                    this.zzk = jSONObject2;
                }
                org.json.JSONObject jSONObject3 = this.zzk;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!android.text.TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzecrVar.zzl(length);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final org.json.JSONObject zzg() throws org.json.JSONException {
        org.json.JSONObject jSONObject;
        android.os.IBinder iBinder;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("state", this.zze);
        jSONObject2.put("format", com.google.android.gms.internal.ads.zzfkf.zza(this.zzd));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkM)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject2.put("shown", this.zzn);
            }
        }
        com.google.android.gms.internal.ads.zzdck zzdckVar = this.zzf;
        if (zzdckVar != null) {
            jSONObject = zzh(zzdckVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            org.json.JSONObject jSONObject3 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                com.google.android.gms.internal.ads.zzdck zzdckVar2 = (com.google.android.gms.internal.ads.zzdck) iBinder;
                jSONObject3 = zzh(zzdckVar2);
                if (zzdckVar2.zzg().isEmpty()) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    jSONArray.put(zzi(this.zzg));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }
}
