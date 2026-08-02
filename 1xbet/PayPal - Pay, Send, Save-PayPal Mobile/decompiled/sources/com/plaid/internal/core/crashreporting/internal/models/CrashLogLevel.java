package com.plaid.internal.core.crashreporting.internal.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "FATAL", "ERROR", "WARNING", "INFO", "DEBUG"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CrashLogLevel {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel[] $VALUES;

    @com.google.gson.annotations.SerializedName("fatal")
    public static final com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel FATAL = new com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel("FATAL", 0);

    @com.google.gson.annotations.SerializedName("error")
    public static final com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel ERROR = new com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel("ERROR", 1);

    @com.google.gson.annotations.SerializedName(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.WARNING)
    public static final com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel WARNING = new com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel("WARNING", 2);

    @com.google.gson.annotations.SerializedName("info")
    public static final com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel INFO = new com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel("INFO", 3);

    @com.google.gson.annotations.SerializedName(com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG)
    public static final com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel DEBUG = new com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel("DEBUG", 4);

    static {
        com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    private CrashLogLevel(java.lang.String str, int i) {
    }

    public static com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel[] values() {
        return (com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel[]) $VALUES.clone();
    }

    public static com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel valueOf(java.lang.String str) {
        return (com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel) java.lang.Enum.valueOf(com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel[] $values() {
        return new com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel[]{FATAL, ERROR, WARNING, INFO, DEBUG};
    }
}
