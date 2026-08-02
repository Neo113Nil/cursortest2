package com.paypal.oslo.feature.settings.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\" B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "Balances"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetSettingsPrepaidStatusQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Companion INSTANCE = new com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "75705aebd05c78a72c521e773a32e63a17f9fb8f7429668a9b4eb55584323c11";
    public static final java.lang.String OPERATION_NAME = "GetSettingsPrepaidStatus";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.settings.graphql.adapter.GetSettingsPrepaidStatusQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.settings.graphql.selections.GetSettingsPrepaidStatusQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery$Balances;", "balances", "<init>", "(Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery$Balances;)V", "component1", "()Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery$Balances;", "copy", "(Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery$Balances;)Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery$Balances;", "getBalances"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances balances;

        public Data(com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            this.balances = balances;
        }

        public final com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances getBalances() {
            return this.balances;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances balances = this.balances;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(balances=");
            sb.append(balances);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.balances.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.balances, ((com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Data) other).balances);
        }

        public final com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Data copy(com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            return new com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Data(balances);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances getBalances() {
            return this.balances;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Data copy$default(com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Data data, com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances balances, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balances = data.balances;
            }
            return data.copy(balances);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery$Balances;", "", "", "prepaidStatus", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery$Balances;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getPrepaidStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balances {
        public static final int $stable = 0;
        private final java.lang.Boolean prepaidStatus;

        public Balances(java.lang.Boolean bool) {
            this.prepaidStatus = bool;
        }

        public final java.lang.Boolean getPrepaidStatus() {
            return this.prepaidStatus;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.prepaidStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balances(prepaidStatus=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.prepaidStatus;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances) && kotlin.jvm.internal.Intrinsics.areEqual(this.prepaidStatus, ((com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances) other).prepaidStatus);
        }

        public final com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances copy(java.lang.Boolean prepaidStatus) {
            return new com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances(prepaidStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getPrepaidStatus() {
            return this.prepaidStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances copy$default(com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances balances, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = balances.prepaidStatus;
            }
            return balances.copy(bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/GetSettingsPrepaidStatusQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetSettingsPrepaidStatus { balances { prepaidStatus } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}
