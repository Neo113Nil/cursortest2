package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzcc {
    private static android.os.UserManager zza;
    private static volatile boolean zzb = !zzb();

    public static boolean zzb() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(android.content.Context context) {
        boolean z;
        if (zzb() && !zzb) {
            synchronized (com.google.android.gms.internal.auth.zzcc.class) {
                if (!zzb) {
                    int i = 1;
                    while (true) {
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
                    z = false;
                    if (z) {
                        zza = null;
                    }
                    if (z) {
                        zzb = true;
                    }
                    if (!z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private zzcc() {
    }
}
