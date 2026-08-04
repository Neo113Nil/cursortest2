package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.V0;
import I2.J;
import Y4.D;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import io.sentry.clientreport.DiscardedEvent;
import io.sentry.protocol.DebugMeta;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p167y2.j;

/* JADX INFO: loaded from: classes.dex */
public final class zzdkj {
    private final Context zza;
    private final zzdjq zzb;
    private final zzauo zzc;
    private final VersionInfoParcel zzd;
    private final E2.a zze;
    private final zzbaw zzf;
    private final Executor zzg;
    private final zzbey zzh;
    private final zzdlb zzi;
    private final zzdnq zzj;
    private final ScheduledExecutorService zzk;
    private final zzdml zzl;
    private final zzdqq zzm;
    private final zzfia zzn;
    private final zzeaf zzo;
    private final zzeaq zzp;
    private final zzfbe zzq;

    public zzdkj(Context context, zzdjq zzdjqVar, zzauo zzauoVar, VersionInfoParcel versionInfoParcel, E2.a aVar, zzbaw zzbawVar, Executor executor, zzfba zzfbaVar, zzdlb zzdlbVar, zzdnq zzdnqVar, ScheduledExecutorService scheduledExecutorService, zzdqq zzdqqVar, zzfia zzfiaVar, zzeaf zzeafVar, zzdml zzdmlVar, zzeaq zzeaqVar, zzfbe zzfbeVar) {
        this.zza = context;
        this.zzb = zzdjqVar;
        this.zzc = zzauoVar;
        this.zzd = versionInfoParcel;
        this.zze = aVar;
        this.zzf = zzbawVar;
        this.zzg = executor;
        this.zzh = zzfbaVar.zzi;
        this.zzi = zzdlbVar;
        this.zzj = zzdnqVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdqqVar;
        this.zzn = zzfiaVar;
        this.zzo = zzeafVar;
        this.zzl = zzdmlVar;
        this.zzp = zzeaqVar;
        this.zzq = zzfbeVar;
    }

