package com.paypal.oslo.feature.activity.api.widget.configs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFailureVisibilityEnum;", "", "<init>", "(Ljava/lang/String;I)V", "WIDGET_HIDDEN_WHEN_NO_ACTIVITY_OR_FETCH_ERROR", "WIDGET_HIDDEN_ONLY_WHEN_NO_ACTIVITY", "WIDGET_HIDDEN_ONLY_WHEN_FETCH_ERROR", "WIDGET_VISIBLE_IN_ALL_CASES"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetFailureVisibilityEnum {
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum WIDGET_HIDDEN_ONLY_WHEN_FETCH_ERROR;
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum WIDGET_HIDDEN_ONLY_WHEN_NO_ACTIVITY;
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum WIDGET_HIDDEN_WHEN_NO_ACTIVITY_OR_FETCH_ERROR;
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum WIDGET_VISIBLE_IN_ALL_CASES;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum[] getHighSpeedVideoSizes;

    private ActivityWidgetFailureVisibilityEnum(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum activityWidgetFailureVisibilityEnum = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum("WIDGET_HIDDEN_WHEN_NO_ACTIVITY_OR_FETCH_ERROR", 0);
        WIDGET_HIDDEN_WHEN_NO_ACTIVITY_OR_FETCH_ERROR = activityWidgetFailureVisibilityEnum;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum activityWidgetFailureVisibilityEnum2 = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum("WIDGET_HIDDEN_ONLY_WHEN_NO_ACTIVITY", 1);
        WIDGET_HIDDEN_ONLY_WHEN_NO_ACTIVITY = activityWidgetFailureVisibilityEnum2;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum activityWidgetFailureVisibilityEnum3 = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum("WIDGET_HIDDEN_ONLY_WHEN_FETCH_ERROR", 2);
        WIDGET_HIDDEN_ONLY_WHEN_FETCH_ERROR = activityWidgetFailureVisibilityEnum3;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum activityWidgetFailureVisibilityEnum4 = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum("WIDGET_VISIBLE_IN_ALL_CASES", 3);
        WIDGET_VISIBLE_IN_ALL_CASES = activityWidgetFailureVisibilityEnum4;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum[] activityWidgetFailureVisibilityEnumArr = {activityWidgetFailureVisibilityEnum, activityWidgetFailureVisibilityEnum2, activityWidgetFailureVisibilityEnum3, activityWidgetFailureVisibilityEnum4};
        getHighSpeedVideoSizes = activityWidgetFailureVisibilityEnumArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(activityWidgetFailureVisibilityEnumArr);
    }

    public static com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum[] values() {
        return (com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum) java.lang.Enum.valueOf(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
