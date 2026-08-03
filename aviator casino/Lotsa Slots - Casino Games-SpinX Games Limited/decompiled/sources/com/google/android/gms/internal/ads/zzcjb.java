package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcjb implements com.google.android.gms.internal.ads.zzbpq {
    private static final java.lang.Integer zzb(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) map.get(str)));
        } catch (java.lang.NumberFormatException unused) {
            java.lang.String str2 = (java.lang.String) map.get(str);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 39 + java.lang.String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            java.lang.String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcja zzcjaVar;
        com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Precache GMSG: ".concat(jSONObject.toString()));
        }
        com.google.android.gms.internal.ads.zzcit zzB = com.google.android.gms.ads.internal.zzt.zzB();
        if (map.containsKey("abort")) {
            if (zzB.zza(zzchnVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache abort but no precache task running.");
            return;
        }
        java.lang.String str = (java.lang.String) map.get("src");
        java.lang.Integer zzb = zzb(map, "periodicReportIntervalMs");
        java.lang.Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        java.lang.Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        com.google.android.gms.internal.ads.zzchm zzchmVar = new com.google.android.gms.internal.ads.zzchm((java.lang.String) map.get("flags"));
        boolean z = zzchmVar.zzk;
        if (str != null) {
            java.lang.String[] strArr = {str};
            java.lang.String str2 = (java.lang.String) map.get("demuxed");
            com.google.android.gms.internal.ads.zzcis zzcisVar = null;
            if (str2 != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(str2);
                    java.lang.String[] strArr2 = new java.lang.String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (org.json.JSONException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new java.lang.String[]{str};
            }
            if (z) {
                java.util.Iterator it = zzB.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.google.android.gms.internal.ads.zzcis zzcisVar2 = (com.google.android.gms.internal.ads.zzcis) it.next();
                    if (zzcisVar2.zza == zzchnVar && str.equals(zzcisVar2.zzd())) {
                        zzcisVar = zzcisVar2;
                        break;
                    }
                }
            } else {
                zzcisVar = zzB.zzb(zzchnVar);
            }
            if (zzcisVar != null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache task is already running.");
                return;
            }
            if (zzchnVar.zzk() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache requires a dependency provider.");
                return;
            }
            java.lang.Integer zzb4 = zzb(map, "player");
            if (zzb4 == null) {
                zzb4 = 0;
            }
            if (zzb != null) {
                zzchnVar.zzo(zzb.intValue());
            }
            if (zzb2 != null) {
                zzchnVar.zzA(zzb2.intValue());
            }
            if (zzb3 != null) {
                zzchnVar.zzB(zzb3.intValue());
            }
            int intValue = zzb4.intValue();
            com.google.android.gms.internal.ads.zzcik zzcikVar = zzchnVar.zzk().zzb;
            if (intValue > 0) {
                int i2 = zzchmVar.zzg;
                int zzQ = com.google.android.gms.internal.ads.zzche.zzQ();
                if (zzQ < i2) {
                    zzcjaVar = new com.google.android.gms.internal.ads.zzcjj(zzchnVar, zzchmVar);
                } else {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzr)).booleanValue()) {
                        zzQ = com.google.android.gms.internal.ads.zzcjg.zzr();
                    }
                    zzcjaVar = zzQ < zzchmVar.zzb ? new com.google.android.gms.internal.ads.zzcjg(zzchnVar, zzchmVar) : new com.google.android.gms.internal.ads.zzcje(zzchnVar);
                }
            } else {
                zzcjaVar = new com.google.android.gms.internal.ads.zzcjd(zzchnVar);
            }
            new com.google.android.gms.internal.ads.zzcis(zzchnVar, zzcjaVar, str, strArr).zzb();
        } else {
            com.google.android.gms.internal.ads.zzcis zzb5 = zzB.zzb(zzchnVar);
            if (zzb5 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache must specify a source.");
                return;
            }
            zzcjaVar = zzb5.zzb;
        }
        java.lang.Integer zzb6 = zzb(map, "minBufferMs");
        if (zzb6 != null) {
            zzcjaVar.zzi(zzb6.intValue());
        }
        java.lang.Integer zzb7 = zzb(map, "maxBufferMs");
        if (zzb7 != null) {
            zzcjaVar.zzh(zzb7.intValue());
        }
        java.lang.Integer zzb8 = zzb(map, "bufferForPlaybackMs");
        if (zzb8 != null) {
            zzcjaVar.zzj(zzb8.intValue());
        }
        java.lang.Integer zzb9 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb9 != null) {
            zzcjaVar.zzk(zzb9.intValue());
        }
    }
}
