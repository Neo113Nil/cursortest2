package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import I2.H;
import I2.J;
import J2.d;
import J2.j;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import e1.k;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.AbstractC1663a;
import w1.L;

/* loaded from: classes.dex */
public final class zzcbw implements zzbiz {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i7) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                d dVar = C0252s.f2717f.f2718a;
                i7 = d.p(Integer.parseInt(str2), context);
            } catch (NumberFormatException unused) {
                String f7 = AbstractC1663a.f("Could not parse ", str, " in a video GMSG: ", str2);
                int i8 = J.f3546b;
                j.g(f7);
            }
        }
        if (J.m()) {
            StringBuilder l7 = k.l("Parse pixels for ", str, ", got string ", str2, ", int ");
            l7.append(i7);
            l7.append(".");
            J.k(l7.toString());
        }
        return i7;
    }

    private static void zzc(zzcak zzcakVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcakVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String j = L.j("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i7 = J.f3546b;
                j.g(j);
                return;
            }
        }
        if (str2 != null) {
            zzcakVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcakVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcakVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcakVar.zzD(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbiz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Object obj, Map map) {
        int min;
        int min2;
        int i7;
        Integer valueOf;
        String str;
        zzcaw zzcawVar = (zzcaw) obj;
        String str2 = (String) map.get("action");
        if (str2 == null) {
            int i8 = J.f3546b;
            j.g("Action missing from video GMSG.");
            return;
        }
        Integer valueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer zzb = zzcawVar.zzn() != null ? zzcawVar.zzn().zzb() : null;
        if (valueOf2 != null && zzb != null && !valueOf2.equals(zzb) && !str2.equals("load")) {
            Locale locale = Locale.US;
            int i9 = J.f3546b;
            j.f("Event intended for player " + valueOf2 + ", but sent to player " + zzb + " - event ignored");
            return;
        }
        if (j.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            j.b("Video GMSG: " + str2 + " " + jSONObject.toString());
        }
        if (str2.equals("background")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                j.g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcawVar.setBackgroundColor(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused) {
                j.g("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str2.equals("playerBackground")) {
            String str4 = (String) map.get("color");
            if (TextUtils.isEmpty(str4)) {
                j.g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcawVar.zzB(Color.parseColor(str4));
                return;
            } catch (IllegalArgumentException unused2) {
                j.g("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str2.equals("decoderProps")) {
            String str5 = (String) map.get("mimeTypes");
            if (str5 == null) {
                j.g("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                zzcawVar.zzd("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str6 : str5.split(",")) {
                hashMap2.put(str6, H.a(str6.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            zzcawVar.zzd("onVideoEvent", hashMap3);
            return;
        }
        zzcal zzn = zzcawVar.zzn();
        if (zzn == null) {
            j.g("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str2.equals("new");
        boolean equals2 = str2.equals("position");
        if (equals || equals2) {
            Context context = zzcawVar.getContext();
            int zzb2 = zzb(context, map, "x", 0);
            int zzb3 = zzb(context, map, "y", 0);
            int zzb4 = zzb(context, map, "w", -1);
            zzbbp zzbbpVar = zzbby.zzeb;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                min = zzb4 == -1 ? zzcawVar.zzh() : Math.min(zzb4, zzcawVar.zzh());
            } else {
                if (J.m()) {
                    StringBuilder g3 = AbstractC1663a.g("Calculate width with original width ", zzb4, ", videoHost.getVideoBoundingWidth() ", zzcawVar.zzh(), ", x ");
                    g3.append(zzb2);
                    g3.append(".");
                    J.k(g3.toString());
                }
                min = Math.min(zzb4, zzcawVar.zzh() - zzb2);
            }
            int i10 = min;
            int zzb5 = zzb(context, map, "h", -1);
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                min2 = zzb5 == -1 ? zzcawVar.zzg() : Math.min(zzb5, zzcawVar.zzg());
            } else {
                if (J.m()) {
                    StringBuilder g7 = AbstractC1663a.g("Calculate height with original height ", zzb5, ", videoHost.getVideoBoundingHeight() ", zzcawVar.zzg(), ", y ");
                    g7.append(zzb3);
                    g7.append(".");
                    J.k(g7.toString());
                }
                min2 = Math.min(zzb5, zzcawVar.zzg() - zzb3);
            }
            try {
                i7 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i7 = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || zzn.zza() != null) {
                zzn.zzc(zzb2, zzb3, i10, min2);
                return;
            }
            zzn.zzd(zzb2, zzb3, i10, min2, i7, parseBoolean, new zzcav((String) map.get("flags")));
            zzcak zza = zzn.zza();
            if (zza != null) {
                zzc(zza, map);
                return;
            }
            return;
        }
        zzcfd zzq = zzcawVar.zzq();
        if (zzq != null) {
            if (str2.equals("timeupdate")) {
                String str7 = (String) map.get("currentTime");
                if (str7 == null) {
                    j.g("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzq.zzt(Float.parseFloat(str7));
                    return;
                } catch (NumberFormatException unused4) {
                    j.g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str7));
                    return;
                }
            }
            if (str2.equals("skip")) {
                zzq.zzu();
                return;
            }
        }
        zzcak zza2 = zzn.zza();
        if (zza2 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            zzcawVar.zzd("onVideoEvent", hashMap4);
            return;
        }
        if (str2.equals("click")) {
            Context context2 = zzcawVar.getContext();
            int zzb6 = zzb(context2, map, "x", 0);
            float zzb7 = zzb(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb6, zzb7, 0);
            zza2.zzx(obtain);
            obtain.recycle();
            return;
        }
        if (str2.equals("currentTime")) {
            String str8 = (String) map.get("time");
            if (str8 == null) {
                j.g("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zza2.zzw((int) (Float.parseFloat(str8) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                j.g("Could not parse time parameter from currentTime video GMSG: ".concat(str8));
                return;
            }
        }
        if (str2.equals("hide")) {
            zza2.setVisibility(4);
            return;
        }
        if (str2.equals("remove")) {
            zza2.setVisibility(8);
            return;
        }
        if (str2.equals("load")) {
            zza2.zzr(valueOf2);
            return;
        }
        if (str2.equals("loadControl")) {
            zzc(zza2, map);
            return;
        }
        if (str2.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zza2.zzs();
                return;
            } else {
                zza2.zzI();
                return;
            }
        }
        if (str2.equals("pause")) {
            zza2.zzu();
            return;
        }
        if (str2.equals("play")) {
            zza2.zzv();
            return;
        }
        if (str2.equals("show")) {
            zza2.setVisibility(0);
            return;
        }
        if (!str2.equals("src")) {
            if (str2.equals("touchMove")) {
                Context context3 = zzcawVar.getContext();
                zza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzcawVar.zzdg();
                this.zza = true;
                return;
            }
            if (!str2.equals("volume")) {
                if (str2.equals("watermark")) {
                    zza2.zzp();
                    return;
                } else {
                    j.g("Unknown video action: ".concat(str2));
                    return;
                }
            }
            String str9 = (String) map.get("volume");
            if (str9 == null) {
                j.g("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zza2.zzG(Float.parseFloat(str9));
                return;
            } catch (NumberFormatException unused6) {
                j.g("Could not parse volume parameter from volume video GMSG: ".concat(str9));
                return;
            }
        }
        String str10 = (String) map.get("src");
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                valueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
            } catch (NumberFormatException unused7) {
                j.g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
            }
            String[] strArr = {str10};
            str = (String) map.get("demuxed");
            if (str != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        strArr2[i11] = jSONArray.getString(i11);
                    }
                    strArr = strArr2;
                } catch (JSONException unused8) {
                    j.g("Malformed demuxed URL list for playback: ".concat(str));
                    strArr = new String[]{str10};
                }
            }
            if (valueOf != null) {
                zzcawVar.zzA(valueOf.intValue());
            }
            zza2.zzE(str10, strArr);
        }
        valueOf = null;
        String[] strArr3 = {str10};
        str = (String) map.get("demuxed");
        if (str != null) {
        }
        if (valueOf != null) {
        }
        zza2.zzE(str10, strArr3);
    }
}
