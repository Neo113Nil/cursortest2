package com.visa.cbp.sdk.facade.util;

/* loaded from: classes5.dex */
public class ContextHelper {
    private static android.content.Context applicationContext = null;
    private static volatile boolean initialized = false;
    private static volatile com.visa.cbp.sdk.facade.util.ContextHelper instance;

    private ContextHelper() {
    }

    @java.lang.Deprecated
    public static com.visa.cbp.sdk.facade.util.ContextHelper getInstance(android.content.Context context) {
        com.visa.cbp.sdk.facade.util.ContextHelper contextHelper;
        synchronized (com.visa.cbp.sdk.facade.util.ContextHelper.class) {
            if (instance == null) {
                com.visa.cbp.sdk.facade.util.ContextHelper contextHelper2 = new com.visa.cbp.sdk.facade.util.ContextHelper();
                contextHelper2.init(context);
                instance = contextHelper2;
            }
            contextHelper = instance;
        }
        return contextHelper;
    }

    private void init(android.content.Context context) {
        if (initialized) {
            return;
        }
        applicationContext = context;
        initialized = true;
    }

    @java.lang.Deprecated
    public static android.content.Context getApplicationContext() {
        return applicationContext;
    }

    public static android.app.AlarmManager getAlarmService(android.content.Context context) {
        if (!initialized || context == null) {
            return null;
        }
        return (android.app.AlarmManager) context.getApplicationContext().getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
    }

    public static android.app.PendingIntent getPendingIntentService(android.content.Context context, int i, android.content.Intent intent, int i2) {
        if (!initialized || context == null) {
            return null;
        }
        return android.app.PendingIntent.getService(context.getApplicationContext(), i, intent, i2);
    }
}
