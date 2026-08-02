package io.ktor.client.plugins.logging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lio/ktor/client/plugins/logging/LoggingFormat;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "OkHttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoggingFormat {
    public static final io.ktor.client.plugins.logging.LoggingFormat Default;
    public static final io.ktor.client.plugins.logging.LoggingFormat OkHttp;
    private static final /* synthetic */ io.ktor.client.plugins.logging.LoggingFormat[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private LoggingFormat(java.lang.String str, int i) {
    }

    static {
        io.ktor.client.plugins.logging.LoggingFormat loggingFormat = new io.ktor.client.plugins.logging.LoggingFormat("Default", 0);
        Default = loggingFormat;
        io.ktor.client.plugins.logging.LoggingFormat loggingFormat2 = new io.ktor.client.plugins.logging.LoggingFormat("OkHttp", 1);
        OkHttp = loggingFormat2;
        io.ktor.client.plugins.logging.LoggingFormat[] loggingFormatArr = {loggingFormat, loggingFormat2};
        getHighSpeedVideoFpsRanges = loggingFormatArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(loggingFormatArr);
    }

    public static io.ktor.client.plugins.logging.LoggingFormat valueOf(java.lang.String str) {
        return (io.ktor.client.plugins.logging.LoggingFormat) java.lang.Enum.valueOf(io.ktor.client.plugins.logging.LoggingFormat.class, str);
    }

    public static io.ktor.client.plugins.logging.LoggingFormat[] values() {
        return (io.ktor.client.plugins.logging.LoggingFormat[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.enums.EnumEntries<io.ktor.client.plugins.logging.LoggingFormat> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
