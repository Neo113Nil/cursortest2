package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditStatementInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "creditProductIdentifier", "Lcom/apollographql/apollo/api/Optional;", "creditAccountId", "statementId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditStatementInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/apollographql/apollo/api/Optional;", "getCreditAccountId", "Ljava/lang/Object;", "getStatementId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditStatementInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> creditAccountId;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier;
    private final java.lang.Object statementId;

    public RevolvingCreditStatementInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.creditProductIdentifier = revolvingCreditProductIdentifier;
        this.creditAccountId = optional;
        this.statementId = obj;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public /* synthetic */ RevolvingCreditStatementInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional.Absent absent, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(revolvingCreditProductIdentifier, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, obj);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.Object getStatementId() {
        return this.statementId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier = this.creditProductIdentifier;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.creditAccountId;
        java.lang.Object obj = this.statementId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditStatementInput(creditProductIdentifier=");
        sb.append(revolvingCreditProductIdentifier);
        sb.append(", creditAccountId=");
        sb.append(optional);
        sb.append(", statementId=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditProductIdentifier.hashCode() * 31) + this.creditAccountId.hashCode()) * 31) + this.statementId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditStatementInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditStatementInput revolvingCreditStatementInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditStatementInput) other;
        return this.creditProductIdentifier == revolvingCreditStatementInput.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, revolvingCreditStatementInput.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.statementId, revolvingCreditStatementInput.statementId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditStatementInput copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier, com.apollographql.apollo.api.Optional<? extends java.lang.Object> creditAccountId, java.lang.Object statementId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementId, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditStatementInput(creditProductIdentifier, creditAccountId, statementId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getStatementId() {
        return this.statementId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditStatementInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditStatementInput revolvingCreditStatementInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional optional, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            revolvingCreditProductIdentifier = revolvingCreditStatementInput.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            optional = revolvingCreditStatementInput.creditAccountId;
        }
        if ((i & 4) != 0) {
            obj = revolvingCreditStatementInput.statementId;
        }
        return revolvingCreditStatementInput.copy(revolvingCreditProductIdentifier, optional, obj);
    }
}
