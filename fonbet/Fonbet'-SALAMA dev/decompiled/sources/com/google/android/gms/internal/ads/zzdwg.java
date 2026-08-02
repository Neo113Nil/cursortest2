package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import P2.K;
import P2.L;
import Y4.D;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import io.sentry.ProfilingTraceData;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Response;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzdwg {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcgb zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfba zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzffy zzi;
    private final zzdqk zzj;
    private final zzfia zzk;
    private final Object zzl = new Object();
    private String zzm;
    private List zzn;
    private final zzbuw zzo;

    public zzdwg(zzcgb zzcgbVar, Context context, VersionInfoParcel versionInfoParcel, zzfba zzfbaVar, Executor executor, String str, zzffy zzffyVar, zzdqk zzdqkVar, zzbuw zzbuwVar, zzdyl zzdylVar, ScheduledExecutorService scheduledExecutorService, zzfia zzfiaVar) {
        this.zzb = zzcgbVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfbaVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzffyVar;
        zzcgbVar.zzw();
        this.zzj = zzdqkVar;
        this.zzo = zzbuwVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfiaVar;
    }

    public static I3.b zza(zzdwg zzdwgVar, List list, Exception exc) {
        zzefk zzefkVar;
        o.f1952C.f1961g.zzv(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzefkVar = new zzefk(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzefk) {
            zzefkVar = (zzefk) exc;
        } else {
            zzefkVar = new zzefk(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzefkVar.getMessage() == null ? "" : zzefkVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = ProfilingTraceData.TRUNCATION_REASON_TIMEOUT;
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List zzf = zzftw.zzb(zzfss.zzc(':')).zzf(message);
                    if (zzf.size() == 2) {
                        message = (String) zzf.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfhv.zzc(zzfhv.zzc((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            zzdwgVar.zzk.zze(arrayList, null);
        }
        return zzgbc.zzg(zzefkVar);
    }

    public static String zzd(zzdwg zzdwgVar, zzdyi zzdyiVar) {
        zzdwgVar.zzg(zzdpy.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i7 = 0;
        int i8 = -1;
        while (true) {
            try {
                zzbbp zzbbpVar = zzbby.zzhd;
                C0254t c0254t = C0254t.f2723d;
                if (i7 >= ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue()) {
                    throw new zzefk(1, "Received HTTP error code from ad server:" + i8);
                }
                zzdyj zza2 = new zzdyk(zzdwgVar.zzc, zzdwgVar.zzd.f10834a, zzdwgVar.zzo, Binder.getCallingUid()).zza(zzdyiVar);
                int i9 = zza2.zza;
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzhe)).booleanValue()) {
                    zzdwgVar.zzj.zzd("fr", String.valueOf(i7));
                }
                if (i9 == 200) {
                    zzdwgVar.zzg(zzdpy.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zza2.zzc;
                }
                i7++;
                i8 = i9;
            } catch (Exception e7) {
                throw new zzefk(1, e7.getMessage() == null ? "Fetch failed." : e7.getMessage(), e7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final I3.b zze(String str, final String str2) {
        I3.b zzh;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return zzgbc.zzg(new zzefk(15, "Invalid ad string."));
        }
        zzffn zza2 = zzffm.zza(this.zzc, 11);
        zza2.zzi();
        zzbnq zza3 = o.f1952C.f1970q.zza(this.zzc, this.zzd, this.zzb.zzy());
        zzbnk zzbnkVar = zzbnn.zza;
        final zzbng zza4 = zza3.zza("google.afma.response.normalize", zzbnkVar, zzbnkVar);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgZ)).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.zzm = jSONObject.optString("fetch_url", "");
                this.zzn = D.A0(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
            } catch (JSONException unused) {
                int i7 = J.f3546b;
                j.g("Invalid ad response.");
                str3 = this.zzm;
                final List list = this.zzn;
                if (TextUtils.isEmpty(str3)) {
                }
                I3.b zzn = zzgbc.zzn(zzgbc.zzn(zzgbc.zzn(zzh, new zzgaj(this) { // from class: com.google.android.gms.internal.ads.zzdwb
                    @Override // com.google.android.gms.internal.ads.zzgaj
                    public final I3.b zza(Object obj) {
                        String str5 = (String) obj;
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        String str6 = str2;
                        try {
                            jSONObject4.put("headers", new JSONObject());
                            jSONObject4.put(SentryLogEvent.JsonKeys.BODY, str5);
                            jSONObject3.put("base_url", "");
                            jSONObject3.put("signals", new JSONObject(str6));
                            jSONObject2.put(SentryBaseEvent.JsonKeys.REQUEST, jSONObject3);
                            jSONObject2.put(Response.TYPE, jSONObject4);
                            jSONObject2.put("flags", new JSONObject());
                            return zzgbc.zzh(jSONObject2);
                        } catch (JSONException e7) {
                            throw new JSONException("Preloaded loader: ".concat(String.valueOf(e7.getCause())));
                        }
                    }
                }, this.zzf), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdwc
                    @Override // com.google.android.gms.internal.ads.zzgaj
                    public final I3.b zza(Object obj) {
                        return zzbng.this.zzb((JSONObject) obj);
                    }
                }, this.zzf), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdwd
                    @Override // com.google.android.gms.internal.ads.zzgaj
                    public final I3.b zza(Object obj) {
                        I3.b zzh2;
                        zzh2 = zzgbc.zzh(new zzfar(new zzfao(zzdwg.this.zze), zzfaq.zza(new StringReader(((JSONObject) obj).toString()), null)));
                        return zzh2;
                    }
                }, this.zzf);
                zzffx.zza(zzn, this.zzi, zza2);
                return zzn;
            }
            str3 = this.zzm;
            final List list2 = this.zzn;
            if (TextUtils.isEmpty(str3)) {
                this.zzj.zzd("sst", "2");
                zzbbp zzbbpVar = zzbby.zzhb;
                C0254t c0254t = C0254t.f2723d;
                String str5 = (String) c0254t.f2726c.zzb(zzbbpVar);
                zzbbp zzbbpVar2 = zzbby.zzha;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar2)).booleanValue()) {
                    List zzf = zzftw.zzc(zza).zzf(str3);
                    if (zzf.size() < 2) {
                        zzh = zzgbc.zzg(new zzefk(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) zzf.get(1);
                        P p5 = o.f1952C.f1957c;
                        str3 = Uri.parse(str3).buildUpon().query(null).build().toString();
                    }
                }
                final zzdyi zzdyiVar = new zzdyi(str3, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                zzh = (zzgat) zzgbc.zzf((zzgat) zzgbc.zzo(zzgat.zzu(zzbza.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwe
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzdwg.zzd(zzdwg.this, zzdyiVar);
                    }
                })), ((Integer) r6.zzb(zzbby.zzhc)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdwf
                    @Override // com.google.android.gms.internal.ads.zzgaj
                    public final I3.b zza(Object obj) {
                        return zzdwg.zza(zzdwg.this, list2, (Exception) obj);
                    }
                }, this.zzf);
            } else {
                zzh = zzgbc.zzh(str);
                this.zzj.zzd("sst", "1");
            }
        } else {
            zzh = zzgbc.zzh(str);
            this.zzj.zzd("sst", "1");
        }
        I3.b zzn2 = zzgbc.zzn(zzgbc.zzn(zzgbc.zzn(zzh, new zzgaj(this) { // from class: com.google.android.gms.internal.ads.zzdwb
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                String str52 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str6 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put(SentryLogEvent.JsonKeys.BODY, str52);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new JSONObject(str6));
                    jSONObject2.put(SentryBaseEvent.JsonKeys.REQUEST, jSONObject3);
                    jSONObject2.put(Response.TYPE, jSONObject4);
                    jSONObject2.put("flags", new JSONObject());
                    return zzgbc.zzh(jSONObject2);
                } catch (JSONException e7) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e7.getCause())));
                }
            }
        }, this.zzf), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdwc
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzbng.this.zzb((JSONObject) obj);
            }
        }, this.zzf), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdwd
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                I3.b zzh2;
                zzh2 = zzgbc.zzh(new zzfar(new zzfao(zzdwg.this.zze), zzfaq.zza(new StringReader(((JSONObject) obj).toString()), null)));
                return zzh2;
            }
        }, this.zzf);
        zzffx.zza(zzn2, this.zzi, zza2);
        return zzn2;
    }

    private final String zzf(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            String concat = "Failed to update the ad types for rendering. ".concat(e7.toString());
            int i7 = J.f3546b;
            j.g(concat);
            return str;
        }
    }

    private final void zzg(zzdpy zzdpyVar) {
        Bundle zza2 = this.zzj.zza();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhe)).booleanValue()) {
            AbstractC1663a.n(o.f1952C.j, zza2, zzdpyVar.zza());
        }
    }

    private static final String zzh(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c9, code lost:
    
        if (r10.optString("is_gbid").equals("true") == false) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c0 A[Catch: all -> 0x00ba, TryCatch #6 {all -> 0x00ba, blocks: (B:19:0x0051, B:21:0x006d, B:24:0x0075, B:26:0x008a, B:28:0x0092, B:31:0x00cd, B:33:0x00d5, B:34:0x00db, B:38:0x00e4, B:41:0x011e, B:44:0x00f6, B:47:0x0107, B:49:0x0123, B:53:0x00bd, B:56:0x0139, B:59:0x0152, B:63:0x015a, B:65:0x017e, B:67:0x0193, B:69:0x01b6, B:70:0x01cb, B:73:0x01df, B:79:0x01f2, B:80:0x01f3, B:81:0x0200, B:84:0x0204, B:85:0x0205, B:91:0x021d, B:93:0x022d, B:99:0x021f, B:102:0x0223, B:106:0x0225, B:107:0x0226, B:110:0x022c, B:114:0x0240, B:115:0x01c0, B:116:0x01a6, B:119:0x0168, B:122:0x0142, B:123:0x0147, B:87:0x0206, B:89:0x0210, B:75:0x01e0, B:77:0x01ea, B:109:0x0227), top: B:18:0x0051, inners: #2, #3, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b6 A[Catch: all -> 0x00ba, TryCatch #6 {all -> 0x00ba, blocks: (B:19:0x0051, B:21:0x006d, B:24:0x0075, B:26:0x008a, B:28:0x0092, B:31:0x00cd, B:33:0x00d5, B:34:0x00db, B:38:0x00e4, B:41:0x011e, B:44:0x00f6, B:47:0x0107, B:49:0x0123, B:53:0x00bd, B:56:0x0139, B:59:0x0152, B:63:0x015a, B:65:0x017e, B:67:0x0193, B:69:0x01b6, B:70:0x01cb, B:73:0x01df, B:79:0x01f2, B:80:0x01f3, B:81:0x0200, B:84:0x0204, B:85:0x0205, B:91:0x021d, B:93:0x022d, B:99:0x021f, B:102:0x0223, B:106:0x0225, B:107:0x0226, B:110:0x022c, B:114:0x0240, B:115:0x01c0, B:116:0x01a6, B:119:0x0168, B:122:0x0142, B:123:0x0147, B:87:0x0206, B:89:0x0210, B:75:0x01e0, B:77:0x01ea, B:109:0x0227), top: B:18:0x0051, inners: #2, #3, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I3.b zzc() {
        String str;
        int i7;
        String str2;
        String string;
        String str3 = this.zze.zzd.f10753O;
        if (!TextUtils.isEmpty(str3)) {
            String zzh = zzh(str3);
            zzbbp zzbbpVar = zzbby.zzgW;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && zzh.isEmpty()) {
                int lastIndexOf = str3.lastIndexOf("&request_id=");
                zzh = lastIndexOf != -1 ? str3.substring(lastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(zzh)) {
                return zzgbc.zzg(new zzefk(15, "Invalid ad string."));
            }
            synchronized (this.zzl) {
                try {
                    L zzn = this.zzb.zzn();
                    String a2 = zzn.a(zzh, this.zzj);
                    String str4 = null;
                    if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                        zzdqk zzdqkVar = this.zzj;
                        if (!TextUtils.isEmpty(a2)) {
                            try {
                                JSONObject jSONObject = new JSONObject(a2);
                                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzgX)).booleanValue()) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("extras");
                                    if (optJSONObject != null) {
                                        if (!Arrays.asList(((String) c0254t.f2726c.zzb(zzbby.zzgY)).split(",")).contains(Q0.a.i0(optJSONObject.optString("query_info_type", "")))) {
                                        }
                                    }
                                }
                                int lastIndexOf2 = str3.lastIndexOf("&");
                                String substring = lastIndexOf2 != -1 ? str3.substring(0, lastIndexOf2) : null;
                                if (!TextUtils.isEmpty(substring)) {
                                    try {
                                        byte[] decode = Base64.decode(substring, 11);
                                        byte[] bytes = zzh.getBytes("UTF-8");
                                        if (!TextUtils.isEmpty(a2)) {
                                            try {
                                                string = new JSONObject(a2).getString("arek");
                                            } catch (JSONException e7) {
                                                J.k("Failed to get key from QueryJSONMap".concat(e7.toString()));
                                                o.f1952C.f1961g.zzw(e7, "CryptoUtils.getKeyFromQueryJsonMap");
                                            }
                                            str3 = zzfbp.zzb(decode, bytes, string, zzdqkVar);
                                        }
                                        string = null;
                                        str3 = zzfbp.zzb(decode, bytes, string, zzdqkVar);
                                    } catch (UnsupportedEncodingException | IllegalArgumentException e8) {
                                        J.k("Failed to decode the adResponse. ".concat(e8.toString()));
                                        o.f1952C.f1961g.zzw(e8, "PreloadedLoader.decryptAdResponseIfNecessary");
                                    }
                                }
                            } catch (JSONException unused) {
                            }
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
                        } catch (IllegalArgumentException e9) {
                            J.k("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str)));
                            o.f1952C.f1961g.zzw(e9, "PreloadedLoader.decodeRenderId");
                        }
                        List zzf = zzftw.zzb(zzfss.zzc(':')).zzf(str5);
                        if (zzf.size() == 2) {
                            str4 = (String) zzf.get(0);
                            i7 = Integer.parseInt((String) zzf.get(1));
                            Pair pair = str4 == null ? new Pair(str4, Integer.valueOf(i7)) : new Pair("", 0);
                            str2 = (String) pair.first;
                            int intValue = ((Integer) pair.second).intValue();
                            if (!TextUtils.isEmpty(str2) && intValue > 0) {
                                synchronized (zzn) {
                                    try {
                                        K k7 = (K) zzn.f5447e.get(zzh);
                                        if (k7 != null) {
                                            if (k7.f5442c.contains(str2)) {
                                                return zzgbc.zzg(new zzefk(10, "The ad has already been shown."));
                                            }
                                        }
                                        synchronized (zzn) {
                                            K k8 = (K) zzn.f5447e.get(zzh);
                                            if (k8 != null) {
                                                k8.f5442c.add(str2);
                                                if (k8.f5442c.size() < intValue) {
                                                }
                                            }
                                        }
                                        if (!TextUtils.isEmpty(a2)) {
                                            return zze(str3, zzf(a2));
                                        }
                                    } finally {
                                    }
                                }
                            }
                            synchronized (zzn) {
                                zzn.f5447e.remove(zzh);
                            }
                            if (!TextUtils.isEmpty(a2)) {
                            }
                        } else {
                            J.k("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str)));
                        }
                    }
                    i7 = 0;
                    if (str4 == null) {
                    }
                    str2 = (String) pair.first;
                    int intValue2 = ((Integer) pair.second).intValue();
                    if (!TextUtils.isEmpty(str2)) {
                        synchronized (zzn) {
                        }
                    }
                    synchronized (zzn) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.f10748J;
        if (zzcVar != null) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgO)).booleanValue()) {
                String str6 = zzcVar.f10718a;
                String str7 = zzcVar.f10719b;
                String zzh2 = zzh(str6);
                String zzh3 = zzh(str7);
                if (TextUtils.isEmpty(zzh3) || !zzh2.equals(zzh3)) {
                    this.zzj.zzb().put("ridmm", "true");
                } else {
                    L zzn2 = this.zzb.zzn();
                    synchronized (zzn2) {
                        zzn2.f5447e.remove(zzh2);
                    }
                    this.zzj.zzb().put("request_id", zzh2);
                }
            }
            return zze(zzcVar.f10718a, zzf(zzcVar.f10719b));
        }
        return zzgbc.zzg(new zzefk(14, "Mismatch request IDs."));
    }
}
