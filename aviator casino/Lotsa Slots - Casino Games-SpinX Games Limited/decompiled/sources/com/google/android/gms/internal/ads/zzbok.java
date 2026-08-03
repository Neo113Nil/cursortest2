package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbok implements com.google.android.gms.internal.ads.zzbpq {
    zzbok() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        android.view.WindowManager windowManager = (android.view.WindowManager) zzckuVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzc();
        android.util.DisplayMetrics zzv = com.google.android.gms.ads.internal.util.zzs.zzv(windowManager);
        int i = zzv.widthPixels;
        int i2 = zzv.heightPixels;
        int[] iArr = new int[2];
        java.util.HashMap hashMap = new java.util.HashMap();
        ((android.view.View) zzckuVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", java.lang.Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", java.lang.Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", java.lang.Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", java.lang.Integer.valueOf(i2));
        zzckuVar.zze("locationReady", hashMap);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("GET LOCATION COMPILED");
    }
}
