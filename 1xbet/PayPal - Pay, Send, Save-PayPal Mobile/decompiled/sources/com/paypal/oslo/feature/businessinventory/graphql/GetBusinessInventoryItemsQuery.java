package com.paypal.oslo.feature.businessinventory.graphql;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005+,-.*B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Data;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantSortingInput;", "input", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getInput", "Companion", "Data", "MerchantItem", "Price", "Tax"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetBusinessInventoryItemsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "08d1c0ca266821fb73ca80af00edee297da371149db122c9643dea5eb6c394eb";
    public static final java.lang.String OPERATION_NAME = "GetBusinessInventoryItems";
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Companion INSTANCE = new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Companion(null);
    public static final int $stable = 8;

    public GetBusinessInventoryItemsQuery(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.input = optional;
    }

    public /* synthetic */ GetBusinessInventoryItemsQuery(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> getInput() {
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
        com.paypal.oslo.feature.businessinventory.graphql.adapter.GetBusinessInventoryItemsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businessinventory.graphql.adapter.GetBusinessInventoryItemsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.businessinventory.graphql.selections.GetBusinessInventoryItemsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$MerchantItem;", "merchantItems", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMerchantItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem> merchantItems;

        public Data(java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem> list) {
            this.merchantItems = list;
        }

        public final java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem> getMerchantItems() {
            return this.merchantItems;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem> list = this.merchantItems;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(merchantItems=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem> list = this.merchantItems;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantItems, ((com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Data) other).merchantItems);
        }

        public final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Data copy(java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem> merchantItems) {
            return new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Data(merchantItems);
        }

        public final java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem> component1() {
            return this.merchantItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Data copy$default(com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.merchantItems;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JX\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$MerchantItem;", "", "", "id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemType;", "type", "Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Price;", "price", "", "Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Tax;", "taxes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemType;Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Price;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemType;", "component5", "()Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Price;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemType;Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Price;Ljava/util/List;)Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$MerchantItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getDescription", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemType;", "getType", "Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Price;", "getPrice", "Ljava/util/List;", "getTaxes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MerchantItem {
        public static final int $stable = 8;
        private final java.lang.String description;
        private final java.lang.String id;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price price;
        private final java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax> taxes;
        private final com.paypal.oslo.api.graphql.schema.type.MerchantItemType type;

        public MerchantItem(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.MerchantItemType merchantItemType, com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price price, java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(price, "");
            this.id = str;
            this.name = str2;
            this.description = str3;
            this.type = merchantItemType;
            this.price = price;
            this.taxes = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MerchantItemType getType() {
            return this.type;
        }

        public final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price getPrice() {
            return this.price;
        }

        public final java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax> getTaxes() {
            return this.taxes;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.description;
            com.paypal.oslo.api.graphql.schema.type.MerchantItemType merchantItemType = this.type;
            com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price price = this.price;
            java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax> list = this.taxes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantItem(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", description=");
            sb.append(str3);
            sb.append(", type=");
            sb.append(merchantItemType);
            sb.append(", price=");
            sb.append(price);
            sb.append(", taxes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.String str = this.description;
            int hashCode3 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.MerchantItemType merchantItemType = this.type;
            int hashCode4 = merchantItemType == null ? 0 : merchantItemType.hashCode();
            int hashCode5 = this.price.hashCode();
            java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax> list = this.taxes;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem)) {
                return false;
            }
            com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem merchantItem = (com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, merchantItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, merchantItem.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, merchantItem.description) && this.type == merchantItem.type && kotlin.jvm.internal.Intrinsics.areEqual(this.price, merchantItem.price) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxes, merchantItem.taxes);
        }

        public final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem copy(java.lang.String id, java.lang.String name2, java.lang.String description, com.paypal.oslo.api.graphql.schema.type.MerchantItemType type, com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price price, java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax> taxes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(price, "");
            return new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem(id, name2, description, type, price, taxes);
        }

        public final java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax> component6() {
            return this.taxes;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price getPrice() {
            return this.price;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MerchantItemType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem copy$default(com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem merchantItem, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.MerchantItemType merchantItemType, com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price price, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = merchantItem.id;
            }
            if ((i & 2) != 0) {
                str2 = merchantItem.name;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = merchantItem.description;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                merchantItemType = merchantItem.type;
            }
            com.paypal.oslo.api.graphql.schema.type.MerchantItemType merchantItemType2 = merchantItemType;
            if ((i & 16) != 0) {
                price = merchantItem.price;
            }
            com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price price2 = price;
            if ((i & 32) != 0) {
                list = merchantItem.taxes;
            }
            return merchantItem.copy(str, str4, str5, merchantItemType2, price2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Price;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Price;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Price {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Price(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Price(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price)) {
                return false;
            }
            com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price price = (com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, price.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, price.value);
        }

        public final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price copy$default(com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price price, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = price.currencyCode;
            }
            if ((i & 2) != 0) {
                str = price.value;
            }
            return price.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Tax;", "", "", "id", "name", "percent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Tax;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getPercent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Tax {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String name;
        private final java.lang.String percent;

        public Tax(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.id = str;
            this.name = str2;
            this.percent = str3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getPercent() {
            return this.percent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.percent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tax(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", percent=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.percent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax)) {
                return false;
            }
            com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax tax = (com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, tax.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, tax.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.percent, tax.percent);
        }

        public final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax copy(java.lang.String id, java.lang.String name2, java.lang.String percent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percent, "");
            return new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax(id, name2, percent);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPercent() {
            return this.percent;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax copy$default(com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax tax, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = tax.id;
            }
            if ((i & 2) != 0) {
                str2 = tax.name;
            }
            if ((i & 4) != 0) {
                str3 = tax.percent;
            }
            return tax.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBusinessInventoryItems($input: MerchantSortingInput) { merchantItems(input: $input) { id name description type price { currencyCode value } taxes { id name percent } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> optional = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetBusinessInventoryItemsQuery(input=");
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
        return (other instanceof com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery) other).input);
    }

    public final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery(input);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> component1() {
        return this.input;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery copy$default(com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery getBusinessInventoryItemsQuery, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = getBusinessInventoryItemsQuery.input;
        }
        return getBusinessInventoryItemsQuery.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetBusinessInventoryItemsQuery() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
