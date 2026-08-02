package com.paypal.oslo.feature.qrc.ui.review.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/model/TipState;", "", "<init>", "(Ljava/lang/String;I)V", "COLLAPSED", "PICKER", "CUSTOM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipState {
    public static final com.paypal.oslo.feature.qrc.ui.review.model.TipState COLLAPSED;
    public static final com.paypal.oslo.feature.qrc.ui.review.model.TipState CUSTOM;
    public static final com.paypal.oslo.feature.qrc.ui.review.model.TipState PICKER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.model.TipState[] getHighSpeedVideoFpsRanges;

    private TipState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.ui.review.model.TipState tipState = new com.paypal.oslo.feature.qrc.ui.review.model.TipState("COLLAPSED", 0);
        COLLAPSED = tipState;
        com.paypal.oslo.feature.qrc.ui.review.model.TipState tipState2 = new com.paypal.oslo.feature.qrc.ui.review.model.TipState("PICKER", 1);
        PICKER = tipState2;
        com.paypal.oslo.feature.qrc.ui.review.model.TipState tipState3 = new com.paypal.oslo.feature.qrc.ui.review.model.TipState("CUSTOM", 2);
        CUSTOM = tipState3;
        com.paypal.oslo.feature.qrc.ui.review.model.TipState[] tipStateArr = {tipState, tipState2, tipState3};
        getHighSpeedVideoFpsRanges = tipStateArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(tipStateArr);
    }

    public static com.paypal.oslo.feature.qrc.ui.review.model.TipState[] values() {
        return (com.paypal.oslo.feature.qrc.ui.review.model.TipState[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.qrc.ui.review.model.TipState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.ui.review.model.TipState) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.ui.review.model.TipState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.ui.review.model.TipState> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
