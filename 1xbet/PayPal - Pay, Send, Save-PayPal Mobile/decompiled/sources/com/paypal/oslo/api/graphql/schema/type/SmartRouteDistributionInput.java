package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;", "source", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;", "distributionMethod", "", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetInput;", "targets", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;", "getSource", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;", "getDistributionMethod", "Ljava/util/List;", "getTargets"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SmartRouteDistributionInput {
    private final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod distributionMethod;
    private final com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource source;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetInput> targets;

    public SmartRouteDistributionInput(com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource smartRouteFundingSource, com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod smartRouteDistributionMethod, java.util.List<com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetInput> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteFundingSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteDistributionMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.source = smartRouteFundingSource;
        this.distributionMethod = smartRouteDistributionMethod;
        this.targets = list;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource getSource() {
        return this.source;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod getDistributionMethod() {
        return this.distributionMethod;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetInput> getTargets() {
        return this.targets;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource smartRouteFundingSource = this.source;
        com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod smartRouteDistributionMethod = this.distributionMethod;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetInput> list = this.targets;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartRouteDistributionInput(source=");
        sb.append(smartRouteFundingSource);
        sb.append(", distributionMethod=");
        sb.append(smartRouteDistributionMethod);
        sb.append(", targets=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.source.hashCode() * 31) + this.distributionMethod.hashCode()) * 31) + this.targets.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput smartRouteDistributionInput = (com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput) other;
        return this.source == smartRouteDistributionInput.source && this.distributionMethod == smartRouteDistributionInput.distributionMethod && kotlin.jvm.internal.Intrinsics.areEqual(this.targets, smartRouteDistributionInput.targets);
    }

    public final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput copy(com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource source, com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod distributionMethod, java.util.List<com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetInput> targets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targets, "");
        return new com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput(source, distributionMethod, targets);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetInput> component3() {
        return this.targets;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod getDistributionMethod() {
        return this.distributionMethod;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource getSource() {
        return this.source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput copy$default(com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput smartRouteDistributionInput, com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource smartRouteFundingSource, com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod smartRouteDistributionMethod, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            smartRouteFundingSource = smartRouteDistributionInput.source;
        }
        if ((i & 2) != 0) {
            smartRouteDistributionMethod = smartRouteDistributionInput.distributionMethod;
        }
        if ((i & 4) != 0) {
            list = smartRouteDistributionInput.targets;
        }
        return smartRouteDistributionInput.copy(smartRouteFundingSource, smartRouteDistributionMethod, list);
    }
}
