package com.paypal.oslo.feature.activity.domain.base.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/AmountUtils;", "", "<init>", "()V", "", "currencyCode", "getCurrencySymbol$activity_prodRelease", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "amountInfo", "prefix", "formatAmount$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AmountUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.base.utils.AmountUtils INSTANCE = new com.paypal.oslo.feature.activity.domain.base.utils.AmountUtils();

    private AmountUtils() {
    }

    public final java.lang.String getCurrencySymbol$activity_prodRelease(java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        try {
            java.lang.String symbol = java.util.Currency.getInstance(currencyCode).getSymbol(java.util.Locale.getDefault());
            kotlin.jvm.internal.Intrinsics.checkNotNull(symbol);
            return symbol;
        } catch (java.lang.Exception unused) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, "Invalid or null currency code or locale", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CURRENCY_CODE, currencyCode)), null, 4, null);
            return currencyCode;
        }
    }

    public static /* synthetic */ java.lang.String formatAmount$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.base.utils.AmountUtils amountUtils, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return amountUtils.formatAmount$activity_prodRelease(activityCounterPartyAmountInformation, str);
    }

    public final java.lang.String formatAmount$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation amountInfo, java.lang.String prefix) {
        java.lang.String cryptoQuantity;
        java.lang.String cryptoAssetSymbol;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation cryptoAssetQuantity = amountInfo.getCryptoAssetQuantity();
        if (cryptoAssetQuantity != null && (cryptoQuantity = cryptoAssetQuantity.getCryptoQuantity()) != null && !kotlin.text.StringsKt.isBlank(cryptoQuantity) && (cryptoAssetSymbol = cryptoAssetQuantity.getCryptoAssetSymbol()) != null && !kotlin.text.StringsKt.isBlank(cryptoAssetSymbol)) {
            java.lang.String cryptoQuantity2 = cryptoAssetQuantity.getCryptoQuantity();
            java.lang.String cryptoAssetSymbol2 = cryptoAssetQuantity.getCryptoAssetSymbol();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(prefix);
            sb.append(cryptoQuantity2);
            sb.append(cryptoAssetSymbol2);
            return sb.toString();
        }
        java.lang.String currencyCode = amountInfo.getCurrencyCode();
        java.lang.String currencySymbol$activity_prodRelease = getCurrencySymbol$activity_prodRelease(currencyCode != null ? currencyCode : "");
        java.lang.String amount = amountInfo.getAmount();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(prefix);
        sb2.append(currencySymbol$activity_prodRelease);
        sb2.append(amount);
        return sb2.toString();
    }
}
