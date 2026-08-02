package com.paypal.oslo.feature.bnplacquisition.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;", "getInput", "Companion", "Data", "BnplPlans", "Page", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetBnplPlansQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Data> {
    public static final java.lang.String OPERATION_ID = "7ca53b7a26b5208312d408a08908428671f300ec455020c7d5b8a281237cf9fa";
    public static final java.lang.String OPERATION_NAME = "GetBnplPlans";
    private final com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Companion(null);
    public static final int $stable = 8;

    public GetBnplPlansQuery(com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput bNPLPlansInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLPlansInput, "");
        this.input = bNPLPlansInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput getInput() {
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
        com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplPlansQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplPlansQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplacquisition.graphql.selections.GetBnplPlansQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$BnplPlans;", "bnplPlans", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$BnplPlans;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$BnplPlans;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$BnplPlans;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$BnplPlans;", "getBnplPlans"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans bnplPlans;

        public Data(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans bnplPlans) {
            this.bnplPlans = bnplPlans;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans getBnplPlans() {
            return this.bnplPlans;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans bnplPlans = this.bnplPlans;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(bnplPlans=");
            sb.append(bnplPlans);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans bnplPlans = this.bnplPlans;
            if (bnplPlans == null) {
                return 0;
            }
            return bnplPlans.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplPlans, ((com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Data) other).bnplPlans);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Data copy(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans bnplPlans) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Data(bnplPlans);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans getBnplPlans() {
            return this.bnplPlans;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Data copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Data data, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans bnplPlans, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bnplPlans = data.bnplPlans;
            }
            return data.copy(bnplPlans);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$BnplPlans;", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Page;", "page", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Page;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Page;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Page;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$BnplPlans;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Page;", "getPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BnplPlans {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page page;

        public BnplPlans(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page getPage() {
            return this.page;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page page = this.page;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplPlans(page=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans) other).page);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans copy(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans(page);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans bnplPlans, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page page, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = bnplPlans.page;
            }
            return bnplPlans.copy(page);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Page;", "", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Page;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item> items;

        public Page(java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item> list = this.items;
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page) other).items);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page copy(java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page(items);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Page page, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = page.items;
            }
            return page.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Item;", "", "creditAccountId", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.Object creditAccountId;

        public Item(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.creditAccountId = obj;
        }

        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(creditAccountId=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.creditAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ((com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item) other).creditAccountId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item copy(java.lang.Object creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item(creditAccountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item item, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = item.creditAccountId;
            }
            return item.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBnplPlans($input: BNPLPlansInput!) { bnplPlans(input: $input) { page { items { creditAccountId } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput bNPLPlansInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetBnplPlansQuery(input=");
        sb.append(bNPLPlansInput);
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
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery) other).input);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery copy(com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery getBnplPlansQuery, com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput bNPLPlansInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bNPLPlansInput = getBnplPlansQuery.input;
        }
        return getBnplPlansQuery.copy(bNPLPlansInput);
    }
}
