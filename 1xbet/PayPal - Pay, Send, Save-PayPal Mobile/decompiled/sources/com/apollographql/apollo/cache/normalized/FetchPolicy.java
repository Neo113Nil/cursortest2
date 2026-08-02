package com.apollographql.apollo.cache.normalized;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "CacheFirst", "CacheOnly", "NetworkFirst", "NetworkOnly", "CacheAndNetwork"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FetchPolicy {
    public static final com.apollographql.apollo.cache.normalized.FetchPolicy CacheAndNetwork;
    public static final com.apollographql.apollo.cache.normalized.FetchPolicy CacheFirst;
    public static final com.apollographql.apollo.cache.normalized.FetchPolicy CacheOnly;
    public static final com.apollographql.apollo.cache.normalized.FetchPolicy NetworkFirst;
    public static final com.apollographql.apollo.cache.normalized.FetchPolicy NetworkOnly;
    private static final /* synthetic */ com.apollographql.apollo.cache.normalized.FetchPolicy[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private FetchPolicy(java.lang.String str, int i) {
    }

    static {
        com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy = new com.apollographql.apollo.cache.normalized.FetchPolicy("CacheFirst", 0);
        CacheFirst = fetchPolicy;
        com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy2 = new com.apollographql.apollo.cache.normalized.FetchPolicy("CacheOnly", 1);
        CacheOnly = fetchPolicy2;
        com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy3 = new com.apollographql.apollo.cache.normalized.FetchPolicy("NetworkFirst", 2);
        NetworkFirst = fetchPolicy3;
        com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy4 = new com.apollographql.apollo.cache.normalized.FetchPolicy("NetworkOnly", 3);
        NetworkOnly = fetchPolicy4;
        com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy5 = new com.apollographql.apollo.cache.normalized.FetchPolicy("CacheAndNetwork", 4);
        CacheAndNetwork = fetchPolicy5;
        com.apollographql.apollo.cache.normalized.FetchPolicy[] fetchPolicyArr = {fetchPolicy, fetchPolicy2, fetchPolicy3, fetchPolicy4, fetchPolicy5};
        getHighSpeedVideoFpsRanges = fetchPolicyArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(fetchPolicyArr);
    }

    public static com.apollographql.apollo.cache.normalized.FetchPolicy valueOf(java.lang.String str) {
        return (com.apollographql.apollo.cache.normalized.FetchPolicy) java.lang.Enum.valueOf(com.apollographql.apollo.cache.normalized.FetchPolicy.class, str);
    }

    public static com.apollographql.apollo.cache.normalized.FetchPolicy[] values() {
        return (com.apollographql.apollo.cache.normalized.FetchPolicy[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.enums.EnumEntries<com.apollographql.apollo.cache.normalized.FetchPolicy> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
