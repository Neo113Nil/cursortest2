package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00040\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002j\u0002`\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00040\nj\u0002`\u000bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JT\u0010\u0015\u001a\u00020\u00002$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002j\u0002`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00040\nj\u0002`\u000bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R6\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002j\u0002`\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0012R$\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00040\nj\u0002`\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/zettle/android/entities/TransactionConfigImpl;", "Lcom/zettle/android/entities/TransactionConfig;", "", "Lcom/zettle/android/entities/CurrencyId;", "", "Lcom/zettle/android/entities/TransactionConfigEntry;", "Lcom/zettle/android/entities/ConfigByCurrency;", "configByCurrency", "", "paymentSessionMaxIdleTimeMs", "", "Lcom/zettle/android/entities/SupportedReaders;", "supportedReaders", "<init>", "(Ljava/util/Map;JLjava/util/Set;)V", "component1", "()Ljava/util/Map;", "component2", "()J", "component3", "()Ljava/util/Set;", "copy", "(Ljava/util/Map;JLjava/util/Set;)Lcom/zettle/android/entities/TransactionConfigImpl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getConfigByCurrency", "J", "getPaymentSessionMaxIdleTimeMs", "Ljava/util/Set;", "getSupportedReaders"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class TransactionConfigImpl implements com.zettle.android.entities.TransactionConfig {
    private final java.util.Map<com.zettle.android.entities.CurrencyId, java.util.Map<java.lang.String, com.zettle.android.entities.TransactionConfigEntry>> configByCurrency;
    private final long paymentSessionMaxIdleTimeMs;
    private final java.util.Set<java.lang.String> supportedReaders;

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionConfigImpl(java.util.Map<com.zettle.android.entities.CurrencyId, ? extends java.util.Map<java.lang.String, ? extends com.zettle.android.entities.TransactionConfigEntry>> map, long j, java.util.Set<java.lang.String> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.configByCurrency = map;
        this.paymentSessionMaxIdleTimeMs = j;
        this.supportedReaders = set;
    }

    @Override // com.zettle.android.entities.TransactionConfig
    public final java.util.Map<com.zettle.android.entities.CurrencyId, java.util.Map<java.lang.String, com.zettle.android.entities.TransactionConfigEntry>> getConfigByCurrency() {
        return this.configByCurrency;
    }

    @Override // com.zettle.android.entities.TransactionConfig
    public final long getPaymentSessionMaxIdleTimeMs() {
        return this.paymentSessionMaxIdleTimeMs;
    }

    @Override // com.zettle.android.entities.TransactionConfig
    public final java.util.Set<java.lang.String> getSupportedReaders() {
        return this.supportedReaders;
    }

    public final java.lang.String toString() {
        java.util.Map<com.zettle.android.entities.CurrencyId, java.util.Map<java.lang.String, com.zettle.android.entities.TransactionConfigEntry>> map = this.configByCurrency;
        long j = this.paymentSessionMaxIdleTimeMs;
        java.util.Set<java.lang.String> set = this.supportedReaders;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionConfigImpl(configByCurrency=");
        sb.append(map);
        sb.append(", paymentSessionMaxIdleTimeMs=");
        sb.append(j);
        sb.append(", supportedReaders=");
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.configByCurrency.hashCode() * 31) + java.lang.Long.hashCode(this.paymentSessionMaxIdleTimeMs)) * 31) + this.supportedReaders.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.android.entities.TransactionConfigImpl)) {
            return false;
        }
        com.zettle.android.entities.TransactionConfigImpl transactionConfigImpl = (com.zettle.android.entities.TransactionConfigImpl) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.configByCurrency, transactionConfigImpl.configByCurrency) && this.paymentSessionMaxIdleTimeMs == transactionConfigImpl.paymentSessionMaxIdleTimeMs && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedReaders, transactionConfigImpl.supportedReaders);
    }

    public final com.zettle.android.entities.TransactionConfigImpl copy(java.util.Map<com.zettle.android.entities.CurrencyId, ? extends java.util.Map<java.lang.String, ? extends com.zettle.android.entities.TransactionConfigEntry>> configByCurrency, long paymentSessionMaxIdleTimeMs, java.util.Set<java.lang.String> supportedReaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configByCurrency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedReaders, "");
        return new com.zettle.android.entities.TransactionConfigImpl(configByCurrency, paymentSessionMaxIdleTimeMs, supportedReaders);
    }

    public final java.util.Set<java.lang.String> component3() {
        return this.supportedReaders;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPaymentSessionMaxIdleTimeMs() {
        return this.paymentSessionMaxIdleTimeMs;
    }

    public final java.util.Map<com.zettle.android.entities.CurrencyId, java.util.Map<java.lang.String, com.zettle.android.entities.TransactionConfigEntry>> component1() {
        return this.configByCurrency;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.zettle.android.entities.TransactionConfigImpl copy$default(com.zettle.android.entities.TransactionConfigImpl transactionConfigImpl, java.util.Map map, long j, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = transactionConfigImpl.configByCurrency;
        }
        if ((i & 2) != 0) {
            j = transactionConfigImpl.paymentSessionMaxIdleTimeMs;
        }
        if ((i & 4) != 0) {
            set = transactionConfigImpl.supportedReaders;
        }
        return transactionConfigImpl.copy(map, j, set);
    }
}
