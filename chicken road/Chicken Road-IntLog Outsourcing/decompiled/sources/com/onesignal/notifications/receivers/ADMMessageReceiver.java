package com.onesignal.notifications.receivers;

import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.services.ADMMessageHandler;
import com.onesignal.notifications.services.ADMMessageHandlerJob;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class ADMMessageReceiver extends com.amazon.device.messaging.ADMMessageReceiver {
    public static final Companion Companion = new Companion(null);
    private static final int JOB_ID = 123891;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public ADMMessageReceiver() {
        super(ADMMessageHandler.class);
        boolean z;
        try {
            Class.forName("com.amazon.device.messaging.ADMMessageHandlerJobBase");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            registerJobServiceClass(ADMMessageHandlerJob.class, JOB_ID);
        }
        Logging.debug$default("ADM latest available: " + z, null, 2, null);
    }
}
