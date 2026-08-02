package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR(\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFlowContextInput;", "flowContext", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFilterOptionsInput;", "filterOptions", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFormatOptionsInput;", "formatOptions", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFlowContextInput;Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFilterOptionsInput;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFlowContextInput;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFilterOptionsInput;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFlowContextInput;Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFilterOptionsInput;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFlowContextInput;", "getFlowContext", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFilterOptionsInput;", "getFilterOptions", "Lcom/apollographql/apollo/api/Optional;", "getFormatOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLPlansOverviewInput {
    private final com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFilterOptionsInput filterOptions;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput flowContext;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFormatOptionsInput>> formatOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public BNPLPlansOverviewInput(com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput bNPLPlansOverviewFlowContextInput, com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFilterOptionsInput bNPLPlansOverviewFilterOptionsInput, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFormatOptionsInput>> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLPlansOverviewFlowContextInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLPlansOverviewFilterOptionsInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.flowContext = bNPLPlansOverviewFlowContextInput;
        this.filterOptions = bNPLPlansOverviewFilterOptionsInput;
        this.formatOptions = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFilterOptionsInput getFilterOptions() {
        return this.filterOptions;
    }

    public /* synthetic */ BNPLPlansOverviewInput(com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput bNPLPlansOverviewFlowContextInput, com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFilterOptionsInput bNPLPlansOverviewFilterOptionsInput, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bNPLPlansOverviewFlowContextInput, bNPLPlansOverviewFilterOptionsInput, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFormatOptionsInput>> getFormatOptions() {
        return this.formatOptions;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput bNPLPlansOverviewFlowContextInput = this.flowContext;
        com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFilterOptionsInput bNPLPlansOverviewFilterOptionsInput = this.filterOptions;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFormatOptionsInput>> optional = this.formatOptions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLPlansOverviewInput(flowContext=");
        sb.append(bNPLPlansOverviewFlowContextInput);
        sb.append(", filterOptions=");
        sb.append(bNPLPlansOverviewFilterOptionsInput);
        sb.append(", formatOptions=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.flowContext.hashCode() * 31) + this.filterOptions.hashCode()) * 31) + this.formatOptions.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewInput bNPLPlansOverviewInput = (com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, bNPLPlansOverviewInput.flowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterOptions, bNPLPlansOverviewInput.filterOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.formatOptions, bNPLPlansOverviewInput.formatOptions);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewInput copy(com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput flowContext, com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFilterOptionsInput filterOptions, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFormatOptionsInput>> formatOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatOptions, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewInput(flowContext, filterOptions, formatOptions);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFormatOptionsInput>> component3() {
        return this.formatOptions;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFilterOptionsInput getFilterOptions() {
        return this.filterOptions;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewInput bNPLPlansOverviewInput, com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput bNPLPlansOverviewFlowContextInput, com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFilterOptionsInput bNPLPlansOverviewFilterOptionsInput, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bNPLPlansOverviewFlowContextInput = bNPLPlansOverviewInput.flowContext;
        }
        if ((i & 2) != 0) {
            bNPLPlansOverviewFilterOptionsInput = bNPLPlansOverviewInput.filterOptions;
        }
        if ((i & 4) != 0) {
            optional = bNPLPlansOverviewInput.formatOptions;
        }
        return bNPLPlansOverviewInput.copy(bNPLPlansOverviewFlowContextInput, bNPLPlansOverviewFilterOptionsInput, optional);
    }
}
