package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FlowContextInput;", "", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "uiChannel", "Lcom/apollographql/apollo/api/Optional;", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/FlowContextInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFlowName", "getUiChannel", "Lcom/apollographql/apollo/api/Optional;", "getTransactionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlowContextInput {
    private final java.lang.String flowName;
    private final com.apollographql.apollo.api.Optional<java.lang.String> transactionId;
    private final java.lang.String uiChannel;

    public FlowContextInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.flowName = str;
        this.uiChannel = str2;
        this.transactionId = optional;
    }

    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    public final java.lang.String getUiChannel() {
        return this.uiChannel;
    }

    public /* synthetic */ FlowContextInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getTransactionId() {
        return this.transactionId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.flowName;
        java.lang.String str2 = this.uiChannel;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.transactionId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FlowContextInput(flowName=");
        sb.append(str);
        sb.append(", uiChannel=");
        sb.append(str2);
        sb.append(", transactionId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.flowName.hashCode() * 31) + this.uiChannel.hashCode()) * 31) + this.transactionId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.FlowContextInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.FlowContextInput flowContextInput = (com.paypal.oslo.api.graphql.schema.type.FlowContextInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flowName, flowContextInput.flowName) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiChannel, flowContextInput.uiChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, flowContextInput.transactionId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.FlowContextInput copy(java.lang.String flowName, java.lang.String uiChannel, com.apollographql.apollo.api.Optional<java.lang.String> transactionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
        return new com.paypal.oslo.api.graphql.schema.type.FlowContextInput(flowName, uiChannel, transactionId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.transactionId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUiChannel() {
        return this.uiChannel;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.FlowContextInput copy$default(com.paypal.oslo.api.graphql.schema.type.FlowContextInput flowContextInput, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = flowContextInput.flowName;
        }
        if ((i & 2) != 0) {
            str2 = flowContextInput.uiChannel;
        }
        if ((i & 4) != 0) {
            optional = flowContextInput.transactionId;
        }
        return flowContextInput.copy(str, str2, optional);
    }
}
