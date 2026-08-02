package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0010!\"#$%&'()*+,-./ B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "Balances", "TotalAvailableAmount", "TotalReservedAmount", "TotalPendingAmount", "Item", "Available", "Amount", "PrimaryCurrencyAmount", "Reserved", "Amount1", "PrimaryCurrencyAmount1", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING, "Amount2", "PrimaryCurrencyAmount2"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetAccountBalancesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "1a627fe31185d2b88291a0998a8ccef4c6af6ecab053502b414fcb2604b31a19";
    public static final java.lang.String OPERATION_NAME = "GetAccountBalances";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetAccountBalancesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetAccountBalancesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Balances;", "balances", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Balances;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Balances;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Balances;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Balances;", "getBalances"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances balances;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            this.balances = balances;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances getBalances() {
            return this.balances;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances balances = this.balances;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(balances=");
            sb.append(balances);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.balances.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.balances, ((com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data) other).balances);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data(balances);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances getBalances() {
            return this.balances;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances balances, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balances = data.balances;
            }
            return data.copy(balances);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Balances;", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalAvailableAmount;", "totalAvailableAmount", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalReservedAmount;", "totalReservedAmount", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalPendingAmount;", "totalPendingAmount", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Item;", "items", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalAvailableAmount;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalReservedAmount;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalPendingAmount;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalAvailableAmount;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalReservedAmount;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalPendingAmount;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalAvailableAmount;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalReservedAmount;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalPendingAmount;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Balances;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalAvailableAmount;", "getTotalAvailableAmount", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalReservedAmount;", "getTotalReservedAmount", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalPendingAmount;", "getTotalPendingAmount", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balances {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item> items;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount totalAvailableAmount;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount totalPendingAmount;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount totalReservedAmount;

        public Balances(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount totalAvailableAmount, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount totalReservedAmount, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount totalPendingAmount, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalReservedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.totalAvailableAmount = totalAvailableAmount;
            this.totalReservedAmount = totalReservedAmount;
            this.totalPendingAmount = totalPendingAmount;
            this.items = list;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount getTotalAvailableAmount() {
            return this.totalAvailableAmount;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount getTotalReservedAmount() {
            return this.totalReservedAmount;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount getTotalPendingAmount() {
            return this.totalPendingAmount;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount totalAvailableAmount = this.totalAvailableAmount;
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount totalReservedAmount = this.totalReservedAmount;
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount totalPendingAmount = this.totalPendingAmount;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balances(totalAvailableAmount=");
            sb.append(totalAvailableAmount);
            sb.append(", totalReservedAmount=");
            sb.append(totalReservedAmount);
            sb.append(", totalPendingAmount=");
            sb.append(totalPendingAmount);
            sb.append(", items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.totalAvailableAmount.hashCode();
            int hashCode2 = this.totalReservedAmount.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount totalPendingAmount = this.totalPendingAmount;
            return (((((hashCode * 31) + hashCode2) * 31) + (totalPendingAmount == null ? 0 : totalPendingAmount.hashCode())) * 31) + this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances balances = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.totalAvailableAmount, balances.totalAvailableAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalReservedAmount, balances.totalReservedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalPendingAmount, balances.totalPendingAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, balances.items);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances copy(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount totalAvailableAmount, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount totalReservedAmount, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount totalPendingAmount, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalReservedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances(totalAvailableAmount, totalReservedAmount, totalPendingAmount, items);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item> component4() {
            return this.items;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount getTotalPendingAmount() {
            return this.totalPendingAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount getTotalReservedAmount() {
            return this.totalReservedAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount getTotalAvailableAmount() {
            return this.totalAvailableAmount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances balances, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount totalAvailableAmount, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount totalReservedAmount, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount totalPendingAmount, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                totalAvailableAmount = balances.totalAvailableAmount;
            }
            if ((i & 2) != 0) {
                totalReservedAmount = balances.totalReservedAmount;
            }
            if ((i & 4) != 0) {
                totalPendingAmount = balances.totalPendingAmount;
            }
            if ((i & 8) != 0) {
                list = balances.items;
            }
            return balances.copy(totalAvailableAmount, totalReservedAmount, totalPendingAmount, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalAvailableAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalAvailableAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAvailableAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalAvailableAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAvailableAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount totalAvailableAmount = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalAvailableAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalAvailableAmount.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount totalAvailableAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalAvailableAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalAvailableAmount.value;
            }
            return totalAvailableAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalReservedAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalReservedAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalReservedAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalReservedAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalReservedAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount totalReservedAmount = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalReservedAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalReservedAmount.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount totalReservedAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalReservedAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalReservedAmount.value;
            }
            return totalReservedAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalPendingAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$TotalPendingAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalPendingAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalPendingAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalPendingAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount totalPendingAmount = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalPendingAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalPendingAmount.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount totalPendingAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalPendingAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalPendingAmount.value;
            }
            return totalPendingAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JN\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b\u0006\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Item;", "", "", "id", "", "isBalanceAccountOpen", "isBalanceAccountPrimary", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Available;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Reserved;", "reserved", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Pending;", "pending", "<init>", "(Ljava/lang/String;ZZLcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Available;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Reserved;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Pending;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Available;", "component5", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Reserved;", "component6", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Pending;", "copy", "(Ljava/lang/String;ZZLcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Available;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Reserved;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Pending;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Item;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Z", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Available;", "getAvailable", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Reserved;", "getReserved", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Pending;", "getPending"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available available;
        private final java.lang.String id;
        private final boolean isBalanceAccountOpen;
        private final boolean isBalanceAccountPrimary;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending pending;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved reserved;

        public Item(java.lang.String str, boolean z, boolean z2, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available available, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved reserved, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending pending) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(available, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reserved, "");
            this.id = str;
            this.isBalanceAccountOpen = z;
            this.isBalanceAccountPrimary = z2;
            this.available = available;
            this.reserved = reserved;
            this.pending = pending;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final boolean isBalanceAccountOpen() {
            return this.isBalanceAccountOpen;
        }

        public final boolean isBalanceAccountPrimary() {
            return this.isBalanceAccountPrimary;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available getAvailable() {
            return this.available;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved getReserved() {
            return this.reserved;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending getPending() {
            return this.pending;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            boolean z = this.isBalanceAccountOpen;
            boolean z2 = this.isBalanceAccountPrimary;
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available available = this.available;
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved reserved = this.reserved;
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending pending = this.pending;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", isBalanceAccountOpen=");
            sb.append(z);
            sb.append(", isBalanceAccountPrimary=");
            sb.append(z2);
            sb.append(", available=");
            sb.append(available);
            sb.append(", reserved=");
            sb.append(reserved);
            sb.append(", pending=");
            sb.append(pending);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.isBalanceAccountOpen);
            int hashCode3 = java.lang.Boolean.hashCode(this.isBalanceAccountPrimary);
            int hashCode4 = this.available.hashCode();
            int hashCode5 = this.reserved.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending pending = this.pending;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (pending == null ? 0 : pending.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item item = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && this.isBalanceAccountOpen == item.isBalanceAccountOpen && this.isBalanceAccountPrimary == item.isBalanceAccountPrimary && kotlin.jvm.internal.Intrinsics.areEqual(this.available, item.available) && kotlin.jvm.internal.Intrinsics.areEqual(this.reserved, item.reserved) && kotlin.jvm.internal.Intrinsics.areEqual(this.pending, item.pending);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item copy(java.lang.String id, boolean isBalanceAccountOpen, boolean isBalanceAccountPrimary, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available available, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved reserved, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending pending) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(available, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reserved, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item(id, isBalanceAccountOpen, isBalanceAccountPrimary, available, reserved, pending);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending getPending() {
            return this.pending;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved getReserved() {
            return this.reserved;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available getAvailable() {
            return this.available;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsBalanceAccountPrimary() {
            return this.isBalanceAccountPrimary;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsBalanceAccountOpen() {
            return this.isBalanceAccountOpen;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item item, java.lang.String str, boolean z, boolean z2, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available available, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved reserved, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending pending, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                z = item.isBalanceAccountOpen;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                z2 = item.isBalanceAccountPrimary;
            }
            boolean z4 = z2;
            if ((i & 8) != 0) {
                available = item.available;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available available2 = available;
            if ((i & 16) != 0) {
                reserved = item.reserved;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved reserved2 = reserved;
            if ((i & 32) != 0) {
                pending = item.pending;
            }
            return item.copy(str, z3, z4, available2, reserved2, pending);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Available;", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount;", "amount", "", "exchangeRate", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount;", "primaryCurrencyAmount", "", "Lcom/paypal/oslo/api/graphql/schema/type/SubBalanceType;", "subBalanceTypes", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Available;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount;", "getAmount", "Ljava/lang/String;", "getExchangeRate", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount;", "getPrimaryCurrencyAmount", "Ljava/util/List;", "getSubBalanceTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Available {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount amount;
        private final java.lang.String exchangeRate;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public Available(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount amount, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.amount = amount;
            this.exchangeRate = str;
            this.primaryCurrencyAmount = primaryCurrencyAmount;
            this.subBalanceTypes = list;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> getSubBalanceTypes() {
            return this.subBalanceTypes;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount amount = this.amount;
            java.lang.String str = this.exchangeRate;
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount = this.primaryCurrencyAmount;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list = this.subBalanceTypes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Available(amount=");
            sb.append(amount);
            sb.append(", exchangeRate=");
            sb.append(str);
            sb.append(", primaryCurrencyAmount=");
            sb.append(primaryCurrencyAmount);
            sb.append(", subBalanceTypes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            java.lang.String str = this.exchangeRate;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount = this.primaryCurrencyAmount;
            return (((((hashCode * 31) + hashCode2) * 31) + (primaryCurrencyAmount != null ? primaryCurrencyAmount.hashCode() : 0)) * 31) + this.subBalanceTypes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available available = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, available.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, available.exchangeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyAmount, available.primaryCurrencyAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.subBalanceTypes, available.subBalanceTypes);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available copy(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount amount, java.lang.String exchangeRate, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subBalanceTypes, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available(amount, exchangeRate, primaryCurrencyAmount, subBalanceTypes);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> component4() {
            return this.subBalanceTypes;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount getAmount() {
            return this.amount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available available, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount amount, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = available.amount;
            }
            if ((i & 2) != 0) {
                str = available.exchangeRate;
            }
            if ((i & 4) != 0) {
                primaryCurrencyAmount = available.primaryCurrencyAmount;
            }
            if ((i & 8) != 0) {
                list = available.subBalanceTypes;
            }
            return available.copy(amount, str, primaryCurrencyAmount, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount amount = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount amount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount.value;
            }
            return amount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryCurrencyAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public PrimaryCurrencyAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryCurrencyAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, primaryCurrencyAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, primaryCurrencyAmount.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = primaryCurrencyAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = primaryCurrencyAmount.value;
            }
            return primaryCurrencyAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Reserved;", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount1;", "amount", "", "exchangeRate", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount1;", "primaryCurrencyAmount", "", "Lcom/paypal/oslo/api/graphql/schema/type/SubBalanceType;", "subBalanceTypes", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount1;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount1;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount1;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount1;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount1;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount1;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Reserved;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount1;", "getAmount", "Ljava/lang/String;", "getExchangeRate", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount1;", "getPrimaryCurrencyAmount", "Ljava/util/List;", "getSubBalanceTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Reserved {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 amount;
        private final java.lang.String exchangeRate;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public Reserved(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 amount1, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.amount = amount1;
            this.exchangeRate = str;
            this.primaryCurrencyAmount = primaryCurrencyAmount1;
            this.subBalanceTypes = list;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 getAmount() {
            return this.amount;
        }

        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> getSubBalanceTypes() {
            return this.subBalanceTypes;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 amount1 = this.amount;
            java.lang.String str = this.exchangeRate;
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1 = this.primaryCurrencyAmount;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list = this.subBalanceTypes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Reserved(amount=");
            sb.append(amount1);
            sb.append(", exchangeRate=");
            sb.append(str);
            sb.append(", primaryCurrencyAmount=");
            sb.append(primaryCurrencyAmount1);
            sb.append(", subBalanceTypes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            java.lang.String str = this.exchangeRate;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1 = this.primaryCurrencyAmount;
            return (((((hashCode * 31) + hashCode2) * 31) + (primaryCurrencyAmount1 != null ? primaryCurrencyAmount1.hashCode() : 0)) * 31) + this.subBalanceTypes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved reserved = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, reserved.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, reserved.exchangeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyAmount, reserved.primaryCurrencyAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.subBalanceTypes, reserved.subBalanceTypes);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved copy(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 amount, java.lang.String exchangeRate, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subBalanceTypes, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved(amount, exchangeRate, primaryCurrencyAmount, subBalanceTypes);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> component4() {
            return this.subBalanceTypes;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 getAmount() {
            return this.amount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Reserved reserved, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 amount1, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount1 = reserved.amount;
            }
            if ((i & 2) != 0) {
                str = reserved.exchangeRate;
            }
            if ((i & 4) != 0) {
                primaryCurrencyAmount1 = reserved.primaryCurrencyAmount;
            }
            if ((i & 8) != 0) {
                list = reserved.subBalanceTypes;
            }
            return reserved.copy(amount1, str, primaryCurrencyAmount1, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount1 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount1(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount1(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 amount1 = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount1.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 amount1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount1.value;
            }
            return amount1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryCurrencyAmount1 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public PrimaryCurrencyAmount1(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryCurrencyAmount1(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1 = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, primaryCurrencyAmount1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, primaryCurrencyAmount1.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = primaryCurrencyAmount1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = primaryCurrencyAmount1.value;
            }
            return primaryCurrencyAmount1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Pending;", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount2;", "amount", "", "exchangeRate", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount2;", "primaryCurrencyAmount", "", "Lcom/paypal/oslo/api/graphql/schema/type/SubBalanceType;", "subBalanceTypes", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount2;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount2;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount2;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount2;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount2;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount2;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Pending;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount2;", "getAmount", "Ljava/lang/String;", "getExchangeRate", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount2;", "getPrimaryCurrencyAmount", "Ljava/util/List;", "getSubBalanceTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pending {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 amount;
        private final java.lang.String exchangeRate;
        private final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public Pending(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 amount2, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.amount = amount2;
            this.exchangeRate = str;
            this.primaryCurrencyAmount = primaryCurrencyAmount2;
            this.subBalanceTypes = list;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 getAmount() {
            return this.amount;
        }

        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> getSubBalanceTypes() {
            return this.subBalanceTypes;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 amount2 = this.amount;
            java.lang.String str = this.exchangeRate;
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2 = this.primaryCurrencyAmount;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list = this.subBalanceTypes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pending(amount=");
            sb.append(amount2);
            sb.append(", exchangeRate=");
            sb.append(str);
            sb.append(", primaryCurrencyAmount=");
            sb.append(primaryCurrencyAmount2);
            sb.append(", subBalanceTypes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            java.lang.String str = this.exchangeRate;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2 = this.primaryCurrencyAmount;
            return (((((hashCode * 31) + hashCode2) * 31) + (primaryCurrencyAmount2 != null ? primaryCurrencyAmount2.hashCode() : 0)) * 31) + this.subBalanceTypes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending pending = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, pending.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, pending.exchangeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyAmount, pending.primaryCurrencyAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.subBalanceTypes, pending.subBalanceTypes);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending copy(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 amount, java.lang.String exchangeRate, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subBalanceTypes, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending(amount, exchangeRate, primaryCurrencyAmount, subBalanceTypes);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> component4() {
            return this.subBalanceTypes;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 getAmount() {
            return this.amount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending pending, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 amount2, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount2 = pending.amount;
            }
            if ((i & 2) != 0) {
                str = pending.exchangeRate;
            }
            if ((i & 4) != 0) {
                primaryCurrencyAmount2 = pending.primaryCurrencyAmount;
            }
            if ((i & 8) != 0) {
                list = pending.subBalanceTypes;
            }
            return pending.copy(amount2, str, primaryCurrencyAmount2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount2;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Amount2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount2 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount2(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount2(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 amount2 = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount2.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount2.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 amount2, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount2.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount2.value;
            }
            return amount2.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount2;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$PrimaryCurrencyAmount2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryCurrencyAmount2 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public PrimaryCurrencyAmount2(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryCurrencyAmount2(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2 = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, primaryCurrencyAmount2.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, primaryCurrencyAmount2.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 copy$default(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = primaryCurrencyAmount2.currencyCode;
            }
            if ((i & 2) != 0) {
                str = primaryCurrencyAmount2.value;
            }
            return primaryCurrencyAmount2.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetAccountBalances { balances { totalAvailableAmount { currencyCode value } totalReservedAmount { currencyCode value } totalPendingAmount { currencyCode value } items { id isBalanceAccountOpen isBalanceAccountPrimary available { amount { currencyCode value } exchangeRate primaryCurrencyAmount { currencyCode value } subBalanceTypes } reserved { amount { currencyCode value } exchangeRate primaryCurrencyAmount { currencyCode value } subBalanceTypes } pending { amount { currencyCode value } exchangeRate primaryCurrencyAmount { currencyCode value } subBalanceTypes } } } }";
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
