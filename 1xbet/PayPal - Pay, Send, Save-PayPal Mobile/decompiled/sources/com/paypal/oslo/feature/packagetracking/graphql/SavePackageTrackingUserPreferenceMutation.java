package com.paypal.oslo.feature.packagetracking.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/SavePackageTrackingUserPreferenceInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SavePackageTrackingUserPreferenceInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SavePackageTrackingUserPreferenceInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SavePackageTrackingUserPreferenceInput;)Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SavePackageTrackingUserPreferenceInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.OPERATION_NAME, "Preference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SavePackageTrackingUserPreferenceMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data> {
    public static final java.lang.String OPERATION_ID = "4b2348dea89c27fad9477988e9cd93dbf7df222bd2e63ca5a7d8aa7f68091040";
    public static final java.lang.String OPERATION_NAME = "SavePackageTrackingUserPreference";
    private final com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Companion INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Companion(null);
    public static final int $stable = 8;

    public SavePackageTrackingUserPreferenceMutation(com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput savePackageTrackingUserPreferenceInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savePackageTrackingUserPreferenceInput, "");
        this.input = savePackageTrackingUserPreferenceInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput getInput() {
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
        com.paypal.oslo.feature.packagetracking.graphql.adapter.SavePackageTrackingUserPreferenceMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.SavePackageTrackingUserPreferenceMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.packagetracking.graphql.selections.SavePackageTrackingUserPreferenceMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$SavePackageTrackingUserPreference;", "savePackageTrackingUserPreference", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$SavePackageTrackingUserPreference;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$SavePackageTrackingUserPreference;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$SavePackageTrackingUserPreference;)Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$SavePackageTrackingUserPreference;", "getSavePackageTrackingUserPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference savePackageTrackingUserPreference;

        public Data(com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference savePackageTrackingUserPreference) {
            this.savePackageTrackingUserPreference = savePackageTrackingUserPreference;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference getSavePackageTrackingUserPreference() {
            return this.savePackageTrackingUserPreference;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference savePackageTrackingUserPreference = this.savePackageTrackingUserPreference;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(savePackageTrackingUserPreference=");
            sb.append(savePackageTrackingUserPreference);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference savePackageTrackingUserPreference = this.savePackageTrackingUserPreference;
            if (savePackageTrackingUserPreference == null) {
                return 0;
            }
            return savePackageTrackingUserPreference.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.savePackageTrackingUserPreference, ((com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data) other).savePackageTrackingUserPreference);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data copy(com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference savePackageTrackingUserPreference) {
            return new com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data(savePackageTrackingUserPreference);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference getSavePackageTrackingUserPreference() {
            return this.savePackageTrackingUserPreference;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data copy$default(com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data data, com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference savePackageTrackingUserPreference, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savePackageTrackingUserPreference = data.savePackageTrackingUserPreference;
            }
            return data.copy(savePackageTrackingUserPreference);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$SavePackageTrackingUserPreference;", "", "Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$Preference;", "preference", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$Preference;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$Preference;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$Preference;)Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$SavePackageTrackingUserPreference;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$Preference;", "getPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavePackageTrackingUserPreference {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference preference;

        public SavePackageTrackingUserPreference(com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference preference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preference, "");
            this.preference = preference;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference getPreference() {
            return this.preference;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference preference = this.preference;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavePackageTrackingUserPreference(preference=");
            sb.append(preference);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.preference.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference) && kotlin.jvm.internal.Intrinsics.areEqual(this.preference, ((com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference) other).preference);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference copy(com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference preference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preference, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference(preference);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference getPreference() {
            return this.preference;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference copy$default(com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference savePackageTrackingUserPreference, com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference preference, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                preference = savePackageTrackingUserPreference.preference;
            }
            return savePackageTrackingUserPreference.copy(preference);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$Preference;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;", "preferenceType", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;", "preferenceKey", "", "preferenceValue", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;Z)Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$Preference;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;", "getPreferenceType", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;", "getPreferenceKey", "Z", "getPreferenceValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Preference {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey preferenceKey;
        private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType preferenceType;
        private final boolean preferenceValue;

        public Preference(com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageTrackingPreferenceType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageTrackingPreferenceKey, "");
            this.preferenceType = packageTrackingPreferenceType;
            this.preferenceKey = packageTrackingPreferenceKey;
            this.preferenceValue = z;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType getPreferenceType() {
            return this.preferenceType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey getPreferenceKey() {
            return this.preferenceKey;
        }

        public final boolean getPreferenceValue() {
            return this.preferenceValue;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType = this.preferenceType;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey = this.preferenceKey;
            boolean z = this.preferenceValue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Preference(preferenceType=");
            sb.append(packageTrackingPreferenceType);
            sb.append(", preferenceKey=");
            sb.append(packageTrackingPreferenceKey);
            sb.append(", preferenceValue=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.preferenceType.hashCode() * 31) + this.preferenceKey.hashCode()) * 31) + java.lang.Boolean.hashCode(this.preferenceValue);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference preference = (com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference) other;
            return this.preferenceType == preference.preferenceType && this.preferenceKey == preference.preferenceKey && this.preferenceValue == preference.preferenceValue;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference copy(com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType preferenceType, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey preferenceKey, boolean preferenceValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferenceType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferenceKey, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference(preferenceType, preferenceKey, preferenceValue);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getPreferenceValue() {
            return this.preferenceValue;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey getPreferenceKey() {
            return this.preferenceKey;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType getPreferenceType() {
            return this.preferenceType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference copy$default(com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference preference, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                packageTrackingPreferenceType = preference.preferenceType;
            }
            if ((i & 2) != 0) {
                packageTrackingPreferenceKey = preference.preferenceKey;
            }
            if ((i & 4) != 0) {
                z = preference.preferenceValue;
            }
            return preference.copy(packageTrackingPreferenceType, packageTrackingPreferenceKey, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/SavePackageTrackingUserPreferenceMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation SavePackageTrackingUserPreference($input: SavePackageTrackingUserPreferenceInput!) { savePackageTrackingUserPreference(input: $input) { preference { preferenceType preferenceKey preferenceValue } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput savePackageTrackingUserPreferenceInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavePackageTrackingUserPreferenceMutation(input=");
        sb.append(savePackageTrackingUserPreferenceInput);
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
        return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation) other).input);
    }

    public final com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation copy(com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation copy$default(com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation savePackageTrackingUserPreferenceMutation, com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput savePackageTrackingUserPreferenceInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            savePackageTrackingUserPreferenceInput = savePackageTrackingUserPreferenceMutation.input;
        }
        return savePackageTrackingUserPreferenceMutation.copy(savePackageTrackingUserPreferenceInput);
    }
}
