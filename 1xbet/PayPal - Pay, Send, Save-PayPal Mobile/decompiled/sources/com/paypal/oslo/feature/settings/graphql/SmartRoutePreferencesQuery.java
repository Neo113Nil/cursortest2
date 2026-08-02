package com.paypal.oslo.feature.settings.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRoutePreferencesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRoutePreferencesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRoutePreferencesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRoutePreferencesInput;)Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRoutePreferencesInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SmartRoutePreferencesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "99e2150f73c00ca9243424a0a11355dc59bc606a5fc6633e2a1b6d5f9cf3d58a";
    public static final java.lang.String OPERATION_NAME = "SmartRoutePreferences";
    private final com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Companion INSTANCE = new com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Companion(null);
    public static final int $stable = 8;

    public SmartRoutePreferencesQuery(com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput smartRoutePreferencesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRoutePreferencesInput, "");
        this.input = smartRoutePreferencesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput getInput() {
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
        com.paypal.oslo.feature.settings.graphql.adapter.SmartRoutePreferencesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.settings.graphql.adapter.SmartRoutePreferencesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.settings.graphql.selections.SmartRoutePreferencesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery$SmartRoutePreferences;", "smartRoutePreferences", "<init>", "(Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery$SmartRoutePreferences;)V", "component1", "()Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery$SmartRoutePreferences;", "copy", "(Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery$SmartRoutePreferences;)Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery$SmartRoutePreferences;", "getSmartRoutePreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences;

        public Data(com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences) {
            this.smartRoutePreferences = smartRoutePreferences;
        }

        public final com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences getSmartRoutePreferences() {
            return this.smartRoutePreferences;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences = this.smartRoutePreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(smartRoutePreferences=");
            sb.append(smartRoutePreferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences = this.smartRoutePreferences;
            if (smartRoutePreferences == null) {
                return 0;
            }
            return smartRoutePreferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.smartRoutePreferences, ((com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Data) other).smartRoutePreferences);
        }

        public final com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Data copy(com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences) {
            return new com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Data(smartRoutePreferences);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences getSmartRoutePreferences() {
            return this.smartRoutePreferences;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Data copy$default(com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Data data, com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smartRoutePreferences = data.smartRoutePreferences;
            }
            return data.copy(smartRoutePreferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery$SmartRoutePreferences;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "status", "", "version", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery$SmartRoutePreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "getStatus", "Ljava/lang/String;", "getVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SmartRoutePreferences {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus status;
        private final java.lang.String version;

        public SmartRoutePreferences(com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.status = smartRouteStatus;
            this.version = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus = this.status;
            java.lang.String str = this.version;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartRoutePreferences(status=");
            sb.append(smartRouteStatus);
            sb.append(", version=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.status.hashCode() * 31) + this.version.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences = (com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences) other;
            return this.status == smartRoutePreferences.status && kotlin.jvm.internal.Intrinsics.areEqual(this.version, smartRoutePreferences.version);
        }

        public final com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences copy(com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus status, java.lang.String version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            return new com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences(status, version);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences copy$default(com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences, com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smartRouteStatus = smartRoutePreferences.status;
            }
            if ((i & 2) != 0) {
                str = smartRoutePreferences.version;
            }
            return smartRoutePreferences.copy(smartRouteStatus, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/SmartRoutePreferencesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query SmartRoutePreferences($input: SmartRoutePreferencesInput!) { smartRoutePreferences(input: $input) { status version } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput smartRoutePreferencesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartRoutePreferencesQuery(input=");
        sb.append(smartRoutePreferencesInput);
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
        return (other instanceof com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery) other).input);
    }

    public final com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery copy(com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery copy$default(com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery smartRoutePreferencesQuery, com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput smartRoutePreferencesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            smartRoutePreferencesInput = smartRoutePreferencesQuery.input;
        }
        return smartRoutePreferencesQuery.copy(smartRoutePreferencesInput);
    }
}
