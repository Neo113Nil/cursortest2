package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment$PresentmentAsset;", "presentmentAssets", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPresentmentAssets", "PresentmentAsset", "OnRewardsCategoryOffer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CategorySelectionPresentmentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset> presentmentAssets;

    public CategorySelectionPresentmentFragment(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset> list) {
        this.presentmentAssets = list;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset> getPresentmentAssets() {
        return this.presentmentAssets;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment$PresentmentAsset;", "", "", "__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment$OnRewardsCategoryOffer;", "onRewardsCategoryOffer", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment$OnRewardsCategoryOffer;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment$OnRewardsCategoryOffer;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment$OnRewardsCategoryOffer;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment$PresentmentAsset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment$OnRewardsCategoryOffer;", "getOnRewardsCategoryOffer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PresentmentAsset {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer;

        public PresentmentAsset(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onRewardsCategoryOffer = onRewardsCategoryOffer;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer getOnRewardsCategoryOffer() {
            return this.onRewardsCategoryOffer;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer = this.onRewardsCategoryOffer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PresentmentAsset(__typename=");
            sb.append(str);
            sb.append(", onRewardsCategoryOffer=");
            sb.append(onRewardsCategoryOffer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer = this.onRewardsCategoryOffer;
            return (hashCode * 31) + (onRewardsCategoryOffer == null ? 0 : onRewardsCategoryOffer.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset presentmentAsset = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, presentmentAsset.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRewardsCategoryOffer, presentmentAsset.onRewardsCategoryOffer);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset copy(java.lang.String __typename, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset(__typename, onRewardsCategoryOffer);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer getOnRewardsCategoryOffer() {
            return this.onRewardsCategoryOffer;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset presentmentAsset, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = presentmentAsset.__typename;
            }
            if ((i & 2) != 0) {
                onRewardsCategoryOffer = presentmentAsset.onRewardsCategoryOffer;
            }
            return presentmentAsset.copy(str, onRewardsCategoryOffer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment$OnRewardsCategoryOffer;", "", "", "cardPpuiToken", "cardCategoryName", "cardCategoryDescription", "offerDetailsTermsText", "offerDetailsTermsUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategorySelectionPresentmentFragment$OnRewardsCategoryOffer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardPpuiToken", "getCardCategoryName", "getCardCategoryDescription", "getOfferDetailsTermsText", "Ljava/lang/Object;", "getOfferDetailsTermsUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRewardsCategoryOffer {
        public static final int $stable = 8;
        private final java.lang.String cardCategoryDescription;
        private final java.lang.String cardCategoryName;
        private final java.lang.String cardPpuiToken;
        private final java.lang.String offerDetailsTermsText;
        private final java.lang.Object offerDetailsTermsUrl;

        public OnRewardsCategoryOffer(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.cardPpuiToken = str;
            this.cardCategoryName = str2;
            this.cardCategoryDescription = str3;
            this.offerDetailsTermsText = str4;
            this.offerDetailsTermsUrl = obj;
        }

        public final java.lang.String getCardPpuiToken() {
            return this.cardPpuiToken;
        }

        public final java.lang.String getCardCategoryName() {
            return this.cardCategoryName;
        }

        public final java.lang.String getCardCategoryDescription() {
            return this.cardCategoryDescription;
        }

        public final java.lang.String getOfferDetailsTermsText() {
            return this.offerDetailsTermsText;
        }

        public final java.lang.Object getOfferDetailsTermsUrl() {
            return this.offerDetailsTermsUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardPpuiToken;
            java.lang.String str2 = this.cardCategoryName;
            java.lang.String str3 = this.cardCategoryDescription;
            java.lang.String str4 = this.offerDetailsTermsText;
            java.lang.Object obj = this.offerDetailsTermsUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRewardsCategoryOffer(cardPpuiToken=");
            sb.append(str);
            sb.append(", cardCategoryName=");
            sb.append(str2);
            sb.append(", cardCategoryDescription=");
            sb.append(str3);
            sb.append(", offerDetailsTermsText=");
            sb.append(str4);
            sb.append(", offerDetailsTermsUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.cardPpuiToken.hashCode() * 31) + this.cardCategoryName.hashCode()) * 31) + this.cardCategoryDescription.hashCode()) * 31) + this.offerDetailsTermsText.hashCode()) * 31) + this.offerDetailsTermsUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardPpuiToken, onRewardsCategoryOffer.cardPpuiToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardCategoryName, onRewardsCategoryOffer.cardCategoryName) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardCategoryDescription, onRewardsCategoryOffer.cardCategoryDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsTermsText, onRewardsCategoryOffer.offerDetailsTermsText) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsTermsUrl, onRewardsCategoryOffer.offerDetailsTermsUrl);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer copy(java.lang.String cardPpuiToken, java.lang.String cardCategoryName, java.lang.String cardCategoryDescription, java.lang.String offerDetailsTermsText, java.lang.Object offerDetailsTermsUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPpuiToken, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardCategoryName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardCategoryDescription, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsTermsText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsTermsUrl, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer(cardPpuiToken, cardCategoryName, cardCategoryDescription, offerDetailsTermsText, offerDetailsTermsUrl);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getOfferDetailsTermsUrl() {
            return this.offerDetailsTermsUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getOfferDetailsTermsText() {
            return this.offerDetailsTermsText;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCardCategoryDescription() {
            return this.cardCategoryDescription;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardCategoryName() {
            return this.cardCategoryName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardPpuiToken() {
            return this.cardPpuiToken;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onRewardsCategoryOffer.cardPpuiToken;
            }
            if ((i & 2) != 0) {
                str2 = onRewardsCategoryOffer.cardCategoryName;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = onRewardsCategoryOffer.cardCategoryDescription;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = onRewardsCategoryOffer.offerDetailsTermsText;
            }
            java.lang.String str7 = str4;
            if ((i & 16) != 0) {
                obj = onRewardsCategoryOffer.offerDetailsTermsUrl;
            }
            return onRewardsCategoryOffer.copy(str, str5, str6, str7, obj);
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset> list = this.presentmentAssets;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CategorySelectionPresentmentFragment(presentmentAssets=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset> list = this.presentmentAssets;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.presentmentAssets, ((com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment) other).presentmentAssets);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset> presentmentAssets) {
        return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment(presentmentAssets);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset> component1() {
        return this.presentmentAssets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment categorySelectionPresentmentFragment, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = categorySelectionPresentmentFragment.presentmentAssets;
        }
        return categorySelectionPresentmentFragment.copy(list);
    }
}
