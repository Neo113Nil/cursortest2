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

/* JADX INFO: loaded from: classes.dex */
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
                    List listZzf = zzftw.zzb(zzfss.zzc(':')).zzf(message);
                    if (listZzf.size() == 2) {
                        message = (String) listZzf.get(1);
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

    public static String zzd(zzdwg zzdwgVar, zzdyi zzdyiVar) throws zzefk {
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
                zzdyj zzdyjVarZzb = new zzdyk(zzdwgVar.zzc, zzdwgVar.zzd.f10834a, zzdwgVar.zzo, Binder.getCallingUid()).zza(zzdyiVar);
                int i9 = zzdyjVarZzb.zza;
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzhe)).booleanValue()) {
                    zzdwgVar.zzj.zzd("fr", String.valueOf(i7));
                }
                if (i9 == 200) {
                    zzdwgVar.zzg(zzdpy.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzdyjVarZzb.zzc;
                }
                i7++;
                i8 = i9;
            } catch (Exception e7) {
                throw new zzefk(1, e7.getMessage() == null ? "Fetch failed." : e7.getMessage(), e7);
            }
        }
    }

    private final I3.b zze(String str, final String str2) {
        I3.b bVarZzh;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return zzgbc.zzg(new zzefk(15, "Invalid ad string."));
        }
        zzffn zzffnVarZza = zzffm.zza(this.zzc, 11);
        zzffnVarZza.zzi();
        zzbnq zzbnqVarZza = o.f1952C.f1970q.zza(this.zzc, this.zzd, this.zzb.zzy());
        zzbnk zzbnkVar = zzbnn.zza;
        final zzbng zzbngVarZza = zzbnqVarZza.zza("google.afma.response.normalize", zzbnkVar, zzbnkVar);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgZ)).booleanValue()) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.zzm = jSONObject.optString("fetch_url", "");
                    this.zzn = D.A0(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    int i7 = J.f3546b;
                    j.g("Invalid ad response.");
                }
            } catch (JSONException unused2) {
            }
            String string = this.zzm;
            final List list = this.zzn;
            if (TextUtils.isEmpty(string)) {
                bVarZzh = zzgbc.zzh(str);
                this.zzj.zzd("sst", "1");
            } else {
                this.zzj.zzd("sst", "2");
                zzbbp zzbbpVar = zzbby.zzhb;
                C0254t c0254t = C0254t.f2723d;
                String str4 = (String) c0254t.f2726c.zzb(zzbbpVar);
                zzbbp zzbbpVar2 = zzbby.zzha;
                zzbbw zzbbwVar = c0254t.f2726c;
                if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue()) {
                    List listZzf = zzftw.zzc(zza).zzf(string);
                    if (listZzf.size() < 2) {
                        bVarZzh = zzgbc.zzg(new zzefk(1, "Invalid fetch URL."));
                    } else {
                        str3 = (String) listZzf.get(1);
                        P p5 = o.f1952C.f1957c;
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        final zzdyi zzdyiVar = new zzdyi(string, 60000, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4, false);
                        bVarZzh = (zzgat) zzgbc.zzf((zzgat) zzgbc.zzo(zzgat.zzu(zzbza.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwe
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return zzdwg.zzd(this.zza, zzdyiVar);
                            }
                        })), ((Integer) zzbbwVar.zzb(zzbby.zzhc)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdwf
                            @Override // com.google.android.gms.internal.ads.zzgaj
                            public final I3.b zza(Object obj) {
                                return zzdwg.zza(this.zza, list, (Exception) obj);
                            }
                        }, this.zzf);
                    }
                } else {
                    final zzdyi zzdyiVar2 = new zzdyi(string, 60000, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4, false);
                    bVarZzh = (zzgat) zzgbc.zzf((zzgat) zzgbc.zzo(zzgat.zzu(zzbza.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwe
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzdwg.zzd(this.zza, zzdyiVar2);
                        }
                    })), ((Integer) zzbbwVar.zzb(zzbby.zzhc)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdwf
                        @Override // com.google.android.gms.internal.ads.zzgaj
                        public final I3.b zza(Object obj) {
                            return zzdwg.zza(this.zza, list, (Exception) obj);
                        }
                    }, this.zzf);
                }
            }
        } else {
            bVarZzh = zzgbc.zzh(str);
            this.zzj.zzd("sst", "1");
        }
        I3.b bVarZzn = zzgbc.zzn(zzgbc.zzn(zzgbc.zzn(bVarZzh, new zzgaj(this) { // from class: com.google.android.gms.internal.ads.zzdwb
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) throws JSONException {
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
                return zzbngVarZza.zzb((JSONObject) obj);
            }
        }, this.zzf), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdwd
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzgbc.zzh(new zzfar(new zzfao(this.zza.zze), zzfaq.zza(new StringReader(((JSONObject) obj).toString()), null)));
            }
        }, this.zzf);
        zzffx.zza(bVarZzn, this.zzi, zzffnVarZza);
        return bVarZzn;
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
            String strConcat = "Failed to update the ad types for rendering. ".concat(e7.toString());
            int i7 = J.f3546b;
            j.g(strConcat);
            return str;
        }
    }

    private final void zzg(zzdpy zzdpyVar) {
        Bundle bundleZza = this.zzj.zza();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhe)).booleanValue()) {
            p150v0.a.n(o.f1952C.j, bundleZza, zzdpyVar.zza());
        }
    }

    private static final String zzh(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0226 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #6 {all -> 0x00ba, blocks: (B:18:0x0051, B:20:0x006d, B:22:0x0075, B:24:0x008a, B:26:0x0092, B:34:0x00cd, B:36:0x00d5, B:38:0x00db, B:42:0x00e4, B:53:0x011e, B:45:0x00f6, B:52:0x0107, B:55:0x0123, B:31:0x00bd, B:56:0x0139, B:63:0x0152, B:66:0x015a, B:70:0x017e, B:72:0x0193, B:76:0x01b6, B:78:0x01cb, B:81:0x01df, B:86:0x01f2, B:87:0x01f3, B:88:0x0200, B:92:0x0204, B:93:0x0205, B:98:0x021d, B:110:0x022d, B:100:0x021f, B:104:0x0223, B:106:0x0225, B:107:0x0226, B:109:0x022c, B:118:0x0240, B:77:0x01c0, B:73:0x01a6, B:69:0x0168, B:60:0x0142, B:61:0x0147, B:94:0x0206, B:96:0x0210, B:82:0x01e0, B:84:0x01ea, B:108:0x0227), top: B:153:0x0051, inners: #2, #3, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0235  */
    /* JADX WARN: Code duplicated, block: B:148:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[Catch: all -> 0x00ba, TRY_ENTER, TryCatch #6 {all -> 0x00ba, blocks: (B:18:0x0051, B:20:0x006d, B:22:0x0075, B:24:0x008a, B:26:0x0092, B:34:0x00cd, B:36:0x00d5, B:38:0x00db, B:42:0x00e4, B:53:0x011e, B:45:0x00f6, B:52:0x0107, B:55:0x0123, B:31:0x00bd, B:56:0x0139, B:63:0x0152, B:66:0x015a, B:70:0x017e, B:72:0x0193, B:76:0x01b6, B:78:0x01cb, B:81:0x01df, B:86:0x01f2, B:87:0x01f3, B:88:0x0200, B:92:0x0204, B:93:0x0205, B:98:0x021d, B:110:0x022d, B:100:0x021f, B:104:0x0223, B:106:0x0225, B:107:0x0226, B:109:0x022c, B:118:0x0240, B:77:0x01c0, B:73:0x01a6, B:69:0x0168, B:60:0x0142, B:61:0x0147, B:94:0x0206, B:96:0x0210, B:82:0x01e0, B:84:0x01ea, B:108:0x0227), top: B:153:0x0051, inners: #2, #3, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5 A[Catch: all -> 0x00ba, TryCatch #6 {all -> 0x00ba, blocks: (B:18:0x0051, B:20:0x006d, B:22:0x0075, B:24:0x008a, B:26:0x0092, B:34:0x00cd, B:36:0x00d5, B:38:0x00db, B:42:0x00e4, B:53:0x011e, B:45:0x00f6, B:52:0x0107, B:55:0x0123, B:31:0x00bd, B:56:0x0139, B:63:0x0152, B:66:0x015a, B:70:0x017e, B:72:0x0193, B:76:0x01b6, B:78:0x01cb, B:81:0x01df, B:86:0x01f2, B:87:0x01f3, B:88:0x0200, B:92:0x0204, B:93:0x0205, B:98:0x021d, B:110:0x022d, B:100:0x021f, B:104:0x0223, B:106:0x0225, B:107:0x0226, B:109:0x022c, B:118:0x0240, B:77:0x01c0, B:73:0x01a6, B:69:0x0168, B:60:0x0142, B:61:0x0147, B:94:0x0206, B:96:0x0210, B:82:0x01e0, B:84:0x01ea, B:108:0x0227), top: B:153:0x0051, inners: #2, #3, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b6 A[Catch: all -> 0x00ba, TryCatch #6 {all -> 0x00ba, blocks: (B:18:0x0051, B:20:0x006d, B:22:0x0075, B:24:0x008a, B:26:0x0092, B:34:0x00cd, B:36:0x00d5, B:38:0x00db, B:42:0x00e4, B:53:0x011e, B:45:0x00f6, B:52:0x0107, B:55:0x0123, B:31:0x00bd, B:56:0x0139, B:63:0x0152, B:66:0x015a, B:70:0x017e, B:72:0x0193, B:76:0x01b6, B:78:0x01cb, B:81:0x01df, B:86:0x01f2, B:87:0x01f3, B:88:0x0200, B:92:0x0204, B:93:0x0205, B:98:0x021d, B:110:0x022d, B:100:0x021f, B:104:0x0223, B:106:0x0225, B:107:0x0226, B:109:0x022c, B:118:0x0240, B:77:0x01c0, B:73:0x01a6, B:69:0x0168, B:60:0x0142, B:61:0x0147, B:94:0x0206, B:96:0x0210, B:82:0x01e0, B:84:0x01ea, B:108:0x0227), top: B:153:0x0051, inners: #2, #3, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01c0 A[Catch: all -> 0x00ba, TryCatch #6 {all -> 0x00ba, blocks: (B:18:0x0051, B:20:0x006d, B:22:0x0075, B:24:0x008a, B:26:0x0092, B:34:0x00cd, B:36:0x00d5, B:38:0x00db, B:42:0x00e4, B:53:0x011e, B:45:0x00f6, B:52:0x0107, B:55:0x0123, B:31:0x00bd, B:56:0x0139, B:63:0x0152, B:66:0x015a, B:70:0x017e, B:72:0x0193, B:76:0x01b6, B:78:0x01cb, B:81:0x01df, B:86:0x01f2, B:87:0x01f3, B:88:0x0200, B:92:0x0204, B:93:0x0205, B:98:0x021d, B:110:0x022d, B:100:0x021f, B:104:0x0223, B:106:0x0225, B:107:0x0226, B:109:0x022c, B:118:0x0240, B:77:0x01c0, B:73:0x01a6, B:69:0x0168, B:60:0x0142, B:61:0x0147, B:94:0x0206, B:96:0x0210, B:82:0x01e0, B:84:0x01ea, B:108:0x0227), top: B:153:0x0051, inners: #2, #3, #8, #9 }] */
    public final I3.b zzc() {
        String strOptString;
        int i7;
        Pair pair;
        String str;
        int iLastIndexOf;
        String strSubstring;
        String string;
        String strZzb = this.zze.zzd.f10753O;
        if (!TextUtils.isEmpty(strZzb)) {
            String strZzh = zzh(strZzb);
            zzbbp zzbbpVar = zzbby.zzgW;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && strZzh.isEmpty()) {
                int iLastIndexOf2 = strZzb.lastIndexOf("&request_id=");
                strZzh = iLastIndexOf2 != -1 ? strZzb.substring(iLastIndexOf2 + 12) : "";
            }
            if (TextUtils.isEmpty(strZzh)) {
                return zzgbc.zzg(new zzefk(15, "Invalid ad string."));
            }
            synchronized (this.zzl) {
                try {
                    L lZzn = this.zzb.zzn();
                    String strA = lZzn.a(strZzh, this.zzj);
                    String str2 = null;
                    if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                        zzdqk zzdqkVar = this.zzj;
                        if (!TextUtils.isEmpty(strA)) {
                            try {
                                JSONObject jSONObject = new JSONObject(strA);
                                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzgX)).booleanValue()) {
                                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extras");
                                    if (jSONObjectOptJSONObject != null) {
                                        if (Arrays.asList(((String) c0254t.f2726c.zzb(zzbby.zzgY)).split(",")).contains(Q0.a.i0(jSONObjectOptJSONObject.optString("query_info_type", "")))) {
                                            iLastIndexOf = strZzb.lastIndexOf("&");
                                            if (iLastIndexOf != -1) {
                                                strSubstring = strZzb.substring(0, iLastIndexOf);
                                            } else {
                                                strSubstring = null;
                                            }
                                            if (!TextUtils.isEmpty(strSubstring)) {
                                                try {
                                                    byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                                    byte[] bytes = strZzh.getBytes("UTF-8");
                                                    if (TextUtils.isEmpty(strA)) {
                                                        string = null;
                                                    } else {
                                                        try {
                                                            string = new JSONObject(strA).getString("arek");
                                                        } catch (JSONException e7) {
                                                            J.k("Failed to get key from QueryJSONMap".concat(e7.toString()));
                                                            o.f1952C.f1961g.zzw(e7, "CryptoUtils.getKeyFromQueryJsonMap");
                                                            string = null;
                                                        }
                                                    }
                                                    strZzb = zzfbp.zzb(bArrDecode, bytes, string, zzdqkVar);
                                                } catch (UnsupportedEncodingException | IllegalArgumentException e8) {
                                                    J.k("Failed to decode the adResponse. ".concat(e8.toString()));
                                                    o.f1952C.f1961g.zzw(e8, "PreloadedLoader.decryptAdResponseIfNecessary");
                                                }
                                            }
                                        }
                                    }
                                } else if (jSONObject.optString("is_gbid").equals("true")) {
                                    iLastIndexOf = strZzb.lastIndexOf("&");
                                    if (iLastIndexOf != -1) {
                                        strSubstring = strZzb.substring(0, iLastIndexOf);
                                    } else {
                                        strSubstring = null;
                                    }
                                    if (!TextUtils.isEmpty(strSubstring)) {
                                        byte[] bArrDecode2 = Base64.decode(strSubstring, 11);
                                        byte[] bytes2 = strZzh.getBytes("UTF-8");
                                        if (TextUtils.isEmpty(strA)) {
                                            string = null;
                                        } else {
                                            string = new JSONObject(strA).getString("arek");
                                        }
                                        strZzb = zzfbp.zzb(bArrDecode2, bytes2, string, zzdqkVar);
                                    }
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    if (TextUtils.isEmpty(strZzb)) {
                        strOptString = "";
                    } else {
                        try {
                            strOptString = new JSONObject(strZzb).optString("render_id", "");
                        } catch (JSONException unused2) {
                            strOptString = "";
                        }
                    }
                    if (TextUtils.isEmpty(strOptString)) {
                        i7 = 0;
                        if (str2 != null) {
                            pair = new Pair(str2, Integer.valueOf(i7));
                        } else {
                            pair = new Pair("", 0);
                        }
                        str = (String) pair.first;
                        int iIntValue = ((Integer) pair.second).intValue();
                        if (TextUtils.isEmpty(str)) {
                            synchronized (lZzn) {
                                lZzn.f5447e.remove(strZzh);
                                if (!TextUtils.isEmpty(strA)) {
                                    return zze(strZzb, zzf(strA));
                                }
                            }
                        } else {
                            synchronized (lZzn) {
                                lZzn.f5447e.remove(strZzh);
                                if (!TextUtils.isEmpty(strA)) {
                                    return zze(strZzb, zzf(strA));
                                }
                            }
                        }
                    } else {
                        String str3 = "";
                        try {
                            str3 = new String(Base64.decode(strOptString, 0), StandardCharsets.UTF_8);
                        } catch (IllegalArgumentException e9) {
                            J.k("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(strOptString)));
                            o.f1952C.f1961g.zzw(e9, "PreloadedLoader.decodeRenderId");
                        }
                        List listZzf = zzftw.zzb(zzfss.zzc(':')).zzf(str3);
                        if (listZzf.size() == 2) {
                            str2 = (String) listZzf.get(0);
                            i7 = Integer.parseInt((String) listZzf.get(1));
                        } else {
                            J.k("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(strOptString)));
                            i7 = 0;
                        }
                        if (str2 != null) {
                            pair = new Pair(str2, Integer.valueOf(i7));
                        } else {
                            pair = new Pair("", 0);
                        }
                        str = (String) pair.first;
                        int iIntValue2 = ((Integer) pair.second).intValue();
                        if (TextUtils.isEmpty(str) || iIntValue2 <= 0) {
                            synchronized (lZzn) {
                                lZzn.f5447e.remove(strZzh);
                            }
                            if (!TextUtils.isEmpty(strA)) {
                                return zze(strZzb, zzf(strA));
                            }
                        } else {
                            synchronized (lZzn) {
                                try {
                                    K k7 = (K) lZzn.f5447e.get(strZzh);
                                    if (k7 != null && k7.f5442c.contains(str)) {
                                        return zzgbc.zzg(new zzefk(10, "The ad has already been shown."));
                                    }
                                    synchronized (lZzn) {
                                        K k8 = (K) lZzn.f5447e.get(strZzh);
                                        if (k8 != null) {
                                            k8.f5442c.add(str);
                                            if (k8.f5442c.size() < iIntValue2) {
                                            }
                                        }
                                        synchronized (lZzn) {
                                            lZzn.f5447e.remove(strZzh);
                                        }
                                    }
                                    if (!TextUtils.isEmpty(strA)) {
                                        return zze(strZzb, zzf(strA));
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.f10748J;
        if (zzcVar != null) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgO)).booleanValue()) {
                String str4 = zzcVar.f10718a;
                String str5 = zzcVar.f10719b;
                String strZzh2 = zzh(str4);
                String strZzh3 = zzh(str5);
                if (TextUtils.isEmpty(strZzh3) || !strZzh2.equals(strZzh3)) {
                    this.zzj.zzb().put("ridmm", "true");
                } else {
                    L lZzn2 = this.zzb.zzn();
                    synchronized (lZzn2) {
                        lZzn2.f5447e.remove(strZzh2);
                    }
                    this.zzj.zzb().put("request_id", strZzh2);
                }
            }
            return zze(zzcVar.f10718a, zzf(zzcVar.f10719b));
        }
        return zzgbc.zzg(new zzefk(14, "Mismatch request IDs."));
    }
}
