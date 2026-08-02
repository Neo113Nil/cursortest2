package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/PaymentMethod;", "", "", "id", "", "name", "maskedNumber", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/PaymentMethodType;", "type", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/autoreload/PaymentMethodType;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/feature/balance/domain/model/autoreload/PaymentMethodType;", "copy", "(JLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/autoreload/PaymentMethodType;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/PaymentMethod;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "getId", "Ljava/lang/String;", "getName", "getMaskedNumber", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/PaymentMethodType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentMethod {
    public static final int $stable = 0;
    private final long id;
    private final java.lang.String maskedNumber;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType type;

    public PaymentMethod(long j, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType paymentMethodType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodType, "");
        this.id = j;
        this.name = str;
        this.maskedNumber = str2;
        this.type = paymentMethodType;
    }

    public final long getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getMaskedNumber() {
        return this.maskedNumber;
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        long j = this.id;
        java.lang.String str = this.name;
        java.lang.String str2 = this.maskedNumber;
        com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType paymentMethodType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentMethod(id=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str);
        sb.append(", maskedNumber=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(paymentMethodType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.maskedNumber.hashCode()) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethod)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethod paymentMethod = (com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethod) other;
        return this.id == paymentMethod.id && kotlin.jvm.internal.Intrinsics.areEqual(this.name, paymentMethod.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedNumber, paymentMethod.maskedNumber) && this.type == paymentMethod.type;
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethod copy(long id, java.lang.String name2, java.lang.String maskedNumber, com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethod(id, name2, maskedNumber, type);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMaskedNumber() {
        return this.maskedNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethod copy$default(com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethod paymentMethod, long j, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType paymentMethodType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = paymentMethod.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = paymentMethod.name;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = paymentMethod.maskedNumber;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            paymentMethodType = paymentMethod.type;
        }
        return paymentMethod.copy(j2, str3, str4, paymentMethodType);
    }
}
