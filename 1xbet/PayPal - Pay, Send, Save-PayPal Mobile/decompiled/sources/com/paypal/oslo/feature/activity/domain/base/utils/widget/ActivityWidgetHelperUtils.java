package com.paypal.oslo.feature.activity.domain.base.utils.widget;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/widget/ActivityWidgetHelperUtils;", "", "<init>", "()V", "Lkotlin/Pair;", "Ljava/util/Date;", "getDefaultDateRangeForWidget", "()Lkotlin/Pair;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;", "filtersConfig", "fetchDateRangeFromWidgetConfig", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;)Lkotlin/Pair;", "", "p0", "p1", "p2", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;", "getDefaultActivityWidgetFullScreenDto", "()Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "config", "", "hasMoreActivities", "shouldShowSeeAllButton", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;Z)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetHelperUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.base.utils.widget.ActivityWidgetHelperUtils INSTANCE = new com.paypal.oslo.feature.activity.domain.base.utils.widget.ActivityWidgetHelperUtils();

    private ActivityWidgetHelperUtils() {
    }

    public final kotlin.Pair<java.util.Date, java.util.Date> getDefaultDateRangeForWidget() {
        kotlin.Pair<java.util.Date, java.util.Date> transformInUTCFormat = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.transformInUTCFormat(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.NDays(-90, 0, 2, null));
        return new kotlin.Pair<>(transformInUTCFormat.getFirst(), transformInUTCFormat.getSecond());
    }

    public final kotlin.Pair<java.util.Date, java.util.Date> fetchDateRangeFromWidgetConfig(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig filtersConfig) {
        java.lang.String str;
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filtersConfig, "");
        java.util.Date startTime = filtersConfig.getStartTime();
        java.util.Date endTime = filtersConfig.getEndTime();
        if (startTime == null || endTime == null) {
            java.lang.String str2 = "null";
            if (startTime == null || (str = startTime.toString()) == null) {
                str = "null";
            }
            if (endTime != null && (obj = endTime.toString()) != null) {
                str2 = obj;
            }
            getHighResolutionOutputSizeshNQ4ISI("Invalid date range: startTime or endTime is null", str, str2);
            return getDefaultDateRangeForWidget();
        }
        arrow.core.Either<java.lang.Throwable, java.lang.Boolean> isDateRangeValid = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.isDateRangeValid(startTime, endTime);
        if (isDateRangeValid instanceof arrow.core.Either.Right) {
            return new kotlin.Pair<>(startTime, endTime);
        }
        if (isDateRangeValid instanceof arrow.core.Either.Left) {
            java.lang.Throwable th = (java.lang.Throwable) ((arrow.core.Either.Left) isDateRangeValid).getValue();
            com.paypal.oslo.feature.activity.domain.base.utils.widget.ActivityWidgetHelperUtils activityWidgetHelperUtils = INSTANCE;
            java.lang.String concat = "Invalid date range: ".concat(java.lang.String.valueOf(th.getMessage()));
            java.lang.String obj2 = startTime.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            java.lang.String obj3 = endTime.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
            activityWidgetHelperUtils.getHighResolutionOutputSizeshNQ4ISI(concat, obj2, obj3);
            return activityWidgetHelperUtils.getDefaultDateRangeForWidget();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, p0, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName()), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fetchDateRangeFromWidgetConfig"), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, p1), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_END_TIME, p2)), null, 4, null);
    }

    public final com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto getDefaultActivityWidgetFullScreenDto() {
        kotlin.Pair<java.util.Date, java.util.Date> transformInUTCFormat = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.transformInUTCFormat(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year(-3, 0, 2, null));
        return new com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto("unknown", new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig(transformInUTCFormat.getFirst(), transformInUTCFormat.getSecond(), (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, 16777212, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, 12, null);
    }

    public final boolean shouldShowSeeAllButton(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration config, boolean hasMoreActivities) {
        return config == null || !config.getUiConfig().getAutoHideSeeAllWhenNoMore() || hasMoreActivities;
    }
}
