package com.paypal.oslo.feature.balance.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0013!\"#$%&'()*+,-./012 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "Balances", "TotalAvailableAmount", "TotalReservedAmount", "TotalPendingAmount", "TaxOnHoldAmount", "MoneyOnHoldAmount", "Item", "AvailableAmount", "Available", "Amount", "PrimaryCurrencyAmount", "Reserved", "Amount1", "PrimaryCurrencyAmount1", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING, "Amount2", "PrimaryCurrencyAmount2"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetBalancesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Companion INSTANCE = new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "0949271871d693ec04647cc62e157065106bdf39d5426e89109e55b3362933f0";
    public static final java.lang.String OPERATION_NAME = "GetBalances";

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
        return "GetBalances";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.balance.graphql.adapter.GetBalancesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.balance.graphql.selections.GetBalancesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Balances;", "balances", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Balances;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Balances;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Balances;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Balances;", "getBalances"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances balances;

        public Data(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            this.balances = balances;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances getBalances() {
            return this.balances;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances balances = this.balances;
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
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.balances, ((com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data) other).balances);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data copy(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data(balances);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances getBalances() {
            return this.balances;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data data, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances balances, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balances = data.balances;
            }
            return data.copy(balances);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J|\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b9\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010\"R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Balances;", "", "", "prepaidStatus", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalAvailableAmount;", "totalAvailableAmount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalReservedAmount;", "totalReservedAmount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalPendingAmount;", "totalPendingAmount", "hasTaxOnHold", "hasMoneyOnHold", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TaxOnHoldAmount;", "taxOnHoldAmount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$MoneyOnHoldAmount;", "moneyOnHoldAmount", "", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Item;", "items", "<init>", "(Ljava/lang/Boolean;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalAvailableAmount;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalReservedAmount;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalPendingAmount;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TaxOnHoldAmount;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$MoneyOnHoldAmount;Ljava/util/List;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalAvailableAmount;", "component3", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalReservedAmount;", "component4", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalPendingAmount;", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TaxOnHoldAmount;", "component8", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$MoneyOnHoldAmount;", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/Boolean;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalAvailableAmount;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalReservedAmount;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalPendingAmount;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TaxOnHoldAmount;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$MoneyOnHoldAmount;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Balances;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getPrepaidStatus", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalAvailableAmount;", "getTotalAvailableAmount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalReservedAmount;", "getTotalReservedAmount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalPendingAmount;", "getTotalPendingAmount", "getHasTaxOnHold", "getHasMoneyOnHold", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TaxOnHoldAmount;", "getTaxOnHoldAmount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$MoneyOnHoldAmount;", "getMoneyOnHoldAmount", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Balances {
        public static final int $stable = 8;
        private final java.lang.Boolean hasMoneyOnHold;
        private final java.lang.Boolean hasTaxOnHold;
        private final java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item> items;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount moneyOnHoldAmount;
        private final java.lang.Boolean prepaidStatus;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount taxOnHoldAmount;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount totalAvailableAmount;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount totalPendingAmount;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount totalReservedAmount;

        public Balances(java.lang.Boolean bool, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount totalAvailableAmount, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount totalReservedAmount, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount totalPendingAmount, java.lang.Boolean bool2, java.lang.Boolean bool3, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount taxOnHoldAmount, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount moneyOnHoldAmount, java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalReservedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.prepaidStatus = bool;
            this.totalAvailableAmount = totalAvailableAmount;
            this.totalReservedAmount = totalReservedAmount;
            this.totalPendingAmount = totalPendingAmount;
            this.hasTaxOnHold = bool2;
            this.hasMoneyOnHold = bool3;
            this.taxOnHoldAmount = taxOnHoldAmount;
            this.moneyOnHoldAmount = moneyOnHoldAmount;
            this.items = list;
        }

        public final java.lang.Boolean getPrepaidStatus() {
            return this.prepaidStatus;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount getTotalAvailableAmount() {
            return this.totalAvailableAmount;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount getTotalReservedAmount() {
            return this.totalReservedAmount;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount getTotalPendingAmount() {
            return this.totalPendingAmount;
        }

        public final java.lang.Boolean getHasTaxOnHold() {
            return this.hasTaxOnHold;
        }

        public final java.lang.Boolean getHasMoneyOnHold() {
            return this.hasMoneyOnHold;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount getTaxOnHoldAmount() {
            return this.taxOnHoldAmount;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount getMoneyOnHoldAmount() {
            return this.moneyOnHoldAmount;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.prepaidStatus;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount totalAvailableAmount = this.totalAvailableAmount;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount totalReservedAmount = this.totalReservedAmount;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount totalPendingAmount = this.totalPendingAmount;
            java.lang.Boolean bool2 = this.hasTaxOnHold;
            java.lang.Boolean bool3 = this.hasMoneyOnHold;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount taxOnHoldAmount = this.taxOnHoldAmount;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount moneyOnHoldAmount = this.moneyOnHoldAmount;
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balances(prepaidStatus=");
            sb.append(bool);
            sb.append(", totalAvailableAmount=");
            sb.append(totalAvailableAmount);
            sb.append(", totalReservedAmount=");
            sb.append(totalReservedAmount);
            sb.append(", totalPendingAmount=");
            sb.append(totalPendingAmount);
            sb.append(", hasTaxOnHold=");
            sb.append(bool2);
            sb.append(", hasMoneyOnHold=");
            sb.append(bool3);
            sb.append(", taxOnHoldAmount=");
            sb.append(taxOnHoldAmount);
            sb.append(", moneyOnHoldAmount=");
            sb.append(moneyOnHoldAmount);
            sb.append(", items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.prepaidStatus;
            int hashCode = bool == null ? 0 : bool.hashCode();
            int hashCode2 = this.totalAvailableAmount.hashCode();
            int hashCode3 = this.totalReservedAmount.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount totalPendingAmount = this.totalPendingAmount;
            int hashCode4 = totalPendingAmount == null ? 0 : totalPendingAmount.hashCode();
            java.lang.Boolean bool2 = this.hasTaxOnHold;
            int hashCode5 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.Boolean bool3 = this.hasMoneyOnHold;
            int hashCode6 = bool3 == null ? 0 : bool3.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount taxOnHoldAmount = this.taxOnHoldAmount;
            int hashCode7 = taxOnHoldAmount == null ? 0 : taxOnHoldAmount.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount moneyOnHoldAmount = this.moneyOnHoldAmount;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (moneyOnHoldAmount != null ? moneyOnHoldAmount.hashCode() : 0)) * 31) + this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances balances = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prepaidStatus, balances.prepaidStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAvailableAmount, balances.totalAvailableAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalReservedAmount, balances.totalReservedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalPendingAmount, balances.totalPendingAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.hasTaxOnHold, balances.hasTaxOnHold) && kotlin.jvm.internal.Intrinsics.areEqual(this.hasMoneyOnHold, balances.hasMoneyOnHold) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxOnHoldAmount, balances.taxOnHoldAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyOnHoldAmount, balances.moneyOnHoldAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, balances.items);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances copy(java.lang.Boolean prepaidStatus, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount totalAvailableAmount, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount totalReservedAmount, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount totalPendingAmount, java.lang.Boolean hasTaxOnHold, java.lang.Boolean hasMoneyOnHold, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount taxOnHoldAmount, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount moneyOnHoldAmount, java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalReservedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances(prepaidStatus, totalAvailableAmount, totalReservedAmount, totalPendingAmount, hasTaxOnHold, hasMoneyOnHold, taxOnHoldAmount, moneyOnHoldAmount, items);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item> component9() {
            return this.items;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount getMoneyOnHoldAmount() {
            return this.moneyOnHoldAmount;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount getTaxOnHoldAmount() {
            return this.taxOnHoldAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Boolean getHasMoneyOnHold() {
            return this.hasMoneyOnHold;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Boolean getHasTaxOnHold() {
            return this.hasTaxOnHold;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount getTotalPendingAmount() {
            return this.totalPendingAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount getTotalReservedAmount() {
            return this.totalReservedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount getTotalAvailableAmount() {
            return this.totalAvailableAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getPrepaidStatus() {
            return this.prepaidStatus;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalAvailableAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalAvailableAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount totalAvailableAmount = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalAvailableAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalAvailableAmount.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount totalAvailableAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalAvailableAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalAvailableAmount.value;
            }
            return totalAvailableAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalReservedAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalReservedAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount totalReservedAmount = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalReservedAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalReservedAmount.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount totalReservedAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalReservedAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalReservedAmount.value;
            }
            return totalReservedAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalPendingAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalPendingAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount totalPendingAmount = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalPendingAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalPendingAmount.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount totalPendingAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalPendingAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalPendingAmount.value;
            }
            return totalPendingAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TaxOnHoldAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TaxOnHoldAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class TaxOnHoldAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TaxOnHoldAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxOnHoldAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount taxOnHoldAmount = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, taxOnHoldAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, taxOnHoldAmount.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount taxOnHoldAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = taxOnHoldAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = taxOnHoldAmount.value;
            }
            return taxOnHoldAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$MoneyOnHoldAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$MoneyOnHoldAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class MoneyOnHoldAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public MoneyOnHoldAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyOnHoldAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount moneyOnHoldAmount = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, moneyOnHoldAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, moneyOnHoldAmount.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount moneyOnHoldAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = moneyOnHoldAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = moneyOnHoldAmount.value;
            }
            return moneyOnHoldAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJX\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b\u0007\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b\b\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Item;", "", "", "id", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$AvailableAmount;", "availableAmount", "", "isBalanceAccountOpen", "isBalanceAccountPrimary", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Available;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Reserved;", "reserved", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Pending;", "pending", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$AvailableAmount;ZZLcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Available;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Reserved;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Pending;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$AvailableAmount;", "component3", "()Z", "component4", "component5", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Available;", "component6", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Reserved;", "component7", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Pending;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$AvailableAmount;ZZLcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Available;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Reserved;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Pending;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Item;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$AvailableAmount;", "getAvailableAmount", "getAvailableAmount$annotations", "()V", "Z", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Available;", "getAvailable", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Reserved;", "getReserved", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Pending;", "getPending"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available available;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount availableAmount;
        private final java.lang.String id;
        private final boolean isBalanceAccountOpen;
        private final boolean isBalanceAccountPrimary;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending pending;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved reserved;

        @kotlin.Deprecated(message = "Use 'available' field instead for available balance")
        public static /* synthetic */ void getAvailableAmount$annotations() {
        }

        public Item(java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount availableAmount, boolean z, boolean z2, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available available, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved reserved, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending pending) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(available, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reserved, "");
            this.id = str;
            this.availableAmount = availableAmount;
            this.isBalanceAccountOpen = z;
            this.isBalanceAccountPrimary = z2;
            this.available = available;
            this.reserved = reserved;
            this.pending = pending;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount getAvailableAmount() {
            return this.availableAmount;
        }

        public final boolean isBalanceAccountOpen() {
            return this.isBalanceAccountOpen;
        }

        public final boolean isBalanceAccountPrimary() {
            return this.isBalanceAccountPrimary;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available getAvailable() {
            return this.available;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved getReserved() {
            return this.reserved;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending getPending() {
            return this.pending;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount availableAmount = this.availableAmount;
            boolean z = this.isBalanceAccountOpen;
            boolean z2 = this.isBalanceAccountPrimary;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available available = this.available;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved reserved = this.reserved;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending pending = this.pending;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", availableAmount=");
            sb.append(availableAmount);
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
            int hashCode2 = this.availableAmount.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.isBalanceAccountOpen);
            int hashCode4 = java.lang.Boolean.hashCode(this.isBalanceAccountPrimary);
            int hashCode5 = this.available.hashCode();
            int hashCode6 = this.reserved.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending pending = this.pending;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (pending == null ? 0 : pending.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item item = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableAmount, item.availableAmount) && this.isBalanceAccountOpen == item.isBalanceAccountOpen && this.isBalanceAccountPrimary == item.isBalanceAccountPrimary && kotlin.jvm.internal.Intrinsics.areEqual(this.available, item.available) && kotlin.jvm.internal.Intrinsics.areEqual(this.reserved, item.reserved) && kotlin.jvm.internal.Intrinsics.areEqual(this.pending, item.pending);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item copy(java.lang.String id, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount availableAmount, boolean isBalanceAccountOpen, boolean isBalanceAccountPrimary, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available available, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved reserved, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending pending) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(available, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reserved, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item(id, availableAmount, isBalanceAccountOpen, isBalanceAccountPrimary, available, reserved, pending);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending getPending() {
            return this.pending;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved getReserved() {
            return this.reserved;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available getAvailable() {
            return this.available;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsBalanceAccountPrimary() {
            return this.isBalanceAccountPrimary;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsBalanceAccountOpen() {
            return this.isBalanceAccountOpen;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount getAvailableAmount() {
            return this.availableAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item item, java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount availableAmount, boolean z, boolean z2, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available available, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved reserved, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending pending, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                availableAmount = item.availableAmount;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount availableAmount2 = availableAmount;
            if ((i & 4) != 0) {
                z = item.isBalanceAccountOpen;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = item.isBalanceAccountPrimary;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                available = item.available;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available available2 = available;
            if ((i & 32) != 0) {
                reserved = item.reserved;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved reserved2 = reserved;
            if ((i & 64) != 0) {
                pending = item.pending;
            }
            return item.copy(str, availableAmount2, z3, z4, available2, reserved2, pending);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$AvailableAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$AvailableAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AvailableAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AvailableAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AvailableAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount availableAmount = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, availableAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, availableAmount.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.AvailableAmount availableAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = availableAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = availableAmount.value;
            }
            return availableAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Available;", "", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount;", "amount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount;", "primaryCurrencyAmount", "", "exchangeRate", "", "Lcom/paypal/oslo/api/graphql/schema/type/SubBalanceType;", "subBalanceTypes", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Available;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount;", "getAmount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount;", "getPrimaryCurrencyAmount", "Ljava/lang/String;", "getExchangeRate", "Ljava/util/List;", "getSubBalanceTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Available {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount amount;
        private final java.lang.String exchangeRate;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public Available(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount amount, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount, java.lang.String str, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.amount = amount;
            this.primaryCurrencyAmount = primaryCurrencyAmount;
            this.exchangeRate = str;
            this.subBalanceTypes = list;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> getSubBalanceTypes() {
            return this.subBalanceTypes;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount amount = this.amount;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount = this.primaryCurrencyAmount;
            java.lang.String str = this.exchangeRate;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list = this.subBalanceTypes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Available(amount=");
            sb.append(amount);
            sb.append(", primaryCurrencyAmount=");
            sb.append(primaryCurrencyAmount);
            sb.append(", exchangeRate=");
            sb.append(str);
            sb.append(", subBalanceTypes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount = this.primaryCurrencyAmount;
            int hashCode2 = primaryCurrencyAmount == null ? 0 : primaryCurrencyAmount.hashCode();
            java.lang.String str = this.exchangeRate;
            return (((((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.subBalanceTypes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available available = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, available.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyAmount, available.primaryCurrencyAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, available.exchangeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.subBalanceTypes, available.subBalanceTypes);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available copy(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount amount, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount, java.lang.String exchangeRate, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subBalanceTypes, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available(amount, primaryCurrencyAmount, exchangeRate, subBalanceTypes);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> component4() {
            return this.subBalanceTypes;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount getAmount() {
            return this.amount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Available available, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount amount, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = available.amount;
            }
            if ((i & 2) != 0) {
                primaryCurrencyAmount = available.primaryCurrencyAmount;
            }
            if ((i & 4) != 0) {
                str = available.exchangeRate;
            }
            if ((i & 8) != 0) {
                list = available.subBalanceTypes;
            }
            return available.copy(amount, primaryCurrencyAmount, str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount amount = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount amount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount.value;
            }
            return amount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, primaryCurrencyAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, primaryCurrencyAmount.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = primaryCurrencyAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = primaryCurrencyAmount.value;
            }
            return primaryCurrencyAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Reserved;", "", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount1;", "amount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount1;", "primaryCurrencyAmount", "", "exchangeRate", "", "Lcom/paypal/oslo/api/graphql/schema/type/SubBalanceType;", "subBalanceTypes", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount1;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount1;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount1;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount1;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount1;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount1;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Reserved;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount1;", "getAmount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount1;", "getPrimaryCurrencyAmount", "Ljava/lang/String;", "getExchangeRate", "Ljava/util/List;", "getSubBalanceTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Reserved {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1 amount;
        private final java.lang.String exchangeRate;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public Reserved(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1 amount1, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1, java.lang.String str, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.amount = amount1;
            this.primaryCurrencyAmount = primaryCurrencyAmount1;
            this.exchangeRate = str;
            this.subBalanceTypes = list;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1 getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> getSubBalanceTypes() {
            return this.subBalanceTypes;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1 amount1 = this.amount;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1 = this.primaryCurrencyAmount;
            java.lang.String str = this.exchangeRate;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list = this.subBalanceTypes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Reserved(amount=");
            sb.append(amount1);
            sb.append(", primaryCurrencyAmount=");
            sb.append(primaryCurrencyAmount1);
            sb.append(", exchangeRate=");
            sb.append(str);
            sb.append(", subBalanceTypes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1 = this.primaryCurrencyAmount;
            int hashCode2 = primaryCurrencyAmount1 == null ? 0 : primaryCurrencyAmount1.hashCode();
            java.lang.String str = this.exchangeRate;
            return (((((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.subBalanceTypes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved reserved = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, reserved.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyAmount, reserved.primaryCurrencyAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, reserved.exchangeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.subBalanceTypes, reserved.subBalanceTypes);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved copy(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1 amount, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount, java.lang.String exchangeRate, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subBalanceTypes, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved(amount, primaryCurrencyAmount, exchangeRate, subBalanceTypes);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> component4() {
            return this.subBalanceTypes;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1 getAmount() {
            return this.amount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Reserved reserved, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1 amount1, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount1 = reserved.amount;
            }
            if ((i & 2) != 0) {
                primaryCurrencyAmount1 = reserved.primaryCurrencyAmount;
            }
            if ((i & 4) != 0) {
                str = reserved.exchangeRate;
            }
            if ((i & 8) != 0) {
                list = reserved.subBalanceTypes;
            }
            return reserved.copy(amount1, primaryCurrencyAmount1, str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1 amount1 = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount1.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1 copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount1 amount1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount1.value;
            }
            return amount1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1 = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, primaryCurrencyAmount1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, primaryCurrencyAmount1.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount1 primaryCurrencyAmount1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = primaryCurrencyAmount1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = primaryCurrencyAmount1.value;
            }
            return primaryCurrencyAmount1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Pending;", "", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount2;", "amount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount2;", "primaryCurrencyAmount", "", "exchangeRate", "", "Lcom/paypal/oslo/api/graphql/schema/type/SubBalanceType;", "subBalanceTypes", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount2;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount2;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount2;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount2;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount2;Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount2;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Pending;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount2;", "getAmount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount2;", "getPrimaryCurrencyAmount", "Ljava/lang/String;", "getExchangeRate", "Ljava/util/List;", "getSubBalanceTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pending {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 amount;
        private final java.lang.String exchangeRate;
        private final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public Pending(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 amount2, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2, java.lang.String str, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.amount = amount2;
            this.primaryCurrencyAmount = primaryCurrencyAmount2;
            this.exchangeRate = str;
            this.subBalanceTypes = list;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> getSubBalanceTypes() {
            return this.subBalanceTypes;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 amount2 = this.amount;
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2 = this.primaryCurrencyAmount;
            java.lang.String str = this.exchangeRate;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> list = this.subBalanceTypes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pending(amount=");
            sb.append(amount2);
            sb.append(", primaryCurrencyAmount=");
            sb.append(primaryCurrencyAmount2);
            sb.append(", exchangeRate=");
            sb.append(str);
            sb.append(", subBalanceTypes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2 = this.primaryCurrencyAmount;
            int hashCode2 = primaryCurrencyAmount2 == null ? 0 : primaryCurrencyAmount2.hashCode();
            java.lang.String str = this.exchangeRate;
            return (((((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.subBalanceTypes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending pending = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, pending.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyAmount, pending.primaryCurrencyAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, pending.exchangeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.subBalanceTypes, pending.subBalanceTypes);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending copy(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 amount, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount, java.lang.String exchangeRate, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subBalanceTypes, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending(amount, primaryCurrencyAmount, exchangeRate, subBalanceTypes);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> component4() {
            return this.subBalanceTypes;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 getPrimaryCurrencyAmount() {
            return this.primaryCurrencyAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 getAmount() {
            return this.amount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending pending, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 amount2, com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount2 = pending.amount;
            }
            if ((i & 2) != 0) {
                primaryCurrencyAmount2 = pending.primaryCurrencyAmount;
            }
            if ((i & 4) != 0) {
                str = pending.exchangeRate;
            }
            if ((i & 8) != 0) {
                list = pending.subBalanceTypes;
            }
            return pending.copy(amount2, primaryCurrencyAmount2, str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount2;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Amount2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 amount2 = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount2.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount2.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 amount2, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount2.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount2.value;
            }
            return amount2.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount2;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$PrimaryCurrencyAmount2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2 = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, primaryCurrencyAmount2.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, primaryCurrencyAmount2.value);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 copy$default(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount2 primaryCurrencyAmount2, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = primaryCurrencyAmount2.currencyCode;
            }
            if ((i & 2) != 0) {
                str = primaryCurrencyAmount2.value;
            }
            return primaryCurrencyAmount2.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBalances { balances { prepaidStatus totalAvailableAmount { currencyCode value } totalReservedAmount { currencyCode value } totalPendingAmount { currencyCode value } hasTaxOnHold hasMoneyOnHold taxOnHoldAmount { currencyCode value } moneyOnHoldAmount { currencyCode value } items { id availableAmount { currencyCode value } isBalanceAccountOpen isBalanceAccountPrimary available { amount { currencyCode value } primaryCurrencyAmount { currencyCode value } exchangeRate subBalanceTypes } reserved { amount { currencyCode value } primaryCurrencyAmount { currencyCode value } exchangeRate subBalanceTypes } pending { amount { currencyCode value } primaryCurrencyAmount { currencyCode value } exchangeRate subBalanceTypes } } } }";
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
