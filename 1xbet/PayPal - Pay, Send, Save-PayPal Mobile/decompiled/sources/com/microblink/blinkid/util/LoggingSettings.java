package com.microblink.blinkid.util;

/* loaded from: classes10.dex */
public final class LoggingSettings {
    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
    }

    public static final void disableMicroblinkLogging() {
        com.microblink.blinkid.util.Log.setLogLevel(com.microblink.blinkid.util.Log.LogLevel.LOG_QUIET);
        logEnabledNativeSet(false);
    }

    private static native void logEnabledNativeSet(boolean z);
}
