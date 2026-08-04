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
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class zzcbw implements zzbiz {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i7) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                d dVar = C0252s.f2717f.f2718a;
                i7 = d.p(Integer.parseInt(str2), context);
            } catch (NumberFormatException unused) {
                String strF = p150v0.a.f("Could not parse ", str, " in a video GMSG: ", str2);
                int i8 = J.f3546b;
                j.g(strF);
            }
        }
        if (J.m()) {
            StringBuilder sbL = k.l("Parse pixels for ", str, ", got string ", str2, ", int ");
            sbL.append(i7);
            sbL.append(".");
            J.k(sbL.toString());
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
                String strJ = L.j("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i7 = J.f3546b;
                j.g(strJ);
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

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i7;
        Integer numValueOf;
        zzcaw zzcawVar = (zzcaw) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i8 = J.f3546b;
            j.g("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZzb = zzcawVar.zzn() != null ? zzcawVar.zzn().zzb() : null;
        if (numValueOf2 != null && numZzb != null && !numValueOf2.equals(numZzb) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i9 = J.f3546b;
            j.f("Event intended for player " + numValueOf2 + ", but sent to player " + numZzb + " - event ignored");
            return;
        }
        if (j.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            j.b("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                j.g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcawVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                j.g("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                j.g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcawVar.zzB(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                j.g("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                j.g("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzcawVar.zzd("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, H.a(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            zzcawVar.zzd("onVideoEvent", map4);
            return;
        }
        zzcal zzcalVarZzn = zzcawVar.zzn();
        if (zzcalVarZzn == null) {
            j.g("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = zzcawVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            zzbbp zzbbpVar = zzbby.zzeb;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzcawVar.zzh() : Math.min(iZzb3, zzcawVar.zzh());
            } else {
                if (J.m()) {
                    StringBuilder sbG = p150v0.a.g("Calculate width with original width ", iZzb3, ", videoHost.getVideoBoundingWidth() ", zzcawVar.zzh(), ", x ");
                    sbG.append(iZzb);
                    sbG.append(".");
                    J.k(sbG.toString());
                }
                iMin = Math.min(iZzb3, zzcawVar.zzh() - iZzb);
            }
            int i10 = iMin;
            int iZzb4 = zzb(context, map, "h", -1);
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzcawVar.zzg() : Math.min(iZzb4, zzcawVar.zzg());
            } else {
                if (J.m()) {
                    StringBuilder sbG2 = p150v0.a.g("Calculate height with original height ", iZzb4, ", videoHost.getVideoBoundingHeight() ", zzcawVar.zzg(), ", y ");
                    sbG2.append(iZzb2);
                    sbG2.append(".");
                    J.k(sbG2.toString());
                }
                iMin2 = Math.min(iZzb4, zzcawVar.zzg() - iZzb2);
            }
            try {
                i7 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i7 = 0;
            }
            boolean z4 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzcalVarZzn.zza() != null) {
                zzcalVarZzn.zzc(iZzb, iZzb2, i10, iMin2);
                return;
            }
            zzcalVarZzn.zzd(iZzb, iZzb2, i10, iMin2, i7, z4, new zzcav((String) map.get("flags")));
            zzcak zzcakVarZza = zzcalVarZzn.zza();
            if (zzcakVarZza != null) {
                zzc(zzcakVarZza, map);
                return;
            }
            return;
        }
        zzcfd zzcfdVarZzq = zzcawVar.zzq();
        if (zzcfdVarZzq != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    j.g("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcfdVarZzq.zzt(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    j.g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzcfdVarZzq.zzu();
                return;
            }
        }
        zzcak zzcakVarZza2 = zzcalVarZzn.zza();
        if (zzcakVarZza2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            zzcawVar.zzd("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzcawVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzcakVarZza2.zzx(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                j.g("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcakVarZza2.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                j.g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzcakVarZza2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzcakVarZza2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzcakVarZza2.zzr(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzcakVarZza2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcakVarZza2.zzs();
                return;
            } else {
                zzcakVarZza2.zzI();
                return;
            }
        }
        if (str.equals("pause")) {
            zzcakVarZza2.zzu();
            return;
        }
        if (str.equals("play")) {
            zzcakVarZza2.zzv();
            return;
        }
        if (str.equals("show")) {
            zzcakVarZza2.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    j.g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        strArr2[i11] = jSONArray.getString(i11);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    j.g("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                zzcawVar.zzA(numValueOf.intValue());
            }
            zzcakVarZza2.zzE(str8, strArr);
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = zzcawVar.getContext();
            zzcakVarZza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
            if (this.zza) {
                return;
            }
            zzcawVar.zzdg();
            this.zza = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                zzcakVarZza2.zzp();
                return;
            } else {
                j.g("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            j.g("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzcakVarZza2.zzG(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            j.g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
