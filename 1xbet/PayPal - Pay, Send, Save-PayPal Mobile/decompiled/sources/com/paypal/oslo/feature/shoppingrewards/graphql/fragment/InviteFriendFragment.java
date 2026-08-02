package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$PresentmentAsset;", "presentmentAssets", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPresentmentAssets", "PresentmentAsset", "OnPromotionSingleCtaOfferCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InviteFriendFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset> presentmentAssets;

    public InviteFriendFragment(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset> list) {
        this.presentmentAssets = list;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset> getPresentmentAssets() {
        return this.presentmentAssets;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$PresentmentAsset;", "", "", "__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$OnPromotionSingleCtaOfferCard;", "onPromotionSingleCtaOfferCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$OnPromotionSingleCtaOfferCard;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$OnPromotionSingleCtaOfferCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$OnPromotionSingleCtaOfferCard;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$PresentmentAsset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$OnPromotionSingleCtaOfferCard;", "getOnPromotionSingleCtaOfferCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PresentmentAsset {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard onPromotionSingleCtaOfferCard;

        public PresentmentAsset(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard onPromotionSingleCtaOfferCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPromotionSingleCtaOfferCard = onPromotionSingleCtaOfferCard;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard getOnPromotionSingleCtaOfferCard() {
            return this.onPromotionSingleCtaOfferCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard onPromotionSingleCtaOfferCard = this.onPromotionSingleCtaOfferCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PresentmentAsset(__typename=");
            sb.append(str);
            sb.append(", onPromotionSingleCtaOfferCard=");
            sb.append(onPromotionSingleCtaOfferCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard onPromotionSingleCtaOfferCard = this.onPromotionSingleCtaOfferCard;
            return (hashCode * 31) + (onPromotionSingleCtaOfferCard == null ? 0 : onPromotionSingleCtaOfferCard.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset presentmentAsset = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, presentmentAsset.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPromotionSingleCtaOfferCard, presentmentAsset.onPromotionSingleCtaOfferCard);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset copy(java.lang.String __typename, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard onPromotionSingleCtaOfferCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset(__typename, onPromotionSingleCtaOfferCard);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard getOnPromotionSingleCtaOfferCard() {
            return this.onPromotionSingleCtaOfferCard;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset presentmentAsset, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard onPromotionSingleCtaOfferCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = presentmentAsset.__typename;
            }
            if ((i & 2) != 0) {
                onPromotionSingleCtaOfferCard = presentmentAsset.onPromotionSingleCtaOfferCard;
            }
            return presentmentAsset.copy(str, onPromotionSingleCtaOfferCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JX\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u0010R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b'\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b(\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$OnPromotionSingleCtaOfferCard;", "", "localeCode", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "cardImageUrl", "ctaText", "termsText", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentNavigationType;", "navigationType", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentNavigationType;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentNavigationType;", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentNavigationType;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$OnPromotionSingleCtaOfferCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getLocaleCode", "Ljava/lang/String;", "getTitle", "getDescription", "getCardImageUrl", "getCtaText", "getTermsText", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentNavigationType;", "getNavigationType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPromotionSingleCtaOfferCard {
        public static final int $stable = 8;
        private final java.lang.Object cardImageUrl;
        private final java.lang.String ctaText;
        private final java.lang.String description;
        private final java.lang.Object localeCode;
        private final com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType navigationType;
        private final java.lang.String termsText;
        private final java.lang.String title;

        public OnPromotionSingleCtaOfferCard(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType promotionsOfferPresentmentNavigationType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.localeCode = obj;
            this.title = str;
            this.description = str2;
            this.cardImageUrl = obj2;
            this.ctaText = str3;
            this.termsText = str4;
            this.navigationType = promotionsOfferPresentmentNavigationType;
        }

        public final java.lang.Object getLocaleCode() {
            return this.localeCode;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.Object getCardImageUrl() {
            return this.cardImageUrl;
        }

        public final java.lang.String getCtaText() {
            return this.ctaText;
        }

        public final java.lang.String getTermsText() {
            return this.termsText;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType getNavigationType() {
            return this.navigationType;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.localeCode;
            java.lang.String str = this.title;
            java.lang.String str2 = this.description;
            java.lang.Object obj2 = this.cardImageUrl;
            java.lang.String str3 = this.ctaText;
            java.lang.String str4 = this.termsText;
            com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType promotionsOfferPresentmentNavigationType = this.navigationType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPromotionSingleCtaOfferCard(localeCode=");
            sb.append(obj);
            sb.append(", title=");
            sb.append(str);
            sb.append(", description=");
            sb.append(str2);
            sb.append(", cardImageUrl=");
            sb.append(obj2);
            sb.append(", ctaText=");
            sb.append(str3);
            sb.append(", termsText=");
            sb.append(str4);
            sb.append(", navigationType=");
            sb.append(promotionsOfferPresentmentNavigationType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.localeCode.hashCode();
            int hashCode2 = this.title.hashCode();
            int hashCode3 = this.description.hashCode();
            int hashCode4 = this.cardImageUrl.hashCode();
            int hashCode5 = this.ctaText.hashCode();
            int hashCode6 = this.termsText.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType promotionsOfferPresentmentNavigationType = this.navigationType;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (promotionsOfferPresentmentNavigationType == null ? 0 : promotionsOfferPresentmentNavigationType.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard onPromotionSingleCtaOfferCard = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.localeCode, onPromotionSingleCtaOfferCard.localeCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, onPromotionSingleCtaOfferCard.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, onPromotionSingleCtaOfferCard.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardImageUrl, onPromotionSingleCtaOfferCard.cardImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctaText, onPromotionSingleCtaOfferCard.ctaText) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsText, onPromotionSingleCtaOfferCard.termsText) && this.navigationType == onPromotionSingleCtaOfferCard.navigationType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard copy(java.lang.Object localeCode, java.lang.String title, java.lang.String description, java.lang.Object cardImageUrl, java.lang.String ctaText, java.lang.String termsText, com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType navigationType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardImageUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctaText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsText, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard(localeCode, title, description, cardImageUrl, ctaText, termsText, navigationType);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType getNavigationType() {
            return this.navigationType;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getTermsText() {
            return this.termsText;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getCardImageUrl() {
            return this.cardImageUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getLocaleCode() {
            return this.localeCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard onPromotionSingleCtaOfferCard, java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType promotionsOfferPresentmentNavigationType, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                obj = onPromotionSingleCtaOfferCard.localeCode;
            }
            if ((i & 2) != 0) {
                str = onPromotionSingleCtaOfferCard.title;
            }
            java.lang.String str5 = str;
            if ((i & 4) != 0) {
                str2 = onPromotionSingleCtaOfferCard.description;
            }
            java.lang.String str6 = str2;
            if ((i & 8) != 0) {
                obj2 = onPromotionSingleCtaOfferCard.cardImageUrl;
            }
            java.lang.Object obj4 = obj2;
            if ((i & 16) != 0) {
                str3 = onPromotionSingleCtaOfferCard.ctaText;
            }
            java.lang.String str7 = str3;
            if ((i & 32) != 0) {
                str4 = onPromotionSingleCtaOfferCard.termsText;
            }
            java.lang.String str8 = str4;
            if ((i & 64) != 0) {
                promotionsOfferPresentmentNavigationType = onPromotionSingleCtaOfferCard.navigationType;
            }
            return onPromotionSingleCtaOfferCard.copy(obj, str5, str6, obj4, str7, str8, promotionsOfferPresentmentNavigationType);
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset> list = this.presentmentAssets;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InviteFriendFragment(presentmentAssets=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset> list = this.presentmentAssets;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.presentmentAssets, ((com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment) other).presentmentAssets);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset> presentmentAssets) {
        return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment(presentmentAssets);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset> component1() {
        return this.presentmentAssets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment inviteFriendFragment, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = inviteFriendFragment.presentmentAssets;
        }
        return inviteFriendFragment.copy(list);
    }
}
