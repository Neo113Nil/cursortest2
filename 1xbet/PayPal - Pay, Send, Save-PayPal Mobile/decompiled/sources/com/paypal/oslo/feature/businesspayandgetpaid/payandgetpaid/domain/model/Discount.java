package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Amount", "Percentage", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Amount;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Percentage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class Discount {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.$r8$lambda$fMvOalsnq3OTZzVa8HCCpAjqd0A();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Discount() {
    }

    public /* synthetic */ Discount(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Amount;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "amount", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Amount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Amount;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "getAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Amount extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount.Companion(null);
        private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney amount;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Amount$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Amount;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount> serializer() {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount$Amount$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Amount(int i, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount$Amount$$serializer.INSTANCE.getDescriptor());
            }
            this.amount = getPaidMoney;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Amount(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidMoney, "");
            this.amount = getPaidMoney;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney$$serializer.INSTANCE, self.amount);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(amount=");
            sb.append(getPaidMoney);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount) other).amount);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount copy(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount amount, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                getPaidMoney = amount.amount;
            }
            return amount.copy(getPaidMoney);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Percentage;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount;", "Ljava/math/BigDecimal;", "percentage", "<init>", "(Ljava/math/BigDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/math/BigDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/math/BigDecimal;", "copy", "(Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Percentage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Percentage;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/math/BigDecimal;", "getPercentage", "getPercentage$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Percentage extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage.Companion(null);
        private final java.math.BigDecimal percentage;

        @kotlinx.serialization.Serializable(with = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.serialization.BigDecimalSerializer.class)
        public static /* synthetic */ void getPercentage$annotations() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Percentage$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount$Percentage;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage> serializer() {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount$Percentage$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Percentage(int i, java.math.BigDecimal bigDecimal, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount$Percentage$$serializer.INSTANCE.getDescriptor());
            }
            this.percentage = bigDecimal;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Percentage(java.math.BigDecimal bigDecimal) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.percentage = bigDecimal;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.serialization.BigDecimalSerializer.INSTANCE, self.percentage);
        }

        public final java.math.BigDecimal getPercentage() {
            return this.percentage;
        }

        public final java.lang.String toString() {
            java.math.BigDecimal bigDecimal = this.percentage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Percentage(percentage=");
            sb.append(bigDecimal);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.percentage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.percentage, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage) other).percentage);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage copy(java.math.BigDecimal percentage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentage, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage(percentage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.math.BigDecimal getPercentage() {
            return this.percentage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage percentage, java.math.BigDecimal bigDecimal, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = percentage.percentage;
            }
            return percentage.copy(bigDecimal);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$fMvOalsnq3OTZzVa8HCCpAjqd0A() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount$Amount$$serializer.INSTANCE, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount$Percentage$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ Discount(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
