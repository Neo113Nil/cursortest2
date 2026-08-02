package com.paypal.oslo.feature.shoppingrewards.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006*+,-.)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;", "getInput", "Companion", "Data", "PromotionOffers", "Item", "UserRewardSummary", "Progress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetOfferDetailsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "2d546c668c1a8b7398370928b13e6d2d673de635b30ee701bac91c7811b0f009";
    public static final java.lang.String OPERATION_NAME = "GetOfferDetails";
    private final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Companion(null);
    public static final int $stable = 8;

    public GetOfferDetailsQuery(com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput) {
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
        com.paypal.oslo.feature.shoppingrewards.graphql.adapter.GetOfferDetailsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.shoppingrewards.graphql.adapter.GetOfferDetailsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.shoppingrewards.graphql.selections.GetOfferDetailsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$PromotionOffers;", "promotionOffers", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$PromotionOffers;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$PromotionOffers;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$PromotionOffers;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$PromotionOffers;", "getPromotionOffers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers promotionOffers;

        public Data(com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers promotionOffers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOffers, "");
            this.promotionOffers = promotionOffers;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers getPromotionOffers() {
            return this.promotionOffers;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers promotionOffers = this.promotionOffers;
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
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.promotionOffers, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data) other).promotionOffers);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data copy(com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers promotionOffers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOffers, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data(promotionOffers);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers getPromotionOffers() {
            return this.promotionOffers;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data data, com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers promotionOffers, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                promotionOffers = data.promotionOffers;
            }
            return data.copy(promotionOffers);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$PromotionOffers;", "", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$PromotionOffers;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PromotionOffers {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item> items;

        public PromotionOffers(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item> list = this.items;
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
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers) other).items);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers(items);
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.PromotionOffers promotionOffers, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = promotionOffers.items;
            }
            return promotionOffers.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JV\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Item;", "", "", "__typename", "id", "externalId", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$UserRewardSummary;", "userRewardSummary", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment;", "offerDetailsFragment", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/UserEnrollmentsFragment;", "userEnrollmentsFragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/UserEnrollmentsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment;", "component6", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/UserEnrollmentsFragment;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/UserEnrollmentsFragment;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getId", "getExternalId", "Ljava/util/List;", "getUserRewardSummary", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment;", "getOfferDetailsFragment", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/UserEnrollmentsFragment;", "getUserEnrollmentsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String externalId;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment offerDetailsFragment;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment userEnrollmentsFragment;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary> userRewardSummary;

        public Item(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary> list, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment offerDetailsFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment userEnrollmentsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsFragment, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEnrollmentsFragment, "");
            this.__typename = str;
            this.id = str2;
            this.externalId = str3;
            this.userRewardSummary = list;
            this.offerDetailsFragment = offerDetailsFragment;
            this.userEnrollmentsFragment = userEnrollmentsFragment;
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

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary> getUserRewardSummary() {
            return this.userRewardSummary;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment getOfferDetailsFragment() {
            return this.offerDetailsFragment;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment getUserEnrollmentsFragment() {
            return this.userEnrollmentsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.id;
            java.lang.String str3 = this.externalId;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary> list = this.userRewardSummary;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment offerDetailsFragment = this.offerDetailsFragment;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment userEnrollmentsFragment = this.userEnrollmentsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", id=");
            sb.append(str2);
            sb.append(", externalId=");
            sb.append(str3);
            sb.append(", userRewardSummary=");
            sb.append(list);
            sb.append(", offerDetailsFragment=");
            sb.append(offerDetailsFragment);
            sb.append(", userEnrollmentsFragment=");
            sb.append(userEnrollmentsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            int hashCode2 = this.id.hashCode();
            java.lang.String str = this.externalId;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary> list = this.userRewardSummary;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.offerDetailsFragment.hashCode()) * 31) + this.userEnrollmentsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item item = (com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalId, item.externalId) && kotlin.jvm.internal.Intrinsics.areEqual(this.userRewardSummary, item.userRewardSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsFragment, item.offerDetailsFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.userEnrollmentsFragment, item.userEnrollmentsFragment);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item copy(java.lang.String __typename, java.lang.String id, java.lang.String externalId, java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary> userRewardSummary, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment offerDetailsFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment userEnrollmentsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsFragment, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEnrollmentsFragment, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item(__typename, id, externalId, userRewardSummary, offerDetailsFragment, userEnrollmentsFragment);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment getUserEnrollmentsFragment() {
            return this.userEnrollmentsFragment;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment getOfferDetailsFragment() {
            return this.offerDetailsFragment;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary> component4() {
            return this.userRewardSummary;
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

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item item, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment offerDetailsFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment userEnrollmentsFragment, int i, java.lang.Object obj) {
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
                list = item.userRewardSummary;
            }
            java.util.List list2 = list;
            if ((i & 16) != 0) {
                offerDetailsFragment = item.offerDetailsFragment;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment offerDetailsFragment2 = offerDetailsFragment;
            if ((i & 32) != 0) {
                userEnrollmentsFragment = item.userEnrollmentsFragment;
            }
            return item.copy(str, str4, str5, list2, offerDetailsFragment2, userEnrollmentsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$UserRewardSummary;", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Progress;", "progress", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Progress;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Progress;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Progress;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$UserRewardSummary;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Progress;", "getProgress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserRewardSummary {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress progress;

        public UserRewardSummary(com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress progress) {
            this.progress = progress;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress getProgress() {
            return this.progress;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress progress = this.progress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserRewardSummary(progress=");
            sb.append(progress);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress progress = this.progress;
            if (progress == null) {
                return 0;
            }
            return progress.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.progress, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary) other).progress);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary copy(com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress progress) {
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary(progress);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress getProgress() {
            return this.progress;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary userRewardSummary, com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress progress, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                progress = userRewardSummary.progress;
            }
            return userRewardSummary.copy(progress);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Progress;", "", "", "__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/DiscreteRewardSummaryProgressFragment;", "discreteRewardSummaryProgressFragment", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ContinuousRewardSummaryProgressFragment;", "continuousRewardSummaryProgressFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/DiscreteRewardSummaryProgressFragment;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ContinuousRewardSummaryProgressFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/DiscreteRewardSummaryProgressFragment;", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ContinuousRewardSummaryProgressFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/DiscreteRewardSummaryProgressFragment;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ContinuousRewardSummaryProgressFragment;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Progress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/DiscreteRewardSummaryProgressFragment;", "getDiscreteRewardSummaryProgressFragment", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ContinuousRewardSummaryProgressFragment;", "getContinuousRewardSummaryProgressFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Progress {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ContinuousRewardSummaryProgressFragment continuousRewardSummaryProgressFragment;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment discreteRewardSummaryProgressFragment;

        public Progress(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment discreteRewardSummaryProgressFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ContinuousRewardSummaryProgressFragment continuousRewardSummaryProgressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(discreteRewardSummaryProgressFragment, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuousRewardSummaryProgressFragment, "");
            this.__typename = str;
            this.discreteRewardSummaryProgressFragment = discreteRewardSummaryProgressFragment;
            this.continuousRewardSummaryProgressFragment = continuousRewardSummaryProgressFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment getDiscreteRewardSummaryProgressFragment() {
            return this.discreteRewardSummaryProgressFragment;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ContinuousRewardSummaryProgressFragment getContinuousRewardSummaryProgressFragment() {
            return this.continuousRewardSummaryProgressFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment discreteRewardSummaryProgressFragment = this.discreteRewardSummaryProgressFragment;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ContinuousRewardSummaryProgressFragment continuousRewardSummaryProgressFragment = this.continuousRewardSummaryProgressFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progress(__typename=");
            sb.append(str);
            sb.append(", discreteRewardSummaryProgressFragment=");
            sb.append(discreteRewardSummaryProgressFragment);
            sb.append(", continuousRewardSummaryProgressFragment=");
            sb.append(continuousRewardSummaryProgressFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.__typename.hashCode() * 31) + this.discreteRewardSummaryProgressFragment.hashCode()) * 31) + this.continuousRewardSummaryProgressFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress progress = (com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, progress.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.discreteRewardSummaryProgressFragment, progress.discreteRewardSummaryProgressFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.continuousRewardSummaryProgressFragment, progress.continuousRewardSummaryProgressFragment);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress copy(java.lang.String __typename, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment discreteRewardSummaryProgressFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ContinuousRewardSummaryProgressFragment continuousRewardSummaryProgressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(discreteRewardSummaryProgressFragment, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuousRewardSummaryProgressFragment, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress(__typename, discreteRewardSummaryProgressFragment, continuousRewardSummaryProgressFragment);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ContinuousRewardSummaryProgressFragment getContinuousRewardSummaryProgressFragment() {
            return this.continuousRewardSummaryProgressFragment;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment getDiscreteRewardSummaryProgressFragment() {
            return this.discreteRewardSummaryProgressFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress progress, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment discreteRewardSummaryProgressFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ContinuousRewardSummaryProgressFragment continuousRewardSummaryProgressFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = progress.__typename;
            }
            if ((i & 2) != 0) {
                discreteRewardSummaryProgressFragment = progress.discreteRewardSummaryProgressFragment;
            }
            if ((i & 4) != 0) {
                continuousRewardSummaryProgressFragment = progress.continuousRewardSummaryProgressFragment;
            }
            return progress.copy(str, discreteRewardSummaryProgressFragment, continuousRewardSummaryProgressFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetOfferDetails($input: PromotionOffersInput!) { promotionOffers(input: $input) { items { __typename id externalId userRewardSummary { progress { __typename ...DiscreteRewardSummaryProgressFragment ...ContinuousRewardSummaryProgressFragment } } ...OfferDetailsFragment ...UserEnrollmentsFragment } } }  fragment DiscreteRewardSummaryProgressFragment on PromotionOfferUserRewardSummaryProgress { transactionCountRemaining transactionCountCompleted }  fragment ContinuousRewardSummaryProgressFragment on PromotionOfferUserRewardSummaryProgress { percentRemaining percentCompleted }  fragment OfferDetailsFragment on PromotionOffer { presentmentAssets { __typename ... on PromotionOfferEducationHalfSheet { title subtitle detailsText detailsIcons termsText termsUrl termsUrls eligibleCtaText activatedCtaText activatedCtaUrl activatedProgressBarType merchantLogoUrl } } }  fragment UserEnrollmentsFragment on PromotionOffer { userEnrollments { status expiryTime } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetOfferDetailsQuery(input=");
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
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery) other).input);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery copy(com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery getOfferDetailsQuery, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            promotionOffersInput = getOfferDetailsQuery.input;
        }
        return getOfferDetailsQuery.copy(promotionOffersInput);
    }
}
