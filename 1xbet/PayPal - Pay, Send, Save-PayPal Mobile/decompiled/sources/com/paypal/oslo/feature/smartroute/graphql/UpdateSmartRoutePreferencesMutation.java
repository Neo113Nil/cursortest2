package com.paypal.oslo.feature.smartroute.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\b*+,-./0)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateSmartRoutePreferencesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateSmartRoutePreferencesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateSmartRoutePreferencesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateSmartRoutePreferencesInput;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateSmartRoutePreferencesInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OPERATION_NAME, "Preferences", "Distribution", "Target", "Allocation", "OnSmartRoutePercentage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UpdateSmartRoutePreferencesMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data> {
    public static final java.lang.String OPERATION_ID = "359b31a8b0bc7e7c8ba9e818735272e6762eff9ca82359b9fd1df03686b36044";
    public static final java.lang.String OPERATION_NAME = "UpdateSmartRoutePreferences";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Companion INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateSmartRoutePreferencesMutation(com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput updateSmartRoutePreferencesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateSmartRoutePreferencesInput, "");
        this.input = updateSmartRoutePreferencesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput getInput() {
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
        com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.smartroute.graphql.selections.UpdateSmartRoutePreferencesMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$UpdateSmartRoutePreferences;", "updateSmartRoutePreferences", "<init>", "(Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$UpdateSmartRoutePreferences;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$UpdateSmartRoutePreferences;", "copy", "(Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$UpdateSmartRoutePreferences;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$UpdateSmartRoutePreferences;", "getUpdateSmartRoutePreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences updateSmartRoutePreferences;

        public Data(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences updateSmartRoutePreferences) {
            this.updateSmartRoutePreferences = updateSmartRoutePreferences;
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences getUpdateSmartRoutePreferences() {
            return this.updateSmartRoutePreferences;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences updateSmartRoutePreferences = this.updateSmartRoutePreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateSmartRoutePreferences=");
            sb.append(updateSmartRoutePreferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences updateSmartRoutePreferences = this.updateSmartRoutePreferences;
            if (updateSmartRoutePreferences == null) {
                return 0;
            }
            return updateSmartRoutePreferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateSmartRoutePreferences, ((com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data) other).updateSmartRoutePreferences);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data copy(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences updateSmartRoutePreferences) {
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data(updateSmartRoutePreferences);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences getUpdateSmartRoutePreferences() {
            return this.updateSmartRoutePreferences;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data data, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences updateSmartRoutePreferences, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateSmartRoutePreferences = data.updateSmartRoutePreferences;
            }
            return data.copy(updateSmartRoutePreferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$UpdateSmartRoutePreferences;", "", "", "success", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;", "preferences", "<init>", "(ZLcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;", "copy", "(ZLcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$UpdateSmartRoutePreferences;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;", "getPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateSmartRoutePreferences {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences preferences;
        private final boolean success;

        public UpdateSmartRoutePreferences(boolean z, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences preferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferences, "");
            this.success = z;
            this.preferences = preferences;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences getPreferences() {
            return this.preferences;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences preferences = this.preferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSmartRoutePreferences(success=");
            sb.append(z);
            sb.append(", preferences=");
            sb.append(preferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.success) * 31) + this.preferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences updateSmartRoutePreferences = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences) other;
            return this.success == updateSmartRoutePreferences.success && kotlin.jvm.internal.Intrinsics.areEqual(this.preferences, updateSmartRoutePreferences.preferences);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences copy(boolean success, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences preferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferences, "");
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences(success, preferences);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences getPreferences() {
            return this.preferences;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences updateSmartRoutePreferences, boolean z, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences preferences, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = updateSmartRoutePreferences.success;
            }
            if ((i & 2) != 0) {
                preferences = updateSmartRoutePreferences.preferences;
            }
            return updateSmartRoutePreferences.copy(z, preferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;", "", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Distribution;", "distribution", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "status", "", "version", "<init>", "(Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Distribution;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Distribution;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Distribution;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Distribution;", "getDistribution", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "getStatus", "Ljava/lang/String;", "getVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Preferences {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution distribution;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus status;
        private final java.lang.String version;

        public Preferences(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution distribution, com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distribution, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.distribution = distribution;
            this.status = smartRouteStatus;
            this.version = str;
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution getDistribution() {
            return this.distribution;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution distribution = this.distribution;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus = this.status;
            java.lang.String str = this.version;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Preferences(distribution=");
            sb.append(distribution);
            sb.append(", status=");
            sb.append(smartRouteStatus);
            sb.append(", version=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.distribution.hashCode() * 31) + this.status.hashCode()) * 31) + this.version.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences preferences = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.distribution, preferences.distribution) && this.status == preferences.status && kotlin.jvm.internal.Intrinsics.areEqual(this.version, preferences.version);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences copy(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution distribution, com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus status, java.lang.String version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distribution, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences(distribution, status, version);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution getDistribution() {
            return this.distribution;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences preferences, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution distribution, com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                distribution = preferences.distribution;
            }
            if ((i & 2) != 0) {
                smartRouteStatus = preferences.status;
            }
            if ((i & 4) != 0) {
                str = preferences.version;
            }
            return preferences.copy(distribution, smartRouteStatus, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Distribution;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;", "source", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;", "method", "", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Target;", "targets", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;Ljava/util/List;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Distribution;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;", "getSource", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;", "getMethod", "Ljava/util/List;", "getTargets"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Distribution {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod method;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource source;
        private final java.util.List<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target> targets;

        public Distribution(com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource smartRouteFundingSource, com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod smartRouteDistributionMethod, java.util.List<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteFundingSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteDistributionMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.source = smartRouteFundingSource;
            this.method = smartRouteDistributionMethod;
            this.targets = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource getSource() {
            return this.source;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod getMethod() {
            return this.method;
        }

        public final java.util.List<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target> getTargets() {
            return this.targets;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource smartRouteFundingSource = this.source;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod smartRouteDistributionMethod = this.method;
            java.util.List<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target> list = this.targets;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Distribution(source=");
            sb.append(smartRouteFundingSource);
            sb.append(", method=");
            sb.append(smartRouteDistributionMethod);
            sb.append(", targets=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.source.hashCode() * 31) + this.method.hashCode()) * 31) + this.targets.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution distribution = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution) other;
            return this.source == distribution.source && this.method == distribution.method && kotlin.jvm.internal.Intrinsics.areEqual(this.targets, distribution.targets);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution copy(com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource source, com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod method, java.util.List<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target> targets) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targets, "");
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution(source, method, targets);
        }

        public final java.util.List<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target> component3() {
            return this.targets;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod getMethod() {
            return this.method;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource getSource() {
            return this.source;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution distribution, com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource smartRouteFundingSource, com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod smartRouteDistributionMethod, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smartRouteFundingSource = distribution.source;
            }
            if ((i & 2) != 0) {
                smartRouteDistributionMethod = distribution.method;
            }
            if ((i & 4) != 0) {
                list = distribution.targets;
            }
            return distribution.copy(smartRouteFundingSource, smartRouteDistributionMethod, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Target;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteAccountType;", "accountType", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;", "eligibilityStatus", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Allocation;", "allocation", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteAccountType;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Allocation;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteAccountType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;", "component3", "()Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Allocation;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteAccountType;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Allocation;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Target;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteAccountType;", "getAccountType", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;", "getEligibilityStatus", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Allocation;", "getAllocation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Target {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType accountType;
        private final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation allocation;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus eligibilityStatus;

        public Target(com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType smartRouteAccountType, com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus smartRouteTargetEligibilityStatus, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation allocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteAccountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteTargetEligibilityStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allocation, "");
            this.accountType = smartRouteAccountType;
            this.eligibilityStatus = smartRouteTargetEligibilityStatus;
            this.allocation = allocation;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType getAccountType() {
            return this.accountType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation getAllocation() {
            return this.allocation;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType smartRouteAccountType = this.accountType;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus smartRouteTargetEligibilityStatus = this.eligibilityStatus;
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation allocation = this.allocation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Target(accountType=");
            sb.append(smartRouteAccountType);
            sb.append(", eligibilityStatus=");
            sb.append(smartRouteTargetEligibilityStatus);
            sb.append(", allocation=");
            sb.append(allocation);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.accountType.hashCode() * 31) + this.eligibilityStatus.hashCode()) * 31) + this.allocation.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target target = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target) other;
            return this.accountType == target.accountType && this.eligibilityStatus == target.eligibilityStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.allocation, target.allocation);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target copy(com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType accountType, com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus eligibilityStatus, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation allocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allocation, "");
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target(accountType, eligibilityStatus, allocation);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation getAllocation() {
            return this.allocation;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType getAccountType() {
            return this.accountType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target target, com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType smartRouteAccountType, com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus smartRouteTargetEligibilityStatus, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation allocation, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smartRouteAccountType = target.accountType;
            }
            if ((i & 2) != 0) {
                smartRouteTargetEligibilityStatus = target.eligibilityStatus;
            }
            if ((i & 4) != 0) {
                allocation = target.allocation;
            }
            return target.copy(smartRouteAccountType, smartRouteTargetEligibilityStatus, allocation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Allocation;", "", "", "__typename", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$OnSmartRoutePercentage;", "onSmartRoutePercentage", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$OnSmartRoutePercentage;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$OnSmartRoutePercentage;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$OnSmartRoutePercentage;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Allocation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$OnSmartRoutePercentage;", "getOnSmartRoutePercentage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Allocation {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage onSmartRoutePercentage;

        public Allocation(java.lang.String str, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage onSmartRoutePercentage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onSmartRoutePercentage = onSmartRoutePercentage;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage getOnSmartRoutePercentage() {
            return this.onSmartRoutePercentage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage onSmartRoutePercentage = this.onSmartRoutePercentage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Allocation(__typename=");
            sb.append(str);
            sb.append(", onSmartRoutePercentage=");
            sb.append(onSmartRoutePercentage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage onSmartRoutePercentage = this.onSmartRoutePercentage;
            return (hashCode * 31) + (onSmartRoutePercentage == null ? 0 : onSmartRoutePercentage.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation allocation = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, allocation.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSmartRoutePercentage, allocation.onSmartRoutePercentage);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation copy(java.lang.String __typename, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage onSmartRoutePercentage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation(__typename, onSmartRoutePercentage);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage getOnSmartRoutePercentage() {
            return this.onSmartRoutePercentage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation allocation, java.lang.String str, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage onSmartRoutePercentage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = allocation.__typename;
            }
            if ((i & 2) != 0) {
                onSmartRoutePercentage = allocation.onSmartRoutePercentage;
            }
            return allocation.copy(str, onSmartRoutePercentage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$OnSmartRoutePercentage;", "", "", "__typename", "", "percentageValue", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$OnSmartRoutePercentage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "get__typename", com.visa.cbp.getEncExpo.warmup, "getPercentageValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSmartRoutePercentage {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final int percentageValue;

        public OnSmartRoutePercentage(java.lang.String str, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.percentageValue = i;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final int getPercentageValue() {
            return this.percentageValue;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            int i = this.percentageValue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSmartRoutePercentage(__typename=");
            sb.append(str);
            sb.append(", percentageValue=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + java.lang.Integer.hashCode(this.percentageValue);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage onSmartRoutePercentage = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onSmartRoutePercentage.__typename) && this.percentageValue == onSmartRoutePercentage.percentageValue;
        }

        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage copy(java.lang.String __typename, int percentageValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage(__typename, percentageValue);
        }

        /* renamed from: component2, reason: from getter */
        public final int getPercentageValue() {
            return this.percentageValue;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage onSmartRoutePercentage, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = onSmartRoutePercentage.__typename;
            }
            if ((i2 & 2) != 0) {
                i = onSmartRoutePercentage.percentageValue;
            }
            return onSmartRoutePercentage.copy(str, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateSmartRoutePreferences($input: UpdateSmartRoutePreferencesInput!) { updateSmartRoutePreferences(input: $input) { success preferences { distribution { source method targets { accountType eligibilityStatus allocation { __typename ... on SmartRoutePercentage { __typename percentageValue: value } } } } status version } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput updateSmartRoutePreferencesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSmartRoutePreferencesMutation(input=");
        sb.append(updateSmartRoutePreferencesInput);
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
        return (other instanceof com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation) other).input);
    }

    public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation copy$default(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation updateSmartRoutePreferencesMutation, com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput updateSmartRoutePreferencesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateSmartRoutePreferencesInput = updateSmartRoutePreferencesMutation.input;
        }
        return updateSmartRoutePreferencesMutation.copy(updateSmartRoutePreferencesInput);
    }
}
