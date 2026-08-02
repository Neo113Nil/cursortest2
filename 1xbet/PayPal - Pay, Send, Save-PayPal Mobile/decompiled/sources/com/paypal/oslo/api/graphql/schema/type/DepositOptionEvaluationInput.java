package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DepositOptionEvaluationInput;", "", "", "depositOptionId", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/TransferFlowContextInput;", "transferFlowContext", "Lcom/paypal/oslo/api/graphql/schema/type/TransferExecutionContextInput;", "executionContext", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DepositOptionEvaluationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDepositOptionId", "Lcom/apollographql/apollo/api/Optional;", "getTransferFlowContext", "getExecutionContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DepositOptionEvaluationInput {
    private final java.lang.String depositOptionId;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput> executionContext;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> transferFlowContext;

    public DepositOptionEvaluationInput(java.lang.String str, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.depositOptionId = str;
        this.transferFlowContext = optional;
        this.executionContext = optional2;
    }

    public final java.lang.String getDepositOptionId() {
        return this.depositOptionId;
    }

    public /* synthetic */ DepositOptionEvaluationInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> getTransferFlowContext() {
        return this.transferFlowContext;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput> getExecutionContext() {
        return this.executionContext;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.depositOptionId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> optional = this.transferFlowContext;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput> optional2 = this.executionContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DepositOptionEvaluationInput(depositOptionId=");
        sb.append(str);
        sb.append(", transferFlowContext=");
        sb.append(optional);
        sb.append(", executionContext=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.depositOptionId.hashCode() * 31) + this.transferFlowContext.hashCode()) * 31) + this.executionContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DepositOptionEvaluationInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DepositOptionEvaluationInput depositOptionEvaluationInput = (com.paypal.oslo.api.graphql.schema.type.DepositOptionEvaluationInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.depositOptionId, depositOptionEvaluationInput.depositOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferFlowContext, depositOptionEvaluationInput.transferFlowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.executionContext, depositOptionEvaluationInput.executionContext);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DepositOptionEvaluationInput copy(java.lang.String depositOptionId, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> transferFlowContext, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput> executionContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositOptionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferFlowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
        return new com.paypal.oslo.api.graphql.schema.type.DepositOptionEvaluationInput(depositOptionId, transferFlowContext, executionContext);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput> component3() {
        return this.executionContext;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> component2() {
        return this.transferFlowContext;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDepositOptionId() {
        return this.depositOptionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DepositOptionEvaluationInput copy$default(com.paypal.oslo.api.graphql.schema.type.DepositOptionEvaluationInput depositOptionEvaluationInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = depositOptionEvaluationInput.depositOptionId;
        }
        if ((i & 2) != 0) {
            optional = depositOptionEvaluationInput.transferFlowContext;
        }
        if ((i & 4) != 0) {
            optional2 = depositOptionEvaluationInput.executionContext;
        }
        return depositOptionEvaluationInput.copy(str, optional, optional2);
    }
}
