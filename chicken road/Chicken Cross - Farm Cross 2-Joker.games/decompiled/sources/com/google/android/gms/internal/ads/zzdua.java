package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.V3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdua {
    private final Context zza;
    private final zzdtg zzb;
    private final zzbbd zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbif zzf;
    private final Executor zzg;
    private final zzbmk zzh;
    private final zzdus zzi;
    private final zzdxg zzj;
    private final ScheduledExecutorService zzk;
    private final zzdwb zzl;
    private final zzeaj zzm;
    private final zzfte zzn;
    private final zzele zzo;
    private final zzelp zzp;
    private final zzfma zzq;
    private final zzeae zzr;
    private final zzebm zzs;
    private final zzdcg zzt;

    public zzdua(Context context, zzdtg zzdtgVar, zzbbd zzbbdVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbif zzbifVar, Executor executor, zzflw zzflwVar, zzdus zzdusVar, zzdxg zzdxgVar, ScheduledExecutorService scheduledExecutorService, zzeaj zzeajVar, zzfte zzfteVar, zzele zzeleVar, zzdwb zzdwbVar, zzelp zzelpVar, zzfma zzfmaVar, zzeae zzeaeVar, zzebm zzebmVar, zzdcg zzdcgVar) {
        this.zza = context;
        this.zzb = zzdtgVar;
        this.zzc = zzbbdVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbifVar;
        this.zzg = executor;
        this.zzh = zzflwVar.zzj;
        this.zzi = zzdusVar;
        this.zzj = zzdxgVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzeajVar;
        this.zzn = zzfteVar;
        this.zzo = zzeleVar;
        this.zzl = zzdwbVar;
        this.zzp = zzelpVar;
        this.zzq = zzfmaVar;
        this.zzr = zzeaeVar;
        this.zzs = zzebmVar;
        this.zzt = zzdcgVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzew zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzs(optJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (optJSONObject == null) {
            return zzgxm.zzi();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgxm.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzew zzs = zzs(optJSONArray.optJSONObject(i));
            if (zzs != null) {
                arrayList.add(zzs);
            }
        }
        return zzgxm.zzq(arrayList);
    }

    private final ListenableFuture zzm(JSONArray jSONArray, boolean z, boolean z2, zzdzs zzdzsVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzhcy.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcZ)).booleanValue()) {
            this.zzr.zzf(zzdzsVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z, null));
        }
        return zzhcy.zzk(zzhcy.zzm(arrayList), zzdtz.zza, this.zzg);
    }

    private final ListenableFuture zzn(JSONObject jSONObject, boolean z, zzdzs zzdzsVar) {
        HashMap hashMap;
        final String optString;
        final double optDouble;
        final int optInt;
        final int optInt2;
        if (jSONObject == null) {
            return zzhcy.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeX)).booleanValue()) {
            if (jSONObject.has((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeY))) {
                HashMap hashMap2 = new HashMap();
                for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeZ)).split(",")) {
                    try {
                        hashMap2.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
                hashMap = hashMap2;
                optString = jSONObject.optString("url");
                if (!TextUtils.isEmpty(optString) && hashMap == null) {
                    return zzhcy.zza(null);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcZ)).booleanValue() && zzdzsVar != null) {
                    this.zzr.zzf(zzdzsVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                }
                optDouble = jSONObject.optDouble("scale", 1.0d);
                boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
                optInt = jSONObject.optInt("width", -1);
                optInt2 = jSONObject.optInt("height", -1);
                if (!z || hashMap != null) {
                    return zzhcy.zza(new zzbmg(null, Uri.parse(optString), optDouble, optInt, optInt2, hashMap));
                }
                return zzq("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), zzhcy.zzk(this.zzb.zza(optString, optDouble, optBoolean), new zzgub() { // from class: com.google.android.gms.internal.ads.zzdtp
                    @Override // com.google.android.gms.internal.ads.zzgub
                    public final /* synthetic */ Object apply(Object obj) {
                        return new zzbmg(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2, null);
                    }
                }, this.zzg), null);
            }
        }
        hashMap = null;
        optString = jSONObject.optString("url");
        if (!TextUtils.isEmpty(optString)) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcZ)).booleanValue()) {
            this.zzr.zzf(zzdzsVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean2 = jSONObject.optBoolean("is_transparent", true);
        optInt = jSONObject.optInt("width", -1);
        optInt2 = jSONObject.optInt("height", -1);
        if (!z) {
        }
        return zzhcy.zza(new zzbmg(null, Uri.parse(optString), optDouble, optInt, optInt2, hashMap));
    }

    private static Integer zzo(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfld zzfldVar, zzflg zzflgVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcef zzcefVar) {
        final ListenableFuture zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfldVar, zzflgVar, zzr(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzcefVar);
        return zzhcy.zzj(zzb, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzdtu
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzclm zzclmVar = (zzclm) obj;
                if (zzclmVar == null || zzclmVar.zzh() == null) {
                    throw new zzeqf(1, "Retrieve video view in html5 ad response failed.");
                }
                return ListenableFuture.this;
            }
        }, zzcgj.zzh);
    }

    private final ListenableFuture zzq(String str, boolean z, final ListenableFuture listenableFuture, Object obj) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzda)).booleanValue()) {
            zzcgm.zza(listenableFuture, str, this.zzg);
        }
        if (z) {
            return zzhcy.zzj(listenableFuture, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzdtw
                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ListenableFuture zza(Object obj2) {
                    return obj2 != null ? ListenableFuture.this : zzhcy.zzc(new zzeqf(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcgj.zzh);
        }
        final Object obj2 = null;
        return zzhcy.zzh(listenableFuture, Exception.class, new zzhcg(obj2) { // from class: com.google.android.gms.internal.ads.zzdtv
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzhcy.zza(null);
            }
        }, zzcgj.zzh);
    }

    private static final com.google.android.gms.ads.internal.client.zzew zzs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzew(optString, optString2);
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str, zzdzs zzdzsVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdzsVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject, String str, zzdzs zzdzsVar) {
        zzbmk zzbmkVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbmkVar.zzb, zzbmkVar.zzd, zzdzsVar);
    }

    public final ListenableFuture zzc(JSONObject jSONObject, String str, final zzfld zzfldVar, final zzflg zzflgVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcef zzcefVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlG)).booleanValue()) {
            return zzhcy.zza(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzhcy.zza(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzhcy.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeX)).booleanValue()) {
            if (optJSONObject.has((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeY))) {
                return zzhcy.zza(null);
            }
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzr = zzr(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzhcy.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcZ)).booleanValue()) {
            this.zzr.zzf(zzdzs.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture zzj = zzhcy.zzj(zzhcy.zza(null), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzdtq
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdua.this.zzh(zzr, zzfldVar, zzflgVar, zzbVar, zzcefVar, optString, optString2, obj);
            }
        }, zzcgj.zzf);
        ListenableFuture zzj2 = zzhcy.zzj(zzj, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzdtr
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                if (((zzclm) obj) != null) {
                    return ListenableFuture.this;
                }
                throw new zzeqf(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcgj.zzh);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzda)).booleanValue()) {
            zzcgm.zza(zzj2, "NativeAssetsLoader.loadImageHtml", this.zzg);
        }
        return zzj2;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str, zzdzs zzdzsVar) {
        final JSONObject optJSONObject = jSONObject.optJSONObject(V3.c);
        if (optJSONObject == null) {
            return zzhcy.zza(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzq("NativeAssetsLoader.loadAttributionInfo", optJSONObject.optBoolean("require"), zzhcy.zzk(zzm(optJSONArray, false, true, zzdzsVar), new zzgub() { // from class: com.google.android.gms.internal.ads.zzdts
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzdua.this.zzi(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcef zzcefVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzhcy.zza(null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject == null) {
            return zzhcy.zza(null);
        }
        final String optString = optJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(optString)) {
            return zzhcy.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcZ)).booleanValue()) {
            this.zzr.zzf(zzdzs.NATIVE_ASSETS_LOADING_OMID_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture zzj = zzhcy.zzj(zzhcy.zza(null), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzdtt
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdua.this.zzj(optString, zzcefVar, zzbVar, obj);
            }
        }, zzcgj.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzda)).booleanValue()) {
            zzcgm.zza(zzj, "NativeAssetsLoader.omidWebView", this.zzg);
        }
        return zzj;
    }

    public final ListenableFuture zzf(ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcZ)).booleanValue()) {
            this.zzr.zzf(zzdzs.NATIVE_ASSETS_LOADING_MEDIA_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcgo zzcgoVar = new zzcgo();
        zzhcy.zzr(listenableFuture, new zzdto(this, zzcgoVar), zzcgj.zzf);
        return zzcgoVar;
    }

    public final ListenableFuture zzg(JSONObject jSONObject, zzfld zzfldVar, zzflg zzflgVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcef zzcefVar) {
        JSONObject zzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", "instream");
        if (zzi != null) {
            return zzp(zzi, zzfldVar, zzflgVar, zzbVar, zzcefVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzhcy.zza(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlF)).booleanValue() && optJSONObject.has("html");
        if (!TextUtils.isEmpty(optString) || z) {
            return zzq(true != z ? "NativeAssetsLoader.loadVideoView" : "NativeAssetsLoader.loadVideoHtml", false, zzhcy.zzi(z ? zzp(optJSONObject, zzfldVar, zzflgVar, zzbVar, zzcefVar) : this.zzi.zza(optJSONObject, zzbVar, zzcefVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeP)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
        return zzhcy.zza(null);
    }

    final /* synthetic */ ListenableFuture zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfld zzfldVar, zzflg zzflgVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcef zzcefVar, String str, String str2, Object obj) {
        zzebm zzebmVar;
        zzclm zza = this.zzj.zza(zzrVar, zzfldVar, zzflgVar);
        final zzcgn zza2 = zzcgn.zza(zza);
        zzdvy zza3 = this.zzl.zza();
        zzcnk zzP = zza.zzP();
        zzbix zzbixVar = zzbjg.zzpx;
        zzP.zzab(zza3, zza3, zza3, zza3, zza3, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue() ? null : zzcefVar, this.zzo, this.zzn, this.zzm, null, zza3, null, null, null, null, null, null, null, this.zzt);
        zza.zzab("/getNativeAdViewSignals", zzbqg.zzs);
        zza.zzab("/getNativeClickMeta", zzbqg.zzt);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziQ)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziS)).booleanValue() && (zzebmVar = this.zzs) != null) {
                zza.zzab("/onDeviceStorageEvent", new zzbqp(zzebmVar));
            }
        }
        zza.zzP().zzS(true);
        zza.zzP().zzG(new zzcni() { // from class: com.google.android.gms.internal.ads.zzdty
            @Override // com.google.android.gms.internal.ads.zzcni
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzcgn zzcgnVar = zzcgn.this;
                if (z) {
                    zzcgnVar.zzb();
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Image Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzcgnVar.zzd(new zzeqf(1, sb.toString()));
            }
        });
        zza.zzau(str, str2, null);
        return zza2;
    }

    final /* synthetic */ zzbmd zzi(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzo = zzo(jSONObject, "bg_color");
        Integer zzo2 = zzo(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbmd(optString, list, zzo, zzo2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    final /* synthetic */ ListenableFuture zzj(String str, zzcef zzcefVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) {
        com.google.android.gms.ads.internal.zzt.zzd();
        Context context = this.zza;
        zzelp zzelpVar = this.zzp;
        zzclm zza = zzcmc.zza(context, zzcnw.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzelpVar, this.zzq, this.zzm);
        final zzcgn zza2 = zzcgn.zza(zza);
        zza.zzP().zzG(new zzcni() { // from class: com.google.android.gms.internal.ads.zzdtx
            @Override // com.google.android.gms.internal.ads.zzcni
            public final /* synthetic */ void zza(boolean z, int i, String str2, String str3) {
                zzcgn.this.zzb();
            }
        });
        zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpx)).booleanValue()) {
            if (zzcefVar != null) {
                zza.zzP().zzj(zzcefVar);
            }
            zza.zzP().zzi(zzbVar);
        }
        return zza2;
    }

    private final com.google.android.gms.ads.internal.client.zzr zzr(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i, i2));
    }
}
