package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingAggregatorInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingAggregatorInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingAggregatorInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingAggregatorInput;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingAggregatorInput;", "getInput", "Companion", "Data", "OpenBankingAggregator"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GetOpenBankingAggregatorQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data> {
    public static final java.lang.String OPERATION_ID = "4470cda8906b8b409288e36b4c3454f83d619a7ea2ea47cf6196fac901d9186c";
    public static final java.lang.String OPERATION_NAME = "GetOpenBankingAggregatorQuery";
    private final com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Companion(null);
    public static final int $stable = 8;

    public GetOpenBankingAggregatorQuery(com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput openBankingAggregatorInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingAggregatorInput, "");
        this.input = openBankingAggregatorInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingAggregatorQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingAggregatorQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetOpenBankingAggregatorQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;", "openBankingAggregator", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;", "getOpenBankingAggregator"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator) {
            this.openBankingAggregator = openBankingAggregator;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator getOpenBankingAggregator() {
            return this.openBankingAggregator;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator = this.openBankingAggregator;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(openBankingAggregator=");
            sb.append(openBankingAggregator);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator = this.openBankingAggregator;
            if (openBankingAggregator == null) {
                return 0;
            }
            return openBankingAggregator.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.openBankingAggregator, ((com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data) other).openBankingAggregator);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator) {
            return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data(openBankingAggregator);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator getOpenBankingAggregator() {
            return this.openBankingAggregator;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                openBankingAggregator = data.openBankingAggregator;
            }
            return data.copy(openBankingAggregator);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "aggregatorName", "Lcom/paypal/oslo/api/graphql/schema/type/BankOperationMode;", "operationMode", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;Lcom/paypal/oslo/api/graphql/schema/type/BankOperationMode;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BankOperationMode;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;Lcom/paypal/oslo/api/graphql/schema/type/BankOperationMode;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "getAggregatorName", "Lcom/paypal/oslo/api/graphql/schema/type/BankOperationMode;", "getOperationMode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenBankingAggregator {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.BankAggregatorName aggregatorName;
        private final com.paypal.oslo.api.graphql.schema.type.BankOperationMode operationMode;

        public OpenBankingAggregator(com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName, com.paypal.oslo.api.graphql.schema.type.BankOperationMode bankOperationMode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAggregatorName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankOperationMode, "");
            this.aggregatorName = bankAggregatorName;
            this.operationMode = bankOperationMode;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAggregatorName getAggregatorName() {
            return this.aggregatorName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankOperationMode getOperationMode() {
            return this.operationMode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName = this.aggregatorName;
            com.paypal.oslo.api.graphql.schema.type.BankOperationMode bankOperationMode = this.operationMode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenBankingAggregator(aggregatorName=");
            sb.append(bankAggregatorName);
            sb.append(", operationMode=");
            sb.append(bankOperationMode);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.aggregatorName.hashCode() * 31) + this.operationMode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator = (com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator) other;
            return this.aggregatorName == openBankingAggregator.aggregatorName && this.operationMode == openBankingAggregator.operationMode;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator copy(com.paypal.oslo.api.graphql.schema.type.BankAggregatorName aggregatorName, com.paypal.oslo.api.graphql.schema.type.BankOperationMode operationMode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregatorName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationMode, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator(aggregatorName, operationMode);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankOperationMode getOperationMode() {
            return this.operationMode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAggregatorName getAggregatorName() {
            return this.aggregatorName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator copy$default(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator, com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName, com.paypal.oslo.api.graphql.schema.type.BankOperationMode bankOperationMode, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankAggregatorName = openBankingAggregator.aggregatorName;
            }
            if ((i & 2) != 0) {
                bankOperationMode = openBankingAggregator.operationMode;
            }
            return openBankingAggregator.copy(bankAggregatorName, bankOperationMode);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetOpenBankingAggregatorQuery($input: OpenBankingAggregatorInput!) { openBankingAggregator(input: $input) { aggregatorName operationMode } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput openBankingAggregatorInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetOpenBankingAggregatorQuery(input=");
        sb.append(openBankingAggregatorInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery copy(com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery copy$default(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery getOpenBankingAggregatorQuery, com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput openBankingAggregatorInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            openBankingAggregatorInput = getOpenBankingAggregatorQuery.input;
        }
        return getOpenBankingAggregatorQuery.copy(openBankingAggregatorInput);
    }
}