    public static /* synthetic */ zzbet zza(zzdkj zzdkjVar, JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzq = zzq(jSONObject, "bg_color");
        Integer numZzq2 = zzq(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", zzbbd.zzq.zzf);
        return new zzbet(strOptString, list, numZzq, numZzq2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, zzdkjVar.zzh.zze, zOptBoolean);
    }

    public static /* synthetic */ I3.b zzb(zzdkj zzdkjVar, com.google.android.gms.ads.internal.client.zzr zzrVar, zzfaf zzfafVar, zzfai zzfaiVar, String str, String str2, Object obj) {
        zzceb zzcebVarZza = zzdkjVar.zzj.zza(zzrVar, zzfafVar, zzfaiVar);
        final zzbze zzbzeVarZza = zzbze.zza((Object) zzcebVarZza);
        zzdmi zzdmiVarZzb = zzdkjVar.zzl.zzb();
        zzcebVarZza.zzN().zzV(zzdmiVarZzb, zzdmiVarZzb, zzdmiVarZzb, zzdmiVarZzb, zzdmiVarZzb, false, null, new E2.b(zzdkjVar.zza, null), null, null, zzdkjVar.zzo, zzdkjVar.zzn, zzdkjVar.zzm, null, zzdmiVarZzb, null, null, null, null);
        zzcebVarZza.zzag("/getNativeAdViewSignals", zzbiy.zzs);
        zzcebVarZza.zzag("/getNativeClickMeta", zzbiy.zzt);
        zzcebVarZza.zzN().zzF(true);
        zzcebVarZza.zzN().zzC(new zzcfr() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // com.google.android.gms.internal.ads.zzcfr
            public final void zza(boolean z4, int i7, String str3, String str4) {
                zzbze zzbzeVar = zzbzeVarZza;
                if (z4) {
                    zzbzeVar.zzb();
                    return;
                }
                zzbzeVar.zzd(new zzefk(1, "Image Web View failed to load. Error code: " + i7 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcebVarZza.zzae(str, str2, null);
        return zzbzeVarZza;
    }

    public static I3.b zzc(zzdkj zzdkjVar, String str, Object obj) throws zzcen {
        zzceo zzceoVar = o.f1952C.f1958d;
        E2.a aVar = zzdkjVar.zze;
        zzbaw zzbawVar = zzdkjVar.zzf;
        Context context = zzdkjVar.zza;
        zzcfv zzcfvVarZza = zzcfv.zza();
        zzeaq zzeaqVar = zzdkjVar.zzp;
        zzfbe zzfbeVar = zzdkjVar.zzq;
        zzdqq zzdqqVar = zzdkjVar.zzm;
        zzceb zzcebVarZza = zzceo.zza(context, zzcfvVarZza, "native-omid", false, false, zzdkjVar.zzc, null, zzdkjVar.zzd, null, null, aVar, zzbawVar, null, null, zzeaqVar, zzfbeVar, zzdqqVar);
        final zzbze zzbzeVarZza = zzbze.zza((Object) zzcebVarZza);
        zzcebVarZza.zzN().zzC(new zzcfr() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // com.google.android.gms.internal.ads.zzcfr
            public final void zza(boolean z4, int i7, String str2, String str3) {
                zzbzeVarZza.zzb();
            }
        });
        zzcebVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        return zzbzeVarZza;
    }

    public static final V0 zzi(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(jSONObjectOptJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzfwh.zzn();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfwh.zzn();
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
            V0 v0Zzr = zzr(jSONArrayOptJSONArray.optJSONObject(i7));
            if (v0Zzr != null) {
                arrayList.add(v0Zzr);
            }
        }
        return zzfwh.zzl(arrayList);
    }

    private final com.google.android.gms.ads.internal.client.zzr zzk(int i7, int i8) {
        if (i7 == 0) {
            if (i8 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.k();
            }
            i7 = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new j(i7, i8));
    }

    private static I3.b zzl(I3.b bVar, Object obj) {
        final Object obj2 = null;
        return zzgbc.zzf(bVar, Exception.class, new zzgaj(obj2) { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj3) {
                J.l("Error during loading assets.", (Exception) obj3);
                return zzgbc.zzh(null);
            }
        }, zzbza.zzg);
    }

    private static I3.b zzm(boolean z4, final I3.b bVar, Object obj) {
        return z4 ? zzgbc.zzn(bVar, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdkf
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj2) {
                return obj2 != null ? bVar : zzgbc.zzg(new zzefk(1, "Retrieve required value in native ad response failed."));
            }
        }, zzbza.zzg) : zzl(bVar, null);
    }

    private final I3.b zzn(JSONObject jSONObject, boolean z4) {
        if (jSONObject == null) {
            return zzgbc.zzh(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgbc.zzh(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z4) {
            return zzgbc.zzh(new zzbew(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgbc.zzm(this.zzb.zzb(strOptString, dOptDouble, zOptBoolean), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzdjx
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return new zzbew(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.zzg), null);
    }

    private final I3.b zzo(JSONArray jSONArray, boolean z4, boolean z7) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgbc.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z7 ? jSONArray.length() : 1;
        for (int i7 = 0; i7 < length; i7++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i7), z4));
        }
        return zzgbc.zzm(zzgbc.zzd(arrayList), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzdkc
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbew zzbewVar : (List) obj) {
                    if (zzbewVar != null) {
                        arrayList2.add(zzbewVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final I3.b zzp(JSONObject jSONObject, zzfaf zzfafVar, zzfai zzfaiVar) {
        final I3.b bVarZze = this.zzi.zze(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfafVar, zzfaiVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgbc.zzn(bVarZze, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) throws zzefk {
                zzceb zzcebVar = (zzceb) obj;
                if (zzcebVar == null || zzcebVar.zzq() == null) {
                    throw new zzefk(1, "Retrieve video view in html5 ad response failed.");
                }
                return bVarZze;
            }
        }, zzbza.zzg);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final V0 zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(DiscardedEvent.JsonKeys.REASON);
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new V0(strOptString, strOptString2);
    }

    public final I3.b zzd(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzgbc.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(DebugMeta.JsonKeys.IMAGES);
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzm(jSONObjectOptJSONObject.optBoolean("require"), zzgbc.zzm(zzo(jSONArrayOptJSONArray, false, true), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzdkd
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return zzdkj.zza(this.zza, jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final I3.b zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final I3.b zzf(JSONObject jSONObject, String str) {
        zzbey zzbeyVar = this.zzh;
        return zzo(jSONObject.optJSONArray(DebugMeta.JsonKeys.IMAGES), zzbeyVar.zzb, zzbeyVar.zzd);
    }

    public final I3.b zzg(JSONObject jSONObject, String str, final zzfaf zzfafVar, final zzfai zzfaiVar) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjZ)).booleanValue()) {
            return zzgbc.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(DebugMeta.JsonKeys.IMAGES);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgbc.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgbc.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzrVarZzk = zzk(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgbc.zzh(null);
        }
        final I3.b bVarZzn = zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdka
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzdkj.zzb(this.zza, zzrVarZzk, zzfafVar, zzfaiVar, strOptString, strOptString2, obj);
            }
        }, zzbza.zzf);
        return zzgbc.zzn(bVarZzn, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) throws zzefk {
                if (((zzceb) obj) != null) {
                    return bVarZzn;
                }
                throw new zzefk(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzbza.zzg);
    }

    public final I3.b zzh(JSONObject jSONObject, zzfaf zzfafVar, zzfai zzfaiVar) {
        I3.b bVarZzd;
        String[] strArr = {"html_containers", "instream"};
        JSONObject jSONObjectJ0 = D.J0(jSONObject, strArr);
        JSONObject jSONObjectOptJSONObject = jSONObjectJ0 == null ? null : jSONObjectJ0.optJSONObject(strArr[1]);
        if (jSONObjectOptJSONObject != null) {
            return zzp(jSONObjectOptJSONObject, zzfafVar, zzfaiVar);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(RRWebVideoEvent.EVENT_TAG);
        if (jSONObjectOptJSONObject2 == null) {
            return zzgbc.zzh(null);
        }
        String strOptString = jSONObjectOptJSONObject2.optString("vast_xml");
        zzbbp zzbbpVar = zzbby.zzjY;
        C0254t c0254t = C0254t.f2723d;
        boolean z4 = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && jSONObjectOptJSONObject2.has("html");
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z4) {
                bVarZzd = this.zzi.zzd(jSONObjectOptJSONObject2);
            }
            return zzl(zzgbc.zzo(bVarZzd, ((Integer) c0254t.f2726c.zzb(zzbby.zzdX)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        if (!z4) {
            int i7 = J.f3546b;
            J2.j.g("Required field 'vast_xml' or 'html' is missing");
            return zzgbc.zzh(null);
        }
        bVarZzd = zzp(jSONObjectOptJSONObject2, zzfafVar, zzfaiVar);
        return zzl(zzgbc.zzo(bVarZzd, ((Integer) c0254t.f2726c.zzb(zzbby.zzdX)).intValue(), TimeUnit.SECONDS, this.zzk), null);
    }
}
