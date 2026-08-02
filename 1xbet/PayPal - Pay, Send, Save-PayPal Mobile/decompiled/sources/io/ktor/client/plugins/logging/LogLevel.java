package io.ktor.client.plugins.logging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lio/ktor/client/plugins/logging/LogLevel;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;IZZZ)V", "info", "Z", "getInfo", "()Z", "headers", "getHeaders", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "getBody", "ALL", "HEADERS", "BODY", "INFO", "NONE"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LogLevel {
    public static final io.ktor.client.plugins.logging.LogLevel ALL;
    public static final io.ktor.client.plugins.logging.LogLevel BODY;
    private static final /* synthetic */ io.ktor.client.plugins.logging.LogLevel[] Camera2StreamConfigurationMap;
    public static final io.ktor.client.plugins.logging.LogLevel HEADERS;
    public static final io.ktor.client.plugins.logging.LogLevel INFO;
    public static final io.ktor.client.plugins.logging.LogLevel NONE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final boolean body;
    private final boolean headers;
    private final boolean info;

    private LogLevel(java.lang.String str, int i, boolean z, boolean z2, boolean z3) {
        this.info = z;
        this.headers = z2;
        this.body = z3;
    }

    public final boolean getInfo() {
        return this.info;
    }

    public final boolean getHeaders() {
        return this.headers;
    }

    public final boolean getBody() {
        return this.body;
    }

    static {
        io.ktor.client.plugins.logging.LogLevel logLevel = new io.ktor.client.plugins.logging.LogLevel("ALL", 0, true, true, true);
        ALL = logLevel;
        io.ktor.client.plugins.logging.LogLevel logLevel2 = new io.ktor.client.plugins.logging.LogLevel("HEADERS", 1, true, true, false);
        HEADERS = logLevel2;
        io.ktor.client.plugins.logging.LogLevel logLevel3 = new io.ktor.client.plugins.logging.LogLevel("BODY", 2, true, false, true);
        BODY = logLevel3;
        io.ktor.client.plugins.logging.LogLevel logLevel4 = new io.ktor.client.plugins.logging.LogLevel("INFO", 3, true, false, false);
        INFO = logLevel4;
        io.ktor.client.plugins.logging.LogLevel logLevel5 = new io.ktor.client.plugins.logging.LogLevel("NONE", 4, false, false, false);
        NONE = logLevel5;
        io.ktor.client.plugins.logging.LogLevel[] logLevelArr = {logLevel, logLevel2, logLevel3, logLevel4, logLevel5};
        Camera2StreamConfigurationMap = logLevelArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(logLevelArr);
    }

    public static io.ktor.client.plugins.logging.LogLevel valueOf(java.lang.String str) {
        return (io.ktor.client.plugins.logging.LogLevel) java.lang.Enum.valueOf(io.ktor.client.plugins.logging.LogLevel.class, str);
    }

    public static io.ktor.client.plugins.logging.LogLevel[] values() {
        return (io.ktor.client.plugins.logging.LogLevel[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.enums.EnumEntries<io.ktor.client.plugins.logging.LogLevel> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
