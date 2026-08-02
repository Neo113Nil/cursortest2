package com.paypal.oslo.feature.cashin.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007*+,-./)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CashInRetailersInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CashInRetailersInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CashInRetailersInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CashInRetailersInput;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CashInRetailersInput;", "getInput", "Companion", "Data", "CashInRetailers", "Page", "Item", "Fee", "Partner"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetCashInRetailersQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Data> {
    public static final java.lang.String OPERATION_ID = "50475d4203bc863c9138584071b9ae5b1e4611df2ba982ba32ecdd60e1d396d3";
    public static final java.lang.String OPERATION_NAME = "GetCashInRetailers";
    private final com.paypal.oslo.api.graphql.schema.type.CashInRetailersInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Companion INSTANCE = new com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Companion(null);
    public static final int $stable = 8;

    public GetCashInRetailersQuery(com.paypal.oslo.api.graphql.schema.type.CashInRetailersInput cashInRetailersInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInRetailersInput, "");
        this.input = cashInRetailersInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CashInRetailersInput getInput() {
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
        com.paypal.oslo.feature.cashin.graphql.adapter.GetCashInRetailersQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cashin.graphql.adapter.GetCashInRetailersQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.cashin.graphql.selections.GetCashInRetailersQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$CashInRetailers;", "cashInRetailers", "<init>", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$CashInRetailers;)V", "component1", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$CashInRetailers;", "copy", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$CashInRetailers;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$CashInRetailers;", "getCashInRetailers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers cashInRetailers;

        public Data(com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers cashInRetailers) {
            this.cashInRetailers = cashInRetailers;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers getCashInRetailers() {
            return this.cashInRetailers;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers cashInRetailers = this.cashInRetailers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(cashInRetailers=");
            sb.append(cashInRetailers);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers cashInRetailers = this.cashInRetailers;
            if (cashInRetailers == null) {
                return 0;
            }
            return cashInRetailers.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashInRetailers, ((com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Data) other).cashInRetailers);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Data copy(com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers cashInRetailers) {
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Data(cashInRetailers);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers getCashInRetailers() {
            return this.cashInRetailers;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Data copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Data data, com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers cashInRetailers, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cashInRetailers = data.cashInRetailers;
            }
            return data.copy(cashInRetailers);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$CashInRetailers;", "", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Page;", "page", "<init>", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Page;)V", "component1", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Page;", "copy", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Page;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$CashInRetailers;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Page;", "getPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CashInRetailers {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page page;

        public CashInRetailers(com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page getPage() {
            return this.page;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page page = this.page;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CashInRetailers(page=");
            sb.append(page);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.page.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers) other).page);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers copy(com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers(page);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers cashInRetailers, com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page page, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = cashInRetailers.page;
            }
            return cashInRetailers.copy(page);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Page;", "", "", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Page;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item> items;

        public Page(java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item> list = this.items;
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
            return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page) other).items);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page copy(java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page(items);
        }

        public final java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page page, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = page.items;
            }
            return page.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJr\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0016R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001aR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b2\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Item;", "", "", "id", "name", "logoUrl", "", "Lcom/paypal/oslo/api/graphql/schema/type/CashInRetailerCapability;", "capabilities", "", "codeValidTimeInMinutes", "tags", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Fee;", "fee", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Partner;", "partner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Fee;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Partner;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Integer;", "component6", "component7", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Fee;", "component8", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Partner;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Fee;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Partner;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Object;", "getLogoUrl", "Ljava/util/List;", "getCapabilities", "Ljava/lang/Integer;", "getCodeValidTimeInMinutes", "getTags", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Fee;", "getFee", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Partner;", "getPartner"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> capabilities;
        private final java.lang.Integer codeValidTimeInMinutes;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee fee;
        private final java.lang.String id;
        private final java.lang.Object logoUrl;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner partner;
        private final java.util.List<java.lang.String> tags;

        /* JADX WARN: Multi-variable type inference failed */
        public Item(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> list, java.lang.Integer num, java.util.List<java.lang.String> list2, com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee fee, com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner partner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fee, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partner, "");
            this.id = str;
            this.name = str2;
            this.logoUrl = obj;
            this.capabilities = list;
            this.codeValidTimeInMinutes = num;
            this.tags = list2;
            this.fee = fee;
            this.partner = partner;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> getCapabilities() {
            return this.capabilities;
        }

        public final java.lang.Integer getCodeValidTimeInMinutes() {
            return this.codeValidTimeInMinutes;
        }

        public final java.util.List<java.lang.String> getTags() {
            return this.tags;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee getFee() {
            return this.fee;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner getPartner() {
            return this.partner;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.Object obj = this.logoUrl;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> list = this.capabilities;
            java.lang.Integer num = this.codeValidTimeInMinutes;
            java.util.List<java.lang.String> list2 = this.tags;
            com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee fee = this.fee;
            com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner partner = this.partner;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(", capabilities=");
            sb.append(list);
            sb.append(", codeValidTimeInMinutes=");
            sb.append(num);
            sb.append(", tags=");
            sb.append(list2);
            sb.append(", fee=");
            sb.append(fee);
            sb.append(", partner=");
            sb.append(partner);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            int hashCode3 = this.logoUrl.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> list = this.capabilities;
            int hashCode4 = list == null ? 0 : list.hashCode();
            java.lang.Integer num = this.codeValidTimeInMinutes;
            int hashCode5 = num == null ? 0 : num.hashCode();
            java.util.List<java.lang.String> list2 = this.tags;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + this.fee.hashCode()) * 31) + this.partner.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item item = (com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, item.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, item.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.capabilities, item.capabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeValidTimeInMinutes, item.codeValidTimeInMinutes) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, item.tags) && kotlin.jvm.internal.Intrinsics.areEqual(this.fee, item.fee) && kotlin.jvm.internal.Intrinsics.areEqual(this.partner, item.partner);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item copy(java.lang.String id, java.lang.String name2, java.lang.Object logoUrl, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> capabilities, java.lang.Integer codeValidTimeInMinutes, java.util.List<java.lang.String> tags, com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee fee, com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner partner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fee, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partner, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item(id, name2, logoUrl, capabilities, codeValidTimeInMinutes, tags, fee, partner);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner getPartner() {
            return this.partner;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee getFee() {
            return this.fee;
        }

        public final java.util.List<java.lang.String> component6() {
            return this.tags;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Integer getCodeValidTimeInMinutes() {
            return this.codeValidTimeInMinutes;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> component4() {
            return this.capabilities;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Fee;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Fee;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee fee = (com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, fee.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, fee.value);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee fee, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = fee.currencyCode;
            }
            if ((i & 2) != 0) {
                str = fee.value;
            }
            return fee.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Partner;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Partner;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner) other).id);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Partner partner, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = partner.id;
            }
            return partner.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCashInRetailers($input: CashInRetailersInput!) { cashInRetailers(input: $input) { page { items { id name logoUrl capabilities codeValidTimeInMinutes tags fee { currencyCode value } partner { id } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CashInRetailersInput cashInRetailersInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCashInRetailersQuery(input=");
        sb.append(cashInRetailersInput);
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
        return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery) other).input);
    }

    public final com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery copy(com.paypal.oslo.api.graphql.schema.type.CashInRetailersInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CashInRetailersInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery getCashInRetailersQuery, com.paypal.oslo.api.graphql.schema.type.CashInRetailersInput cashInRetailersInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cashInRetailersInput = getCashInRetailersQuery.input;
        }
        return getCashInRetailersQuery.copy(cashInRetailersInput);
    }
}
