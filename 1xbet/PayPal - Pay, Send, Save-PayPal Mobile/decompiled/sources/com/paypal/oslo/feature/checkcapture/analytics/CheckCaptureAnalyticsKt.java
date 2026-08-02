package com.paypal.oslo.feature.checkcapture.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckCaptureAnalyticsKt {
    public static final /* synthetic */ java.lang.String access$toAnalyticsName(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType) {
        int i = checkCaptureErrorType == null ? -1 : com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalyticsKt.WhenMappings.$EnumSwitchMapping$0[checkCaptureErrorType.ordinal()];
        if (i == -1) {
            return com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_UNKNOWN_ERROR;
        }
        if (i == 1) {
            return "feature_disabled_error";
        }
        if (i == 2) {
            return "authentication_failed_error";
        }
        if (i == 3) {
            return com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_NETWORK;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.GENERIC_ERROR;
    }

    public static final /* synthetic */ java.lang.String access$toOsloScreenName(java.lang.String str) {
        switch (str.hashCode()) {
            case -1185989415:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.Registration)) {
                    return "cash_a_check_confirm_identity";
                }
                break;
            case -862846533:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionInReview)) {
                    return "cash_a_check_confirmation";
                }
                break;
            case -850860972:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.FundsTimingSelection)) {
                    return "cash_a_check_review_details";
                }
                break;
            case -527682492:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.ConfirmTransactionDetails)) {
                    return "cash_a_check_review_details";
                }
                break;
            case 16602951:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.AcceptLegalDocuments)) {
                    return "cash_a_check_accept_legal_documents";
                }
                break;
            case 108215564:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionDeclined)) {
                    return "cash_a_check_confirmation";
                }
                break;
            case 359890982:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionLoadFailure)) {
                    return "cash_a_check_error";
                }
                break;
            case 525812504:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.ConfirmAmount)) {
                    return "cash_a_check_enter_amount";
                }
                break;
            case 756778607:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.VoidDisclaimer)) {
                    return "cash_a_check_review_details";
                }
                break;
            case 1202809136:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.EnterAmount)) {
                    return "cash_a_check_enter_amount";
                }
                break;
            case 1666441882:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.CaptureCheckImages)) {
                    return "cash_a_check_capture_check";
                }
                break;
            case 1824420482:
                if (str.equals(com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionFunded)) {
                    return "cash_a_check_confirmation";
                }
                break;
        }
        java.lang.String lowerCase = "cash_a_check_ingo_".concat(java.lang.String.valueOf(str)).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return kotlin.text.StringsKt.replace$default(lowerCase, " ", "_", false, 4, (java.lang.Object) null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.FEATURE_DISABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.AUTHENTICATION_FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.NETWORK_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.GENERIC_ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
