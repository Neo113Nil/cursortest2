package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0004\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DeviceEligibility;", "", "", "isPrimaryEligible", "isCompanionEligible", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DeviceEligibility;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeviceEligibility {
    public static final int $stable = 0;
    private final java.lang.Boolean isCompanionEligible;
    private final java.lang.Boolean isPrimaryEligible;

    public DeviceEligibility(java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.isPrimaryEligible = bool;
        this.isCompanionEligible = bool2;
    }

    public final java.lang.Boolean isPrimaryEligible() {
        return this.isPrimaryEligible;
    }

    public final java.lang.Boolean isCompanionEligible() {
        return this.isCompanionEligible;
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.isPrimaryEligible;
        java.lang.Boolean bool2 = this.isCompanionEligible;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceEligibility(isPrimaryEligible=");
        sb.append(bool);
        sb.append(", isCompanionEligible=");
        sb.append(bool2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.isPrimaryEligible;
        int hashCode = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.isCompanionEligible;
        return (hashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility deviceEligibility = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.isPrimaryEligible, deviceEligibility.isPrimaryEligible) && kotlin.jvm.internal.Intrinsics.areEqual(this.isCompanionEligible, deviceEligibility.isCompanionEligible);
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility copy(java.lang.Boolean isPrimaryEligible, java.lang.Boolean isCompanionEligible) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility(isPrimaryEligible, isCompanionEligible);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getIsCompanionEligible() {
        return this.isCompanionEligible;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getIsPrimaryEligible() {
        return this.isPrimaryEligible;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility deviceEligibility, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = deviceEligibility.isPrimaryEligible;
        }
        if ((i & 2) != 0) {
            bool2 = deviceEligibility.isCompanionEligible;
        }
        return deviceEligibility.copy(bool, bool2);
    }
}
