package com.statsig.androidsdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/statsig/androidsdk/Tier;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCTION", "STAGING", "DEVELOPMENT"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Tier {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.statsig.androidsdk.Tier[] $VALUES;
    public static final com.statsig.androidsdk.Tier PRODUCTION = new com.statsig.androidsdk.Tier("PRODUCTION", 0);
    public static final com.statsig.androidsdk.Tier STAGING = new com.statsig.androidsdk.Tier("STAGING", 1);
    public static final com.statsig.androidsdk.Tier DEVELOPMENT = new com.statsig.androidsdk.Tier("DEVELOPMENT", 2);

    private Tier(java.lang.String str, int i) {
    }

    static {
        com.statsig.androidsdk.Tier[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.statsig.androidsdk.Tier[] values() {
        return (com.statsig.androidsdk.Tier[]) $VALUES.clone();
    }

    public static com.statsig.androidsdk.Tier valueOf(java.lang.String str) {
        return (com.statsig.androidsdk.Tier) java.lang.Enum.valueOf(com.statsig.androidsdk.Tier.class, str);
    }

    public static kotlin.enums.EnumEntries<com.statsig.androidsdk.Tier> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.statsig.androidsdk.Tier[] $values() {
        return new com.statsig.androidsdk.Tier[]{PRODUCTION, STAGING, DEVELOPMENT};
    }
}
