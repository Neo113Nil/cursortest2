package com.izettle.android.auth.model.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r"}, d2 = {"Lcom/izettle/android/auth/model/mapper/TransactionConfigMapper;", "Lcom/izettle/android/auth/model/mapper/Mapper;", "Lcom/izettle/android/auth/dto/TransactionConfigDto;", "Lcom/zettle/android/entities/TransactionConfig;", "Lcom/izettle/android/auth/model/mapper/TransactionConfigEntryMapper;", "transactionConfigEntryMapper", "<init>", "(Lcom/izettle/android/auth/model/mapper/TransactionConfigEntryMapper;)V", "from", "inverseMap", "(Lcom/zettle/android/entities/TransactionConfig;)Lcom/izettle/android/auth/dto/TransactionConfigDto;", "map", "(Lcom/izettle/android/auth/dto/TransactionConfigDto;)Lcom/zettle/android/entities/TransactionConfig;", "Lcom/izettle/android/auth/model/mapper/TransactionConfigEntryMapper;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionConfigMapper implements com.izettle.android.auth.model.mapper.Mapper<com.izettle.android.auth.dto.TransactionConfigDto, com.zettle.android.entities.TransactionConfig> {
    private final com.izettle.android.auth.model.mapper.TransactionConfigEntryMapper transactionConfigEntryMapper;

    public TransactionConfigMapper(com.izettle.android.auth.model.mapper.TransactionConfigEntryMapper transactionConfigEntryMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfigEntryMapper, "");
        this.transactionConfigEntryMapper = transactionConfigEntryMapper;
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.izettle.android.auth.dto.TransactionConfigDto> inverseMap(java.lang.Iterable<? extends com.zettle.android.entities.TransactionConfig> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.inverseMap(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.zettle.android.entities.TransactionConfig> map(java.lang.Iterable<? extends com.izettle.android.auth.dto.TransactionConfigDto> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.map(this, iterable);
    }

    public /* synthetic */ TransactionConfigMapper(com.izettle.android.auth.model.mapper.TransactionConfigEntryMapper transactionConfigEntryMapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.izettle.android.auth.model.mapper.TransactionConfigEntryMapper() : transactionConfigEntryMapper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.zettle.android.entities.TransactionConfig map(com.izettle.android.auth.dto.TransactionConfigDto from) {
        java.util.LinkedHashMap emptyMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.TransactionConfig.Companion companion = com.zettle.android.entities.TransactionConfig.INSTANCE;
        java.lang.Long paymentSessionMaxIdleTimeMs = from.getPaymentSessionMaxIdleTimeMs();
        long longValue = paymentSessionMaxIdleTimeMs != null ? paymentSessionMaxIdleTimeMs.longValue() : 0L;
        java.util.Set<java.lang.String> supportedReaders = from.getSupportedReaders();
        if (supportedReaders == null) {
            supportedReaders = kotlin.collections.SetsKt.emptySet();
        }
        java.util.Map<com.zettle.android.entities.CurrencyId, java.util.Map<java.lang.String, com.izettle.android.auth.dto.TransactionConfigEntryDto>> configByCurrency = from.getConfigByCurrency();
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
                    linkedHashMap.put(entry2.getKey(), this.transactionConfigEntryMapper.map((com.izettle.android.auth.dto.TransactionConfigEntryDto) entry2.getValue()));
                }
                emptyMap.put(key, linkedHashMap);
            }
        }
        return companion.invoke((java.util.Map<com.zettle.android.entities.CurrencyId, ? extends java.util.Map<java.lang.String, ? extends com.zettle.android.entities.TransactionConfigEntry>>) emptyMap, longValue, supportedReaders);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.izettle.android.auth.dto.TransactionConfigDto inverseMap(com.zettle.android.entities.TransactionConfig from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        long paymentSessionMaxIdleTimeMs = from.getPaymentSessionMaxIdleTimeMs();
        java.util.Set<java.lang.String> supportedReaders = from.getSupportedReaders();
        java.util.Map<com.zettle.android.entities.CurrencyId, java.util.Map<java.lang.String, com.zettle.android.entities.TransactionConfigEntry>> configByCurrency = from.getConfigByCurrency();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(configByCurrency.size()));
        java.util.Iterator<T> it = configByCurrency.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.util.Map map = (java.util.Map) entry.getValue();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), this.transactionConfigEntryMapper.inverseMap((com.zettle.android.entities.TransactionConfigEntry) entry2.getValue()));
            }
            linkedHashMap.put(key, linkedHashMap2);
        }
        return new com.izettle.android.auth.dto.TransactionConfigDto(linkedHashMap, java.lang.Long.valueOf(paymentSessionMaxIdleTimeMs), supportedReaders);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionConfigMapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
