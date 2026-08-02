package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class IlIlllIIII {
    public static boolean llIIlIlIIl() {
        java.lang.String str;
        java.lang.String str2 = android.os.Build.BRAND;
        if (str2 == null || (str = android.os.Build.MANUFACTURER) == null) {
            return false;
        }
        return str2.compareToIgnoreCase("Samsung") == 0 || str.compareToIgnoreCase("Samsung") == 0;
    }
}
