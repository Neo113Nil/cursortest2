package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcip implements com.google.android.gms.internal.ads.zzbpq {
    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) obj;
        com.google.android.gms.internal.ads.zzcma zzh = zzchnVar.zzh();
        if (zzh == null) {
            try {
                com.google.android.gms.internal.ads.zzcma zzcmaVar = new com.google.android.gms.internal.ads.zzcma(zzchnVar, java.lang.Float.parseFloat((java.lang.String) map.get(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzchnVar.zzw(zzcmaVar);
                zzh = zzcmaVar;
            } catch (java.lang.NullPointerException e) {
                e = e;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (java.lang.NumberFormatException e2) {
                e = e2;
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = java.lang.Float.parseFloat((java.lang.String) map.get(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = java.lang.Float.parseFloat((java.lang.String) map.get("currentTime"));
        int parseInt = java.lang.Integer.parseInt((java.lang.String) map.get("playbackState"));
        int i3 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i3 = parseInt;
        }
        java.lang.String str = (java.lang.String) map.get("aspectRatio");
        float parseFloat3 = android.text.TextUtils.isEmpty(str) ? 0.0f : java.lang.Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(parseFloat2).length() + 45 + java.lang.String.valueOf(parseFloat).length() + 13 + java.lang.String.valueOf(equals).length() + 19 + java.lang.String.valueOf(i3).length() + 17 + java.lang.String.valueOf(str).length());
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(i3);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
        }
        zzh.zzs(parseFloat2, parseFloat, i3, equals, parseFloat3);
    }
}
