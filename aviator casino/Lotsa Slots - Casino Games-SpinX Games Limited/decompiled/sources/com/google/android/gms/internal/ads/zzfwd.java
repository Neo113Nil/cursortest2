package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfwd {
    private static android.app.UiModeManager zza;

    public static void zza(android.content.Context context) {
        if (context != null) {
            zza = (android.app.UiModeManager) context.getSystemService("uimode");
        }
    }

    public static com.google.android.gms.internal.ads.zzfuq zzb() {
        android.app.UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return com.google.android.gms.internal.ads.zzfuq.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? com.google.android.gms.internal.ads.zzfuq.OTHER : com.google.android.gms.internal.ads.zzfuq.CTV : com.google.android.gms.internal.ads.zzfuq.MOBILE;
    }
}
