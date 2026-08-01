package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfxf {
    private static UiModeManager zza;

    public static void zza(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }

    public static zzfvs zzb() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfvs.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? zzfvs.OTHER : zzfvs.CTV : zzfvs.MOBILE;
    }
}
