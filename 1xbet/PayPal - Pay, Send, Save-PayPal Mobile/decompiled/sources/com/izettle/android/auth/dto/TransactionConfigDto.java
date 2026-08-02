package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BI\u0012\"\b\u0001\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R4\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/izettle/android/auth/dto/TransactionConfigDto;", "", "", "Lcom/zettle/android/entities/CurrencyId;", "", "Lcom/izettle/android/auth/dto/TransactionConfigEntryDto;", "configByCurrency", "", "paymentSessionMaxIdleTimeMs", "", "supportedReaders", "<init>", "(Ljava/util/Map;Ljava/lang/Long;Ljava/util/Set;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Map;", "getConfigByCurrency", "()Ljava/util/Map;", "Ljava/lang/Long;", "getPaymentSessionMaxIdleTimeMs", "()Ljava/lang/Long;", "Ljava/util/Set;", "getSupportedReaders", "()Ljava/util/Set;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionConfigDto {

    @com.izettle.android.serialization.annotations.JsonSerialize("CONFIG_BY_CURRENCY")
    private final java.util.Map<com.zettle.android.entities.CurrencyId, java.util.Map<java.lang.String, com.izettle.android.auth.dto.TransactionConfigEntryDto>> configByCurrency;

    @com.izettle.android.serialization.annotations.JsonSerialize("PAYMENT_SESSION_MAX_IDLE_TIME_MS")
    private final java.lang.Long paymentSessionMaxIdleTimeMs;

    @com.izettle.android.serialization.annotations.JsonSerialize("SUPPORTED_READERS")
    private final java.util.Set<java.lang.String> supportedReaders;

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionConfigDto(@com.izettle.android.serialization.annotations.JsonDeserialize("CONFIG_BY_CURRENCY") java.util.Map<com.zettle.android.entities.CurrencyId, ? extends java.util.Map<java.lang.String, com.izettle.android.auth.dto.TransactionConfigEntryDto>> map, @com.izettle.android.serialization.annotations.JsonDeserialize("PAYMENT_SESSION_MAX_IDLE_TIME_MS") java.lang.Long l, @com.izettle.android.serialization.annotations.JsonDeserialize("SUPPORTED_READERS") java.util.Set<java.lang.String> set) {
        this.configByCurrency = map;
        this.paymentSessionMaxIdleTimeMs = l;
        this.supportedReaders = set;
    }

    public final java.util.Map<com.zettle.android.entities.CurrencyId, java.util.Map<java.lang.String, com.izettle.android.auth.dto.TransactionConfigEntryDto>> getConfigByCurrency() {
        return this.configByCurrency;
    }

    public final java.lang.Long getPaymentSessionMaxIdleTimeMs() {
        return this.paymentSessionMaxIdleTimeMs;
    }

    public final java.util.Set<java.lang.String> getSupportedReaders() {
        return this.supportedReaders;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.izettle.android.auth.dto.TransactionConfigDto)) {
            return false;
        }
        com.izettle.android.auth.dto.TransactionConfigDto transactionConfigDto = (com.izettle.android.auth.dto.TransactionConfigDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(transactionConfigDto.configByCurrency, this.configByCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(transactionConfigDto.paymentSessionMaxIdleTimeMs, this.paymentSessionMaxIdleTimeMs) && kotlin.jvm.internal.Intrinsics.areEqual(transactionConfigDto.supportedReaders, this.supportedReaders);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.configByCurrency, this.paymentSessionMaxIdleTimeMs, this.supportedReaders);
    }
}
