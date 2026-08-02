package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SavePackageTrackingUserPreferenceInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;", "preferenceType", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;", "preferenceKey", "", "preferenceValue", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;Z)Lcom/paypal/oslo/api/graphql/schema/type/SavePackageTrackingUserPreferenceInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;", "getPreferenceType", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;", "getPreferenceKey", "Z", "getPreferenceValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SavePackageTrackingUserPreferenceInput {
    private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey preferenceKey;
    private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType preferenceType;
    private final boolean preferenceValue;

    public SavePackageTrackingUserPreferenceInput(com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageTrackingPreferenceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageTrackingPreferenceKey, "");
        this.preferenceType = packageTrackingPreferenceType;
        this.preferenceKey = packageTrackingPreferenceKey;
        this.preferenceValue = z;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType getPreferenceType() {
        return this.preferenceType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey getPreferenceKey() {
        return this.preferenceKey;
    }

    public final boolean getPreferenceValue() {
        return this.preferenceValue;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType = this.preferenceType;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey = this.preferenceKey;
        boolean z = this.preferenceValue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavePackageTrackingUserPreferenceInput(preferenceType=");
        sb.append(packageTrackingPreferenceType);
        sb.append(", preferenceKey=");
        sb.append(packageTrackingPreferenceKey);
        sb.append(", preferenceValue=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.preferenceType.hashCode() * 31) + this.preferenceKey.hashCode()) * 31) + java.lang.Boolean.hashCode(this.preferenceValue);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput savePackageTrackingUserPreferenceInput = (com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput) other;
        return this.preferenceType == savePackageTrackingUserPreferenceInput.preferenceType && this.preferenceKey == savePackageTrackingUserPreferenceInput.preferenceKey && this.preferenceValue == savePackageTrackingUserPreferenceInput.preferenceValue;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput copy(com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType preferenceType, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey preferenceKey, boolean preferenceValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferenceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferenceKey, "");
        return new com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput(preferenceType, preferenceKey, preferenceValue);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPreferenceValue() {
        return this.preferenceValue;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey getPreferenceKey() {
        return this.preferenceKey;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType getPreferenceType() {
        return this.preferenceType;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput copy$default(com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput savePackageTrackingUserPreferenceInput, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            packageTrackingPreferenceType = savePackageTrackingUserPreferenceInput.preferenceType;
        }
        if ((i & 2) != 0) {
            packageTrackingPreferenceKey = savePackageTrackingUserPreferenceInput.preferenceKey;
        }
        if ((i & 4) != 0) {
            z = savePackageTrackingUserPreferenceInput.preferenceValue;
        }
        return savePackageTrackingUserPreferenceInput.copy(packageTrackingPreferenceType, packageTrackingPreferenceKey, z);
    }
}
