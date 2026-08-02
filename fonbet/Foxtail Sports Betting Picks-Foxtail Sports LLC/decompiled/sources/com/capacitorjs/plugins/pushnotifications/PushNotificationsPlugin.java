package com.capacitorjs.plugins.pushnotifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.getcapacitor.Bridge;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.PermissionState;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginHandle;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.getcapacitor.annotation.PermissionCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.CommonNotificationBuilder;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.NotificationParams;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@CapacitorPlugin(name = "PushNotifications", permissions = {@Permission(alias = PushNotificationsPlugin.PUSH_NOTIFICATIONS, strings = {"android.permission.POST_NOTIFICATIONS"})})
/* loaded from: classes.dex */
public class PushNotificationsPlugin extends Plugin {
    private static final String EVENT_TOKEN_CHANGE = "registration";
    private static final String EVENT_TOKEN_ERROR = "registrationError";
    static final String PUSH_NOTIFICATIONS = "receive";
    public static RemoteMessage lastMessage;
    public static Bridge staticBridge;
    public MessagingService firebaseMessagingService;
    private NotificationChannelManager notificationChannelManager;
    public NotificationManager notificationManager;

    @Override // com.getcapacitor.Plugin
    public void load() {
        this.notificationManager = (NotificationManager) getActivity().getSystemService("notification");
        this.firebaseMessagingService = new MessagingService();
        staticBridge = this.bridge;
        RemoteMessage remoteMessage = lastMessage;
        if (remoteMessage != null) {
            fireNotification(remoteMessage);
            lastMessage = null;
        }
        this.notificationChannelManager = new NotificationChannelManager(getActivity(), this.notificationManager, getConfig());
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnNewIntent(Intent intent) {
        super.handleOnNewIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey(Constants.MessagePayloadKeys.MSGID)) {
            return;
        }
        JSObject jSObject = new JSObject();
        JSObject jSObject2 = new JSObject();
        for (String str : extras.keySet()) {
            if (str.equals(Constants.MessagePayloadKeys.MSGID)) {
                jSObject.put("id", extras.getString(str));
            } else {
                jSObject2.put(str, extras.getString(str));
            }
        }
        jSObject.put("data", (Object) jSObject2);
        JSObject jSObject3 = new JSObject();
        jSObject3.put("actionId", "tap");
        jSObject3.put("notification", (Object) jSObject);
        notifyListeners("pushNotificationActionPerformed", jSObject3, true);
    }

    @Override // com.getcapacitor.Plugin
    @PluginMethod
    public void checkPermissions(PluginCall pluginCall) {
        if (Build.VERSION.SDK_INT < 33) {
            JSObject jSObject = new JSObject();
            jSObject.put(PUSH_NOTIFICATIONS, "granted");
            pluginCall.resolve(jSObject);
            return;
        }
        super.checkPermissions(pluginCall);
    }

    @Override // com.getcapacitor.Plugin
    @PluginMethod
    public void requestPermissions(PluginCall pluginCall) {
        if (Build.VERSION.SDK_INT < 33 || getPermissionState(PUSH_NOTIFICATIONS) == PermissionState.GRANTED) {
            JSObject jSObject = new JSObject();
            jSObject.put(PUSH_NOTIFICATIONS, "granted");
            pluginCall.resolve(jSObject);
            return;
        }
        requestPermissionForAlias(PUSH_NOTIFICATIONS, pluginCall, "permissionsCallback");
    }

