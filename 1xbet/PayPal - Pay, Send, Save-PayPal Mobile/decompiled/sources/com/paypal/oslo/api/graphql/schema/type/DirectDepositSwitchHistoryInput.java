package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0004\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJN\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR*\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR*\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DirectDepositSwitchHistoryInput;", "", "", "directDepositIntegrationId", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DirectDepositSwitchStep;", "steps", "Lcom/paypal/oslo/api/graphql/schema/type/DirectDepositSwitchStatus;", "statuses", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DirectDepositSwitchHistoryInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDirectDepositIntegrationId", "Lcom/apollographql/apollo/api/Optional;", "getSteps", "getStatuses"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DirectDepositSwitchHistoryInput {
    private final java.lang.String directDepositIntegrationId;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStatus>> statuses;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStep>> steps;

    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositSwitchHistoryInput(java.lang.String str, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStep>> optional, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStatus>> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.directDepositIntegrationId = str;
        this.steps = optional;
        this.statuses = optional2;
    }

    public final java.lang.String getDirectDepositIntegrationId() {
        return this.directDepositIntegrationId;
    }

    public /* synthetic */ DirectDepositSwitchHistoryInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStep>> getSteps() {
        return this.steps;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStatus>> getStatuses() {
        return this.statuses;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.directDepositIntegrationId;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStep>> optional = this.steps;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStatus>> optional2 = this.statuses;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DirectDepositSwitchHistoryInput(directDepositIntegrationId=");
        sb.append(str);
        sb.append(", steps=");
        sb.append(optional);
        sb.append(", statuses=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.directDepositIntegrationId.hashCode() * 31) + this.steps.hashCode()) * 31) + this.statuses.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchHistoryInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchHistoryInput directDepositSwitchHistoryInput = (com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchHistoryInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.directDepositIntegrationId, directDepositSwitchHistoryInput.directDepositIntegrationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.steps, directDepositSwitchHistoryInput.steps) && kotlin.jvm.internal.Intrinsics.areEqual(this.statuses, directDepositSwitchHistoryInput.statuses);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchHistoryInput copy(java.lang.String directDepositIntegrationId, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStep>> steps, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStatus>> statuses) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositIntegrationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(steps, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statuses, "");
        return new com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchHistoryInput(directDepositIntegrationId, steps, statuses);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStatus>> component3() {
        return this.statuses;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchStep>> component2() {
        return this.steps;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDirectDepositIntegrationId() {
        return this.directDepositIntegrationId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchHistoryInput copy$default(com.paypal.oslo.api.graphql.schema.type.DirectDepositSwitchHistoryInput directDepositSwitchHistoryInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = directDepositSwitchHistoryInput.directDepositIntegrationId;
        }
        if ((i & 2) != 0) {
            optional = directDepositSwitchHistoryInput.steps;
        }
        if ((i & 4) != 0) {
            optional2 = directDepositSwitchHistoryInput.statuses;
        }
        return directDepositSwitchHistoryInput.copy(str, optional, optional2);
    }
}
