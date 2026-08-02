package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R0\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002j\u0002`\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/android/entities/TransactionConfig;", "", "", "Lcom/zettle/android/entities/CurrencyId;", "", "Lcom/zettle/android/entities/TransactionConfigEntry;", "Lcom/zettle/android/entities/ConfigByCurrency;", "getConfigByCurrency", "()Ljava/util/Map;", "configByCurrency", "", "getPaymentSessionMaxIdleTimeMs", "()J", "paymentSessionMaxIdleTimeMs", "", "getSupportedReaders", "()Ljava/util/Set;", "supportedReaders", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface TransactionConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.android.entities.TransactionConfig.Companion INSTANCE = com.zettle.android.entities.TransactionConfig.Companion.$$INSTANCE;

    java.util.Map<com.zettle.android.entities.CurrencyId, java.util.Map<java.lang.String, com.zettle.android.entities.TransactionConfigEntry>> getConfigByCurrency();

    long getPaymentSessionMaxIdleTimeMs();

    java.util.Set<java.lang.String> getSupportedReaders();

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002@\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002j\u0002`\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJN\u0010\u0010\u001a\u00020\n2\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020\u00072\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00040\bj\u0002`\tH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/android/entities/TransactionConfig$Companion;", "Lkotlin/Function3;", "", "Lcom/zettle/android/entities/CurrencyId;", "", "Lcom/zettle/android/entities/TransactionConfigEntry;", "Lcom/zettle/android/entities/ConfigByCurrency;", "", "", "Lcom/zettle/android/entities/SupportedReaders;", "Lcom/zettle/android/entities/TransactionConfig;", "<init>", "()V", "configByCurrency", "paymentSessionMaxIdleTimeMs", "supportedReaders", "invoke", "(Ljava/util/Map;JLjava/util/Set;)Lcom/zettle/android/entities/TransactionConfig;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements kotlin.jvm.functions.Function3<java.util.Map<com.zettle.android.entities.CurrencyId, ? extends java.util.Map<java.lang.String, ? extends com.zettle.android.entities.TransactionConfigEntry>>, java.lang.Long, java.util.Set<? extends java.lang.String>, com.zettle.android.entities.TransactionConfig> {
        static final /* synthetic */ com.zettle.android.entities.TransactionConfig.Companion $$INSTANCE = new com.zettle.android.entities.TransactionConfig.Companion();

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ com.zettle.android.entities.TransactionConfig invoke(java.util.Map<com.zettle.android.entities.CurrencyId, ? extends java.util.Map<java.lang.String, ? extends com.zettle.android.entities.TransactionConfigEntry>> map, java.lang.Long l, java.util.Set<? extends java.lang.String> set) {
            return invoke(map, l.longValue(), (java.util.Set<java.lang.String>) set);
        }

        public final com.zettle.android.entities.TransactionConfig invoke(java.util.Map<com.zettle.android.entities.CurrencyId, ? extends java.util.Map<java.lang.String, ? extends com.zettle.android.entities.TransactionConfigEntry>> configByCurrency, long paymentSessionMaxIdleTimeMs, java.util.Set<java.lang.String> supportedReaders) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configByCurrency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedReaders, "");
            return new com.zettle.android.entities.TransactionConfigImpl(configByCurrency, paymentSessionMaxIdleTimeMs, supportedReaders);
        }
    }
}
