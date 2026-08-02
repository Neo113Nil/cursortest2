package com.paypal.oslo.feature.activity.api.widget.configs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetViewType;", "", "<init>", "(Ljava/lang/String;I)V", "WIDGET_WITH_MULTIPLE_COUNTER_PARTY", "WIDGET_WITH_SINGLE_COUNTER_PARTY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetViewType {
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType WIDGET_WITH_MULTIPLE_COUNTER_PARTY;
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType WIDGET_WITH_SINGLE_COUNTER_PARTY;
    private static final /* synthetic */ com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ActivityWidgetViewType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType activityWidgetViewType = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType("WIDGET_WITH_MULTIPLE_COUNTER_PARTY", 0);
        WIDGET_WITH_MULTIPLE_COUNTER_PARTY = activityWidgetViewType;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType activityWidgetViewType2 = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType("WIDGET_WITH_SINGLE_COUNTER_PARTY", 1);
        WIDGET_WITH_SINGLE_COUNTER_PARTY = activityWidgetViewType2;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType[] activityWidgetViewTypeArr = {activityWidgetViewType, activityWidgetViewType2};
        getHighSpeedVideoFpsRanges = activityWidgetViewTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(activityWidgetViewTypeArr);
    }

    public static com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType[] values() {
        return (com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType) java.lang.Enum.valueOf(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
