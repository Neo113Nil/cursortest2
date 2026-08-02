package com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi;

/* loaded from: classes10.dex */
public final class DpiOptionsUtils {
    public static void checkDpiRange(int i) {
        if (i < 100 || i > 400) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DPI value must be in range [100, 400], you are trying to set DPI to: ");
            sb.append(i);
            sb.append(".");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
