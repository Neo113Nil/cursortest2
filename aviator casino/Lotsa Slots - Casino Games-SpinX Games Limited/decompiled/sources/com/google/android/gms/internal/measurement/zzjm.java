package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzjm {
    private static android.os.UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzjm() {
    }

    public static boolean zza() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    public static boolean zzb(android.content.Context context) {
        return zza() && !zzd(context);
    }

    public static boolean zzc(android.content.Context context) {
        return !zza() || zzd(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzd(android.content.Context context) {
        boolean z;
        if (zzb) {
            return true;
        }
        synchronized (com.google.android.gms.internal.measurement.zzjm.class) {
            if (zzb) {
                return true;
            }
            int i = 1;
            while (true) {
                z = false;
                if (i > 2) {
                    break;
                }
                if (zza == null) {
                    zza = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
                }
                android.os.UserManager userManager = zza;
                if (userManager == null) {
                    z = true;
                    break;
                }
                try {
                    if (userManager.isUserUnlocked()) {
                        break;
                    }
                } catch (java.lang.NullPointerException e) {
                    android.util.Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                    zza = null;
                    i++;
                }
            }
            if (z) {
                zza = null;
            }
            if (z) {
                zzb = true;
            }
            return z;
        }
    }
}
