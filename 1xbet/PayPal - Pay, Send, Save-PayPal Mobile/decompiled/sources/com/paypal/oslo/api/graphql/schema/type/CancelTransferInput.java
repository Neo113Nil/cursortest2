package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CancelTransferInput;", "", "", "transactionId", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CancelTransferReason;", "reason", "Lcom/paypal/oslo/api/graphql/schema/type/CancelTransferOperation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CancelTransferInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransactionId", "Lcom/apollographql/apollo/api/Optional;", "getReason", "getOperation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CancelTransferInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CancelTransferOperation> operation;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CancelTransferReason> reason;
    private final java.lang.String transactionId;

    /* JADX WARN: Multi-variable type inference failed */
    public CancelTransferInput(java.lang.String str, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CancelTransferReason> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CancelTransferOperation> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.transactionId = str;
        this.reason = optional;
        this.operation = optional2;
    }

    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    public /* synthetic */ CancelTransferInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CancelTransferReason> getReason() {
        return this.reason;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CancelTransferOperation> getOperation() {
        return this.operation;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.transactionId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CancelTransferReason> optional = this.reason;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CancelTransferOperation> optional2 = this.operation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelTransferInput(transactionId=");
        sb.append(str);
        sb.append(", reason=");
        sb.append(optional);
        sb.append(", operation=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.transactionId.hashCode() * 31) + this.reason.hashCode()) * 31) + this.operation.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CancelTransferInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CancelTransferInput cancelTransferInput = (com.paypal.oslo.api.graphql.schema.type.CancelTransferInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, cancelTransferInput.transactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, cancelTransferInput.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.operation, cancelTransferInput.operation);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CancelTransferInput copy(java.lang.String transactionId, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CancelTransferReason> reason, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CancelTransferOperation> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        return new com.paypal.oslo.api.graphql.schema.type.CancelTransferInput(transactionId, reason, operation);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CancelTransferOperation> component3() {
        return this.operation;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CancelTransferReason> component2() {
        return this.reason;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CancelTransferInput copy$default(com.paypal.oslo.api.graphql.schema.type.CancelTransferInput cancelTransferInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cancelTransferInput.transactionId;
        }
        if ((i & 2) != 0) {
            optional = cancelTransferInput.reason;
        }
        if ((i & 4) != 0) {
            optional2 = cancelTransferInput.operation;
        }
        return cancelTransferInput.copy(str, optional, optional2);
    }
}
