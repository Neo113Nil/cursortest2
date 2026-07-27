package com.onesignal.notifications.services;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.bridges.OneSignalHmsEventBridge;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class HmsMessageServiceOneSignal extends HmsMessageService {
    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(RemoteMessage message) {
        i.e(message, "message");
        OneSignalHmsEventBridge.INSTANCE.onMessageReceived((Context) this, message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(String token, Bundle bundle) {
        i.e(token, "token");
        i.e(bundle, "bundle");
        Logging.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:".concat(token), null, 2, null);
        OneSignalHmsEventBridge.INSTANCE.onNewToken((Context) this, token, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(String token) {
        i.e(token, "token");
        Logging.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:".concat(token), null, 2, null);
        OneSignalHmsEventBridge.INSTANCE.onNewToken((Context) this, token);
    }
}
