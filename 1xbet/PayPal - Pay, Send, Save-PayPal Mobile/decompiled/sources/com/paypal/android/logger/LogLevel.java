package com.paypal.android.logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/android/logger/LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LogLevel {
    private static final /* synthetic */ com.paypal.android.logger.LogLevel[] Camera2StreamConfigurationMap;
    public static final com.paypal.android.logger.LogLevel DEBUG;
    public static final com.paypal.android.logger.LogLevel ERROR;
    public static final com.paypal.android.logger.LogLevel INFO;
    public static final com.paypal.android.logger.LogLevel VERBOSE;
    public static final com.paypal.android.logger.LogLevel WARN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private LogLevel(java.lang.String str, int i) {
    }

    static {
        com.paypal.android.logger.LogLevel logLevel = new com.paypal.android.logger.LogLevel("VERBOSE", 0);
        VERBOSE = logLevel;
        com.paypal.android.logger.LogLevel logLevel2 = new com.paypal.android.logger.LogLevel("DEBUG", 1);
        DEBUG = logLevel2;
        com.paypal.android.logger.LogLevel logLevel3 = new com.paypal.android.logger.LogLevel("INFO", 2);
        INFO = logLevel3;
        com.paypal.android.logger.LogLevel logLevel4 = new com.paypal.android.logger.LogLevel("WARN", 3);
        WARN = logLevel4;
        com.paypal.android.logger.LogLevel logLevel5 = new com.paypal.android.logger.LogLevel("ERROR", 4);
        ERROR = logLevel5;
        com.paypal.android.logger.LogLevel[] logLevelArr = {logLevel, logLevel2, logLevel3, logLevel4, logLevel5};
        Camera2StreamConfigurationMap = logLevelArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(logLevelArr);
    }

    public static com.paypal.android.logger.LogLevel[] values() {
        return (com.paypal.android.logger.LogLevel[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.android.logger.LogLevel valueOf(java.lang.String str) {
        return (com.paypal.android.logger.LogLevel) java.lang.Enum.valueOf(com.paypal.android.logger.LogLevel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.logger.LogLevel> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
