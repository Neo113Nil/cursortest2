package com.paypal.oslo.feature.qrc.ui.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PendingBottomSheet;", "", "<init>", "(Ljava/lang/String;I)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "LowBalance", "NoFi"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PendingBottomSheet {
    public static final com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet LowBalance;
    public static final com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet NoFi;
    public static final com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet None;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    static {
        com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet pendingBottomSheet = new com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 0);
        None = pendingBottomSheet;
        com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet pendingBottomSheet2 = new com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet("LowBalance", 1);
        LowBalance = pendingBottomSheet2;
        com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet pendingBottomSheet3 = new com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet("NoFi", 2);
        NoFi = pendingBottomSheet3;
        com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet[] pendingBottomSheetArr = {pendingBottomSheet, pendingBottomSheet2, pendingBottomSheet3};
        getHighResolutionOutputSizeshNQ4ISI = pendingBottomSheetArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(pendingBottomSheetArr);
    }

    private PendingBottomSheet(java.lang.String str, int i) {
    }

    public static com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet[] values() {
        return (com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.ui.review.PendingBottomSheet> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
