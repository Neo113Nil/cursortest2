package com.onesignal.notifications.internal.display;

import android.app.Notification;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.display.impl.IntentGeneratorForAttachingToNotifications;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayBuilder;
import k4.InterfaceC1218d;
import org.json.JSONObject;
import u.p;

/* loaded from: classes.dex */
public interface ISummaryNotificationDisplayer {
    void createGenericPendingIntentsForGroup(p pVar, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, String str, int i2);

    Object createGrouplessSummaryNotification(NotificationGenerationJob notificationGenerationJob, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, int i2, int i3, InterfaceC1218d interfaceC1218d);

    Notification createSingleNotificationBeforeSummaryBuilder(NotificationGenerationJob notificationGenerationJob, p pVar);

    Object createSummaryNotification(NotificationGenerationJob notificationGenerationJob, NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder, int i2, InterfaceC1218d interfaceC1218d);

    Object updateSummaryNotification(NotificationGenerationJob notificationGenerationJob, InterfaceC1218d interfaceC1218d);
}
