package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n*\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\n*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\n8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0019\u001a\u00020\r*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001aR\u0015\u0010\u001e\u001a\u00020\r*\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\n*\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001fR\u0015\u0010\u0019\u001a\u00020\r*\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/ActiveOffersUiMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/models/ActiveOfferData;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;", "stringResourceProvider", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferCardUiData;", "toUiData", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/models/ActiveOfferData;Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferCardUiData;", "", "toUiList", "(Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;)Ljava/util/List;", "", "toUiTimeLeftLabel", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType;", "getProgressContentDescription", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType;)Ljava/lang/String;", "progressContentDescription", "getContentDescriptionReadoutList", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferCardUiData;)Ljava/util/List;", "contentDescriptionReadoutList", "getContentDescription", "(Ljava/util/List;)Ljava/lang/String;", "contentDescription", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferCardUiData;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/inactiveoffercard/InactiveOfferCardUiData;", "getTitleCategoryReadout", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/inactiveoffercard/InactiveOfferCardUiData;)Ljava/lang/String;", "titleCategoryReadout", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/inactiveoffercard/InactiveOfferCardUiData;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActiveOffersUiMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersUiMapper INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersUiMapper();

    private ActiveOffersUiMapper() {
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData toUiData(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData activeOfferData, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOfferData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringResourceProvider, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData(activeOfferData.getTargetingUnitId(), activeOfferData.getTitle(), activeOfferData.getDescription(), activeOfferData.getImageUrl(), toUiTimeLeftLabel(activeOfferData.getTimeLeftLabel(), stringResourceProvider), com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.UiDataMappers.INSTANCE.toOfferProgressType(activeOfferData.getOfferProgress()), com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgressKt.isCompleted(activeOfferData.getOfferProgress()), activeOfferData.getNavigationType());
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData> toUiList(java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> list, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringResourceProvider, "");
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.toUiData((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData) it.next(), stringResourceProvider));
        }
        return arrayList;
    }

    public final java.lang.String getProgressContentDescription(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType offerProgressType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerProgressType, "");
        if (offerProgressType instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear) {
            float percentCompleted = ((com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear) offerProgressType).getPercentCompleted();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(percentCompleted);
            sb.append(" completed.");
            return sb.toString();
        }
        if (offerProgressType instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar avatar = (com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar) offerProgressType;
            int progressValue = avatar.getProgressValue();
            int maxValue = avatar.getMaxValue();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(progressValue);
            sb2.append(" of ");
            sb2.append(maxValue);
            sb2.append(" purchases completed.");
            return sb2.toString();
        }
        if (offerProgressType instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.None) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.util.List<java.lang.String> getContentDescriptionReadoutList(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData activeOfferCardUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOfferCardUiData, "");
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = activeOfferCardUiData.getTitle();
        strArr[1] = activeOfferCardUiData.getDescription();
        strArr[2] = activeOfferCardUiData.getTimeLeftLabel();
        java.lang.String progressContentDescription = getProgressContentDescription(activeOfferCardUiData.getOfferProgressType());
        strArr[3] = progressContentDescription != null ? progressContentDescription : "";
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) strArr);
    }

    public final java.lang.String getContentDescription(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, ". ", null, ".", 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersUiMapper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersUiMapper.m19381$r8$lambda$QgUxj3w8Y5V9Z1iy4lhLgHVrOA((java.lang.String) obj2);
            }
        }, 26, null);
    }

    public final java.lang.String getContentDescription(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData activeOfferCardUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOfferCardUiData, "");
        return getContentDescription(getContentDescriptionReadoutList(activeOfferCardUiData));
    }

    public final java.lang.String getTitleCategoryReadout(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData inactiveOfferCardUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inactiveOfferCardUiData, "");
        if (inactiveOfferCardUiData.getCategory().length() == 0) {
            return inactiveOfferCardUiData.getTitle();
        }
        java.lang.String title = inactiveOfferCardUiData.getTitle();
        java.lang.String category = inactiveOfferCardUiData.getCategory();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(title);
        sb.append(" in ");
        sb.append(category);
        return sb.toString();
    }

    public final java.util.List<java.lang.String> getContentDescriptionReadoutList(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData inactiveOfferCardUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inactiveOfferCardUiData, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{getTitleCategoryReadout(inactiveOfferCardUiData), inactiveOfferCardUiData.getExpirationDate(), inactiveOfferCardUiData.getDescription()});
    }

    public final java.lang.String getContentDescription(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData inactiveOfferCardUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inactiveOfferCardUiData, "");
        return getContentDescription(getContentDescriptionReadoutList(inactiveOfferCardUiData));
    }

    public final java.lang.String toUiTimeLeftLabel(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringResourceProvider, "");
        try {
            long seconds = java.time.Duration.between(java.time.Instant.now(), java.time.Instant.parse(str)).getSeconds();
            long j = (86399 + seconds) / 86400;
            if (seconds < 0) {
                return "Expired";
            }
            if (seconds <= 86400) {
                return stringResourceProvider.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_active_offer_less_than_24_hours);
            }
            return stringResourceProvider.getFormattedString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_active_offer_other_day_left, java.lang.Integer.valueOf((int) j));
        } catch (java.time.format.DateTimeParseException e) {
            com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger logger = com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.INSTANCE;
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse time left label '");
            sb.append(str);
            sb.append("': ");
            sb.append(message);
            com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.logW$default(logger, sb.toString(), null, null, 6, null);
            return str;
        }
    }

    /* renamed from: $r8$lambda$QgUxj3w8Y5V9Z1iy-4lhLgHVrOA, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m19381$r8$lambda$QgUxj3w8Y5V9Z1iy4lhLgHVrOA(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.trimEnd(str, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, ' ');
    }
}
