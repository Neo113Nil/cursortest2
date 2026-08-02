package com.paypal.oslo.feature.consumerprivacy.graphql;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation$Data;", "", "allowRequestMoneyByName", "<init>", "(Z)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getAllowRequestMoneyByName", "Companion", "Data", com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UpdateAllowRequestMoneyByNameMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Companion INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Companion(null);
    public static final java.lang.String OPERATION_ID = "9a505133e3a4748d83959fd49742c91fbcd82bee7cd3292faa8fdfe741e98876";
    public static final java.lang.String OPERATION_NAME = "UpdateAllowRequestMoneyByName";
    private final boolean allowRequestMoneyByName;

    public UpdateAllowRequestMoneyByNameMutation(boolean z) {
        this.allowRequestMoneyByName = z;
    }

    public final boolean getAllowRequestMoneyByName() {
        return this.allowRequestMoneyByName;
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
        com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdateAllowRequestMoneyByNameMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdateAllowRequestMoneyByNameMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.consumerprivacy.graphql.selections.UpdateAllowRequestMoneyByNameMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation$UpdateAllowRequestMoneyByName;", "updateAllowRequestMoneyByName", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation$UpdateAllowRequestMoneyByName;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation$UpdateAllowRequestMoneyByName;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation$UpdateAllowRequestMoneyByName;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation$UpdateAllowRequestMoneyByName;", "getUpdateAllowRequestMoneyByName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName updateAllowRequestMoneyByName;

        public Data(com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName updateAllowRequestMoneyByName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowRequestMoneyByName, "");
            this.updateAllowRequestMoneyByName = updateAllowRequestMoneyByName;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName getUpdateAllowRequestMoneyByName() {
            return this.updateAllowRequestMoneyByName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName updateAllowRequestMoneyByName = this.updateAllowRequestMoneyByName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateAllowRequestMoneyByName=");
            sb.append(updateAllowRequestMoneyByName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updateAllowRequestMoneyByName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateAllowRequestMoneyByName, ((com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data) other).updateAllowRequestMoneyByName);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data copy(com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName updateAllowRequestMoneyByName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowRequestMoneyByName, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data(updateAllowRequestMoneyByName);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName getUpdateAllowRequestMoneyByName() {
            return this.updateAllowRequestMoneyByName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data data, com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName updateAllowRequestMoneyByName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateAllowRequestMoneyByName = data.updateAllowRequestMoneyByName;
            }
            return data.copy(updateAllowRequestMoneyByName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation$UpdateAllowRequestMoneyByName;", "", "", "success", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation$UpdateAllowRequestMoneyByName;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAllowRequestMoneyByName {
        public static final int $stable = 0;
        private final boolean success;

        public UpdateAllowRequestMoneyByName(boolean z) {
            this.success = z;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAllowRequestMoneyByName(success=");
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
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName) && this.success == ((com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName) other).success;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName copy(boolean success) {
            return new com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName(success);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName updateAllowRequestMoneyByName, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = updateAllowRequestMoneyByName.success;
            }
            return updateAllowRequestMoneyByName.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdateAllowRequestMoneyByNameMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateAllowRequestMoneyByName($allowRequestMoneyByName: Boolean!) { updateAllowRequestMoneyByName(input: { allowRequestMoneyByName: $allowRequestMoneyByName } ) { success } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        boolean z = this.allowRequestMoneyByName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAllowRequestMoneyByNameMutation(allowRequestMoneyByName=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.allowRequestMoneyByName);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation) && this.allowRequestMoneyByName == ((com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation) other).allowRequestMoneyByName;
    }

    public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation copy(boolean allowRequestMoneyByName) {
        return new com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation(allowRequestMoneyByName);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAllowRequestMoneyByName() {
        return this.allowRequestMoneyByName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation updateAllowRequestMoneyByNameMutation, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = updateAllowRequestMoneyByNameMutation.allowRequestMoneyByName;
        }
        return updateAllowRequestMoneyByNameMutation.copy(z);
    }
}
