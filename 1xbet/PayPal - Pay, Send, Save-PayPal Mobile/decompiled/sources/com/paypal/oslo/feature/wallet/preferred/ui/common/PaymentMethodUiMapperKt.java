package com.paypal.oslo.feature.wallet.preferred.ui.common;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/Balance;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;", "toPaymentMethodUiModel", "(Lcom/paypal/oslo/feature/wallet/common/model/Balance;)Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;", "Lcom/paypal/oslo/feature/wallet/common/model/BankAccountInfo;", "(Lcom/paypal/oslo/feature/wallet/common/model/BankAccountInfo;)Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;", "Lcom/paypal/oslo/feature/wallet/common/model/CardInfo;", "(Lcom/paypal/oslo/feature/wallet/common/model/CardInfo;)Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;", "", "Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod;", "toPaymentMethodUiModels", "(Ljava/util/List;)Ljava/util/List;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "formatBalance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentMethodUiMapperKt {
    public static final com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel toPaymentMethodUiModel(com.paypal.oslo.feature.wallet.common.model.Balance balance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balance, "");
        return new com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel(balance.getId(), com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BALANCE, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_paypal_balance, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(formatBalance(balance.getValue(), balance.getCurrencyCode())), null, null, null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_paypal_balance, new java.lang.Object[0]), 112, null);
    }

    public static final com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel toPaymentMethodUiModel(com.paypal.oslo.feature.wallet.common.model.BankAccountInfo bankAccountInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountInfo, "");
        return new com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel(bankAccountInfo.getId(), com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BANK, com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentMethodMapperKt.resolveBankDisplayName(bankAccountInfo), com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentMethodMapperKt.resolveBankSecondaryText(bankAccountInfo), bankAccountInfo.getLastNChars(), bankAccountInfo.getThumbnailUrl(), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentMethodMapperKt.buildDisplayName(com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentMethodMapperKt.resolveBankRawName(bankAccountInfo), bankAccountInfo.getType(), bankAccountInfo.getLastNChars())), 64, null);
    }

    public static final com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel toPaymentMethodUiModel(com.paypal.oslo.feature.wallet.common.model.CardInfo cardInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
        return new com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel(cardInfo.getId(), com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.CARD, com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentMethodMapperKt.resolveCardDisplayName(cardInfo), com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentMethodMapperKt.resolveCardSecondaryText(cardInfo), cardInfo.getLastNChars(), cardInfo.getThumbnailUrl(), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentMethodMapperKt.buildDisplayName(com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentMethodMapperKt.resolveCardRawName(cardInfo), null, cardInfo.getLastNChars())), 64, null);
    }

    public static final java.util.List<com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel> toPaymentMethodUiModels(java.util.List<? extends com.paypal.oslo.feature.wallet.common.model.PaymentMethod> list) {
        com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<? extends com.paypal.oslo.feature.wallet.common.model.PaymentMethod> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.wallet.common.model.PaymentMethod paymentMethod : list2) {
            if (paymentMethod instanceof com.paypal.oslo.feature.wallet.common.model.PaymentMethod.BalanceMethod) {
                paymentMethodUiModel = toPaymentMethodUiModel(((com.paypal.oslo.feature.wallet.common.model.PaymentMethod.BalanceMethod) paymentMethod).getInfo());
            } else if (paymentMethod instanceof com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Bank) {
                paymentMethodUiModel = toPaymentMethodUiModel(((com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Bank) paymentMethod).getInfo());
            } else {
                if (!(paymentMethod instanceof com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Card)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                paymentMethodUiModel = toPaymentMethodUiModel(((com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Card) paymentMethod).getInfo());
            }
            arrayList.add(paymentMethodUiModel);
        }
        return arrayList;
    }

    public static final java.lang.String formatBalance(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(str);
        java.util.Currency currency = null;
        if (doubleOrNull != null) {
            try {
                currency = java.util.Currency.getInstance(str2);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        if (doubleOrNull != null && currency != null) {
            java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.getDefault());
            currencyInstance.setCurrency(currency);
            java.lang.String format = currencyInstance.format(doubleOrNull.doubleValue());
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            return format;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }
}
