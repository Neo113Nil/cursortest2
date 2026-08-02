package com.paypal.oslo.feature.activity.domain.detail.extensions;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0002\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$AmountInfo;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "toActivityCounterPartyAmountInformation", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$AmountInfo;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "toActivityActionModel", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownModel;", "toActivityTaxHoldBreakDownModel", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownModel;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownFragment$Item;", "taxHoldBreakDownValue", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownItemsModel;", "toTaxHoldBreakDownValue", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownFragment$Item;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownItemsModel;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailExtensionsKt {
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation toActivityCounterPartyAmountInformation(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo amountInfo) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment.Amount amount;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment;
        java.lang.Object currencyCode;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment.Amount amount2;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment2;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment.CryptoAssetQuantity cryptoAssetQuantity;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment;
        java.lang.String str = null;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment activityAmountInfoDetailFragment = amountInfo != null ? amountInfo.getActivityAmountInfoDetailFragment() : null;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation activityCryptoAssetQuantityInformation = (activityAmountInfoDetailFragment == null || (cryptoAssetQuantity = activityAmountInfoDetailFragment.getCryptoAssetQuantity()) == null || (activityCryptoAssetQuantityFragment = cryptoAssetQuantity.getActivityCryptoAssetQuantityFragment()) == null) ? null : com.paypal.oslo.feature.activity.domain.common.extensions.ActivityModelMapperExtensionsKt.toActivityCryptoAssetQuantityInformation(activityCryptoAssetQuantityFragment);
        java.lang.String value = (activityAmountInfoDetailFragment == null || (amount2 = activityAmountInfoDetailFragment.getAmount()) == null || (activityMoneyFragment2 = amount2.getActivityMoneyFragment()) == null) ? null : activityMoneyFragment2.getValue();
        if (activityAmountInfoDetailFragment != null && (amount = activityAmountInfoDetailFragment.getAmount()) != null && (activityMoneyFragment = amount.getActivityMoneyFragment()) != null && (currencyCode = activityMoneyFragment.getCurrencyCode()) != null) {
            str = currencyCode.toString();
        }
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation(value, str, activityAmountInfoDetailFragment != null ? activityAmountInfoDetailFragment.isAmountSettlementCanceled() : false, activityAmountInfoDetailFragment != null ? activityAmountInfoDetailFragment.isAmountNeutral() : false, activityCryptoAssetQuantityInformation);
    }

    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel toActivityActionModel(com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data data) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionsFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.api.graphql.schema.type.ActivityActionType type = activityActionsFragment.getType();
        java.lang.Object url = activityActionsFragment.getUrl();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags = null;
        java.lang.String obj = url != null ? url.toString() : null;
        java.lang.String id = data.getResult().getId();
        java.lang.String groupId = data.getResult().getGroupId();
        java.lang.String invoiceId = data.getResult().getInvoiceId();
        com.paypal.oslo.api.graphql.schema.type.ActivityType type2 = data.getResult().getType();
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags flags = data.getResult().getFlags();
        if (flags != null && (activityFlagsFragment = flags.getActivityFlagsFragment()) != null) {
            activityFlags = com.paypal.oslo.feature.activity.domain.common.extensions.ActivityModelMapperExtensionsKt.toActivityFlags(activityFlagsFragment);
        }
        return new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel(type, obj, new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo(id, groupId, invoiceId, type2, activityFlags, toActivityCounterPartyAmountInformation(data.getResult().getAmountInfo()), (java.lang.String) null, (java.lang.Boolean) null, data.getResult().getCreatedTime().toString(), 192, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public static final com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel toActivityTaxHoldBreakDownModel(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data data) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityRegulatoryInfoFragment activityRegulatoryInfoFragment;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityRegulatoryInfoFragment.TaxHoldBreakdown taxHoldBreakdown;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo regulatoryInfo = data.getResult().getRegulatoryInfo();
        java.util.ArrayList arrayList = null;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment activityTaxHoldBreakdownFragment = (regulatoryInfo == null || (activityRegulatoryInfoFragment = regulatoryInfo.getActivityRegulatoryInfoFragment()) == null || (taxHoldBreakdown = activityRegulatoryInfoFragment.getTaxHoldBreakdown()) == null) ? null : taxHoldBreakdown.getActivityTaxHoldBreakdownFragment();
        if (activityTaxHoldBreakdownFragment == null) {
            return null;
        }
        java.lang.String title = activityTaxHoldBreakdownFragment.getTitle();
        java.lang.String description = activityTaxHoldBreakdownFragment.getDescription();
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item> items = activityTaxHoldBreakdownFragment.getItems();
        if (items != null) {
            java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item> list = items;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toTaxHoldBreakDownValue(data, (com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item) it.next()));
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel(title, description, arrayList);
    }

    public static final com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownItemsModel toTaxHoldBreakDownValue(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data data, com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item item) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownItemFragment activityTaxHoldBreakdownItemFragment = item.getActivityTaxHoldBreakdownItemFragment();
        java.lang.String id = activityTaxHoldBreakdownItemFragment.getId();
        java.lang.String rawValue = activityTaxHoldBreakdownItemFragment.getType().getRawValue();
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownItemFragment.Action> actions = activityTaxHoldBreakdownItemFragment.getActions();
        if (actions != null) {
            java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownItemFragment.Action> list = actions;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toActivityActionModel(((com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownItemFragment.Action) it.next()).getActivityActionsFragment(), data));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownItemsModel(id, rawValue, arrayList, toActivityCounterPartyAmountInformation(activityTaxHoldBreakdownItemFragment.getAmountInfo().getAmount().getActivityMoneyFragment()), activityTaxHoldBreakdownItemFragment.getDisplayDateFormat(), activityTaxHoldBreakdownItemFragment.getCreatedTime().toString());
    }

    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation toActivityCounterPartyAmountInformation(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment) {
        java.lang.Object currencyCode;
        java.lang.String str = null;
        java.lang.String value = activityMoneyFragment != null ? activityMoneyFragment.getValue() : null;
        if (activityMoneyFragment != null && (currencyCode = activityMoneyFragment.getCurrencyCode()) != null) {
            str = currencyCode.toString();
        }
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation(value, str, false, false, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation) null, 28, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
