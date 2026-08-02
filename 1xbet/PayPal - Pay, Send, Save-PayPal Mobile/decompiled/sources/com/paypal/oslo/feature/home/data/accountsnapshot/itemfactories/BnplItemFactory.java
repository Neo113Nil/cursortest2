package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0017\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/BnplItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "<init>", "()V", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "rank", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)I", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "createItem", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "", "p0", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/math/BigDecimal;", "p1", "p2", "Lcom/paypal/oslo/feature/home/domain/model/FooterColors;", "p3", "Lcom/paypal/oslo/feature/home/domain/model/HomeIcon;", "p4", "getHighSpeedVideoFpsRangesFor", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/domain/model/FooterColors;Lcom/paypal/oslo/feature/home/domain/model/HomeIcon;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BnplItemFactory implements com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory {
    public static final int $stable = 0;

    @javax.inject.Inject
    public BnplItemFactory() {
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createItem(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation bnplProfilePresentation;
        com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance totalRemainingBalance;
        com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment bnpl = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.bnpl(data);
        if (bnpl != null && (bnplProfilePresentation = bnpl.getBnplProfilePresentation()) != null) {
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status status = bnplProfilePresentation.getStatus();
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans plans = bnplProfilePresentation.getPlans();
            java.math.BigDecimal bigDecimalOrNull = (plans == null || (totalRemainingBalance = plans.getTotalRemainingBalance()) == null || (moneyFragment = totalRemainingBalance.getMoneyFragment()) == null || (value = moneyFragment.getValue()) == null) ? null : kotlin.text.StringsKt.toBigDecimalOrNull(value);
            if ((status != null ? status.getOnBNPLProfileStatusPrequalified() : null) == null) {
                if ((status != null ? status.getOnBNPLProfileStatusDueThisWeek() : null) != null) {
                    return getHighSpeedVideoFpsRangesFor(bigDecimalOrNull, status.getOnBNPLProfileStatusDueThisWeek().getTotalAmountDueThisWeek().getMoneyFragment().getValue(), "due this week", com.paypal.oslo.feature.home.domain.model.FooterColors.Warning.INSTANCE, null);
                }
                if ((status != null ? status.getOnBNPLProfileStatusOverdue() : null) != null) {
                    return getHighSpeedVideoFpsRangesFor(bigDecimalOrNull, status.getOnBNPLProfileStatusOverdue().getTotalOverdueAmount().getMoneyFragment().getValue(), "past due", com.paypal.oslo.feature.home.domain.model.FooterColors.Negative.INSTANCE, com.paypal.oslo.feature.home.domain.model.HomeIcon.Warning);
                }
                if ((status != null ? status.getOnBNPLProfileStatusDueToday() : null) != null) {
                    return getHighSpeedVideoFpsRangesFor(bigDecimalOrNull, status.getOnBNPLProfileStatusDueToday().getTotalAmountDueToday().getMoneyFragment().getValue(), "due today", com.paypal.oslo.feature.home.domain.model.FooterColors.Warning.INSTANCE, null);
                }
                if ((status != null ? status.getOnBNPLProfileStatusDueOnSpecificDate() : null) != null) {
                    com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate onBNPLProfileStatusDueOnSpecificDate = status.getOnBNPLProfileStatusDueOnSpecificDate();
                    java.lang.String value2 = onBNPLProfileStatusDueOnSpecificDate.getAmountDue().getMoneyFragment().getValue();
                    java.lang.Object dueDate = onBNPLProfileStatusDueOnSpecificDate.getDueDate();
                    java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(dueDate != null ? dueDate.toString() : null);
                    return getHighSpeedVideoFpsRangesFor(bigDecimalOrNull, value2, highSpeedVideoSizes != null ? "due ".concat(java.lang.String.valueOf(highSpeedVideoSizes)) : "due", com.paypal.oslo.feature.home.domain.model.FooterColors.Warning.INSTANCE, null);
                }
                if (bigDecimalOrNull != null) {
                    return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem("pay-later", com.paypal.oslo.feature.home.api.AccountSnapshotType.PayLater.INSTANCE, com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default.INSTANCE, com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactoryKt.PayLaterTitle, null, com.paypal.oslo.feature.home.data.accountsnapshot.MoneyUtilsKt.formatAmount(bigDecimalOrNull), null, "Current balance", null, null, null, null, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactoryKt.AccountSnapshotPayLaterImage), kotlin.collections.CollectionsKt.emptyList(), null, 16448, null);
                }
            } else {
                java.math.BigDecimal bigDecimalOrNull2 = kotlin.text.StringsKt.toBigDecimalOrNull(status.getOnBNPLProfileStatusPrequalified().getSpendingPower().getMoneyFragment().getValue());
                if (bigDecimalOrNull2 == null) {
                    bigDecimalOrNull2 = java.math.BigDecimal.ZERO;
                }
                com.paypal.oslo.feature.home.api.AccountSnapshotType.PayLater payLater = com.paypal.oslo.feature.home.api.AccountSnapshotType.PayLater.INSTANCE;
                com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default r5 = com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default.INSTANCE;
                java.lang.String formatAmount = bigDecimalOrNull != null ? com.paypal.oslo.feature.home.data.accountsnapshot.MoneyUtilsKt.formatAmount(bigDecimalOrNull) : null;
                java.lang.String str = bigDecimalOrNull != null ? "Current balance" : null;
                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull2);
                return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem("pay-later", payLater, r5, com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactoryKt.PayLaterTitle, null, formatAmount, null, str, "Spending power: ".concat(java.lang.String.valueOf(com.paypal.oslo.feature.home.data.accountsnapshot.MoneyUtilsKt.formatAmount(bigDecimalOrNull2))), com.paypal.oslo.feature.home.domain.model.FooterColors.Positive.INSTANCE, null, null, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactoryKt.AccountSnapshotPayLaterImage), kotlin.collections.CollectionsKt.emptyList(), null, 16448, null);
            }
        }
        return null;
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String p0) {
        if (p0 == null) {
            return null;
        }
        try {
            return java.time.LocalDate.parse(p0).format(java.time.format.DateTimeFormatter.ofPattern(com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem.INSTALLMENT_DATE_OUTPUT_PATTERN, java.util.Locale.US));
        } catch (java.time.format.DateTimeParseException unused) {
            return null;
        }
    }

    private static com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem getHighSpeedVideoFpsRangesFor(java.math.BigDecimal p0, java.lang.String p1, java.lang.String p2, com.paypal.oslo.feature.home.domain.model.FooterColors p3, com.paypal.oslo.feature.home.domain.model.HomeIcon p4) {
        com.paypal.oslo.feature.home.api.AccountSnapshotType.PayLater payLater = com.paypal.oslo.feature.home.api.AccountSnapshotType.PayLater.INSTANCE;
        com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default r1 = com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default.INSTANCE;
        java.lang.String formatAmount = p0 != null ? com.paypal.oslo.feature.home.data.accountsnapshot.MoneyUtilsKt.formatAmount(p0) : null;
        java.lang.String str = p0 != null ? "Current balance" : null;
        java.lang.String formatAmount2 = com.paypal.oslo.feature.home.data.accountsnapshot.MoneyUtilsKt.formatAmount(p1);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(formatAmount2);
        sb.append(" ");
        sb.append(p2);
        return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem("pay-later", payLater, r1, com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactoryKt.PayLaterTitle, null, formatAmount, null, str, sb.toString(), p3, p4, p4 != null ? p3 : null, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactoryKt.AccountSnapshotPayLaterImage), kotlin.collections.CollectionsKt.emptyList(), null, 16448, null);
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final int rank(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return 2;
    }
}
