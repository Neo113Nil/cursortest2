package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment$PresentmentAsset;", "presentmentAssets", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPresentmentAssets", "PresentmentAsset", "OnPromotionRewardsTabOfferCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EligiblePromotionOfferFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset> presentmentAssets;

    public EligiblePromotionOfferFragment(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset> list) {
        this.presentmentAssets = list;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset> getPresentmentAssets() {
        return this.presentmentAssets;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment$PresentmentAsset;", "", "", "__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment$OnPromotionRewardsTabOfferCard;", "onPromotionRewardsTabOfferCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment$OnPromotionRewardsTabOfferCard;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment$OnPromotionRewardsTabOfferCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment$OnPromotionRewardsTabOfferCard;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment$PresentmentAsset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment$OnPromotionRewardsTabOfferCard;", "getOnPromotionRewardsTabOfferCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PresentmentAsset {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard onPromotionRewardsTabOfferCard;

        public PresentmentAsset(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard onPromotionRewardsTabOfferCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPromotionRewardsTabOfferCard = onPromotionRewardsTabOfferCard;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard getOnPromotionRewardsTabOfferCard() {
            return this.onPromotionRewardsTabOfferCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard onPromotionRewardsTabOfferCard = this.onPromotionRewardsTabOfferCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PresentmentAsset(__typename=");
            sb.append(str);
            sb.append(", onPromotionRewardsTabOfferCard=");
            sb.append(onPromotionRewardsTabOfferCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard onPromotionRewardsTabOfferCard = this.onPromotionRewardsTabOfferCard;
            return (hashCode * 31) + (onPromotionRewardsTabOfferCard == null ? 0 : onPromotionRewardsTabOfferCard.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset presentmentAsset = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, presentmentAsset.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPromotionRewardsTabOfferCard, presentmentAsset.onPromotionRewardsTabOfferCard);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset copy(java.lang.String __typename, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard onPromotionRewardsTabOfferCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset(__typename, onPromotionRewardsTabOfferCard);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard getOnPromotionRewardsTabOfferCard() {
            return this.onPromotionRewardsTabOfferCard;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset presentmentAsset, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard onPromotionRewardsTabOfferCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = presentmentAsset.__typename;
            }
            if ((i & 2) != 0) {
                onPromotionRewardsTabOfferCard = presentmentAsset.onPromotionRewardsTabOfferCard;
            }
            return presentmentAsset.copy(str, onPromotionRewardsTabOfferCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010JN\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b#\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment$OnPromotionRewardsTabOfferCard;", "", "", "eligibleTitleText", "eligibleSubtitleText", "eligibleDescriptionText", "eligibleCardImageUrl", "eligibleCtaText", "eligibleCtaUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Object;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/EligiblePromotionOfferFragment$OnPromotionRewardsTabOfferCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEligibleTitleText", "getEligibleSubtitleText", "getEligibleDescriptionText", "Ljava/lang/Object;", "getEligibleCardImageUrl", "getEligibleCtaText", "getEligibleCtaUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPromotionRewardsTabOfferCard {
        public static final int $stable = 8;
        private final java.lang.Object eligibleCardImageUrl;
        private final java.lang.String eligibleCtaText;
        private final java.lang.Object eligibleCtaUrl;
        private final java.lang.String eligibleDescriptionText;
        private final java.lang.String eligibleSubtitleText;
        private final java.lang.String eligibleTitleText;

        public OnPromotionRewardsTabOfferCard(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.String str4, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.eligibleTitleText = str;
            this.eligibleSubtitleText = str2;
            this.eligibleDescriptionText = str3;
            this.eligibleCardImageUrl = obj;
            this.eligibleCtaText = str4;
            this.eligibleCtaUrl = obj2;
        }

        public final java.lang.String getEligibleTitleText() {
            return this.eligibleTitleText;
        }

        public final java.lang.String getEligibleSubtitleText() {
            return this.eligibleSubtitleText;
        }

        public final java.lang.String getEligibleDescriptionText() {
            return this.eligibleDescriptionText;
        }

        public final java.lang.Object getEligibleCardImageUrl() {
            return this.eligibleCardImageUrl;
        }

        public final java.lang.String getEligibleCtaText() {
            return this.eligibleCtaText;
        }

        public final java.lang.Object getEligibleCtaUrl() {
            return this.eligibleCtaUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.eligibleTitleText;
            java.lang.String str2 = this.eligibleSubtitleText;
            java.lang.String str3 = this.eligibleDescriptionText;
            java.lang.Object obj = this.eligibleCardImageUrl;
            java.lang.String str4 = this.eligibleCtaText;
            java.lang.Object obj2 = this.eligibleCtaUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPromotionRewardsTabOfferCard(eligibleTitleText=");
            sb.append(str);
            sb.append(", eligibleSubtitleText=");
            sb.append(str2);
            sb.append(", eligibleDescriptionText=");
            sb.append(str3);
            sb.append(", eligibleCardImageUrl=");
            sb.append(obj);
            sb.append(", eligibleCtaText=");
            sb.append(str4);
            sb.append(", eligibleCtaUrl=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.eligibleTitleText.hashCode();
            int hashCode2 = this.eligibleSubtitleText.hashCode();
            int hashCode3 = this.eligibleDescriptionText.hashCode();
            int hashCode4 = this.eligibleCardImageUrl.hashCode();
            int hashCode5 = this.eligibleCtaText.hashCode();
            java.lang.Object obj = this.eligibleCtaUrl;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard onPromotionRewardsTabOfferCard = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleTitleText, onPromotionRewardsTabOfferCard.eligibleTitleText) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleSubtitleText, onPromotionRewardsTabOfferCard.eligibleSubtitleText) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleDescriptionText, onPromotionRewardsTabOfferCard.eligibleDescriptionText) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleCardImageUrl, onPromotionRewardsTabOfferCard.eligibleCardImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleCtaText, onPromotionRewardsTabOfferCard.eligibleCtaText) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleCtaUrl, onPromotionRewardsTabOfferCard.eligibleCtaUrl);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard copy(java.lang.String eligibleTitleText, java.lang.String eligibleSubtitleText, java.lang.String eligibleDescriptionText, java.lang.Object eligibleCardImageUrl, java.lang.String eligibleCtaText, java.lang.Object eligibleCtaUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleTitleText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleSubtitleText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleDescriptionText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleCardImageUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleCtaText, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard(eligibleTitleText, eligibleSubtitleText, eligibleDescriptionText, eligibleCardImageUrl, eligibleCtaText, eligibleCtaUrl);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getEligibleCtaUrl() {
            return this.eligibleCtaUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getEligibleCtaText() {
            return this.eligibleCtaText;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getEligibleCardImageUrl() {
            return this.eligibleCardImageUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getEligibleDescriptionText() {
            return this.eligibleDescriptionText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEligibleSubtitleText() {
            return this.eligibleSubtitleText;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEligibleTitleText() {
            return this.eligibleTitleText;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard onPromotionRewardsTabOfferCard, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.String str4, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = onPromotionRewardsTabOfferCard.eligibleTitleText;
            }
            if ((i & 2) != 0) {
                str2 = onPromotionRewardsTabOfferCard.eligibleSubtitleText;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = onPromotionRewardsTabOfferCard.eligibleDescriptionText;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                obj = onPromotionRewardsTabOfferCard.eligibleCardImageUrl;
            }
            java.lang.Object obj4 = obj;
            if ((i & 16) != 0) {
                str4 = onPromotionRewardsTabOfferCard.eligibleCtaText;
            }
            java.lang.String str7 = str4;
            if ((i & 32) != 0) {
                obj2 = onPromotionRewardsTabOfferCard.eligibleCtaUrl;
            }
            return onPromotionRewardsTabOfferCard.copy(str, str5, str6, obj4, str7, obj2);
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset> list = this.presentmentAssets;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EligiblePromotionOfferFragment(presentmentAssets=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset> list = this.presentmentAssets;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.presentmentAssets, ((com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment) other).presentmentAssets);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset> presentmentAssets) {
        return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment(presentmentAssets);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset> component1() {
        return this.presentmentAssets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment eligiblePromotionOfferFragment, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = eligiblePromotionOfferFragment.presentmentAssets;
        }
        return eligiblePromotionOfferFragment.copy(list);
    }
}
