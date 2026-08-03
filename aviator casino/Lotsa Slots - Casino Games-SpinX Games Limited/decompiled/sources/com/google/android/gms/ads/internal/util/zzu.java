package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public class zzu extends com.google.android.gms.ads.internal.util.zzt {
    static final boolean zze(int i, int i2, int i3) {
        return java.lang.Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzd(android.app.Activity activity, android.content.res.Configuration configuration) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfZ)).booleanValue()) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgb)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        int zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, configuration.screenHeightDp);
        int zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, configuration.screenWidthDp);
        android.view.WindowManager windowManager = (android.view.WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzc();
        android.util.DisplayMetrics zzv = com.google.android.gms.ads.internal.util.zzs.zzv(windowManager);
        int i = zzv.heightPixels;
        int i2 = zzv.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) java.lang.Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfX)).intValue();
        return (zze(i, zzE + dimensionPixelSize, round) && zze(i2, zzE2, round)) ? false : true;
    }
}
