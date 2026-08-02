package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentDelivery;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/TransferSpeed;", "speed", "", "minimumDuration", "maximumDuration", "estimatedArrivalTime", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/TransferSpeed;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/TransferSpeed;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/TransferSpeed;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentDelivery;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/domain/model/TransferSpeed;", "getSpeed", "Ljava/lang/String;", "getMinimumDuration", "getMaximumDuration", "getEstimatedArrivalTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentDelivery {
    public static final int $stable = 0;
    private final java.lang.String estimatedArrivalTime;
    private final java.lang.String maximumDuration;
    private final java.lang.String minimumDuration;
    private final com.paypal.oslo.feature.p2p.domain.model.TransferSpeed speed;

    public PaymentDelivery(com.paypal.oslo.feature.p2p.domain.model.TransferSpeed transferSpeed, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        this.speed = transferSpeed;
        this.minimumDuration = str;
        this.maximumDuration = str2;
        this.estimatedArrivalTime = str3;
    }

    public /* synthetic */ PaymentDelivery(com.paypal.oslo.feature.p2p.domain.model.TransferSpeed transferSpeed, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(transferSpeed, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.TransferSpeed getSpeed() {
        return this.speed;
    }

    public final java.lang.String getMinimumDuration() {
        return this.minimumDuration;
    }

    public final java.lang.String getMaximumDuration() {
        return this.maximumDuration;
    }

    public final java.lang.String getEstimatedArrivalTime() {
        return this.estimatedArrivalTime;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.domain.model.TransferSpeed transferSpeed = this.speed;
        java.lang.String str = this.minimumDuration;
        java.lang.String str2 = this.maximumDuration;
        java.lang.String str3 = this.estimatedArrivalTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentDelivery(speed=");
        sb.append(transferSpeed);
        sb.append(", minimumDuration=");
        sb.append(str);
        sb.append(", maximumDuration=");
        sb.append(str2);
        sb.append(", estimatedArrivalTime=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.speed.hashCode();
        java.lang.String str = this.minimumDuration;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.maximumDuration;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.estimatedArrivalTime;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery paymentDelivery = (com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery) other;
        return this.speed == paymentDelivery.speed && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumDuration, paymentDelivery.minimumDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumDuration, paymentDelivery.maximumDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedArrivalTime, paymentDelivery.estimatedArrivalTime);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery copy(com.paypal.oslo.feature.p2p.domain.model.TransferSpeed speed, java.lang.String minimumDuration, java.lang.String maximumDuration, java.lang.String estimatedArrivalTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(speed, "");
        return new com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery(speed, minimumDuration, maximumDuration, estimatedArrivalTime);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEstimatedArrivalTime() {
        return this.estimatedArrivalTime;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMaximumDuration() {
        return this.maximumDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMinimumDuration() {
        return this.minimumDuration;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.TransferSpeed getSpeed() {
        return this.speed;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery copy$default(com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery paymentDelivery, com.paypal.oslo.feature.p2p.domain.model.TransferSpeed transferSpeed, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transferSpeed = paymentDelivery.speed;
        }
        if ((i & 2) != 0) {
            str = paymentDelivery.minimumDuration;
        }
        if ((i & 4) != 0) {
            str2 = paymentDelivery.maximumDuration;
        }
        if ((i & 8) != 0) {
            str3 = paymentDelivery.estimatedArrivalTime;
        }
        return paymentDelivery.copy(transferSpeed, str, str2, str3);
    }
}
