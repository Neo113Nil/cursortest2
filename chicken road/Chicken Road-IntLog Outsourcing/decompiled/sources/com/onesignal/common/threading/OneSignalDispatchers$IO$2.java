package com.onesignal.common.threading;

import D4.AbstractC0020u;
import D4.E;
import D4.Q;
import com.onesignal.debug.internal.logging.Logging;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalDispatchers$IO$2 extends j implements InterfaceC1430a {
    public static final OneSignalDispatchers$IO$2 INSTANCE = new OneSignalDispatchers$IO$2();

    public OneSignalDispatchers$IO$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final AbstractC0020u invoke() {
        ThreadPoolExecutor ioExecutor;
        try {
            ioExecutor = OneSignalDispatchers.INSTANCE.getIoExecutor();
            return new Q(ioExecutor);
        } catch (Exception e3) {
            Logging.error$default("OneSignalDispatchers: Using fallback Dispatchers.IO dispatcher: " + e3.getMessage(), null, 2, null);
            return E.f461c;
        }
    }
}
