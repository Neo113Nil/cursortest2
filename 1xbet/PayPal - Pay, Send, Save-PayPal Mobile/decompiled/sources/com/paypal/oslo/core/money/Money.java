package com.paypal.oslo.core.money;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002GHB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0017J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0018H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\r\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J$\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010\r\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b,\u0010'J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010#J\u001d\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b2\u00103J'\u00109\u001a\u0002012\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010#R\u0011\u0010@\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b?\u0010'R\u0011\u0010B\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bA\u0010!R\u0011\u0010C\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\bE\u0010DR\u0011\u0010F\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\bF\u0010D"}, d2 = {"Lcom/paypal/oslo/core/money/Money;", "Landroid/os/Parcelable;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "currencyCode", "<init>", "(JLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "other", "plus", "(Lcom/paypal/oslo/core/money/Money;)Lcom/paypal/oslo/core/money/Money;", "minus", "multiplier", "times", "(I)Lcom/paypal/oslo/core/money/Money;", "", "(D)Lcom/paypal/oslo/core/money/Money;", "", "(F)Lcom/paypal/oslo/core/money/Money;", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)Lcom/paypal/oslo/core/money/Money;", "divisor", "div", "p0", "getHighSpeedVideoFpsRangesFor", "ensureNegative", "()Lcom/paypal/oslo/core/money/Money;", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/paypal/oslo/core/money/Money;", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$money_release", "(Lcom/paypal/oslo/core/money/Money;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "J", "getValue", "Ljava/lang/String;", "getCurrencyCode", "getDefaultFractionDigits", "defaultFractionDigits", "getScale", "scale", "isNegative", "()Z", "isPositive", "isZero", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Money implements android.os.Parcelable {
    private final java.lang.String currencyCode;
    private final long value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.money.Money.Companion INSTANCE = new com.paypal.oslo.core.money.Money.Companion(null);
    public static final android.os.Parcelable.Creator<com.paypal.oslo.core.money.Money> CREATOR = new com.paypal.oslo.core.money.Money.Creator();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ Money(int i, long j, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.core.money.Money$$serializer.INSTANCE.getDescriptor());
        }
        this.value = j;
        this.currencyCode = str;
        if (!com.paypal.oslo.core.money.Money.Companion.access$isValidCurrencyCode(INSTANCE, str)) {
            throw new java.lang.IllegalArgumentException("Invalid ISO-4217 currency code: ".concat(java.lang.String.valueOf(str)).toString());
        }
    }

    public Money(long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.value = j;
        this.currencyCode = str;
        if (!com.paypal.oslo.core.money.Money.Companion.access$isValidCurrencyCode(INSTANCE, str)) {
            throw new java.lang.IllegalArgumentException("Invalid ISO-4217 currency code: ".concat(java.lang.String.valueOf(str)).toString());
        }
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$money_release(com.paypal.oslo.core.money.Money self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.value);
        output.encodeStringElement(serialDesc, 1, self.currencyCode);
    }

    public final long getValue() {
        return this.value;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final int getDefaultFractionDigits() {
        return java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits();
    }

    public final long getScale() {
        int defaultFractionDigits = getDefaultFractionDigits();
        if (defaultFractionDigits == 0) {
            return 1L;
        }
        if (defaultFractionDigits == 1) {
            return 10L;
        }
        if (defaultFractionDigits == 2) {
            return 100L;
        }
        if (defaultFractionDigits != 3) {
            return defaultFractionDigits != 4 ? 100L : 10000L;
        }
        return 1000L;
    }

    public final boolean isNegative() {
        return this.value < 0;
    }

    public final boolean isPositive() {
        return this.value > 0;
    }

    public final boolean isZero() {
        return this.value == 0;
    }

    public final com.paypal.oslo.core.money.Money plus(com.paypal.oslo.core.money.Money other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, other.currencyCode)) {
            throw new java.lang.IllegalArgumentException("Cannot convert between different currency types".toString());
        }
        return new com.paypal.oslo.core.money.Money(new java.math.BigDecimal(this.value).add(new java.math.BigDecimal(other.value)).longValueExact(), this.currencyCode);
    }

    public final com.paypal.oslo.core.money.Money minus(com.paypal.oslo.core.money.Money other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, other.currencyCode)) {
            throw new java.lang.IllegalArgumentException("Cannot convert between different currency types".toString());
        }
        return new com.paypal.oslo.core.money.Money(new java.math.BigDecimal(this.value).subtract(new java.math.BigDecimal(other.value)).longValueExact(), this.currencyCode);
    }

    public final com.paypal.oslo.core.money.Money times(int multiplier) {
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(multiplier);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        return getHighSpeedVideoFpsRangesFor(valueOf);
    }

    public final com.paypal.oslo.core.money.Money times(double multiplier) {
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(multiplier);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        return getHighSpeedVideoFpsRangesFor(valueOf);
    }

    public final com.paypal.oslo.core.money.Money times(float multiplier) {
        return times(multiplier);
    }

    public final com.paypal.oslo.core.money.Money times(java.math.BigDecimal multiplier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiplier, "");
        return getHighSpeedVideoFpsRangesFor(multiplier);
    }

    public final com.paypal.oslo.core.money.Money div(double divisor) {
        return new com.paypal.oslo.core.money.Money(new java.math.BigDecimal(this.value).divide(java.math.BigDecimal.valueOf(divisor), 0, java.math.RoundingMode.HALF_UP).longValue(), this.currencyCode);
    }

    private final com.paypal.oslo.core.money.Money getHighSpeedVideoFpsRangesFor(java.math.BigDecimal p0) {
        return new com.paypal.oslo.core.money.Money(new java.math.BigDecimal(this.value).multiply(p0).setScale(0, java.math.RoundingMode.HALF_UP).longValue(), this.currencyCode);
    }

    public final com.paypal.oslo.core.money.Money ensureNegative() {
        return isPositive() ? new com.paypal.oslo.core.money.Money(-this.value, this.currencyCode) : this;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/money/Money$Companion;", "", "<init>", "()V", "", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Z", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/money/Money;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ boolean access$isValidCurrencyCode(com.paypal.oslo.core.money.Money.Companion companion, java.lang.String str) {
            return getHighSpeedVideoFpsRanges(str);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.money.Money> serializer() {
            return com.paypal.oslo.core.money.Money$$serializer.INSTANCE;
        }

        private static boolean getHighSpeedVideoFpsRanges(java.lang.String p0) {
            try {
                java.util.Currency.getInstance(p0);
                return true;
            } catch (java.lang.IllegalArgumentException unused) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.money.LoggerKt.log, "Invalid currency code", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", p0)), null, 4, null);
                return false;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeLong(this.value);
        dest.writeString(this.currencyCode);
    }

    public final java.lang.String toString() {
        long j = this.value;
        java.lang.String str = this.currencyCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Money(value=");
        sb.append(j);
        sb.append(", currencyCode=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.value) * 31) + this.currencyCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.money.Money)) {
            return false;
        }
        com.paypal.oslo.core.money.Money money = (com.paypal.oslo.core.money.Money) other;
        return this.value == money.value && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, money.currencyCode);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.core.money.Money> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.core.money.Money[] newArray(int i) {
            return new com.paypal.oslo.core.money.Money[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.core.money.Money createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.core.money.Money(parcel.readLong(), parcel.readString());
        }
    }

    public final com.paypal.oslo.core.money.Money copy(long value, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.core.money.Money(value, currencyCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public static /* synthetic */ com.paypal.oslo.core.money.Money copy$default(com.paypal.oslo.core.money.Money money, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = money.value;
        }
        if ((i & 2) != 0) {
            str = money.currencyCode;
        }
        return money.copy(j, str);
    }
}
