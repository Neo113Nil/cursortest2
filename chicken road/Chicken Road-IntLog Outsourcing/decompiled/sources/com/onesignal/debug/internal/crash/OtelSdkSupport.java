package com.onesignal.debug.internal.crash;

import android.os.Build;

/* loaded from: classes.dex */
public final class OtelSdkSupport {
    public static final OtelSdkSupport INSTANCE = new OtelSdkSupport();
    public static final int MIN_SDK_VERSION = 26;
    private static boolean isSupported;

    static {
        isSupported = Build.VERSION.SDK_INT >= 26;
    }

    private OtelSdkSupport() {
    }

    public final boolean isSupported() {
        return isSupported;
    }

    public final void reset() {
        isSupported = Build.VERSION.SDK_INT >= 26;
    }

    public final void setSupported$com_onesignal_core(boolean z) {
        isSupported = z;
    }
}
