package com.paypal.oslo.feature.businesshome.ui.mapper;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsights;", "Lcom/paypal/oslo/feature/businesshome/ui/home/InFocusUiData;", "toInFocusUiData", "(Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsights;)Lcom/paypal/oslo/feature/businesshome/ui/home/InFocusUiData;", "", "Lcom/paypal/oslo/feature/businesshome/domain/model/CounterParty;", "p0", "Lkotlin/Pair;", "Lcom/paypal/oslo/feature/businesshome/ui/home/InFocusUiData$AvatarInfo;", "Lcom/paypal/oslo/feature/businesshome/ui/home/InFocusUiData$Overflow;", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;)Lkotlin/Pair;", "", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MerchantInsightsUiMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData toInFocusUiData(com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights merchantInsights) {
        com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow inFocusRow;
        com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow inFocusRow2;
        java.lang.String displayName;
        com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow inFocusRow3;
        java.lang.String displayName2;
        int total;
        com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow inFocusRow4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantInsights, "");
        com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics disputeMetrics = merchantInsights.getDisputeMetrics();
        com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow inFocusRow5 = null;
        r6 = null;
        java.lang.String str = null;
        if (disputeMetrics.getTotal() <= 0) {
            inFocusRow = null;
        } else {
            inFocusRow = new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_disputes, null, disputeMetrics.getPriorityTotal() > 0 ? java.lang.Integer.valueOf(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_n_needs_attention) : null, disputeMetrics.getPriorityTotal() > 0 ? java.lang.Integer.valueOf(disputeMetrics.getPriorityTotal()) : null, null, null, null, null, java.lang.String.valueOf(disputeMetrics.getTotal()), disputeMetrics.getPriorityTotal() > 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, null);
        }
        com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics receivable = merchantInsights.getTransactionMetrics().getReceivable();
        if (receivable.getTotalCount() <= 0) {
            inFocusRow2 = null;
        } else if (receivable.getSingleActivity() != null) {
            java.lang.String formatAsCurrencyWithSeparators$default = com.paypal.oslo.core.money.MoneyFormattingKt.formatAsCurrencyWithSeparators$default(receivable.getTotalAmount(), null, 1, null);
            com.paypal.oslo.feature.businesshome.domain.model.CounterParty counterParty = (com.paypal.oslo.feature.businesshome.domain.model.CounterParty) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) receivable.getCounterParties());
            java.lang.String profilePictureUrl = counterParty != null ? counterParty.getProfilePictureUrl() : null;
            java.lang.String highSpeedVideoSizes = (counterParty == null || (displayName = counterParty.getDisplayName()) == null) ? null : getHighSpeedVideoSizes(displayName);
            if (highSpeedVideoSizes == null) {
                highSpeedVideoSizes = "";
            }
            inFocusRow2 = new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_receivables_s, formatAsCurrencyWithSeparators$default, receivable.getOverdueCount() > 0 ? java.lang.Integer.valueOf(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_past_due) : null, null, new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.LeadingAvatar.Profile(profilePictureUrl, highSpeedVideoSizes), null, null, null, null, receivable.getOverdueCount() > 0, 488, null);
        } else if (receivable.getTotalCount() > 150) {
            kotlin.Pair<java.util.List<com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.AvatarInfo>, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.Overflow> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(receivable.getCounterParties());
            java.util.List<com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.AvatarInfo> component1 = highSpeedVideoFpsRangesFor.component1();
            com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.Overflow component2 = highSpeedVideoFpsRangesFor.component2();
            inFocusRow2 = new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_receivables, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_review_them_all), null, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.LeadingAvatar.ArrowDown.INSTANCE, component1, component2, null, null, receivable.getOverdueCount() > 0, 394, null);
        } else {
            kotlin.Pair<java.util.List<com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.AvatarInfo>, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.Overflow> highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(receivable.getCounterParties());
            inFocusRow2 = new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_receivables_s, com.paypal.oslo.core.money.MoneyFormattingKt.formatAsCurrencyWithSeparators$default(receivable.getTotalAmount(), null, 1, null), receivable.getOverdueCount() > 0 ? java.lang.Integer.valueOf(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_n_past_due) : null, receivable.getOverdueCount() > 0 ? java.lang.Integer.valueOf(receivable.getOverdueCount()) : null, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.LeadingAvatar.ArrowDown.INSTANCE, highSpeedVideoFpsRangesFor2.component1(), highSpeedVideoFpsRangesFor2.component2(), null, null, receivable.getOverdueCount() > 0, 384, null);
        }
        com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics payable = merchantInsights.getTransactionMetrics().getPayable();
        if (payable.getTotalCount() > 0) {
            if (payable.getSingleActivity() != null) {
                java.lang.String formatAsCurrencyWithSeparators$default2 = com.paypal.oslo.core.money.MoneyFormattingKt.formatAsCurrencyWithSeparators$default(payable.getTotalAmount(), null, 1, null);
                com.paypal.oslo.feature.businesshome.domain.model.CounterParty counterParty2 = (com.paypal.oslo.feature.businesshome.domain.model.CounterParty) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) payable.getCounterParties());
                java.lang.String profilePictureUrl2 = counterParty2 != null ? counterParty2.getProfilePictureUrl() : null;
                if (counterParty2 != null && (displayName2 = counterParty2.getDisplayName()) != null) {
                    str = getHighSpeedVideoSizes(displayName2);
                }
                inFocusRow5 = new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_payables_s, formatAsCurrencyWithSeparators$default2, null, null, new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.LeadingAvatar.Profile(profilePictureUrl2, str != null ? str : ""), null, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_pay), null, false, 876, null);
            } else {
                if (payable.getTotalCount() > 150) {
                    kotlin.Pair<java.util.List<com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.AvatarInfo>, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.Overflow> highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(payable.getCounterParties());
                    inFocusRow3 = new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_payables, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_review_them_all), null, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.LeadingAvatar.ArrowUp.INSTANCE, highSpeedVideoFpsRangesFor3.component1(), highSpeedVideoFpsRangesFor3.component2(), null, null, false, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE, null);
                    total = merchantInsights.getTransactionMetrics().getTotal();
                    if (total > 0) {
                        inFocusRow4 = new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_no_transactions, null, null, null, null, null, null, null, null, false, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, null);
                    } else {
                        inFocusRow4 = new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_recent_transactions, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_n_in_last_7_days), java.lang.Integer.valueOf(total), null, null, null, null, null, false, 1010, null);
                    }
                    return new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData(inFocusRow, inFocusRow2, inFocusRow3, inFocusRow4, kotlin.collections.CollectionsKt.emptyList());
                }
                kotlin.Pair<java.util.List<com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.AvatarInfo>, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.Overflow> highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(payable.getCounterParties());
                inFocusRow5 = new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.InFocusRow(com.paypal.oslo.feature.businesshome.R.string.feature_business_home_in_focus_payables_s, com.paypal.oslo.core.money.MoneyFormattingKt.formatAsCurrencyWithSeparators$default(payable.getTotalAmount(), null, 1, null), null, null, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.LeadingAvatar.ArrowUp.INSTANCE, highSpeedVideoFpsRangesFor4.component1(), highSpeedVideoFpsRangesFor4.component2(), null, null, false, 908, null);
            }
        }
        inFocusRow3 = inFocusRow5;
        total = merchantInsights.getTransactionMetrics().getTotal();
        if (total > 0) {
        }
        return new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData(inFocusRow, inFocusRow2, inFocusRow3, inFocusRow4, kotlin.collections.CollectionsKt.emptyList());
    }

    private static final kotlin.Pair<java.util.List<com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.AvatarInfo>, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.Overflow> getHighSpeedVideoFpsRangesFor(java.util.List<com.paypal.oslo.feature.businesshome.domain.model.CounterParty> list) {
        int size = list.size();
        if (size <= 3) {
            java.util.List<com.paypal.oslo.feature.businesshome.domain.model.CounterParty> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.businesshome.domain.model.CounterParty counterParty : list2) {
                arrayList.add(new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.AvatarInfo(counterParty.getProfilePictureUrl(), getHighSpeedVideoSizes(counterParty.getDisplayName())));
            }
            return kotlin.TuplesKt.to(arrayList, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.Overflow.None.INSTANCE);
        }
        if (size <= 11) {
            java.util.List<com.paypal.oslo.feature.businesshome.domain.model.CounterParty> take = kotlin.collections.CollectionsKt.take(list, 2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(take, 10));
            for (com.paypal.oslo.feature.businesshome.domain.model.CounterParty counterParty2 : take) {
                arrayList2.add(new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.AvatarInfo(counterParty2.getProfilePictureUrl(), getHighSpeedVideoSizes(counterParty2.getDisplayName())));
            }
            return kotlin.TuplesKt.to(arrayList2, new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.Overflow.Count(size - 2));
        }
        java.util.List<com.paypal.oslo.feature.businesshome.domain.model.CounterParty> take2 = kotlin.collections.CollectionsKt.take(list, 2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(take2, 10));
        for (com.paypal.oslo.feature.businesshome.domain.model.CounterParty counterParty3 : take2) {
            arrayList3.add(new com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.AvatarInfo(counterParty3.getProfilePictureUrl(), getHighSpeedVideoSizes(counterParty3.getDisplayName())));
        }
        return kotlin.TuplesKt.to(arrayList3, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData.Overflow.More.INSTANCE);
    }

    private static final java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : split$default) {
            if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
        if (str2 != null) {
            sb.append(java.lang.Character.toUpperCase(kotlin.text.StringsKt.first(str2)));
        }
        if (arrayList2.size() > 1) {
            sb.append(java.lang.Character.toUpperCase(kotlin.text.StringsKt.first((java.lang.CharSequence) kotlin.collections.CollectionsKt.last((java.util.List) arrayList2))));
        }
        return sb.toString();
    }
}
