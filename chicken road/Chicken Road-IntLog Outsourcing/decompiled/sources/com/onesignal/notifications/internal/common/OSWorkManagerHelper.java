package com.onesignal.notifications.internal.common;

import android.content.Context;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.jvm.internal.i;
import l1.j;
import s0.C1414b;
import s0.y;
import t0.o;

/* loaded from: classes.dex */
public final class OSWorkManagerHelper {
    public static final OSWorkManagerHelper INSTANCE = new OSWorkManagerHelper();

    private OSWorkManagerHelper() {
    }

    private final void initializeWorkManager(Context context) {
        try {
            context.getApplicationContext();
            o.b(context, new C1414b(new j(29)));
        } catch (IllegalStateException e3) {
            Logging.warn("OSWorkManagerHelper initializing WorkManager failed: ", e3);
        }
    }

    public final synchronized y getInstance(Context context) {
        o a6;
        i.e(context, "context");
        try {
            a6 = o.a(context);
        } catch (IllegalStateException e3) {
            Logging.warn("OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e3);
            initializeWorkManager(context);
            a6 = o.a(context);
        }
        return a6;
    }
}
