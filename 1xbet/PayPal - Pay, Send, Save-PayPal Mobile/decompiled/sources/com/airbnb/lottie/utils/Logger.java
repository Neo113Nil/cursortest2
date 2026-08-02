package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public class Logger {
    private static com.airbnb.lottie.LottieLogger getHighSpeedVideoSizes = new com.airbnb.lottie.utils.LogcatLogger();

    public static void setInstance(com.airbnb.lottie.LottieLogger lottieLogger) {
        getHighSpeedVideoSizes = lottieLogger;
    }

    public static void debug(java.lang.String str) {
        getHighSpeedVideoSizes.debug(str);
    }

    public static void debug(java.lang.String str, java.lang.Throwable th) {
        getHighSpeedVideoSizes.debug(str, th);
    }

    public static void warning(java.lang.String str) {
        getHighSpeedVideoSizes.warning(str);
    }

    public static void warning(java.lang.String str, java.lang.Throwable th) {
        getHighSpeedVideoSizes.warning(str, th);
    }

    public static void error(java.lang.String str, java.lang.Throwable th) {
        getHighSpeedVideoSizes.error(str, th);
    }
}
