package com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/UIInteractionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "BUTTON_CLICK", "FORM_SUBMIT", "SWIPE", "SCROLL", "TAP", "LONG_PRESS", "TEXT_INPUT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UIInteractionType {
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType BUTTON_CLICK;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType FORM_SUBMIT;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType LONG_PRESS;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType SCROLL;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType SWIPE;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType TAP;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType TEXT_INPUT;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType[] getHighSpeedVideoSizes;
    private final java.lang.String value;

    private UIInteractionType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType uIInteractionType = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType("BUTTON_CLICK", 0, "button_click");
        BUTTON_CLICK = uIInteractionType;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType uIInteractionType2 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType("FORM_SUBMIT", 1, "form_submit");
        FORM_SUBMIT = uIInteractionType2;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType uIInteractionType3 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType("SWIPE", 2, "swipe");
        SWIPE = uIInteractionType3;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType uIInteractionType4 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType("SCROLL", 3, "scroll");
        SCROLL = uIInteractionType4;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType uIInteractionType5 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType("TAP", 4, com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_TAP);
        TAP = uIInteractionType5;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType uIInteractionType6 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType("LONG_PRESS", 5, "long_press");
        LONG_PRESS = uIInteractionType6;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType uIInteractionType7 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType("TEXT_INPUT", 6, "text_input");
        TEXT_INPUT = uIInteractionType7;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType[] uIInteractionTypeArr = {uIInteractionType, uIInteractionType2, uIInteractionType3, uIInteractionType4, uIInteractionType5, uIInteractionType6, uIInteractionType7};
        getHighSpeedVideoSizes = uIInteractionTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(uIInteractionTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UIInteractionType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
