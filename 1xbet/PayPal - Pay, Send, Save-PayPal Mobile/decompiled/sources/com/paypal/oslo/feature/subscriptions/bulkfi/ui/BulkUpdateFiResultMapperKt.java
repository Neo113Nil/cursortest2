package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiResultWithAgreements;", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiPostUpdateUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiResultWithAgreements;Landroid/content/res/Resources;)Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiPostUpdateUiModel;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "p0", "", "p1", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "p2", "", "p3", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiPostUpdateAgreement;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;Landroid/content/res/Resources;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Z)Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiPostUpdateAgreement;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkUpdateFiResultMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel, android.content.res.Resources resources, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, boolean z) {
        java.lang.String secondaryText;
        java.lang.String str2;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel preferredFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel type;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel fundingInstrumentTypeUiModel = null;
        if (!z) {
            secondaryText = com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResultKt.getSecondaryText(resources, subscriptionItemUiModel.getBalancePreference(), subscriptionItemUiModel.getPreferredFundingInstrument(), subscriptionItemUiModel.getBalanceFundingInstrument());
        } else if (fundingInstrumentUiModel != null) {
            secondaryText = com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResultKt.getFiLabel(fundingInstrumentUiModel, resources);
        } else {
            str2 = null;
            java.lang.String id = subscriptionItemUiModel.getId();
            java.lang.String merchantName = subscriptionItemUiModel.getMerchant().getMerchantName();
            java.lang.String merchantLogoUrl = subscriptionItemUiModel.getMerchant().getMerchantLogoUrl();
            if (fundingInstrumentUiModel != null || (type = fundingInstrumentUiModel.getType()) == null) {
                preferredFundingInstrument = subscriptionItemUiModel.getPreferredFundingInstrument();
                if (preferredFundingInstrument != null) {
                    fundingInstrumentTypeUiModel = preferredFundingInstrument.getType();
                }
            } else {
                fundingInstrumentTypeUiModel = type;
            }
            return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement(id, merchantName, merchantLogoUrl, java.lang.String.valueOf(fundingInstrumentTypeUiModel), str2, str);
        }
        str2 = secondaryText;
        java.lang.String id2 = subscriptionItemUiModel.getId();
        java.lang.String merchantName2 = subscriptionItemUiModel.getMerchant().getMerchantName();
        java.lang.String merchantLogoUrl2 = subscriptionItemUiModel.getMerchant().getMerchantLogoUrl();
        if (fundingInstrumentUiModel != null) {
        }
        preferredFundingInstrument = subscriptionItemUiModel.getPreferredFundingInstrument();
        if (preferredFundingInstrument != null) {
        }
        return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement(id2, merchantName2, merchantLogoUrl2, java.lang.String.valueOf(fundingInstrumentTypeUiModel), str2, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel toUiModel(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements bulkUpdateFiResultWithAgreements, android.content.res.Resources resources) {
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription subscription;
        kotlin.Triple triple;
        java.lang.String string;
        java.lang.String string2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiResultWithAgreements, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel = (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) kotlin.collections.CollectionsKt.firstOrNull(bulkUpdateFiResultWithAgreements.getAllAgreements().values());
        if (subscriptionItemUiModel == null || (subscription = subscriptionItemUiModel.getType()) == null) {
            subscription = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE;
        }
        if (bulkUpdateFiResultWithAgreements.getAllSuccess()) {
            int size = bulkUpdateFiResultWithAgreements.getSuccessfulAgreementIds().size();
            if (size == 1) {
                string2 = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_success_payment_method_update_title);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(subscription, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                string2 = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_success_bulk_fi_update_title, java.lang.String.valueOf(size));
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(subscription, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                string2 = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_success_bulk_fi_update_title_vaulted, java.lang.String.valueOf(size));
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
            triple = new kotlin.Triple(string2, "", resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_common_done));
        } else {
            triple = bulkUpdateFiResultWithAgreements.getAllFailed() ? new kotlin.Triple(resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_fi_error_all_failed_title), resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_all_failed_subtitle), resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_fi_error_update_these_later_button)) : new kotlin.Triple(resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_partial_failure_title), resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_partial_failure_subtitle), resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_common_done));
        }
        java.lang.String str = (java.lang.String) triple.component1();
        java.lang.String str2 = (java.lang.String) triple.component2();
        java.lang.String str3 = (java.lang.String) triple.component3();
        java.util.Map<java.lang.String, java.lang.String> failedAgreements = bulkUpdateFiResultWithAgreements.getFailedAgreements();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = failedAgreements.entrySet().iterator();
        while (true) {
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement bulkUpdateFiPostUpdateAgreement = null;
            if (!it.hasNext()) {
                java.util.ArrayList arrayList2 = arrayList;
                java.util.List<java.lang.String> successfulAgreementIds = bulkUpdateFiResultWithAgreements.getSuccessfulAgreementIds();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str4 : successfulAgreementIds) {
                    com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel2 = bulkUpdateFiResultWithAgreements.getAllAgreements().get(str4);
                    com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement highSpeedVideoFpsRanges = subscriptionItemUiModel2 != null ? getHighSpeedVideoFpsRanges(subscriptionItemUiModel2, resources, "", bulkUpdateFiResultWithAgreements.getSelectedFundingInstruments().get(str4), true) : null;
                    if (highSpeedVideoFpsRanges != null) {
                        arrayList3.add(highSpeedVideoFpsRanges);
                    }
                }
                return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel(str, str2, str3, arrayList2, arrayList3);
            }
            java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
            java.lang.String key = next.getKey();
            java.lang.String value = next.getValue();
            com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel3 = bulkUpdateFiResultWithAgreements.getAllAgreements().get(key);
            if (subscriptionItemUiModel3 != null) {
                com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel = bulkUpdateFiResultWithAgreements.getSelectedFundingInstruments().get(key);
                java.lang.String fiLabel = fundingInstrumentUiModel != null ? com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResultKt.getFiLabel(fundingInstrumentUiModel, resources) : null;
                if (fiLabel == null) {
                    fiLabel = "";
                }
                switch (value.hashCode()) {
                    case -2012493206:
                        if (value.equals("ACCOUNT_NEEDS_FURTHER_VERIFICATION")) {
                            string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_account_needs_further_verification);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                            break;
                        }
                        string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_unknown);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        break;
                    case -1210741007:
                        if (value.equals("ONLY_CHECKING_OR_DEBIT_SUPPORTED")) {
                            string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_only_checking_or_debit_supported);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                            break;
                        }
                        string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_unknown);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        break;
                    case -362552950:
                        value.equals("UNKNOWN__");
                        string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_unknown);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        break;
                    case 75532016:
                        if (value.equals("OTHER")) {
                            string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_other, fiLabel);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                            break;
                        }
                        string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_unknown);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        break;
                    case 507434484:
                        if (value.equals("FI_NEEDS_FURTHER_VERIFICATION")) {
                            string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_fi_needs_further_verification, fiLabel);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                            break;
                        }
                        string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_unknown);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        break;
                    case 2139988176:
                        if (value.equals("DECLINED_BY_ISSUER")) {
                            string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_declined_by_issuer, fiLabel);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                            break;
                        }
                        string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_unknown);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        break;
                    default:
                        string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_failure_unknown);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        break;
                }
                bulkUpdateFiPostUpdateAgreement = getHighSpeedVideoFpsRanges(subscriptionItemUiModel3, resources, string, null, false);
            }
            if (bulkUpdateFiPostUpdateAgreement != null) {
                arrayList.add(bulkUpdateFiPostUpdateAgreement);
            }
        }
    }
}
