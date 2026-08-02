package com.paypal.oslo.feature.savings.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxInput;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.OPERATION_NAME, "Moneybox", "TargetAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UpdateMoneyboxMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Data> {
    public static final java.lang.String OPERATION_ID = "d7f642e577621eec3fc0832d639e331440e11ed590f4e44ada719ffdae6fa852";
    public static final java.lang.String OPERATION_NAME = "UpdateMoneybox";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Companion INSTANCE = new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateMoneyboxMutation(com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput updateMoneyboxInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateMoneyboxInput, "");
        this.input = updateMoneyboxInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput getInput() {
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
        com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.savings.graphql.selections.UpdateMoneyboxMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$UpdateMoneybox;", "updateMoneybox", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$UpdateMoneybox;)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$UpdateMoneybox;", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$UpdateMoneybox;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$UpdateMoneybox;", "getUpdateMoneybox"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox updateMoneybox;

        public Data(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox updateMoneybox) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateMoneybox, "");
            this.updateMoneybox = updateMoneybox;
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox getUpdateMoneybox() {
            return this.updateMoneybox;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox updateMoneybox = this.updateMoneybox;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateMoneybox=");
            sb.append(updateMoneybox);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updateMoneybox.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateMoneybox, ((com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Data) other).updateMoneybox);
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Data copy(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox updateMoneybox) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateMoneybox, "");
            return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Data(updateMoneybox);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox getUpdateMoneybox() {
            return this.updateMoneybox;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Data copy$default(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Data data, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox updateMoneybox, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateMoneybox = data.updateMoneybox;
            }
            return data.copy(updateMoneybox);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$UpdateMoneybox;", "", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Moneybox;", "moneybox", "", "success", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Moneybox;Z)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Moneybox;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Moneybox;Z)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$UpdateMoneybox;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Moneybox;", "getMoneybox", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateMoneybox {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox moneybox;
        private final boolean success;

        public UpdateMoneybox(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox moneybox, boolean z) {
            this.moneybox = moneybox;
            this.success = z;
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox getMoneybox() {
            return this.moneybox;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox moneybox = this.moneybox;
            boolean z = this.success;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateMoneybox(moneybox=");
            sb.append(moneybox);
            sb.append(", success=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox moneybox = this.moneybox;
            return ((moneybox == null ? 0 : moneybox.hashCode()) * 31) + java.lang.Boolean.hashCode(this.success);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox updateMoneybox = (com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.moneybox, updateMoneybox.moneybox) && this.success == updateMoneybox.success;
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox copy(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox moneybox, boolean success) {
            return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox(moneybox, success);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox getMoneybox() {
            return this.moneybox;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox copy$default(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.UpdateMoneybox updateMoneybox, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox moneybox, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                moneybox = updateMoneybox.moneybox;
            }
            if ((i & 2) != 0) {
                z = updateMoneybox.success;
            }
            return updateMoneybox.copy(moneybox, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JN\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Moneybox;", "", "", "id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$TargetAmount;", "targetAmount", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "category", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$TargetAmount;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$TargetAmount;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$TargetAmount;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Moneybox;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getDescription", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$TargetAmount;", "getTargetAmount", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "getCategory", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Moneybox {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory category;
        private final java.lang.String description;
        private final java.lang.String id;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount targetAmount;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyboxType type;

        public Moneybox(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount targetAmount, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory, com.paypal.oslo.api.graphql.schema.type.MoneyboxType moneyboxType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxCategory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxType, "");
            this.id = str;
            this.name = str2;
            this.description = str3;
            this.targetAmount = targetAmount;
            this.category = moneyboxCategory;
            this.type = moneyboxType;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount getTargetAmount() {
            return this.targetAmount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory getCategory() {
            return this.category;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.description;
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount targetAmount = this.targetAmount;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory = this.category;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxType moneyboxType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Moneybox(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", description=");
            sb.append(str3);
            sb.append(", targetAmount=");
            sb.append(targetAmount);
            sb.append(", category=");
            sb.append(moneyboxCategory);
            sb.append(", type=");
            sb.append(moneyboxType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.String str = this.description;
            return (((((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.targetAmount.hashCode()) * 31) + this.category.hashCode()) * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox moneybox = (com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, moneybox.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, moneybox.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, moneybox.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, moneybox.targetAmount) && this.category == moneybox.category && this.type == moneybox.type;
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox copy(java.lang.String id, java.lang.String name2, java.lang.String description, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount targetAmount, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory category, com.paypal.oslo.api.graphql.schema.type.MoneyboxType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox(id, name2, description, targetAmount, category, type);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxType getType() {
            return this.type;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory getCategory() {
            return this.category;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount getTargetAmount() {
            return this.targetAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox copy$default(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox moneybox, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount targetAmount, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory, com.paypal.oslo.api.graphql.schema.type.MoneyboxType moneyboxType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = moneybox.id;
            }
            if ((i & 2) != 0) {
                str2 = moneybox.name;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = moneybox.description;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                targetAmount = moneybox.targetAmount;
            }
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount targetAmount2 = targetAmount;
            if ((i & 16) != 0) {
                moneyboxCategory = moneybox.category;
            }
            com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory2 = moneyboxCategory;
            if ((i & 32) != 0) {
                moneyboxType = moneybox.type;
            }
            return moneybox.copy(str, str4, str5, targetAmount2, moneyboxCategory2, moneyboxType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$TargetAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$TargetAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TargetAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TargetAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount targetAmount = (com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, targetAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, targetAmount.value);
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount copy$default(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.TargetAmount targetAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = targetAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = targetAmount.value;
            }
            return targetAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateMoneybox($input: UpdateMoneyboxInput!) { updateMoneybox(input: $input) { moneybox { id name description targetAmount { currencyCode value } category type } success } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput updateMoneyboxInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateMoneyboxMutation(input=");
        sb.append(updateMoneyboxInput);
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
        return (other instanceof com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation) other).input);
    }

    public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation copy$default(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation updateMoneyboxMutation, com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput updateMoneyboxInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateMoneyboxInput = updateMoneyboxMutation.input;
        }
        return updateMoneyboxMutation.copy(updateMoneyboxInput);
    }
}
