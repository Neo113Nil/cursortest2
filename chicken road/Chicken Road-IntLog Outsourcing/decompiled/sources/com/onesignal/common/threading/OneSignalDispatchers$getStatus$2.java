package com.onesignal.common.threading;

import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalDispatchers$getStatus$2 extends j implements InterfaceC1430a {
    public static final OneSignalDispatchers$getStatus$2 INSTANCE = new OneSignalDispatchers$getStatus$2();

    public OneSignalDispatchers$getStatus$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final Boolean invoke() {
        ThreadPoolExecutor defaultExecutor;
        defaultExecutor = OneSignalDispatchers.INSTANCE.getDefaultExecutor();
        return Boolean.valueOf(defaultExecutor.isShutdown());
    }
}
