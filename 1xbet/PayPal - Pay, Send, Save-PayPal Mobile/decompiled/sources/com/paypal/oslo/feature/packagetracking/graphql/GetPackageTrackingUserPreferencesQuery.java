package com.paypal.oslo.feature.packagetracking.graphql;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004+,-*B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Data;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingUserPreferencesInput;", "input", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getInput", "Companion", "Data", "PackageTrackingUserPreferences", "Preference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetPackageTrackingUserPreferencesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "307404a00624d2d166a3951ddef7b7a3180a5a38d0ef85eac0fa243d331fbc2f";
    public static final java.lang.String OPERATION_NAME = "GetPackageTrackingUserPreferences";
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PackageTrackingUserPreferencesInput> input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Companion INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Companion(null);
    public static final int $stable = 8;

    public GetPackageTrackingUserPreferencesQuery(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PackageTrackingUserPreferencesInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.input = optional;
    }

    public /* synthetic */ GetPackageTrackingUserPreferencesQuery(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PackageTrackingUserPreferencesInput> getInput() {
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
        com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.packagetracking.graphql.selections.GetPackageTrackingUserPreferencesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$PackageTrackingUserPreferences;", "packageTrackingUserPreferences", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$PackageTrackingUserPreferences;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$PackageTrackingUserPreferences;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$PackageTrackingUserPreferences;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$PackageTrackingUserPreferences;", "getPackageTrackingUserPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences packageTrackingUserPreferences;

        public Data(com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences packageTrackingUserPreferences) {
            this.packageTrackingUserPreferences = packageTrackingUserPreferences;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences getPackageTrackingUserPreferences() {
            return this.packageTrackingUserPreferences;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences packageTrackingUserPreferences = this.packageTrackingUserPreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(packageTrackingUserPreferences=");
            sb.append(packageTrackingUserPreferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences packageTrackingUserPreferences = this.packageTrackingUserPreferences;
            if (packageTrackingUserPreferences == null) {
                return 0;
            }
            return packageTrackingUserPreferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageTrackingUserPreferences, ((com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data) other).packageTrackingUserPreferences);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data copy(com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences packageTrackingUserPreferences) {
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data(packageTrackingUserPreferences);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences getPackageTrackingUserPreferences() {
            return this.packageTrackingUserPreferences;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data data, com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences packageTrackingUserPreferences, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                packageTrackingUserPreferences = data.packageTrackingUserPreferences;
            }
            return data.copy(packageTrackingUserPreferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$PackageTrackingUserPreferences;", "", "", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Preference;", "preferences", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$PackageTrackingUserPreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PackageTrackingUserPreferences {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference> preferences;

        public PackageTrackingUserPreferences(java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.preferences = list;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference> getPreferences() {
            return this.preferences;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference> list = this.preferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PackageTrackingUserPreferences(preferences=");
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
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferences, ((com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences) other).preferences);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences copy(java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference> preferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferences, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences(preferences);
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference> component1() {
            return this.preferences;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences packageTrackingUserPreferences, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = packageTrackingUserPreferences.preferences;
            }
            return packageTrackingUserPreferences.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Preference;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;", "preferenceType", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;", "preferenceKey", "", "preferenceValue", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;Z)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Preference;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;", "getPreferenceType", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;", "getPreferenceKey", "Z", "getPreferenceValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference preference = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference) other;
            return this.preferenceType == preference.preferenceType && this.preferenceKey == preference.preferenceKey && this.preferenceValue == preference.preferenceValue;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference copy(com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType preferenceType, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey preferenceKey, boolean preferenceValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferenceType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferenceKey, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference(preferenceType, preferenceKey, preferenceValue);
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

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference preference, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey, boolean z, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPackageTrackingUserPreferences($input: PackageTrackingUserPreferencesInput) { packageTrackingUserPreferences(input: $input) { preferences { preferenceType preferenceKey preferenceValue } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PackageTrackingUserPreferencesInput> optional = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPackageTrackingUserPreferencesQuery(input=");
        sb.append(optional);
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
        return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery) other).input);
    }

    public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PackageTrackingUserPreferencesInput> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery(input);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PackageTrackingUserPreferencesInput> component1() {
        return this.input;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery getPackageTrackingUserPreferencesQuery, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = getPackageTrackingUserPreferencesQuery.input;
        }
        return getPackageTrackingUserPreferencesQuery.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetPackageTrackingUserPreferencesQuery() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
