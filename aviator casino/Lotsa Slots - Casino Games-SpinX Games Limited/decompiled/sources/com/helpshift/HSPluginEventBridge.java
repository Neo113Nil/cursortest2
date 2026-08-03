package com.helpshift;

/* loaded from: classes4.dex */
public class HSPluginEventBridge {
    private static com.helpshift.HSPluginEventBridge.PluginEventsAPI pluginEventsAPI;

    public interface PluginEventsAPI {
        android.app.PendingIntent getPendingIntentForNotification(android.content.Context context, android.app.PendingIntent pendingIntent);

        boolean shouldCallFirstForegroundEvent();
    }

    public static void setPluginEventsAPI(com.helpshift.HSPluginEventBridge.PluginEventsAPI pluginEventsAPI2) {
        pluginEventsAPI = pluginEventsAPI2;
    }

    public static android.app.PendingIntent getPendingIntentForNotification(android.content.Context context, android.app.PendingIntent pendingIntent) {
        com.helpshift.HSPluginEventBridge.PluginEventsAPI pluginEventsAPI2 = pluginEventsAPI;
        return pluginEventsAPI2 != null ? pluginEventsAPI2.getPendingIntentForNotification(context, pendingIntent) : pendingIntent;
    }

    public static boolean shouldCallFirstForegroundEvent() {
        com.helpshift.HSPluginEventBridge.PluginEventsAPI pluginEventsAPI2 = pluginEventsAPI;
        if (pluginEventsAPI2 != null) {
            return pluginEventsAPI2.shouldCallFirstForegroundEvent();
        }
        return false;
    }
}
