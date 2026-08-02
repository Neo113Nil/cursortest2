package com.paypal.oslo.feature.activity.data.repository.detail;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/data/repository/detail/PackageInputWithSkipFlag;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityShipmentPackagesInput;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityShipmentPackagesInput;", "input", "", "skipPackages", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityShipmentPackagesInput;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityShipmentPackagesInput;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityShipmentPackagesInput;Z)Lcom/paypal/oslo/feature/activity/data/repository/detail/PackageInputWithSkipFlag;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityShipmentPackagesInput;", "getInput", "Z", "getSkipPackages"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PackageInputWithSkipFlag {
    public static final int $stable = 8;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput input;
    private final boolean skipPackages;

    public PackageInputWithSkipFlag(com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput activityShipmentPackagesInput, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityShipmentPackagesInput, "");
        this.input = activityShipmentPackagesInput;
        this.skipPackages = z;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput getInput() {
        return this.input;
    }

    public final boolean getSkipPackages() {
        return this.skipPackages;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput activityShipmentPackagesInput = this.input;
        boolean z = this.skipPackages;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PackageInputWithSkipFlag(input=");
        sb.append(activityShipmentPackagesInput);
        sb.append(", skipPackages=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.input.hashCode() * 31) + java.lang.Boolean.hashCode(this.skipPackages);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.data.repository.detail.PackageInputWithSkipFlag)) {
            return false;
        }
        com.paypal.oslo.feature.activity.data.repository.detail.PackageInputWithSkipFlag packageInputWithSkipFlag = (com.paypal.oslo.feature.activity.data.repository.detail.PackageInputWithSkipFlag) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.input, packageInputWithSkipFlag.input) && this.skipPackages == packageInputWithSkipFlag.skipPackages;
    }

    public final com.paypal.oslo.feature.activity.data.repository.detail.PackageInputWithSkipFlag copy(com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput input, boolean skipPackages) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.activity.data.repository.detail.PackageInputWithSkipFlag(input, skipPackages);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSkipPackages() {
        return this.skipPackages;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.data.repository.detail.PackageInputWithSkipFlag copy$default(com.paypal.oslo.feature.activity.data.repository.detail.PackageInputWithSkipFlag packageInputWithSkipFlag, com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput activityShipmentPackagesInput, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activityShipmentPackagesInput = packageInputWithSkipFlag.input;
        }
        if ((i & 2) != 0) {
            z = packageInputWithSkipFlag.skipPackages;
        }
        return packageInputWithSkipFlag.copy(activityShipmentPackagesInput, z);
    }
}
