package com.paypal.oslo.feature.directdeposit.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u0011\u0010 \u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;", "", "Lcom/paypal/oslo/feature/directdeposit/domain/model/Distribution;", "distribution", "", "status", "version", "<init>", "(Lcom/paypal/oslo/feature/directdeposit/domain/model/Distribution;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/directdeposit/domain/model/Distribution;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/directdeposit/domain/model/Distribution;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/directdeposit/domain/model/Distribution;", "getDistribution", "Ljava/lang/String;", "getStatus", "getVersion", "Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteStatus;", "getStatusEnum", "()Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteStatus;", "statusEnum"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SmartRoutePreferences {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.directdeposit.domain.model.Distribution distribution;
    private final java.lang.String status;
    private final java.lang.String version;

    public SmartRoutePreferences(com.paypal.oslo.feature.directdeposit.domain.model.Distribution distribution, java.lang.String str, java.lang.String str2) {
        this.distribution = distribution;
        this.status = str;
        this.version = str2;
    }

    public final com.paypal.oslo.feature.directdeposit.domain.model.Distribution getDistribution() {
        return this.distribution;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus getStatusEnum() {
        return com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus.INSTANCE.fromString(this.status);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.directdeposit.domain.model.Distribution distribution = this.distribution;
        java.lang.String str = this.status;
        java.lang.String str2 = this.version;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartRoutePreferences(distribution=");
        sb.append(distribution);
        sb.append(", status=");
        sb.append(str);
        sb.append(", version=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.directdeposit.domain.model.Distribution distribution = this.distribution;
        int hashCode = distribution == null ? 0 : distribution.hashCode();
        java.lang.String str = this.status;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.version;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences)) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences = (com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.distribution, smartRoutePreferences.distribution) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, smartRoutePreferences.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, smartRoutePreferences.version);
    }

    public final com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences copy(com.paypal.oslo.feature.directdeposit.domain.model.Distribution distribution, java.lang.String status, java.lang.String version) {
        return new com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences(distribution, status, version);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.directdeposit.domain.model.Distribution getDistribution() {
        return this.distribution;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences copy$default(com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences, com.paypal.oslo.feature.directdeposit.domain.model.Distribution distribution, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            distribution = smartRoutePreferences.distribution;
        }
        if ((i & 2) != 0) {
            str = smartRoutePreferences.status;
        }
        if ((i & 4) != 0) {
            str2 = smartRoutePreferences.version;
        }
        return smartRoutePreferences.copy(distribution, str, str2);
    }
}
