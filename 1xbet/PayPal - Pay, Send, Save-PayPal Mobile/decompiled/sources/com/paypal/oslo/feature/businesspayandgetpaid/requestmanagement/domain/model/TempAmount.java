package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;", "", "Ljava/math/BigDecimal;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "currencyCode", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/math/BigDecimal;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/math/BigDecimal;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/math/BigDecimal;", "getValue", "getValue$annotations", "()V", "Ljava/lang/String;", "getCurrencyCode", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class TempAmount {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount.Companion(null);
    private final java.lang.String currencyCode;
    private final java.math.BigDecimal value;

    @kotlinx.serialization.Serializable(with = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.serialization.BigDecimalSerializer.class)
    public static /* synthetic */ void getValue$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TempAmount(int i, java.math.BigDecimal bigDecimal, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE.getDescriptor());
        }
        this.value = bigDecimal;
        this.currencyCode = str;
    }

    public TempAmount(java.math.BigDecimal bigDecimal, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.value = bigDecimal;
        this.currencyCode = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.serialization.BigDecimalSerializer.INSTANCE, self.value);
        output.encodeStringElement(serialDesc, 1, self.currencyCode);
    }

    public final java.math.BigDecimal getValue() {
        return this.value;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String toString() {
        java.math.BigDecimal bigDecimal = this.value;
        java.lang.String str = this.currencyCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TempAmount(value=");
        sb.append(bigDecimal);
        sb.append(", currencyCode=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.value, tempAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, tempAmount.currencyCode);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount copy(java.math.BigDecimal value, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount(value, currencyCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.math.BigDecimal getValue() {
        return this.value;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount, java.math.BigDecimal bigDecimal, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = tempAmount.value;
        }
        if ((i & 2) != 0) {
            str = tempAmount.currencyCode;
        }
        return tempAmount.copy(bigDecimal, str);
    }
}
