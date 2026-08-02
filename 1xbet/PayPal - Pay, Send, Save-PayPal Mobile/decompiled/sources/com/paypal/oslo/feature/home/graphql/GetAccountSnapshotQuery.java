package com.paypal.oslo.feature.home.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0011*+,-./0123456789)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/WalletComponentsInput;", "walletComponentsInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/WalletComponentsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/WalletComponentsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/WalletComponentsInput;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/WalletComponentsInput;", "getWalletComponentsInput", "Companion", "Data", "WalletComponents", "Item", "OnBalanceComponent", "OnSavingsComponent", "OnBNPLComponent", "OnCryptoComponent", "OnCreditCardUSCardComponent", "OnRewardsComponent", "OnBNPLEmptyStateComponent", "OnDebitInstrumentsComponent", "OnCreditPayPalMasterCardComponent", "OnCreditPayPalCreditComponent", "OnCreditEbayMastercardComponent", "OnCreditConsumerRewardsComponent", "OnCreditSmartConnectComponent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GetAccountSnapshotQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data> {
    public static final java.lang.String OPERATION_ID = "384ecf3996675f9d2a8dcb643fd274ee86df6ffa5eccc28d8ab9de41c47fb0ff";
    public static final java.lang.String OPERATION_NAME = "GetAccountSnapshot";
    private final com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput walletComponentsInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Companion INSTANCE = new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Companion(null);
    public static final int $stable = 8;

    public GetAccountSnapshotQuery(com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput walletComponentsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletComponentsInput, "");
        this.walletComponentsInput = walletComponentsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput getWalletComponentsInput() {
        return this.walletComponentsInput;
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
        com.paypal.oslo.feature.home.graphql.adapter.GetAccountSnapshotQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.home.graphql.adapter.GetAccountSnapshotQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.home.graphql.selections.GetAccountSnapshotQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$WalletComponents;", "walletComponents", "<init>", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$WalletComponents;)V", "component1", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$WalletComponents;", "copy", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$WalletComponents;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$WalletComponents;", "getWalletComponents"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents;

        public Data(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents) {
            this.walletComponents = walletComponents;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents getWalletComponents() {
            return this.walletComponents;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = this.walletComponents;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(walletComponents=");
            sb.append(walletComponents);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = this.walletComponents;
            if (walletComponents == null) {
                return 0;
            }
            return walletComponents.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletComponents, ((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) other).walletComponents);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data copy(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents) {
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data(walletComponents);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents getWalletComponents() {
            return this.walletComponents;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                walletComponents = data.walletComponents;
            }
            return data.copy(walletComponents);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$WalletComponents;", "", "", "__typename", "", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Item;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$WalletComponents;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletComponents {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;

        public WalletComponents(java.lang.String str, java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.__typename = str;
            this.items = list;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletComponents(__typename=");
            sb.append(str);
            sb.append(", items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, walletComponents.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, walletComponents.items);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents copy(java.lang.String __typename, java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents(__typename, items);
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> component2() {
            return this.items;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = walletComponents.__typename;
            }
            if ((i & 2) != 0) {
                list = walletComponents.items;
            }
            return walletComponents.copy(str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b:\u0010;J¶\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bE\u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bM\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\bQ\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010R\u001a\u0004\bS\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010T\u001a\u0004\bU\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u00101R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\bY\u00103R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010Z\u001a\u0004\b[\u00105R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\\\u001a\u0004\b]\u00107R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010^\u001a\u0004\b_\u00109R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010`\u001a\u0004\ba\u0010;"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBalanceComponent;", "onBalanceComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnSavingsComponent;", "onSavingsComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLComponent;", "onBNPLComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCryptoComponent;", "onCryptoComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditCardUSCardComponent;", "onCreditCardUSCardComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnRewardsComponent;", "onRewardsComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLEmptyStateComponent;", "onBNPLEmptyStateComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnDebitInstrumentsComponent;", "onDebitInstrumentsComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalMasterCardComponent;", "onCreditPayPalMasterCardComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalCreditComponent;", "onCreditPayPalCreditComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditEbayMastercardComponent;", "onCreditEbayMastercardComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditConsumerRewardsComponent;", "onCreditConsumerRewardsComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditSmartConnectComponent;", "onCreditSmartConnectComponent", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBalanceComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnSavingsComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCryptoComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditCardUSCardComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnRewardsComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLEmptyStateComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnDebitInstrumentsComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalMasterCardComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalCreditComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditEbayMastercardComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditConsumerRewardsComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditSmartConnectComponent;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBalanceComponent;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnSavingsComponent;", "component4", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLComponent;", "component5", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCryptoComponent;", "component6", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditCardUSCardComponent;", "component7", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnRewardsComponent;", "component8", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLEmptyStateComponent;", "component9", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnDebitInstrumentsComponent;", "component10", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalMasterCardComponent;", "component11", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalCreditComponent;", "component12", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditEbayMastercardComponent;", "component13", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditConsumerRewardsComponent;", "component14", "()Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditSmartConnectComponent;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBalanceComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnSavingsComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCryptoComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditCardUSCardComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnRewardsComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLEmptyStateComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnDebitInstrumentsComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalMasterCardComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalCreditComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditEbayMastercardComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditConsumerRewardsComponent;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditSmartConnectComponent;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBalanceComponent;", "getOnBalanceComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnSavingsComponent;", "getOnSavingsComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLComponent;", "getOnBNPLComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCryptoComponent;", "getOnCryptoComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditCardUSCardComponent;", "getOnCreditCardUSCardComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnRewardsComponent;", "getOnRewardsComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLEmptyStateComponent;", "getOnBNPLEmptyStateComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnDebitInstrumentsComponent;", "getOnDebitInstrumentsComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalMasterCardComponent;", "getOnCreditPayPalMasterCardComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalCreditComponent;", "getOnCreditPayPalCreditComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditEbayMastercardComponent;", "getOnCreditEbayMastercardComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditConsumerRewardsComponent;", "getOnCreditConsumerRewardsComponent", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditSmartConnectComponent;", "getOnCreditSmartConnectComponent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent onBNPLComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent onBNPLEmptyStateComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent onBalanceComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent onCreditCardUSCardComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent onCreditConsumerRewardsComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent onCreditEbayMastercardComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent onCreditPayPalCreditComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent onCreditPayPalMasterCardComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent onCreditSmartConnectComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent onCryptoComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent onDebitInstrumentsComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent onRewardsComponent;
        private final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent onSavingsComponent;

        public Item(java.lang.String str, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent onBalanceComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent onSavingsComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent onBNPLComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent onCryptoComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent onCreditCardUSCardComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent onRewardsComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent onBNPLEmptyStateComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent onDebitInstrumentsComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent onCreditPayPalMasterCardComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent onCreditPayPalCreditComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent onCreditEbayMastercardComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent onCreditConsumerRewardsComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent onCreditSmartConnectComponent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBalanceComponent = onBalanceComponent;
            this.onSavingsComponent = onSavingsComponent;
            this.onBNPLComponent = onBNPLComponent;
            this.onCryptoComponent = onCryptoComponent;
            this.onCreditCardUSCardComponent = onCreditCardUSCardComponent;
            this.onRewardsComponent = onRewardsComponent;
            this.onBNPLEmptyStateComponent = onBNPLEmptyStateComponent;
            this.onDebitInstrumentsComponent = onDebitInstrumentsComponent;
            this.onCreditPayPalMasterCardComponent = onCreditPayPalMasterCardComponent;
            this.onCreditPayPalCreditComponent = onCreditPayPalCreditComponent;
            this.onCreditEbayMastercardComponent = onCreditEbayMastercardComponent;
            this.onCreditConsumerRewardsComponent = onCreditConsumerRewardsComponent;
            this.onCreditSmartConnectComponent = onCreditSmartConnectComponent;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent getOnBalanceComponent() {
            return this.onBalanceComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent getOnSavingsComponent() {
            return this.onSavingsComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent getOnBNPLComponent() {
            return this.onBNPLComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent getOnCryptoComponent() {
            return this.onCryptoComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent getOnCreditCardUSCardComponent() {
            return this.onCreditCardUSCardComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent getOnRewardsComponent() {
            return this.onRewardsComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent getOnBNPLEmptyStateComponent() {
            return this.onBNPLEmptyStateComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent getOnDebitInstrumentsComponent() {
            return this.onDebitInstrumentsComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent getOnCreditPayPalMasterCardComponent() {
            return this.onCreditPayPalMasterCardComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent getOnCreditPayPalCreditComponent() {
            return this.onCreditPayPalCreditComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent getOnCreditEbayMastercardComponent() {
            return this.onCreditEbayMastercardComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent getOnCreditConsumerRewardsComponent() {
            return this.onCreditConsumerRewardsComponent;
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent getOnCreditSmartConnectComponent() {
            return this.onCreditSmartConnectComponent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent onBalanceComponent = this.onBalanceComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent onSavingsComponent = this.onSavingsComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent onBNPLComponent = this.onBNPLComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent onCryptoComponent = this.onCryptoComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent onCreditCardUSCardComponent = this.onCreditCardUSCardComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent onRewardsComponent = this.onRewardsComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent onBNPLEmptyStateComponent = this.onBNPLEmptyStateComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent onDebitInstrumentsComponent = this.onDebitInstrumentsComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent onCreditPayPalMasterCardComponent = this.onCreditPayPalMasterCardComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent onCreditPayPalCreditComponent = this.onCreditPayPalCreditComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent onCreditEbayMastercardComponent = this.onCreditEbayMastercardComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent onCreditConsumerRewardsComponent = this.onCreditConsumerRewardsComponent;
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent onCreditSmartConnectComponent = this.onCreditSmartConnectComponent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", onBalanceComponent=");
            sb.append(onBalanceComponent);
            sb.append(", onSavingsComponent=");
            sb.append(onSavingsComponent);
            sb.append(", onBNPLComponent=");
            sb.append(onBNPLComponent);
            sb.append(", onCryptoComponent=");
            sb.append(onCryptoComponent);
            sb.append(", onCreditCardUSCardComponent=");
            sb.append(onCreditCardUSCardComponent);
            sb.append(", onRewardsComponent=");
            sb.append(onRewardsComponent);
            sb.append(", onBNPLEmptyStateComponent=");
            sb.append(onBNPLEmptyStateComponent);
            sb.append(", onDebitInstrumentsComponent=");
            sb.append(onDebitInstrumentsComponent);
            sb.append(", onCreditPayPalMasterCardComponent=");
            sb.append(onCreditPayPalMasterCardComponent);
            sb.append(", onCreditPayPalCreditComponent=");
            sb.append(onCreditPayPalCreditComponent);
            sb.append(", onCreditEbayMastercardComponent=");
            sb.append(onCreditEbayMastercardComponent);
            sb.append(", onCreditConsumerRewardsComponent=");
            sb.append(onCreditConsumerRewardsComponent);
            sb.append(", onCreditSmartConnectComponent=");
            sb.append(onCreditSmartConnectComponent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent onBalanceComponent = this.onBalanceComponent;
            int hashCode2 = onBalanceComponent == null ? 0 : onBalanceComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent onSavingsComponent = this.onSavingsComponent;
            int hashCode3 = onSavingsComponent == null ? 0 : onSavingsComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent onBNPLComponent = this.onBNPLComponent;
            int hashCode4 = onBNPLComponent == null ? 0 : onBNPLComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent onCryptoComponent = this.onCryptoComponent;
            int hashCode5 = onCryptoComponent == null ? 0 : onCryptoComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent onCreditCardUSCardComponent = this.onCreditCardUSCardComponent;
            int hashCode6 = onCreditCardUSCardComponent == null ? 0 : onCreditCardUSCardComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent onRewardsComponent = this.onRewardsComponent;
            int hashCode7 = onRewardsComponent == null ? 0 : onRewardsComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent onBNPLEmptyStateComponent = this.onBNPLEmptyStateComponent;
            int hashCode8 = onBNPLEmptyStateComponent == null ? 0 : onBNPLEmptyStateComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent onDebitInstrumentsComponent = this.onDebitInstrumentsComponent;
            int hashCode9 = onDebitInstrumentsComponent == null ? 0 : onDebitInstrumentsComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent onCreditPayPalMasterCardComponent = this.onCreditPayPalMasterCardComponent;
            int hashCode10 = onCreditPayPalMasterCardComponent == null ? 0 : onCreditPayPalMasterCardComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent onCreditPayPalCreditComponent = this.onCreditPayPalCreditComponent;
            int hashCode11 = onCreditPayPalCreditComponent == null ? 0 : onCreditPayPalCreditComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent onCreditEbayMastercardComponent = this.onCreditEbayMastercardComponent;
            int hashCode12 = onCreditEbayMastercardComponent == null ? 0 : onCreditEbayMastercardComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent onCreditConsumerRewardsComponent = this.onCreditConsumerRewardsComponent;
            int hashCode13 = onCreditConsumerRewardsComponent == null ? 0 : onCreditConsumerRewardsComponent.hashCode();
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent onCreditSmartConnectComponent = this.onCreditSmartConnectComponent;
            return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (onCreditSmartConnectComponent != null ? onCreditSmartConnectComponent.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalanceComponent, item.onBalanceComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSavingsComponent, item.onSavingsComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLComponent, item.onBNPLComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCryptoComponent, item.onCryptoComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCreditCardUSCardComponent, item.onCreditCardUSCardComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRewardsComponent, item.onRewardsComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLEmptyStateComponent, item.onBNPLEmptyStateComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onDebitInstrumentsComponent, item.onDebitInstrumentsComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCreditPayPalMasterCardComponent, item.onCreditPayPalMasterCardComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCreditPayPalCreditComponent, item.onCreditPayPalCreditComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCreditEbayMastercardComponent, item.onCreditEbayMastercardComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCreditConsumerRewardsComponent, item.onCreditConsumerRewardsComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCreditSmartConnectComponent, item.onCreditSmartConnectComponent);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent onBalanceComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent onSavingsComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent onBNPLComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent onCryptoComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent onCreditCardUSCardComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent onRewardsComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent onBNPLEmptyStateComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent onDebitInstrumentsComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent onCreditPayPalMasterCardComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent onCreditPayPalCreditComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent onCreditEbayMastercardComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent onCreditConsumerRewardsComponent, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent onCreditSmartConnectComponent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item(__typename, onBalanceComponent, onSavingsComponent, onBNPLComponent, onCryptoComponent, onCreditCardUSCardComponent, onRewardsComponent, onBNPLEmptyStateComponent, onDebitInstrumentsComponent, onCreditPayPalMasterCardComponent, onCreditPayPalCreditComponent, onCreditEbayMastercardComponent, onCreditConsumerRewardsComponent, onCreditSmartConnectComponent);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent getOnDebitInstrumentsComponent() {
            return this.onDebitInstrumentsComponent;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent getOnBNPLEmptyStateComponent() {
            return this.onBNPLEmptyStateComponent;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent getOnRewardsComponent() {
            return this.onRewardsComponent;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent getOnCreditCardUSCardComponent() {
            return this.onCreditCardUSCardComponent;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent getOnCryptoComponent() {
            return this.onCryptoComponent;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent getOnBNPLComponent() {
            return this.onBNPLComponent;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent getOnSavingsComponent() {
            return this.onSavingsComponent;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent getOnBalanceComponent() {
            return this.onBalanceComponent;
        }

        /* renamed from: component14, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent getOnCreditSmartConnectComponent() {
            return this.onCreditSmartConnectComponent;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent getOnCreditConsumerRewardsComponent() {
            return this.onCreditConsumerRewardsComponent;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent getOnCreditEbayMastercardComponent() {
            return this.onCreditEbayMastercardComponent;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent getOnCreditPayPalCreditComponent() {
            return this.onCreditPayPalCreditComponent;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent getOnCreditPayPalMasterCardComponent() {
            return this.onCreditPayPalMasterCardComponent;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBalanceComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment;", "balanceComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBalanceComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment;", "getBalanceComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalanceComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment balanceComponentFragment;

        public OnBalanceComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment balanceComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceComponentFragment, "");
            this.__typename = str;
            this.balanceComponentFragment = balanceComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment getBalanceComponentFragment() {
            return this.balanceComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment balanceComponentFragment = this.balanceComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalanceComponent(__typename=");
            sb.append(str);
            sb.append(", balanceComponentFragment=");
            sb.append(balanceComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.balanceComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent onBalanceComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBalanceComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceComponentFragment, onBalanceComponent.balanceComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment balanceComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent(__typename, balanceComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment getBalanceComponentFragment() {
            return this.balanceComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent onBalanceComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment balanceComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBalanceComponent.__typename;
            }
            if ((i & 2) != 0) {
                balanceComponentFragment = onBalanceComponent.balanceComponentFragment;
            }
            return onBalanceComponent.copy(str, balanceComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnSavingsComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment;", "savingsComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnSavingsComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment;", "getSavingsComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSavingsComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment savingsComponentFragment;

        public OnSavingsComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment savingsComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsComponentFragment, "");
            this.__typename = str;
            this.savingsComponentFragment = savingsComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment getSavingsComponentFragment() {
            return this.savingsComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment savingsComponentFragment = this.savingsComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSavingsComponent(__typename=");
            sb.append(str);
            sb.append(", savingsComponentFragment=");
            sb.append(savingsComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.savingsComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent onSavingsComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onSavingsComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsComponentFragment, onSavingsComponent.savingsComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment savingsComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent(__typename, savingsComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment getSavingsComponentFragment() {
            return this.savingsComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent onSavingsComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment savingsComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSavingsComponent.__typename;
            }
            if ((i & 2) != 0) {
                savingsComponentFragment = onSavingsComponent.savingsComponentFragment;
            }
            return onSavingsComponent.copy(str, savingsComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment;", "bnplComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment;", "getBnplComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment bnplComponentFragment;

        public OnBNPLComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment bnplComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplComponentFragment, "");
            this.__typename = str;
            this.bnplComponentFragment = bnplComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment getBnplComponentFragment() {
            return this.bnplComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment bnplComponentFragment = this.bnplComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLComponent(__typename=");
            sb.append(str);
            sb.append(", bnplComponentFragment=");
            sb.append(bnplComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent onBNPLComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplComponentFragment, onBNPLComponent.bnplComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment bnplComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent(__typename, bnplComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment getBnplComponentFragment() {
            return this.bnplComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent onBNPLComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment bnplComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLComponent.__typename;
            }
            if ((i & 2) != 0) {
                bnplComponentFragment = onBNPLComponent.bnplComponentFragment;
            }
            return onBNPLComponent.copy(str, bnplComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCryptoComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment;", "cryptoComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCryptoComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment;", "getCryptoComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCryptoComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment cryptoComponentFragment;

        public OnCryptoComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment cryptoComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoComponentFragment, "");
            this.__typename = str;
            this.cryptoComponentFragment = cryptoComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment getCryptoComponentFragment() {
            return this.cryptoComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment cryptoComponentFragment = this.cryptoComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCryptoComponent(__typename=");
            sb.append(str);
            sb.append(", cryptoComponentFragment=");
            sb.append(cryptoComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.cryptoComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent onCryptoComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCryptoComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoComponentFragment, onCryptoComponent.cryptoComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment cryptoComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent(__typename, cryptoComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment getCryptoComponentFragment() {
            return this.cryptoComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent onCryptoComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment cryptoComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCryptoComponent.__typename;
            }
            if ((i & 2) != 0) {
                cryptoComponentFragment = onCryptoComponent.cryptoComponentFragment;
            }
            return onCryptoComponent.copy(str, cryptoComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditCardUSCardComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditCardUSCardComponentFragment;", "creditCardUSCardComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditCardUSCardComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditCardUSCardComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditCardUSCardComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditCardUSCardComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditCardUSCardComponentFragment;", "getCreditCardUSCardComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCreditCardUSCardComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment creditCardUSCardComponentFragment;

        public OnCreditCardUSCardComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment creditCardUSCardComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardUSCardComponentFragment, "");
            this.__typename = str;
            this.creditCardUSCardComponentFragment = creditCardUSCardComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment getCreditCardUSCardComponentFragment() {
            return this.creditCardUSCardComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment creditCardUSCardComponentFragment = this.creditCardUSCardComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCreditCardUSCardComponent(__typename=");
            sb.append(str);
            sb.append(", creditCardUSCardComponentFragment=");
            sb.append(creditCardUSCardComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.creditCardUSCardComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent onCreditCardUSCardComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCreditCardUSCardComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditCardUSCardComponentFragment, onCreditCardUSCardComponent.creditCardUSCardComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment creditCardUSCardComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardUSCardComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent(__typename, creditCardUSCardComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment getCreditCardUSCardComponentFragment() {
            return this.creditCardUSCardComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent onCreditCardUSCardComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment creditCardUSCardComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCreditCardUSCardComponent.__typename;
            }
            if ((i & 2) != 0) {
                creditCardUSCardComponentFragment = onCreditCardUSCardComponent.creditCardUSCardComponentFragment;
            }
            return onCreditCardUSCardComponent.copy(str, creditCardUSCardComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnRewardsComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment;", "rewardsComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnRewardsComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment;", "getRewardsComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRewardsComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment rewardsComponentFragment;

        public OnRewardsComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment rewardsComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsComponentFragment, "");
            this.__typename = str;
            this.rewardsComponentFragment = rewardsComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment getRewardsComponentFragment() {
            return this.rewardsComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment rewardsComponentFragment = this.rewardsComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRewardsComponent(__typename=");
            sb.append(str);
            sb.append(", rewardsComponentFragment=");
            sb.append(rewardsComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.rewardsComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent onRewardsComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onRewardsComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsComponentFragment, onRewardsComponent.rewardsComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment rewardsComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent(__typename, rewardsComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment getRewardsComponentFragment() {
            return this.rewardsComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent onRewardsComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment rewardsComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onRewardsComponent.__typename;
            }
            if ((i & 2) != 0) {
                rewardsComponentFragment = onRewardsComponent.rewardsComponentFragment;
            }
            return onRewardsComponent.copy(str, rewardsComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLEmptyStateComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplEmptyStateComponentFragment;", "bnplEmptyStateComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplEmptyStateComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplEmptyStateComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplEmptyStateComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnBNPLEmptyStateComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplEmptyStateComponentFragment;", "getBnplEmptyStateComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLEmptyStateComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplEmptyStateComponentFragment bnplEmptyStateComponentFragment;

        public OnBNPLEmptyStateComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplEmptyStateComponentFragment bnplEmptyStateComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplEmptyStateComponentFragment, "");
            this.__typename = str;
            this.bnplEmptyStateComponentFragment = bnplEmptyStateComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplEmptyStateComponentFragment getBnplEmptyStateComponentFragment() {
            return this.bnplEmptyStateComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.BnplEmptyStateComponentFragment bnplEmptyStateComponentFragment = this.bnplEmptyStateComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLEmptyStateComponent(__typename=");
            sb.append(str);
            sb.append(", bnplEmptyStateComponentFragment=");
            sb.append(bnplEmptyStateComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplEmptyStateComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent onBNPLEmptyStateComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLEmptyStateComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplEmptyStateComponentFragment, onBNPLEmptyStateComponent.bnplEmptyStateComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.BnplEmptyStateComponentFragment bnplEmptyStateComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplEmptyStateComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent(__typename, bnplEmptyStateComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplEmptyStateComponentFragment getBnplEmptyStateComponentFragment() {
            return this.bnplEmptyStateComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent onBNPLEmptyStateComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplEmptyStateComponentFragment bnplEmptyStateComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLEmptyStateComponent.__typename;
            }
            if ((i & 2) != 0) {
                bnplEmptyStateComponentFragment = onBNPLEmptyStateComponent.bnplEmptyStateComponentFragment;
            }
            return onBNPLEmptyStateComponent.copy(str, bnplEmptyStateComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnDebitInstrumentsComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment;", "debitInstrumentsComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnDebitInstrumentsComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment;", "getDebitInstrumentsComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDebitInstrumentsComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment debitInstrumentsComponentFragment;

        public OnDebitInstrumentsComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment debitInstrumentsComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentsComponentFragment, "");
            this.__typename = str;
            this.debitInstrumentsComponentFragment = debitInstrumentsComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment getDebitInstrumentsComponentFragment() {
            return this.debitInstrumentsComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment debitInstrumentsComponentFragment = this.debitInstrumentsComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDebitInstrumentsComponent(__typename=");
            sb.append(str);
            sb.append(", debitInstrumentsComponentFragment=");
            sb.append(debitInstrumentsComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.debitInstrumentsComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent onDebitInstrumentsComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onDebitInstrumentsComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentsComponentFragment, onDebitInstrumentsComponent.debitInstrumentsComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment debitInstrumentsComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentsComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent(__typename, debitInstrumentsComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment getDebitInstrumentsComponentFragment() {
            return this.debitInstrumentsComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent onDebitInstrumentsComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment debitInstrumentsComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onDebitInstrumentsComponent.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentsComponentFragment = onDebitInstrumentsComponent.debitInstrumentsComponentFragment;
            }
            return onDebitInstrumentsComponent.copy(str, debitInstrumentsComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalMasterCardComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment;", "creditPayPalMasterCardComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalMasterCardComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment;", "getCreditPayPalMasterCardComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCreditPayPalMasterCardComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment creditPayPalMasterCardComponentFragment;

        public OnCreditPayPalMasterCardComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment creditPayPalMasterCardComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditPayPalMasterCardComponentFragment, "");
            this.__typename = str;
            this.creditPayPalMasterCardComponentFragment = creditPayPalMasterCardComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment getCreditPayPalMasterCardComponentFragment() {
            return this.creditPayPalMasterCardComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment creditPayPalMasterCardComponentFragment = this.creditPayPalMasterCardComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCreditPayPalMasterCardComponent(__typename=");
            sb.append(str);
            sb.append(", creditPayPalMasterCardComponentFragment=");
            sb.append(creditPayPalMasterCardComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.creditPayPalMasterCardComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent onCreditPayPalMasterCardComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCreditPayPalMasterCardComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditPayPalMasterCardComponentFragment, onCreditPayPalMasterCardComponent.creditPayPalMasterCardComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment creditPayPalMasterCardComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditPayPalMasterCardComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent(__typename, creditPayPalMasterCardComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment getCreditPayPalMasterCardComponentFragment() {
            return this.creditPayPalMasterCardComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent onCreditPayPalMasterCardComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment creditPayPalMasterCardComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCreditPayPalMasterCardComponent.__typename;
            }
            if ((i & 2) != 0) {
                creditPayPalMasterCardComponentFragment = onCreditPayPalMasterCardComponent.creditPayPalMasterCardComponentFragment;
            }
            return onCreditPayPalMasterCardComponent.copy(str, creditPayPalMasterCardComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalCreditComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalCreditComponentFragment;", "creditPayPalCreditComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalCreditComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalCreditComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalCreditComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditPayPalCreditComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalCreditComponentFragment;", "getCreditPayPalCreditComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCreditPayPalCreditComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment creditPayPalCreditComponentFragment;

        public OnCreditPayPalCreditComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment creditPayPalCreditComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditPayPalCreditComponentFragment, "");
            this.__typename = str;
            this.creditPayPalCreditComponentFragment = creditPayPalCreditComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment getCreditPayPalCreditComponentFragment() {
            return this.creditPayPalCreditComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment creditPayPalCreditComponentFragment = this.creditPayPalCreditComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCreditPayPalCreditComponent(__typename=");
            sb.append(str);
            sb.append(", creditPayPalCreditComponentFragment=");
            sb.append(creditPayPalCreditComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.creditPayPalCreditComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent onCreditPayPalCreditComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCreditPayPalCreditComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditPayPalCreditComponentFragment, onCreditPayPalCreditComponent.creditPayPalCreditComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment creditPayPalCreditComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditPayPalCreditComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent(__typename, creditPayPalCreditComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment getCreditPayPalCreditComponentFragment() {
            return this.creditPayPalCreditComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent onCreditPayPalCreditComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment creditPayPalCreditComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCreditPayPalCreditComponent.__typename;
            }
            if ((i & 2) != 0) {
                creditPayPalCreditComponentFragment = onCreditPayPalCreditComponent.creditPayPalCreditComponentFragment;
            }
            return onCreditPayPalCreditComponent.copy(str, creditPayPalCreditComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditEbayMastercardComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditEbayMastercardComponentFragment;", "creditEbayMastercardComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditEbayMastercardComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditEbayMastercardComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditEbayMastercardComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditEbayMastercardComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditEbayMastercardComponentFragment;", "getCreditEbayMastercardComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCreditEbayMastercardComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment creditEbayMastercardComponentFragment;

        public OnCreditEbayMastercardComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment creditEbayMastercardComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditEbayMastercardComponentFragment, "");
            this.__typename = str;
            this.creditEbayMastercardComponentFragment = creditEbayMastercardComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment getCreditEbayMastercardComponentFragment() {
            return this.creditEbayMastercardComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment creditEbayMastercardComponentFragment = this.creditEbayMastercardComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCreditEbayMastercardComponent(__typename=");
            sb.append(str);
            sb.append(", creditEbayMastercardComponentFragment=");
            sb.append(creditEbayMastercardComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.creditEbayMastercardComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent onCreditEbayMastercardComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCreditEbayMastercardComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditEbayMastercardComponentFragment, onCreditEbayMastercardComponent.creditEbayMastercardComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment creditEbayMastercardComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditEbayMastercardComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent(__typename, creditEbayMastercardComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment getCreditEbayMastercardComponentFragment() {
            return this.creditEbayMastercardComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent onCreditEbayMastercardComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment creditEbayMastercardComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCreditEbayMastercardComponent.__typename;
            }
            if ((i & 2) != 0) {
                creditEbayMastercardComponentFragment = onCreditEbayMastercardComponent.creditEbayMastercardComponentFragment;
            }
            return onCreditEbayMastercardComponent.copy(str, creditEbayMastercardComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditConsumerRewardsComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment;", "creditConsumerRewardsComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditConsumerRewardsComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment;", "getCreditConsumerRewardsComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCreditConsumerRewardsComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment creditConsumerRewardsComponentFragment;

        public OnCreditConsumerRewardsComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment creditConsumerRewardsComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditConsumerRewardsComponentFragment, "");
            this.__typename = str;
            this.creditConsumerRewardsComponentFragment = creditConsumerRewardsComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment getCreditConsumerRewardsComponentFragment() {
            return this.creditConsumerRewardsComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment creditConsumerRewardsComponentFragment = this.creditConsumerRewardsComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCreditConsumerRewardsComponent(__typename=");
            sb.append(str);
            sb.append(", creditConsumerRewardsComponentFragment=");
            sb.append(creditConsumerRewardsComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.creditConsumerRewardsComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent onCreditConsumerRewardsComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCreditConsumerRewardsComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditConsumerRewardsComponentFragment, onCreditConsumerRewardsComponent.creditConsumerRewardsComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment creditConsumerRewardsComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditConsumerRewardsComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent(__typename, creditConsumerRewardsComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment getCreditConsumerRewardsComponentFragment() {
            return this.creditConsumerRewardsComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent onCreditConsumerRewardsComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment creditConsumerRewardsComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCreditConsumerRewardsComponent.__typename;
            }
            if ((i & 2) != 0) {
                creditConsumerRewardsComponentFragment = onCreditConsumerRewardsComponent.creditConsumerRewardsComponentFragment;
            }
            return onCreditConsumerRewardsComponent.copy(str, creditConsumerRewardsComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditSmartConnectComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment;", "creditSmartConnectComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$OnCreditSmartConnectComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment;", "getCreditSmartConnectComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCreditSmartConnectComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment creditSmartConnectComponentFragment;

        public OnCreditSmartConnectComponent(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment creditSmartConnectComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditSmartConnectComponentFragment, "");
            this.__typename = str;
            this.creditSmartConnectComponentFragment = creditSmartConnectComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment getCreditSmartConnectComponentFragment() {
            return this.creditSmartConnectComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment creditSmartConnectComponentFragment = this.creditSmartConnectComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCreditSmartConnectComponent(__typename=");
            sb.append(str);
            sb.append(", creditSmartConnectComponentFragment=");
            sb.append(creditSmartConnectComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.creditSmartConnectComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent onCreditSmartConnectComponent = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCreditSmartConnectComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditSmartConnectComponentFragment, onCreditSmartConnectComponent.creditSmartConnectComponentFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment creditSmartConnectComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditSmartConnectComponentFragment, "");
            return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent(__typename, creditSmartConnectComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment getCreditSmartConnectComponentFragment() {
            return this.creditSmartConnectComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent onCreditSmartConnectComponent, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment creditSmartConnectComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCreditSmartConnectComponent.__typename;
            }
            if ((i & 2) != 0) {
                creditSmartConnectComponentFragment = onCreditSmartConnectComponent.creditSmartConnectComponentFragment;
            }
            return onCreditSmartConnectComponent.copy(str, creditSmartConnectComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetAccountSnapshot($walletComponentsInput: WalletComponentsInput!) { walletComponents(input: $walletComponentsInput) { __typename items { __typename ... on BalanceComponent { __typename ...BalanceComponentFragment } ... on SavingsComponent { __typename ...SavingsComponentFragment } ... on BNPLComponent { __typename ...BnplComponentFragment } ... on CryptoComponent { __typename ...CryptoComponentFragment } ... on CreditCardUSCardComponent { __typename ...CreditCardUSCardComponentFragment } ... on RewardsComponent { __typename ...RewardsComponentFragment } ... on BNPLEmptyStateComponent { __typename ...BnplEmptyStateComponentFragment } ... on DebitInstrumentsComponent { __typename ...DebitInstrumentsComponentFragment } ... on CreditPayPalMasterCardComponent { __typename ...CreditPayPalMasterCardComponentFragment } ... on CreditPayPalCreditComponent { __typename ...CreditPayPalCreditComponentFragment } ... on CreditEbayMastercardComponent { __typename ...CreditEbayMastercardComponentFragment } ... on CreditConsumerRewardsComponent { __typename ...CreditConsumerRewardsComponentFragment } ... on CreditSmartConnectComponent { __typename ...CreditSmartConnectComponentFragment } } } }  fragment MoneyFragment on Money { __typename value currencyCode }  fragment BalanceComponentFragment on BalanceComponent { __typename trackingId wallet { __typename accountId balances { __typename totalAvailableAmount { __typename ...MoneyFragment } totalReservedAmount { __typename ...MoneyFragment } hasMoneyOnHold moneyOnHoldAmount { __typename ...MoneyFragment } hasTaxOnHold taxOnHoldAmount { __typename ...MoneyFragment } prepaidStatus items { __typename id available { __typename amount { __typename ...MoneyFragment } } } } } }  fragment SavingsComponentFragment on SavingsComponent { __typename trackingId wallet { __typename accountId savings { __typename savingsAccount { __typename id accountStatus totalBalance { __typename ...MoneyFragment } } savingsAccountFeatures { __typename annualPercentageYield } } } }  fragment BnplComponentFragment on BNPLComponent { __typename trackingId bnplProfilePresentation { __typename accountId status(placementLocation: OSLO_HOME_FINANCIAL_PRODUCTS_SURFACE) { __typename ... on BNPLProfileStatusPrequalified { __typename spendingPower { __typename ...MoneyFragment } } ... on BNPLProfileStatusDueThisWeek { __typename totalAmountDueThisWeek { __typename ...MoneyFragment } } ... on BNPLProfileStatusDueToday { __typename totalAmountDueToday { __typename ...MoneyFragment } } ... on BNPLProfileStatusOverdue { __typename totalOverdueAmount { __typename ...MoneyFragment } } ... on BNPLProfileStatusDueOnSpecificDate { __typename dueDate amountDue { __typename ...MoneyFragment } } } plans(input: { filterOptions: { plansCategory: ACTIVE withAnyOfThePlanStatuses: [DELINQUENT,PAST_DUE,ON_TRACK,PENDING,ALMOST_COMPLETE] withAnyOfTheTags: [ORDER] withCreditProductIdentifiers: [PAY_LATER_US,PAY_LATER_LONG_TERM_US] withNoneOfTheTags: [FRAUD,DECEASED,BANKRUPTCY,CHARGED_OFF] }  } ) { totalRemainingBalance { __typename ...MoneyFragment } totalCount } } }  fragment CryptoComponentFragment on CryptoComponent { __typename trackingId wallet { __typename accountId cryptocurrencyHoldings(input: { gainOrLoss: true rewardHolding: true } ) { __typename totalPortfolioValue { __typename sellableHolding { __typename ...MoneyFragment } gainOrLoss { __typename gainOrLossFiatAmount { __typename ...MoneyFragment } gainOrLossPercent gainOrLossStatus } } holdings { __typename assetQuantity { __typename assetSymbol } holdingViews { __typename type fiatAmount { __typename ...MoneyFragment } } rewardHolding { __typename rewardApy { __typename rate } } } } } }  fragment HomeCreditAccountFields on RevolvingCreditAccount { __typename creditAccountId billing { __typename currentBalance { __typename currencyCode value } } product { __typename cardDisplayLogo { __typename url } cardDisplayName } }  fragment HomeCreditNextBestActionFields on RevolvingCreditOverviewNextBestActionDetails { __typename ... on RevolvingCreditPastDue { __typename personalizationTrackingId } ... on RevolvingCreditMinimumPaymentDue { __typename minimumPaymentDue { __typename ...MoneyFragment } nextPaymentDueTime personalizationTrackingId } ... on RevolvingCreditAutopayCustomAmount { __typename customAmount { __typename ...MoneyFragment } nextPaymentDueTime personalizationTrackingId } ... on RevolvingCreditAutopayMinimumPaymentDue { __typename minimumPaymentDue { __typename ...MoneyFragment } nextPaymentDueTime personalizationTrackingId } ... on RevolvingCreditAutopayLastStatement { __typename nextPaymentDueTime personalizationTrackingId } }  fragment CreditCardUSCardComponentFragment on CreditCardUSCardComponent { __typename wallet { __typename revolvingCredit { __typename ccus: account(input: { creditProductIdentifier: PAYPAL_CREDIT_CARD_US } ) { __typename ...HomeCreditAccountFields } ccusnba: nextBestAction(input: { creditProductIdentifier: PAYPAL_CREDIT_CARD_US placementId: \"OSLO_HOME_L1_ACCOUNTS_CAROUSEL\" } ) { __typename ...HomeCreditNextBestActionFields } } } }  fragment RewardsComponentFragment on RewardsComponent { __typename trackingId wallet { __typename rewardsOverview { __typename redeemablePointBalance { __typename pointsAvailable } } } }  fragment BnplEmptyStateComponentFragment on BNPLEmptyStateComponent { __typename bnplProfilePresentation { __typename prequalificationSummary(input: { creditProductIdentifiers: [PAY_LATER_US] flowContext: { channel: MOBILE_APP flowSpecifier: STANDALONE_APPLICATION }  } ) { __typename preQualificationEligible spendingPower { __typename ...MoneyFragment } } } }  fragment DebitInstrumentsComponentFragment on DebitInstrumentsComponent { __typename wallet { __typename debitInstruments { __typename productName displayState smallImage { __typename front { __typename referenceUrl } } } } }  fragment CreditPayPalMasterCardComponentFragment on CreditPayPalMasterCardComponent { __typename wallet { __typename revolvingCredit { __typename ppmc: account(input: { creditProductIdentifier: SYF_US_PPMC } ) { __typename ...HomeCreditAccountFields } ppmcnba: nextBestAction(input: { creditProductIdentifier: SYF_US_PPMC placementId: \"OSLO_HOME_L1_ACCOUNTS_CAROUSEL\" } ) { __typename ...HomeCreditNextBestActionFields } } } }  fragment CreditPayPalCreditComponentFragment on CreditPayPalCreditComponent { __typename wallet { __typename revolvingCredit { __typename usv2: account(input: { creditProductIdentifier: PPC_US_V2 } ) { __typename ...HomeCreditAccountFields } usv2nba: nextBestAction(input: { creditProductIdentifier: PPC_US_V2 placementId: \"OSLO_HOME_L1_ACCOUNTS_CAROUSEL\" } ) { __typename ...HomeCreditNextBestActionFields } } } }  fragment CreditEbayMastercardComponentFragment on CreditEbayMastercardComponent { __typename wallet { __typename revolvingCredit { __typename ebaymc: account(input: { creditProductIdentifier: SYF_US_EBAYMC } ) { __typename ...HomeCreditAccountFields } ebaynba: nextBestAction(input: { creditProductIdentifier: SYF_US_EBAYMC placementId: \"OSLO_HOME_L1_ACCOUNTS_CAROUSEL\" } ) { __typename ...HomeCreditNextBestActionFields } } } }  fragment CreditConsumerRewardsComponentFragment on CreditConsumerRewardsComponent { __typename wallet { __typename revolvingCredit { __typename rewardsus: account(input: { creditProductIdentifier: CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US } ) { __typename ...HomeCreditAccountFields } rewardsnba: nextBestAction(input: { creditProductIdentifier: CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US placementId: \"OSLO_HOME_L1_ACCOUNTS_CAROUSEL\" } ) { __typename ...HomeCreditNextBestActionFields } } } }  fragment CreditSmartConnectComponentFragment on CreditSmartConnectComponent { __typename wallet { __typename revolvingCredit { __typename smtccnct: account(input: { creditProductIdentifier: SYF_US_SMTCNCT } ) { __typename ...HomeCreditAccountFields } smtccnctnba: nextBestAction(input: { creditProductIdentifier: SYF_US_SMTCNCT placementId: \"OSLO_HOME_L1_ACCOUNTS_CAROUSEL\" } ) { __typename ...HomeCreditNextBestActionFields } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput walletComponentsInput = this.walletComponentsInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetAccountSnapshotQuery(walletComponentsInput=");
        sb.append(walletComponentsInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.walletComponentsInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletComponentsInput, ((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery) other).walletComponentsInput);
    }

    public final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery copy(com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput walletComponentsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletComponentsInput, "");
        return new com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery(walletComponentsInput);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput getWalletComponentsInput() {
        return this.walletComponentsInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery copy$default(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery getAccountSnapshotQuery, com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput walletComponentsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            walletComponentsInput = getAccountSnapshotQuery.walletComponentsInput;
        }
        return getAccountSnapshotQuery.copy(walletComponentsInput);
    }
}
