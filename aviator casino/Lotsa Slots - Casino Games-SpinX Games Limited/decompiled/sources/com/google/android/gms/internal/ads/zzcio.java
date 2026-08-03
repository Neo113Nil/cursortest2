package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcio implements com.google.android.gms.internal.ads.zzbpq {
    private boolean zza;

    private static int zzb(android.content.Context context, java.util.Map map, java.lang.String str, int i) {
        java.lang.String str2 = (java.lang.String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zza();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, java.lang.Integer.parseInt(str2));
            } catch (java.lang.NumberFormatException unused) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                java.lang.String sb2 = sb.toString();
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = str.length();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(length + 30 + java.lang.String.valueOf(str2).length() + 6 + java.lang.String.valueOf(i).length() + 1);
            sb3.append("Parse pixels for ");
            sb3.append(str);
            sb3.append(", got string ");
            sb3.append(str2);
            sb3.append(", int ");
            sb3.append(i);
            sb3.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
        }
        return i;
    }

    private static void zzc(com.google.android.gms.internal.ads.zzchb zzchbVar, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("minBufferMs");
        java.lang.String str2 = (java.lang.String) map.get("maxBufferMs");
        java.lang.String str3 = (java.lang.String) map.get("bufferForPlaybackMs");
        java.lang.String str4 = (java.lang.String) map.get("bufferForPlaybackAfterRebufferMs");
        java.lang.String str5 = (java.lang.String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzchbVar.zzx(java.lang.Integer.parseInt(str));
            } catch (java.lang.NumberFormatException unused) {
                java.lang.String format = java.lang.String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(format);
                return;
            }
        }
        if (str2 != null) {
            zzchbVar.zzy(java.lang.Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzchbVar.zzz(java.lang.Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzchbVar.zzA(java.lang.Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzchbVar.zzB(java.lang.Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        int min;
        int min2;
        int i;
        java.lang.Integer valueOf;
        java.lang.String str;
        com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) obj;
        java.lang.String str2 = (java.lang.String) map.get("action");
        if (str2 == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from video GMSG.");
            return;
        }
        java.lang.Integer valueOf2 = map.containsKey("playerId") ? java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) map.get("playerId"))) : null;
        java.lang.Integer zza = zzchnVar.zzdm() != null ? zzchnVar.zzdm().zza() : null;
        int i3 = 0;
        if (valueOf2 != null && zza != null && !valueOf2.equals(zza) && !str2.equals("load")) {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "Event intended for player %s, but sent to player %d - event ignored", valueOf2, zza);
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(format);
            return;
        }
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            java.lang.String jSONObject2 = jSONObject.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str2.length() + 13 + java.lang.String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str2);
            sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
            sb.append(jSONObject2);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
        }
        if (str2.equals(com.helpshift.proactive.InAppViewConstants.BACKGROUND)) {
            java.lang.String str3 = (java.lang.String) map.get("color");
            if (android.text.TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzchnVar.setBackgroundColor(android.graphics.Color.parseColor(str3));
                return;
            } catch (java.lang.IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str2.equals("playerBackground")) {
            java.lang.String str4 = (java.lang.String) map.get("color");
            if (android.text.TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzchnVar.zzv(android.graphics.Color.parseColor(str4));
                return;
            } catch (java.lang.IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str2.equals("decoderProps")) {
            java.lang.String str5 = (java.lang.String) map.get("mimeTypes");
            if (str5 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No MIME types specified for decoder properties inspection.");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                zzchnVar.zze("onVideoEvent", hashMap);
                return;
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.lang.String[] split = str5.split(",");
            int length = split.length;
            while (i3 < length) {
                java.lang.String str6 = split[i3];
                hashMap2.put(str6, com.google.android.gms.ads.internal.util.zzch.zza(str6.trim()));
                i3++;
            }
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            zzchnVar.zze("onVideoEvent", hashMap3);
            return;
        }
        com.google.android.gms.internal.ads.zzchc zzdm = zzchnVar.zzdm();
        if (zzdm == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str2.equals("new");
        boolean equals2 = str2.equals("position");
        if (equals || equals2) {
            android.content.Context context = zzchnVar.getContext();
            int zzb = zzb(context, map, "x", 0);
            int zzb2 = zzb(context, map, "y", 0);
            int zzb3 = zzb(context, map, "w", -1);
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzeL;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                min = zzb3 == -1 ? zzchnVar.zzy() : java.lang.Math.min(zzb3, zzchnVar.zzy());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int zzy = zzchnVar.zzy();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzb3).length() + 72 + java.lang.String.valueOf(zzy).length() + 4 + java.lang.String.valueOf(zzb).length() + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(zzb3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(zzy);
                    sb2.append(", x ");
                    sb2.append(zzb);
                    sb2.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                }
                min = java.lang.Math.min(zzb3, zzchnVar.zzy() - zzb);
            }
            int zzb4 = zzb(context, map, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, -1);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                min2 = zzb4 == -1 ? zzchnVar.zzx() : java.lang.Math.min(zzb4, zzchnVar.zzx());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int zzx = zzchnVar.zzx();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(zzb4).length() + 75 + java.lang.String.valueOf(zzx).length() + 4 + java.lang.String.valueOf(zzb2).length() + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(zzb4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(zzx);
                    sb3.append(", y ");
                    sb3.append(zzb2);
                    sb3.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                }
                min2 = java.lang.Math.min(zzb4, zzchnVar.zzx() - zzb2);
            }
            try {
                i = java.lang.Integer.parseInt((java.lang.String) map.get("player"));
            } catch (java.lang.NumberFormatException unused3) {
                i = 0;
            }
            boolean parseBoolean = java.lang.Boolean.parseBoolean((java.lang.String) map.get("spherical"));
            if (!equals || zzdm.zzd() != null) {
                zzdm.zzb(zzb, zzb2, min, min2);
                return;
            }
            zzdm.zzc(zzb, zzb2, min, min2, i, parseBoolean, new com.google.android.gms.internal.ads.zzchm((java.lang.String) map.get("flags")));
            com.google.android.gms.internal.ads.zzchb zzd = zzdm.zzd();
            if (zzd != null) {
                zzc(zzd, map);
                return;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzcma zzh = zzchnVar.zzh();
        if (zzh != null) {
            if (str2.equals("timeupdate")) {
                java.lang.String str7 = (java.lang.String) map.get("currentTime");
                if (str7 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzh.zzd(java.lang.Float.parseFloat(str7));
                    return;
                } catch (java.lang.NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str7));
                    return;
                }
            }
            if (str2.equals("skip")) {
                zzh.zzr();
                return;
            }
        }
        com.google.android.gms.internal.ads.zzchb zzd2 = zzdm.zzd();
        if (zzd2 == null) {
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "no_video_view");
            zzchnVar.zze("onVideoEvent", hashMap4);
            return;
        }
        if (str2.equals(com.ironsource.Y3.d)) {
            android.content.Context context2 = zzchnVar.getContext();
            int zzb5 = zzb(context2, map, "x", 0);
            float zzb6 = zzb(context2, map, "y", 0);
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb5, zzb6, 0);
            zzd2.zzC(obtain);
            obtain.recycle();
            return;
        }
        if (str2.equals("currentTime")) {
            java.lang.String str8 = (java.lang.String) map.get("time");
            if (str8 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzd2.zzt((int) (java.lang.Float.parseFloat(str8) * 1000.0f));
                return;
            } catch (java.lang.NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse time parameter from currentTime video GMSG: ".concat(str8));
                return;
            }
        }
        if (str2.equals("hide")) {
            zzd2.setVisibility(4);
            return;
        }
        if (str2.equals("remove")) {
            zzd2.setVisibility(8);
            return;
        }
        if (str2.equals("load")) {
            zzd2.zzq(valueOf2);
            return;
        }
        if (str2.equals("loadControl")) {
            zzc(zzd2, map);
            return;
        }
        if (str2.equals("muted")) {
            if (java.lang.Boolean.parseBoolean((java.lang.String) map.get("muted"))) {
                zzd2.zzu();
                return;
            } else {
                zzd2.zzv();
                return;
            }
        }
        if (str2.equals("pause")) {
            zzd2.zzr();
            return;
        }
        if (str2.equals("play")) {
            zzd2.zzs();
            return;
        }
        if (str2.equals(com.ironsource.C3232q2.v)) {
            zzd2.setVisibility(0);
            return;
        }
        if (!str2.equals("src")) {
            if (str2.equals("touchMove")) {
                android.content.Context context3 = zzchnVar.getContext();
                zzd2.zzp(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzchnVar.zzl();
                this.zza = true;
                return;
            }
            if (!str2.equals("volume")) {
                if (str2.equals("watermark")) {
                    zzd2.zzD();
                    return;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unknown video action: ".concat(str2));
                    return;
                }
            }
            java.lang.String str9 = (java.lang.String) map.get("volume");
            if (str9 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzd2.zzw(java.lang.Float.parseFloat(str9));
                return;
            } catch (java.lang.NumberFormatException unused6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse volume parameter from volume video GMSG: ".concat(str9));
                return;
            }
        }
        java.lang.String str10 = (java.lang.String) map.get("src");
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcM)).booleanValue() && android.text.TextUtils.isEmpty(str10)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                valueOf = java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) map.get("periodicReportIntervalMs")));
            } catch (java.lang.NumberFormatException unused7) {
                java.lang.String str11 = (java.lang.String) map.get("periodicReportIntervalMs");
                java.lang.String.valueOf(str11);
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(java.lang.String.valueOf(str11)));
            }
            java.lang.String[] strArr = {str10};
            str = (java.lang.String) map.get("demuxed");
            if (str != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (i3 < jSONArray.length()) {
                        java.lang.String string = jSONArray.getString(i3);
                        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcM)).booleanValue() || !android.text.TextUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                        i3++;
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcM)).booleanValue() && arrayList.isEmpty()) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(str.length() + 41);
                        sb4.append("All demuxed URLs are empty for playback: ");
                        sb4.append(str);
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb4.toString());
                        return;
                    }
                    strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
                } catch (org.json.JSONException unused8) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for playback: ".concat(str));
                    strArr = new java.lang.String[]{str10};
                }
            }
            if (valueOf != null) {
                zzchnVar.zzo(valueOf.intValue());
            }
            zzd2.zzo(str10, strArr);
        }
        valueOf = null;
        java.lang.String[] strArr2 = {str10};
        str = (java.lang.String) map.get("demuxed");
        if (str != null) {
        }
        if (valueOf != null) {
        }
        zzd2.zzo(str10, strArr2);
    }
}
