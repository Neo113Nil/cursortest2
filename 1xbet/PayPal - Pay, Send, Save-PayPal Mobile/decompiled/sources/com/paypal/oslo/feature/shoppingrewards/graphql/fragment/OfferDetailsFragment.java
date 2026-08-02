package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$PresentmentAsset;", "presentmentAssets", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPresentmentAssets", "PresentmentAsset", "OnPromotionOfferEducationHalfSheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OfferDetailsFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset> presentmentAssets;

    public OfferDetailsFragment(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset> list) {
        this.presentmentAssets = list;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset> getPresentmentAssets() {
        return this.presentmentAssets;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$PresentmentAsset;", "", "", "__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$OnPromotionOfferEducationHalfSheet;", "onPromotionOfferEducationHalfSheet", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$OnPromotionOfferEducationHalfSheet;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$OnPromotionOfferEducationHalfSheet;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$OnPromotionOfferEducationHalfSheet;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$PresentmentAsset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$OnPromotionOfferEducationHalfSheet;", "getOnPromotionOfferEducationHalfSheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class PresentmentAsset {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet onPromotionOfferEducationHalfSheet;

        public PresentmentAsset(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet onPromotionOfferEducationHalfSheet) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPromotionOfferEducationHalfSheet = onPromotionOfferEducationHalfSheet;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet getOnPromotionOfferEducationHalfSheet() {
            return this.onPromotionOfferEducationHalfSheet;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet onPromotionOfferEducationHalfSheet = this.onPromotionOfferEducationHalfSheet;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PresentmentAsset(__typename=");
            sb.append(str);
            sb.append(", onPromotionOfferEducationHalfSheet=");
            sb.append(onPromotionOfferEducationHalfSheet);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet onPromotionOfferEducationHalfSheet = this.onPromotionOfferEducationHalfSheet;
            return (hashCode * 31) + (onPromotionOfferEducationHalfSheet == null ? 0 : onPromotionOfferEducationHalfSheet.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset presentmentAsset = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, presentmentAsset.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPromotionOfferEducationHalfSheet, presentmentAsset.onPromotionOfferEducationHalfSheet);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset copy(java.lang.String __typename, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet onPromotionOfferEducationHalfSheet) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset(__typename, onPromotionOfferEducationHalfSheet);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet getOnPromotionOfferEducationHalfSheet() {
            return this.onPromotionOfferEducationHalfSheet;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset presentmentAsset, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet onPromotionOfferEducationHalfSheet, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = presentmentAsset.__typename;
            }
            if ((i & 2) != 0) {
                onPromotionOfferEducationHalfSheet = presentmentAsset.onPromotionOfferEducationHalfSheet;
            }
            return presentmentAsset.copy(str, onPromotionOfferEducationHalfSheet);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ¨\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0017R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b2\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u0014R \u0010\t\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u001bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b8\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b9\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b:\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b;\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b>\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$OnPromotionOfferEducationHalfSheet;", "", "", "title", "subtitle", "", "detailsText", "detailsIcons", "termsText", "termsUrl", "termsUrls", "eligibleCtaText", "activatedCtaText", "activatedCtaUrl", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentProgressBarType;", "activatedProgressBarType", "merchantLogoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentProgressBarType;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Ljava/lang/Object;", "component7", "component8", "component9", "component10", "component11", "()Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentProgressBarType;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentProgressBarType;Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$OnPromotionOfferEducationHalfSheet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getDetailsText", "getDetailsIcons", "getTermsText", "Ljava/lang/Object;", "getTermsUrl", "getTermsUrl$annotations", "()V", "getTermsUrls", "getEligibleCtaText", "getActivatedCtaText", "getActivatedCtaUrl", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentProgressBarType;", "getActivatedProgressBarType", "getMerchantLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPromotionOfferEducationHalfSheet {
        public static final int $stable = 8;
        private final java.lang.String activatedCtaText;
        private final java.lang.Object activatedCtaUrl;
        private final com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType activatedProgressBarType;
        private final java.util.List<java.lang.String> detailsIcons;
        private final java.util.List<java.lang.String> detailsText;
        private final java.lang.String eligibleCtaText;
        private final java.lang.Object merchantLogoUrl;
        private final java.lang.String subtitle;
        private final java.lang.String termsText;
        private final java.lang.Object termsUrl;
        private final java.util.List<java.lang.Object> termsUrls;
        private final java.lang.String title;

        @kotlin.Deprecated(message = "Use termsUrls instead for multiple terms URLs support")
        public static /* synthetic */ void getTermsUrl$annotations() {
        }

        public OnPromotionOfferEducationHalfSheet(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.String str3, java.lang.Object obj, java.util.List<? extends java.lang.Object> list3, java.lang.String str4, java.lang.String str5, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType promotionsOfferPresentmentProgressBarType, java.lang.Object obj3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.title = str;
            this.subtitle = str2;
            this.detailsText = list;
            this.detailsIcons = list2;
            this.termsText = str3;
            this.termsUrl = obj;
            this.termsUrls = list3;
            this.eligibleCtaText = str4;
            this.activatedCtaText = str5;
            this.activatedCtaUrl = obj2;
            this.activatedProgressBarType = promotionsOfferPresentmentProgressBarType;
            this.merchantLogoUrl = obj3;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        public final java.util.List<java.lang.String> getDetailsText() {
            return this.detailsText;
        }

        public final java.util.List<java.lang.String> getDetailsIcons() {
            return this.detailsIcons;
        }

        public final java.lang.String getTermsText() {
            return this.termsText;
        }

        public final java.lang.Object getTermsUrl() {
            return this.termsUrl;
        }

        public final java.util.List<java.lang.Object> getTermsUrls() {
            return this.termsUrls;
        }

        public final java.lang.String getEligibleCtaText() {
            return this.eligibleCtaText;
        }

        public final java.lang.String getActivatedCtaText() {
            return this.activatedCtaText;
        }

        public final java.lang.Object getActivatedCtaUrl() {
            return this.activatedCtaUrl;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType getActivatedProgressBarType() {
            return this.activatedProgressBarType;
        }

        public final java.lang.Object getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.String str2 = this.subtitle;
            java.util.List<java.lang.String> list = this.detailsText;
            java.util.List<java.lang.String> list2 = this.detailsIcons;
            java.lang.String str3 = this.termsText;
            java.lang.Object obj = this.termsUrl;
            java.util.List<java.lang.Object> list3 = this.termsUrls;
            java.lang.String str4 = this.eligibleCtaText;
            java.lang.String str5 = this.activatedCtaText;
            java.lang.Object obj2 = this.activatedCtaUrl;
            com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType promotionsOfferPresentmentProgressBarType = this.activatedProgressBarType;
            java.lang.Object obj3 = this.merchantLogoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPromotionOfferEducationHalfSheet(title=");
            sb.append(str);
            sb.append(", subtitle=");
            sb.append(str2);
            sb.append(", detailsText=");
            sb.append(list);
            sb.append(", detailsIcons=");
            sb.append(list2);
            sb.append(", termsText=");
            sb.append(str3);
            sb.append(", termsUrl=");
            sb.append(obj);
            sb.append(", termsUrls=");
            sb.append(list3);
            sb.append(", eligibleCtaText=");
            sb.append(str4);
            sb.append(", activatedCtaText=");
            sb.append(str5);
            sb.append(", activatedCtaUrl=");
            sb.append(obj2);
            sb.append(", activatedProgressBarType=");
            sb.append(promotionsOfferPresentmentProgressBarType);
            sb.append(", merchantLogoUrl=");
            sb.append(obj3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode();
            java.lang.String str = this.subtitle;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.detailsText.hashCode();
            int hashCode4 = this.detailsIcons.hashCode();
            int hashCode5 = this.termsText.hashCode();
            int hashCode6 = this.termsUrl.hashCode();
            java.util.List<java.lang.Object> list = this.termsUrls;
            int hashCode7 = list == null ? 0 : list.hashCode();
            java.lang.String str2 = this.eligibleCtaText;
            int hashCode8 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.activatedCtaText;
            int hashCode9 = str3 == null ? 0 : str3.hashCode();
            java.lang.Object obj = this.activatedCtaUrl;
            int hashCode10 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType promotionsOfferPresentmentProgressBarType = this.activatedProgressBarType;
            int hashCode11 = promotionsOfferPresentmentProgressBarType == null ? 0 : promotionsOfferPresentmentProgressBarType.hashCode();
            java.lang.Object obj2 = this.merchantLogoUrl;
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (obj2 != null ? obj2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet onPromotionOfferEducationHalfSheet = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, onPromotionOfferEducationHalfSheet.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, onPromotionOfferEducationHalfSheet.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.detailsText, onPromotionOfferEducationHalfSheet.detailsText) && kotlin.jvm.internal.Intrinsics.areEqual(this.detailsIcons, onPromotionOfferEducationHalfSheet.detailsIcons) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsText, onPromotionOfferEducationHalfSheet.termsText) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsUrl, onPromotionOfferEducationHalfSheet.termsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsUrls, onPromotionOfferEducationHalfSheet.termsUrls) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleCtaText, onPromotionOfferEducationHalfSheet.eligibleCtaText) && kotlin.jvm.internal.Intrinsics.areEqual(this.activatedCtaText, onPromotionOfferEducationHalfSheet.activatedCtaText) && kotlin.jvm.internal.Intrinsics.areEqual(this.activatedCtaUrl, onPromotionOfferEducationHalfSheet.activatedCtaUrl) && this.activatedProgressBarType == onPromotionOfferEducationHalfSheet.activatedProgressBarType && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantLogoUrl, onPromotionOfferEducationHalfSheet.merchantLogoUrl);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet copy(java.lang.String title, java.lang.String subtitle, java.util.List<java.lang.String> detailsText, java.util.List<java.lang.String> detailsIcons, java.lang.String termsText, java.lang.Object termsUrl, java.util.List<? extends java.lang.Object> termsUrls, java.lang.String eligibleCtaText, java.lang.String activatedCtaText, java.lang.Object activatedCtaUrl, com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType activatedProgressBarType, java.lang.Object merchantLogoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsIcons, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsUrl, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet(title, subtitle, detailsText, detailsIcons, termsText, termsUrl, termsUrls, eligibleCtaText, activatedCtaText, activatedCtaUrl, activatedProgressBarType, merchantLogoUrl);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getActivatedCtaText() {
            return this.activatedCtaText;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getEligibleCtaText() {
            return this.eligibleCtaText;
        }

        public final java.util.List<java.lang.Object> component7() {
            return this.termsUrls;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getTermsUrl() {
            return this.termsUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getTermsText() {
            return this.termsText;
        }

        public final java.util.List<java.lang.String> component4() {
            return this.detailsIcons;
        }

        public final java.util.List<java.lang.String> component3() {
            return this.detailsText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.Object getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType getActivatedProgressBarType() {
            return this.activatedProgressBarType;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.Object getActivatedCtaUrl() {
            return this.activatedCtaUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset> list = this.presentmentAssets;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OfferDetailsFragment(presentmentAssets=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset> list = this.presentmentAssets;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.presentmentAssets, ((com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment) other).presentmentAssets);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset> presentmentAssets) {
        return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment(presentmentAssets);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset> component1() {
        return this.presentmentAssets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment offerDetailsFragment, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = offerDetailsFragment.presentmentAssets;
        }
        return offerDetailsFragment.copy(list);
    }
}
