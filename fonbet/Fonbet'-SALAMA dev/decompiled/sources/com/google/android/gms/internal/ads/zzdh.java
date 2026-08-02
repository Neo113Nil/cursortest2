package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.os.Build;

/* loaded from: classes.dex */
public final class zzdh {
    public static void zza(boolean z4, String str) {
        if (!z4) {
            throw new zzdg(str);
        }
    }

    public static boolean zzb(Context context) {
        int i7 = zzen.zza;
        if (i7 < 24) {
            return false;
        }
        if (i7 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i7 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzd("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzc() {
        return zzd("EGL_KHR_surfaceless_context");
    }

    private static boolean zzd(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }
}
