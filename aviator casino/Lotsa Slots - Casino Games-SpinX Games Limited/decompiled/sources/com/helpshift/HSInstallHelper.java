package com.helpshift;

/* loaded from: classes4.dex */
public class HSInstallHelper {
    private HSInstallHelper() {
    }

    static java.util.Map<java.lang.String, java.lang.Object> sanitizeConfig(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        java.util.Map<java.lang.String, java.lang.Object> defaultConfigMap = com.helpshift.util.ConfigValues.getDefaultConfigMap();
        defaultConfigMap.putAll(map);
        return defaultConfigMap;
    }

    static void setNotificationConfigValues(com.helpshift.platform.Device device, com.helpshift.notification.CoreNotificationManager coreNotificationManager, java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.String packageName = device.getPackageName();
        java.lang.Object obj = map.get(com.helpshift.util.ConfigValues.NOTIFICATION_CHANNEL_ID);
        if (obj instanceof java.lang.String) {
            coreNotificationManager.setNotificationChannelId((java.lang.String) obj);
        }
        java.lang.Object obj2 = map.get(com.helpshift.util.ConfigValues.NOTIFICATION_SOUND_ID);
        if (obj2 instanceof java.lang.Integer) {
            coreNotificationManager.setNotificationSoundId(((java.lang.Integer) obj2).intValue());
        } else if (obj2 instanceof java.lang.String) {
            coreNotificationManager.setNotificationSoundId(device.getResourceIdFromName((java.lang.String) obj2, "raw", packageName));
        }
        java.lang.Object obj3 = map.get(com.helpshift.util.ConfigValues.NOTIFICATION_ICON);
        if (obj3 instanceof java.lang.Integer) {
            coreNotificationManager.setNotificationIcon(((java.lang.Integer) obj3).intValue());
        } else if (obj3 instanceof java.lang.String) {
            coreNotificationManager.setNotificationIcon(device.getResourceIdFromName((java.lang.String) obj3, "drawable", packageName));
        }
        java.lang.Object obj4 = map.get(com.helpshift.util.ConfigValues.NOTIFICATION_LARGE_ICON);
        if (obj4 instanceof java.lang.Integer) {
            coreNotificationManager.setNotificationLargeIcon(((java.lang.Integer) obj4).intValue());
        } else if (obj4 instanceof java.lang.String) {
            coreNotificationManager.setNotificationLargeIcon(device.getResourceIdFromName((java.lang.String) obj4, "drawable", packageName));
        }
    }

    static void setEnableInAppNotification(java.util.Map<java.lang.String, java.lang.Object> map, com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        java.lang.Object obj = map.get(com.helpshift.util.ConfigValues.ENABLE_IN_APP_NOTIFICATION);
        hSPersistentStorage.setEnableInAppNotification(obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : true);
    }

    static void setScreenOrientation(java.util.Map<java.lang.String, java.lang.Object> map, com.helpshift.storage.HSPersistentStorage hSPersistentStorage, int i) {
        java.lang.Object obj = map.get(com.helpshift.util.ConfigValues.SCREEN_ORIENTATION);
        if (obj instanceof java.lang.Integer) {
            i = ((java.lang.Integer) obj).intValue();
        }
        hSPersistentStorage.setRequestedScreenOrientation(i);
    }
}
