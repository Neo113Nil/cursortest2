package com.paypal.oslo.feature.balance.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\t*+,-./01)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateBalanceAutoReloadInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateBalanceAutoReloadInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CreateBalanceAutoReloadInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateBalanceAutoReloadInput;)Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CreateBalanceAutoReloadInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OPERATION_NAME, "BalanceAutoReload", "OnBalanceAutoReloadThreshold", "ReloadAmount", "ThresholdAmount", "OnBalanceAutoReloadFrequency", "ReloadAmount1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CreateBalanceAutoReloadMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.Data> {
    public static final java.lang.String OPERATION_ID = "6c6ac67effc2f1f8f66215261615bfb76a60658c7f5b459749bf05d5452a3a9c";
    public static final java.lang.String OPERATION_NAME = "CreateBalanceAutoReload";
    private final com.paypal.oslo.api.graphql.schema.type.CreateBalanceAutoReloadInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.Companion INSTANCE = new com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.Companion(null);
    public static final int $stable = 8;

    public CreateBalanceAutoReloadMutation(com.paypal.oslo.api.graphql.schema.type.CreateBalanceAutoReloadInput createBalanceAutoReloadInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createBalanceAutoReloadInput, "");
        this.input = createBalanceAutoReloadInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateBalanceAutoReloadInput getInput() {
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
        com.paypal.oslo.feature.balance.graphql.adapter.CreateBalanceAutoReloadMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.balance.graphql.adapter.CreateBalanceAutoReloadMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.balance.graphql.selections.CreateBalanceAutoReloadMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$CreateBalanceAutoReload;", "createBalanceAutoReload", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$CreateBalanceAutoReload;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$CreateBalanceAutoReload;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$CreateBalanceAutoReload;)Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$CreateBalanceAutoReload;", "getCreateBalanceAutoReload"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload createBalanceAutoReload;

        public Data(com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload createBalanceAutoReload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createBalanceAutoReload, "");
            this.createBalanceAutoReload = createBalanceAutoReload;
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload getCreateBalanceAutoReload() {
            return this.createBalanceAutoReload;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload createBalanceAutoReload = this.createBalanceAutoReload;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(createBalanceAutoReload=");
            sb.append(createBalanceAutoReload);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.createBalanceAutoReload.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.createBalanceAutoReload, ((com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.Data) other).createBalanceAutoReload);
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.Data copy(com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload createBalanceAutoReload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createBalanceAutoReload, "");
            return new com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.Data(createBalanceAutoReload);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload getCreateBalanceAutoReload() {
            return this.createBalanceAutoReload;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.Data copy$default(com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.Data data, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload createBalanceAutoReload, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createBalanceAutoReload = data.createBalanceAutoReload;
            }
            return data.copy(createBalanceAutoReload);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$CreateBalanceAutoReload;", "", "", "success", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$BalanceAutoReload;", "balanceAutoReload", "<init>", "(ZLcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$BalanceAutoReload;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$BalanceAutoReload;", "copy", "(ZLcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$BalanceAutoReload;)Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$CreateBalanceAutoReload;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$BalanceAutoReload;", "getBalanceAutoReload"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateBalanceAutoReload {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload;
        private final boolean success;

        public CreateBalanceAutoReload(boolean z, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload) {
            this.success = z;
            this.balanceAutoReload = balanceAutoReload;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload getBalanceAutoReload() {
            return this.balanceAutoReload;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload = this.balanceAutoReload;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateBalanceAutoReload(success=");
            sb.append(z);
            sb.append(", balanceAutoReload=");
            sb.append(balanceAutoReload);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.success);
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload = this.balanceAutoReload;
            return (hashCode * 31) + (balanceAutoReload == null ? 0 : balanceAutoReload.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload createBalanceAutoReload = (com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload) other;
            return this.success == createBalanceAutoReload.success && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceAutoReload, createBalanceAutoReload.balanceAutoReload);
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload copy(boolean success, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload) {
            return new com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload(success, balanceAutoReload);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload getBalanceAutoReload() {
            return this.balanceAutoReload;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload copy$default(com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.CreateBalanceAutoReload createBalanceAutoReload, boolean z, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = createBalanceAutoReload.success;
            }
            if ((i & 2) != 0) {
                balanceAutoReload = createBalanceAutoReload.balanceAutoReload;
            }
            return createBalanceAutoReload.copy(z, balanceAutoReload);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$BalanceAutoReload;", "", "", "__typename", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;", "onBalanceAutoReloadThreshold", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;", "onBalanceAutoReloadFrequency", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;", "component3", "()Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;)Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$BalanceAutoReload;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;", "getOnBalanceAutoReloadThreshold", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;", "getOnBalanceAutoReloadFrequency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalanceAutoReload {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency;
        private final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold;

        public BalanceAutoReload(java.lang.String str, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBalanceAutoReloadThreshold = onBalanceAutoReloadThreshold;
            this.onBalanceAutoReloadFrequency = onBalanceAutoReloadFrequency;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold getOnBalanceAutoReloadThreshold() {
            return this.onBalanceAutoReloadThreshold;
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency getOnBalanceAutoReloadFrequency() {
            return this.onBalanceAutoReloadFrequency;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = this.onBalanceAutoReloadThreshold;
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency = this.onBalanceAutoReloadFrequency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceAutoReload(__typename=");
            sb.append(str);
            sb.append(", onBalanceAutoReloadThreshold=");
            sb.append(onBalanceAutoReloadThreshold);
            sb.append(", onBalanceAutoReloadFrequency=");
            sb.append(onBalanceAutoReloadFrequency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = this.onBalanceAutoReloadThreshold;
            int hashCode2 = onBalanceAutoReloadThreshold == null ? 0 : onBalanceAutoReloadThreshold.hashCode();
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency = this.onBalanceAutoReloadFrequency;
            return (((hashCode * 31) + hashCode2) * 31) + (onBalanceAutoReloadFrequency != null ? onBalanceAutoReloadFrequency.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload = (com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, balanceAutoReload.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalanceAutoReloadThreshold, balanceAutoReload.onBalanceAutoReloadThreshold) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalanceAutoReloadFrequency, balanceAutoReload.onBalanceAutoReloadFrequency);
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload copy(java.lang.String __typename, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload(__typename, onBalanceAutoReloadThreshold, onBalanceAutoReloadFrequency);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency getOnBalanceAutoReloadFrequency() {
            return this.onBalanceAutoReloadFrequency;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold getOnBalanceAutoReloadThreshold() {
            return this.onBalanceAutoReloadThreshold;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload copy$default(com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload, java.lang.String str, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = balanceAutoReload.__typename;
            }
            if ((i & 2) != 0) {
                onBalanceAutoReloadThreshold = balanceAutoReload.onBalanceAutoReloadThreshold;
            }
            if ((i & 4) != 0) {
                onBalanceAutoReloadFrequency = balanceAutoReload.onBalanceAutoReloadFrequency;
            }
            return balanceAutoReload.copy(str, onBalanceAutoReloadThreshold, onBalanceAutoReloadFrequency);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;", "operationStatus", "", "balanceId", "financialInstrumentId", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount;", "reloadAmount", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ThresholdAmount;", "thresholdAmount", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount;Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ThresholdAmount;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount;", "component5", "()Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ThresholdAmount;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount;Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ThresholdAmount;)Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;", "getOperationStatus", "Ljava/lang/String;", "getBalanceId", "getFinancialInstrumentId", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount;", "getReloadAmount", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ThresholdAmount;", "getThresholdAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalanceAutoReloadThreshold {
        public static final int $stable = 8;
        private final java.lang.String balanceId;
        private final java.lang.String financialInstrumentId;
        private final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus operationStatus;
        private final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount reloadAmount;
        private final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount thresholdAmount;

        public OnBalanceAutoReloadThreshold(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount reloadAmount, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount thresholdAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdAmount, "");
            this.operationStatus = balanceAutoReloadOperationStatus;
            this.balanceId = str;
            this.financialInstrumentId = str2;
            this.reloadAmount = reloadAmount;
            this.thresholdAmount = thresholdAmount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus getOperationStatus() {
            return this.operationStatus;
        }

        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount getReloadAmount() {
            return this.reloadAmount;
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount getThresholdAmount() {
            return this.thresholdAmount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus = this.operationStatus;
            java.lang.String str = this.balanceId;
            java.lang.String str2 = this.financialInstrumentId;
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount reloadAmount = this.reloadAmount;
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount thresholdAmount = this.thresholdAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalanceAutoReloadThreshold(operationStatus=");
            sb.append(balanceAutoReloadOperationStatus);
            sb.append(", balanceId=");
            sb.append(str);
            sb.append(", financialInstrumentId=");
            sb.append(str2);
            sb.append(", reloadAmount=");
            sb.append(reloadAmount);
            sb.append(", thresholdAmount=");
            sb.append(thresholdAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus = this.operationStatus;
            return ((((((((balanceAutoReloadOperationStatus == null ? 0 : balanceAutoReloadOperationStatus.hashCode()) * 31) + this.balanceId.hashCode()) * 31) + this.financialInstrumentId.hashCode()) * 31) + this.reloadAmount.hashCode()) * 31) + this.thresholdAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = (com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold) other;
            return this.operationStatus == onBalanceAutoReloadThreshold.operationStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, onBalanceAutoReloadThreshold.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, onBalanceAutoReloadThreshold.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, onBalanceAutoReloadThreshold.reloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdAmount, onBalanceAutoReloadThreshold.thresholdAmount);
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold copy(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus operationStatus, java.lang.String balanceId, java.lang.String financialInstrumentId, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount reloadAmount, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount thresholdAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdAmount, "");
            return new com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold(operationStatus, balanceId, financialInstrumentId, reloadAmount, thresholdAmount);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount getThresholdAmount() {
            return this.thresholdAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount getReloadAmount() {
            return this.reloadAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus getOperationStatus() {
            return this.operationStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold copy$default(com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold, com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount reloadAmount, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount thresholdAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balanceAutoReloadOperationStatus = onBalanceAutoReloadThreshold.operationStatus;
            }
            if ((i & 2) != 0) {
                str = onBalanceAutoReloadThreshold.balanceId;
            }
            java.lang.String str3 = str;
            if ((i & 4) != 0) {
                str2 = onBalanceAutoReloadThreshold.financialInstrumentId;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                reloadAmount = onBalanceAutoReloadThreshold.reloadAmount;
            }
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount reloadAmount2 = reloadAmount;
            if ((i & 16) != 0) {
                thresholdAmount = onBalanceAutoReloadThreshold.thresholdAmount;
            }
            return onBalanceAutoReloadThreshold.copy(balanceAutoReloadOperationStatus, str3, str4, reloadAmount2, thresholdAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReloadAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public ReloadAmount(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReloadAmount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount reloadAmount = (com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, reloadAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, reloadAmount.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount copy$default(com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount reloadAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = reloadAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = reloadAmount.value;
            }
            return reloadAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ThresholdAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ThresholdAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThresholdAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public ThresholdAmount(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThresholdAmount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount thresholdAmount = (com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, thresholdAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, thresholdAmount.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount copy$default(com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ThresholdAmount thresholdAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = thresholdAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = thresholdAmount.value;
            }
            return thresholdAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JL\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;", "", "", "balanceId", "financialInstrumentId", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount1;", "reloadAmount", "startDate", "Lcom/paypal/oslo/api/graphql/schema/type/DayOfWeek;", "startDay", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadRecurrence;", "recurrence", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount1;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/DayOfWeek;Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadRecurrence;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount1;", "component4", "()Ljava/lang/Object;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/DayOfWeek;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadRecurrence;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount1;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/DayOfWeek;Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadRecurrence;)Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBalanceId", "getFinancialInstrumentId", "Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount1;", "getReloadAmount", "Ljava/lang/Object;", "getStartDate", "Lcom/paypal/oslo/api/graphql/schema/type/DayOfWeek;", "getStartDay", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadRecurrence;", "getRecurrence"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalanceAutoReloadFrequency {
        public static final int $stable = 8;
        private final java.lang.String balanceId;
        private final java.lang.String financialInstrumentId;
        private final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence recurrence;
        private final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 reloadAmount;
        private final java.lang.Object startDate;
        private final com.paypal.oslo.api.graphql.schema.type.DayOfWeek startDay;

        public OnBalanceAutoReloadFrequency(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 reloadAmount1, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.DayOfWeek dayOfWeek, com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence balanceAutoReloadRecurrence) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceAutoReloadRecurrence, "");
            this.balanceId = str;
            this.financialInstrumentId = str2;
            this.reloadAmount = reloadAmount1;
            this.startDate = obj;
            this.startDay = dayOfWeek;
            this.recurrence = balanceAutoReloadRecurrence;
        }

        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 getReloadAmount() {
            return this.reloadAmount;
        }

        public final java.lang.Object getStartDate() {
            return this.startDate;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DayOfWeek getStartDay() {
            return this.startDay;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence getRecurrence() {
            return this.recurrence;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.balanceId;
            java.lang.String str2 = this.financialInstrumentId;
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 reloadAmount1 = this.reloadAmount;
            java.lang.Object obj = this.startDate;
            com.paypal.oslo.api.graphql.schema.type.DayOfWeek dayOfWeek = this.startDay;
            com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence balanceAutoReloadRecurrence = this.recurrence;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalanceAutoReloadFrequency(balanceId=");
            sb.append(str);
            sb.append(", financialInstrumentId=");
            sb.append(str2);
            sb.append(", reloadAmount=");
            sb.append(reloadAmount1);
            sb.append(", startDate=");
            sb.append(obj);
            sb.append(", startDay=");
            sb.append(dayOfWeek);
            sb.append(", recurrence=");
            sb.append(balanceAutoReloadRecurrence);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.balanceId.hashCode() * 31) + this.financialInstrumentId.hashCode()) * 31) + this.reloadAmount.hashCode()) * 31) + this.startDate.hashCode()) * 31) + this.startDay.hashCode()) * 31) + this.recurrence.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency = (com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, onBalanceAutoReloadFrequency.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, onBalanceAutoReloadFrequency.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, onBalanceAutoReloadFrequency.reloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, onBalanceAutoReloadFrequency.startDate) && this.startDay == onBalanceAutoReloadFrequency.startDay && this.recurrence == onBalanceAutoReloadFrequency.recurrence;
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency copy(java.lang.String balanceId, java.lang.String financialInstrumentId, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 reloadAmount, java.lang.Object startDate, com.paypal.oslo.api.graphql.schema.type.DayOfWeek startDay, com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence recurrence) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDay, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurrence, "");
            return new com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency(balanceId, financialInstrumentId, reloadAmount, startDate, startDay, recurrence);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence getRecurrence() {
            return this.recurrence;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DayOfWeek getStartDay() {
            return this.startDay;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getStartDate() {
            return this.startDate;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 getReloadAmount() {
            return this.reloadAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency copy$default(com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 reloadAmount1, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.DayOfWeek dayOfWeek, com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence balanceAutoReloadRecurrence, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onBalanceAutoReloadFrequency.balanceId;
            }
            if ((i & 2) != 0) {
                str2 = onBalanceAutoReloadFrequency.financialInstrumentId;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                reloadAmount1 = onBalanceAutoReloadFrequency.reloadAmount;
            }
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 reloadAmount12 = reloadAmount1;
            if ((i & 8) != 0) {
                obj = onBalanceAutoReloadFrequency.startDate;
            }
            java.lang.Object obj3 = obj;
            if ((i & 16) != 0) {
                dayOfWeek = onBalanceAutoReloadFrequency.startDay;
            }
            com.paypal.oslo.api.graphql.schema.type.DayOfWeek dayOfWeek2 = dayOfWeek;
            if ((i & 32) != 0) {
                balanceAutoReloadRecurrence = onBalanceAutoReloadFrequency.recurrence;
            }
            return onBalanceAutoReloadFrequency.copy(str, str3, reloadAmount12, obj3, dayOfWeek2, balanceAutoReloadRecurrence);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$ReloadAmount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReloadAmount1 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public ReloadAmount1(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReloadAmount1(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 reloadAmount1 = (com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, reloadAmount1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, reloadAmount1.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 copy$default(com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation.ReloadAmount1 reloadAmount1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = reloadAmount1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = reloadAmount1.value;
            }
            return reloadAmount1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/CreateBalanceAutoReloadMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CreateBalanceAutoReload($input: CreateBalanceAutoReloadInput!) { createBalanceAutoReload(input: $input) { success balanceAutoReload { __typename ... on BalanceAutoReloadThreshold { operationStatus balanceId financialInstrumentId reloadAmount { currencyCode value } thresholdAmount { currencyCode value } } ... on BalanceAutoReloadFrequency { balanceId financialInstrumentId reloadAmount { currencyCode value } startDate startDay recurrence } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CreateBalanceAutoReloadInput createBalanceAutoReloadInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateBalanceAutoReloadMutation(input=");
        sb.append(createBalanceAutoReloadInput);
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
        return (other instanceof com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation) other).input);
    }

    public final com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation copy(com.paypal.oslo.api.graphql.schema.type.CreateBalanceAutoReloadInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreateBalanceAutoReloadInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation copy$default(com.paypal.oslo.feature.balance.graphql.CreateBalanceAutoReloadMutation createBalanceAutoReloadMutation, com.paypal.oslo.api.graphql.schema.type.CreateBalanceAutoReloadInput createBalanceAutoReloadInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            createBalanceAutoReloadInput = createBalanceAutoReloadMutation.input;
        }
        return createBalanceAutoReloadMutation.copy(createBalanceAutoReloadInput);
    }
}
