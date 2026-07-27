package com.onesignal.common.threading;

import D4.AbstractC0020u;
import D4.E;
import D4.Q;
import com.onesignal.debug.internal.logging.Logging;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalDispatchers$Default$2 extends j implements InterfaceC1430a {
    public static final OneSignalDispatchers$Default$2 INSTANCE = new OneSignalDispatchers$Default$2();

    public OneSignalDispatchers$Default$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final AbstractC0020u invoke() {
        ThreadPoolExecutor defaultExecutor;
        try {
            defaultExecutor = OneSignalDispatchers.INSTANCE.getDefaultExecutor();
            return new Q(defaultExecutor);
        } catch (Exception e3) {
            Logging.error$default("OneSignalDispatchers: Using fallback Dispatchers.Default dispatcher: " + e3.getMessage(), null, 2, null);
            return E.f459a;
        }
    }
}
