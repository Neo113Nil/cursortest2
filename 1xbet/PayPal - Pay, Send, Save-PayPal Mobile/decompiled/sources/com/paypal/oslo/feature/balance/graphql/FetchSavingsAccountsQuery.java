package com.paypal.oslo.feature.balance.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006!\"#$% B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "SavingsAccount", "Moneybox", "CurrentBalance", "TotalBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FetchSavingsAccountsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Companion INSTANCE = new com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "f6ec2b0660c25bc5bfe71be48235cb2d568adf115b650aeb00617a111afa1349";
    public static final java.lang.String OPERATION_NAME = "FetchSavingsAccounts";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.balance.graphql.adapter.FetchSavingsAccountsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.balance.graphql.selections.FetchSavingsAccountsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R!\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$SavingsAccount;", "savingsAccounts", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSavingsAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount> savingsAccounts;

        public Data(java.util.List<com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount> list) {
            this.savingsAccounts = list;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount> getSavingsAccounts() {
            return this.savingsAccounts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount> list = this.savingsAccounts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(savingsAccounts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount> list = this.savingsAccounts;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccounts, ((com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Data) other).savingsAccounts);
        }

        public final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Data copy(java.util.List<com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount> savingsAccounts) {
            return new com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Data(savingsAccounts);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount> component1() {
            return this.savingsAccounts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Data copy$default(com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.savingsAccounts;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$SavingsAccount;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "accountStatus", "moneyboxId", "Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Moneybox;", "moneybox", "Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$TotalBalance;", "totalBalance", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Moneybox;Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$TotalBalance;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "component3", "component4", "()Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Moneybox;", "component5", "()Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$TotalBalance;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Moneybox;Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$TotalBalance;)Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$SavingsAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "getAccountStatus", "getMoneyboxId", "Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Moneybox;", "getMoneybox", "Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$TotalBalance;", "getTotalBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsAccount {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus accountStatus;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox moneybox;
        private final java.lang.String moneyboxId;
        private final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance totalBalance;

        public SavingsAccount(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus, java.lang.String str2, com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox moneybox, com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance totalBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.accountStatus = savingsAccountStatus;
            this.moneyboxId = str2;
            this.moneybox = moneybox;
            this.totalBalance = totalBalance;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus getAccountStatus() {
            return this.accountStatus;
        }

        public final java.lang.String getMoneyboxId() {
            return this.moneyboxId;
        }

        public final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox getMoneybox() {
            return this.moneybox;
        }

        public final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance getTotalBalance() {
            return this.totalBalance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus = this.accountStatus;
            java.lang.String str2 = this.moneyboxId;
            com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox moneybox = this.moneybox;
            com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance totalBalance = this.totalBalance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccount(id=");
            sb.append(str);
            sb.append(", accountStatus=");
            sb.append(savingsAccountStatus);
            sb.append(", moneyboxId=");
            sb.append(str2);
            sb.append(", moneybox=");
            sb.append(moneybox);
            sb.append(", totalBalance=");
            sb.append(totalBalance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.accountStatus.hashCode();
            int hashCode3 = this.moneyboxId.hashCode();
            com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox moneybox = this.moneybox;
            int hashCode4 = moneybox == null ? 0 : moneybox.hashCode();
            com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance totalBalance = this.totalBalance;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (totalBalance != null ? totalBalance.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount savingsAccount = (com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, savingsAccount.id) && this.accountStatus == savingsAccount.accountStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxId, savingsAccount.moneyboxId) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneybox, savingsAccount.moneybox) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalBalance, savingsAccount.totalBalance);
        }

        public final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus accountStatus, java.lang.String moneyboxId, com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox moneybox, com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance totalBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxId, "");
            return new com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount(id, accountStatus, moneyboxId, moneybox, totalBalance);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance getTotalBalance() {
            return this.totalBalance;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox getMoneybox() {
            return this.moneybox;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMoneyboxId() {
            return this.moneyboxId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus getAccountStatus() {
            return this.accountStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount copy$default(com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount savingsAccount, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus, java.lang.String str2, com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox moneybox, com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance totalBalance, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = savingsAccount.id;
            }
            if ((i & 2) != 0) {
                savingsAccountStatus = savingsAccount.accountStatus;
            }
            com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus2 = savingsAccountStatus;
            if ((i & 4) != 0) {
                str2 = savingsAccount.moneyboxId;
            }
            java.lang.String str3 = str2;
            if ((i & 8) != 0) {
                moneybox = savingsAccount.moneybox;
            }
            com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox moneybox2 = moneybox;
            if ((i & 16) != 0) {
                totalBalance = savingsAccount.totalBalance;
            }
            return savingsAccount.copy(str, savingsAccountStatus2, str3, moneybox2, totalBalance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Moneybox;", "", "", "id", "name", "Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$CurrentBalance;", "currentBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$CurrentBalance;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$CurrentBalance;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$CurrentBalance;)Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Moneybox;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$CurrentBalance;", "getCurrentBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Moneybox {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance currentBalance;
        private final java.lang.String id;
        private final java.lang.String name;

        public Moneybox(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance currentBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentBalance, "");
            this.id = str;
            this.name = str2;
            this.currentBalance = currentBalance;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance getCurrentBalance() {
            return this.currentBalance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance currentBalance = this.currentBalance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Moneybox(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", currentBalance=");
            sb.append(currentBalance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.currentBalance.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox moneybox = (com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, moneybox.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, moneybox.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentBalance, moneybox.currentBalance);
        }

        public final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox copy(java.lang.String id, java.lang.String name2, com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance currentBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentBalance, "");
            return new com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox(id, name2, currentBalance);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance getCurrentBalance() {
            return this.currentBalance;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox copy$default(com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox moneybox, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance currentBalance, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = moneybox.id;
            }
            if ((i & 2) != 0) {
                str2 = moneybox.name;
            }
            if ((i & 4) != 0) {
                currentBalance = moneybox.currentBalance;
            }
            return moneybox.copy(str, str2, currentBalance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$CurrentBalance;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$CurrentBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrentBalance {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public CurrentBalance(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrentBalance(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance currentBalance = (com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, currentBalance.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, currentBalance.currencyCode);
        }

        public final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance copy$default(com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.CurrentBalance currentBalance, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = currentBalance.value;
            }
            if ((i & 2) != 0) {
                obj = currentBalance.currencyCode;
            }
            return currentBalance.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$TotalBalance;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$TotalBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalBalance {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalBalance(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalBalance(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance totalBalance = (com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalBalance.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalBalance.currencyCode);
        }

        public final com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance copy$default(com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance totalBalance, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = totalBalance.value;
            }
            if ((i & 2) != 0) {
                obj = totalBalance.currencyCode;
            }
            return totalBalance.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query FetchSavingsAccounts { savingsAccounts(input: { includeInactive: false } ) { id accountStatus moneyboxId moneybox { id name currentBalance { value currencyCode } } totalBalance { value currencyCode } } }";
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
