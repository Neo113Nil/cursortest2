package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public enum NotificationAction {
    ACTION_REPLENISH_FAIL(1),
    ACTION_CHECK_STATUS_FAIL(2),
    ACTION_SELECTED_CARD_DELETED(3),
    ACTION_ACCESS_TOKEN_ABOUT_TO_EXPIRE(4),
    ACTION_ACCESS_TOKEN_EXPIRED(5),
    ACTION_TOKEN_UPDATED(6),
    ACTION_REPLENISH_SUCCESS(7),
    ACTION_REPLENISH(8),
    ACTION_TOKEN_DELETED(9),
    ACTION_DELETED_ALL_TOKENS(10);

    private static final android.util.SparseArray<com.visa.cbp.sdk.facade.data.NotificationAction> array = new android.util.SparseArray<>();
    private int code;

    static {
        for (com.visa.cbp.sdk.facade.data.NotificationAction notificationAction : values()) {
            array.put(notificationAction.getCode(), notificationAction);
        }
    }

    NotificationAction(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    public static com.visa.cbp.sdk.facade.data.NotificationAction get(int i) {
        return array.get(i);
    }
}
