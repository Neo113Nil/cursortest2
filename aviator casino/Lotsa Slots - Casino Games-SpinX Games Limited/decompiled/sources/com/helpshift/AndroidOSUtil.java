package com.helpshift;

/* loaded from: classes4.dex */
public class AndroidOSUtil {
    private AndroidOSUtil() {
    }

    public static int currentOSAPILevel() {
        return android.os.Build.VERSION.SDK_INT;
    }
}
