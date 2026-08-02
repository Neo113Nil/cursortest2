package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzfkx {
    private static UiModeManager zza;

    public static zzfjn zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfjn.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? zzfjn.OTHER : zzfjn.CTV : zzfjn.MOBILE;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