    @PluginMethod
    public void register(PluginCall pluginCall) {
        FirebaseMessaging.getInstance().setAutoInitEnabled(true);
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: com.capacitorjs.plugins.pushnotifications.PushNotificationsPlugin$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                PushNotificationsPlugin.this.lambda$register$0(task);
            }
        });
        pluginCall.resolve();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$register$0(Task task) {
        if (!task.isSuccessful()) {
            sendError(task.getException().getLocalizedMessage());
        } else {
            sendToken((String) task.getResult());
        }
    }

    @PluginMethod
    public void unregister(PluginCall pluginCall) {
        FirebaseMessaging.getInstance().setAutoInitEnabled(false);
        FirebaseMessaging.getInstance().deleteToken();
        pluginCall.resolve();
    }

    @PluginMethod
    public void getDeliveredNotifications(PluginCall pluginCall) {
        JSArray jSArray = new JSArray();
        for (StatusBarNotification statusBarNotification : this.notificationManager.getActiveNotifications()) {
            JSObject jSObject = new JSObject();
            jSObject.put("id", statusBarNotification.getId());
            jSObject.put(ViewHierarchyConstants.TAG_KEY, statusBarNotification.getTag());
            Notification notification = statusBarNotification.getNotification();
            if (notification != null) {
                jSObject.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, (Object) notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE));
                jSObject.put("body", (Object) notification.extras.getCharSequence(NotificationCompat.EXTRA_TEXT));
                jSObject.put("group", notification.getGroup());
                jSObject.put("groupSummary", (notification.flags & 512) != 0);
                JSObject jSObject2 = new JSObject();
                for (String str : notification.extras.keySet()) {
                    jSObject2.put(str, notification.extras.getString(str));
                }
                jSObject.put("data", (Object) jSObject2);
            }
            jSArray.put(jSObject);
        }
        JSObject jSObject3 = new JSObject();
        jSObject3.put("notifications", (Object) jSArray);
        pluginCall.resolve(jSObject3);
    }

    @PluginMethod
    public void removeDeliveredNotifications(PluginCall pluginCall) {
        try {
            for (Object obj : pluginCall.getArray("notifications").toList()) {
                if (obj instanceof JSONObject) {
                    JSObject fromJSONObject = JSObject.fromJSONObject((JSONObject) obj);
                    String string = fromJSONObject.getString(ViewHierarchyConstants.TAG_KEY);
                    Integer integer = fromJSONObject.getInteger("id");
                    NotificationManager notificationManager = this.notificationManager;
                    if (string == null) {
                        notificationManager.cancel(integer.intValue());
                    } else {
                        notificationManager.cancel(string, integer.intValue());
                    }
                } else {
                    pluginCall.reject("Expected notifications to be a list of notification objects");
                }
            }
        } catch (JSONException e) {
            pluginCall.reject(e.getMessage());
        }
        pluginCall.resolve();
    }

    @PluginMethod
    public void removeAllDeliveredNotifications(PluginCall pluginCall) {
        this.notificationManager.cancelAll();
        pluginCall.resolve();
    }

    @PluginMethod
    public void createChannel(PluginCall pluginCall) {
        this.notificationChannelManager.createChannel(pluginCall);
    }

    @PluginMethod
    public void deleteChannel(PluginCall pluginCall) {
        this.notificationChannelManager.deleteChannel(pluginCall);
    }

    @PluginMethod
    public void listChannels(PluginCall pluginCall) {
        this.notificationChannelManager.listChannels(pluginCall);
    }

    public void sendToken(String str) {
        JSObject jSObject = new JSObject();
        jSObject.put("value", str);
        notifyListeners(EVENT_TOKEN_CHANGE, jSObject, true);
    }

    public void sendError(String str) {
        JSObject jSObject = new JSObject();
        jSObject.put("error", str);
        notifyListeners(EVENT_TOKEN_ERROR, jSObject, true);
    }

    public static void onNewToken(String str) {
        PushNotificationsPlugin pushNotificationsInstance = getPushNotificationsInstance();
        if (pushNotificationsInstance != null) {
            pushNotificationsInstance.sendToken(str);
        }
    }

    public static void sendRemoteMessage(RemoteMessage remoteMessage) {
        PushNotificationsPlugin pushNotificationsInstance = getPushNotificationsInstance();
        if (pushNotificationsInstance != null) {
            pushNotificationsInstance.fireNotification(remoteMessage);
        } else {
            lastMessage = remoteMessage;
        }
    }

    public void fireNotification(RemoteMessage remoteMessage) {
        Bundle bundle;
        JSObject jSObject = new JSObject();
        JSObject jSObject2 = new JSObject();
        jSObject.put("id", remoteMessage.getMessageId());
        for (String str : remoteMessage.getData().keySet()) {
            jSObject2.put(str, (Object) remoteMessage.getData().get(str));
        }
        jSObject.put("data", (Object) jSObject2);
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        if (notification != null) {
            String title = notification.getTitle();
            String body = notification.getBody();
            String[] array = getConfig().getArray("presentationOptions");
            if (array != null && Arrays.asList(array).contains("alert")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    try {
                        bundle = getContext().getPackageManager().getApplicationInfo(getContext().getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)).metaData;
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                        bundle = null;
                    }
                } else {
                    bundle = getBundleLegacy();
                }
                if (bundle != null) {
                    NotificationParams notificationParams = new NotificationParams(remoteMessage.toIntent().getExtras());
                    CommonNotificationBuilder.DisplayNotificationInfo createNotificationInfo = CommonNotificationBuilder.createNotificationInfo(getContext(), getContext(), notificationParams, CommonNotificationBuilder.getOrCreateChannel(getContext(), notificationParams.getNotificationChannelId(), bundle), bundle);
                    this.notificationManager.notify(createNotificationInfo.tag, createNotificationInfo.id, createNotificationInfo.notificationBuilder.build());
                }
            }
            jSObject.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, title);
            jSObject.put("body", body);
            jSObject.put("click_action", notification.getClickAction());
            Uri link = notification.getLink();
            if (link != null) {
                jSObject.put("link", link.toString());
            }
        }
        notifyListeners("pushNotificationReceived", jSObject, true);
    }

    public static PushNotificationsPlugin getPushNotificationsInstance() {
        PluginHandle plugin;
        Bridge bridge = staticBridge;
        if (bridge == null || bridge.getWebView() == null || (plugin = staticBridge.getPlugin("PushNotifications")) == null) {
            return null;
        }
        return (PushNotificationsPlugin) plugin.getInstance();
    }

    @PermissionCallback
    private void permissionsCallback(PluginCall pluginCall) {
        checkPermissions(pluginCall);
    }

    private Bundle getBundleLegacy() {
        try {
            return getContext().getPackageManager().getApplicationInfo(getContext().getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
