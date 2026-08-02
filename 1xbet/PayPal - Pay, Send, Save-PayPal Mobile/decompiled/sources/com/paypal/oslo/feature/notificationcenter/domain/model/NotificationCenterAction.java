package com.paypal.oslo.feature.notificationcenter.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationCenterAction;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "stringResId", com.visa.cbp.getEncExpo.warmup, "getStringResId", "()I", "MARK_AS_READ", "SHOW_MORE_NOTIFICATIONS", "SHOW_LESS_NOTIFICATIONS", "DELETE_NOTIFICATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationCenterAction {
    private static final /* synthetic */ com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction DELETE_NOTIFICATION;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction MARK_AS_READ;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction SHOW_LESS_NOTIFICATIONS;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction SHOW_MORE_NOTIFICATIONS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final int stringResId;

    private NotificationCenterAction(java.lang.String str, int i, int i2) {
        this.stringResId = i2;
    }

    public final int getStringResId() {
        return this.stringResId;
    }

    static {
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction notificationCenterAction = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction("MARK_AS_READ", 0, com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_notification_action_mark_as_read);
        MARK_AS_READ = notificationCenterAction;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction notificationCenterAction2 = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction("SHOW_MORE_NOTIFICATIONS", 1, com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_notification_action_show_more);
        SHOW_MORE_NOTIFICATIONS = notificationCenterAction2;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction notificationCenterAction3 = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction("SHOW_LESS_NOTIFICATIONS", 2, com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_notification_action_show_less);
        SHOW_LESS_NOTIFICATIONS = notificationCenterAction3;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction notificationCenterAction4 = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction("DELETE_NOTIFICATION", 3, com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_notification_action_delete);
        DELETE_NOTIFICATION = notificationCenterAction4;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction[] notificationCenterActionArr = {notificationCenterAction, notificationCenterAction2, notificationCenterAction3, notificationCenterAction4};
        Camera2StreamConfigurationMap = notificationCenterActionArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(notificationCenterActionArr);
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction[] values() {
        return (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.notificationcenter.domain.model.NotificationCenterAction> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
