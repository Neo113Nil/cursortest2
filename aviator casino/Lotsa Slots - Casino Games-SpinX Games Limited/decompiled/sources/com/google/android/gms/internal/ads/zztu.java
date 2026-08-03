package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zztu {
    public static boolean zza(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 31 || !(i == 26 || i == 27)) {
            return android.os.Build.VERSION.SDK_INT >= 33 && i == 30;
        }
        return true;
    }
}
