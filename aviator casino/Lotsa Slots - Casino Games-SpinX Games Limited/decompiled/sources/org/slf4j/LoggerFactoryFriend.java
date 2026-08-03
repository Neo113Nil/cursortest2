package org.slf4j;

/* loaded from: classes6.dex */
public class LoggerFactoryFriend {
    public static void reset() {
        org.slf4j.LoggerFactory.reset();
    }

    public static void setDetectLoggerNameMismatch(boolean z) {
        org.slf4j.LoggerFactory.DETECT_LOGGER_NAME_MISMATCH = z;
    }
}
