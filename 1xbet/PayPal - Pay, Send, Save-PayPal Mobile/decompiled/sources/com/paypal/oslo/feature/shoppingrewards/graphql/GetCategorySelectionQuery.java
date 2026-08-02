package com.paypal.oslo.feature.shoppingrewards.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;", "getInput", "Companion", "Data", "PromotionOffers", "Item", "UserEnrollment"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetCategorySelectionQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Data> {
    public static final java.lang.String OPERATION_ID = "d3cfb2bf5c3b44fd24d247a9056e9eecc0f4c3451fb6290fb24ff1200802e367";
    public static final java.lang.String OPERATION_NAME = "GetCategorySelection";
    private final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Companion(null);
    public static final int $stable = 8;

    public GetCategorySelectionQuery(com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOffersInput, "");
        this.input = promotionOffersInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput getInput() {
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
        com.paypal.oslo.feature.shoppingrewards.graphql.adapter.GetCategorySelectionQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.shoppingrewards.graphql.adapter.GetCategorySelectionQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.shoppingrewards.graphql.selections.GetCategorySelectionQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$PromotionOffers;", "promotionOffers", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$PromotionOffers;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$PromotionOffers;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$PromotionOffers;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$PromotionOffers;", "getPromotionOffers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers promotionOffers;

        public Data(com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers promotionOffers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOffers, "");
            this.promotionOffers = promotionOffers;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers getPromotionOffers() {
            return this.promotionOffers;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers promotionOffers = this.promotionOffers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(promotionOffers=");
            sb.append(promotionOffers);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.promotionOffers.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.promotionOffers, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Data) other).promotionOffers);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Data copy(com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers promotionOffers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOffers, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Data(promotionOffers);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers getPromotionOffers() {
            return this.promotionOffers;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Data copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Data data, com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers promotionOffers, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                promotionOffers = data.promotionOffers;
            }
            return data.copy(promotionOffers);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$PromotionOffers;", "", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$PromotionOffers;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PromotionOffers {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item> items;

        public PromotionOffers(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PromotionOffers(items=");
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
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers) other).items);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers(items);
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.PromotionOffers promotionOffers, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = promotionOffers.items;
            }
            return promotionOffers.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JV\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$Item;", "", "", "__typename", "id", "externalId", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$UserEnrollment;", "userEnrollments", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment;", "categorySelectionPresentmentFragment", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;", "categoryDetailsPresentmentFragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment;", "component6", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getId", "getExternalId", "Ljava/util/List;", "getUserEnrollments", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment;", "getCategorySelectionPresentmentFragment", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;", "getCategoryDetailsPresentmentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment categorySelectionPresentmentFragment;
        private final java.lang.String externalId;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment> userEnrollments;

        public Item(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment> list, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment categorySelectionPresentmentFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionPresentmentFragment, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryDetailsPresentmentFragment, "");
            this.__typename = str;
            this.id = str2;
            this.externalId = str3;
            this.userEnrollments = list;
            this.categorySelectionPresentmentFragment = categorySelectionPresentmentFragment;
            this.categoryDetailsPresentmentFragment = categoryDetailsPresentmentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getExternalId() {
            return this.externalId;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment> getUserEnrollments() {
            return this.userEnrollments;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment getCategorySelectionPresentmentFragment() {
            return this.categorySelectionPresentmentFragment;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment getCategoryDetailsPresentmentFragment() {
            return this.categoryDetailsPresentmentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.id;
            java.lang.String str3 = this.externalId;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment> list = this.userEnrollments;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment categorySelectionPresentmentFragment = this.categorySelectionPresentmentFragment;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment = this.categoryDetailsPresentmentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", id=");
            sb.append(str2);
            sb.append(", externalId=");
            sb.append(str3);
            sb.append(", userEnrollments=");
            sb.append(list);
            sb.append(", categorySelectionPresentmentFragment=");
            sb.append(categorySelectionPresentmentFragment);
            sb.append(", categoryDetailsPresentmentFragment=");
            sb.append(categoryDetailsPresentmentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            int hashCode2 = this.id.hashCode();
            java.lang.String str = this.externalId;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment> list = this.userEnrollments;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.categorySelectionPresentmentFragment.hashCode()) * 31) + this.categoryDetailsPresentmentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item item = (com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalId, item.externalId) && kotlin.jvm.internal.Intrinsics.areEqual(this.userEnrollments, item.userEnrollments) && kotlin.jvm.internal.Intrinsics.areEqual(this.categorySelectionPresentmentFragment, item.categorySelectionPresentmentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.categoryDetailsPresentmentFragment, item.categoryDetailsPresentmentFragment);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item copy(java.lang.String __typename, java.lang.String id, java.lang.String externalId, java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment> userEnrollments, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment categorySelectionPresentmentFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionPresentmentFragment, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryDetailsPresentmentFragment, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item(__typename, id, externalId, userEnrollments, categorySelectionPresentmentFragment, categoryDetailsPresentmentFragment);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment getCategoryDetailsPresentmentFragment() {
            return this.categoryDetailsPresentmentFragment;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment getCategorySelectionPresentmentFragment() {
            return this.categorySelectionPresentmentFragment;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment> component4() {
            return this.userEnrollments;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExternalId() {
            return this.externalId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item item, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment categorySelectionPresentmentFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                str2 = item.id;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = item.externalId;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                list = item.userEnrollments;
            }
            java.util.List list2 = list;
            if ((i & 16) != 0) {
                categorySelectionPresentmentFragment = item.categorySelectionPresentmentFragment;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment categorySelectionPresentmentFragment2 = categorySelectionPresentmentFragment;
            if ((i & 32) != 0) {
                categoryDetailsPresentmentFragment = item.categoryDetailsPresentmentFragment;
            }
            return item.copy(str, str4, str5, list2, categorySelectionPresentmentFragment2, categoryDetailsPresentmentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$UserEnrollment;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;", "status", "expiryTime", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$UserEnrollment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;", "getStatus", "Ljava/lang/Object;", "getExpiryTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserEnrollment {
        public static final int $stable = 8;
        private final java.lang.Object expiryTime;
        private final com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus status;

        public UserEnrollment(com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus promotionOfferEnrollmentStatus, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOfferEnrollmentStatus, "");
            this.status = promotionOfferEnrollmentStatus;
            this.expiryTime = obj;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus getStatus() {
            return this.status;
        }

        public final java.lang.Object getExpiryTime() {
            return this.expiryTime;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus promotionOfferEnrollmentStatus = this.status;
            java.lang.Object obj = this.expiryTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserEnrollment(status=");
            sb.append(promotionOfferEnrollmentStatus);
            sb.append(", expiryTime=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            java.lang.Object obj = this.expiryTime;
            return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment userEnrollment = (com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment) other;
            return this.status == userEnrollment.status && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryTime, userEnrollment.expiryTime);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment copy(com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus status, java.lang.Object expiryTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment(status, expiryTime);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getExpiryTime() {
            return this.expiryTime;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment userEnrollment, com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus promotionOfferEnrollmentStatus, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                promotionOfferEnrollmentStatus = userEnrollment.status;
            }
            if ((i & 2) != 0) {
                obj = userEnrollment.expiryTime;
            }
            return userEnrollment.copy(promotionOfferEnrollmentStatus, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCategorySelection($input: PromotionOffersInput!) { promotionOffers(input: $input) { items { __typename id externalId userEnrollments { status expiryTime } ...CategorySelectionPresentmentFragment ...CategoryDetailsPresentmentFragment } } }  fragment CategorySelectionPresentmentFragment on PromotionOffer { presentmentAssets { __typename ... on RewardsCategoryOffer { cardPpuiToken cardCategoryName cardCategoryDescription offerDetailsTermsText offerDetailsTermsUrl } } }  fragment CategoryDetailsPresentmentFragment on PromotionOffer { presentmentAssets { __typename ... on RewardsCategoryOffer { offerDetailsHeroImageUrl offerDetailsOfferTitleText offerDetailsExpirationText offerDetailsPpuiTokens offerDetailsTexts offerDetailsSubtexts offerDetailsTermsText offerDetailsTermsUrl offerDetailsCtaText } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCategorySelectionQuery(input=");
        sb.append(promotionOffersInput);
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
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery) other).input);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery copy(com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery getCategorySelectionQuery, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            promotionOffersInput = getCategorySelectionQuery.input;
        }
        return getCategorySelectionQuery.copy(promotionOffersInput);
    }
}
