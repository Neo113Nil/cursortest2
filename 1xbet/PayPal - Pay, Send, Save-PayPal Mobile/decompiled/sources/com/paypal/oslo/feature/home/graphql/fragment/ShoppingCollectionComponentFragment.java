package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u000b\u001c\u001d\u001e\u001f !\"#$%&B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "personalizationTrackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;", "shoppingCollection", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPersonalizationTrackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;", "getShoppingCollection", "ShoppingCollection", "OnStoreShoppingCollection", "Store", "OnStore", "BnplConfig", "MerchantOffers", "Item", "PresentmentAsset", "OnPromotionRewardBadge", "Reward", "LifestyleLogo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ShoppingCollectionComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.Object personalizationTrackingId;
    private final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection;

    public ShoppingCollectionComponentFragment(java.lang.Object obj, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingCollection, "");
        this.personalizationTrackingId = obj;
        this.shoppingCollection = shoppingCollection;
    }

    public final java.lang.Object getPersonalizationTrackingId() {
        return this.personalizationTrackingId;
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection getShoppingCollection() {
        return this.shoppingCollection;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;", "", "", "__typename", "title", "id", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStoreShoppingCollection;", "onStoreShoppingCollection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStoreShoppingCollection;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStoreShoppingCollection;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStoreShoppingCollection;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getTitle", "getId", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStoreShoppingCollection;", "getOnStoreShoppingCollection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShoppingCollection {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection onStoreShoppingCollection;
        private final java.lang.String title;

        public ShoppingCollection(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection onStoreShoppingCollection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.__typename = str;
            this.title = str2;
            this.id = str3;
            this.onStoreShoppingCollection = onStoreShoppingCollection;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection getOnStoreShoppingCollection() {
            return this.onStoreShoppingCollection;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.title;
            java.lang.String str3 = this.id;
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection onStoreShoppingCollection = this.onStoreShoppingCollection;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShoppingCollection(__typename=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", id=");
            sb.append(str3);
            sb.append(", onStoreShoppingCollection=");
            sb.append(onStoreShoppingCollection);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            int hashCode2 = this.title.hashCode();
            int hashCode3 = this.id.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection onStoreShoppingCollection = this.onStoreShoppingCollection;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onStoreShoppingCollection == null ? 0 : onStoreShoppingCollection.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, shoppingCollection.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, shoppingCollection.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, shoppingCollection.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.onStoreShoppingCollection, shoppingCollection.onStoreShoppingCollection);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection copy(java.lang.String __typename, java.lang.String title, java.lang.String id, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection onStoreShoppingCollection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection(__typename, title, id, onStoreShoppingCollection);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection getOnStoreShoppingCollection() {
            return this.onStoreShoppingCollection;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection onStoreShoppingCollection, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = shoppingCollection.__typename;
            }
            if ((i & 2) != 0) {
                str2 = shoppingCollection.title;
            }
            if ((i & 4) != 0) {
                str3 = shoppingCollection.id;
            }
            if ((i & 8) != 0) {
                onStoreShoppingCollection = shoppingCollection.onStoreShoppingCollection;
            }
            return shoppingCollection.copy(str, str2, str3, onStoreShoppingCollection);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStoreShoppingCollection;", "", "", "id", "title", "Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionStoreVariant;", "variant", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionState;", "state", "", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Store;", "stores", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionStoreVariant;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionState;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionStoreVariant;", "component4", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionState;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionStoreVariant;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionState;Ljava/util/List;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStoreShoppingCollection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionStoreVariant;", "getVariant", "getDescription", "Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionState;", "getState", "Ljava/util/List;", "getStores"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnStoreShoppingCollection {
        public static final int $stable = 8;
        private final java.lang.String description;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState state;
        private final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store> stores;
        private final java.lang.String title;
        private final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant variant;

        public OnStoreShoppingCollection(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant shoppingCollectionStoreVariant, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingCollectionStoreVariant, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingCollectionState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.title = str2;
            this.variant = shoppingCollectionStoreVariant;
            this.description = str3;
            this.state = shoppingCollectionState;
            this.stores = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant getVariant() {
            return this.variant;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState getState() {
            return this.state;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store> getStores() {
            return this.stores;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.title;
            com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant shoppingCollectionStoreVariant = this.variant;
            java.lang.String str3 = this.description;
            com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState = this.state;
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store> list = this.stores;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnStoreShoppingCollection(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", variant=");
            sb.append(shoppingCollectionStoreVariant);
            sb.append(", description=");
            sb.append(str3);
            sb.append(", state=");
            sb.append(shoppingCollectionState);
            sb.append(", stores=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.title.hashCode();
            int hashCode3 = this.variant.hashCode();
            java.lang.String str = this.description;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.state.hashCode()) * 31) + this.stores.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection onStoreShoppingCollection = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onStoreShoppingCollection.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, onStoreShoppingCollection.title) && this.variant == onStoreShoppingCollection.variant && kotlin.jvm.internal.Intrinsics.areEqual(this.description, onStoreShoppingCollection.description) && this.state == onStoreShoppingCollection.state && kotlin.jvm.internal.Intrinsics.areEqual(this.stores, onStoreShoppingCollection.stores);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection copy(java.lang.String id, java.lang.String title, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant variant, java.lang.String description, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState state, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store> stores) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stores, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection(id, title, variant, description, state, stores);
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store> component6() {
            return this.stores;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState getState() {
            return this.state;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant getVariant() {
            return this.variant;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection onStoreShoppingCollection, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant shoppingCollectionStoreVariant, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onStoreShoppingCollection.id;
            }
            if ((i & 2) != 0) {
                str2 = onStoreShoppingCollection.title;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                shoppingCollectionStoreVariant = onStoreShoppingCollection.variant;
            }
            com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant shoppingCollectionStoreVariant2 = shoppingCollectionStoreVariant;
            if ((i & 8) != 0) {
                str3 = onStoreShoppingCollection.description;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                shoppingCollectionState = onStoreShoppingCollection.state;
            }
            com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState2 = shoppingCollectionState;
            if ((i & 32) != 0) {
                list = onStoreShoppingCollection.stores;
            }
            return onStoreShoppingCollection.copy(str, str4, shoppingCollectionStoreVariant2, str5, shoppingCollectionState2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Store;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;", "onStore", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Store;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;", "getOnStore"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Store {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore;

        public Store(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onStore = onStore;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore getOnStore() {
            return this.onStore;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore = this.onStore;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Store(__typename=");
            sb.append(str);
            sb.append(", onStore=");
            sb.append(onStore);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore = this.onStore;
            return (hashCode * 31) + (onStore == null ? 0 : onStore.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store store = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, store.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onStore, store.onStore);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store(__typename, onStore);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore getOnStore() {
            return this.onStore;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store store, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = store.__typename;
            }
            if ((i & 2) != 0) {
                onStore = store.onStore;
            }
            return store.copy(str, onStore);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0086\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b1\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u001bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b8\u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b9\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b:\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;", "", "", "id", "logoUrl", "name", "url", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE, "", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$BnplConfig;", "bnplConfig", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$MerchantOffers;", "merchantOffers", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$LifestyleLogo;", "lifestyleLogos", "logoBgColor", "tagline", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ZLjava/util/List;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$MerchantOffers;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "component5", "()Z", "component6", "()Ljava/util/List;", "component7", "()Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$MerchantOffers;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ZLjava/util/List;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$MerchantOffers;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getLogoUrl", "getName", "getUrl", "Z", "getActive", "Ljava/util/List;", "getBnplConfig", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$MerchantOffers;", "getMerchantOffers", "getLifestyleLogos", "getLogoBgColor", "getTagline"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnStore {
        public static final int $stable = 8;
        private final boolean active;
        private final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig> bnplConfig;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo> lifestyleLogos;
        private final java.lang.Object logoBgColor;
        private final java.lang.Object logoUrl;
        private final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers merchantOffers;
        private final java.lang.String name;
        private final java.lang.String tagline;
        private final java.lang.Object url;

        public OnStore(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.Object obj2, boolean z, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig> list, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers merchantOffers, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo> list2, java.lang.Object obj3, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantOffers, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.id = str;
            this.logoUrl = obj;
            this.name = str2;
            this.url = obj2;
            this.active = z;
            this.bnplConfig = list;
            this.merchantOffers = merchantOffers;
            this.lifestyleLogos = list2;
            this.logoBgColor = obj3;
            this.tagline = str3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final boolean getActive() {
            return this.active;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig> getBnplConfig() {
            return this.bnplConfig;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers getMerchantOffers() {
            return this.merchantOffers;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo> getLifestyleLogos() {
            return this.lifestyleLogos;
        }

        public final java.lang.Object getLogoBgColor() {
            return this.logoBgColor;
        }

        public final java.lang.String getTagline() {
            return this.tagline;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.Object obj = this.logoUrl;
            java.lang.String str2 = this.name;
            java.lang.Object obj2 = this.url;
            boolean z = this.active;
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig> list = this.bnplConfig;
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers merchantOffers = this.merchantOffers;
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo> list2 = this.lifestyleLogos;
            java.lang.Object obj3 = this.logoBgColor;
            java.lang.String str3 = this.tagline;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnStore(id=");
            sb.append(str);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", url=");
            sb.append(obj2);
            sb.append(", active=");
            sb.append(z);
            sb.append(", bnplConfig=");
            sb.append(list);
            sb.append(", merchantOffers=");
            sb.append(merchantOffers);
            sb.append(", lifestyleLogos=");
            sb.append(list2);
            sb.append(", logoBgColor=");
            sb.append(obj3);
            sb.append(", tagline=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.Object obj = this.logoUrl;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            int hashCode3 = this.name.hashCode();
            int hashCode4 = this.url.hashCode();
            int hashCode5 = java.lang.Boolean.hashCode(this.active);
            int hashCode6 = this.bnplConfig.hashCode();
            int hashCode7 = this.merchantOffers.hashCode();
            int hashCode8 = this.lifestyleLogos.hashCode();
            java.lang.Object obj2 = this.logoBgColor;
            int hashCode9 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.String str = this.tagline;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onStore.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, onStore.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, onStore.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, onStore.url) && this.active == onStore.active && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplConfig, onStore.bnplConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantOffers, onStore.merchantOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.lifestyleLogos, onStore.lifestyleLogos) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoBgColor, onStore.logoBgColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.tagline, onStore.tagline);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore copy(java.lang.String id, java.lang.Object logoUrl, java.lang.String name2, java.lang.Object url, boolean active, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig> bnplConfig, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers merchantOffers, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo> lifestyleLogos, java.lang.Object logoBgColor, java.lang.String tagline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantOffers, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifestyleLogos, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore(id, logoUrl, name2, url, active, bnplConfig, merchantOffers, lifestyleLogos, logoBgColor, tagline);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Object getLogoBgColor() {
            return this.logoBgColor;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo> component8() {
            return this.lifestyleLogos;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers getMerchantOffers() {
            return this.merchantOffers;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig> component6() {
            return this.bnplConfig;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getActive() {
            return this.active;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getTagline() {
            return this.tagline;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$BnplConfig;", "", "", "callToAction", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$BnplConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCallToAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BnplConfig {
        public static final int $stable = 0;
        private final java.lang.String callToAction;

        public BnplConfig(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.callToAction = str;
        }

        public final java.lang.String getCallToAction() {
            return this.callToAction;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.callToAction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplConfig(callToAction=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.callToAction.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.callToAction, ((com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig) other).callToAction);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig copy(java.lang.String callToAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callToAction, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig(callToAction);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCallToAction() {
            return this.callToAction;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig bnplConfig, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bnplConfig.callToAction;
            }
            return bnplConfig.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$MerchantOffers;", "", "", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$MerchantOffers;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MerchantOffers {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item> items;

        public MerchantOffers(java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantOffers(items=");
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
            return (other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers) other).items);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers copy(java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers(items);
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.MerchantOffers merchantOffers, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = merchantOffers.items;
            }
            return merchantOffers.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Item;", "", "", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$PresentmentAsset;", "presentmentAssets", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Reward;", "reward", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Reward;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Reward;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Reward;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPresentmentAssets", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Reward;", "getReward"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset> presentmentAssets;
        private final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward reward;

        public Item(java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset> list, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward reward) {
            this.presentmentAssets = list;
            this.reward = reward;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset> getPresentmentAssets() {
            return this.presentmentAssets;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward getReward() {
            return this.reward;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset> list = this.presentmentAssets;
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward reward = this.reward;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(presentmentAssets=");
            sb.append(list);
            sb.append(", reward=");
            sb.append(reward);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset> list = this.presentmentAssets;
            int hashCode = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward reward = this.reward;
            return (hashCode * 31) + (reward != null ? reward.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item item = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.presentmentAssets, item.presentmentAssets) && kotlin.jvm.internal.Intrinsics.areEqual(this.reward, item.reward);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item copy(java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset> presentmentAssets, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward reward) {
            return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item(presentmentAssets, reward);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward getReward() {
            return this.reward;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset> component1() {
            return this.presentmentAssets;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item item, java.util.List list, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward reward, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = item.presentmentAssets;
            }
            if ((i & 2) != 0) {
                reward = item.reward;
            }
            return item.copy(list, reward);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$PresentmentAsset;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnPromotionRewardBadge;", "onPromotionRewardBadge", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnPromotionRewardBadge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnPromotionRewardBadge;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnPromotionRewardBadge;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$PresentmentAsset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnPromotionRewardBadge;", "getOnPromotionRewardBadge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PresentmentAsset {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge onPromotionRewardBadge;

        public PresentmentAsset(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge onPromotionRewardBadge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPromotionRewardBadge = onPromotionRewardBadge;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge getOnPromotionRewardBadge() {
            return this.onPromotionRewardBadge;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge onPromotionRewardBadge = this.onPromotionRewardBadge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PresentmentAsset(__typename=");
            sb.append(str);
            sb.append(", onPromotionRewardBadge=");
            sb.append(onPromotionRewardBadge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge onPromotionRewardBadge = this.onPromotionRewardBadge;
            return (hashCode * 31) + (onPromotionRewardBadge == null ? 0 : onPromotionRewardBadge.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset presentmentAsset = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, presentmentAsset.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPromotionRewardBadge, presentmentAsset.onPromotionRewardBadge);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge onPromotionRewardBadge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset(__typename, onPromotionRewardBadge);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge getOnPromotionRewardBadge() {
            return this.onPromotionRewardBadge;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset presentmentAsset, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge onPromotionRewardBadge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = presentmentAsset.__typename;
            }
            if ((i & 2) != 0) {
                onPromotionRewardBadge = presentmentAsset.onPromotionRewardBadge;
            }
            return presentmentAsset.copy(str, onPromotionRewardBadge);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnPromotionRewardBadge;", "", "", "badgeText", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnPromotionRewardBadge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBadgeText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPromotionRewardBadge {
        public static final int $stable = 0;
        private final java.lang.String badgeText;

        public OnPromotionRewardBadge(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.badgeText = str;
        }

        public final java.lang.String getBadgeText() {
            return this.badgeText;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.badgeText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPromotionRewardBadge(badgeText=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.badgeText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge) && kotlin.jvm.internal.Intrinsics.areEqual(this.badgeText, ((com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge) other).badgeText);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge copy(java.lang.String badgeText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeText, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge(badgeText);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBadgeText() {
            return this.badgeText;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge onPromotionRewardBadge, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPromotionRewardBadge.badgeText;
            }
            return onPromotionRewardBadge.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Reward;", "", "percentage", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "<init>", "(Ljava/lang/Object;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Object;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Reward;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPercentage", "Ljava/lang/Integer;", "getPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Reward {
        public static final int $stable = 8;
        private final java.lang.Object percentage;
        private final java.lang.Integer points;

        public Reward(java.lang.Object obj, java.lang.Integer num) {
            this.percentage = obj;
            this.points = num;
        }

        public final java.lang.Object getPercentage() {
            return this.percentage;
        }

        public final java.lang.Integer getPoints() {
            return this.points;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.percentage;
            java.lang.Integer num = this.points;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Reward(percentage=");
            sb.append(obj);
            sb.append(", points=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.percentage;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.Integer num = this.points;
            return (hashCode * 31) + (num != null ? num.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward reward = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.percentage, reward.percentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.points, reward.points);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward copy(java.lang.Object percentage, java.lang.Integer points) {
            return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward(percentage, points);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getPoints() {
            return this.points;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getPercentage() {
            return this.percentage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward reward, java.lang.Object obj, java.lang.Integer num, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = reward.percentage;
            }
            if ((i & 2) != 0) {
                num = reward.points;
            }
            return reward.copy(obj, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$LifestyleLogo;", "", "Lcom/paypal/oslo/api/graphql/schema/type/StoreLifestyleLogoType;", "type", "url", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/StoreLifestyleLogoType;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/StoreLifestyleLogoType;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/StoreLifestyleLogoType;Ljava/lang/Object;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$LifestyleLogo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/StoreLifestyleLogoType;", "getType", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LifestyleLogo {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType type;
        private final java.lang.Object url;

        public LifestyleLogo(com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType storeLifestyleLogoType, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeLifestyleLogoType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.type = storeLifestyleLogoType;
            this.url = obj;
        }

        public final com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType getType() {
            return this.type;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType storeLifestyleLogoType = this.type;
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LifestyleLogo(type=");
            sb.append(storeLifestyleLogoType);
            sb.append(", url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.type.hashCode() * 31) + this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo lifestyleLogo = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo) other;
            return this.type == lifestyleLogo.type && kotlin.jvm.internal.Intrinsics.areEqual(this.url, lifestyleLogo.url);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo copy(com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType type, java.lang.Object url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo(type, url);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo lifestyleLogo, com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType storeLifestyleLogoType, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                storeLifestyleLogoType = lifestyleLogo.type;
            }
            if ((i & 2) != 0) {
                obj = lifestyleLogo.url;
            }
            return lifestyleLogo.copy(storeLifestyleLogoType, obj);
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.personalizationTrackingId;
        com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection = this.shoppingCollection;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShoppingCollectionComponentFragment(personalizationTrackingId=");
        sb.append(obj);
        sb.append(", shoppingCollection=");
        sb.append(shoppingCollection);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Object obj = this.personalizationTrackingId;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.shoppingCollection.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment shoppingCollectionComponentFragment = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.personalizationTrackingId, shoppingCollectionComponentFragment.personalizationTrackingId) && kotlin.jvm.internal.Intrinsics.areEqual(this.shoppingCollection, shoppingCollectionComponentFragment.shoppingCollection);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment copy(java.lang.Object personalizationTrackingId, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingCollection, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment(personalizationTrackingId, shoppingCollection);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection getShoppingCollection() {
        return this.shoppingCollection;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getPersonalizationTrackingId() {
        return this.personalizationTrackingId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment shoppingCollectionComponentFragment, java.lang.Object obj, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = shoppingCollectionComponentFragment.personalizationTrackingId;
        }
        if ((i & 2) != 0) {
            shoppingCollection = shoppingCollectionComponentFragment.shoppingCollection;
        }
        return shoppingCollectionComponentFragment.copy(obj, shoppingCollection);
    }
}
