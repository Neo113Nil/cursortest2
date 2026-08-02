package com.paypal.oslo.feature.shoppingrewards.graphql;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005+,-.*B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Data;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CharitiesInput;", "input", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getInput", "Companion", "Data", "Charities", "Page", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetCharitiesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "b473730779eb00e1a6a6c43cd21931b1b8e3a85b00d9d3c4b2a9dbdf424b02b5";
    public static final java.lang.String OPERATION_NAME = "GetCharities";
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CharitiesInput> input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Companion(null);
    public static final int $stable = 8;

    public GetCharitiesQuery(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CharitiesInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.input = optional;
    }

    public /* synthetic */ GetCharitiesQuery(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CharitiesInput> getInput() {
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
        com.paypal.oslo.feature.shoppingrewards.graphql.adapter.GetCharitiesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.shoppingrewards.graphql.adapter.GetCharitiesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.shoppingrewards.graphql.selections.GetCharitiesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Charities;", "charities", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Charities;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Charities;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Charities;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Charities;", "getCharities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities charities;

        public Data(com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities charities) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charities, "");
            this.charities = charities;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities getCharities() {
            return this.charities;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities charities = this.charities;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(charities=");
            sb.append(charities);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.charities.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.charities, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Data) other).charities);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Data copy(com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities charities) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charities, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Data(charities);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities getCharities() {
            return this.charities;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Data copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Data data, com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities charities, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                charities = data.charities;
            }
            return data.copy(charities);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Charities;", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Page;", "page", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Page;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Page;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Page;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Charities;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Page;", "getPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Charities {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page page;

        public Charities(com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page getPage() {
            return this.page;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page page = this.page;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Charities(page=");
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
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities) other).page);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities copy(com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities(page);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities charities, com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page page, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = charities.page;
            }
            return charities.copy(page);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Page;", "", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Page;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item> items;

        public Page(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item> list = this.items;
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
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page) other).items);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page(items);
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page page, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = page.items;
            }
            return page.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Item;", "", "", "id", "name", "logoUrl", "", "isFavorite", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Item;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Object;", "getLogoUrl", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final boolean isFavorite;
        private final java.lang.Object logoUrl;
        private final java.lang.String name;

        public Item(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.name = str2;
            this.logoUrl = obj;
            this.isFavorite = z;
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

        public final boolean isFavorite() {
            return this.isFavorite;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.Object obj = this.logoUrl;
            boolean z = this.isFavorite;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(", isFavorite=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.Object obj = this.logoUrl;
            return (((((hashCode * 31) + hashCode2) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isFavorite);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item item = (com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, item.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, item.logoUrl) && this.isFavorite == item.isFavorite;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item copy(java.lang.String id, java.lang.String name2, java.lang.Object logoUrl, boolean isFavorite) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item(id, name2, logoUrl, isFavorite);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsFavorite() {
            return this.isFavorite;
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

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item item, java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                str2 = item.name;
            }
            if ((i & 4) != 0) {
                obj = item.logoUrl;
            }
            if ((i & 8) != 0) {
                z = item.isFavorite;
            }
            return item.copy(str, str2, obj, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCharities($input: CharitiesInput) { charities(input: $input) { page { items { id name logoUrl isFavorite } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CharitiesInput> optional = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCharitiesQuery(input=");
        sb.append(optional);
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
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery) other).input);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CharitiesInput> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery(input);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CharitiesInput> component1() {
        return this.input;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery getCharitiesQuery, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = getCharitiesQuery.input;
        }
        return getCharitiesQuery.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCharitiesQuery() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
