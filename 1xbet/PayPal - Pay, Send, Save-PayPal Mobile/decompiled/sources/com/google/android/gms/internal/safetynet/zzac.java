package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
public final class zzac implements com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult {
    private com.google.android.gms.common.api.Status zza;
    private final com.google.android.gms.safetynet.SafeBrowsingData zzb;
    private java.lang.String zzc;
    private long zzd;
    private byte[] zze;

    public zzac(com.google.android.gms.common.api.Status status, com.google.android.gms.safetynet.SafeBrowsingData safeBrowsingData) {
        this.zza = status;
        this.zzb = safeBrowsingData;
        this.zzc = null;
        if (safeBrowsingData != null) {
            this.zzc = safeBrowsingData.getMetadata();
            this.zzd = safeBrowsingData.getLastUpdateTimeMs();
            this.zze = safeBrowsingData.getState();
        } else if (status.isSuccess()) {
            this.zza = new com.google.android.gms.common.api.Status(8);
        }
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult
    public final java.util.List<com.google.android.gms.safetynet.SafeBrowsingThreat> getDetectedThreats() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = this.zzc;
        if (str != null) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("matches");
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add(new com.google.android.gms.safetynet.SafeBrowsingThreat(java.lang.Integer.parseInt(jSONArray.getJSONObject(i).getString("threat_type"))));
                    } catch (java.lang.NumberFormatException | org.json.JSONException unused) {
                    }
                }
            } catch (org.json.JSONException unused2) {
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult
    public final byte[] getState() {
        return this.zze;
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult
    public final java.lang.String getMetadata() {
        return this.zzc;
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult
    public final long getLastUpdateTimeMs() {
        return this.zzd;
    }
}
