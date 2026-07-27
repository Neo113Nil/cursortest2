package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.debug.internal.logging.Logging;

/* loaded from: classes.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {
    public void onMessage(Context context, Intent intent) {
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (context == null || extras == null) {
            return;
        }
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandlerJob$onMessage$1(context.getApplicationContext(), extras, null));
    }

    public void onRegistered(Context context, String str) {
        Logging.info$default("ADM registration ID: " + str, null, 2, null);
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandlerJob$onRegistered$1(str, null));
    }

    public void onRegistrationError(Context context, String str) {
        Logging.info$default("ADM:onRegistrationError: " + str, null, 2, null);
        if ("INVALID_SENDER".equals(str)) {
            Logging.info$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandlerJob$onRegistrationError$1(null));
    }

    public void onUnregistered(Context context, String str) {
        Logging.info$default("ADM:onUnregistered: " + str, null, 2, null);
    }
}
