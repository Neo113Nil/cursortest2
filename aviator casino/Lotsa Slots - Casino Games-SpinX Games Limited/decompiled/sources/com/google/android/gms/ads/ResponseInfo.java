package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class ResponseInfo {
    private final com.google.android.gms.ads.internal.client.zzdx zza;
    private final java.util.List zzb = new java.util.ArrayList();
    private com.google.android.gms.ads.AdapterResponseInfo zzc;

    private ResponseInfo(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zza = zzdxVar;
        if (zzdxVar != null) {
            try {
                java.util.List zzg = zzdxVar.zzg();
                if (zzg != null) {
                    java.util.Iterator it = zzg.iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.ads.AdapterResponseInfo zza = com.google.android.gms.ads.AdapterResponseInfo.zza((com.google.android.gms.ads.internal.client.zzv) it.next());
                        if (zza != null) {
                            this.zzb.add(zza);
                        }
                    }
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        com.google.android.gms.ads.internal.client.zzdx zzdxVar2 = this.zza;
        if (zzdxVar2 == null) {
            return;
        }
        try {
            com.google.android.gms.ads.internal.client.zzv zzh = zzdxVar2.zzh();
            if (zzh != null) {
                this.zzc = com.google.android.gms.ads.AdapterResponseInfo.zza(zzh);
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    public static com.google.android.gms.ads.ResponseInfo zzb(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        if (zzdxVar != null) {
            return new com.google.android.gms.ads.ResponseInfo(zzdxVar);
        }
        return null;
    }

    public static com.google.android.gms.ads.ResponseInfo zzc(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        return new com.google.android.gms.ads.ResponseInfo(zzdxVar);
    }

    public java.util.List<com.google.android.gms.ads.AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    public com.google.android.gms.ads.AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    public java.lang.String getMediationAdapterClassName() {
        try {
            com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zza;
            if (zzdxVar != null) {
                return zzdxVar.zze();
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public android.os.Bundle getResponseExtras() {
        try {
            com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zza;
            if (zzdxVar != null) {
                return zzdxVar.zzi();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new android.os.Bundle();
    }

    public java.lang.String getResponseId() {
        try {
            com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zza;
            if (zzdxVar != null) {
                return zzdxVar.zzf();
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public java.lang.String toString() {
        try {
            return zza().toString(2);
        } catch (org.json.JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final org.json.JSONObject zza() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
        } else {
            jSONObject.put("Response ID", responseId);
        }
        java.lang.String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            jSONArray.put(((com.google.android.gms.ads.AdapterResponseInfo) it.next()).zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        com.google.android.gms.ads.AdapterResponseInfo adapterResponseInfo = this.zzc;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.zzb());
        }
        android.os.Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", com.google.android.gms.ads.internal.client.zzay.zza().zzo(responseExtras));
        }
        return jSONObject;
    }

    public final com.google.android.gms.ads.internal.client.zzdx zzd() {
        return this.zza;
    }
}
