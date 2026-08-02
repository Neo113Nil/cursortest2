package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailFundingInstrumentSectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailFundingInstrumentSectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailFundingInstrumentSectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailFundingInstrumentSectionMapper();

    private TransactionDetailFundingInstrumentSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement> moneyMovements = input.getResult().getMoneyMovements();
        return !(moneyMovements == null || moneyMovements.isEmpty());
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155 A[SYNTHETIC] */
    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow paymentDetailRow;
        java.lang.String highSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result result = input.getResult();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement> moneyMovements = result.getMoneyMovements();
        if (moneyMovements != null) {
            java.util.Iterator<T> it = moneyMovements.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyMovementFragment activityMoneyMovementFragment = ((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement) it.next()).getActivityMoneyMovementFragment();
                java.lang.String description = activityMoneyMovementFragment.getDescription();
                if (description == null) {
                    description = "";
                }
                java.lang.Object lastNChars = activityMoneyMovementFragment.getLastNChars();
                java.lang.String obj = lastNChars != null ? lastNChars.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(description);
                sb.append(obj);
                java.lang.String obj2 = sb.toString();
                java.lang.String name2 = activityMoneyMovementFragment.getName();
                java.lang.String str = obj2;
                if (str.length() == 0) {
                    str = null;
                }
                java.lang.String str2 = str;
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyMovementFragment.Amount amount = activityMoneyMovementFragment.getAmount();
                com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument paymentFundingInstrument = new com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument(name2, str2, null, getHighSpeedVideoFpsRangesFor(amount != null ? amount.getActivityMoneyFragment() : null), activityMoneyMovementFragment.isBackupSource() ? java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_backup_label) : null, 4, null);
                if (activityMoneyMovementFragment.getMoneyMovementDirection() == com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection.DEBIT) {
                    arrayList.add(paymentFundingInstrument);
                } else if (activityMoneyMovementFragment.getMoneyMovementDirection() == com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection.CREDIT) {
                    arrayList2.add(paymentFundingInstrument);
                }
            }
        }
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset> cryptoAssets = result.getCryptoAssets();
        if (cryptoAssets != null) {
            for (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset cryptoAsset : cryptoAssets) {
                java.lang.String network = cryptoAsset.getNetwork();
                java.lang.String str3 = network;
                com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow paymentDetailRow2 = (str3 == null || str3.length() == 0) ? null : new com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow(null, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_network_label), network, false, null, 25, null);
                if (paymentDetailRow2 != null) {
                    arrayList3.add(paymentDetailRow2);
                }
                java.lang.String memo = cryptoAsset.getMemo();
                java.lang.String str4 = memo;
                com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow paymentDetailRow3 = (str4 == null || str4.length() == 0) ? null : new com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow(null, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_memo_label), memo, false, null, 25, null);
                if (paymentDetailRow3 != null) {
                    arrayList3.add(paymentDetailRow3);
                }
            }
        }
        if (result.getOrder() != null) {
            arrayList3.add(new com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow(null, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_order_number_label), result.getOrder().getActivityOrderFragment().getId(), false, null, 25, null));
        }
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment.AmountBreakdown> amountBreakdowns = result.getAmountInfo().getActivityAmountInfoDetailFragment().getAmountBreakdowns();
        if (amountBreakdowns != null) {
            for (com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment.AmountBreakdown amountBreakdown : amountBreakdowns) {
                java.lang.String str5 = amountBreakdown.getSign() == com.paypal.oslo.api.graphql.schema.type.ActivityAmountSign.NEGATIVE ? "-" : "";
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment.Amount1 amount2 = amountBreakdown.getAmount();
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment = amount2 != null ? amount2.getActivityMoneyFragment() : null;
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment.CryptoAssetQuantity1 cryptoAssetQuantity = amountBreakdown.getCryptoAssetQuantity();
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment = cryptoAssetQuantity != null ? cryptoAssetQuantity.getActivityCryptoAssetQuantityFragment() : null;
                if (activityMoneyFragment != null && activityCryptoAssetQuantityFragment != null) {
                    java.lang.String quantity = activityCryptoAssetQuantityFragment.getQuantity();
                    com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol = activityCryptoAssetQuantityFragment.getAssetSymbol();
                    java.lang.String highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(activityMoneyFragment);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(quantity);
                    sb2.append(" ");
                    sb2.append(assetSymbol);
                    sb2.append(" (");
                    sb2.append(highSpeedVideoFpsRangesFor2);
                    sb2.append(")");
                    highSpeedVideoFpsRangesFor = sb2.toString();
                } else if (activityCryptoAssetQuantityFragment != null) {
                    java.lang.String quantity2 = activityCryptoAssetQuantityFragment.getQuantity();
                    com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol2 = activityCryptoAssetQuantityFragment.getAssetSymbol();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(quantity2);
                    sb3.append(" ");
                    sb3.append(assetSymbol2);
                    highSpeedVideoFpsRangesFor = sb3.toString();
                } else if (activityMoneyFragment != null) {
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(activityMoneyFragment);
                    if (highSpeedVideoFpsRangesFor == null) {
                        highSpeedVideoFpsRangesFor = "";
                    }
                } else {
                    paymentDetailRow = null;
                    if (paymentDetailRow == null) {
                        arrayList3.add(paymentDetailRow);
                    }
                }
                java.lang.String name3 = amountBreakdown.getName();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str5);
                sb4.append(highSpeedVideoFpsRangesFor);
                paymentDetailRow = new com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow(name3, null, sb4.toString(), amountBreakdown.isAmountReversed(), null, 18, null);
                if (paymentDetailRow == null) {
                }
            }
        }
        int i = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_paid_with_header;
        int i2 = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_paid_to_header;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion> moneyConversions = result.getMoneyConversions();
        if (moneyConversions != null && !moneyConversions.isEmpty()) {
            java.util.Iterator it2 = result.getMoneyConversions().iterator();
            while (it2.hasNext()) {
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment activityMoneyConversionFragment = ((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion) it2.next()).getActivityMoneyConversionFragment();
                java.lang.Object currencyCode = activityMoneyConversionFragment.getSourceAmount().getActivityMoneyFragment().getCurrencyCode();
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.util.Iterator it3 = it2;
                java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "%.4f", java.util.Arrays.copyOf(new java.lang.Object[]{activityMoneyConversionFragment.getExchangeRate()}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                java.lang.Object currencyCode2 = activityMoneyConversionFragment.getTargetAmount().getActivityMoneyFragment().getCurrencyCode();
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("1 ");
                sb5.append(currencyCode);
                sb5.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
                sb5.append(format);
                sb5.append(" ");
                sb5.append(currencyCode2);
                arrayList4.add(sb5.toString());
                it2 = it3;
            }
        }
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion> cryptoAssetConversions = result.getCryptoAssetConversions();
        if (cryptoAssetConversions != null && !cryptoAssetConversions.isEmpty()) {
            java.util.Iterator<T> it4 = result.getCryptoAssetConversions().iterator();
            while (it4.hasNext()) {
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment activityCryptoAssetConversionFragment = ((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion) it4.next()).getActivityCryptoAssetConversionFragment();
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment2 = activityCryptoAssetConversionFragment.getAssetQuantity().getActivityCryptoAssetQuantityFragment();
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment2 = activityCryptoAssetConversionFragment.getAmount().getActivityMoneyFragment();
                com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol3 = activityCryptoAssetQuantityFragment2.getAssetSymbol();
                java.lang.String value = activityMoneyFragment2.getValue();
                java.lang.Object currencyCode3 = activityMoneyFragment2.getCurrencyCode();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1 ");
                sb6.append(assetSymbol3);
                sb6.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
                sb6.append(value);
                sb6.append(" ");
                sb6.append(currencyCode3);
                arrayList4.add(sb6.toString());
            }
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailFundingInstrumentModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel(arrayList, arrayList2, !arrayList4.isEmpty() ? new com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_your_exchange_rate_label, arrayList4) : null, arrayList3, i, i2));
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment p0) {
        if (p0 == null) {
            return null;
        }
        java.lang.String currencySymbol$activity_prodRelease = com.paypal.oslo.feature.activity.domain.base.utils.AmountUtils.INSTANCE.getCurrencySymbol$activity_prodRelease(p0.getCurrencyCode().toString());
        java.lang.String value = p0.getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(currencySymbol$activity_prodRelease);
        sb.append(value);
        return sb.toString();
    }
}
