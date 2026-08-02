package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u000eR \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/AmountDto;", "", "", "currency", "Ljava/math/BigDecimal;", "amount", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/math/BigDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/AmountDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/AmountDto;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCurrency", "getCurrency$annotations", "()V", "Ljava/math/BigDecimal;", "getAmount", "getAmount$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AmountDto {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto.Companion(null);
    private final java.math.BigDecimal amount;
    private final java.lang.String currency;

    @kotlinx.serialization.SerialName("amount")
    @kotlinx.serialization.Serializable(with = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.serialization.BigDecimalSerializer.class)
    public static /* synthetic */ void getAmount$annotations() {
    }

    @kotlinx.serialization.SerialName("currency")
    public static /* synthetic */ void getCurrency$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/AmountDto$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/AmountDto;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AmountDto(int i, java.lang.String str, java.math.BigDecimal bigDecimal, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto$$serializer.INSTANCE.getDescriptor());
        }
        this.currency = str;
        this.amount = bigDecimal;
    }

    public AmountDto(java.lang.String str, java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.currency = str;
        this.amount = bigDecimal;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.currency);
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.serialization.BigDecimalSerializer.INSTANCE, self.amount);
    }

    public final java.lang.String getCurrency() {
        return this.currency;
    }

    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.currency;
        java.math.BigDecimal bigDecimal = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountDto(currency=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(bigDecimal);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.currency.hashCode() * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto amountDto = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currency, amountDto.currency) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, amountDto.amount);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto copy(java.lang.String currency, java.math.BigDecimal amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto(currency, amount);
    }

    /* renamed from: component2, reason: from getter */
    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCurrency() {
        return this.currency;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto copy$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto amountDto, java.lang.String str, java.math.BigDecimal bigDecimal, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = amountDto.currency;
        }
        if ((i & 2) != 0) {
            bigDecimal = amountDto.amount;
        }
        return amountDto.copy(str, bigDecimal);
    }
}
