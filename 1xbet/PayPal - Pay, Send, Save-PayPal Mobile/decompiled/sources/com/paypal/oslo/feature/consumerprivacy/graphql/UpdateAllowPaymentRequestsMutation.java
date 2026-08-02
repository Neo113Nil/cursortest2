package com.paypal.oslo.feature.consumerprivacy.graphql;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003,-+B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ$\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation$Data;", "", "allowFindByIdentifiers", "allowPaymentRequests", "<init>", "(ZZ)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getAllowFindByIdentifiers", "getAllowPaymentRequests", "Companion", "Data", com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UpdateAllowPaymentRequestsMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Companion INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Companion(null);
    public static final java.lang.String OPERATION_ID = "428a796d664ffc1da1bcbcc77bce377da8b3cbd808578ddf648b61ddfb628d00";
    public static final java.lang.String OPERATION_NAME = "UpdateAllowPaymentRequests";
    private final boolean allowFindByIdentifiers;
    private final boolean allowPaymentRequests;

    public UpdateAllowPaymentRequestsMutation(boolean z, boolean z2) {
        this.allowFindByIdentifiers = z;
        this.allowPaymentRequests = z2;
    }

    public final boolean getAllowFindByIdentifiers() {
        return this.allowFindByIdentifiers;
    }

    public final boolean getAllowPaymentRequests() {
        return this.allowPaymentRequests;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdateAllowPaymentRequestsMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdateAllowPaymentRequestsMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.consumerprivacy.graphql.selections.UpdateAllowPaymentRequestsMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation$UpdateAllowPaymentRequests;", "updateAllowPaymentRequests", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation$UpdateAllowPaymentRequests;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation$UpdateAllowPaymentRequests;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation$UpdateAllowPaymentRequests;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation$UpdateAllowPaymentRequests;", "getUpdateAllowPaymentRequests"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests updateAllowPaymentRequests;

        public Data(com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests updateAllowPaymentRequests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowPaymentRequests, "");
            this.updateAllowPaymentRequests = updateAllowPaymentRequests;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests getUpdateAllowPaymentRequests() {
            return this.updateAllowPaymentRequests;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests updateAllowPaymentRequests = this.updateAllowPaymentRequests;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateAllowPaymentRequests=");
            sb.append(updateAllowPaymentRequests);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updateAllowPaymentRequests.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateAllowPaymentRequests, ((com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data) other).updateAllowPaymentRequests);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data copy(com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests updateAllowPaymentRequests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowPaymentRequests, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data(updateAllowPaymentRequests);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests getUpdateAllowPaymentRequests() {
            return this.updateAllowPaymentRequests;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data data, com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests updateAllowPaymentRequests, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateAllowPaymentRequests = data.updateAllowPaymentRequests;
            }
            return data.copy(updateAllowPaymentRequests);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation$UpdateAllowPaymentRequests;", "", "", "success", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation$UpdateAllowPaymentRequests;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAllowPaymentRequests {
        public static final int $stable = 0;
        private final boolean success;

        public UpdateAllowPaymentRequests(boolean z) {
            this.success = z;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAllowPaymentRequests(success=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.success);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests) && this.success == ((com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests) other).success;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests copy(boolean success) {
            return new com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests(success);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests updateAllowPaymentRequests, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = updateAllowPaymentRequests.success;
            }
            return updateAllowPaymentRequests.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowPaymentRequestsMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateAllowPaymentRequests($allowFindByIdentifiers: Boolean!, $allowPaymentRequests: Boolean!) { updateAllowPaymentRequests(input: { allowFindByIdentifiers: $allowFindByIdentifiers allowPaymentRequests: $allowPaymentRequests } ) { success } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        boolean z = this.allowFindByIdentifiers;
        boolean z2 = this.allowPaymentRequests;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAllowPaymentRequestsMutation(allowFindByIdentifiers=");
        sb.append(z);
        sb.append(", allowPaymentRequests=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.allowFindByIdentifiers) * 31) + java.lang.Boolean.hashCode(this.allowPaymentRequests);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation)) {
            return false;
        }
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation updateAllowPaymentRequestsMutation = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation) other;
        return this.allowFindByIdentifiers == updateAllowPaymentRequestsMutation.allowFindByIdentifiers && this.allowPaymentRequests == updateAllowPaymentRequestsMutation.allowPaymentRequests;
    }

    public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation copy(boolean allowFindByIdentifiers, boolean allowPaymentRequests) {
        return new com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation(allowFindByIdentifiers, allowPaymentRequests);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAllowPaymentRequests() {
        return this.allowPaymentRequests;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAllowFindByIdentifiers() {
        return this.allowFindByIdentifiers;
    }

    public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation updateAllowPaymentRequestsMutation, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = updateAllowPaymentRequestsMutation.allowFindByIdentifiers;
        }
        if ((i & 2) != 0) {
            z2 = updateAllowPaymentRequestsMutation.allowPaymentRequests;
        }
        return updateAllowPaymentRequestsMutation.copy(z, z2);
    }
}
