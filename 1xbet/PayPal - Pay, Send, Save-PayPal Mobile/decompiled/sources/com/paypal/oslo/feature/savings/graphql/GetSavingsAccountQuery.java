package com.paypal.oslo.feature.savings.graphql;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,*B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsAccountQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsAccountQuery$Data;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountsInput;", "savingsAccountsInput", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsAccountQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getSavingsAccountsInput", "Companion", "Data", "SavingsAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetSavingsAccountQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.Data> {
    public static final java.lang.String OPERATION_ID = "e2ba3cbb284aec666b433242e2f5d11db35d390342767bd67bccd69c48755a2c";
    public static final java.lang.String OPERATION_NAME = "GetSavingsAccount";
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> savingsAccountsInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.Companion INSTANCE = new com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.Companion(null);
    public static final int $stable = 8;

    public GetSavingsAccountQuery(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.savingsAccountsInput = optional;
    }

    public /* synthetic */ GetSavingsAccountQuery(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> getSavingsAccountsInput() {
        return this.savingsAccountsInput;
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
        return "GetSavingsAccount";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsAccountQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsAccountQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.savings.graphql.selections.GetSavingsAccountQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R!\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsAccountQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsAccountQuery$SavingsAccount;", "savingsAccounts", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsAccountQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSavingsAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount> savingsAccounts;

        public Data(java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount> list) {
            this.savingsAccounts = list;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount> getSavingsAccounts() {
            return this.savingsAccounts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount> list = this.savingsAccounts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(savingsAccounts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount> list = this.savingsAccounts;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccounts, ((com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.Data) other).savingsAccounts);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.Data copy(java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount> savingsAccounts) {
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.Data(savingsAccounts);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount> component1() {
            return this.savingsAccounts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.Data copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.savingsAccounts;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsAccountQuery$SavingsAccount;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "accountStatus", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsAccountQuery$SavingsAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "getAccountStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsAccount {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus accountStatus;
        private final java.lang.String id;

        public SavingsAccount(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountStatus, "");
            this.id = str;
            this.accountStatus = savingsAccountStatus;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus getAccountStatus() {
            return this.accountStatus;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus = this.accountStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccount(id=");
            sb.append(str);
            sb.append(", accountStatus=");
            sb.append(savingsAccountStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.accountStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount savingsAccount = (com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, savingsAccount.id) && this.accountStatus == savingsAccount.accountStatus;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus accountStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountStatus, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount(id, accountStatus);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus getAccountStatus() {
            return this.accountStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount savingsAccount, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = savingsAccount.id;
            }
            if ((i & 2) != 0) {
                savingsAccountStatus = savingsAccount.accountStatus;
            }
            return savingsAccount.copy(str, savingsAccountStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsAccountQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetSavingsAccount($savingsAccountsInput: SavingsAccountsInput) { savingsAccounts(input: $savingsAccountsInput) { id accountStatus } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> optional = this.savingsAccountsInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSavingsAccountQuery(savingsAccountsInput=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.savingsAccountsInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccountsInput, ((com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery) other).savingsAccountsInput);
    }

    public final com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> savingsAccountsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountsInput, "");
        return new com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery(savingsAccountsInput);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> component1() {
        return this.savingsAccountsInput;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery getSavingsAccountQuery, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = getSavingsAccountQuery.savingsAccountsInput;
        }
        return getSavingsAccountQuery.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetSavingsAccountQuery() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
