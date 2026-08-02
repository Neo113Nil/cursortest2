package com.paypal.oslo.feature.pushnotification.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePushNotificationPreferencesInput;", "updatePushNotificationPreferencesInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdatePushNotificationPreferencesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdatePushNotificationPreferencesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdatePushNotificationPreferencesInput;)Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePushNotificationPreferencesInput;", "getUpdatePushNotificationPreferencesInput", "Companion", "Data", com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.OPERATION_NAME, "Preference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UpdatePushNotificationPreferencesMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data> {
    public static final java.lang.String OPERATION_ID = "ffa568074ac9f18b0bd962351bf01f91a03fb96faaaa4b7581f6a77f6b1a381c";
    public static final java.lang.String OPERATION_NAME = "UpdatePushNotificationPreferences";
    private final com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput updatePushNotificationPreferencesInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Companion INSTANCE = new com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Companion(null);
    public static final int $stable = 8;

    public UpdatePushNotificationPreferencesMutation(com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput updatePushNotificationPreferencesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePushNotificationPreferencesInput, "");
        this.updatePushNotificationPreferencesInput = updatePushNotificationPreferencesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput getUpdatePushNotificationPreferencesInput() {
        return this.updatePushNotificationPreferencesInput;
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
        com.paypal.oslo.feature.pushnotification.graphql.adapter.UpdatePushNotificationPreferencesMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.pushnotification.graphql.adapter.UpdatePushNotificationPreferencesMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.pushnotification.graphql.selections.UpdatePushNotificationPreferencesMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$UpdatePushNotificationPreferences;", "updatePushNotificationPreferences", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$UpdatePushNotificationPreferences;)V", "component1", "()Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$UpdatePushNotificationPreferences;", "copy", "(Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$UpdatePushNotificationPreferences;)Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$UpdatePushNotificationPreferences;", "getUpdatePushNotificationPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences updatePushNotificationPreferences;

        public Data(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences updatePushNotificationPreferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePushNotificationPreferences, "");
            this.updatePushNotificationPreferences = updatePushNotificationPreferences;
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences getUpdatePushNotificationPreferences() {
            return this.updatePushNotificationPreferences;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences updatePushNotificationPreferences = this.updatePushNotificationPreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updatePushNotificationPreferences=");
            sb.append(updatePushNotificationPreferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updatePushNotificationPreferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updatePushNotificationPreferences, ((com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data) other).updatePushNotificationPreferences);
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data copy(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences updatePushNotificationPreferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePushNotificationPreferences, "");
            return new com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data(updatePushNotificationPreferences);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences getUpdatePushNotificationPreferences() {
            return this.updatePushNotificationPreferences;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data copy$default(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data data, com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences updatePushNotificationPreferences, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updatePushNotificationPreferences = data.updatePushNotificationPreferences;
            }
            return data.copy(updatePushNotificationPreferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$UpdatePushNotificationPreferences;", "", "", "Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$Preference;", "preferences", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$UpdatePushNotificationPreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdatePushNotificationPreferences {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference> preferences;

        public UpdatePushNotificationPreferences(java.util.List<com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.preferences = list;
        }

        public final java.util.List<com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference> getPreferences() {
            return this.preferences;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference> list = this.preferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePushNotificationPreferences(preferences=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.preferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferences, ((com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences) other).preferences);
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences copy(java.util.List<com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference> preferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferences, "");
            return new com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences(preferences);
        }

        public final java.util.List<com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference> component1() {
            return this.preferences;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences copy$default(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences updatePushNotificationPreferences, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = updatePushNotificationPreferences.preferences;
            }
            return updatePushNotificationPreferences.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$Preference;", "", "", "type", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;", "status", "displayText", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$Preference;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;", "getStatus", "getDisplayText", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Preference {
        public static final int $stable = 0;
        private final java.lang.String description;
        private final java.lang.String displayText;
        private final com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus status;
        private final java.lang.String type;

        public Preference(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus notificationPreferenceStatus, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationPreferenceStatus, "");
            this.type = str;
            this.status = notificationPreferenceStatus;
            this.displayText = str2;
            this.description = str3;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getDisplayText() {
            return this.displayText;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.type;
            com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus notificationPreferenceStatus = this.status;
            java.lang.String str2 = this.displayText;
            java.lang.String str3 = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Preference(type=");
            sb.append(str);
            sb.append(", status=");
            sb.append(notificationPreferenceStatus);
            sb.append(", displayText=");
            sb.append(str2);
            sb.append(", description=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            int hashCode2 = this.status.hashCode();
            java.lang.String str = this.displayText;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.description;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference preference = (com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.type, preference.type) && this.status == preference.status && kotlin.jvm.internal.Intrinsics.areEqual(this.displayText, preference.displayText) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, preference.description);
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference copy(java.lang.String type, com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus status, java.lang.String displayText, java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference(type, status, displayText, description);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDisplayText() {
            return this.displayText;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference copy$default(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference preference, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus notificationPreferenceStatus, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = preference.type;
            }
            if ((i & 2) != 0) {
                notificationPreferenceStatus = preference.status;
            }
            if ((i & 4) != 0) {
                str2 = preference.displayText;
            }
            if ((i & 8) != 0) {
                str3 = preference.description;
            }
            return preference.copy(str, notificationPreferenceStatus, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdatePushNotificationPreferences($updatePushNotificationPreferencesInput: UpdatePushNotificationPreferencesInput!) { updatePushNotificationPreferences(input: $updatePushNotificationPreferencesInput) { preferences { type status displayText description } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput updatePushNotificationPreferencesInput = this.updatePushNotificationPreferencesInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePushNotificationPreferencesMutation(updatePushNotificationPreferencesInput=");
        sb.append(updatePushNotificationPreferencesInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.updatePushNotificationPreferencesInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.updatePushNotificationPreferencesInput, ((com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation) other).updatePushNotificationPreferencesInput);
    }

    public final com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput updatePushNotificationPreferencesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePushNotificationPreferencesInput, "");
        return new com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation(updatePushNotificationPreferencesInput);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput getUpdatePushNotificationPreferencesInput() {
        return this.updatePushNotificationPreferencesInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation copy$default(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation updatePushNotificationPreferencesMutation, com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput updatePushNotificationPreferencesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updatePushNotificationPreferencesInput = updatePushNotificationPreferencesMutation.updatePushNotificationPreferencesInput;
        }
        return updatePushNotificationPreferencesMutation.copy(updatePushNotificationPreferencesInput);
    }
}
