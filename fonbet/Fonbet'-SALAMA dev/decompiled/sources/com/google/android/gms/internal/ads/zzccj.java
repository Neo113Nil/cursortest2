package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzccj implements zzbiz {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String f7 = AbstractC1663a.f("Precache invalid numeric parameter '", str, "': ", (String) map.get(str));
            int i7 = J.f3546b;
            j.g(f7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzcci zzcciVar;
        zzcca zza;
        zzcaw zzcawVar = (zzcaw) obj;
        if (j.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            j.b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzccb zzccbVar = o.f1952C.f1953A;
        if (map.containsKey("abort")) {
            if (zzccbVar.zzd(zzcawVar)) {
                return;
            }
            j.g("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcav zzcavVar = new zzcav((String) map.get("flags"));
        boolean z4 = zzcavVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        strArr2[i7] = jSONArray.getString(i7);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    j.g("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z4) {
                Iterator it = zzccbVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zza = null;
                        break;
                    }
                    zzcca zzccaVar = (zzcca) it.next();
                    if (zzccaVar.zza == zzcawVar && str.equals(zzccaVar.zze())) {
                        zza = zzccaVar;
                        break;
                    }
                }
            } else {
                zza = zzccbVar.zza(zzcawVar);
            }
            if (zza != null) {
                j.g("Precache task is already running.");
                return;
            }
            if (zzcawVar.zzj() == null) {
                j.g("Precache requires a dependency provider.");
                return;
            }
            Integer zzb4 = zzb(map, "player");
            if (zzb4 == null) {
                zzb4 = 0;
            }
            if (zzb != null) {
                zzcawVar.zzA(zzb.intValue());
            }
            if (zzb2 != null) {
                zzcawVar.zzy(zzb2.intValue());
            }
            if (zzb3 != null) {
                zzcawVar.zzx(zzb3.intValue());
            }
            int intValue = zzb4.intValue();
            zzcbt zzcbtVar = zzcawVar.zzj().f1907b;
            if (intValue > 0) {
                int i8 = zzcavVar.zzg;
                int zzu = zzcan.zzu();
                if (zzu < i8) {
                    zzcciVar = new zzccr(zzcawVar, zzcavVar);
                } else {
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzn)).booleanValue()) {
                        zzu = zzcco.zzi();
                    }
                    zzcciVar = zzu < zzcavVar.zzb ? new zzcco(zzcawVar, zzcavVar) : new zzccm(zzcawVar);
                }
            } else {
                zzcciVar = new zzccl(zzcawVar);
            }
            new zzcca(zzcawVar, zzcciVar, str, strArr).zzb();
        } else {
            zzcca zza2 = zzccbVar.zza(zzcawVar);
            if (zza2 == null) {
                j.g("Precache must specify a source.");
                return;
            }
            zzcciVar = zza2.zzb;
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzcciVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzcciVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzcciVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzcciVar.zzq(zzb8.intValue());
        }
    }
}
