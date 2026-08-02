package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004+,-*B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Data;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxesInput;", "moneyboxesInput", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getMoneyboxesInput", "Companion", "Data", "Moneyboxes", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GetSavingsGoalsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "dcd7d59153c266f2ed77528326616f9df082969894682d9492248b09b6c0af44";
    public static final java.lang.String OPERATION_NAME = "GetSavingsGoals";
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> moneyboxesInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Companion(null);
    public static final int $stable = 8;

    public GetSavingsGoalsQuery(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.moneyboxesInput = optional;
    }

    public /* synthetic */ GetSavingsGoalsQuery(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> getMoneyboxesInput() {
        return this.moneyboxesInput;
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
        com.paypal.oslo.feature.wallet.graphql.adapter.GetSavingsGoalsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetSavingsGoalsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetSavingsGoalsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Moneyboxes;", "moneyboxes", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Moneyboxes;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Moneyboxes;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Moneyboxes;)Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Moneyboxes;", "getMoneyboxes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes moneyboxes;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes moneyboxes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxes, "");
            this.moneyboxes = moneyboxes;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes getMoneyboxes() {
            return this.moneyboxes;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes moneyboxes = this.moneyboxes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(moneyboxes=");
            sb.append(moneyboxes);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.moneyboxes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxes, ((com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Data) other).moneyboxes);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes moneyboxes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxes, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Data(moneyboxes);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes getMoneyboxes() {
            return this.moneyboxes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes moneyboxes, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                moneyboxes = data.moneyboxes;
            }
            return data.copy(moneyboxes);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Moneyboxes;", "", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Moneyboxes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Moneyboxes {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item> items;

        public Moneyboxes(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Moneyboxes(items=");
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
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes) other).items);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes copy(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes(items);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes copy$default(com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Moneyboxes moneyboxes, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = moneyboxes.items;
            }
            return moneyboxes.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/SavingsMoneyBoxFragment;", "savingsMoneyBoxFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/SavingsMoneyBoxFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/SavingsMoneyBoxFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/SavingsMoneyBoxFragment;)Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/SavingsMoneyBoxFragment;", "getSavingsMoneyBoxFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment;

        public Item(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyBoxFragment, "");
            this.__typename = str;
            this.savingsMoneyBoxFragment = savingsMoneyBoxFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.fragment.SavingsMoneyBoxFragment getSavingsMoneyBoxFragment() {
            return this.savingsMoneyBoxFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment = this.savingsMoneyBoxFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", savingsMoneyBoxFragment=");
            sb.append(savingsMoneyBoxFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.savingsMoneyBoxFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item item = (com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsMoneyBoxFragment, item.savingsMoneyBoxFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyBoxFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item(__typename, savingsMoneyBoxFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.SavingsMoneyBoxFragment getSavingsMoneyBoxFragment() {
            return this.savingsMoneyBoxFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item copy$default(com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery.Item item, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                savingsMoneyBoxFragment = item.savingsMoneyBoxFragment;
            }
            return item.copy(str, savingsMoneyBoxFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetSavingsGoalsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetSavingsGoals($moneyboxesInput: MoneyboxesInput) { moneyboxes(input: $moneyboxesInput) { items { __typename ...SavingsMoneyBoxFragment } } }  fragment SavingsMoneyFragment on Money { currencyCode value }  fragment SavingsMoneyBoxFragment on Moneybox { id name description type targetAmount { __typename ...SavingsMoneyFragment } currentBalance { __typename ...SavingsMoneyFragment } pendingAmount { __typename ...SavingsMoneyFragment } category status transferSettings { id startDate nextReloadDate recurrence financialInstrumentId financialInstrumentName lastFourChars reloadAmount { value currencyCode } status type } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> optional = this.moneyboxesInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSavingsGoalsQuery(moneyboxesInput=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.moneyboxesInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxesInput, ((com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery) other).moneyboxesInput);
    }

    public final com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> moneyboxesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxesInput, "");
        return new com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery(moneyboxesInput);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> component1() {
        return this.moneyboxesInput;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery copy$default(com.paypal.oslo.feature.wallet.graphql.GetSavingsGoalsQuery getSavingsGoalsQuery, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = getSavingsGoalsQuery.moneyboxesInput;
        }
        return getSavingsGoalsQuery.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetSavingsGoalsQuery() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
