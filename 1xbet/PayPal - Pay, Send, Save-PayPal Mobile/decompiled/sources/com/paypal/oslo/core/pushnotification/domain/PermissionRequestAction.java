package com.paypal.oslo.core.pushnotification.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/PermissionRequestAction;", "", "<init>", "(Ljava/lang/String;I)V", "ALREADY_GRANTED", "PERMISSION_DIALOG_SHOWN", "REQUIRES_SETTINGS", "NOT_REQUIRED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PermissionRequestAction {
    public static final com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction ALREADY_GRANTED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction NOT_REQUIRED;
    public static final com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction PERMISSION_DIALOG_SHOWN;
    public static final com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction REQUIRES_SETTINGS;
    private static final /* synthetic */ com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction[] getHighSpeedVideoFpsRanges;

    private PermissionRequestAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction permissionRequestAction = new com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction("ALREADY_GRANTED", 0);
        ALREADY_GRANTED = permissionRequestAction;
        com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction permissionRequestAction2 = new com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction("PERMISSION_DIALOG_SHOWN", 1);
        PERMISSION_DIALOG_SHOWN = permissionRequestAction2;
        com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction permissionRequestAction3 = new com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction("REQUIRES_SETTINGS", 2);
        REQUIRES_SETTINGS = permissionRequestAction3;
        com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction permissionRequestAction4 = new com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction("NOT_REQUIRED", 3);
        NOT_REQUIRED = permissionRequestAction4;
        com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction[] permissionRequestActionArr = {permissionRequestAction, permissionRequestAction2, permissionRequestAction3, permissionRequestAction4};
        getHighSpeedVideoFpsRanges = permissionRequestActionArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(permissionRequestActionArr);
    }

    public static com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction[] values() {
        return (com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction) java.lang.Enum.valueOf(com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.pushnotification.domain.PermissionRequestAction> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
