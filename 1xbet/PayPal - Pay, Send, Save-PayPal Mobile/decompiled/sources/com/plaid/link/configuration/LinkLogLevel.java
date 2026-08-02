package com.plaid.link.configuration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/plaid/link/configuration/LinkLogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "ASSERT", "DEBUG", "ERROR", "INFO", "VERBOSE", "WARN"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LinkLogLevel {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.plaid.link.configuration.LinkLogLevel[] $VALUES;
    public static final com.plaid.link.configuration.LinkLogLevel ASSERT = new com.plaid.link.configuration.LinkLogLevel("ASSERT", 0);
    public static final com.plaid.link.configuration.LinkLogLevel DEBUG = new com.plaid.link.configuration.LinkLogLevel("DEBUG", 1);
    public static final com.plaid.link.configuration.LinkLogLevel ERROR = new com.plaid.link.configuration.LinkLogLevel("ERROR", 2);
    public static final com.plaid.link.configuration.LinkLogLevel INFO = new com.plaid.link.configuration.LinkLogLevel("INFO", 3);
    public static final com.plaid.link.configuration.LinkLogLevel VERBOSE = new com.plaid.link.configuration.LinkLogLevel("VERBOSE", 4);
    public static final com.plaid.link.configuration.LinkLogLevel WARN = new com.plaid.link.configuration.LinkLogLevel("WARN", 5);

    static {
        com.plaid.link.configuration.LinkLogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    private LinkLogLevel(java.lang.String str, int i) {
    }

    public static com.plaid.link.configuration.LinkLogLevel[] values() {
        return (com.plaid.link.configuration.LinkLogLevel[]) $VALUES.clone();
    }

    public static com.plaid.link.configuration.LinkLogLevel valueOf(java.lang.String str) {
        return (com.plaid.link.configuration.LinkLogLevel) java.lang.Enum.valueOf(com.plaid.link.configuration.LinkLogLevel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.plaid.link.configuration.LinkLogLevel> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.plaid.link.configuration.LinkLogLevel[] $values() {
        return new com.plaid.link.configuration.LinkLogLevel[]{ASSERT, DEBUG, ERROR, INFO, VERBOSE, WARN};
    }
}
