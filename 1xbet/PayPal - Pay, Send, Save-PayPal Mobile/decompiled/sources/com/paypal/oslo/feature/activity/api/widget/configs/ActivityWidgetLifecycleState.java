package com.paypal.oslo.feature.activity.api.widget.configs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetLifecycleState;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZED_HIDDEN", "FETCH_IN_PROGRESS", "SUCCESS_NO_ACTIVITY", "SUCCESS", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetLifecycleState {
    private static final /* synthetic */ com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState ERROR;
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState FETCH_IN_PROGRESS;
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState INITIALIZED_HIDDEN;
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState SUCCESS;
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState SUCCESS_NO_ACTIVITY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ActivityWidgetLifecycleState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState activityWidgetLifecycleState = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState("INITIALIZED_HIDDEN", 0);
        INITIALIZED_HIDDEN = activityWidgetLifecycleState;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState activityWidgetLifecycleState2 = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState("FETCH_IN_PROGRESS", 1);
        FETCH_IN_PROGRESS = activityWidgetLifecycleState2;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState activityWidgetLifecycleState3 = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState("SUCCESS_NO_ACTIVITY", 2);
        SUCCESS_NO_ACTIVITY = activityWidgetLifecycleState3;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState activityWidgetLifecycleState4 = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState("SUCCESS", 3);
        SUCCESS = activityWidgetLifecycleState4;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState activityWidgetLifecycleState5 = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState("ERROR", 4);
        ERROR = activityWidgetLifecycleState5;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState[] activityWidgetLifecycleStateArr = {activityWidgetLifecycleState, activityWidgetLifecycleState2, activityWidgetLifecycleState3, activityWidgetLifecycleState4, activityWidgetLifecycleState5};
        Camera2StreamConfigurationMap = activityWidgetLifecycleStateArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(activityWidgetLifecycleStateArr);
    }

    public static com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState[] values() {
        return (com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState) java.lang.Enum.valueOf(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
