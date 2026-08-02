package com.paypal.oslo.feature.activity.api.widget.configs;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/configs/DefaultWidgetConfig;", "", "<init>", "()V", "", "WIDGET_TXN_FETCH_COUNT", com.visa.cbp.getEncExpo.warmup, "", "SOURCE_UNKNOWN", "Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFailureVisibilityEnum;", "WIDGET_FAILURE_VISIBILITY", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFailureVisibilityEnum;", "getWIDGET_FAILURE_VISIBILITY", "()Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFailureVisibilityEnum;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetViewType;", "WIDGET_VIEW_TYPE", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetViewType;", "getWIDGET_VIEW_TYPE", "()Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetViewType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DefaultWidgetConfig {
    public static final int $stable = 0;
    public static final java.lang.String SOURCE_UNKNOWN = "unknown";
    public static final int WIDGET_TXN_FETCH_COUNT = 3;
    public static final com.paypal.oslo.feature.activity.api.widget.configs.DefaultWidgetConfig INSTANCE = new com.paypal.oslo.feature.activity.api.widget.configs.DefaultWidgetConfig();
    private static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum WIDGET_FAILURE_VISIBILITY = com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum.WIDGET_VISIBLE_IN_ALL_CASES;
    private static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType WIDGET_VIEW_TYPE = com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType.WIDGET_WITH_MULTIPLE_COUNTER_PARTY;

    private DefaultWidgetConfig() {
    }

    public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum getWIDGET_FAILURE_VISIBILITY() {
        return WIDGET_FAILURE_VISIBILITY;
    }

    public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType getWIDGET_VIEW_TYPE() {
        return WIDGET_VIEW_TYPE;
    }
}
