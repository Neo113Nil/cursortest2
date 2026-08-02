package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000e!\"#$%&'()*+,- B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "CardRewards", "Item", com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER, "Denomination", "OnMoney", "OnCardRewardPoints", "TargetCurrencyBalance", "MinimumTargetCurrencyRewardsSpend", "MaximumTargetCurrencyRewardsSpend", "Status", "Issuer", "InstitutionImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetWalletCardRewardsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "f9a8a788661e765a5cf7fef9acf0f16854dda6da5d78bad9e214ef9a5280e67d";
    public static final java.lang.String OPERATION_NAME = "GetWalletCardRewards";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetWalletCardRewardsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetWalletCardRewardsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$CardRewards;", "cardRewards", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$CardRewards;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$CardRewards;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$CardRewards;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$CardRewards;", "getCardRewards"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards cardRewards;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards cardRewards) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRewards, "");
            this.cardRewards = cardRewards;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards getCardRewards() {
            return this.cardRewards;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards cardRewards = this.cardRewards;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(cardRewards=");
            sb.append(cardRewards);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardRewards.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardRewards, ((com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Data) other).cardRewards);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards cardRewards) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRewards, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Data(cardRewards);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards getCardRewards() {
            return this.cardRewards;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards cardRewards, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardRewards = data.cardRewards;
            }
            return data.copy(cardRewards);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$CardRewards;", "", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$CardRewards;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardRewards {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item> items;

        public CardRewards(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardRewards(items=");
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
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards) other).items);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards copy(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards(items);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.CardRewards cardRewards, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = cardRewards.items;
            }
            return cardRewards.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJZ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Item;", "", "", "id", "relatedCardId", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Balance;", "balance", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Status;", "status", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Issuer;", "issuer", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$InstitutionImage;", "institutionImages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Balance;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Status;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Issuer;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Balance;", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Status;", "component5", "()Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Issuer;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Balance;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Status;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Issuer;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getRelatedCardId", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Balance;", "getBalance", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Status;", "getStatus", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Issuer;", "getIssuer", "Ljava/util/List;", "getInstitutionImages"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance balance;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage> institutionImages;
        private final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer issuer;
        private final java.lang.String relatedCardId;
        private final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status status;

        public Item(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance balance, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status status, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer issuer, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.relatedCardId = str2;
            this.balance = balance;
            this.status = status;
            this.issuer = issuer;
            this.institutionImages = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getRelatedCardId() {
            return this.relatedCardId;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance getBalance() {
            return this.balance;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer getIssuer() {
            return this.issuer;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage> getInstitutionImages() {
            return this.institutionImages;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.relatedCardId;
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance balance = this.balance;
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status status = this.status;
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer issuer = this.issuer;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage> list = this.institutionImages;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", relatedCardId=");
            sb.append(str2);
            sb.append(", balance=");
            sb.append(balance);
            sb.append(", status=");
            sb.append(status);
            sb.append(", issuer=");
            sb.append(issuer);
            sb.append(", institutionImages=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.relatedCardId.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance balance = this.balance;
            int hashCode3 = balance == null ? 0 : balance.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status status = this.status;
            int hashCode4 = status == null ? 0 : status.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer issuer = this.issuer;
            int hashCode5 = issuer == null ? 0 : issuer.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage> list = this.institutionImages;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item item = (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.relatedCardId, item.relatedCardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, item.balance) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, item.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, item.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImages, item.institutionImages);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item copy(java.lang.String id, java.lang.String relatedCardId, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance balance, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status status, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer issuer, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage> institutionImages) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relatedCardId, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item(id, relatedCardId, balance, status, issuer, institutionImages);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage> component6() {
            return this.institutionImages;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer getIssuer() {
            return this.issuer;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance getBalance() {
            return this.balance;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRelatedCardId() {
            return this.relatedCardId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item item, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance balance, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status status, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer issuer, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                str2 = item.relatedCardId;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                balance = item.balance;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance balance2 = balance;
            if ((i & 8) != 0) {
                status = item.status;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status status2 = status;
            if ((i & 16) != 0) {
                issuer = item.issuer;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer issuer2 = issuer;
            if ((i & 32) != 0) {
                list = item.institutionImages;
            }
            return item.copy(str, str3, balance2, status2, issuer2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0094\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bC\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bF\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Balance;", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Denomination;", "denomination", "", "conversionFactor", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TARGET_CURRENCY_CODE, "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$TargetCurrencyBalance;", "targetCurrencyBalance", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MinimumTargetCurrencyRewardsSpend;", "minimumTargetCurrencyRewardsSpend", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MaximumTargetCurrencyRewardsSpend;", "maximumTargetCurrencyRewardsSpend", "", "targetCurrencyDecimalPrecision", "programCurrencyDecimalPrecision", "Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode;", "targetCurrencyRoundingMode", "programCurrencyRoundingMode", "", "monetary", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Denomination;Ljava/lang/Double;Ljava/lang/Object;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$TargetCurrencyBalance;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MinimumTargetCurrencyRewardsSpend;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MaximumTargetCurrencyRewardsSpend;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode;Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode;Ljava/lang/Boolean;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Denomination;", "component2", "()Ljava/lang/Double;", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$TargetCurrencyBalance;", "component5", "()Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MinimumTargetCurrencyRewardsSpend;", "component6", "()Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MaximumTargetCurrencyRewardsSpend;", "component7", "()Ljava/lang/Integer;", "component8", "component9", "()Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode;", "component10", "component11", "()Ljava/lang/Boolean;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Denomination;Ljava/lang/Double;Ljava/lang/Object;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$TargetCurrencyBalance;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MinimumTargetCurrencyRewardsSpend;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MaximumTargetCurrencyRewardsSpend;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode;Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Balance;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Denomination;", "getDenomination", "Ljava/lang/Double;", "getConversionFactor", "Ljava/lang/Object;", "getTargetCurrencyCode", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$TargetCurrencyBalance;", "getTargetCurrencyBalance", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MinimumTargetCurrencyRewardsSpend;", "getMinimumTargetCurrencyRewardsSpend", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MaximumTargetCurrencyRewardsSpend;", "getMaximumTargetCurrencyRewardsSpend", "Ljava/lang/Integer;", "getTargetCurrencyDecimalPrecision", "getProgramCurrencyDecimalPrecision", "Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode;", "getTargetCurrencyRoundingMode", "getProgramCurrencyRoundingMode", "Ljava/lang/Boolean;", "getMonetary"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balance {
        public static final int $stable = 8;
        private final java.lang.Double conversionFactor;
        private final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination denomination;
        private final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend maximumTargetCurrencyRewardsSpend;
        private final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend minimumTargetCurrencyRewardsSpend;
        private final java.lang.Boolean monetary;
        private final java.lang.Integer programCurrencyDecimalPrecision;
        private final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode programCurrencyRoundingMode;
        private final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance targetCurrencyBalance;
        private final java.lang.Object targetCurrencyCode;
        private final java.lang.Integer targetCurrencyDecimalPrecision;
        private final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode targetCurrencyRoundingMode;

        public Balance(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination denomination, java.lang.Double d, java.lang.Object obj, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance targetCurrencyBalance, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend minimumTargetCurrencyRewardsSpend, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend maximumTargetCurrencyRewardsSpend, java.lang.Integer num, java.lang.Integer num2, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode2, java.lang.Boolean bool) {
            this.denomination = denomination;
            this.conversionFactor = d;
            this.targetCurrencyCode = obj;
            this.targetCurrencyBalance = targetCurrencyBalance;
            this.minimumTargetCurrencyRewardsSpend = minimumTargetCurrencyRewardsSpend;
            this.maximumTargetCurrencyRewardsSpend = maximumTargetCurrencyRewardsSpend;
            this.targetCurrencyDecimalPrecision = num;
            this.programCurrencyDecimalPrecision = num2;
            this.targetCurrencyRoundingMode = cardRewardRoundingMode;
            this.programCurrencyRoundingMode = cardRewardRoundingMode2;
            this.monetary = bool;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination getDenomination() {
            return this.denomination;
        }

        public final java.lang.Double getConversionFactor() {
            return this.conversionFactor;
        }

        public final java.lang.Object getTargetCurrencyCode() {
            return this.targetCurrencyCode;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance getTargetCurrencyBalance() {
            return this.targetCurrencyBalance;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend getMinimumTargetCurrencyRewardsSpend() {
            return this.minimumTargetCurrencyRewardsSpend;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend getMaximumTargetCurrencyRewardsSpend() {
            return this.maximumTargetCurrencyRewardsSpend;
        }

        public final java.lang.Integer getTargetCurrencyDecimalPrecision() {
            return this.targetCurrencyDecimalPrecision;
        }

        public final java.lang.Integer getProgramCurrencyDecimalPrecision() {
            return this.programCurrencyDecimalPrecision;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode getTargetCurrencyRoundingMode() {
            return this.targetCurrencyRoundingMode;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode getProgramCurrencyRoundingMode() {
            return this.programCurrencyRoundingMode;
        }

        public final java.lang.Boolean getMonetary() {
            return this.monetary;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination denomination = this.denomination;
            java.lang.Double d = this.conversionFactor;
            java.lang.Object obj = this.targetCurrencyCode;
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance targetCurrencyBalance = this.targetCurrencyBalance;
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend minimumTargetCurrencyRewardsSpend = this.minimumTargetCurrencyRewardsSpend;
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend maximumTargetCurrencyRewardsSpend = this.maximumTargetCurrencyRewardsSpend;
            java.lang.Integer num = this.targetCurrencyDecimalPrecision;
            java.lang.Integer num2 = this.programCurrencyDecimalPrecision;
            com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode = this.targetCurrencyRoundingMode;
            com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode2 = this.programCurrencyRoundingMode;
            java.lang.Boolean bool = this.monetary;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balance(denomination=");
            sb.append(denomination);
            sb.append(", conversionFactor=");
            sb.append(d);
            sb.append(", targetCurrencyCode=");
            sb.append(obj);
            sb.append(", targetCurrencyBalance=");
            sb.append(targetCurrencyBalance);
            sb.append(", minimumTargetCurrencyRewardsSpend=");
            sb.append(minimumTargetCurrencyRewardsSpend);
            sb.append(", maximumTargetCurrencyRewardsSpend=");
            sb.append(maximumTargetCurrencyRewardsSpend);
            sb.append(", targetCurrencyDecimalPrecision=");
            sb.append(num);
            sb.append(", programCurrencyDecimalPrecision=");
            sb.append(num2);
            sb.append(", targetCurrencyRoundingMode=");
            sb.append(cardRewardRoundingMode);
            sb.append(", programCurrencyRoundingMode=");
            sb.append(cardRewardRoundingMode2);
            sb.append(", monetary=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination denomination = this.denomination;
            int hashCode = denomination == null ? 0 : denomination.hashCode();
            java.lang.Double d = this.conversionFactor;
            int hashCode2 = d == null ? 0 : d.hashCode();
            java.lang.Object obj = this.targetCurrencyCode;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance targetCurrencyBalance = this.targetCurrencyBalance;
            int hashCode4 = targetCurrencyBalance == null ? 0 : targetCurrencyBalance.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend minimumTargetCurrencyRewardsSpend = this.minimumTargetCurrencyRewardsSpend;
            int hashCode5 = minimumTargetCurrencyRewardsSpend == null ? 0 : minimumTargetCurrencyRewardsSpend.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend maximumTargetCurrencyRewardsSpend = this.maximumTargetCurrencyRewardsSpend;
            int hashCode6 = maximumTargetCurrencyRewardsSpend == null ? 0 : maximumTargetCurrencyRewardsSpend.hashCode();
            java.lang.Integer num = this.targetCurrencyDecimalPrecision;
            int hashCode7 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.programCurrencyDecimalPrecision;
            int hashCode8 = num2 == null ? 0 : num2.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode = this.targetCurrencyRoundingMode;
            int hashCode9 = cardRewardRoundingMode == null ? 0 : cardRewardRoundingMode.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode2 = this.programCurrencyRoundingMode;
            int hashCode10 = cardRewardRoundingMode2 == null ? 0 : cardRewardRoundingMode2.hashCode();
            java.lang.Boolean bool = this.monetary;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance balance = (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.denomination, balance.denomination) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.conversionFactor, (java.lang.Object) balance.conversionFactor) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetCurrencyCode, balance.targetCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetCurrencyBalance, balance.targetCurrencyBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumTargetCurrencyRewardsSpend, balance.minimumTargetCurrencyRewardsSpend) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumTargetCurrencyRewardsSpend, balance.maximumTargetCurrencyRewardsSpend) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetCurrencyDecimalPrecision, balance.targetCurrencyDecimalPrecision) && kotlin.jvm.internal.Intrinsics.areEqual(this.programCurrencyDecimalPrecision, balance.programCurrencyDecimalPrecision) && this.targetCurrencyRoundingMode == balance.targetCurrencyRoundingMode && this.programCurrencyRoundingMode == balance.programCurrencyRoundingMode && kotlin.jvm.internal.Intrinsics.areEqual(this.monetary, balance.monetary);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance copy(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination denomination, java.lang.Double conversionFactor, java.lang.Object targetCurrencyCode, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance targetCurrencyBalance, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend minimumTargetCurrencyRewardsSpend, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend maximumTargetCurrencyRewardsSpend, java.lang.Integer targetCurrencyDecimalPrecision, java.lang.Integer programCurrencyDecimalPrecision, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode targetCurrencyRoundingMode, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode programCurrencyRoundingMode, java.lang.Boolean monetary) {
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance(denomination, conversionFactor, targetCurrencyCode, targetCurrencyBalance, minimumTargetCurrencyRewardsSpend, maximumTargetCurrencyRewardsSpend, targetCurrencyDecimalPrecision, programCurrencyDecimalPrecision, targetCurrencyRoundingMode, programCurrencyRoundingMode, monetary);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode getTargetCurrencyRoundingMode() {
            return this.targetCurrencyRoundingMode;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Integer getProgramCurrencyDecimalPrecision() {
            return this.programCurrencyDecimalPrecision;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Integer getTargetCurrencyDecimalPrecision() {
            return this.targetCurrencyDecimalPrecision;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend getMaximumTargetCurrencyRewardsSpend() {
            return this.maximumTargetCurrencyRewardsSpend;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend getMinimumTargetCurrencyRewardsSpend() {
            return this.minimumTargetCurrencyRewardsSpend;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance getTargetCurrencyBalance() {
            return this.targetCurrencyBalance;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getTargetCurrencyCode() {
            return this.targetCurrencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Double getConversionFactor() {
            return this.conversionFactor;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.Boolean getMonetary() {
            return this.monetary;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode getProgramCurrencyRoundingMode() {
            return this.programCurrencyRoundingMode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination getDenomination() {
            return this.denomination;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Denomination;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnMoney;", "onMoney", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnCardRewardPoints;", "onCardRewardPoints", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnMoney;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnCardRewardPoints;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnMoney;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnCardRewardPoints;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnMoney;Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnCardRewardPoints;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Denomination;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnMoney;", "getOnMoney", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnCardRewardPoints;", "getOnCardRewardPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Denomination {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints onCardRewardPoints;
        private final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney onMoney;

        public Denomination(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney onMoney, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints onCardRewardPoints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney;
            this.onCardRewardPoints = onCardRewardPoints;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney getOnMoney() {
            return this.onMoney;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints getOnCardRewardPoints() {
            return this.onCardRewardPoints;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney onMoney = this.onMoney;
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints onCardRewardPoints = this.onCardRewardPoints;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Denomination(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney);
            sb.append(", onCardRewardPoints=");
            sb.append(onCardRewardPoints);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney onMoney = this.onMoney;
            int hashCode2 = onMoney == null ? 0 : onMoney.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints onCardRewardPoints = this.onCardRewardPoints;
            return (((hashCode * 31) + hashCode2) * 31) + (onCardRewardPoints != null ? onCardRewardPoints.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination denomination = (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, denomination.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, denomination.onMoney) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCardRewardPoints, denomination.onCardRewardPoints);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney onMoney, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints onCardRewardPoints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination(__typename, onMoney, onCardRewardPoints);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints getOnCardRewardPoints() {
            return this.onCardRewardPoints;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination denomination, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney onMoney, com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints onCardRewardPoints, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = denomination.__typename;
            }
            if ((i & 2) != 0) {
                onMoney = denomination.onMoney;
            }
            if ((i & 4) != 0) {
                onCardRewardPoints = denomination.onCardRewardPoints;
            }
            return denomination.copy(str, onMoney, onCardRewardPoints);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnMoney;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnMoney;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMoney {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public OnMoney(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMoney(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney onMoney = (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney onMoney, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onMoney.currencyCode;
            }
            if ((i & 2) != 0) {
                str = onMoney.value;
            }
            return onMoney.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnCardRewardPoints;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "programCode", "programDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$OnCardRewardPoints;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "getProgramCode", "getProgramDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCardRewardPoints {
        public static final int $stable = 0;
        private final java.lang.String programCode;
        private final java.lang.String programDescription;
        private final java.lang.String value;

        public OnCardRewardPoints(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.value = str;
            this.programCode = str2;
            this.programDescription = str3;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String getProgramCode() {
            return this.programCode;
        }

        public final java.lang.String getProgramDescription() {
            return this.programDescription;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.String str2 = this.programCode;
            java.lang.String str3 = this.programDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCardRewardPoints(value=");
            sb.append(str);
            sb.append(", programCode=");
            sb.append(str2);
            sb.append(", programDescription=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.value.hashCode() * 31) + this.programCode.hashCode()) * 31) + this.programDescription.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints onCardRewardPoints = (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, onCardRewardPoints.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.programCode, onCardRewardPoints.programCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.programDescription, onCardRewardPoints.programDescription);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints copy(java.lang.String value, java.lang.String programCode, java.lang.String programDescription) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(programCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(programDescription, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints(value, programCode, programDescription);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProgramDescription() {
            return this.programDescription;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getProgramCode() {
            return this.programCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints onCardRewardPoints, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCardRewardPoints.value;
            }
            if ((i & 2) != 0) {
                str2 = onCardRewardPoints.programCode;
            }
            if ((i & 4) != 0) {
                str3 = onCardRewardPoints.programDescription;
            }
            return onCardRewardPoints.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$TargetCurrencyBalance;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$TargetCurrencyBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TargetCurrencyBalance {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TargetCurrencyBalance(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetCurrencyBalance(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance targetCurrencyBalance = (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, targetCurrencyBalance.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, targetCurrencyBalance.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance targetCurrencyBalance, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = targetCurrencyBalance.currencyCode;
            }
            if ((i & 2) != 0) {
                str = targetCurrencyBalance.value;
            }
            return targetCurrencyBalance.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MinimumTargetCurrencyRewardsSpend;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MinimumTargetCurrencyRewardsSpend;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MinimumTargetCurrencyRewardsSpend {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public MinimumTargetCurrencyRewardsSpend(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MinimumTargetCurrencyRewardsSpend(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend minimumTargetCurrencyRewardsSpend = (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, minimumTargetCurrencyRewardsSpend.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, minimumTargetCurrencyRewardsSpend.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend minimumTargetCurrencyRewardsSpend, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = minimumTargetCurrencyRewardsSpend.currencyCode;
            }
            if ((i & 2) != 0) {
                str = minimumTargetCurrencyRewardsSpend.value;
            }
            return minimumTargetCurrencyRewardsSpend.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MaximumTargetCurrencyRewardsSpend;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$MaximumTargetCurrencyRewardsSpend;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MaximumTargetCurrencyRewardsSpend {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public MaximumTargetCurrencyRewardsSpend(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MaximumTargetCurrencyRewardsSpend(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend maximumTargetCurrencyRewardsSpend = (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, maximumTargetCurrencyRewardsSpend.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, maximumTargetCurrencyRewardsSpend.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend maximumTargetCurrencyRewardsSpend, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = maximumTargetCurrencyRewardsSpend.currencyCode;
            }
            if ((i & 2) != 0) {
                str = maximumTargetCurrencyRewardsSpend.value;
            }
            return maximumTargetCurrencyRewardsSpend.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Status;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CardRewardState;", "state", "Lcom/paypal/oslo/api/graphql/schema/type/CardRewardStateReason;", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CardRewardState;Lcom/paypal/oslo/api/graphql/schema/type/CardRewardStateReason;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CardRewardState;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CardRewardStateReason;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CardRewardState;Lcom/paypal/oslo/api/graphql/schema/type/CardRewardStateReason;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Status;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CardRewardState;", "getState", "Lcom/paypal/oslo/api/graphql/schema/type/CardRewardStateReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason reason;
        private final com.paypal.oslo.api.graphql.schema.type.CardRewardState state;

        public Status(com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState, com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRewardState, "");
            this.state = cardRewardState;
            this.reason = cardRewardStateReason;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardRewardState getState() {
            return this.state;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState = this.state;
            com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status(state=");
            sb.append(cardRewardState);
            sb.append(", reason=");
            sb.append(cardRewardStateReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.state.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason = this.reason;
            return (hashCode * 31) + (cardRewardStateReason == null ? 0 : cardRewardStateReason.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status status = (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status) other;
            return this.state == status.state && this.reason == status.reason;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status copy(com.paypal.oslo.api.graphql.schema.type.CardRewardState state, com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status(state, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardRewardState getState() {
            return this.state;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status status, com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState, com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardRewardState = status.state;
            }
            if ((i & 2) != 0) {
                cardRewardStateReason = status.reason;
            }
            return status.copy(cardRewardState, cardRewardStateReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Issuer;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "walletCardIssuerFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Issuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "getWalletCardIssuerFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment;

        public Issuer(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardIssuerFragment, "");
            this.__typename = str;
            this.walletCardIssuerFragment = walletCardIssuerFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment getWalletCardIssuerFragment() {
            return this.walletCardIssuerFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment = this.walletCardIssuerFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer(__typename=");
            sb.append(str);
            sb.append(", walletCardIssuerFragment=");
            sb.append(walletCardIssuerFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.walletCardIssuerFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer issuer = (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, issuer.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletCardIssuerFragment, issuer.walletCardIssuerFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardIssuerFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer(__typename, walletCardIssuerFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment getWalletCardIssuerFragment() {
            return this.walletCardIssuerFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer issuer, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer.__typename;
            }
            if ((i & 2) != 0) {
                walletCardIssuerFragment = issuer.walletCardIssuerFragment;
            }
            return issuer.copy(str, walletCardIssuerFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$InstitutionImage;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;", "walletInstitutionImageFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;)Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$InstitutionImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;", "getWalletInstitutionImageFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstitutionImage {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment;

        public InstitutionImage(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstitutionImageFragment, "");
            this.__typename = str;
            this.walletInstitutionImageFragment = walletInstitutionImageFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment getWalletInstitutionImageFragment() {
            return this.walletInstitutionImageFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment = this.walletInstitutionImageFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstitutionImage(__typename=");
            sb.append(str);
            sb.append(", walletInstitutionImageFragment=");
            sb.append(walletInstitutionImageFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.walletInstitutionImageFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage institutionImage = (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, institutionImage.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletInstitutionImageFragment, institutionImage.walletInstitutionImageFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstitutionImageFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage(__typename, walletInstitutionImageFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment getWalletInstitutionImageFragment() {
            return this.walletInstitutionImageFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage copy$default(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage institutionImage, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = institutionImage.__typename;
            }
            if ((i & 2) != 0) {
                walletInstitutionImageFragment = institutionImage.walletInstitutionImageFragment;
            }
            return institutionImage.copy(str, walletInstitutionImageFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetWalletCardRewards { cardRewards { items { id relatedCardId balance { denomination { __typename ... on Money { currencyCode value } ... on CardRewardPoints { value programCode programDescription } } conversionFactor targetCurrencyCode targetCurrencyBalance { currencyCode value } minimumTargetCurrencyRewardsSpend { currencyCode value } maximumTargetCurrencyRewardsSpend { currencyCode value } targetCurrencyDecimalPrecision programCurrencyDecimalPrecision targetCurrencyRoundingMode programCurrencyRoundingMode monetary } status { state reason } issuer { __typename ...WalletCardIssuerFragment } institutionImages { __typename ...WalletInstitutionImageFragment } } } }  fragment WalletCardIssuerFragment on CardIssuer { name id countryCode issuerProductDescription issuerAlternateName }  fragment WalletInstitutionImageFragment on InstitutionImage { url mimeType width height category }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}
