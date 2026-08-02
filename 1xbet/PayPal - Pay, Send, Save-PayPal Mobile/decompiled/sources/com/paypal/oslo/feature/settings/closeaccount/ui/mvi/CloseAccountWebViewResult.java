package com.paypal.oslo.feature.settings.closeaccount.ui.mvi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountWebViewResult;", "", "<init>", "(Ljava/lang/String;I)V", com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, "DISMISS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountWebViewResult {
    public static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult CLOSE;
    public static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult DISMISS;
    private static final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private CloseAccountWebViewResult(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult closeAccountWebViewResult = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, 0);
        CLOSE = closeAccountWebViewResult;
        com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult closeAccountWebViewResult2 = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult("DISMISS", 1);
        DISMISS = closeAccountWebViewResult2;
        com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult[] closeAccountWebViewResultArr = {closeAccountWebViewResult, closeAccountWebViewResult2};
        getHighSpeedVideoFpsRangesFor = closeAccountWebViewResultArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(closeAccountWebViewResultArr);
    }

    public static com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult[] values() {
        return (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult) java.lang.Enum.valueOf(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
