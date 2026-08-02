package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ConfirmBankAccountInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ConfirmBankAccountInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ConfirmBankAccountInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ConfirmBankAccountInput;)Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ConfirmBankAccountInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.OPERATION_NAME, "BankAccount", "Confirmation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ConfirmBankAccountMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data> {
    public static final java.lang.String OPERATION_ID = "cf45214836fddfe313c81369c38c3ae9d495b7d2bb94330e8f846e31d028b8e9";
    public static final java.lang.String OPERATION_NAME = "ConfirmBankAccount";
    private final com.paypal.oslo.api.graphql.schema.type.ConfirmBankAccountInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Companion(null);
    public static final int $stable = 8;

    public ConfirmBankAccountMutation(com.paypal.oslo.api.graphql.schema.type.ConfirmBankAccountInput confirmBankAccountInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmBankAccountInput, "");
        this.input = confirmBankAccountInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ConfirmBankAccountInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.ConfirmBankAccountMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.ConfirmBankAccountMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.ConfirmBankAccountMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$ConfirmBankAccount;", "confirmBankAccount", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$ConfirmBankAccount;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$ConfirmBankAccount;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$ConfirmBankAccount;)Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$ConfirmBankAccount;", "getConfirmBankAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount confirmBankAccount;

        public Data(com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount confirmBankAccount) {
            this.confirmBankAccount = confirmBankAccount;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount getConfirmBankAccount() {
            return this.confirmBankAccount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount confirmBankAccount = this.confirmBankAccount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(confirmBankAccount=");
            sb.append(confirmBankAccount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount confirmBankAccount = this.confirmBankAccount;
            if (confirmBankAccount == null) {
                return 0;
            }
            return confirmBankAccount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmBankAccount, ((com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data) other).confirmBankAccount);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data copy(com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount confirmBankAccount) {
            return new com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data(confirmBankAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount getConfirmBankAccount() {
            return this.confirmBankAccount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data copy$default(com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data data, com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount confirmBankAccount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                confirmBankAccount = data.confirmBankAccount;
            }
            return data.copy(confirmBankAccount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$ConfirmBankAccount;", "", "", "success", "", "id", "Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$BankAccount;", "bankAccount", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$BankAccount;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$BankAccount;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$BankAccount;)Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$ConfirmBankAccount;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Boolean;", "getSuccess", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$BankAccount;", "getBankAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmBankAccount {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount bankAccount;
        private final java.lang.String id;
        private final java.lang.Boolean success;

        public ConfirmBankAccount(java.lang.Boolean bool, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount bankAccount) {
            this.success = bool;
            this.id = str;
            this.bankAccount = bankAccount;
        }

        public final java.lang.Boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount getBankAccount() {
            return this.bankAccount;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.success;
            java.lang.String str = this.id;
            com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount bankAccount = this.bankAccount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmBankAccount(success=");
            sb.append(bool);
            sb.append(", id=");
            sb.append(str);
            sb.append(", bankAccount=");
            sb.append(bankAccount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.success;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.String str = this.id;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount bankAccount = this.bankAccount;
            return (((hashCode * 31) + hashCode2) * 31) + (bankAccount != null ? bankAccount.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount confirmBankAccount = (com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.success, confirmBankAccount.success) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, confirmBankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccount, confirmBankAccount.bankAccount);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount copy(java.lang.Boolean success, java.lang.String id, com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount bankAccount) {
            return new com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount(success, id, bankAccount);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount getBankAccount() {
            return this.bankAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount copy$default(com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount confirmBankAccount, java.lang.Boolean bool, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount bankAccount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = confirmBankAccount.success;
            }
            if ((i & 2) != 0) {
                str = confirmBankAccount.id;
            }
            if ((i & 4) != 0) {
                bankAccount = confirmBankAccount.bankAccount;
            }
            return confirmBankAccount.copy(bool, str, bankAccount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$BankAccount;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "lastNChars", "nickname", "Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$Confirmation;", "confirmation", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$Confirmation;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$Confirmation;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$Confirmation;)Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$BankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "getLastNChars", "getNickname", "Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$Confirmation;", "getConfirmation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccount {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation confirmation;
        private final java.lang.String id;
        private final java.lang.String lastNChars;
        private final java.lang.String nickname;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public BankAccount(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation confirmation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.type = bankAccountType;
            this.lastNChars = str2;
            this.nickname = str3;
            this.confirmation = confirmation;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getNickname() {
            return this.nickname;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation getConfirmation() {
            return this.confirmation;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            java.lang.String str2 = this.lastNChars;
            java.lang.String str3 = this.nickname;
            com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation confirmation = this.confirmation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccount(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", nickname=");
            sb.append(str3);
            sb.append(", confirmation=");
            sb.append(confirmation);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.type.hashCode();
            int hashCode3 = this.lastNChars.hashCode();
            java.lang.String str = this.nickname;
            int hashCode4 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation confirmation = this.confirmation;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (confirmation != null ? confirmation.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount bankAccount = (com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bankAccount.id) && this.type == bankAccount.type && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bankAccount.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, bankAccount.nickname) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmation, bankAccount.confirmation);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, java.lang.String lastNChars, java.lang.String nickname, com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation confirmation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            return new com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount(id, type, lastNChars, nickname, confirmation);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation getConfirmation() {
            return this.confirmation;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNickname() {
            return this.nickname;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount copy$default(com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount bankAccount, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation confirmation, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.id;
            }
            if ((i & 2) != 0) {
                bankAccountType = bankAccount.type;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType2 = bankAccountType;
            if ((i & 4) != 0) {
                str2 = bankAccount.lastNChars;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                str3 = bankAccount.nickname;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                confirmation = bankAccount.confirmation;
            }
            return bankAccount.copy(str, bankAccountType2, str4, str5, confirmation);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$Confirmation;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;", "method", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;", "state", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;)Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$Confirmation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;", "getMethod", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;", "getState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Confirmation {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod method;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState state;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus status;

        public Confirmation(com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod bankAccountConfirmationMethod, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountConfirmationStatus, "");
            this.status = bankAccountConfirmationStatus;
            this.method = bankAccountConfirmationMethod;
            this.state = bankAccountConfirmationState;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod getMethod() {
            return this.method;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState getState() {
            return this.state;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod bankAccountConfirmationMethod = this.method;
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState = this.state;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Confirmation(status=");
            sb.append(bankAccountConfirmationStatus);
            sb.append(", method=");
            sb.append(bankAccountConfirmationMethod);
            sb.append(", state=");
            sb.append(bankAccountConfirmationState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod bankAccountConfirmationMethod = this.method;
            int hashCode2 = bankAccountConfirmationMethod == null ? 0 : bankAccountConfirmationMethod.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState = this.state;
            return (((hashCode * 31) + hashCode2) * 31) + (bankAccountConfirmationState != null ? bankAccountConfirmationState.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation confirmation = (com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation) other;
            return this.status == confirmation.status && this.method == confirmation.method && this.state == confirmation.state;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation copy(com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus status, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod method, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation(status, method, state);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod getMethod() {
            return this.method;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation copy$default(com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation confirmation, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod bankAccountConfirmationMethod, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankAccountConfirmationStatus = confirmation.status;
            }
            if ((i & 2) != 0) {
                bankAccountConfirmationMethod = confirmation.method;
            }
            if ((i & 4) != 0) {
                bankAccountConfirmationState = confirmation.state;
            }
            return confirmation.copy(bankAccountConfirmationStatus, bankAccountConfirmationMethod, bankAccountConfirmationState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ConfirmBankAccountMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ConfirmBankAccount($input: ConfirmBankAccountInput!) { confirmBankAccount(input: $input) { success id bankAccount { id type lastNChars nickname confirmation { status method state } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ConfirmBankAccountInput confirmBankAccountInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmBankAccountMutation(input=");
        sb.append(confirmBankAccountInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation copy(com.paypal.oslo.api.graphql.schema.type.ConfirmBankAccountInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ConfirmBankAccountInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation copy$default(com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation confirmBankAccountMutation, com.paypal.oslo.api.graphql.schema.type.ConfirmBankAccountInput confirmBankAccountInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            confirmBankAccountInput = confirmBankAccountMutation.input;
        }
        return confirmBankAccountMutation.copy(confirmBankAccountInput);
    }
}
