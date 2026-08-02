package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PercentageAlertDetailInput;", "", "", "percentages", "", "enabled", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/api/graphql/schema/type/PercentageAlertDetailInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPercentages", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PercentageAlertDetailInput {
    private final boolean enabled;
    private final java.util.List<java.lang.Object> percentages;

    public PercentageAlertDetailInput(java.util.List<? extends java.lang.Object> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.percentages = list;
        this.enabled = z;
    }

    public final java.util.List<java.lang.Object> getPercentages() {
        return this.percentages;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.Object> list = this.percentages;
        boolean z = this.enabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PercentageAlertDetailInput(percentages=");
        sb.append(list);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.percentages.hashCode() * 31) + java.lang.Boolean.hashCode(this.enabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.PercentageAlertDetailInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.PercentageAlertDetailInput percentageAlertDetailInput = (com.paypal.oslo.api.graphql.schema.type.PercentageAlertDetailInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.percentages, percentageAlertDetailInput.percentages) && this.enabled == percentageAlertDetailInput.enabled;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PercentageAlertDetailInput copy(java.util.List<? extends java.lang.Object> percentages, boolean enabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentages, "");
        return new com.paypal.oslo.api.graphql.schema.type.PercentageAlertDetailInput(percentages, enabled);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final java.util.List<java.lang.Object> component1() {
        return this.percentages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PercentageAlertDetailInput copy$default(com.paypal.oslo.api.graphql.schema.type.PercentageAlertDetailInput percentageAlertDetailInput, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = percentageAlertDetailInput.percentages;
        }
        if ((i & 2) != 0) {
            z = percentageAlertDetailInput.enabled;
        }
        return percentageAlertDetailInput.copy(list, z);
    }
}
