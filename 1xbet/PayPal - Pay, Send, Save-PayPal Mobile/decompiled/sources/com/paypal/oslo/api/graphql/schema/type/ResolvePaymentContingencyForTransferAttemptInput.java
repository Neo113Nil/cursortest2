package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013JZ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b(\u0010\u0013R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b)\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ResolvePaymentContingencyForTransferAttemptInput;", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;", "action", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentUserDataCollectionResolutionInput;", "userDataCollectionResolution", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPurposeCodeCollectionResolutionInput;", "purposeCodeCollectionResolution", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentScamWarningResolutionInput;", "scamWarningResolution", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "component4", "component5", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ResolvePaymentContingencyForTransferAttemptInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;", "getAction", "Lcom/apollographql/apollo/api/Optional;", "getUserDataCollectionResolution", "getPurposeCodeCollectionResolution", "getScamWarningResolution"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ResolvePaymentContingencyForTransferAttemptInput {
    private final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction action;
    private final java.lang.Object id;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCodeCollectionResolutionInput> purposeCodeCollectionResolution;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningResolutionInput> scamWarningResolution;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionResolutionInput> userDataCollectionResolution;

    public ResolvePaymentContingencyForTransferAttemptInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionResolutionInput> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCodeCollectionResolutionInput> optional2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningResolutionInput> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentContingencyAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.id = obj;
        this.action = paymentContingencyAction;
        this.userDataCollectionResolution = optional;
        this.purposeCodeCollectionResolution = optional2;
        this.scamWarningResolution = optional3;
    }

    public final java.lang.Object getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction getAction() {
        return this.action;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionResolutionInput> getUserDataCollectionResolution() {
        return this.userDataCollectionResolution;
    }

    public /* synthetic */ ResolvePaymentContingencyForTransferAttemptInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, paymentContingencyAction, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCodeCollectionResolutionInput> getPurposeCodeCollectionResolution() {
        return this.purposeCodeCollectionResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningResolutionInput> getScamWarningResolution() {
        return this.scamWarningResolution;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.id;
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction = this.action;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionResolutionInput> optional = this.userDataCollectionResolution;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCodeCollectionResolutionInput> optional2 = this.purposeCodeCollectionResolution;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningResolutionInput> optional3 = this.scamWarningResolution;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolvePaymentContingencyForTransferAttemptInput(id=");
        sb.append(obj);
        sb.append(", action=");
        sb.append(paymentContingencyAction);
        sb.append(", userDataCollectionResolution=");
        sb.append(optional);
        sb.append(", purposeCodeCollectionResolution=");
        sb.append(optional2);
        sb.append(", scamWarningResolution=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.action.hashCode()) * 31) + this.userDataCollectionResolution.hashCode()) * 31) + this.purposeCodeCollectionResolution.hashCode()) * 31) + this.scamWarningResolution.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput resolvePaymentContingencyForTransferAttemptInput = (com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, resolvePaymentContingencyForTransferAttemptInput.id) && this.action == resolvePaymentContingencyForTransferAttemptInput.action && kotlin.jvm.internal.Intrinsics.areEqual(this.userDataCollectionResolution, resolvePaymentContingencyForTransferAttemptInput.userDataCollectionResolution) && kotlin.jvm.internal.Intrinsics.areEqual(this.purposeCodeCollectionResolution, resolvePaymentContingencyForTransferAttemptInput.purposeCodeCollectionResolution) && kotlin.jvm.internal.Intrinsics.areEqual(this.scamWarningResolution, resolvePaymentContingencyForTransferAttemptInput.scamWarningResolution);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput copy(java.lang.Object id, com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction action, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionResolutionInput> userDataCollectionResolution, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCodeCollectionResolutionInput> purposeCodeCollectionResolution, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningResolutionInput> scamWarningResolution) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userDataCollectionResolution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeCodeCollectionResolution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamWarningResolution, "");
        return new com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput(id, action, userDataCollectionResolution, purposeCodeCollectionResolution, scamWarningResolution);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningResolutionInput> component5() {
        return this.scamWarningResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCodeCollectionResolutionInput> component4() {
        return this.purposeCodeCollectionResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionResolutionInput> component3() {
        return this.userDataCollectionResolution;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction getAction() {
        return this.action;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput copy$default(com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput resolvePaymentContingencyForTransferAttemptInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = resolvePaymentContingencyForTransferAttemptInput.id;
        }
        if ((i & 2) != 0) {
            paymentContingencyAction = resolvePaymentContingencyForTransferAttemptInput.action;
        }
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction2 = paymentContingencyAction;
        if ((i & 4) != 0) {
            optional = resolvePaymentContingencyForTransferAttemptInput.userDataCollectionResolution;
        }
        com.apollographql.apollo.api.Optional optional4 = optional;
        if ((i & 8) != 0) {
            optional2 = resolvePaymentContingencyForTransferAttemptInput.purposeCodeCollectionResolution;
        }
        com.apollographql.apollo.api.Optional optional5 = optional2;
        if ((i & 16) != 0) {
            optional3 = resolvePaymentContingencyForTransferAttemptInput.scamWarningResolution;
        }
        return resolvePaymentContingencyForTransferAttemptInput.copy(obj, paymentContingencyAction2, optional4, optional5, optional3);
    }
}
