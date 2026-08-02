package com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/UILoadingType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "INITIAL_DATA", "REFRESH", "PAGINATION", "RETRY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UILoadingType {
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType INITIAL_DATA;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType PAGINATION;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType REFRESH;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType RETRY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String value;

    private UILoadingType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType uILoadingType = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType("INITIAL_DATA", 0, "initial_data");
        INITIAL_DATA = uILoadingType;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType uILoadingType2 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType("REFRESH", 1, com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH);
        REFRESH = uILoadingType2;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType uILoadingType3 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType("PAGINATION", 2, "pagination");
        PAGINATION = uILoadingType3;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType uILoadingType4 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType("RETRY", 3, "retry");
        RETRY = uILoadingType4;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType[] uILoadingTypeArr = {uILoadingType, uILoadingType2, uILoadingType3, uILoadingType4};
        Camera2StreamConfigurationMap = uILoadingTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(uILoadingTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.UILoadingType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
