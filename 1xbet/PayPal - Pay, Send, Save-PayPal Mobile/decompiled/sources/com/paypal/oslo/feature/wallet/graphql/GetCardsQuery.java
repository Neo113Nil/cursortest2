package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CardsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CardsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CardsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CardsInput;)Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CardsInput;", "getInput", "Companion", "Data", "Cards", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GetCardsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "a54657ac4f84fcd09b2936556d1634e8ccfd87695c2bb923e89cc1c276f61f43";
    public static final java.lang.String OPERATION_NAME = "GetCards";
    private final com.paypal.oslo.api.graphql.schema.type.CardsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Companion(null);
    public static final int $stable = 8;

    public GetCardsQuery(com.paypal.oslo.api.graphql.schema.type.CardsInput cardsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardsInput, "");
        this.input = cardsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CardsInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.GetCardsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetCardsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetCardsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Cards;", "cards", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Cards;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Cards;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Cards;)Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Cards;", "getCards"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards cards;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards cards) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cards, "");
            this.cards = cards;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards getCards() {
            return this.cards;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards cards = this.cards;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(cards=");
            sb.append(cards);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cards.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.cards, ((com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Data) other).cards);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards cards) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cards, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Data(cards);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards getCards() {
            return this.cards;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards cards, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cards = data.cards;
            }
            return data.copy(cards);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Cards;", "", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Cards;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cards {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item> items;

        public Cards(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cards(items=");
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
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards) other).items);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards copy(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards(items);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards copy$default(com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards cards, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = cards.items;
            }
            return cards.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b-\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b.\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Item;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "brand", "nickName", "expirationDate", "addressId", "currencyCode", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "productClass", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "component4", "component5", "()Ljava/lang/Object;", "component6", "component7", "component8", "()Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;)Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "getBrand", "getNickName", "Ljava/lang/Object;", "getExpirationDate", "getAddressId", "getCurrencyCode", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "getProductClass"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String addressId;
        private final com.paypal.oslo.api.graphql.schema.type.CardBrand brand;
        private final java.lang.Object currencyCode;
        private final java.lang.Object expirationDate;
        private final java.lang.String id;
        private final java.lang.String lastNChars;
        private final java.lang.String nickName;
        private final com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass;

        public Item(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand, java.lang.String str3, java.lang.Object obj, java.lang.String str4, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
            this.id = str;
            this.lastNChars = str2;
            this.brand = cardBrand;
            this.nickName = str3;
            this.expirationDate = obj;
            this.addressId = str4;
            this.currencyCode = obj2;
            this.productClass = cardProductClass;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        public final java.lang.String getNickName() {
            return this.nickName;
        }

        public final java.lang.Object getExpirationDate() {
            return this.expirationDate;
        }

        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = this.brand;
            java.lang.String str3 = this.nickName;
            java.lang.Object obj = this.expirationDate;
            java.lang.String str4 = this.addressId;
            java.lang.Object obj2 = this.currencyCode;
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", brand=");
            sb.append(cardBrand);
            sb.append(", nickName=");
            sb.append(str3);
            sb.append(", expirationDate=");
            sb.append(obj);
            sb.append(", addressId=");
            sb.append(str4);
            sb.append(", currencyCode=");
            sb.append(obj2);
            sb.append(", productClass=");
            sb.append(cardProductClass);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            int hashCode3 = this.brand.hashCode();
            java.lang.String str = this.nickName;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.expirationDate;
            int hashCode5 = obj == null ? 0 : obj.hashCode();
            java.lang.String str2 = this.addressId;
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            java.lang.Object obj2 = this.currencyCode;
            int hashCode7 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (cardProductClass != null ? cardProductClass.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item item = (com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, item.lastNChars) && this.brand == item.brand && kotlin.jvm.internal.Intrinsics.areEqual(this.nickName, item.nickName) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, item.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, item.addressId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, item.currencyCode) && this.productClass == item.productClass;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.api.graphql.schema.type.CardBrand brand, java.lang.String nickName, java.lang.Object expirationDate, java.lang.String addressId, java.lang.Object currencyCode, com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item(id, lastNChars, brand, nickName, expirationDate, addressId, currencyCode, productClass);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getExpirationDate() {
            return this.expirationDate;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNickName() {
            return this.nickName;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetCardsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCards($input: CardsInput!) { cards(input: $input) { items { id lastNChars brand nickName expirationDate addressId currencyCode productClass } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CardsInput cardsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCardsQuery(input=");
        sb.append(cardsInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetCardsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.GetCardsQuery) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.GetCardsQuery copy(com.paypal.oslo.api.graphql.schema.type.CardsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.GetCardsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CardsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetCardsQuery copy$default(com.paypal.oslo.feature.wallet.graphql.GetCardsQuery getCardsQuery, com.paypal.oslo.api.graphql.schema.type.CardsInput cardsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardsInput = getCardsQuery.input;
        }
        return getCardsQuery.copy(cardsInput);
    }
}
