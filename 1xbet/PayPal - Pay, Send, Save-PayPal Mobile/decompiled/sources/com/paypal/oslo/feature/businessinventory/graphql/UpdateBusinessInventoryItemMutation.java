package com.paypal.oslo.feature.businessinventory.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemInput;)Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemInput;", "getInput", "Companion", "Data", "UpdateMerchantItemV2"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdateBusinessInventoryItemMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.Data> {
    public static final java.lang.String OPERATION_ID = "540eda4dc17a76490614f7f3c15aa621a82f7cfab14a6baaca5c5e2425a70197";
    public static final java.lang.String OPERATION_NAME = "UpdateBusinessInventoryItem";
    private final com.paypal.oslo.api.graphql.schema.type.MerchantItemInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.Companion INSTANCE = new com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateBusinessInventoryItemMutation(com.paypal.oslo.api.graphql.schema.type.MerchantItemInput merchantItemInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantItemInput, "");
        this.input = merchantItemInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MerchantItemInput getInput() {
        return this.input;
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
        com.paypal.oslo.feature.businessinventory.graphql.adapter.UpdateBusinessInventoryItemMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businessinventory.graphql.adapter.UpdateBusinessInventoryItemMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.businessinventory.graphql.selections.UpdateBusinessInventoryItemMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation$UpdateMerchantItemV2;", "updateMerchantItemV2", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation$UpdateMerchantItemV2;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation$UpdateMerchantItemV2;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation$UpdateMerchantItemV2;)Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation$UpdateMerchantItemV2;", "getUpdateMerchantItemV2"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2 updateMerchantItemV2;

        public Data(com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2 updateMerchantItemV2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateMerchantItemV2, "");
            this.updateMerchantItemV2 = updateMerchantItemV2;
        }

        public final com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2 getUpdateMerchantItemV2() {
            return this.updateMerchantItemV2;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2 updateMerchantItemV2 = this.updateMerchantItemV2;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateMerchantItemV2=");
            sb.append(updateMerchantItemV2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updateMerchantItemV2.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateMerchantItemV2, ((com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.Data) other).updateMerchantItemV2);
        }

        public final com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.Data copy(com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2 updateMerchantItemV2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateMerchantItemV2, "");
            return new com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.Data(updateMerchantItemV2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2 getUpdateMerchantItemV2() {
            return this.updateMerchantItemV2;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.Data copy$default(com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.Data data, com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2 updateMerchantItemV2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateMerchantItemV2 = data.updateMerchantItemV2;
            }
            return data.copy(updateMerchantItemV2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation$UpdateMerchantItemV2;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation$UpdateMerchantItemV2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateMerchantItemV2 {
        public static final int $stable = 0;
        private final java.lang.String id;

        public UpdateMerchantItemV2(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateMerchantItemV2(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2) other).id);
        }

        public final com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2 copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2 copy$default(com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation.UpdateMerchantItemV2 updateMerchantItemV2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateMerchantItemV2.id;
            }
            return updateMerchantItemV2.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/UpdateBusinessInventoryItemMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateBusinessInventoryItem($input: MerchantItemInput!) { updateMerchantItemV2(input: $input) { id } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.MerchantItemInput merchantItemInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateBusinessInventoryItemMutation(input=");
        sb.append(merchantItemInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation) other).input);
    }

    public final com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation copy(com.paypal.oslo.api.graphql.schema.type.MerchantItemInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MerchantItemInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation copy$default(com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation updateBusinessInventoryItemMutation, com.paypal.oslo.api.graphql.schema.type.MerchantItemInput merchantItemInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            merchantItemInput = updateBusinessInventoryItemMutation.input;
        }
        return updateBusinessInventoryItemMutation.copy(merchantItemInput);
    }
}
