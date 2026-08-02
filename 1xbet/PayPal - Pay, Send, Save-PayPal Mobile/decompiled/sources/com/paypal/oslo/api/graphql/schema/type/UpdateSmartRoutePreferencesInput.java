package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdateSmartRoutePreferencesInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionInput;", "distribution", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteType;", "route", "", "version", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionInput;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionInput;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteType;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionInput;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteType;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateSmartRoutePreferencesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionInput;", "getDistribution", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteType;", "getRoute", "Ljava/lang/String;", "getVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateSmartRoutePreferencesInput {
    private final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput distribution;
    private final com.paypal.oslo.api.graphql.schema.type.SmartRouteType route;
    private final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus status;
    private final java.lang.String version;

    public UpdateSmartRoutePreferencesInput(com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput smartRouteDistributionInput, com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus, com.paypal.oslo.api.graphql.schema.type.SmartRouteType smartRouteType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteDistributionInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.distribution = smartRouteDistributionInput;
        this.status = smartRouteStatus;
        this.route = smartRouteType;
        this.version = str;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput getDistribution() {
        return this.distribution;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SmartRouteType getRoute() {
        return this.route;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput smartRouteDistributionInput = this.distribution;
        com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus = this.status;
        com.paypal.oslo.api.graphql.schema.type.SmartRouteType smartRouteType = this.route;
        java.lang.String str = this.version;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSmartRoutePreferencesInput(distribution=");
        sb.append(smartRouteDistributionInput);
        sb.append(", status=");
        sb.append(smartRouteStatus);
        sb.append(", route=");
        sb.append(smartRouteType);
        sb.append(", version=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.distribution.hashCode() * 31) + this.status.hashCode()) * 31) + this.route.hashCode()) * 31) + this.version.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput updateSmartRoutePreferencesInput = (com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.distribution, updateSmartRoutePreferencesInput.distribution) && this.status == updateSmartRoutePreferencesInput.status && this.route == updateSmartRoutePreferencesInput.route && kotlin.jvm.internal.Intrinsics.areEqual(this.version, updateSmartRoutePreferencesInput.version);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput copy(com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput distribution, com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus status, com.paypal.oslo.api.graphql.schema.type.SmartRouteType route, java.lang.String version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distribution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput(distribution, status, route, version);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SmartRouteType getRoute() {
        return this.route;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput getDistribution() {
        return this.distribution;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput updateSmartRoutePreferencesInput, com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput smartRouteDistributionInput, com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus, com.paypal.oslo.api.graphql.schema.type.SmartRouteType smartRouteType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            smartRouteDistributionInput = updateSmartRoutePreferencesInput.distribution;
        }
        if ((i & 2) != 0) {
            smartRouteStatus = updateSmartRoutePreferencesInput.status;
        }
        if ((i & 4) != 0) {
            smartRouteType = updateSmartRoutePreferencesInput.route;
        }
        if ((i & 8) != 0) {
            str = updateSmartRoutePreferencesInput.version;
        }
        return updateSmartRoutePreferencesInput.copy(smartRouteDistributionInput, smartRouteStatus, smartRouteType, str);
    }
}
