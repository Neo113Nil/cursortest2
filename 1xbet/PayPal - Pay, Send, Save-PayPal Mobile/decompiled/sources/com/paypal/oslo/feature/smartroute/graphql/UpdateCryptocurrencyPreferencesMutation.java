package com.paypal.oslo.feature.smartroute.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateCryptocurrencyPreferencesInput;", "updateCryptocurrencyPreferencesInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateCryptocurrencyPreferencesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateCryptocurrencyPreferencesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateCryptocurrencyPreferencesInput;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateCryptocurrencyPreferencesInput;", "getUpdateCryptocurrencyPreferencesInput", "Companion", "Data", com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.OPERATION_NAME, "ActionPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UpdateCryptocurrencyPreferencesMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data> {
    public static final java.lang.String OPERATION_ID = "c7ee1940d7be278d17aad690c43ca5d66f2db8d325630b83f0a90999e223d2b6";
    public static final java.lang.String OPERATION_NAME = "UpdateCryptocurrencyPreferences";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyPreferencesInput updateCryptocurrencyPreferencesInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Companion INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateCryptocurrencyPreferencesMutation(com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyPreferencesInput updateCryptocurrencyPreferencesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCryptocurrencyPreferencesInput, "");
        this.updateCryptocurrencyPreferencesInput = updateCryptocurrencyPreferencesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyPreferencesInput getUpdateCryptocurrencyPreferencesInput() {
        return this.updateCryptocurrencyPreferencesInput;
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
        com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.smartroute.graphql.selections.UpdateCryptocurrencyPreferencesMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$UpdateCryptocurrencyPreferences;", "updateCryptocurrencyPreferences", "<init>", "(Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$UpdateCryptocurrencyPreferences;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$UpdateCryptocurrencyPreferences;", "copy", "(Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$UpdateCryptocurrencyPreferences;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$UpdateCryptocurrencyPreferences;", "getUpdateCryptocurrencyPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences updateCryptocurrencyPreferences;

        public Data(com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences updateCryptocurrencyPreferences) {
            this.updateCryptocurrencyPreferences = updateCryptocurrencyPreferences;
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences getUpdateCryptocurrencyPreferences() {
            return this.updateCryptocurrencyPreferences;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences updateCryptocurrencyPreferences = this.updateCryptocurrencyPreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateCryptocurrencyPreferences=");
            sb.append(updateCryptocurrencyPreferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences updateCryptocurrencyPreferences = this.updateCryptocurrencyPreferences;
            if (updateCryptocurrencyPreferences == null) {
                return 0;
            }
            return updateCryptocurrencyPreferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateCryptocurrencyPreferences, ((com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data) other).updateCryptocurrencyPreferences);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data copy(com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences updateCryptocurrencyPreferences) {
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data(updateCryptocurrencyPreferences);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences getUpdateCryptocurrencyPreferences() {
            return this.updateCryptocurrencyPreferences;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data data, com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences updateCryptocurrencyPreferences, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateCryptocurrencyPreferences = data.updateCryptocurrencyPreferences;
            }
            return data.copy(updateCryptocurrencyPreferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$UpdateCryptocurrencyPreferences;", "", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$ActionPreference;", "actionPreference", "<init>", "(Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$ActionPreference;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$ActionPreference;", "copy", "(Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$ActionPreference;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$UpdateCryptocurrencyPreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$ActionPreference;", "getActionPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateCryptocurrencyPreferences {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference actionPreference;

        public UpdateCryptocurrencyPreferences(com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference actionPreference) {
            this.actionPreference = actionPreference;
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference getActionPreference() {
            return this.actionPreference;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference actionPreference = this.actionPreference;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateCryptocurrencyPreferences(actionPreference=");
            sb.append(actionPreference);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference actionPreference = this.actionPreference;
            if (actionPreference == null) {
                return 0;
            }
            return actionPreference.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionPreference, ((com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences) other).actionPreference);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences copy(com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference actionPreference) {
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences(actionPreference);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference getActionPreference() {
            return this.actionPreference;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences updateCryptocurrencyPreferences, com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference actionPreference, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                actionPreference = updateCryptocurrencyPreferences.actionPreference;
            }
            return updateCryptocurrencyPreferences.copy(actionPreference);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$ActionPreference;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "status", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$ActionPreference;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActionPreference {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus status;

        public ActionPreference(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyPreferenceStatus, "");
            this.status = cryptocurrencyPreferenceStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActionPreference(status=");
            sb.append(cryptocurrencyPreferenceStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference) && this.status == ((com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference) other).status;
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference(status);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference actionPreference, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyPreferenceStatus = actionPreference.status;
            }
            return actionPreference.copy(cryptocurrencyPreferenceStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateCryptocurrencyPreferences($updateCryptocurrencyPreferencesInput: UpdateCryptocurrencyPreferencesInput!) { updateCryptocurrencyPreferences(input: $updateCryptocurrencyPreferencesInput) { actionPreference { status } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyPreferencesInput updateCryptocurrencyPreferencesInput = this.updateCryptocurrencyPreferencesInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateCryptocurrencyPreferencesMutation(updateCryptocurrencyPreferencesInput=");
        sb.append(updateCryptocurrencyPreferencesInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.updateCryptocurrencyPreferencesInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateCryptocurrencyPreferencesInput, ((com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation) other).updateCryptocurrencyPreferencesInput);
    }

    public final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyPreferencesInput updateCryptocurrencyPreferencesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCryptocurrencyPreferencesInput, "");
        return new com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation(updateCryptocurrencyPreferencesInput);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyPreferencesInput getUpdateCryptocurrencyPreferencesInput() {
        return this.updateCryptocurrencyPreferencesInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation updateCryptocurrencyPreferencesMutation, com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyPreferencesInput updateCryptocurrencyPreferencesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateCryptocurrencyPreferencesInput = updateCryptocurrencyPreferencesMutation.updateCryptocurrencyPreferencesInput;
        }
        return updateCryptocurrencyPreferencesMutation.copy(updateCryptocurrencyPreferencesInput);
    }
}
