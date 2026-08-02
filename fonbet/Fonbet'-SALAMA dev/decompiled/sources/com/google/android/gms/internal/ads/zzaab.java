package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
final class zzaab {
    public static boolean zza(Context context) {
        boolean isHdr;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            return false;
        }
        isHdr = display.isHdr();
        if (!isHdr) {
            return false;
        }
        for (int i7 : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i7 == 1) {
                return true;
            }
        }
        return false;
    }
}
