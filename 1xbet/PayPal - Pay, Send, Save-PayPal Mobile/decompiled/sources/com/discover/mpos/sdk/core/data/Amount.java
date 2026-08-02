package com.discover.mpos.sdk.core.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000e"}, d2 = {"Lcom/discover/mpos/sdk/core/data/Amount;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/util/Currency;", "currency", "<init>", "(DLjava/util/Currency;)V", "", "emvValue", "([BLjava/util/Currency;)V", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;Ljava/util/Currency;)V", "component1", "()Ljava/math/BigDecimal;", "component2", "()Ljava/util/Currency;", "copy", "(Ljava/math/BigDecimal;Ljava/util/Currency;)Lcom/discover/mpos/sdk/core/data/Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "getEmvFormattedAmount", "(Ljava/util/Currency;)[B", "", "hashCode", "()I", "valueToCompare", "isEqualTo", "(D)Z", "", "toString", "()Ljava/lang/String;", "Ljava/util/Currency;", "getCurrency", "Ljava/math/BigDecimal;", "getValue", "Companion"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class Amount {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.discover.mpos.sdk.core.data.Amount.Companion INSTANCE = new com.discover.mpos.sdk.core.data.Amount.Companion(null);
    private static final java.util.Currency defaultCurrency = java.util.Currency.getInstance("USD");
    private final java.util.Currency currency;
    private final java.math.BigDecimal value;

    public Amount(java.math.BigDecimal bigDecimal, java.util.Currency currency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        this.value = bigDecimal;
        this.currency = currency;
    }

    public /* synthetic */ Amount(java.math.BigDecimal bigDecimal, java.util.Currency currency, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, (i & 2) != 0 ? defaultCurrency : currency);
    }

    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    public final java.math.BigDecimal getValue() {
        return this.value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Amount(double d, java.util.Currency currency) {
        this(java.math.BigDecimal.valueOf(d), currency);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
    }

    public /* synthetic */ Amount(double d, java.util.Currency currency, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? defaultCurrency : currency);
    }

    public /* synthetic */ Amount(byte[] bArr, java.util.Currency currency, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? defaultCurrency : currency);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Amount(byte[] bArr, java.util.Currency currency) {
        this(com.discover.mpos.sdk.core.data.Amount.Companion.access$getValue(INSTANCE, bArr, currency), (java.util.Currency) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
    }

    public static /* synthetic */ byte[] getEmvFormattedAmount$default(com.discover.mpos.sdk.core.data.Amount amount, java.util.Currency currency, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currency = amount.currency;
        }
        return amount.getEmvFormattedAmount(currency);
    }

    public final byte[] getEmvFormattedAmount(java.util.Currency currency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        return com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toByteArray(this.value, 6, currency.getDefaultFractionDigits());
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(getEmvFormattedAmount(defaultCurrency));
    }

    public final boolean isEqualTo(double valueToCompare) {
        return this.value.doubleValue() == valueToCompare;
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0004H\u0003R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discover/mpos/sdk/core/data/Amount$Companion;", "", "()V", "defaultCurrency", "Ljava/util/Currency;", "kotlin.jvm.PlatformType", "getValue", "", "emvValue", "", "currency", "mpos-sdk-core_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ double access$getValue(com.discover.mpos.sdk.core.data.Amount.Companion companion, byte[] bArr, java.util.Currency currency) {
            if (bArr != null) {
                return com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toDouble(bArr, currency.getDefaultFractionDigits());
            }
            return 0.0d;
        }
    }

    public final int hashCode() {
        java.math.BigDecimal bigDecimal = this.value;
        int hashCode = bigDecimal != null ? bigDecimal.hashCode() : 0;
        java.util.Currency currency = this.currency;
        return (hashCode * 31) + (currency != null ? currency.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.core.data.Amount)) {
            return false;
        }
        com.discover.mpos.sdk.core.data.Amount amount = (com.discover.mpos.sdk.core.data.Amount) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, amount.currency);
    }

    public final com.discover.mpos.sdk.core.data.Amount copy(java.math.BigDecimal value, java.util.Currency currency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        return new com.discover.mpos.sdk.core.data.Amount(value, currency);
    }

    /* renamed from: component2, reason: from getter */
    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component1, reason: from getter */
    public final java.math.BigDecimal getValue() {
        return this.value;
    }

    public static /* synthetic */ com.discover.mpos.sdk.core.data.Amount copy$default(com.discover.mpos.sdk.core.data.Amount amount, java.math.BigDecimal bigDecimal, java.util.Currency currency, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = amount.value;
        }
        if ((i & 2) != 0) {
            currency = amount.currency;
        }
        return amount.copy(bigDecimal, currency);
    }
}
