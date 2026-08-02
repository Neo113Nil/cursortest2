package com.paypal.oslo.feature.merchantbanking.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountsInput;)Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountsInput;", "getInput", "Companion", "Data", "VirtualBankAccounts", "Page", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class VirtualBankAccountsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "8d53ec2726276bb0560e096173366206c0f76088628cc55c9755f9bcaa465bc9";
    public static final java.lang.String OPERATION_NAME = "VirtualBankAccountsQuery";
    private final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Companion INSTANCE = new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Companion(null);
    public static final int $stable = 8;

    public VirtualBankAccountsQuery(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput virtualBankAccountsInput) {
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
        com.paypal.oslo.feature.merchantbanking.graphql.adapter.VirtualBankAccountsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.merchantbanking.graphql.adapter.VirtualBankAccountsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.merchantbanking.graphql.selections.VirtualBankAccountsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$VirtualBankAccounts;", "virtualBankAccounts", "<init>", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$VirtualBankAccounts;)V", "component1", "()Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$VirtualBankAccounts;", "copy", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$VirtualBankAccounts;)Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$VirtualBankAccounts;", "getVirtualBankAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts;

        public Data(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccounts, "");
            this.virtualBankAccounts = virtualBankAccounts;
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts getVirtualBankAccounts() {
            return this.virtualBankAccounts;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts = this.virtualBankAccounts;
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
            return (other instanceof com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.virtualBankAccounts, ((com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data) other).virtualBankAccounts);
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data copy(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccounts, "");
            return new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data(virtualBankAccounts);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts getVirtualBankAccounts() {
            return this.virtualBankAccounts;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data copy$default(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data data, com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                virtualBankAccounts = data.virtualBankAccounts;
            }
            return data.copy(virtualBankAccounts);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$VirtualBankAccounts;", "", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Page;", "page", "<init>", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Page;)V", "component1", "()Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Page;", "copy", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Page;)Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$VirtualBankAccounts;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Page;", "getPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VirtualBankAccounts {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page page;

        public VirtualBankAccounts(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page getPage() {
            return this.page;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page page = this.page;
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
            return (other instanceof com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts) other).page);
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts copy(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts(page);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts copy$default(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts, com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page page, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = virtualBankAccounts.page;
            }
            return virtualBankAccounts.copy(page);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Page;", "", "", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Page;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item> items;

        public Page(java.util.List<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item> list = this.items;
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
            return (other instanceof com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page) other).items);
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page copy(java.util.List<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page(items);
        }

        public final java.util.List<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page copy$default(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Page page, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = page.items;
            }
            return page.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Item;", "", "", "bankAccountNumber", "routingNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBankAccountNumber", "getRoutingNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final java.lang.String bankAccountNumber;
        private final java.lang.String routingNumber;

        public Item(java.lang.String str, java.lang.String str2) {
            this.bankAccountNumber = str;
            this.routingNumber = str2;
        }

        public final java.lang.String getBankAccountNumber() {
            return this.bankAccountNumber;
        }

        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bankAccountNumber;
            java.lang.String str2 = this.routingNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(bankAccountNumber=");
            sb.append(str);
            sb.append(", routingNumber=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.bankAccountNumber;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.routingNumber;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item item = (com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountNumber, item.bankAccountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, item.routingNumber);
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item copy(java.lang.String bankAccountNumber, java.lang.String routingNumber) {
            return new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item(bankAccountNumber, routingNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBankAccountNumber() {
            return this.bankAccountNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item copy$default(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item item, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.bankAccountNumber;
            }
            if ((i & 2) != 0) {
                str2 = item.routingNumber;
            }
            return item.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query VirtualBankAccountsQuery($input: VirtualBankAccountsInput!) { virtualBankAccounts(input: $input) { page { items { bankAccountNumber routingNumber } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput virtualBankAccountsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualBankAccountsQuery(input=");
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
        return (other instanceof com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery) other).input);
    }

    public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery copy(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery copy$default(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery virtualBankAccountsQuery, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput virtualBankAccountsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            virtualBankAccountsInput = virtualBankAccountsQuery.input;
        }
        return virtualBankAccountsQuery.copy(virtualBankAccountsInput);
    }
}
