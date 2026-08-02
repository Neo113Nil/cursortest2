package com.paypal.oslo.downloads.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/CacheStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "CACHE_FIRST", "NETWORK_FIRST", "CACHE_ONLY", "NO_CACHE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CacheStrategy {
    public static final com.paypal.oslo.downloads.api.model.CacheStrategy CACHE_FIRST;
    public static final com.paypal.oslo.downloads.api.model.CacheStrategy CACHE_ONLY;
    public static final com.paypal.oslo.downloads.api.model.CacheStrategy NETWORK_FIRST;
    public static final com.paypal.oslo.downloads.api.model.CacheStrategy NO_CACHE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.downloads.api.model.CacheStrategy[] getHighSpeedVideoSizes;

    private CacheStrategy(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.downloads.api.model.CacheStrategy cacheStrategy = new com.paypal.oslo.downloads.api.model.CacheStrategy("CACHE_FIRST", 0);
        CACHE_FIRST = cacheStrategy;
        com.paypal.oslo.downloads.api.model.CacheStrategy cacheStrategy2 = new com.paypal.oslo.downloads.api.model.CacheStrategy("NETWORK_FIRST", 1);
        NETWORK_FIRST = cacheStrategy2;
        com.paypal.oslo.downloads.api.model.CacheStrategy cacheStrategy3 = new com.paypal.oslo.downloads.api.model.CacheStrategy("CACHE_ONLY", 2);
        CACHE_ONLY = cacheStrategy3;
        com.paypal.oslo.downloads.api.model.CacheStrategy cacheStrategy4 = new com.paypal.oslo.downloads.api.model.CacheStrategy("NO_CACHE", 3);
        NO_CACHE = cacheStrategy4;
        com.paypal.oslo.downloads.api.model.CacheStrategy[] cacheStrategyArr = {cacheStrategy, cacheStrategy2, cacheStrategy3, cacheStrategy4};
        getHighSpeedVideoSizes = cacheStrategyArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(cacheStrategyArr);
    }

    public static com.paypal.oslo.downloads.api.model.CacheStrategy[] values() {
        return (com.paypal.oslo.downloads.api.model.CacheStrategy[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.downloads.api.model.CacheStrategy valueOf(java.lang.String str) {
        return (com.paypal.oslo.downloads.api.model.CacheStrategy) java.lang.Enum.valueOf(com.paypal.oslo.downloads.api.model.CacheStrategy.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.downloads.api.model.CacheStrategy> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
