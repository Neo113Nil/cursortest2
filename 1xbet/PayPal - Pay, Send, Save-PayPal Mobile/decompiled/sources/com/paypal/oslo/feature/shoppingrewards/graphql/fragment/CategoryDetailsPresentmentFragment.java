package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$PresentmentAsset;", "presentmentAssets", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPresentmentAssets", "PresentmentAsset", "OnRewardsCategoryOffer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CategoryDetailsPresentmentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> presentmentAssets;

    public CategoryDetailsPresentmentFragment(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> list) {
        this.presentmentAssets = list;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> getPresentmentAssets() {
        return this.presentmentAssets;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$PresentmentAsset;", "", "", "__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;", "onRewardsCategoryOffer", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$PresentmentAsset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;", "getOnRewardsCategoryOffer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PresentmentAsset {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer;

        public PresentmentAsset(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onRewardsCategoryOffer = onRewardsCategoryOffer;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer getOnRewardsCategoryOffer() {
            return this.onRewardsCategoryOffer;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer = this.onRewardsCategoryOffer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PresentmentAsset(__typename=");
            sb.append(str);
            sb.append(", onRewardsCategoryOffer=");
            sb.append(onRewardsCategoryOffer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer = this.onRewardsCategoryOffer;
            return (hashCode * 31) + (onRewardsCategoryOffer == null ? 0 : onRewardsCategoryOffer.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset presentmentAsset = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, presentmentAsset.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRewardsCategoryOffer, presentmentAsset.onRewardsCategoryOffer);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset copy(java.lang.String __typename, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset(__typename, onRewardsCategoryOffer);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer getOnRewardsCategoryOffer() {
            return this.onRewardsCategoryOffer;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset presentmentAsset, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = presentmentAsset.__typename;
            }
            if ((i & 2) != 0) {
                onRewardsCategoryOffer = presentmentAsset.onRewardsCategoryOffer;
            }
            return presentmentAsset.copy(str, onRewardsCategoryOffer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J|\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b.\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b/\u0010\u0010R\u001a\u0010\f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b0\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;", "", "offerDetailsHeroImageUrl", "", "offerDetailsOfferTitleText", "offerDetailsExpirationText", "", "offerDetailsPpuiTokens", "offerDetailsTexts", "offerDetailsSubtexts", "offerDetailsTermsText", "offerDetailsTermsUrl", "offerDetailsCtaText", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getOfferDetailsHeroImageUrl", "Ljava/lang/String;", "getOfferDetailsOfferTitleText", "getOfferDetailsExpirationText", "Ljava/util/List;", "getOfferDetailsPpuiTokens", "getOfferDetailsTexts", "getOfferDetailsSubtexts", "getOfferDetailsTermsText", "getOfferDetailsTermsUrl", "getOfferDetailsCtaText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRewardsCategoryOffer {
        public static final int $stable = 8;
        private final java.lang.String offerDetailsCtaText;
        private final java.lang.String offerDetailsExpirationText;
        private final java.lang.Object offerDetailsHeroImageUrl;
        private final java.lang.String offerDetailsOfferTitleText;
        private final java.util.List<java.lang.String> offerDetailsPpuiTokens;
        private final java.util.List<java.lang.String> offerDetailsSubtexts;
        private final java.lang.String offerDetailsTermsText;
        private final java.lang.Object offerDetailsTermsUrl;
        private final java.util.List<java.lang.String> offerDetailsTexts;

        public OnRewardsCategoryOffer(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3, java.lang.String str3, java.lang.Object obj2, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.offerDetailsHeroImageUrl = obj;
            this.offerDetailsOfferTitleText = str;
            this.offerDetailsExpirationText = str2;
            this.offerDetailsPpuiTokens = list;
            this.offerDetailsTexts = list2;
            this.offerDetailsSubtexts = list3;
            this.offerDetailsTermsText = str3;
            this.offerDetailsTermsUrl = obj2;
            this.offerDetailsCtaText = str4;
        }

        public final java.lang.Object getOfferDetailsHeroImageUrl() {
            return this.offerDetailsHeroImageUrl;
        }

        public final java.lang.String getOfferDetailsOfferTitleText() {
            return this.offerDetailsOfferTitleText;
        }

        public final java.lang.String getOfferDetailsExpirationText() {
            return this.offerDetailsExpirationText;
        }

        public final java.util.List<java.lang.String> getOfferDetailsPpuiTokens() {
            return this.offerDetailsPpuiTokens;
        }

        public final java.util.List<java.lang.String> getOfferDetailsTexts() {
            return this.offerDetailsTexts;
        }

        public final java.util.List<java.lang.String> getOfferDetailsSubtexts() {
            return this.offerDetailsSubtexts;
        }

        public final java.lang.String getOfferDetailsTermsText() {
            return this.offerDetailsTermsText;
        }

        public final java.lang.Object getOfferDetailsTermsUrl() {
            return this.offerDetailsTermsUrl;
        }

        public final java.lang.String getOfferDetailsCtaText() {
            return this.offerDetailsCtaText;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.offerDetailsHeroImageUrl;
            java.lang.String str = this.offerDetailsOfferTitleText;
            java.lang.String str2 = this.offerDetailsExpirationText;
            java.util.List<java.lang.String> list = this.offerDetailsPpuiTokens;
            java.util.List<java.lang.String> list2 = this.offerDetailsTexts;
            java.util.List<java.lang.String> list3 = this.offerDetailsSubtexts;
            java.lang.String str3 = this.offerDetailsTermsText;
            java.lang.Object obj2 = this.offerDetailsTermsUrl;
            java.lang.String str4 = this.offerDetailsCtaText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRewardsCategoryOffer(offerDetailsHeroImageUrl=");
            sb.append(obj);
            sb.append(", offerDetailsOfferTitleText=");
            sb.append(str);
            sb.append(", offerDetailsExpirationText=");
            sb.append(str2);
            sb.append(", offerDetailsPpuiTokens=");
            sb.append(list);
            sb.append(", offerDetailsTexts=");
            sb.append(list2);
            sb.append(", offerDetailsSubtexts=");
            sb.append(list3);
            sb.append(", offerDetailsTermsText=");
            sb.append(str3);
            sb.append(", offerDetailsTermsUrl=");
            sb.append(obj2);
            sb.append(", offerDetailsCtaText=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((((this.offerDetailsHeroImageUrl.hashCode() * 31) + this.offerDetailsOfferTitleText.hashCode()) * 31) + this.offerDetailsExpirationText.hashCode()) * 31) + this.offerDetailsPpuiTokens.hashCode()) * 31) + this.offerDetailsTexts.hashCode()) * 31) + this.offerDetailsSubtexts.hashCode()) * 31) + this.offerDetailsTermsText.hashCode()) * 31) + this.offerDetailsTermsUrl.hashCode()) * 31) + this.offerDetailsCtaText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsHeroImageUrl, onRewardsCategoryOffer.offerDetailsHeroImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsOfferTitleText, onRewardsCategoryOffer.offerDetailsOfferTitleText) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsExpirationText, onRewardsCategoryOffer.offerDetailsExpirationText) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsPpuiTokens, onRewardsCategoryOffer.offerDetailsPpuiTokens) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsTexts, onRewardsCategoryOffer.offerDetailsTexts) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsSubtexts, onRewardsCategoryOffer.offerDetailsSubtexts) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsTermsText, onRewardsCategoryOffer.offerDetailsTermsText) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsTermsUrl, onRewardsCategoryOffer.offerDetailsTermsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetailsCtaText, onRewardsCategoryOffer.offerDetailsCtaText);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer copy(java.lang.Object offerDetailsHeroImageUrl, java.lang.String offerDetailsOfferTitleText, java.lang.String offerDetailsExpirationText, java.util.List<java.lang.String> offerDetailsPpuiTokens, java.util.List<java.lang.String> offerDetailsTexts, java.util.List<java.lang.String> offerDetailsSubtexts, java.lang.String offerDetailsTermsText, java.lang.Object offerDetailsTermsUrl, java.lang.String offerDetailsCtaText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsHeroImageUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsOfferTitleText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsExpirationText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsPpuiTokens, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsTexts, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsSubtexts, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsTermsText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsTermsUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsCtaText, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer(offerDetailsHeroImageUrl, offerDetailsOfferTitleText, offerDetailsExpirationText, offerDetailsPpuiTokens, offerDetailsTexts, offerDetailsSubtexts, offerDetailsTermsText, offerDetailsTermsUrl, offerDetailsCtaText);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getOfferDetailsCtaText() {
            return this.offerDetailsCtaText;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Object getOfferDetailsTermsUrl() {
            return this.offerDetailsTermsUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getOfferDetailsTermsText() {
            return this.offerDetailsTermsText;
        }

        public final java.util.List<java.lang.String> component6() {
            return this.offerDetailsSubtexts;
        }

        public final java.util.List<java.lang.String> component5() {
            return this.offerDetailsTexts;
        }

        public final java.util.List<java.lang.String> component4() {
            return this.offerDetailsPpuiTokens;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getOfferDetailsExpirationText() {
            return this.offerDetailsExpirationText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getOfferDetailsOfferTitleText() {
            return this.offerDetailsOfferTitleText;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getOfferDetailsHeroImageUrl() {
            return this.offerDetailsHeroImageUrl;
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> list = this.presentmentAssets;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CategoryDetailsPresentmentFragment(presentmentAssets=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> list = this.presentmentAssets;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.presentmentAssets, ((com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment) other).presentmentAssets);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> presentmentAssets) {
        return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment(presentmentAssets);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> component1() {
        return this.presentmentAssets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = categoryDetailsPresentmentFragment.presentmentAssets;
        }
        return categoryDetailsPresentmentFragment.copy(list);
    }
}
