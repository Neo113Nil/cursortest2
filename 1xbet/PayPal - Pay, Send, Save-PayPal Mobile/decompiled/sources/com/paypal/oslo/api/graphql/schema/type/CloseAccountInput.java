package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJF\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\fR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountOutstandingBalanceDispositionInput;", "outstandingBalanceDispositionPreferences", "", "reason", "", "skipNotification", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getOutstandingBalanceDispositionPreferences", "getReason", "getSkipNotification"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CloseAccountInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CloseAccountOutstandingBalanceDispositionInput> outstandingBalanceDispositionPreferences;
    private final com.apollographql.apollo.api.Optional<java.lang.String> reason;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> skipNotification;

    public CloseAccountInput(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CloseAccountOutstandingBalanceDispositionInput> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.outstandingBalanceDispositionPreferences = optional;
        this.reason = optional2;
        this.skipNotification = optional3;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CloseAccountOutstandingBalanceDispositionInput> getOutstandingBalanceDispositionPreferences() {
        return this.outstandingBalanceDispositionPreferences;
    }

    public /* synthetic */ CloseAccountInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getReason() {
        return this.reason;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getSkipNotification() {
        return this.skipNotification;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CloseAccountOutstandingBalanceDispositionInput> optional = this.outstandingBalanceDispositionPreferences;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.reason;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional3 = this.skipNotification;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAccountInput(outstandingBalanceDispositionPreferences=");
        sb.append(optional);
        sb.append(", reason=");
        sb.append(optional2);
        sb.append(", skipNotification=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.outstandingBalanceDispositionPreferences.hashCode() * 31) + this.reason.hashCode()) * 31) + this.skipNotification.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CloseAccountInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CloseAccountInput closeAccountInput = (com.paypal.oslo.api.graphql.schema.type.CloseAccountInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.outstandingBalanceDispositionPreferences, closeAccountInput.outstandingBalanceDispositionPreferences) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, closeAccountInput.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.skipNotification, closeAccountInput.skipNotification);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CloseAccountInput copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CloseAccountOutstandingBalanceDispositionInput> outstandingBalanceDispositionPreferences, com.apollographql.apollo.api.Optional<java.lang.String> reason, com.apollographql.apollo.api.Optional<java.lang.Boolean> skipNotification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outstandingBalanceDispositionPreferences, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipNotification, "");
        return new com.paypal.oslo.api.graphql.schema.type.CloseAccountInput(outstandingBalanceDispositionPreferences, reason, skipNotification);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component3() {
        return this.skipNotification;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.reason;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CloseAccountOutstandingBalanceDispositionInput> component1() {
        return this.outstandingBalanceDispositionPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CloseAccountInput copy$default(com.paypal.oslo.api.graphql.schema.type.CloseAccountInput closeAccountInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = closeAccountInput.outstandingBalanceDispositionPreferences;
        }
        if ((i & 2) != 0) {
            optional2 = closeAccountInput.reason;
        }
        if ((i & 4) != 0) {
            optional3 = closeAccountInput.skipNotification;
        }
        return closeAccountInput.copy(optional, optional2, optional3);
    }

    public CloseAccountInput() {
        this(null, null, null, 7, null);
    }
}
