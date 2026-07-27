package com.onesignal.common.threading;

import D4.AbstractC0020u;
import D4.E;
import D4.Q;
import K4.l;
import com.onesignal.debug.internal.logging.Logging;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalDispatchers$SerialIO$2 extends j implements InterfaceC1430a {
    public static final OneSignalDispatchers$SerialIO$2 INSTANCE = new OneSignalDispatchers$SerialIO$2();

    public OneSignalDispatchers$SerialIO$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final AbstractC0020u invoke() {
        ExecutorService serialIOExecutor;
        try {
            serialIOExecutor = OneSignalDispatchers.INSTANCE.getSerialIOExecutor();
            return new Q(serialIOExecutor);
        } catch (Exception e3) {
            Logging.error$default("OneSignalDispatchers: Using fallback serialized Dispatchers.IO: " + e3.getMessage(), null, 2, null);
            E.f461c.getClass();
            return l.f1453c.F(1);
        }
    }
}
