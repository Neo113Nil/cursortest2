package com.chartboost.sdk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/chartboost/sdk/LoggingLevel;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "INTEGRATION", "ALL", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoggingLevel {
    public static final /* synthetic */ LoggingLevel[] b;
    public static final /* synthetic */ EnumEntries c;
    public static final LoggingLevel NONE = new LoggingLevel("NONE", 0);
    public static final LoggingLevel INTEGRATION = new LoggingLevel("INTEGRATION", 1);
    public static final LoggingLevel ALL = new LoggingLevel("ALL", 2);

    static {
        LoggingLevel[] a2 = a();
        b = a2;
        c = EnumEntriesKt.enumEntries(a2);
    }

    public LoggingLevel(String str, int i) {
    }

    public static final /* synthetic */ LoggingLevel[] a() {
        return new LoggingLevel[]{NONE, INTEGRATION, ALL};
    }

    public static EnumEntries<LoggingLevel> getEntries() {
        return c;
    }

    public static LoggingLevel valueOf(String str) {
        return (LoggingLevel) Enum.valueOf(LoggingLevel.class, str);
    }

    public static LoggingLevel[] values() {
        return (LoggingLevel[]) b.clone();
    }
}
