package com.paypal.oslo.feature.smartroute.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006!\"#$% B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "Balances", "Item", "SavingsAccount", "TotalBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetSmartRouteSavingsAutoReloadSetupDetailsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Companion INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "1fed5f900ee5ce4da9a333e79b48327e2634240a9659ac77a92cd0ea4a169aa3";
    public static final java.lang.String OPERATION_NAME = "GetSmartRouteSavingsAutoReloadSetupDetails";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRouteSavingsAutoReloadSetupDetailsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.smartroute.graphql.selections.GetSmartRouteSavingsAutoReloadSetupDetailsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Balances;", "balances", "", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$SavingsAccount;", "savingsAccounts", "<init>", "(Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Balances;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Balances;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Balances;Ljava/util/List;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Balances;", "getBalances", "Ljava/util/List;", "getSavingsAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances balances;
        private final java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount> savingsAccounts;

        public Data(com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances balances, java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            this.balances = balances;
            this.savingsAccounts = list;
        }

        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances getBalances() {
            return this.balances;
        }

        public final java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount> getSavingsAccounts() {
            return this.savingsAccounts;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances balances = this.balances;
            java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount> list = this.savingsAccounts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(balances=");
            sb.append(balances);
            sb.append(", savingsAccounts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.balances.hashCode();
            java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount> list = this.savingsAccounts;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data data = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.balances, data.balances) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccounts, data.savingsAccounts);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data copy(com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances balances, java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount> savingsAccounts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data(balances, savingsAccounts);
        }

        public final java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount> component2() {
            return this.savingsAccounts;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances getBalances() {
            return this.balances;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data copy$default(com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data data, com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances balances, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balances = data.balances;
            }
            if ((i & 2) != 0) {
                list = data.savingsAccounts;
            }
            return data.copy(balances, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Balances;", "", "", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Balances;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balances {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item> items;

        public Balances(java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balances(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances) other).items);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances copy(java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances(items);
        }

        public final java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances copy$default(com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Balances balances, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = balances.items;
            }
            return balances.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Item;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final java.lang.String id;

        public Item(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item) other).id);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item copy$default(com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item item, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            return item.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$SavingsAccount;", "", "", "moneyboxId", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$TotalBalance;", "totalBalance", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$TotalBalance;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$TotalBalance;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$TotalBalance;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$SavingsAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMoneyboxId", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$TotalBalance;", "getTotalBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsAccount {
        public static final int $stable = 8;
        private final java.lang.String moneyboxId;
        private final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance totalBalance;

        public SavingsAccount(java.lang.String str, com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance totalBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.moneyboxId = str;
            this.totalBalance = totalBalance;
        }

        public final java.lang.String getMoneyboxId() {
            return this.moneyboxId;
        }

        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance getTotalBalance() {
            return this.totalBalance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.moneyboxId;
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance totalBalance = this.totalBalance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccount(moneyboxId=");
            sb.append(str);
            sb.append(", totalBalance=");
            sb.append(totalBalance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.moneyboxId.hashCode();
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance totalBalance = this.totalBalance;
            return (hashCode * 31) + (totalBalance == null ? 0 : totalBalance.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount savingsAccount = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxId, savingsAccount.moneyboxId) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalBalance, savingsAccount.totalBalance);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount copy(java.lang.String moneyboxId, com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance totalBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxId, "");
            return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount(moneyboxId, totalBalance);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance getTotalBalance() {
            return this.totalBalance;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMoneyboxId() {
            return this.moneyboxId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount copy$default(com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount savingsAccount, java.lang.String str, com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance totalBalance, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = savingsAccount.moneyboxId;
            }
            if ((i & 2) != 0) {
                totalBalance = savingsAccount.totalBalance;
            }
            return savingsAccount.copy(str, totalBalance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$TotalBalance;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$TotalBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance totalBalance = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalBalance.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalBalance.currencyCode);
        }

        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance copy$default(com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance totalBalance, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = totalBalance.value;
            }
            if ((i & 2) != 0) {
                obj = totalBalance.currencyCode;
            }
            return totalBalance.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetSmartRouteSavingsAutoReloadSetupDetails { balances { items { id } } savingsAccounts { moneyboxId totalBalance { value currencyCode } } }";
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
