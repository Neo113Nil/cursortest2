package com.paypal.oslo.feature.activity.api.widget.configs;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetUIConfig;", "", "", "headerVisibility", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFailureVisibilityEnum;", "widgetFailureVisibilityConfig", "isSilentRefresh", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetViewType;", "widgetViewType", "autoHideSeeAllWhenNoMore", "<init>", "(ZLcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFailureVisibilityEnum;ZLcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetViewType;Z)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFailureVisibilityEnum;", "component3", "component4", "()Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetViewType;", "component5", "copy", "(ZLcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFailureVisibilityEnum;ZLcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetViewType;Z)Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetUIConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getHeaderVisibility", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFailureVisibilityEnum;", "getWidgetFailureVisibilityConfig", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetViewType;", "getWidgetViewType", "getAutoHideSeeAllWhenNoMore"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityWidgetUIConfig {
    public static final int $stable = 0;
    private final boolean autoHideSeeAllWhenNoMore;
    private final boolean headerVisibility;
    private final boolean isSilentRefresh;
    private final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum widgetFailureVisibilityConfig;
    private final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType widgetViewType;

    public ActivityWidgetUIConfig(boolean z, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum activityWidgetFailureVisibilityEnum, boolean z2, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType activityWidgetViewType, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetFailureVisibilityEnum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetViewType, "");
        this.headerVisibility = z;
        this.widgetFailureVisibilityConfig = activityWidgetFailureVisibilityEnum;
        this.isSilentRefresh = z2;
        this.widgetViewType = activityWidgetViewType;
        this.autoHideSeeAllWhenNoMore = z3;
    }

    public final boolean getHeaderVisibility() {
        return this.headerVisibility;
    }

    public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum getWidgetFailureVisibilityConfig() {
        return this.widgetFailureVisibilityConfig;
    }

    public /* synthetic */ ActivityWidgetUIConfig(boolean z, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum activityWidgetFailureVisibilityEnum, boolean z2, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType activityWidgetViewType, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? com.paypal.oslo.feature.activity.api.widget.configs.DefaultWidgetConfig.INSTANCE.getWIDGET_FAILURE_VISIBILITY() : activityWidgetFailureVisibilityEnum, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? com.paypal.oslo.feature.activity.api.widget.configs.DefaultWidgetConfig.INSTANCE.getWIDGET_VIEW_TYPE() : activityWidgetViewType, (i & 16) != 0 ? true : z3);
    }

    public final boolean isSilentRefresh() {
        return this.isSilentRefresh;
    }

    public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType getWidgetViewType() {
        return this.widgetViewType;
    }

    public final boolean getAutoHideSeeAllWhenNoMore() {
        return this.autoHideSeeAllWhenNoMore;
    }

    public final java.lang.String toString() {
        boolean z = this.headerVisibility;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum activityWidgetFailureVisibilityEnum = this.widgetFailureVisibilityConfig;
        boolean z2 = this.isSilentRefresh;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType activityWidgetViewType = this.widgetViewType;
        boolean z3 = this.autoHideSeeAllWhenNoMore;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityWidgetUIConfig(headerVisibility=");
        sb.append(z);
        sb.append(", widgetFailureVisibilityConfig=");
        sb.append(activityWidgetFailureVisibilityEnum);
        sb.append(", isSilentRefresh=");
        sb.append(z2);
        sb.append(", widgetViewType=");
        sb.append(activityWidgetViewType);
        sb.append(", autoHideSeeAllWhenNoMore=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.headerVisibility) * 31) + this.widgetFailureVisibilityConfig.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isSilentRefresh)) * 31) + this.widgetViewType.hashCode()) * 31) + java.lang.Boolean.hashCode(this.autoHideSeeAllWhenNoMore);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig)) {
            return false;
        }
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig activityWidgetUIConfig = (com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig) other;
        return this.headerVisibility == activityWidgetUIConfig.headerVisibility && this.widgetFailureVisibilityConfig == activityWidgetUIConfig.widgetFailureVisibilityConfig && this.isSilentRefresh == activityWidgetUIConfig.isSilentRefresh && this.widgetViewType == activityWidgetUIConfig.widgetViewType && this.autoHideSeeAllWhenNoMore == activityWidgetUIConfig.autoHideSeeAllWhenNoMore;
    }

    public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig copy(boolean headerVisibility, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum widgetFailureVisibilityConfig, boolean isSilentRefresh, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType widgetViewType, boolean autoHideSeeAllWhenNoMore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetFailureVisibilityConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetViewType, "");
        return new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig(headerVisibility, widgetFailureVisibilityConfig, isSilentRefresh, widgetViewType, autoHideSeeAllWhenNoMore);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAutoHideSeeAllWhenNoMore() {
        return this.autoHideSeeAllWhenNoMore;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType getWidgetViewType() {
        return this.widgetViewType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSilentRefresh() {
        return this.isSilentRefresh;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum getWidgetFailureVisibilityConfig() {
        return this.widgetFailureVisibilityConfig;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHeaderVisibility() {
        return this.headerVisibility;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig copy$default(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig activityWidgetUIConfig, boolean z, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum activityWidgetFailureVisibilityEnum, boolean z2, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType activityWidgetViewType, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = activityWidgetUIConfig.headerVisibility;
        }
        if ((i & 2) != 0) {
            activityWidgetFailureVisibilityEnum = activityWidgetUIConfig.widgetFailureVisibilityConfig;
        }
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum activityWidgetFailureVisibilityEnum2 = activityWidgetFailureVisibilityEnum;
        if ((i & 4) != 0) {
            z2 = activityWidgetUIConfig.isSilentRefresh;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            activityWidgetViewType = activityWidgetUIConfig.widgetViewType;
        }
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType activityWidgetViewType2 = activityWidgetViewType;
        if ((i & 16) != 0) {
            z3 = activityWidgetUIConfig.autoHideSeeAllWhenNoMore;
        }
        return activityWidgetUIConfig.copy(z, activityWidgetFailureVisibilityEnum2, z4, activityWidgetViewType2, z3);
    }

    public ActivityWidgetUIConfig() {
        this(false, null, false, null, false, 31, null);
    }
}
