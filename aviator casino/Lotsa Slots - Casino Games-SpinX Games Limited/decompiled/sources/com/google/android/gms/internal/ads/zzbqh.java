package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbqh implements com.google.android.gms.internal.ads.zzbpq {
    private final java.lang.Object zza = new java.lang.Object();
    private final java.util.Map zzb = new java.util.HashMap();

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        java.lang.String concat;
        java.lang.String str = (java.lang.String) map.get("id");
        java.lang.String str2 = (java.lang.String) map.get(com.ironsource.X3.g.e);
        java.lang.String str3 = (java.lang.String) map.get("fail_reason");
        java.lang.String str4 = (java.lang.String) map.get("fail_stack");
        java.lang.String str5 = (java.lang.String) map.get("result");
        if (true == android.text.TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            java.lang.String.valueOf(str4);
            concat = "\n".concat(java.lang.String.valueOf(str4));
        }
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzbqg zzbqgVar = (com.google.android.gms.internal.ads.zzbqg) this.zzb.remove(str);
            if (zzbqgVar == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 50);
                sb.append("Received result for unexpected method invocation: ");
                sb.append(str);
                java.lang.String sb2 = sb.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                return;
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + concat.length());
                sb3.append(str3);
                sb3.append(concat);
                zzbqgVar.zzb(sb3.toString());
                return;
            }
            if (str5 == null) {
                zzbqgVar.zza(null);
                return;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    java.lang.String jSONObject2 = jSONObject.toString(2);
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(jSONObject2).length() + 13);
                    sb4.append("Result GMSG: ");
                    sb4.append(jSONObject2);
                    com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                }
                zzbqgVar.zza(jSONObject);
            } catch (org.json.JSONException e) {
                zzbqgVar.zzb(e.getMessage());
            }
        }
    }

    public final void zzb(java.lang.String str, com.google.android.gms.internal.ads.zzbqg zzbqgVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbqgVar);
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzbsy zzbsyVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        com.google.android.gms.ads.internal.zzt.zzc();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        zzb(uuid, new com.google.android.gms.internal.ads.zzbqf(this, zzcfwVar));
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbsyVar.zzb(str, jSONObject2);
        } catch (java.lang.Exception e) {
            zzcfwVar.zzd(e);
        }
        return zzcfwVar;
    }
}
