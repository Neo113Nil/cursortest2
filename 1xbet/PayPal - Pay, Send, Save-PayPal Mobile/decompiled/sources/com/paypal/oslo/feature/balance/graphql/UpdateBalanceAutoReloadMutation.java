package com.paypal.oslo.feature.balance.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006*+,-.)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBalanceAutoReloadInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateBalanceAutoReloadInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateBalanceAutoReloadInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateBalanceAutoReloadInput;)Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBalanceAutoReloadInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OPERATION_NAME, "BalanceAutoReload", "OnBalanceAutoReloadThreshold", "OnBalanceAutoReloadFrequency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdateBalanceAutoReloadMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Data> {
    public static final java.lang.String OPERATION_ID = "c882812647bbfbfd113f5df5c972cc56776b688c459ff1af93b07ae17d583dc1";
    public static final java.lang.String OPERATION_NAME = "UpdateBalanceAutoReload";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateBalanceAutoReloadInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Companion INSTANCE = new com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateBalanceAutoReloadMutation(com.paypal.oslo.api.graphql.schema.type.UpdateBalanceAutoReloadInput updateBalanceAutoReloadInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateBalanceAutoReloadInput, "");
        this.input = updateBalanceAutoReloadInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateBalanceAutoReloadInput getInput() {
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
        com.paypal.oslo.feature.balance.graphql.adapter.UpdateBalanceAutoReloadMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.balance.graphql.adapter.UpdateBalanceAutoReloadMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.balance.graphql.selections.UpdateBalanceAutoReloadMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$UpdateBalanceAutoReload;", "updateBalanceAutoReload", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$UpdateBalanceAutoReload;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$UpdateBalanceAutoReload;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$UpdateBalanceAutoReload;)Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$UpdateBalanceAutoReload;", "getUpdateBalanceAutoReload"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload updateBalanceAutoReload;

        public Data(com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload updateBalanceAutoReload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateBalanceAutoReload, "");
            this.updateBalanceAutoReload = updateBalanceAutoReload;
        }

        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload getUpdateBalanceAutoReload() {
            return this.updateBalanceAutoReload;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload updateBalanceAutoReload = this.updateBalanceAutoReload;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateBalanceAutoReload=");
            sb.append(updateBalanceAutoReload);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updateBalanceAutoReload.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateBalanceAutoReload, ((com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Data) other).updateBalanceAutoReload);
        }

        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Data copy(com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload updateBalanceAutoReload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateBalanceAutoReload, "");
            return new com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Data(updateBalanceAutoReload);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload getUpdateBalanceAutoReload() {
            return this.updateBalanceAutoReload;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Data copy$default(com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Data data, com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload updateBalanceAutoReload, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateBalanceAutoReload = data.updateBalanceAutoReload;
            }
            return data.copy(updateBalanceAutoReload);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$UpdateBalanceAutoReload;", "", "", "success", "Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$BalanceAutoReload;", "balanceAutoReload", "<init>", "(ZLcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$BalanceAutoReload;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$BalanceAutoReload;", "copy", "(ZLcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$BalanceAutoReload;)Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$UpdateBalanceAutoReload;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$BalanceAutoReload;", "getBalanceAutoReload"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateBalanceAutoReload {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload;
        private final boolean success;

        public UpdateBalanceAutoReload(boolean z, com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload) {
            this.success = z;
            this.balanceAutoReload = balanceAutoReload;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload getBalanceAutoReload() {
            return this.balanceAutoReload;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload = this.balanceAutoReload;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateBalanceAutoReload(success=");
            sb.append(z);
            sb.append(", balanceAutoReload=");
            sb.append(balanceAutoReload);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.success);
            com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload = this.balanceAutoReload;
            return (hashCode * 31) + (balanceAutoReload == null ? 0 : balanceAutoReload.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload updateBalanceAutoReload = (com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload) other;
            return this.success == updateBalanceAutoReload.success && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceAutoReload, updateBalanceAutoReload.balanceAutoReload);
        }

        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload copy(boolean success, com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload) {
            return new com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload(success, balanceAutoReload);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload getBalanceAutoReload() {
            return this.balanceAutoReload;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload copy$default(com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload updateBalanceAutoReload, boolean z, com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = updateBalanceAutoReload.success;
            }
            if ((i & 2) != 0) {
                balanceAutoReload = updateBalanceAutoReload.balanceAutoReload;
            }
            return updateBalanceAutoReload.copy(z, balanceAutoReload);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$BalanceAutoReload;", "", "", "__typename", "Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;", "onBalanceAutoReloadThreshold", "Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;", "onBalanceAutoReloadFrequency", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;", "component3", "()Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;)Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$BalanceAutoReload;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;", "getOnBalanceAutoReloadThreshold", "Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;", "getOnBalanceAutoReloadFrequency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalanceAutoReload {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency;
        private final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold;

        public BalanceAutoReload(java.lang.String str, com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold, com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBalanceAutoReloadThreshold = onBalanceAutoReloadThreshold;
            this.onBalanceAutoReloadFrequency = onBalanceAutoReloadFrequency;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold getOnBalanceAutoReloadThreshold() {
            return this.onBalanceAutoReloadThreshold;
        }

        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency getOnBalanceAutoReloadFrequency() {
            return this.onBalanceAutoReloadFrequency;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = this.onBalanceAutoReloadThreshold;
            com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency = this.onBalanceAutoReloadFrequency;
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
            com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = this.onBalanceAutoReloadThreshold;
            int hashCode2 = onBalanceAutoReloadThreshold == null ? 0 : onBalanceAutoReloadThreshold.hashCode();
            com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency = this.onBalanceAutoReloadFrequency;
            return (((hashCode * 31) + hashCode2) * 31) + (onBalanceAutoReloadFrequency != null ? onBalanceAutoReloadFrequency.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload = (com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, balanceAutoReload.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalanceAutoReloadThreshold, balanceAutoReload.onBalanceAutoReloadThreshold) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalanceAutoReloadFrequency, balanceAutoReload.onBalanceAutoReloadFrequency);
        }

        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload copy(java.lang.String __typename, com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold, com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload(__typename, onBalanceAutoReloadThreshold, onBalanceAutoReloadFrequency);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency getOnBalanceAutoReloadFrequency() {
            return this.onBalanceAutoReloadFrequency;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold getOnBalanceAutoReloadThreshold() {
            return this.onBalanceAutoReloadThreshold;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload copy$default(com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload, java.lang.String str, com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold, com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;", "operationStatus", "", "balanceId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadThreshold;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;", "getOperationStatus", "Ljava/lang/String;", "getBalanceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalanceAutoReloadThreshold {
        public static final int $stable = 0;
        private final java.lang.String balanceId;
        private final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus operationStatus;

        public OnBalanceAutoReloadThreshold(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.operationStatus = balanceAutoReloadOperationStatus;
            this.balanceId = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus getOperationStatus() {
            return this.operationStatus;
        }

        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus = this.operationStatus;
            java.lang.String str = this.balanceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalanceAutoReloadThreshold(operationStatus=");
            sb.append(balanceAutoReloadOperationStatus);
            sb.append(", balanceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus = this.operationStatus;
            return ((balanceAutoReloadOperationStatus == null ? 0 : balanceAutoReloadOperationStatus.hashCode()) * 31) + this.balanceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = (com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold) other;
            return this.operationStatus == onBalanceAutoReloadThreshold.operationStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, onBalanceAutoReloadThreshold.balanceId);
        }

        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold copy(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus operationStatus, java.lang.String balanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceId, "");
            return new com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold(operationStatus, balanceId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus getOperationStatus() {
            return this.operationStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold copy$default(com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold, com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balanceAutoReloadOperationStatus = onBalanceAutoReloadThreshold.operationStatus;
            }
            if ((i & 2) != 0) {
                str = onBalanceAutoReloadThreshold.balanceId;
            }
            return onBalanceAutoReloadThreshold.copy(balanceAutoReloadOperationStatus, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;", "", "", "balanceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$OnBalanceAutoReloadFrequency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBalanceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalanceAutoReloadFrequency {
        public static final int $stable = 0;
        private final java.lang.String balanceId;

        public OnBalanceAutoReloadFrequency(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.balanceId = str;
        }

        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.balanceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalanceAutoReloadFrequency(balanceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.balanceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, ((com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency) other).balanceId);
        }

        public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency copy(java.lang.String balanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceId, "");
            return new com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency(balanceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency copy$default(com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBalanceAutoReloadFrequency.balanceId;
            }
            return onBalanceAutoReloadFrequency.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateBalanceAutoReload($input: UpdateBalanceAutoReloadInput!) { updateBalanceAutoReload(input: $input) { success balanceAutoReload { __typename ... on BalanceAutoReloadThreshold { operationStatus balanceId } ... on BalanceAutoReloadFrequency { balanceId } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateBalanceAutoReloadInput updateBalanceAutoReloadInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateBalanceAutoReloadMutation(input=");
        sb.append(updateBalanceAutoReloadInput);
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
        return (other instanceof com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation) other).input);
    }

    public final com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateBalanceAutoReloadInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateBalanceAutoReloadInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation copy$default(com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation updateBalanceAutoReloadMutation, com.paypal.oslo.api.graphql.schema.type.UpdateBalanceAutoReloadInput updateBalanceAutoReloadInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateBalanceAutoReloadInput = updateBalanceAutoReloadMutation.input;
        }
        return updateBalanceAutoReloadMutation.copy(updateBalanceAutoReloadInput);
    }
}
