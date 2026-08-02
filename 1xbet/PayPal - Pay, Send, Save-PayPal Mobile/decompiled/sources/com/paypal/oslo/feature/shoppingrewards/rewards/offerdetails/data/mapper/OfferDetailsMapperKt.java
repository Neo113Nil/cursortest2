package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.mapper;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0006\u0010\t\u001a3\u0010\u0012\u001a\u00020\u00112\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\"&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00178\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentProgressBarType;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/type/PromotionsOfferPresentmentProgressBarType;", "barType", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInPromotionOfferMutation$Progress;", "progress", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;", "toOfferProgress", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentProgressBarType;Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInPromotionOfferMutation$Progress;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Progress;", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentProgressBarType;Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Progress;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;", "", "enrollments", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/type/PromotionOfferEnrollmentStatus;", "lastEnrollmentStatus", "", "offerId", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferState;", "determineOfferState", "(Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/IconType;", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/IconType;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInPromotionOfferMutation$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase$Response;", "activateOfferDataMapper", "Lkotlin/jvm/functions/Function1;", "getActivateOfferDataMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetOfferDetailsQuery$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/GetOfferDetailsUseCase$Response;", "getOfferDetailsDataMapper", "getGetOfferDetailsDataMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OfferDetailsMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.Data, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response> activateOfferDataMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.mapper.OfferDetailsMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.mapper.OfferDetailsMapperKt.$r8$lambda$bRRb9bvz6d7hFjNup8XriDMlA68((com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.Data) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase.Response> getOfferDetailsDataMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.mapper.OfferDetailsMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.mapper.OfferDetailsMapperKt.$r8$lambda$pEJOG8R3pKZD4GW01mKrxQv5axI((com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.Data, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response> getActivateOfferDataMapper() {
        return activateOfferDataMapper;
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress toOfferProgress(com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType promotionsOfferPresentmentProgressBarType, com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.Progress progress) {
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment discreteRewardSummaryProgressFragment;
        com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet offerProgress$shopping_rewards_prodRelease;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ContinuousRewardSummaryProgressFragment continuousRewardSummaryProgressFragment;
        com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous offerProgress$shopping_rewards_prodRelease2;
        int i = promotionsOfferPresentmentProgressBarType == null ? -1 : com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.mapper.OfferDetailsMapperKt.WhenMappings.$EnumSwitchMapping$0[promotionsOfferPresentmentProgressBarType.ordinal()];
        if (i == 1) {
            return (progress == null || (discreteRewardSummaryProgressFragment = progress.getDiscreteRewardSummaryProgressFragment()) == null || (offerProgress$shopping_rewards_prodRelease = com.paypal.oslo.feature.shoppingrewards.rewards.common.data.OfferProgressDataMapper.INSTANCE.getOfferProgress$shopping_rewards_prodRelease(discreteRewardSummaryProgressFragment)) == null) ? com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None.INSTANCE : offerProgress$shopping_rewards_prodRelease;
        }
        if (i != 2) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None.INSTANCE;
        }
        return (progress == null || (continuousRewardSummaryProgressFragment = progress.getContinuousRewardSummaryProgressFragment()) == null || (offerProgress$shopping_rewards_prodRelease2 = com.paypal.oslo.feature.shoppingrewards.rewards.common.data.OfferProgressDataMapper.INSTANCE.getOfferProgress$shopping_rewards_prodRelease(continuousRewardSummaryProgressFragment)) == null) ? com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None.INSTANCE : offerProgress$shopping_rewards_prodRelease2;
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress toOfferProgress(com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType promotionsOfferPresentmentProgressBarType, com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Progress progress) {
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment discreteRewardSummaryProgressFragment;
        com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet offerProgress$shopping_rewards_prodRelease;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ContinuousRewardSummaryProgressFragment continuousRewardSummaryProgressFragment;
        com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous offerProgress$shopping_rewards_prodRelease2;
        int i = promotionsOfferPresentmentProgressBarType == null ? -1 : com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.mapper.OfferDetailsMapperKt.WhenMappings.$EnumSwitchMapping$0[promotionsOfferPresentmentProgressBarType.ordinal()];
        if (i == 1) {
            return (progress == null || (discreteRewardSummaryProgressFragment = progress.getDiscreteRewardSummaryProgressFragment()) == null || (offerProgress$shopping_rewards_prodRelease = com.paypal.oslo.feature.shoppingrewards.rewards.common.data.OfferProgressDataMapper.INSTANCE.getOfferProgress$shopping_rewards_prodRelease(discreteRewardSummaryProgressFragment)) == null) ? com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None.INSTANCE : offerProgress$shopping_rewards_prodRelease;
        }
        if (i != 2) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None.INSTANCE;
        }
        return (progress == null || (continuousRewardSummaryProgressFragment = progress.getContinuousRewardSummaryProgressFragment()) == null || (offerProgress$shopping_rewards_prodRelease2 = com.paypal.oslo.feature.shoppingrewards.rewards.common.data.OfferProgressDataMapper.INSTANCE.getOfferProgress$shopping_rewards_prodRelease(continuousRewardSummaryProgressFragment)) == null) ? com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None.INSTANCE : offerProgress$shopping_rewards_prodRelease2;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase.Response> getGetOfferDetailsDataMapper() {
        return getOfferDetailsDataMapper;
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState determineOfferState(java.util.List<?> list, com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus promotionOfferEnrollmentStatus, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (promotionOfferEnrollmentStatus == com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus.ENABLED) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.ACTIVE;
        }
        if (list.isEmpty()) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.INACTIVE;
        }
        if (promotionOfferEnrollmentStatus == com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus.EXPIRED) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.INACTIVE;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.shoppingrewards.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("offerId", str);
        pairArr[1] = kotlin.TuplesKt.to("enrollmentStatus", promotionOfferEnrollmentStatus != null ? promotionOfferEnrollmentStatus.name() : null);
        com.paypal.android.logger.Logger.w$default(logger, "Unknown enrollment status, defaulting to INACTIVE state", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        return com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.INACTIVE;
    }

    private static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.String str2 = str;
        return kotlin.text.StringsKt.contains((java.lang.CharSequence) str2, (java.lang.CharSequence) "clock", true) ? com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.CLOCK_ICON : kotlin.text.StringsKt.contains((java.lang.CharSequence) str2, (java.lang.CharSequence) "cart", true) ? com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.CART_ICON : kotlin.text.StringsKt.contains((java.lang.CharSequence) str2, (java.lang.CharSequence) "shopping", true) ? com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.SHOPPING_BAG_ICON : kotlin.text.StringsKt.contains((java.lang.CharSequence) str2, (java.lang.CharSequence) "trophy", true) ? com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.TROPHY_ICON : kotlin.text.StringsKt.contains((java.lang.CharSequence) str2, (java.lang.CharSequence) "check", true) ? com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.CHECK_ICON : com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.NONE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r3 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response $r8$lambda$bRRb9bvz6d7hFjNup8XriDMlA68(com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.Data data) {
        com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType promotionsOfferPresentmentProgressBarType;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState offerState;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List<java.lang.Object> termsUrls;
        java.util.List<java.lang.String> detailsText;
        java.util.List zip;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment userEnrollmentsFragment;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment> userEnrollments;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.UserRewardSummary> userRewardSummary;
        com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.UserRewardSummary userRewardSummary2;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment offerDetailsFragment;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset> presentmentAssets;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset presentmentAsset;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.Offer offer = data.getEnrollInPromotionOffer().getOffer();
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails = null;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet onPromotionOfferEducationHalfSheet = (offer == null || (offerDetailsFragment = offer.getOfferDetailsFragment()) == null || (presentmentAssets = offerDetailsFragment.getPresentmentAssets()) == null || (presentmentAsset = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) presentmentAssets)) == null) ? null : presentmentAsset.getOnPromotionOfferEducationHalfSheet();
        if (onPromotionOfferEducationHalfSheet == null || (promotionsOfferPresentmentProgressBarType = onPromotionOfferEducationHalfSheet.getActivatedProgressBarType()) == null) {
            promotionsOfferPresentmentProgressBarType = com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType.UNKNOWN__;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress offerProgress = toOfferProgress(promotionsOfferPresentmentProgressBarType, (offer == null || (userRewardSummary = offer.getUserRewardSummary()) == null || (userRewardSummary2 = (com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.UserRewardSummary) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) userRewardSummary)) == null) ? null : userRewardSummary2.getProgress());
        if (offer != null && (userEnrollmentsFragment = offer.getUserEnrollmentsFragment()) != null && (userEnrollments = userEnrollmentsFragment.getUserEnrollments()) != null) {
            offerState = !userEnrollments.isEmpty() ? com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.ACTIVE : com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.INACTIVE;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "userEnrollmentsFragment is null, defaulting to INACTIVE state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("offerId", offer != null ? offer.getId() : null)), null, 4, null);
        offerState = com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.INACTIVE;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState offerState2 = offerState;
        if (offer != null) {
            java.lang.String id = offer.getId();
            java.lang.String title = onPromotionOfferEducationHalfSheet != null ? onPromotionOfferEducationHalfSheet.getTitle() : null;
            java.lang.String subtitle = onPromotionOfferEducationHalfSheet != null ? onPromotionOfferEducationHalfSheet.getSubtitle() : null;
            java.lang.Object merchantLogoUrl = onPromotionOfferEducationHalfSheet != null ? onPromotionOfferEducationHalfSheet.getMerchantLogoUrl() : null;
            java.lang.String str = merchantLogoUrl instanceof java.lang.String ? (java.lang.String) merchantLogoUrl : null;
            if (onPromotionOfferEducationHalfSheet == null || (detailsText = onPromotionOfferEducationHalfSheet.getDetailsText()) == null || (zip = kotlin.collections.CollectionsKt.zip(detailsText, onPromotionOfferEducationHalfSheet.getDetailsIcons())) == null) {
                arrayList = null;
            } else {
                java.util.List<kotlin.Pair> list = zip;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (kotlin.Pair pair : list) {
                    arrayList3.add(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetailsItem(getHighSpeedVideoSizes((java.lang.String) pair.component2()), (java.lang.String) pair.component1()));
                }
                arrayList = arrayList3;
            }
            java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
            java.lang.String termsText = onPromotionOfferEducationHalfSheet != null ? onPromotionOfferEducationHalfSheet.getTermsText() : null;
            java.lang.Object termsUrl = onPromotionOfferEducationHalfSheet != null ? onPromotionOfferEducationHalfSheet.getTermsUrl() : null;
            java.lang.String str2 = termsUrl instanceof java.lang.String ? (java.lang.String) termsUrl : null;
            if (onPromotionOfferEducationHalfSheet == null || (termsUrls = onPromotionOfferEducationHalfSheet.getTermsUrls()) == null) {
                arrayList2 = null;
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj : termsUrls) {
                    if (obj instanceof java.lang.String) {
                        arrayList4.add(obj);
                    }
                }
                arrayList2 = arrayList4;
            }
            java.util.List emptyList2 = arrayList2 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList2;
            java.lang.String eligibleCtaText = onPromotionOfferEducationHalfSheet != null ? onPromotionOfferEducationHalfSheet.getEligibleCtaText() : null;
            java.lang.String activatedCtaText = onPromotionOfferEducationHalfSheet != null ? onPromotionOfferEducationHalfSheet.getActivatedCtaText() : null;
            java.lang.Object activatedCtaUrl = onPromotionOfferEducationHalfSheet != null ? onPromotionOfferEducationHalfSheet.getActivatedCtaUrl() : null;
            offerDetails = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails(id, title, subtitle, offerProgress, str, emptyList, termsText, str2, emptyList2, offerState2, eligibleCtaText, activatedCtaText, activatedCtaUrl instanceof java.lang.String ? (java.lang.String) activatedCtaUrl : null);
        }
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response(offerDetails);
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase.Response $r8$lambda$pEJOG8R3pKZD4GW01mKrxQv5axI(com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Data data) {
        com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType promotionsOfferPresentmentProgressBarType;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary userRewardSummary;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset> presentmentAssets;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset presentmentAsset;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item item = (com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.Item) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) data.getPromotionOffers().getItems());
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails = null;
        if (item != null) {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment> userEnrollments = item.getUserEnrollmentsFragment().getUserEnrollments();
            if (userEnrollments == null) {
                userEnrollments = kotlin.collections.CollectionsKt.emptyList();
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment userEnrollment = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) userEnrollments);
            com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus status = userEnrollment != null ? userEnrollment.getStatus() : null;
            int i = status == null ? -1 : com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.mapper.OfferDetailsMapperKt.WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i != 1 && i != 2) {
                com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment offerDetailsFragment = item.getOfferDetailsFragment();
                com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet onPromotionOfferEducationHalfSheet = (offerDetailsFragment == null || (presentmentAssets = offerDetailsFragment.getPresentmentAssets()) == null || (presentmentAsset = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) presentmentAssets)) == null) ? null : presentmentAsset.getOnPromotionOfferEducationHalfSheet();
                if (onPromotionOfferEducationHalfSheet == null || (promotionsOfferPresentmentProgressBarType = onPromotionOfferEducationHalfSheet.getActivatedProgressBarType()) == null) {
                    promotionsOfferPresentmentProgressBarType = com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType.UNKNOWN__;
                }
                java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary> userRewardSummary2 = item.getUserRewardSummary();
                com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress offerProgress = toOfferProgress(promotionsOfferPresentmentProgressBarType, (userRewardSummary2 == null || (userRewardSummary = (com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery.UserRewardSummary) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) userRewardSummary2)) == null) ? null : userRewardSummary.getProgress());
                com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState determineOfferState = determineOfferState(userEnrollments, status, item.getId());
                if (onPromotionOfferEducationHalfSheet != null) {
                    java.lang.String id = item.getId();
                    java.lang.String title = onPromotionOfferEducationHalfSheet.getTitle();
                    java.lang.String subtitle = onPromotionOfferEducationHalfSheet.getSubtitle();
                    java.lang.Object merchantLogoUrl = onPromotionOfferEducationHalfSheet.getMerchantLogoUrl();
                    java.lang.String str = merchantLogoUrl instanceof java.lang.String ? (java.lang.String) merchantLogoUrl : null;
                    java.util.List<kotlin.Pair> zip = kotlin.collections.CollectionsKt.zip(onPromotionOfferEducationHalfSheet.getDetailsText(), onPromotionOfferEducationHalfSheet.getDetailsIcons());
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(zip, 10));
                    for (kotlin.Pair pair : zip) {
                        arrayList2.add(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetailsItem(getHighSpeedVideoSizes((java.lang.String) pair.component2()), (java.lang.String) pair.component1()));
                    }
                    java.util.ArrayList arrayList3 = arrayList2;
                    java.lang.String termsText = onPromotionOfferEducationHalfSheet.getTermsText();
                    java.lang.Object termsUrl = onPromotionOfferEducationHalfSheet.getTermsUrl();
                    java.lang.String str2 = termsUrl instanceof java.lang.String ? (java.lang.String) termsUrl : null;
                    java.util.List<java.lang.Object> termsUrls = onPromotionOfferEducationHalfSheet.getTermsUrls();
                    if (termsUrls != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        for (java.lang.Object obj : termsUrls) {
                            if (obj instanceof java.lang.String) {
                                arrayList4.add(obj);
                            }
                        }
                        arrayList = arrayList4;
                    } else {
                        arrayList = null;
                    }
                    java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
                    java.lang.String eligibleCtaText = onPromotionOfferEducationHalfSheet.getEligibleCtaText();
                    java.lang.String activatedCtaText = onPromotionOfferEducationHalfSheet.getActivatedCtaText();
                    java.lang.Object activatedCtaUrl = onPromotionOfferEducationHalfSheet.getActivatedCtaUrl();
                    offerDetails = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails(id, title, subtitle, offerProgress, str, arrayList3, termsText, str2, emptyList, determineOfferState, eligibleCtaText, activatedCtaText, activatedCtaUrl instanceof java.lang.String ? (java.lang.String) activatedCtaUrl : null);
                }
                return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase.Response(offerDetails);
            }
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType.DISCRETE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType.CONTINUOUS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus.DISABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus.DORMANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
