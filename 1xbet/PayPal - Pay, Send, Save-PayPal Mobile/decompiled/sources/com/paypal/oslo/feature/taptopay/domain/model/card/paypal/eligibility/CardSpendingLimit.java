package com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardSpendingLimit;", "Landroid/os/Parcelable;", "", "currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardSpendingLimit;", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$taptopay_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardSpendingLimit;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCurrencyCode", "getValue", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CardSpendingLimit implements android.os.Parcelable {
    public static final int $stable = 0;
    private final java.lang.String currencyCode;
    private final java.lang.String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit.Companion(null);
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit> CREATOR = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit.Creator();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardSpendingLimit$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardSpendingLimit;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit> serializer() {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardSpendingLimit(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyCode = str;
        this.value = str2;
    }

    public CardSpendingLimit(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.currencyCode = str;
        this.value = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$taptopay_prodRelease(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.currencyCode);
        output.encodeStringElement(serialDesc, 1, self.value);
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.currencyCode);
        dest.writeString(this.value);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.currencyCode;
        java.lang.String str2 = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardSpendingLimit(currencyCode=");
        sb.append(str);
        sb.append(", value=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit cardSpendingLimit = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, cardSpendingLimit.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, cardSpendingLimit.value);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit[] newArray(int i) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit(parcel.readString(), parcel.readString());
        }
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit copy(java.lang.String currencyCode, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit(currencyCode, value);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit cardSpendingLimit, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardSpendingLimit.currencyCode;
        }
        if ((i & 2) != 0) {
            str2 = cardSpendingLimit.value;
        }
        return cardSpendingLimit.copy(str, str2);
    }
}
