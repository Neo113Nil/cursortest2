package com.zettle.sdk.core.user.shadow;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/TransactionConfigMapper;", "", "Lcom/zettle/sdk/core/user/shadow/TransactionConfigEntryMapper;", "transactionConfigEntryMapper", "<init>", "(Lcom/zettle/sdk/core/user/shadow/TransactionConfigEntryMapper;)V", "Lcom/zettle/sdk/core/user/shadow/TransactionConfigShadow;", "from", "Lcom/zettle/android/entities/TransactionConfig;", "map", "(Lcom/zettle/sdk/core/user/shadow/TransactionConfigShadow;)Lcom/zettle/android/entities/TransactionConfig;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/core/user/shadow/TransactionConfigEntryMapper;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionConfigMapper {
    private final com.zettle.sdk.core.user.shadow.TransactionConfigEntryMapper getHighSpeedVideoFpsRanges;

    public TransactionConfigMapper(com.zettle.sdk.core.user.shadow.TransactionConfigEntryMapper transactionConfigEntryMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfigEntryMapper, "");
        this.getHighSpeedVideoFpsRanges = transactionConfigEntryMapper;
    }

    public /* synthetic */ TransactionConfigMapper(com.zettle.sdk.core.user.shadow.TransactionConfigEntryMapper transactionConfigEntryMapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.zettle.sdk.core.user.shadow.TransactionConfigEntryMapper() : transactionConfigEntryMapper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.zettle.android.entities.TransactionConfig map(com.zettle.sdk.core.user.shadow.TransactionConfigShadow from) {
        java.util.LinkedHashMap emptyMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.TransactionConfig.Companion companion = com.zettle.android.entities.TransactionConfig.INSTANCE;
        java.lang.Long paymentSessionMaxIdleTimeMs = from.getPaymentSessionMaxIdleTimeMs();
        long longValue = paymentSessionMaxIdleTimeMs != null ? paymentSessionMaxIdleTimeMs.longValue() : 0L;
        java.util.Set<java.lang.String> supportedReaders = from.getSupportedReaders();
        if (supportedReaders == null) {
            supportedReaders = kotlin.collections.SetsKt.emptySet();
        }
        java.util.Map<com.zettle.android.entities.CurrencyId, java.util.Map<java.lang.String, com.zettle.sdk.core.user.shadow.TransactionConfigEntryShadow>> configByCurrency = from.getConfigByCurrency();
        if (configByCurrency == null) {
            emptyMap = kotlin.collections.MapsKt.emptyMap();
        } else {
            emptyMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(configByCurrency.size()));
            java.util.Iterator<T> it = configByCurrency.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.Object key = entry.getKey();
                java.util.Map map = (java.util.Map) entry.getValue();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
                for (java.util.Map.Entry entry2 : map.entrySet()) {
                    linkedHashMap.put(entry2.getKey(), this.getHighSpeedVideoFpsRanges.map((com.zettle.sdk.core.user.shadow.TransactionConfigEntryShadow) entry2.getValue()));
                }
                emptyMap.put(key, linkedHashMap);
            }
        }
        return companion.invoke((java.util.Map<com.zettle.android.entities.CurrencyId, ? extends java.util.Map<java.lang.String, ? extends com.zettle.android.entities.TransactionConfigEntry>>) emptyMap, longValue, supportedReaders);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionConfigMapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
