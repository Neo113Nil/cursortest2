package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.U3;
import com.ironsource.V3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdtl {
    private final zzhdi zza;
    private final zzdua zzb;
    private final zzduf zzc;
    private final zzeae zzd;

    zzdtl(zzhdi zzhdiVar, zzdua zzduaVar, zzduf zzdufVar, zzeae zzeaeVar) {
        this.zza = zzhdiVar;
        this.zzb = zzduaVar;
        this.zzc = zzdufVar;
        this.zzd = zzeaeVar;
    }

    private final ListenableFuture zze(ListenableFuture listenableFuture, zzdzs zzdzsVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcZ)).booleanValue()) {
            zzhcy.zzr(listenableFuture, new zzdti(this, zzdzsVar), this.zza);
        }
        return listenableFuture;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final ListenableFuture zza(final zzflo zzfloVar, final zzfld zzfldVar, final JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcef zzcefVar) {
        ListenableFuture zza;
        JSONArray optJSONArray;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcU)).booleanValue()) {
            this.zzd.zzf(zzdzs.RENDERING_NATIVE_ASSETS_LOADING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture submit = this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdtk
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdtl.this.zzb(zzfloVar, zzfldVar, jSONObject);
            }
        });
        zze(submit, zzdzs.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdua zzduaVar = this.zzb;
        final ListenableFuture zzb = zzduaVar.zzb(jSONObject, "images", zzdzs.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(zzb, zzdzs.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzflg zzflgVar = zzfloVar.zzb.zzb;
        final ListenableFuture zzc = zzduaVar.zzc(jSONObject, "images", zzfldVar, zzflgVar, zzbVar, zzcefVar);
        zze(zzc, zzdzs.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final ListenableFuture zza2 = zzduaVar.zza(jSONObject, "secondary_image", zzdzs.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(zza2, zzdzs.NATIVE_ASSETS_LOADING_LOGO_END);
        final ListenableFuture zza3 = zzduaVar.zza(jSONObject, "app_icon", zzdzs.NATIVE_ASSETS_LOADING_ICON_START);
        zze(zza3, zzdzs.NATIVE_ASSETS_LOADING_ICON_END);
        final ListenableFuture zzd = zzduaVar.zzd(jSONObject, V3.c, zzdzs.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(zzd, zzdzs.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final ListenableFuture zzg = zzduaVar.zzg(jSONObject, zzfldVar, zzflgVar, zzbVar, zzcefVar);
        zze(zzg, zzdzs.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoO)).booleanValue() && jSONObject.has("video")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject.has("flags") && (optJSONArray = optJSONObject.optJSONArray("flags")) != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 == null || !optJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i++;
                    } else {
                        try {
                            if (Integer.parseInt(optJSONObject2.optString("value")) == 3) {
                                zza = this.zzb.zzf(zzg);
                                zze(zza, zzdzs.NATIVE_ASSETS_LOADING_MEDIA_END);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        zza = zzhcy.zza(new Bundle());
        final ListenableFuture listenableFuture = zza;
        final ListenableFuture zza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(zza4, zzdzs.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final ListenableFuture zze = this.zzb.zze(jSONObject, zzbVar, zzcefVar);
        zze(zze, zzdzs.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(submit);
        arrayList.add(zzb);
        arrayList.add(zzc);
        arrayList.add(zza2);
        arrayList.add(zza3);
        arrayList.add(zzd);
        arrayList.add(zzg);
        arrayList.add(listenableFuture);
        arrayList.add(zza4);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgx)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(zze);
        }
        return zzhcy.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdtj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdtl.this.zzc(submit, zzb, zza3, zza2, zzd, jSONObject, zzg, listenableFuture, zzc, zze, zza4);
            }
        }, this.zza);
    }

    final /* synthetic */ zzdqr zzb(zzflo zzfloVar, zzfld zzfldVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcZ)).booleanValue()) {
            this.zzd.zzf(zzdzs.NATIVE_ASSETS_LOADING_BASIC_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdqr zzdqrVar = new zzdqr();
        zzdqrVar.zza(jSONObject.optInt("template_id", -1));
        zzdqrVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdqrVar.zzv(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzflw zzflwVar = zzfloVar.zza.zza;
        if (!zzflwVar.zzh.contains(Integer.toString(zzdqrVar.zzx()))) {
            int zzx = zzdqrVar.zzx();
            StringBuilder sb = new StringBuilder(String.valueOf(zzx).length() + 21);
            sb.append("Invalid template ID: ");
            sb.append(zzx);
            throw new zzeqf(1, sb.toString());
        }
        if (zzdqrVar.zzx() == 3) {
            if (zzdqrVar.zzS() == null) {
                throw new zzeqf(1, "No custom template id for custom template ad response.");
            }
            if (!zzflwVar.zzi.contains(zzdqrVar.zzS())) {
                throw new zzeqf(1, "Unexpected custom template id in the response.");
            }
        }
        zzdqrVar.zzi(jSONObject.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d));
        String optString = jSONObject.optString("headline", null);
        if (zzfldVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String zzB = com.google.android.gms.ads.internal.util.zzs.zzB();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzB).length() + 3 + String.valueOf(optString).length());
            sb2.append(zzB);
            sb2.append(" : ");
            sb2.append(optString);
            optString = sb2.toString();
        }
        zzdqrVar.zzs("headline", optString);
        zzdqrVar.zzs("body", jSONObject.optString("body", null));
        zzdqrVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdqrVar.zzs(U3.i.U, jSONObject.optString(U3.i.U, null));
        zzdqrVar.zzs("price", jSONObject.optString("price", null));
        zzdqrVar.zzs(U3.i.F0, jSONObject.optString(U3.i.F0, null));
        return zzdqrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdqr zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcU)).booleanValue()) {
            this.zzd.zzf(zzdzs.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdqr zzdqrVar = (zzdqr) listenableFuture.get();
        zzdqrVar.zzd((List) listenableFuture2.get());
        zzdqrVar.zzj((zzbmv) listenableFuture3.get());
        zzdqrVar.zzk((zzbmv) listenableFuture4.get());
        zzdqrVar.zzc((zzbmo) listenableFuture5.get());
        zzdqrVar.zze(zzdua.zzl(jSONObject));
        zzdqrVar.zzf(zzdua.zzk(jSONObject));
        zzclm zzclmVar = (zzclm) listenableFuture6.get();
        if (zzclmVar != null) {
            zzdqrVar.zzm(zzclmVar);
            zzdqrVar.zzg(zzclmVar.zzE());
            zzdqrVar.zzb(zzclmVar.zzh());
        }
        zzdqrVar.zzH().putAll((Bundle) listenableFuture7.get());
        zzclm zzclmVar2 = (zzclm) listenableFuture8.get();
        if (zzclmVar2 != null) {
            zzdqrVar.zzn(zzclmVar2);
            zzdqrVar.zzh(zzclmVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgx)).booleanValue() || zzf(jSONObject)) {
            zzclm zzclmVar3 = (zzclm) listenableFuture9.get();
            if (zzclmVar3 != null) {
                zzdqrVar.zzo(zzclmVar3);
            }
        } else {
            zzdqrVar.zzp(listenableFuture9);
            zzdqrVar.zzr(new zzcgo());
        }
        for (zzduc zzducVar : (List) listenableFuture10.get()) {
            if (zzducVar.zza != 1) {
                zzdqrVar.zzt(zzducVar.zzb, zzducVar.zzd);
            } else {
                zzdqrVar.zzs(zzducVar.zzb, zzducVar.zzc);
            }
        }
        return zzdqrVar;
    }

    final /* synthetic */ zzeae zzd() {
        return this.zzd;
    }
}
