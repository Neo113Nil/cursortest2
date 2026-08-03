package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzboo implements com.google.android.gms.internal.ads.zzbpq {
    zzboo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        com.google.android.gms.internal.ads.zzgrs zzl = com.google.android.gms.internal.ads.zzgrt.zzl();
        zzl.zzb((java.lang.String) map.get(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID));
        zzl.zzg(zzckuVar.getWidth());
        zzl.zza(zzckuVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzl.zzc(java.lang.Integer.parseInt((java.lang.String) map.get("gravityX")) | java.lang.Integer.parseInt((java.lang.String) map.get("gravityY")));
        } else {
            zzl.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzl.zzd(java.lang.Float.parseFloat((java.lang.String) map.get("verticalMargin")));
        } else {
            zzl.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzl.zzh((java.lang.String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzt().zzc(zzckuVar, zzl.zzi());
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
