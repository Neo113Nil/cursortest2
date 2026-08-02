package com.paypal.oslo.feature.wallet.common.util;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "type", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "bankTypeResourceRef", "(Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "productClass", "cardProductClassResourceRef", "lastNChars", "maskedCardNumberRef", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentRefTextMapperKt {
    public static final com.paypal.oslo.core.commonui.utils.RefText bankTypeResourceRef(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        switch (upperCase.hashCode()) {
            case -1975441958:
                if (upperCase.equals(com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING)) {
                    return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_checking, new java.lang.Object[0]);
                }
                break;
            case -1704036199:
                if (upperCase.equals("SAVINGS")) {
                    return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_savings, new java.lang.Object[0]);
                }
                break;
            case 67460985:
                if (upperCase.equals("BUSINESS_CHECKING")) {
                    return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_business_checking, new java.lang.Object[0]);
                }
                break;
            case 578621210:
                if (upperCase.equals("BUSINESS_SAVINGS")) {
                    return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_business_savings, new java.lang.Object[0]);
                }
                break;
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(str);
    }

    public static final com.paypal.oslo.core.commonui.utils.RefText cardProductClassResourceRef(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        int hashCode = upperCase.hashCode();
        if (hashCode != 64920780) {
            if (hashCode != 399611855) {
                if (hashCode == 1996005113 && upperCase.equals("CREDIT")) {
                    return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_default_card_type, new java.lang.Object[0]);
                }
            } else if (upperCase.equals("PREPAID")) {
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_prepaid, new java.lang.Object[0]);
            }
        } else if (upperCase.equals("DEBIT")) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_debit, new java.lang.Object[0]);
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_prepaid_masked, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r2.equals("PAYPAL_PREPAID") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r2.equals("PREPAID") == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.core.commonui.utils.RefText maskedCardNumberRef(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        switch (upperCase.hashCode()) {
            case 2187568:
                if (upperCase.equals("GIFT")) {
                    return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_gift_masked, str2);
                }
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_card_masked, str2);
            case 64920780:
                if (upperCase.equals("DEBIT")) {
                    return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_debit_masked, str2);
                }
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_card_masked, str2);
            case 136703619:
                break;
            case 399611855:
                break;
            case 1996005113:
                if (upperCase.equals("CREDIT")) {
                    return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_credit_masked, str2);
                }
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_card_masked, str2);
            default:
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_card_masked, str2);
        }
    }
}
