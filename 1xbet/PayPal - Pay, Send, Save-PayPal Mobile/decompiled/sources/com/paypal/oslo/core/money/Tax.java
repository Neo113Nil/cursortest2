package com.paypal.oslo.core.money;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\rJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J'\u0010(\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/core/money/Tax;", "Landroid/os/Parcelable;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(D)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "serialisationString", "()Ljava/lang/String;", "other", "compareTo", "(D)I", "component1", "()D", "copy", "(D)Lcom/paypal/oslo/core/money/Tax;", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$money_release", "(Lcom/paypal/oslo/core/money/Tax;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "D", "getValue", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Tax implements android.os.Parcelable {
    private final double value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.money.Tax.Companion INSTANCE = new com.paypal.oslo.core.money.Tax.Companion(null);
    public static final android.os.Parcelable.Creator<com.paypal.oslo.core.money.Tax> CREATOR = new com.paypal.oslo.core.money.Tax.Creator();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/money/Tax$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/money/Tax;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.money.Tax> serializer() {
            return com.paypal.oslo.core.money.Tax$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Tax(double d) {
        this.value = d;
    }

    public /* synthetic */ Tax(int i, double d, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.money.Tax$$serializer.INSTANCE.getDescriptor());
        }
        this.value = d;
    }

    public final double getValue() {
        return this.value;
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Tax(value=");
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
        return (other instanceof com.paypal.oslo.core.money.Tax) && java.lang.Double.compare(this.value, ((com.paypal.oslo.core.money.Tax) other).value) == 0;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.core.money.Tax> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.core.money.Tax[] newArray(int i) {
            return new com.paypal.oslo.core.money.Tax[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.core.money.Tax createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.core.money.Tax(parcel.readDouble());
        }
    }

    public final com.paypal.oslo.core.money.Tax copy(double value) {
        return new com.paypal.oslo.core.money.Tax(value);
    }

    /* renamed from: component1, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public static /* synthetic */ com.paypal.oslo.core.money.Tax copy$default(com.paypal.oslo.core.money.Tax tax, double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = tax.value;
        }
        return tax.copy(d);
    }
}
