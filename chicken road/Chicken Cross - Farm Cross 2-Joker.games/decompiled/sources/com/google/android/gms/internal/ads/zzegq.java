package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.Te;
import com.ironsource.U3;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzegq {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcob zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzflw zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfrg zzi;
    private final zzeae zzj;
    private final zzfte zzk;
    private final zzdgt zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzccd zzq;

    zzegq(zzcob zzcobVar, Context context, VersionInfoParcel versionInfoParcel, zzflw zzflwVar, Executor executor, String str, zzfrg zzfrgVar, zzeae zzeaeVar, zzccd zzccdVar, zzejl zzejlVar, ScheduledExecutorService scheduledExecutorService, zzfte zzfteVar, zzdgt zzdgtVar) {
        this.zzb = zzcobVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzflwVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfrgVar;
        zzcobVar.zzB();
        this.zzj = zzeaeVar;
        this.zzq = zzccdVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfteVar;
        this.zzl = zzdgtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ListenableFuture zzg(String str, final String str2) {
        ListenableFuture zza2;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return zzhcy.zzc(new zzeqf(15, "Invalid ad string."));
        }
        Context context = this.zzc;
        zzfqw zzn = zzfqw.zzn(context, 11);
        zzn.zza();
        zzbva zzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(context, this.zzd, this.zzb.zzx());
        zzbuu zzbuuVar = zzbux.zza;
        final zzbuq zza3 = zzb.zza("google.afma.response.normalize", zzbuuVar, zzbuuVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzii)).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.zzn = jSONObject.optString("fetch_url", "");
                this.zzo = com.google.android.gms.ads.internal.util.zzbp.zza(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
            } catch (JSONException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid ad response.");
                str3 = this.zzn;
                final List list = this.zzo;
                if (TextUtils.isEmpty(str3)) {
                }
                zzhcg zzhcgVar = new zzhcg(this) { // from class: com.google.android.gms.internal.ads.zzegp
                    @Override // com.google.android.gms.internal.ads.zzhcg
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        String str5 = (String) obj;
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        String str6 = str2;
                        try {
                            jSONObject4.put("headers", new JSONObject());
                            jSONObject4.put("body", str5);
                            jSONObject3.put("base_url", "");
                            jSONObject3.put("signals", new JSONObject(str6));
                            jSONObject2.put("request", jSONObject3);
                            jSONObject2.put(Te.n, jSONObject4);
                            jSONObject2.put("flags", new JSONObject());
                            return zzhcy.zza(jSONObject2);
                        } catch (JSONException e) {
                            String valueOf = String.valueOf(e.getCause());
                            String.valueOf(valueOf);
                            throw new JSONException("Preloaded loader: ".concat(String.valueOf(valueOf)));
                        }
                    }
                };
                Executor executor = this.zzf;
                ListenableFuture zzj = zzhcy.zzj(zzhcy.zzj(zzhcy.zzj(zza2, zzhcgVar, executor), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzegl
                    @Override // com.google.android.gms.internal.ads.zzhcg
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzegq.this.zzb(zza3, (JSONObject) obj);
                    }
                }, executor), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzegm
                    @Override // com.google.android.gms.internal.ads.zzhcg
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzegq.this.zzc((JSONObject) obj);
                    }
                }, executor);
                zzfrf.zzd(zzj, this.zzi, zzn);
                zzhcy.zzr(zzj, new zzegk(this), zzcgj.zzh);
                return zzj;
            }
            str3 = this.zzn;
            final List list2 = this.zzo;
            if (TextUtils.isEmpty(str3)) {
                this.zzj.zzd("sst", "2");
                String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzik);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzij)).booleanValue()) {
                    List zzg = zzguz.zzb(zza).zzg(str3);
                    if (zzg.size() < 2) {
                        zza2 = zzhcy.zzc(new zzeqf(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) zzg.get(1);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        str3 = Uri.parse(str3).buildUpon().query(null).build().toString();
                    }
                }
                final zzeji zzejiVar = new zzeji(str3, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                zza2 = (zzhcq) zzhcy.zzh((zzhcq) zzhcy.zzi(zzhcq.zzw(zzcgj.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzegn
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzegq.this.zzd(zzejiVar);
                    }
                })), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzil)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzego
                    @Override // com.google.android.gms.internal.ads.zzhcg
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzegq.this.zze(list2, (Exception) obj);
                    }
                }, this.zzf);
            } else {
                zza2 = zzhcy.zza(str);
                this.zzj.zzd("sst", "1");
            }
        } else {
            zza2 = zzhcy.zza(str);
            this.zzj.zzd("sst", "1");
        }
        zzhcg zzhcgVar2 = new zzhcg(this) { // from class: com.google.android.gms.internal.ads.zzegp
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str52 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str6 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put("body", str52);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new JSONObject(str6));
                    jSONObject2.put("request", jSONObject3);
                    jSONObject2.put(Te.n, jSONObject4);
                    jSONObject2.put("flags", new JSONObject());
                    return zzhcy.zza(jSONObject2);
                } catch (JSONException e) {
                    String valueOf = String.valueOf(e.getCause());
                    String.valueOf(valueOf);
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(valueOf)));
                }
            }
        };
        Executor executor2 = this.zzf;
        ListenableFuture zzj2 = zzhcy.zzj(zzhcy.zzj(zzhcy.zzj(zza2, zzhcgVar2, executor2), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzegl
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzegq.this.zzb(zza3, (JSONObject) obj);
            }
        }, executor2), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzegm
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzegq.this.zzc((JSONObject) obj);
            }
        }, executor2);
        zzfrf.zzd(zzj2, this.zzi, zzn);
        zzhcy.zzr(zzj2, new zzegk(this), zzcgj.zzh);
        return zzj2;
    }

    private final void zzh(zzdzs zzdzsVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzin)).booleanValue()) {
            this.zzj.zzf(zzdzsVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }

    private final String zzi(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String concat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x022d, code lost:
    
        if (r5.zze(r1, r2, r4) == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01eb A[Catch: all -> 0x0242, TryCatch #2 {, blocks: (B:22:0x007c, B:24:0x009a, B:27:0x00a2, B:29:0x00af, B:31:0x00c9, B:32:0x00f6, B:34:0x0101, B:36:0x0109, B:37:0x010f, B:41:0x0118, B:44:0x014e, B:47:0x012c, B:50:0x0139, B:52:0x0154, B:55:0x00e0, B:57:0x0168, B:60:0x0185, B:64:0x018d, B:66:0x01b2, B:68:0x01c7, B:70:0x01eb, B:71:0x0200, B:74:0x0214, B:76:0x021a, B:77:0x0227, B:79:0x0229, B:81:0x0232, B:86:0x022f, B:87:0x01f5, B:88:0x01da, B:91:0x019b, B:94:0x0175, B:95:0x017a), top: B:21:0x007c, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021a A[Catch: all -> 0x0242, TryCatch #2 {, blocks: (B:22:0x007c, B:24:0x009a, B:27:0x00a2, B:29:0x00af, B:31:0x00c9, B:32:0x00f6, B:34:0x0101, B:36:0x0109, B:37:0x010f, B:41:0x0118, B:44:0x014e, B:47:0x012c, B:50:0x0139, B:52:0x0154, B:55:0x00e0, B:57:0x0168, B:60:0x0185, B:64:0x018d, B:66:0x01b2, B:68:0x01c7, B:70:0x01eb, B:71:0x0200, B:74:0x0214, B:76:0x021a, B:77:0x0227, B:79:0x0229, B:81:0x0232, B:86:0x022f, B:87:0x01f5, B:88:0x01da, B:91:0x019b, B:94:0x0175, B:95:0x017a), top: B:21:0x007c, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0229 A[Catch: all -> 0x0242, TryCatch #2 {, blocks: (B:22:0x007c, B:24:0x009a, B:27:0x00a2, B:29:0x00af, B:31:0x00c9, B:32:0x00f6, B:34:0x0101, B:36:0x0109, B:37:0x010f, B:41:0x0118, B:44:0x014e, B:47:0x012c, B:50:0x0139, B:52:0x0154, B:55:0x00e0, B:57:0x0168, B:60:0x0185, B:64:0x018d, B:66:0x01b2, B:68:0x01c7, B:70:0x01eb, B:71:0x0200, B:74:0x0214, B:76:0x021a, B:77:0x0227, B:79:0x0229, B:81:0x0232, B:86:0x022f, B:87:0x01f5, B:88:0x01da, B:91:0x019b, B:94:0x0175, B:95:0x017a), top: B:21:0x007c, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f5 A[Catch: all -> 0x0242, TryCatch #2 {, blocks: (B:22:0x007c, B:24:0x009a, B:27:0x00a2, B:29:0x00af, B:31:0x00c9, B:32:0x00f6, B:34:0x0101, B:36:0x0109, B:37:0x010f, B:41:0x0118, B:44:0x014e, B:47:0x012c, B:50:0x0139, B:52:0x0154, B:55:0x00e0, B:57:0x0168, B:60:0x0185, B:64:0x018d, B:66:0x01b2, B:68:0x01c7, B:70:0x01eb, B:71:0x0200, B:74:0x0214, B:76:0x021a, B:77:0x0227, B:79:0x0229, B:81:0x0232, B:86:0x022f, B:87:0x01f5, B:88:0x01da, B:91:0x019b, B:94:0x0175, B:95:0x017a), top: B:21:0x007c, inners: #0, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zza() {
        String str;
        int i;
        String str2;
        String string;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcU)).booleanValue()) {
            this.zzp = this.zze.zzt;
            this.zzj.zzf(zzdzs.SCAR_PRELOADER_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String str3 = this.zze.zzd.zzx;
        if (!TextUtils.isEmpty(str3)) {
            String zzj = zzj(str3);
            zzbix zzbixVar = zzbjg.zzie;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue() && zzj.isEmpty()) {
                int lastIndexOf = str3.lastIndexOf("&request_id=");
                zzj = lastIndexOf != -1 ? str3.substring(lastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(zzj)) {
                return zzhcy.zzc(new zzeqf(15, "Invalid ad string."));
            }
            synchronized (this.zzm) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzq zzt = this.zzb.zzt();
                zzeae zzeaeVar = this.zzj;
                String zzb = zzt.zzb(zzj, zzeaeVar);
                String str4 = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue() && !TextUtils.isEmpty(zzb)) {
                    try {
                        JSONObject optJSONObject = new JSONObject(zzb).optJSONObject("extras");
                        if (optJSONObject != null) {
                            if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzig)).booleanValue() ? Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzih)).split(",")) : Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzif)).split(","))).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(optJSONObject.optString("query_info_type", "")))) {
                                int lastIndexOf2 = str3.lastIndexOf(U3.j.c);
                                String substring = lastIndexOf2 != -1 ? str3.substring(0, lastIndexOf2) : null;
                                if (!TextUtils.isEmpty(substring)) {
                                    try {
                                        byte[] decode = Base64.decode(substring, 11);
                                        byte[] bytes = zzj.getBytes(StandardCharsets.UTF_8);
                                        if (!TextUtils.isEmpty(zzb)) {
                                            try {
                                                string = new JSONObject(zzb).getString("arek");
                                            } catch (JSONException e) {
                                                com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                            }
                                            str3 = zzfmm.zzb(decode, bytes, string, zzeaeVar);
                                        }
                                        string = null;
                                        str3 = zzfmm.zzb(decode, bytes, string, zzeaeVar);
                                    } catch (IllegalArgumentException e2) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                    }
                                }
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    try {
                        str = new JSONObject(str3).optString("render_id", "");
                    } catch (JSONException unused2) {
                        str = "";
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    String str5 = "";
                    try {
                        str5 = new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
                    } catch (IllegalArgumentException e3) {
                        String.valueOf(str);
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str)));
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e3, "PreloadedLoader.decodeRenderId");
                    }
                    List zzg = zzguz.zza(zzgty.zzd(AbstractJsonLexerKt.COLON)).zzg(str5);
                    if (zzg.size() == 2) {
                        str4 = (String) zzg.get(0);
                        i = Integer.parseInt((String) zzg.get(1));
                        Pair pair = str4 == null ? new Pair(str4, Integer.valueOf(i)) : new Pair("", 0);
                        str2 = (String) pair.first;
                        int intValue = ((Integer) pair.second).intValue();
                        if (!TextUtils.isEmpty(str2) && intValue > 0) {
                            if (!zzt.zzd(zzj, str2)) {
                                return zzhcy.zzc(new zzeqf(10, "The ad has already been shown."));
                            }
                        }
                        zzt.zzc(zzj);
                        if (!TextUtils.isEmpty(zzb)) {
                            return zzg(str3, zzi(zzb));
                        }
                    } else {
                        String.valueOf(str);
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str)));
                    }
                }
                i = 0;
                if (str4 == null) {
                }
                str2 = (String) pair.first;
                int intValue2 = ((Integer) pair.second).intValue();
                if (!TextUtils.isEmpty(str2)) {
                    if (!zzt.zzd(zzj, str2)) {
                    }
                }
                zzt.zzc(zzj);
                if (!TextUtils.isEmpty(zzb)) {
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhW)).booleanValue()) {
                String str6 = zzcVar.zza;
                String str7 = zzcVar.zzb;
                String zzj2 = zzj(str6);
                String zzj3 = zzj(str7);
                if (TextUtils.isEmpty(zzj3) || !zzj2.equals(zzj3)) {
                    this.zzj.zzc().put("ridmm", "true");
                } else {
                    this.zzb.zzt().zzc(zzj2);
                    this.zzj.zzc().put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, zzj2);
                }
            }
            return zzg(zzcVar.zza, zzi(zzcVar.zzb));
        }
        return zzhcy.zzc(new zzeqf(14, "Mismatch request IDs."));
    }

    final /* synthetic */ ListenableFuture zzb(zzbuq zzbuqVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcU)).booleanValue()) {
            this.zzj.zzf(zzdzs.SCAR_PRELOADER_PROCESSING_DONE.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzbuqVar.zzb(jSONObject);
    }

    final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject) {
        zzfll zzfllVar = new zzfll(this.zze);
        String jSONObject2 = jSONObject.toString();
        return zzhcy.zza(new zzflo(zzfllVar, zzfln.zza(new StringReader(jSONObject2), this.zzp)));
    }

    final /* synthetic */ String zzd(zzeji zzejiVar) {
        zzh(zzdzs.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzim)).intValue()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i2);
                    throw new zzeqf(1, sb.toString());
                }
                zzeji zzejiVar2 = zzejiVar;
                zzejj zza2 = new zzejk(this.zzc, this.zzd.afmaVersion, this.zzq, Binder.getCallingUid(), null).zza(zzejiVar);
                zzejj zzejjVar = zza2;
                int i3 = zza2.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzin)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i));
                }
                if (i3 == 200) {
                    zzh(zzdzs.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zza2.zzc;
                }
                i++;
                i2 = i3;
            } catch (Exception e) {
                throw new zzeqf(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }

    final /* synthetic */ ListenableFuture zze(List list, Exception exc) {
        zzeqf zzeqfVar;
        com.google.android.gms.ads.internal.zzt.zzh().zzi(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzeqfVar = new zzeqf(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzeqf) {
            zzeqfVar = (zzeqf) exc;
        } else {
            zzeqfVar = new zzeqf(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzeqfVar.getMessage() == null ? "" : zzeqfVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List zzg = zzguz.zza(zzgty.zzd(AbstractJsonLexerKt.COLON)).zzg(message);
                    if (zzg.size() == 2) {
                        message = (String) zzg.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfta.zzd(zzfta.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzhcy.zzc(zzeqfVar);
    }

    final /* synthetic */ zzdgt zzf() {
        return this.zzl;
    }
}
