package com.paypal.oslo.feature.consumerprivacy.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RemoveProviderConsentWithDataInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RemoveProviderConsentWithDataInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RemoveProviderConsentWithDataInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RemoveProviderConsentWithDataInput;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RemoveProviderConsentWithDataInput;", "getInput", "Companion", "Data", "RemoveProviderConsentWithData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RemoveConsumerPrivacyProviderConsentWithDataMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data> {
    public static final java.lang.String OPERATION_ID = "f18b3342e4e432cfb48c90f52fd8f796fb0d4c858e46a8b29e77dcd03477b95f";
    public static final java.lang.String OPERATION_NAME = "RemoveConsumerPrivacyProviderConsentWithData";
    private final com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Companion INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Companion(null);
    public static final int $stable = 8;

    public RemoveConsumerPrivacyProviderConsentWithDataMutation(com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput removeProviderConsentWithDataInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeProviderConsentWithDataInput, "");
        this.input = removeProviderConsentWithDataInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput getInput() {
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
        com.paypal.oslo.feature.consumerprivacy.graphql.adapter.RemoveConsumerPrivacyProviderConsentWithDataMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.RemoveConsumerPrivacyProviderConsentWithDataMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.consumerprivacy.graphql.selections.RemoveConsumerPrivacyProviderConsentWithDataMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation$RemoveProviderConsentWithData;", "removeProviderConsentWithData", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation$RemoveProviderConsentWithData;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation$RemoveProviderConsentWithData;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation$RemoveProviderConsentWithData;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation$RemoveProviderConsentWithData;", "getRemoveProviderConsentWithData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData removeProviderConsentWithData;

        public Data(com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData removeProviderConsentWithData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeProviderConsentWithData, "");
            this.removeProviderConsentWithData = removeProviderConsentWithData;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData getRemoveProviderConsentWithData() {
            return this.removeProviderConsentWithData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData removeProviderConsentWithData = this.removeProviderConsentWithData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(removeProviderConsentWithData=");
            sb.append(removeProviderConsentWithData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.removeProviderConsentWithData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.removeProviderConsentWithData, ((com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data) other).removeProviderConsentWithData);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data copy(com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData removeProviderConsentWithData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeProviderConsentWithData, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data(removeProviderConsentWithData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData getRemoveProviderConsentWithData() {
            return this.removeProviderConsentWithData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data data, com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData removeProviderConsentWithData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                removeProviderConsentWithData = data.removeProviderConsentWithData;
            }
            return data.copy(removeProviderConsentWithData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation$RemoveProviderConsentWithData;", "", "", "deauthorized", "dataDeleted", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation$RemoveProviderConsentWithData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getDeauthorized", "getDataDeleted"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemoveProviderConsentWithData {
        public static final int $stable = 0;
        private final boolean dataDeleted;
        private final boolean deauthorized;

        public RemoveProviderConsentWithData(boolean z, boolean z2) {
            this.deauthorized = z;
            this.dataDeleted = z2;
        }

        public final boolean getDeauthorized() {
            return this.deauthorized;
        }

        public final boolean getDataDeleted() {
            return this.dataDeleted;
        }

        public final java.lang.String toString() {
            boolean z = this.deauthorized;
            boolean z2 = this.dataDeleted;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveProviderConsentWithData(deauthorized=");
            sb.append(z);
            sb.append(", dataDeleted=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.deauthorized) * 31) + java.lang.Boolean.hashCode(this.dataDeleted);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData removeProviderConsentWithData = (com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData) other;
            return this.deauthorized == removeProviderConsentWithData.deauthorized && this.dataDeleted == removeProviderConsentWithData.dataDeleted;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData copy(boolean deauthorized, boolean dataDeleted) {
            return new com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData(deauthorized, dataDeleted);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDataDeleted() {
            return this.dataDeleted;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getDeauthorized() {
            return this.deauthorized;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData removeProviderConsentWithData, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = removeProviderConsentWithData.deauthorized;
            }
            if ((i & 2) != 0) {
                z2 = removeProviderConsentWithData.dataDeleted;
            }
            return removeProviderConsentWithData.copy(z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/RemoveConsumerPrivacyProviderConsentWithDataMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation RemoveConsumerPrivacyProviderConsentWithData($input: RemoveProviderConsentWithDataInput!) { removeProviderConsentWithData(input: $input) { deauthorized dataDeleted } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput removeProviderConsentWithDataInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveConsumerPrivacyProviderConsentWithDataMutation(input=");
        sb.append(removeProviderConsentWithDataInput);
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
        return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation) other).input);
    }

    public final com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation copy(com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation removeConsumerPrivacyProviderConsentWithDataMutation, com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput removeProviderConsentWithDataInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            removeProviderConsentWithDataInput = removeConsumerPrivacyProviderConsentWithDataMutation.input;
        }
        return removeConsumerPrivacyProviderConsentWithDataMutation.copy(removeProviderConsentWithDataInput);
    }
}
