package com.onesignal.flutter;

import D4.E;
import H2.f;
import H2.l;
import H2.m;
import H2.n;
import I4.o;
import K4.d;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.INotificationClickEvent;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import com.onesignal.notifications.IPermissionObserver;
import f4.C0431h;
import java.util.HashMap;
import java.util.Map;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class OneSignalNotifications extends FlutterMessengerResponder implements m, INotificationClickListener, INotificationLifecycleListener, IPermissionObserver {
    private static OneSignalNotifications sharedInstance;
    private final HashMap<String, INotificationWillDisplayEvent> notificationOnWillDisplayEventCache = new HashMap<>();
    private final HashMap<String, INotificationWillDisplayEvent> preventedDefaultCache = new HashMap<>();

    public class RequestPermissionContinuation implements InterfaceC1218d {
        private final n result;

        public RequestPermissionContinuation(n nVar) {
            this.result = nVar;
        }

        @Override // k4.InterfaceC1218d
        public InterfaceC1223i getContext() {
            d dVar = E.f459a;
            return o.f1316a;
        }

        @Override // k4.InterfaceC1218d
        public void resumeWith(Object obj) {
            if (!(obj instanceof C0431h)) {
                OneSignalNotifications.this.replySuccess(this.result, obj);
                return;
            }
            Throwable th = ((C0431h) obj).f5670a;
            OneSignalNotifications.this.replyError(this.result, "OneSignal", "requestPermission failed with error: " + th.getMessage() + "\n" + th.getStackTrace(), null);
        }
    }

    private OneSignalNotifications() {
    }

    private void clearAll(l lVar, n nVar) {
        OneSignal.getNotifications().mo22clearAllNotifications();
        replySuccess(nVar, null);
    }

    private void displayNotification(l lVar, n nVar) {
        String str = (String) lVar.a("notificationId");
        INotificationWillDisplayEvent iNotificationWillDisplayEvent = this.notificationOnWillDisplayEventCache.get(str);
        if (iNotificationWillDisplayEvent != null) {
            iNotificationWillDisplayEvent.getNotification().display();
            replySuccess(nVar, null);
        } else {
            Logging.error("Could not find onWillDisplayNotification event for notification with id: " + str, null);
        }
    }

    private JSONObject getJsonFromMap(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Map) {
                obj = getJsonFromMap((Map) obj);
            }
            jSONObject.put(str, obj);
        }
        return jSONObject;
    }

    public static OneSignalNotifications getSharedInstance() {
        if (sharedInstance == null) {
            sharedInstance = new OneSignalNotifications();
        }
        return sharedInstance;
    }

    private void lifecycleInit(n nVar) {
        OneSignal.getNotifications().mo26removeForegroundLifecycleListener(this);
        OneSignal.getNotifications().mo20addForegroundLifecycleListener(this);
        OneSignal.getNotifications().mo29removePermissionObserver(this);
        OneSignal.getNotifications().mo21addPermissionObserver(this);
        this.notificationOnWillDisplayEventCache.clear();
        this.preventedDefaultCache.clear();
        replySuccess(nVar, null);
    }

    private void preventDefault(l lVar, n nVar) {
        String str = (String) lVar.a("notificationId");
        INotificationWillDisplayEvent iNotificationWillDisplayEvent = this.notificationOnWillDisplayEventCache.get(str);
        if (iNotificationWillDisplayEvent == null) {
            Logging.error("Could not find onWillDisplayNotification event for notification with id: " + str, null);
        } else {
            iNotificationWillDisplayEvent.preventDefault();
            this.preventedDefaultCache.put(str, iNotificationWillDisplayEvent);
            replySuccess(nVar, null);
        }
    }

    private void proceedWithWillDisplay(l lVar, n nVar) {
        String str = (String) lVar.a("notificationId");
        INotificationWillDisplayEvent iNotificationWillDisplayEvent = this.notificationOnWillDisplayEventCache.get(str);
        if (iNotificationWillDisplayEvent == null) {
            Logging.error("Could not find onWillDisplayNotification event for notification with id: " + str, null);
        } else if (this.preventedDefaultCache.containsKey(str)) {
            replySuccess(nVar, null);
        } else {
            iNotificationWillDisplayEvent.getNotification().display();
            replySuccess(nVar, null);
        }
    }

    private void registerClickListener() {
        OneSignal.getNotifications().mo25removeClickListener(this);
        OneSignal.getNotifications().mo19addClickListener(this);
    }

    public static void registerWith(f fVar) {
        OneSignalNotifications sharedInstance2 = getSharedInstance();
        sharedInstance2.messenger = fVar;
        H2.o oVar = new H2.o(fVar, "OneSignal#notifications");
        sharedInstance2.channel = oVar;
        oVar.b(sharedInstance2);
    }

    private void removeGroupedNotifications(l lVar, n nVar) {
        OneSignal.getNotifications().mo27removeGroupedNotifications((String) lVar.a("notificationGroup"));
        replySuccess(nVar, null);
    }

    private void removeNotification(l lVar, n nVar) {
        OneSignal.getNotifications().mo28removeNotification(((Integer) lVar.a("notificationId")).intValue());
        replySuccess(nVar, null);
    }

    private void requestPermission(l lVar, n nVar) {
        boolean booleanValue = ((Boolean) lVar.a("fallbackToSettings")).booleanValue();
        if (OneSignal.getNotifications().mo24getPermission()) {
            replySuccess(nVar, Boolean.TRUE);
        } else {
            OneSignal.getNotifications().requestPermission(booleanValue, new RequestPermissionContinuation(nVar));
        }
    }

    @Override // com.onesignal.notifications.INotificationClickListener
    public void onClick(INotificationClickEvent iNotificationClickEvent) {
        try {
            invokeMethodOnUiThread("OneSignal#onClickNotification", OneSignalSerializer.convertNotificationClickEventToMap(iNotificationClickEvent));
        } catch (JSONException e3) {
            e3.getStackTrace();
            Logging.error("Encountered an error attempting to convert INotificationClickEvent object to hash map:" + e3.toString(), null);
        }
    }

    public void onDetachedFromEngine() {
        OneSignal.getNotifications().mo25removeClickListener(this);
    }

    @Override // H2.m
    public void onMethodCall(l lVar, n nVar) {
        if (lVar.f1146a.contentEquals("OneSignal#permission")) {
            replySuccess(nVar, Boolean.valueOf(OneSignal.getNotifications().mo24getPermission()));
            return;
        }
        String str = lVar.f1146a;
        if (str.contentEquals("OneSignal#canRequest")) {
            replySuccess(nVar, Boolean.valueOf(OneSignal.getNotifications().mo23getCanRequestPermission()));
            return;
        }
        if (str.contentEquals("OneSignal#requestPermission")) {
            requestPermission(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#removeNotification")) {
            removeNotification(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#removeGroupedNotifications")) {
            removeGroupedNotifications(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#clearAll")) {
            clearAll(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#displayNotification")) {
            displayNotification(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#preventDefault")) {
            preventDefault(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#lifecycleInit")) {
            lifecycleInit(nVar);
            return;
        }
        if (str.contentEquals("OneSignal#proceedWithWillDisplay")) {
            proceedWithWillDisplay(lVar, nVar);
        } else if (str.contentEquals("OneSignal#addNativeClickListener")) {
            registerClickListener();
        } else {
            replyNotImplemented(nVar);
        }
    }

    @Override // com.onesignal.notifications.IPermissionObserver
    public void onNotificationPermissionChange(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("permission", Boolean.valueOf(z));
        invokeMethodOnUiThread("OneSignal#onNotificationPermissionDidChange", hashMap);
    }

    @Override // com.onesignal.notifications.INotificationLifecycleListener
    public void onWillDisplay(INotificationWillDisplayEvent iNotificationWillDisplayEvent) {
        this.notificationOnWillDisplayEventCache.put(iNotificationWillDisplayEvent.getNotification().getNotificationId(), iNotificationWillDisplayEvent);
        iNotificationWillDisplayEvent.preventDefault();
        try {
            invokeMethodOnUiThread("OneSignal#onWillDisplayNotification", OneSignalSerializer.convertNotificationWillDisplayEventToMap(iNotificationWillDisplayEvent));
        } catch (JSONException e3) {
            e3.getStackTrace();
            Logging.error("Encountered an error attempting to convert INotificationWillDisplayEvent object to hash map:" + e3.toString(), null);
        }
    }
}
