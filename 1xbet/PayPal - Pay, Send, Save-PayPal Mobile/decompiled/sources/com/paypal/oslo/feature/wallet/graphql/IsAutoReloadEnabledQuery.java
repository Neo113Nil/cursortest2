package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadInput;", "thresholdInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadInput;)Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadInput;", "getThresholdInput", "Companion", "Data", "Threshold"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class IsAutoReloadEnabledQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data> {
    public static final java.lang.String OPERATION_ID = "3187dbb59e401dd5e1e34b71af0a6a114b46ddc6a3d800465fef3cbffc245ce2";
    public static final java.lang.String OPERATION_NAME = "IsAutoReloadEnabled";
    private final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput thresholdInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Companion(null);
    public static final int $stable = 8;

    public IsAutoReloadEnabledQuery(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput balanceAutoReloadInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceAutoReloadInput, "");
        this.thresholdInput = balanceAutoReloadInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput getThresholdInput() {
        return this.thresholdInput;
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
        return "IsAutoReloadEnabled";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.wallet.graphql.adapter.IsAutoReloadEnabledQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.IsAutoReloadEnabledQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.IsAutoReloadEnabledQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery$Threshold;", "threshold", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery$Threshold;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery$Threshold;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery$Threshold;)Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery$Threshold;", "getThreshold"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold threshold;

        public Data(com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold threshold) {
            this.threshold = threshold;
        }

        public final com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold getThreshold() {
            return this.threshold;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold threshold = this.threshold;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(threshold=");
            sb.append(threshold);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold threshold = this.threshold;
            if (threshold == null) {
                return 0;
            }
            return threshold.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.threshold, ((com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data) other).threshold);
        }

        public final com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold threshold) {
            return new com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data(threshold);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold getThreshold() {
            return this.threshold;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data data, com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold threshold, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                threshold = data.threshold;
            }
            return data.copy(threshold);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery$Threshold;", "", "", "__typename", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery$Threshold;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Threshold {
        public static final int $stable = 0;
        private final java.lang.String __typename;

        public Threshold(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Threshold(__typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, ((com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold) other).__typename);
        }

        public final com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold copy(java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold(__typename);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold copy$default(com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Threshold threshold, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = threshold.__typename;
            }
            return threshold.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/IsAutoReloadEnabledQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query IsAutoReloadEnabled($thresholdInput: BalanceAutoReloadInput!) { threshold: balanceAutoReload(input: $thresholdInput) { __typename } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput balanceAutoReloadInput = this.thresholdInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IsAutoReloadEnabledQuery(thresholdInput=");
        sb.append(balanceAutoReloadInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.thresholdInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdInput, ((com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery) other).thresholdInput);
    }

    public final com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery copy(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput thresholdInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdInput, "");
        return new com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery(thresholdInput);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput getThresholdInput() {
        return this.thresholdInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery copy$default(com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery isAutoReloadEnabledQuery, com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput balanceAutoReloadInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            balanceAutoReloadInput = isAutoReloadEnabledQuery.thresholdInput;
        }
        return isAutoReloadEnabledQuery.copy(balanceAutoReloadInput);
    }
}
