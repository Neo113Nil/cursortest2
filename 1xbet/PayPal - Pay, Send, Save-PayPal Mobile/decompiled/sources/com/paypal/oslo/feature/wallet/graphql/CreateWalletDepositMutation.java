package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/AddDepositInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AddDepositInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AddDepositInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AddDepositInput;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AddDepositInput;", "getInput", "Companion", "Data", "AddDeposit", "Deposit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CreateWalletDepositMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data> {
    public static final java.lang.String OPERATION_ID = "de193f82c6e9ab385493f7e237e93cc8cbbfcedc701d5a79f4a1f0d1887d6305";
    public static final java.lang.String OPERATION_NAME = "CreateWalletDeposit";
    private final com.paypal.oslo.api.graphql.schema.type.AddDepositInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Companion(null);
    public static final int $stable = 8;

    public CreateWalletDepositMutation(com.paypal.oslo.api.graphql.schema.type.AddDepositInput addDepositInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addDepositInput, "");
        this.input = addDepositInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddDepositInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.CreateWalletDepositMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.CreateWalletDepositMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.CreateWalletDepositMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$AddDeposit;", "addDeposit", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$AddDeposit;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$AddDeposit;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$AddDeposit;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$AddDeposit;", "getAddDeposit"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit addDeposit;

        public Data(com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit addDeposit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addDeposit, "");
            this.addDeposit = addDeposit;
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit getAddDeposit() {
            return this.addDeposit;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit addDeposit = this.addDeposit;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(addDeposit=");
            sb.append(addDeposit);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.addDeposit.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.addDeposit, ((com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data) other).addDeposit);
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data copy(com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit addDeposit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addDeposit, "");
            return new com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data(addDeposit);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit getAddDeposit() {
            return this.addDeposit;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data data, com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit addDeposit, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addDeposit = data.addDeposit;
            }
            return data.copy(addDeposit);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$AddDeposit;", "", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Deposit;", "deposit", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Deposit;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Deposit;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Deposit;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$AddDeposit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Deposit;", "getDeposit"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddDeposit {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit deposit;

        public AddDeposit(com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit deposit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deposit, "");
            this.deposit = deposit;
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit getDeposit() {
            return this.deposit;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit deposit = this.deposit;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddDeposit(deposit=");
            sb.append(deposit);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.deposit.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit) && kotlin.jvm.internal.Intrinsics.areEqual(this.deposit, ((com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit) other).deposit);
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit copy(com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit deposit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deposit, "");
            return new com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit(deposit);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit getDeposit() {
            return this.deposit;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.AddDeposit addDeposit, com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit deposit, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deposit = addDeposit.deposit;
            }
            return addDeposit.copy(deposit);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Deposit;", "", "", "id", "createTime", "Lcom/paypal/oslo/api/graphql/schema/type/DepositStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/DepositType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/DepositStatus;Lcom/paypal/oslo/api/graphql/schema/type/DepositType;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/DepositStatus;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/DepositType;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/DepositStatus;Lcom/paypal/oslo/api/graphql/schema/type/DepositType;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Deposit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getCreateTime", "Lcom/paypal/oslo/api/graphql/schema/type/DepositStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/DepositType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Deposit {
        public static final int $stable = 8;
        private final java.lang.Object createTime;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.DepositStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.DepositType type;

        public Deposit(java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.DepositStatus depositStatus, com.paypal.oslo.api.graphql.schema.type.DepositType depositType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositStatus, "");
            this.id = str;
            this.createTime = obj;
            this.status = depositStatus;
            this.type = depositType;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DepositStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DepositType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.Object obj = this.createTime;
            com.paypal.oslo.api.graphql.schema.type.DepositStatus depositStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.DepositType depositType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Deposit(id=");
            sb.append(str);
            sb.append(", createTime=");
            sb.append(obj);
            sb.append(", status=");
            sb.append(depositStatus);
            sb.append(", type=");
            sb.append(depositType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.Object obj = this.createTime;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            int hashCode3 = this.status.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DepositType depositType = this.type;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (depositType != null ? depositType.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit deposit = (com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, deposit.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, deposit.createTime) && this.status == deposit.status && this.type == deposit.type;
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit copy(java.lang.String id, java.lang.Object createTime, com.paypal.oslo.api.graphql.schema.type.DepositStatus status, com.paypal.oslo.api.graphql.schema.type.DepositType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit(id, createTime, status, type);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DepositType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DepositStatus getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit deposit, java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.DepositStatus depositStatus, com.paypal.oslo.api.graphql.schema.type.DepositType depositType, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = deposit.id;
            }
            if ((i & 2) != 0) {
                obj = deposit.createTime;
            }
            if ((i & 4) != 0) {
                depositStatus = deposit.status;
            }
            if ((i & 8) != 0) {
                depositType = deposit.type;
            }
            return deposit.copy(str, obj, depositStatus, depositType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CreateWalletDeposit($input: AddDepositInput!) { addDeposit(input: $input) { deposit { id createTime status type } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AddDepositInput addDepositInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateWalletDepositMutation(input=");
        sb.append(addDepositInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation copy(com.paypal.oslo.api.graphql.schema.type.AddDepositInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddDepositInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation createWalletDepositMutation, com.paypal.oslo.api.graphql.schema.type.AddDepositInput addDepositInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addDepositInput = createWalletDepositMutation.input;
        }
        return createWalletDepositMutation.copy(addDepositInput);
    }
}
