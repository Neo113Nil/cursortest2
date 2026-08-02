package com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u0000 M2\u00020\u0001:\u0002MNB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0013J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001eH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001fJ\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020 H\u0086\u0002¢\u0006\u0004\b\u001c\u0010!J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\"H\u0086\u0002¢\u0006\u0004\b\u001c\u0010#J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u001eH\u0086\u0002¢\u0006\u0004\b%\u0010\u001fJ\u0017\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010#J\u0018\u0010(\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\u000eJ$\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u0010\u0017\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b5\u00100J\u0010\u00106\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b6\u0010\u000eJ\u001d\u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\b¢\u0006\u0004\b;\u0010<J'\u0010B\u001a\u00020:2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010\u000eR\u0014\u0010H\u001a\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010+R\u0011\u0010I\u001a\u0002028G¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010K\u001a\u0002028G¢\u0006\u0006\u001a\u0004\bK\u0010JR\u0011\u0010L\u001a\u0002028G¢\u0006\u0006\u001a\u0004\bL\u0010J"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "Landroid/os/Parcelable;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "currencyCode", "<init>", "(JLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCurrencySymbol", "()Ljava/lang/String;", "formatAsNumberUnsigned", "Ljava/util/Locale;", "locale", "formatAsNumberWithSeparators", "(Ljava/util/Locale;)Ljava/lang/String;", "formatAsDecimalNumber", "formatWithSymbol", "formatAsNegativeNumberWithSymbol", "other", "plus", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "minus", "multiplier", "times", "(I)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "", "(D)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "", "(F)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "divisor", "div", "p0", "getHighSpeedVideoSizes", "compareTo", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;)I", "component1", "()J", "component2", "copy", "(JLjava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "J", "getValue", "Ljava/lang/String;", "getCurrencyCode", "getHighResolutionOutputSizeshNQ4ISI", "isNegative", "()Z", "isPositive", "isZero", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class GetPaidMoney implements android.os.Parcelable {
    public static final int $stable = 0;
    private final java.lang.String currencyCode;
    private final long value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.Companion(null);
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney> CREATOR = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.Creator();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ GetPaidMoney(int i, long j, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney$$serializer.INSTANCE.getDescriptor());
        }
        this.value = j;
        this.currencyCode = str;
        if (!com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.Companion.access$isValidCurrencyCode(INSTANCE, str)) {
            throw new java.lang.IllegalArgumentException("Invalid ISO-4217 currency code: ".concat(java.lang.String.valueOf(str)).toString());
        }
    }

    public GetPaidMoney(long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.value = j;
        this.currencyCode = str;
        if (!com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.Companion.access$isValidCurrencyCode(INSTANCE, str)) {
            throw new java.lang.IllegalArgumentException("Invalid ISO-4217 currency code: ".concat(java.lang.String.valueOf(str)).toString());
        }
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.value);
        output.encodeStringElement(serialDesc, 1, self.currencyCode);
    }

    public final long getValue() {
        return this.value;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getCurrencySymbol() {
        java.lang.String symbol = java.util.Currency.getInstance(this.currencyCode).getSymbol();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(symbol, "");
        return symbol;
    }

    public final java.lang.String formatAsNumberUnsigned() {
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.Math.abs(this.value));
        int length = valueOf.length() - java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits();
        if (java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits() == 0 || length == valueOf.length()) {
            return valueOf;
        }
        if (length > 0) {
            return com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.access$addCharAtIndex(valueOf, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, length);
        }
        java.lang.String repeat = kotlin.text.StringsKt.repeat("0", java.lang.Math.abs(length));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("0.");
        sb.append(repeat);
        sb.append(valueOf);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String formatAsNumberWithSeparators$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return getPaidMoney.formatAsNumberWithSeparators(locale);
    }

    public final java.lang.String formatAsNumberWithSeparators(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.text.NumberFormat decimalFormat = java.text.DecimalFormat.getInstance(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decimalFormat, "");
        java.text.DecimalFormat decimalFormat2 = (java.text.DecimalFormat) decimalFormat;
        decimalFormat2.setDecimalFormatSymbols(new java.text.DecimalFormatSymbols(locale));
        decimalFormat2.setMinimumFractionDigits(java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits());
        decimalFormat2.setMaximumFractionDigits(java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits());
        decimalFormat2.setRoundingMode(java.math.RoundingMode.HALF_UP);
        java.lang.String format = decimalFormat2.format(new java.math.BigDecimal(this.value).divide(new java.math.BigDecimal(getHighResolutionOutputSizeshNQ4ISI()), java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits(), java.math.RoundingMode.HALF_UP));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public final java.lang.String formatAsDecimalNumber() {
        java.lang.String valueOf = java.lang.String.valueOf(this.value);
        boolean z = this.value < 0;
        if (z) {
            valueOf = valueOf.substring(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        }
        int length = valueOf.length() - java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits();
        if (java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits() != 0 && length != valueOf.length()) {
            if (length > 0) {
                valueOf = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.access$addCharAtIndex(valueOf, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, length);
            } else {
                java.lang.String repeat = kotlin.text.StringsKt.repeat("0", java.lang.Math.abs(length));
                java.lang.StringBuilder sb = new java.lang.StringBuilder("0.");
                sb.append(repeat);
                sb.append(valueOf);
                valueOf = sb.toString();
            }
        }
        return z ? "-".concat(java.lang.String.valueOf(valueOf)) : valueOf;
    }

    public static /* synthetic */ java.lang.String formatWithSymbol$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return getPaidMoney.formatWithSymbol(locale);
    }

    public final java.lang.String formatWithSymbol(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(java.util.Currency.getInstance(this.currencyCode));
        currencyInstance.setMinimumFractionDigits(java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits());
        currencyInstance.setMaximumFractionDigits(java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits());
        java.lang.String format = currencyInstance.format(new java.math.BigDecimal(this.value).divide(new java.math.BigDecimal(getHighResolutionOutputSizeshNQ4ISI()), java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits(), java.math.RoundingMode.HALF_UP));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static /* synthetic */ java.lang.String formatAsNegativeNumberWithSymbol$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return getPaidMoney.formatAsNegativeNumberWithSymbol(locale);
    }

    public final java.lang.String formatAsNegativeNumberWithSymbol(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(-this.value, this.currencyCode).formatWithSymbol(locale);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney plus(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, other.currencyCode)) {
            throw new java.lang.IllegalArgumentException("Cannot convert between different currency types".toString());
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(new java.math.BigDecimal(this.value).add(new java.math.BigDecimal(other.value)).longValueExact(), this.currencyCode);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney minus(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, other.currencyCode)) {
            throw new java.lang.IllegalArgumentException("Cannot convert between different currency types".toString());
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(new java.math.BigDecimal(this.value).subtract(new java.math.BigDecimal(other.value)).longValueExact(), this.currencyCode);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney times(int multiplier) {
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(multiplier);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        return getHighSpeedVideoSizes(valueOf);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney times(double multiplier) {
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(multiplier);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        return getHighSpeedVideoSizes(valueOf);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney times(float multiplier) {
        return times(multiplier);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney times(java.math.BigDecimal multiplier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiplier, "");
        return getHighSpeedVideoSizes(multiplier);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney div(double divisor) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(new java.math.BigDecimal(this.value).divide(java.math.BigDecimal.valueOf(divisor), 0, java.math.RoundingMode.HALF_UP).longValue(), this.currencyCode);
    }

    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getHighSpeedVideoSizes(java.math.BigDecimal p0) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(new java.math.BigDecimal(this.value).multiply(p0).setScale(0, java.math.RoundingMode.HALF_UP).longValue(), this.currencyCode);
    }

    public final int compareTo(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, other)) {
            return 0;
        }
        int compareTo = this.currencyCode.compareTo(other.currencyCode);
        return compareTo != 0 ? compareTo : kotlin.jvm.internal.Intrinsics.compare(this.value, other.value);
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

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney$Companion;", "", "<init>", "()V", "", "p0", "", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Z", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ boolean access$isValidCurrencyCode(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.Companion companion, java.lang.String str) {
            return getHighSpeedVideoSizes(str);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney$$serializer.INSTANCE;
        }

        private static boolean getHighSpeedVideoSizes(java.lang.String p0) {
            try {
                java.util.Currency.getInstance(p0);
                return true;
            } catch (java.lang.IllegalArgumentException unused) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "Invalid currency code", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", p0)), null, 4, null);
                return false;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final long getHighResolutionOutputSizeshNQ4ISI() {
        int defaultFractionDigits = java.util.Currency.getInstance(this.currencyCode).getDefaultFractionDigits();
        if (defaultFractionDigits == 0) {
            return 1L;
        }
        if (defaultFractionDigits != 1) {
            return (defaultFractionDigits == 2 || defaultFractionDigits != 3) ? 100L : 1000L;
        }
        return 10L;
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPaidMoney(value=");
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
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = (com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney) other;
        return this.value == getPaidMoney.value && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, getPaidMoney.currencyCode);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney[] newArray(int i) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(parcel.readLong(), parcel.readString());
        }
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney copy(long value, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(value, currencyCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney copy$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = getPaidMoney.value;
        }
        if ((i & 2) != 0) {
            str = getPaidMoney.currencyCode;
        }
        return getPaidMoney.copy(j, str);
    }
}
