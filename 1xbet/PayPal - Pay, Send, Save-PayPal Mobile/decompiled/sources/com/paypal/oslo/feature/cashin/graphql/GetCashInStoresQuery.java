package com.paypal.oslo.feature.cashin.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\f*+,-./01234)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CashInStoresInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CashInStoresInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CashInStoresInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CashInStoresInput;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CashInStoresInput;", "getInput", "Companion", "Data", "CashInStores", "Page", "Item", "GeoLocation", "Address", "Experience", "Retailer", "Fee", "Partner", "Distance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetCashInStoresQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Data> {
    public static final java.lang.String OPERATION_ID = "137754ba046bb33f5b028a59433aa9d4c0961c2a0b291169f4ea3c28f9b1536b";
    public static final java.lang.String OPERATION_NAME = "GetCashInStores";
    private final com.paypal.oslo.api.graphql.schema.type.CashInStoresInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Companion INSTANCE = new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Companion(null);
    public static final int $stable = 8;

    public GetCashInStoresQuery(com.paypal.oslo.api.graphql.schema.type.CashInStoresInput cashInStoresInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInStoresInput, "");
        this.input = cashInStoresInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CashInStoresInput getInput() {
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
        com.paypal.oslo.feature.cashin.graphql.adapter.GetCashInStoresQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cashin.graphql.adapter.GetCashInStoresQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.cashin.graphql.selections.GetCashInStoresQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$CashInStores;", "cashInStores", "<init>", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$CashInStores;)V", "component1", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$CashInStores;", "copy", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$CashInStores;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$CashInStores;", "getCashInStores"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores cashInStores;

        public Data(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores cashInStores) {
            this.cashInStores = cashInStores;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores getCashInStores() {
            return this.cashInStores;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores cashInStores = this.cashInStores;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(cashInStores=");
            sb.append(cashInStores);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores cashInStores = this.cashInStores;
            if (cashInStores == null) {
                return 0;
            }
            return cashInStores.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashInStores, ((com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Data) other).cashInStores);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Data copy(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores cashInStores) {
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Data(cashInStores);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores getCashInStores() {
            return this.cashInStores;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Data copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Data data, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores cashInStores, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cashInStores = data.cashInStores;
            }
            return data.copy(cashInStores);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$CashInStores;", "", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Page;", "page", "", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "<init>", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Page;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Page;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Page;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$CashInStores;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Page;", "getPage", "Ljava/lang/Integer;", "getTotalCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CashInStores {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page page;
        private final java.lang.Integer totalCount;

        public CashInStores(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page page, java.lang.Integer num) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
            this.totalCount = num;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page getPage() {
            return this.page;
        }

        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page page = this.page;
            java.lang.Integer num = this.totalCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CashInStores(page=");
            sb.append(page);
            sb.append(", totalCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.page.hashCode();
            java.lang.Integer num = this.totalCount;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores cashInStores = (com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.page, cashInStores.page) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalCount, cashInStores.totalCount);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores copy(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page page, java.lang.Integer totalCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores(page, totalCount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores cashInStores, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page page, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = cashInStores.page;
            }
            if ((i & 2) != 0) {
                num = cashInStores.totalCount;
            }
            return cashInStores.copy(page, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Page;", "", "", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Page;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item> items;

        public Page(java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(items=");
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
            return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page) other).items);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page copy(java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page(items);
        }

        public final java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page page, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = page.items;
            }
            return page.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJt\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b3\u0010\u0013R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Item;", "", "", "name", "logoUrl", "markerUrl", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$GeoLocation;", "geoLocation", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Address;", "address", "phoneNumber", "", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Experience;", "experiences", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Distance;", "distance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$GeoLocation;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Address;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Distance;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$GeoLocation;", "component5", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Address;", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Distance;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$GeoLocation;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Address;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Distance;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getLogoUrl", "getMarkerUrl", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$GeoLocation;", "getGeoLocation", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Address;", "getAddress", "getPhoneNumber", "Ljava/util/List;", "getExperiences", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Distance;", "getDistance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address address;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance distance;
        private final java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience> experiences;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation geoLocation;
        private final java.lang.Object logoUrl;
        private final java.lang.Object markerUrl;
        private final java.lang.String name;
        private final java.lang.String phoneNumber;

        public Item(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation geoLocation, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address address, java.lang.String str2, java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience> list, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance distance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.logoUrl = obj;
            this.markerUrl = obj2;
            this.geoLocation = geoLocation;
            this.address = address;
            this.phoneNumber = str2;
            this.experiences = list;
            this.distance = distance;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        public final java.lang.Object getMarkerUrl() {
            return this.markerUrl;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation getGeoLocation() {
            return this.geoLocation;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address getAddress() {
            return this.address;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience> getExperiences() {
            return this.experiences;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance getDistance() {
            return this.distance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.Object obj = this.logoUrl;
            java.lang.Object obj2 = this.markerUrl;
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation geoLocation = this.geoLocation;
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address address = this.address;
            java.lang.String str2 = this.phoneNumber;
            java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience> list = this.experiences;
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance distance = this.distance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(name=");
            sb.append(str);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(", markerUrl=");
            sb.append(obj2);
            sb.append(", geoLocation=");
            sb.append(geoLocation);
            sb.append(", address=");
            sb.append(address);
            sb.append(", phoneNumber=");
            sb.append(str2);
            sb.append(", experiences=");
            sb.append(list);
            sb.append(", distance=");
            sb.append(distance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.Object obj = this.logoUrl;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.markerUrl;
            int hashCode3 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation geoLocation = this.geoLocation;
            int hashCode4 = geoLocation == null ? 0 : geoLocation.hashCode();
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address address = this.address;
            int hashCode5 = address == null ? 0 : address.hashCode();
            java.lang.String str = this.phoneNumber;
            int hashCode6 = str == null ? 0 : str.hashCode();
            java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience> list = this.experiences;
            int hashCode7 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance distance = this.distance;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (distance != null ? distance.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item item = (com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, item.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, item.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.markerUrl, item.markerUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.geoLocation, item.geoLocation) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, item.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, item.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.experiences, item.experiences) && kotlin.jvm.internal.Intrinsics.areEqual(this.distance, item.distance);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item copy(java.lang.String name2, java.lang.Object logoUrl, java.lang.Object markerUrl, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation geoLocation, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address address, java.lang.String phoneNumber, java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience> experiences, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance distance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item(name2, logoUrl, markerUrl, geoLocation, address, phoneNumber, experiences, distance);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance getDistance() {
            return this.distance;
        }

        public final java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience> component7() {
            return this.experiences;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address getAddress() {
            return this.address;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation getGeoLocation() {
            return this.geoLocation;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getMarkerUrl() {
            return this.markerUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$GeoLocation;", "", "", "latitude", "longitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$GeoLocation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLatitude", "getLongitude"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GeoLocation {
        public static final int $stable = 0;
        private final java.lang.String latitude;
        private final java.lang.String longitude;

        public GeoLocation(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.latitude = str;
            this.longitude = str2;
        }

        public final java.lang.String getLatitude() {
            return this.latitude;
        }

        public final java.lang.String getLongitude() {
            return this.longitude;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.latitude;
            java.lang.String str2 = this.longitude;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GeoLocation(latitude=");
            sb.append(str);
            sb.append(", longitude=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.latitude.hashCode() * 31) + this.longitude.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation geoLocation = (com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.latitude, geoLocation.latitude) && kotlin.jvm.internal.Intrinsics.areEqual(this.longitude, geoLocation.longitude);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation copy(java.lang.String latitude, java.lang.String longitude) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latitude, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longitude, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation(latitude, longitude);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLongitude() {
            return this.longitude;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLatitude() {
            return this.latitude;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation geoLocation, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = geoLocation.latitude;
            }
            if ((i & 2) != 0) {
                str2 = geoLocation.longitude;
            }
            return geoLocation.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Address;", "", "", "addressLine1", "adminArea1", "adminArea2", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressLine1", "getAdminArea1", "getAdminArea2", "getPostalCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        public static final int $stable = 0;
        private final java.lang.String addressLine1;
        private final java.lang.String adminArea1;
        private final java.lang.String adminArea2;
        private final java.lang.String postalCode;

        public Address(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.addressLine1 = str;
            this.adminArea1 = str2;
            this.adminArea2 = str3;
            this.postalCode = str4;
        }

        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.addressLine1;
            java.lang.String str2 = this.adminArea1;
            java.lang.String str3 = this.adminArea2;
            java.lang.String str4 = this.postalCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(addressLine1=");
            sb.append(str);
            sb.append(", adminArea1=");
            sb.append(str2);
            sb.append(", adminArea2=");
            sb.append(str3);
            sb.append(", postalCode=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.addressLine1;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.adminArea1;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.adminArea2;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.postalCode;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address address = (com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, address.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, address.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, address.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, address.postalCode);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address copy(java.lang.String addressLine1, java.lang.String adminArea1, java.lang.String adminArea2, java.lang.String postalCode) {
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address(addressLine1, adminArea1, adminArea2, postalCode);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address address, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = address.addressLine1;
            }
            if ((i & 2) != 0) {
                str2 = address.adminArea1;
            }
            if ((i & 4) != 0) {
                str3 = address.adminArea2;
            }
            if ((i & 8) != 0) {
                str4 = address.postalCode;
            }
            return address.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Experience;", "", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Retailer;", "retailer", "<init>", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Retailer;)V", "component1", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Retailer;", "copy", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Retailer;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Experience;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Retailer;", "getRetailer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Experience {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer retailer;

        public Experience(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer retailer) {
            this.retailer = retailer;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer getRetailer() {
            return this.retailer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer retailer = this.retailer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Experience(retailer=");
            sb.append(retailer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer retailer = this.retailer;
            if (retailer == null) {
                return 0;
            }
            return retailer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience) && kotlin.jvm.internal.Intrinsics.areEqual(this.retailer, ((com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience) other).retailer);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience copy(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer retailer) {
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience(retailer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer getRetailer() {
            return this.retailer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience experience, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer retailer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                retailer = experience.retailer;
            }
            return experience.copy(retailer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Retailer;", "", "", "id", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Fee;", "fee", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Partner;", "partner", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Fee;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Partner;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Fee;", "component3", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Partner;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Fee;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Partner;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Retailer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Fee;", "getFee", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Partner;", "getPartner"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Retailer {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee fee;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner partner;

        public Retailer(java.lang.String str, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee fee, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner partner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fee, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partner, "");
            this.id = str;
            this.fee = fee;
            this.partner = partner;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee getFee() {
            return this.fee;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner getPartner() {
            return this.partner;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee fee = this.fee;
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner partner = this.partner;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Retailer(id=");
            sb.append(str);
            sb.append(", fee=");
            sb.append(fee);
            sb.append(", partner=");
            sb.append(partner);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.fee.hashCode()) * 31) + this.partner.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer retailer = (com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, retailer.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fee, retailer.fee) && kotlin.jvm.internal.Intrinsics.areEqual(this.partner, retailer.partner);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer copy(java.lang.String id, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee fee, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner partner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fee, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partner, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer(id, fee, partner);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner getPartner() {
            return this.partner;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee getFee() {
            return this.fee;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer retailer, java.lang.String str, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee fee, com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner partner, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = retailer.id;
            }
            if ((i & 2) != 0) {
                fee = retailer.fee;
            }
            if ((i & 4) != 0) {
                partner = retailer.partner;
            }
            return retailer.copy(str, fee, partner);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Fee;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Fee;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Fee {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Fee(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fee(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee fee = (com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, fee.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, fee.value);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee fee, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = fee.currencyCode;
            }
            if ((i & 2) != 0) {
                str = fee.value;
            }
            return fee.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Partner;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Partner;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Partner {
        public static final int $stable = 0;
        private final java.lang.String id;

        public Partner(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Partner(id=");
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
            return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner) other).id);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner partner, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = partner.id;
            }
            return partner.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Distance;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CashInStoreDistanceUnitType;", "unit", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CashInStoreDistanceUnitType;D)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CashInStoreDistanceUnitType;", "component2", "()D", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CashInStoreDistanceUnitType;D)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Distance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CashInStoreDistanceUnitType;", "getUnit", "D", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Distance {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CashInStoreDistanceUnitType unit;
        private final double value;

        public Distance(com.paypal.oslo.api.graphql.schema.type.CashInStoreDistanceUnitType cashInStoreDistanceUnitType, double d) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInStoreDistanceUnitType, "");
            this.unit = cashInStoreDistanceUnitType;
            this.value = d;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CashInStoreDistanceUnitType getUnit() {
            return this.unit;
        }

        public final double getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CashInStoreDistanceUnitType cashInStoreDistanceUnitType = this.unit;
            double d = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Distance(unit=");
            sb.append(cashInStoreDistanceUnitType);
            sb.append(", value=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.unit.hashCode() * 31) + java.lang.Double.hashCode(this.value);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance distance = (com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance) other;
            return this.unit == distance.unit && java.lang.Double.compare(this.value, distance.value) == 0;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance copy(com.paypal.oslo.api.graphql.schema.type.CashInStoreDistanceUnitType unit, double value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance(unit, value);
        }

        /* renamed from: component2, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CashInStoreDistanceUnitType getUnit() {
            return this.unit;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance distance, com.paypal.oslo.api.graphql.schema.type.CashInStoreDistanceUnitType cashInStoreDistanceUnitType, double d, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cashInStoreDistanceUnitType = distance.unit;
            }
            if ((i & 2) != 0) {
                d = distance.value;
            }
            return distance.copy(cashInStoreDistanceUnitType, d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCashInStores($input: CashInStoresInput!) { cashInStores(input: $input) { page { items { name logoUrl markerUrl geoLocation { latitude longitude } address { addressLine1 adminArea1 adminArea2 postalCode } phoneNumber experiences { retailer { id fee { currencyCode value } partner { id } } } distance { unit value } } } totalCount } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CashInStoresInput cashInStoresInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCashInStoresQuery(input=");
        sb.append(cashInStoresInput);
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
        return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery) other).input);
    }

    public final com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery copy(com.paypal.oslo.api.graphql.schema.type.CashInStoresInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CashInStoresInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery getCashInStoresQuery, com.paypal.oslo.api.graphql.schema.type.CashInStoresInput cashInStoresInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cashInStoresInput = getCashInStoresQuery.input;
        }
        return getCashInStoresQuery.copy(cashInStoresInput);
    }
}
