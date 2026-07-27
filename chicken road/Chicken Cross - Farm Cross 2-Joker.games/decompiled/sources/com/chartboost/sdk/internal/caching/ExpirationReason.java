package com.chartboost.sdk.internal.caching;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/internal/caching/ExpirationReason;", "", "<init>", "(Ljava/lang/String;I)V", "TTL_EXPIRED", "SIZE_LIMIT_EVICTION", "EXPLICIT_EVICTION", "CACHE_CLEARED", "UNKNOWN", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExpirationReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExpirationReason[] $VALUES;
    public static final ExpirationReason TTL_EXPIRED = new ExpirationReason("TTL_EXPIRED", 0);
    public static final ExpirationReason SIZE_LIMIT_EVICTION = new ExpirationReason("SIZE_LIMIT_EVICTION", 1);
    public static final ExpirationReason EXPLICIT_EVICTION = new ExpirationReason("EXPLICIT_EVICTION", 2);
    public static final ExpirationReason CACHE_CLEARED = new ExpirationReason("CACHE_CLEARED", 3);
    public static final ExpirationReason UNKNOWN = new ExpirationReason("UNKNOWN", 4);

    private static final /* synthetic */ ExpirationReason[] $values() {
        return new ExpirationReason[]{TTL_EXPIRED, SIZE_LIMIT_EVICTION, EXPLICIT_EVICTION, CACHE_CLEARED, UNKNOWN};
    }

    static {
        ExpirationReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ExpirationReason(String str, int i) {
    }

    public static EnumEntries<ExpirationReason> getEntries() {
        return $ENTRIES;
    }

    public static ExpirationReason valueOf(String str) {
        return (ExpirationReason) Enum.valueOf(ExpirationReason.class, str);
    }

    public static ExpirationReason[] values() {
        return (ExpirationReason[]) $VALUES.clone();
    }
}
