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

/* JADX INFO: loaded from: classes.dex */
public final class zzccj implements zzbiz {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String strF = p150v0.a.f("Precache invalid numeric parameter '", str, "': ", (String) map.get(str));
            int i7 = J.f3546b;
            j.g(strF);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzcci zzcclVar;
        zzcca zzccaVarZza;
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
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
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
                        zzccaVarZza = null;
                        break;
                    }
                    zzcca zzccaVar = (zzcca) it.next();
                    if (zzccaVar.zza == zzcawVar && str.equals(zzccaVar.zze())) {
                        zzccaVarZza = zzccaVar;
                        break;
                    }
                }
            } else {
                zzccaVarZza = zzccbVar.zza(zzcawVar);
            }
            if (zzccaVarZza != null) {
                j.g("Precache task is already running.");
                return;
            }
            if (zzcawVar.zzj() == null) {
                j.g("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = 0;
            }
            if (numZzb != null) {
                zzcawVar.zzA(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzcawVar.zzy(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzcawVar.zzx(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzcbt zzcbtVar = zzcawVar.zzj().f1907b;
            if (iIntValue > 0) {
                int i8 = zzcavVar.zzg;
                int iZzu = zzcan.zzu();
                if (iZzu < i8) {
                    zzcclVar = new zzccr(zzcawVar, zzcavVar);
                } else {
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzn)).booleanValue()) {
                        iZzu = zzcco.zzi();
                    }
                    zzcclVar = iZzu < zzcavVar.zzb ? new zzcco(zzcawVar, zzcavVar) : new zzccm(zzcawVar);
                }
            } else {
                zzcclVar = new zzccl(zzcawVar);
            }
            new zzcca(zzcawVar, zzcclVar, str, strArr).zzb();
        } else {
            zzcca zzccaVarZza2 = zzccbVar.zza(zzcawVar);
            if (zzccaVarZza2 == null) {
                j.g("Precache must specify a source.");
                return;
            }
            zzcclVar = zzccaVarZza2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcclVar.zzs(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcclVar.zzr(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcclVar.zzp(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcclVar.zzq(numZzb8.intValue());
        }
    }
}
