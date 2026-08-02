package com.paypal.oslo.feature.directdeposit.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007*+,-./)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountsInput;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountsInput;", "getInput", "Companion", "Data", "VirtualBankAccounts", "Page", "Item", "Issuer", "DirectDebit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetVirtualBankAccountsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "085deece63aee2597efe63a7f7ef713de1bb19987e48d285a956eafe47e22523";
    public static final java.lang.String OPERATION_NAME = "GetVirtualBankAccounts";
    private final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Companion INSTANCE = new com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Companion(null);
    public static final int $stable = 8;

    public GetVirtualBankAccountsQuery(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput virtualBankAccountsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccountsInput, "");
        this.input = virtualBankAccountsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput getInput() {
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
        com.paypal.oslo.feature.directdeposit.graphql.adapter.GetVirtualBankAccountsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.directdeposit.graphql.adapter.GetVirtualBankAccountsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.directdeposit.graphql.selections.GetVirtualBankAccountsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$VirtualBankAccounts;", "virtualBankAccounts", "<init>", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$VirtualBankAccounts;)V", "component1", "()Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$VirtualBankAccounts;", "copy", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$VirtualBankAccounts;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$VirtualBankAccounts;", "getVirtualBankAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts;

        public Data(com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccounts, "");
            this.virtualBankAccounts = virtualBankAccounts;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts getVirtualBankAccounts() {
            return this.virtualBankAccounts;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts = this.virtualBankAccounts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(virtualBankAccounts=");
            sb.append(virtualBankAccounts);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.virtualBankAccounts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.virtualBankAccounts, ((com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data) other).virtualBankAccounts);
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data copy(com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccounts, "");
            return new com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data(virtualBankAccounts);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts getVirtualBankAccounts() {
            return this.virtualBankAccounts;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data data, com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                virtualBankAccounts = data.virtualBankAccounts;
            }
            return data.copy(virtualBankAccounts);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$VirtualBankAccounts;", "", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Page;", "page", "<init>", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Page;)V", "component1", "()Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Page;", "copy", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Page;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$VirtualBankAccounts;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Page;", "getPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VirtualBankAccounts {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page page;

        public VirtualBankAccounts(com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page getPage() {
            return this.page;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page page = this.page;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualBankAccounts(page=");
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
            return (other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts) other).page);
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts copy(com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts(page);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts, com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page page, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = virtualBankAccounts.page;
            }
            return virtualBankAccounts.copy(page);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Page;", "", "", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Page;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item> items;

        public Page(java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item> list = this.items;
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
            return (other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page) other).items);
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page copy(java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page(items);
        }

        public final java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Page page, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = page.items;
            }
            return page.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u001a\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJx\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0013R$\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Item;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountStatus;", "status", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "bankAccountNumber", "routingNumber", "", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountCapability;", "capabilities", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Issuer;", "issuer", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$DirectDebit;", "directDebit", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Issuer;Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$DirectDebit;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountStatus;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Issuer;", "component8", "()Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$DirectDebit;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Issuer;Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$DirectDebit;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountStatus;", "getStatus", "getProductName", "getBankAccountNumber", "getRoutingNumber", "Ljava/util/List;", "getCapabilities", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Issuer;", "getIssuer", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$DirectDebit;", "getDirectDebit"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String bankAccountNumber;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountCapability> capabilities;
        private final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit directDebit;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer issuer;
        private final java.lang.String productName;
        private final java.lang.String routingNumber;
        private final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus status;

        /* JADX WARN: Multi-variable type inference failed */
        public Item(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus virtualBankAccountStatus, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountCapability> list, com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer issuer, com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit directDebit) {
            this.id = str;
            this.status = virtualBankAccountStatus;
            this.productName = str2;
            this.bankAccountNumber = str3;
            this.routingNumber = str4;
            this.capabilities = list;
            this.issuer = issuer;
            this.directDebit = directDebit;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getProductName() {
            return this.productName;
        }

        public final java.lang.String getBankAccountNumber() {
            return this.bankAccountNumber;
        }

        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountCapability> getCapabilities() {
            return this.capabilities;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer getIssuer() {
            return this.issuer;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit getDirectDebit() {
            return this.directDebit;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus virtualBankAccountStatus = this.status;
            java.lang.String str2 = this.productName;
            java.lang.String str3 = this.bankAccountNumber;
            java.lang.String str4 = this.routingNumber;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountCapability> list = this.capabilities;
            com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer issuer = this.issuer;
            com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit directDebit = this.directDebit;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", status=");
            sb.append(virtualBankAccountStatus);
            sb.append(", productName=");
            sb.append(str2);
            sb.append(", bankAccountNumber=");
            sb.append(str3);
            sb.append(", routingNumber=");
            sb.append(str4);
            sb.append(", capabilities=");
            sb.append(list);
            sb.append(", issuer=");
            sb.append(issuer);
            sb.append(", directDebit=");
            sb.append(directDebit);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus virtualBankAccountStatus = this.status;
            int hashCode2 = virtualBankAccountStatus == null ? 0 : virtualBankAccountStatus.hashCode();
            java.lang.String str2 = this.productName;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.bankAccountNumber;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.routingNumber;
            int hashCode5 = str4 == null ? 0 : str4.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountCapability> list = this.capabilities;
            int hashCode6 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer issuer = this.issuer;
            int hashCode7 = issuer == null ? 0 : issuer.hashCode();
            com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit directDebit = this.directDebit;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (directDebit != null ? directDebit.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item item = (com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && this.status == item.status && kotlin.jvm.internal.Intrinsics.areEqual(this.productName, item.productName) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountNumber, item.bankAccountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, item.routingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.capabilities, item.capabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, item.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.directDebit, item.directDebit);
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus status, java.lang.String productName, java.lang.String bankAccountNumber, java.lang.String routingNumber, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountCapability> capabilities, com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer issuer, com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit directDebit) {
            return new com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item(id, status, productName, bankAccountNumber, routingNumber, capabilities, issuer, directDebit);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit getDirectDebit() {
            return this.directDebit;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer getIssuer() {
            return this.issuer;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountCapability> component6() {
            return this.capabilities;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getBankAccountNumber() {
            return this.bankAccountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProductName() {
            return this.productName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Issuer;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Issuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer {
        public static final int $stable = 0;
        private final java.lang.String name;

        public Issuer(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer) other).name);
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer issuer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer.name;
            }
            return issuer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$DirectDebit;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DirectDebitStatus;", "status", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DirectDebitStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DirectDebitStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DirectDebitStatus;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$DirectDebit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DirectDebitStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DirectDebit {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus status;

        public DirectDebit(com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus directDebitStatus) {
            this.status = directDebitStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus directDebitStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DirectDebit(status=");
            sb.append(directDebitStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus directDebitStatus = this.status;
            if (directDebitStatus == null) {
                return 0;
            }
            return directDebitStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit) && this.status == ((com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit) other).status;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit copy(com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus status) {
            return new com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit(status);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit directDebit, com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus directDebitStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                directDebitStatus = directDebit.status;
            }
            return directDebit.copy(directDebitStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetVirtualBankAccounts($input: VirtualBankAccountsInput!) { virtualBankAccounts(input: $input) { page { items { id status productName bankAccountNumber routingNumber capabilities issuer { name } directDebit { status } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput virtualBankAccountsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetVirtualBankAccountsQuery(input=");
        sb.append(virtualBankAccountsInput);
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
        return (other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery) other).input);
    }

    public final com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery copy(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery getVirtualBankAccountsQuery, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput virtualBankAccountsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            virtualBankAccountsInput = getVirtualBankAccountsQuery.input;
        }
        return getVirtualBankAccountsQuery.copy(virtualBankAccountsInput);
    }
}
