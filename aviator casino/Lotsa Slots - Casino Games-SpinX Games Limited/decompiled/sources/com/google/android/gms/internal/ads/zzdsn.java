package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdsn {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final com.google.android.gms.internal.ads.zzdtc zzb;
    private final com.google.android.gms.internal.ads.zzdth zzc;
    private final com.google.android.gms.internal.ads.zzdzg zzd;

    zzdsn(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzdtc zzdtcVar, com.google.android.gms.internal.ads.zzdth zzdthVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar) {
        this.zza = zzhcgVar;
        this.zzb = zzdtcVar;
        this.zzc = zzdthVar;
        this.zzd = zzdzgVar;
    }

    private final com.google.common.util.concurrent.ListenableFuture zze(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzdyu zzdyuVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcU)).booleanValue()) {
            com.google.android.gms.internal.ads.zzhbw.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzdsk(this, zzdyuVar), this.zza);
        }
        return listenableFuture;
    }

    private static final boolean zzf(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzfkq zzfkqVar, final com.google.android.gms.internal.ads.zzfkf zzfkfVar, final org.json.JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        com.google.common.util.concurrent.ListenableFuture zza;
        org.json.JSONArray optJSONArray;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcP)).booleanValue()) {
            this.zzd.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_NATIVE_ASSETS_LOADING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final com.google.common.util.concurrent.ListenableFuture zzc = this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdsm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzdsn.this.zzb(zzfkqVar, zzfkfVar, jSONObject);
            }
        });
        zze(zzc, com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_BASIC_END);
        com.google.android.gms.internal.ads.zzdtc zzdtcVar = this.zzb;
        final com.google.common.util.concurrent.ListenableFuture zzb = zzdtcVar.zzb(jSONObject, "images", com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(zzb, com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_IMAGE_END);
        com.google.android.gms.internal.ads.zzfki zzfkiVar = zzfkqVar.zzb.zzb;
        final com.google.common.util.concurrent.ListenableFuture zzc2 = zzdtcVar.zzc(jSONObject, "images", zzfkfVar, zzfkiVar, zzbVar, zzcdnVar);
        zze(zzc2, com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final com.google.common.util.concurrent.ListenableFuture zza2 = zzdtcVar.zza(jSONObject, "secondary_image", com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(zza2, com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_LOGO_END);
        final com.google.common.util.concurrent.ListenableFuture zza3 = zzdtcVar.zza(jSONObject, "app_icon", com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_ICON_START);
        zze(zza3, com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_ICON_END);
        final com.google.common.util.concurrent.ListenableFuture zzd = zzdtcVar.zzd(jSONObject, com.ironsource.Y3.c, com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(zzd, com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final com.google.common.util.concurrent.ListenableFuture zzg = zzdtcVar.zzg(jSONObject, zzfkfVar, zzfkiVar, zzbVar, zzcdnVar);
        zze(zzg, com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzox)).booleanValue() && jSONObject.has("video")) {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject.has("flags") && (optJSONArray = optJSONObject.optJSONArray("flags")) != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 == null || !optJSONObject2.optString(com.ironsource.X3.i.W).equals("afma_video_player_type")) {
                        i++;
                    } else {
                        try {
                            if (java.lang.Integer.parseInt(optJSONObject2.optString("value")) == 3) {
                                zza = this.zzb.zzf(zzg);
                                zze(zza, com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_MEDIA_END);
                            }
                        } catch (java.lang.NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        zza = com.google.android.gms.internal.ads.zzhbw.zza(new android.os.Bundle());
        final com.google.common.util.concurrent.ListenableFuture listenableFuture = zza;
        final com.google.common.util.concurrent.ListenableFuture zza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(zza4, com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final com.google.common.util.concurrent.ListenableFuture zze = this.zzb.zze(jSONObject, zzbVar, zzcdnVar);
        zze(zze, com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_OMID_END);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(zzc);
        arrayList.add(zzb);
        arrayList.add(zzc2);
        arrayList.add(zza2);
        arrayList.add(zza3);
        arrayList.add(zzd);
        arrayList.add(zzg);
        arrayList.add(listenableFuture);
        arrayList.add(zza4);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgr)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(zze);
        }
        return com.google.android.gms.internal.ads.zzhbw.zzn(arrayList).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdsl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzdsn.this.zzc(zzc, zzb, zza3, zza2, zzd, jSONObject, zzg, listenableFuture, zzc2, zze, zza4);
            }
        }, this.zza);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdpt zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, org.json.JSONObject jSONObject) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcU)).booleanValue()) {
            this.zzd.zzf(com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_BASIC_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzdpt zzdptVar = new com.google.android.gms.internal.ads.zzdpt();
        zzdptVar.zza(jSONObject.optInt("template_id", -1));
        zzdptVar.zzl(jSONObject.optString("custom_template_id"));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdptVar.zzv(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
        if (!zzfkyVar.zzh.contains(java.lang.Integer.toString(zzdptVar.zzx()))) {
            int zzx = zzdptVar.zzx();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzx).length() + 21);
            sb.append("Invalid template ID: ");
            sb.append(zzx);
            throw new com.google.android.gms.internal.ads.zzeph(1, sb.toString());
        }
        if (zzdptVar.zzx() == 3) {
            if (zzdptVar.zzS() == null) {
                throw new com.google.android.gms.internal.ads.zzeph(1, "No custom template id for custom template ad response.");
            }
            if (!zzfkyVar.zzi.contains(zzdptVar.zzS())) {
                throw new com.google.android.gms.internal.ads.zzeph(1, "Unexpected custom template id in the response.");
            }
        }
        zzdptVar.zzi(jSONObject.optDouble("rating", -1.0d));
        java.lang.String optString = jSONObject.optString("headline", null);
        if (zzfkfVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            java.lang.String zzB = com.google.android.gms.ads.internal.util.zzs.zzB();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzB).length() + 3 + java.lang.String.valueOf(optString).length());
            sb2.append(zzB);
            sb2.append(" : ");
            sb2.append(optString);
            optString = sb2.toString();
        }
        zzdptVar.zzs("headline", optString);
        zzdptVar.zzs("body", jSONObject.optString("body", null));
        zzdptVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdptVar.zzs(com.ironsource.X3.i.U, jSONObject.optString(com.ironsource.X3.i.U, null));
        zzdptVar.zzs("price", jSONObject.optString("price", null));
        zzdptVar.zzs(com.ironsource.X3.i.F0, jSONObject.optString(com.ironsource.X3.i.F0, null));
        return zzdptVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.internal.ads.zzdpt zzc(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.common.util.concurrent.ListenableFuture listenableFuture2, com.google.common.util.concurrent.ListenableFuture listenableFuture3, com.google.common.util.concurrent.ListenableFuture listenableFuture4, com.google.common.util.concurrent.ListenableFuture listenableFuture5, org.json.JSONObject jSONObject, com.google.common.util.concurrent.ListenableFuture listenableFuture6, com.google.common.util.concurrent.ListenableFuture listenableFuture7, com.google.common.util.concurrent.ListenableFuture listenableFuture8, com.google.common.util.concurrent.ListenableFuture listenableFuture9, com.google.common.util.concurrent.ListenableFuture listenableFuture10) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcP)).booleanValue()) {
            this.zzd.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzdpt zzdptVar = (com.google.android.gms.internal.ads.zzdpt) listenableFuture.get();
        zzdptVar.zzd((java.util.List) listenableFuture2.get());
        zzdptVar.zzj((com.google.android.gms.internal.ads.zzbme) listenableFuture3.get());
        zzdptVar.zzk((com.google.android.gms.internal.ads.zzbme) listenableFuture4.get());
        zzdptVar.zzc((com.google.android.gms.internal.ads.zzblx) listenableFuture5.get());
        zzdptVar.zze(com.google.android.gms.internal.ads.zzdtc.zzl(jSONObject));
        zzdptVar.zzf(com.google.android.gms.internal.ads.zzdtc.zzk(jSONObject));
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) listenableFuture6.get();
        if (zzckuVar != null) {
            zzdptVar.zzm(zzckuVar);
            zzdptVar.zzg(zzckuVar.zzE());
            zzdptVar.zzb(zzckuVar.zzh());
        }
        zzdptVar.zzH().putAll((android.os.Bundle) listenableFuture7.get());
        com.google.android.gms.internal.ads.zzcku zzckuVar2 = (com.google.android.gms.internal.ads.zzcku) listenableFuture8.get();
        if (zzckuVar2 != null) {
            zzdptVar.zzn(zzckuVar2);
            zzdptVar.zzh(zzckuVar2.zzE());
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgr)).booleanValue() || zzf(jSONObject)) {
            com.google.android.gms.internal.ads.zzcku zzckuVar3 = (com.google.android.gms.internal.ads.zzcku) listenableFuture9.get();
            if (zzckuVar3 != null) {
                zzdptVar.zzo(zzckuVar3);
            }
        } else {
            zzdptVar.zzp(listenableFuture9);
            zzdptVar.zzr(new com.google.android.gms.internal.ads.zzcfw());
        }
        for (com.google.android.gms.internal.ads.zzdte zzdteVar : (java.util.List) listenableFuture10.get()) {
            if (zzdteVar.zza != 1) {
                zzdptVar.zzt(zzdteVar.zzb, zzdteVar.zzd);
            } else {
                zzdptVar.zzs(zzdteVar.zzb, zzdteVar.zzc);
            }
        }
        return zzdptVar;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzg zzd() {
        return this.zzd;
    }
}
