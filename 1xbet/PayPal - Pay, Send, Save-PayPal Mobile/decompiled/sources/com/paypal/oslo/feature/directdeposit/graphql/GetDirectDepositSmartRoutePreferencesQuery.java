package com.paypal.oslo.feature.directdeposit.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007!\"#$%& B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.OPERATION_NAME, "Distribution", "Target", "Allocation", "OnSmartRoutePercentage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetDirectDepositSmartRoutePreferencesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Companion INSTANCE = new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "44c3468cbba151f05869ae1a499689b93dbe45e5354b191e645f521dd013828a";
    public static final java.lang.String OPERATION_NAME = "GetDirectDepositSmartRoutePreferences";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.directdeposit.graphql.selections.GetDirectDepositSmartRoutePreferencesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;", "smartRoutePreferences", "<init>", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;)V", "component1", "()Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;", "copy", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;", "getSmartRoutePreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences;

        public Data(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences) {
            this.smartRoutePreferences = smartRoutePreferences;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences getSmartRoutePreferences() {
            return this.smartRoutePreferences;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences = this.smartRoutePreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(smartRoutePreferences=");
            sb.append(smartRoutePreferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences = this.smartRoutePreferences;
            if (smartRoutePreferences == null) {
                return 0;
            }
            return smartRoutePreferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.smartRoutePreferences, ((com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data) other).smartRoutePreferences);
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data copy(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences) {
            return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data(smartRoutePreferences);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences getSmartRoutePreferences() {
            return this.smartRoutePreferences;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data data, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smartRoutePreferences = data.smartRoutePreferences;
            }
            return data.copy(smartRoutePreferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;", "", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Distribution;", "distribution", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "status", "", "version", "<init>", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Distribution;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Distribution;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Distribution;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Distribution;", "getDistribution", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "getStatus", "Ljava/lang/String;", "getVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SmartRoutePreferences {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution distribution;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus status;
        private final java.lang.String version;

        public SmartRoutePreferences(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution distribution, com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distribution, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.distribution = distribution;
            this.status = smartRouteStatus;
            this.version = str;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution getDistribution() {
            return this.distribution;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution distribution = this.distribution;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus = this.status;
            java.lang.String str = this.version;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartRoutePreferences(distribution=");
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
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences)) {
                return false;
            }
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.distribution, smartRoutePreferences.distribution) && this.status == smartRoutePreferences.status && kotlin.jvm.internal.Intrinsics.areEqual(this.version, smartRoutePreferences.version);
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences copy(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution distribution, com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus status, java.lang.String version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distribution, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences(distribution, status, version);
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
        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution getDistribution() {
            return this.distribution;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution distribution, com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                distribution = smartRoutePreferences.distribution;
            }
            if ((i & 2) != 0) {
                smartRouteStatus = smartRoutePreferences.status;
            }
            if ((i & 4) != 0) {
                str = smartRoutePreferences.version;
            }
            return smartRoutePreferences.copy(distribution, smartRouteStatus, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Distribution;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;", "method", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;", "source", "", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Target;", "targets", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;Ljava/util/List;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Distribution;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteDistributionMethod;", "getMethod", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteFundingSource;", "getSource", "Ljava/util/List;", "getTargets"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Distribution {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod method;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource source;
        private final java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target> targets;

        public Distribution(com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod smartRouteDistributionMethod, com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource smartRouteFundingSource, java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteDistributionMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteFundingSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.method = smartRouteDistributionMethod;
            this.source = smartRouteFundingSource;
            this.targets = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod getMethod() {
            return this.method;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource getSource() {
            return this.source;
        }

        public final java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target> getTargets() {
            return this.targets;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod smartRouteDistributionMethod = this.method;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource smartRouteFundingSource = this.source;
            java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target> list = this.targets;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Distribution(method=");
            sb.append(smartRouteDistributionMethod);
            sb.append(", source=");
            sb.append(smartRouteFundingSource);
            sb.append(", targets=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.method.hashCode() * 31) + this.source.hashCode()) * 31) + this.targets.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution)) {
                return false;
            }
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution distribution = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution) other;
            return this.method == distribution.method && this.source == distribution.source && kotlin.jvm.internal.Intrinsics.areEqual(this.targets, distribution.targets);
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution copy(com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod method, com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource source, java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target> targets) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targets, "");
            return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution(method, source, targets);
        }

        public final java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target> component3() {
            return this.targets;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod getMethod() {
            return this.method;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution distribution, com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod smartRouteDistributionMethod, com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource smartRouteFundingSource, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smartRouteDistributionMethod = distribution.method;
            }
            if ((i & 2) != 0) {
                smartRouteFundingSource = distribution.source;
            }
            if ((i & 4) != 0) {
                list = distribution.targets;
            }
            return distribution.copy(smartRouteDistributionMethod, smartRouteFundingSource, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Target;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteAccountType;", "accountType", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Allocation;", "allocation", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;", "eligibilityStatus", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteAccountType;Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Allocation;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteAccountType;", "component2", "()Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Allocation;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteAccountType;Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Allocation;Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Target;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteAccountType;", "getAccountType", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Allocation;", "getAllocation", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;", "getEligibilityStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Target {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType accountType;
        private final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation allocation;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus eligibilityStatus;

        public Target(com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType smartRouteAccountType, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation allocation, com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus smartRouteTargetEligibilityStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteAccountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allocation, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteTargetEligibilityStatus, "");
            this.accountType = smartRouteAccountType;
            this.allocation = allocation;
            this.eligibilityStatus = smartRouteTargetEligibilityStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType getAccountType() {
            return this.accountType;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation getAllocation() {
            return this.allocation;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType smartRouteAccountType = this.accountType;
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation allocation = this.allocation;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus smartRouteTargetEligibilityStatus = this.eligibilityStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Target(accountType=");
            sb.append(smartRouteAccountType);
            sb.append(", allocation=");
            sb.append(allocation);
            sb.append(", eligibilityStatus=");
            sb.append(smartRouteTargetEligibilityStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.accountType.hashCode() * 31) + this.allocation.hashCode()) * 31) + this.eligibilityStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target)) {
                return false;
            }
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target target = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target) other;
            return this.accountType == target.accountType && kotlin.jvm.internal.Intrinsics.areEqual(this.allocation, target.allocation) && this.eligibilityStatus == target.eligibilityStatus;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target copy(com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType accountType, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation allocation, com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus eligibilityStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allocation, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityStatus, "");
            return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target(accountType, allocation, eligibilityStatus);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation getAllocation() {
            return this.allocation;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType getAccountType() {
            return this.accountType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target target, com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType smartRouteAccountType, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation allocation, com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus smartRouteTargetEligibilityStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smartRouteAccountType = target.accountType;
            }
            if ((i & 2) != 0) {
                allocation = target.allocation;
            }
            if ((i & 4) != 0) {
                smartRouteTargetEligibilityStatus = target.eligibilityStatus;
            }
            return target.copy(smartRouteAccountType, allocation, smartRouteTargetEligibilityStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Allocation;", "", "", "__typename", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$OnSmartRoutePercentage;", "onSmartRoutePercentage", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$OnSmartRoutePercentage;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$OnSmartRoutePercentage;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$OnSmartRoutePercentage;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Allocation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$OnSmartRoutePercentage;", "getOnSmartRoutePercentage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Allocation {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage onSmartRoutePercentage;

        public Allocation(java.lang.String str, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage onSmartRoutePercentage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onSmartRoutePercentage = onSmartRoutePercentage;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage getOnSmartRoutePercentage() {
            return this.onSmartRoutePercentage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage onSmartRoutePercentage = this.onSmartRoutePercentage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Allocation(__typename=");
            sb.append(str);
            sb.append(", onSmartRoutePercentage=");
            sb.append(onSmartRoutePercentage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage onSmartRoutePercentage = this.onSmartRoutePercentage;
            return (hashCode * 31) + (onSmartRoutePercentage == null ? 0 : onSmartRoutePercentage.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation)) {
                return false;
            }
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation allocation = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, allocation.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSmartRoutePercentage, allocation.onSmartRoutePercentage);
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation copy(java.lang.String __typename, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage onSmartRoutePercentage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation(__typename, onSmartRoutePercentage);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage getOnSmartRoutePercentage() {
            return this.onSmartRoutePercentage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation allocation, java.lang.String str, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage onSmartRoutePercentage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = allocation.__typename;
            }
            if ((i & 2) != 0) {
                onSmartRoutePercentage = allocation.onSmartRoutePercentage;
            }
            return allocation.copy(str, onSmartRoutePercentage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$OnSmartRoutePercentage;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$OnSmartRoutePercentage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSmartRoutePercentage {
        public static final int $stable = 0;
        private final int value;

        public OnSmartRoutePercentage(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            int i = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSmartRoutePercentage(value=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.value);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage) && this.value == ((com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage) other).value;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage copy(int value) {
            return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage(value);
        }

        /* renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage onSmartRoutePercentage, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = onSmartRoutePercentage.value;
            }
            return onSmartRoutePercentage.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetDirectDepositSmartRoutePreferences { smartRoutePreferences(input: { route: ACH_DEPOSIT_ROUTE } ) { distribution { method source targets { accountType allocation { __typename ... on SmartRoutePercentage { value } } eligibilityStatus } } status version } }";
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
