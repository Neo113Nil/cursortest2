package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcuc implements com.google.android.gms.internal.ads.zzbub {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzben zzb;
    private final android.os.PowerManager zzc;

    public zzcuc(android.content.Context context, com.google.android.gms.internal.ads.zzben zzbenVar) {
        this.zza = context;
        this.zzb = zzbenVar;
        this.zzc = (android.os.PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final org.json.JSONObject zzb(com.google.android.gms.internal.ads.zzcuf zzcufVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzbep zzbepVar = zzcufVar.zzf;
        if (zzbepVar == null) {
            jSONObject = new org.json.JSONObject();
        } else {
            com.google.android.gms.internal.ads.zzben zzbenVar = this.zzb;
            if (zzbenVar.zzc() == null) {
                throw new org.json.JSONException("Active view Info cannot be null.");
            }
            boolean z = zzbepVar.zza;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            org.json.JSONObject put = jSONObject3.put("afmaVersion", zzbenVar.zzb()).put("activeViewJSON", zzbenVar.zzc()).put(com.ironsource.C4.a.d, zzcufVar.zzd).put("adFormat", zzbenVar.zza()).put("hashCode", zzbenVar.zzd()).put("isMraid", false);
            boolean z2 = zzcufVar.zzc;
            org.json.JSONObject put2 = put.put("isStopped", false).put("isPaused", zzcufVar.zzb).put("isNative", zzbenVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzi().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzi().zzb());
            android.content.Context context = this.zza;
            put2.put(com.ironsource.X3.j.P, com.google.android.gms.ads.internal.util.zzaa.zze(context.getApplicationContext()));
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            org.json.JSONObject put3 = jSONObject3.put("windowVisibility", zzbepVar.zzb).put("isAttachedToWindow", z);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            android.graphics.Rect rect = zzbepVar.zzc;
            org.json.JSONObject put4 = put3.put("viewBox", jSONObject4.put("top", rect.top).put(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, rect.bottom).put("left", rect.left).put("right", rect.right));
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            android.graphics.Rect rect2 = zzbepVar.zzd;
            org.json.JSONObject put5 = put4.put("adBox", jSONObject5.put("top", rect2.top).put(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            android.graphics.Rect rect3 = zzbepVar.zze;
            org.json.JSONObject put6 = put5.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", zzbepVar.zzf);
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            android.graphics.Rect rect4 = zzbepVar.zzg;
            org.json.JSONObject put7 = put6.put("localVisibleBox", jSONObject7.put("top", rect4.top).put(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", zzbepVar.zzh);
            org.json.JSONObject jSONObject8 = new org.json.JSONObject();
            android.graphics.Rect rect5 = zzbepVar.zzi;
            put7.put("hitBox", jSONObject8.put("top", rect5.top).put(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put(com.ironsource.C3023e8.k, zzcufVar.zza);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcb)).booleanValue()) {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.List<android.graphics.Rect> list = zzbepVar.zzk;
                if (list != null) {
                    for (android.graphics.Rect rect6 : list) {
                        jSONArray2.put(new org.json.JSONObject().put("top", rect6.top).put(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!android.text.TextUtils.isEmpty(zzcufVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
