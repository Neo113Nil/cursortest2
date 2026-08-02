package com.paypal.oslo.feature.directdeposit.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\nR\u0011\u0010 \u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/domain/model/Target;", "", "", "accountType", "", "allocationPercentage", "eligibilityStatus", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/domain/model/Target;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountType", "Ljava/lang/Double;", "getAllocationPercentage", "getEligibilityStatus", "Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteAccountType;", "getAccountTypeEnum", "()Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteAccountType;", "accountTypeEnum"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Target {
    public static final int $stable = 0;
    private final java.lang.String accountType;
    private final java.lang.Double allocationPercentage;
    private final java.lang.String eligibilityStatus;

    public Target(java.lang.String str, java.lang.Double d, java.lang.String str2) {
        this.accountType = str;
        this.allocationPercentage = d;
        this.eligibilityStatus = str2;
    }

    public final java.lang.String getAccountType() {
        return this.accountType;
    }

    public final java.lang.Double getAllocationPercentage() {
        return this.allocationPercentage;
    }

    public final java.lang.String getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    public final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType getAccountTypeEnum() {
        return com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.INSTANCE.fromString(this.accountType);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.accountType;
        java.lang.Double d = this.allocationPercentage;
        java.lang.String str2 = this.eligibilityStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Target(accountType=");
        sb.append(str);
        sb.append(", allocationPercentage=");
        sb.append(d);
        sb.append(", eligibilityStatus=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.accountType;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.Double d = this.allocationPercentage;
        int hashCode2 = d == null ? 0 : d.hashCode();
        java.lang.String str2 = this.eligibilityStatus;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.directdeposit.domain.model.Target)) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.domain.model.Target target = (com.paypal.oslo.feature.directdeposit.domain.model.Target) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.accountType, target.accountType) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.allocationPercentage, (java.lang.Object) target.allocationPercentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibilityStatus, target.eligibilityStatus);
    }

    public final com.paypal.oslo.feature.directdeposit.domain.model.Target copy(java.lang.String accountType, java.lang.Double allocationPercentage, java.lang.String eligibilityStatus) {
        return new com.paypal.oslo.feature.directdeposit.domain.model.Target(accountType, allocationPercentage, eligibilityStatus);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Double getAllocationPercentage() {
        return this.allocationPercentage;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAccountType() {
        return this.accountType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.domain.model.Target copy$default(com.paypal.oslo.feature.directdeposit.domain.model.Target target, java.lang.String str, java.lang.Double d, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = target.accountType;
        }
        if ((i & 2) != 0) {
            d = target.allocationPercentage;
        }
        if ((i & 4) != 0) {
            str2 = target.eligibilityStatus;
        }
        return target.copy(str, d, str2);
    }
}
