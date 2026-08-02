package com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000221B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\u0011J\u001d\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J'\u0010-\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidTax;", "Landroid/os/Parcelable;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(D)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Ljava/util/Locale;", "locale", "", "formatAsPercent", "(Ljava/util/Locale;)Ljava/lang/String;", "formatAsPercentWithSymbol", "()Ljava/lang/String;", "serialisationString", "other", "compareTo", "(D)I", "component1", "()D", "copy", "(D)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidTax;", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidTax;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "D", "getValue", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class GetPaidTax implements android.os.Parcelable {
    public static final int $stable = 0;
    private final double value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax.Companion(null);
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax> CREATOR = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax.Creator();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidTax$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidTax;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GetPaidTax(double d) {
        this.value = d;
    }

    public /* synthetic */ GetPaidTax(int i, double d, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax$$serializer.INSTANCE.getDescriptor());
        }
        this.value = d;
    }

    public final double getValue() {
        return this.value;
    }

    public static /* synthetic */ java.lang.String formatAsPercent$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax getPaidTax, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return getPaidTax.formatAsPercent(locale);
    }

    public final java.lang.String formatAsPercent(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.#####", new java.text.DecimalFormatSymbols(locale));
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        java.lang.String format = decimalFormat.format(this.value * 100.0d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public final java.lang.String formatAsPercentWithSymbol() {
        java.lang.String formatAsPercent$default = formatAsPercent$default(this, null, 1, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(formatAsPercent$default);
        sb.append("%");
        return sb.toString();
    }

    public final java.lang.String serialisationString() {
        java.lang.String plainString = com.paypal.oslo.core.money.Tax$$ExternalSyntheticBackportWithForwarding0.m(java.math.BigDecimal.valueOf(this.value * 100.0d).setScale(5, java.math.RoundingMode.HALF_UP)).toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        return plainString;
    }

    public final int compareTo(double other) {
        return java.lang.Double.compare(this.value, other);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeDouble(this.value);
    }

    public final java.lang.String toString() {
        double d = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPaidTax(value=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Double.hashCode(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax) && java.lang.Double.compare(this.value, ((com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax) other).value) == 0;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax[] newArray(int i) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax(parcel.readDouble());
        }
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax copy(double value) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax(value);
    }

    /* renamed from: component1, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax copy$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax getPaidTax, double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = getPaidTax.value;
        }
        return getPaidTax.copy(d);
    }
}
