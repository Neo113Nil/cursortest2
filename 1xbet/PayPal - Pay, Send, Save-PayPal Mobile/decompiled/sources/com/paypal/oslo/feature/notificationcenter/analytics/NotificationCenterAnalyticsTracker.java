package com.paypal.oslo.feature.notificationcenter.analytics;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b&\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/analytics/NotificationCenterAnalyticsTracker;", "", "<init>", "()V", "", "action", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "notificationGenericContext", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;", "notification", "notificationComponentContext", "(Ljava/lang/String;Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;)Ljava/util/List;", "notificationOverflowContext", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationError;", "error", "", "trackNotificationFetchFailed", "(Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationError;)V", "notifications", "trackNotificationListItemsLoaded", "(Ljava/util/List;)V", "itemName", "trackContextMenuItemPressed", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;)V", "errorDescription", "trackDeeplinkNavigationFailed", "(Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "status", "", "isNetworkError", "trackNotificationStatusUpdateFailed", "(Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;Z)V", "sectionTag", "getNotificationFeatureTag", "(Ljava/lang/String;)Ljava/lang/String;", "getNotificationCardTag"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationCenterAnalyticsTracker {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker INSTANCE = new com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker();

    private NotificationCenterAnalyticsTracker() {
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> notificationGenericContext(java.lang.String action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Screen.NOTIFICATION_CENTER_HOME), null, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_NOTIFICATIONS, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER, action), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Flow.NOTIFICATION_CENTER_SESSION, null)});
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> notificationComponentContext(java.lang.String action, com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Screen.NOTIFICATION_CENTER_HOME), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Module.NOTIFICATION_LIST, 0, null, null, 14, null), null, null, 12, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_NOTIFICATIONS, getNotificationFeatureTag(notification.getSectionTag()), action), new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext(notification.getCampaignId(), null, notification.getInstanceId(), null, 10, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext("deeplink", notification.getDeepLink(), null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Flow.NOTIFICATION_CENTER_SESSION, null)});
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> notificationOverflowContext(java.lang.String action, com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Screen.NOTIFICATION_CENTER_HOME), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Component.NOTIFICATION_CARD, 0, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.OVERFLOW_MENU_BUTTON, 0, 2, null), 2, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_NOTIFICATIONS, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER, action), new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext(notification.getCampaignId(), null, notification.getInstanceId(), null, 10, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext("notification_context_menu", null)});
    }

    public final void trackNotificationFetchFailed(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.Triple triple = error instanceof com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NoInternetError ? new kotlin.Triple(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.NO_INTERNET, "network", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.NO_INTERNET_ERROR) : new kotlin.Triple(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.BAD_RESPONSE, "system", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.GENERIC_ERROR);
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Screen.NOTIFICATION_CENTER_HOME), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Module.NOTIFICATION_LIST, 0, null, null, 14, null), null, null, 12, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_NOTIFICATIONS, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.FETCH_FAILED), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext((java.lang.String) triple.component1(), (java.lang.String) triple.component3(), (java.lang.String) triple.component2(), "api_call")).track(com.paypal.oslo.feature.notificationcenter.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackNotificationListItemsLoaded(java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> notifications) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifications, "");
        int i = 0;
        for (java.lang.Object obj : notifications) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification = (com.paypal.oslo.feature.notificationcenter.domain.model.Notification) obj;
            new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Screen.NOTIFICATION_CENTER_HOME), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Module.NOTIFICATION_LIST, 0, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Component.NOTIFICATION_CARD, 0, null, java.lang.Integer.valueOf(i), 6, null), null, 8, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_NOTIFICATIONS, INSTANCE.getNotificationFeatureTag(notification.getSectionTag()), com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.RENDERED), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext(notification.getCampaignId(), null, notification.getInstanceId(), null, 10, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Flow.NOTIFICATION_CENTER_SESSION, null)})).track(com.paypal.oslo.feature.notificationcenter.AnalyticsTrackerKt.analyticsTracker);
            i++;
        }
    }

    public final void trackContextMenuItemPressed(java.lang.String action, java.lang.String itemName, com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Screen.NOTIFICATION_CENTER_HOME), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("notification_context_menu", 0, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Component.NOTIFICATION_CARD, 0, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(itemName, 0, 2, null)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_NOTIFICATIONS, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER, action), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext(notification.getCampaignId(), null, notification.getInstanceId(), null, 10, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext("notification_context_menu", null)})).track(com.paypal.oslo.feature.notificationcenter.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackDeeplinkNavigationFailed(com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification, java.lang.String errorDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Screen.NOTIFICATION_CENTER_HOME), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Module.NOTIFICATION_LIST, 0, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Component.NOTIFICATION_CARD, 0, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(getNotificationCardTag(notification.getSectionTag()), 0, 2, null)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_NOTIFICATIONS, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.OPEN_NOTIFICATION_FAILED), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.INVALID_DEEPLINK, errorDescription, "system", "navigation")).track(com.paypal.oslo.feature.notificationcenter.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackNotificationStatusUpdateFailed(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus status, boolean isNetworkError) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        int i = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            str = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.MARK_ALL_AS_READ_BUTTON;
        } else if (i != 2) {
            return;
        } else {
            str = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.DELETE_NOTIFICATION_OPTION;
        }
        int i2 = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i2 == 1) {
            str2 = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.MARK_AS_READ_FAILED;
        } else if (i2 != 2) {
            return;
        } else {
            str2 = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.DELETE_FAILED;
        }
        if (isNetworkError) {
            str3 = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.NO_INTERNET;
        } else {
            str3 = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.BAD_RESPONSE;
        }
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Screen.NOTIFICATION_CENTER_HOME), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("notification_context_menu", 0, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Component.NOTIFICATION_CARD, 0, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(str, 0, 2, null)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_NOTIFICATIONS, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER, str2), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str3, "network", "network", "api_call")).track(com.paypal.oslo.feature.notificationcenter.AnalyticsTrackerKt.analyticsTracker);
    }

    public final java.lang.String getNotificationFeatureTag(java.lang.String sectionTag) {
        boolean isUrgent = com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.INSTANCE.isUrgent(sectionTag);
        if (isUrgent) {
            return com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER_URGENT;
        }
        if (isUrgent) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER_ALL;
    }

    public final java.lang.String getNotificationCardTag(java.lang.String sectionTag) {
        boolean isUrgent = com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.INSTANCE.isUrgent(sectionTag);
        if (isUrgent) {
            return com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.NOTIFICATION_CARD_URGENT;
        }
        if (isUrgent) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.NOTIFICATION_CARD_ALL;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.CLICKED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.DISMISSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
