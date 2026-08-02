package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationAlertInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationAlertInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationAlertInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationAlertInput;)Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationAlertInput;", "getInput", "Companion", "Data", "AuthenticationAlert"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GetAuthenticationAlertsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "76a6a6d3d8214a54391e1d71499a346438137eeb67bb73eeefe745a4649d3170";
    public static final java.lang.String OPERATION_NAME = "GetAuthenticationAlerts";
    private final com.paypal.oslo.api.graphql.schema.type.AuthenticationAlertInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Companion(null);
    public static final int $stable = 8;

    public GetAuthenticationAlertsQuery(com.paypal.oslo.api.graphql.schema.type.AuthenticationAlertInput authenticationAlertInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationAlertInput, "");
        this.input = authenticationAlertInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AuthenticationAlertInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.GetAuthenticationAlertsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.GetAuthenticationAlertsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.GetAuthenticationAlertsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$AuthenticationAlert;", "authenticationAlert", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$AuthenticationAlert;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$AuthenticationAlert;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$AuthenticationAlert;)Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$AuthenticationAlert;", "getAuthenticationAlert"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert authenticationAlert;

        public Data(com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert authenticationAlert) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationAlert, "");
            this.authenticationAlert = authenticationAlert;
        }

        public final com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert getAuthenticationAlert() {
            return this.authenticationAlert;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert authenticationAlert = this.authenticationAlert;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(authenticationAlert=");
            sb.append(authenticationAlert);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.authenticationAlert.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationAlert, ((com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Data) other).authenticationAlert);
        }

        public final com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Data copy(com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert authenticationAlert) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationAlert, "");
            return new com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Data(authenticationAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert getAuthenticationAlert() {
            return this.authenticationAlert;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Data copy$default(com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Data data, com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert authenticationAlert, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticationAlert = data.authenticationAlert;
            }
            return data.copy(authenticationAlert);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ4\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$AuthenticationAlert;", "", "", "", "alerts", "acceptableClaims", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$AuthenticationAlert;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAlerts", "getAcceptableClaims"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationAlert {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> acceptableClaims;
        private final java.util.List<java.lang.String> alerts;

        public AuthenticationAlert(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.alerts = list;
            this.acceptableClaims = list2;
        }

        public final java.util.List<java.lang.String> getAlerts() {
            return this.alerts;
        }

        public final java.util.List<java.lang.String> getAcceptableClaims() {
            return this.acceptableClaims;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.alerts;
            java.util.List<java.lang.String> list2 = this.acceptableClaims;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationAlert(alerts=");
            sb.append(list);
            sb.append(", acceptableClaims=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.alerts.hashCode() * 31) + this.acceptableClaims.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert authenticationAlert = (com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.alerts, authenticationAlert.alerts) && kotlin.jvm.internal.Intrinsics.areEqual(this.acceptableClaims, authenticationAlert.acceptableClaims);
        }

        public final com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert copy(java.util.List<java.lang.String> alerts, java.util.List<java.lang.String> acceptableClaims) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alerts, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptableClaims, "");
            return new com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert(alerts, acceptableClaims);
        }

        public final java.util.List<java.lang.String> component2() {
            return this.acceptableClaims;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.alerts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert copy$default(com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert authenticationAlert, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = authenticationAlert.alerts;
            }
            if ((i & 2) != 0) {
                list2 = authenticationAlert.acceptableClaims;
            }
            return authenticationAlert.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetAuthenticationAlerts($input: AuthenticationAlertInput!) { authenticationAlert(input: $input) { alerts acceptableClaims } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationAlertInput authenticationAlertInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetAuthenticationAlertsQuery(input=");
        sb.append(authenticationAlertInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery copy(com.paypal.oslo.api.graphql.schema.type.AuthenticationAlertInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AuthenticationAlertInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery copy$default(com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery getAuthenticationAlertsQuery, com.paypal.oslo.api.graphql.schema.type.AuthenticationAlertInput authenticationAlertInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authenticationAlertInput = getAuthenticationAlertsQuery.input;
        }
        return getAuthenticationAlertsQuery.copy(authenticationAlertInput);
    }
}
