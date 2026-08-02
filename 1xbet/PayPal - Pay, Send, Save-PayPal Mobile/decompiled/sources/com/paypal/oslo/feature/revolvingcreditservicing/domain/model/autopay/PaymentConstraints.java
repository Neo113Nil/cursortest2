package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentAmountOption;", "paymentAmountOptions", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "minimumCustomAmount", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getPaymentAmountOptions", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getMinimumCustomAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PaymentConstraints {
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumCustomAmount;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption> paymentAmountOptions;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints.m18126$r8$lambda$GvqMnOETM2bri0UCyTEFy9ufYU();
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaymentConstraints(int i, java.util.List list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints$$serializer.INSTANCE.getDescriptor());
        }
        this.paymentAmountOptions = list;
        this.minimumCustomAmount = currencyAmount;
    }

    public PaymentConstraints(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption> list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.paymentAmountOptions = list;
        this.minimumCustomAmount = currencyAmount;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.paymentAmountOptions);
        output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, self.minimumCustomAmount);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption> getPaymentAmountOptions() {
        return this.paymentAmountOptions;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMinimumCustomAmount() {
        return this.minimumCustomAmount;
    }

    /* renamed from: $r8$lambda$G-vqMnOETM2bri0UCyTEFy9ufYU, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m18126$r8$lambda$GvqMnOETM2bri0UCyTEFy9ufYU() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption> list = this.paymentAmountOptions;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.minimumCustomAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentConstraints(paymentAmountOptions=");
        sb.append(list);
        sb.append(", minimumCustomAmount=");
        sb.append(currencyAmount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.paymentAmountOptions.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.minimumCustomAmount;
        return (hashCode * 31) + (currencyAmount == null ? 0 : currencyAmount.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAmountOptions, paymentConstraints.paymentAmountOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumCustomAmount, paymentConstraints.minimumCustomAmount);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints copy(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption> paymentAmountOptions, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumCustomAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAmountOptions, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints(paymentAmountOptions, minimumCustomAmount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMinimumCustomAmount() {
        return this.minimumCustomAmount;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption> component1() {
        return this.paymentAmountOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints, java.util.List list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = paymentConstraints.paymentAmountOptions;
        }
        if ((i & 2) != 0) {
            currencyAmount = paymentConstraints.minimumCustomAmount;
        }
        return paymentConstraints.copy(list, currencyAmount);
    }
}
