package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdx {
    public static boolean zza(android.content.Context context) throws com.google.android.gms.internal.ads.zzdw {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 26 && (com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(android.os.Build.MANUFACTURER) || "XT1650".equals(android.os.Build.MODEL))) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzf("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzb() throws com.google.android.gms.internal.ads.zzdw {
        return zzf("EGL_KHR_surfaceless_context");
    }

    public static boolean zzc(int i) throws com.google.android.gms.internal.ads.zzdw {
        if (i == 6) {
            return zzd();
        }
        if (i == 7) {
            return zzf("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean zzd() throws com.google.android.gms.internal.ads.zzdw {
        return android.os.Build.VERSION.SDK_INT >= 33 && zzf("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static void zze(boolean z, java.lang.String str) throws com.google.android.gms.internal.ads.zzdw {
        if (!z) {
            throw new com.google.android.gms.internal.ads.zzdw(str, com.google.android.gms.internal.ads.zzgwm.zzi());
        }
    }

    private static boolean zzf(java.lang.String str) throws com.google.android.gms.internal.ads.zzdw {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        zze(!eglGetDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY), "No EGL display.");
        zze(android.opengl.EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError == 12288) {
            java.lang.String eglQueryString = android.opengl.EGL14.eglQueryString(eglGetDisplay, 12373);
            return eglQueryString != null && eglQueryString.contains(str);
        }
        java.lang.String hexString = java.lang.Integer.toHexString(eglGetError);
        java.lang.String.valueOf(hexString);
        throw new com.google.android.gms.internal.ads.zzdw("Error in getDefaultEglDisplay, error code: 0x".concat(java.lang.String.valueOf(hexString)), com.google.android.gms.internal.ads.zzgwm.zzj(java.lang.Integer.valueOf(eglGetError)));
    }
}
