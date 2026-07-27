package com.onesignal.notifications.internal.lifecycle;

import android.app.Activity;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationReceivedEvent;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import k4.InterfaceC1218d;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface INotificationLifecycleService {
    void addExternalClickListener(INotificationClickListener iNotificationClickListener);

    void addExternalForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC1218d interfaceC1218d);

    Object canReceiveNotification(JSONObject jSONObject, InterfaceC1218d interfaceC1218d);

    void externalNotificationWillShowInForeground(INotificationWillDisplayEvent iNotificationWillDisplayEvent);

    void externalRemoteNotificationReceived(INotificationReceivedEvent iNotificationReceivedEvent);

    Object notificationOpened(Activity activity, JSONArray jSONArray, InterfaceC1218d interfaceC1218d);

    Object notificationReceived(NotificationGenerationJob notificationGenerationJob, InterfaceC1218d interfaceC1218d);

    void removeExternalClickListener(INotificationClickListener iNotificationClickListener);

    void removeExternalForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener);

    void setInternalNotificationLifecycleCallback(INotificationLifecycleCallback iNotificationLifecycleCallback);
}
