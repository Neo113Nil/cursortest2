package com.onesignal.common.threading;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalDispatchers$getStatus$3 extends j implements InterfaceC1430a {
    public static final OneSignalDispatchers$getStatus$3 INSTANCE = new OneSignalDispatchers$getStatus$3();

    public OneSignalDispatchers$getStatus$3() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final Boolean invoke() {
        ExecutorService serialIOExecutor;
        serialIOExecutor = OneSignalDispatchers.INSTANCE.getSerialIOExecutor();
        return Boolean.valueOf(serialIOExecutor.isShutdown());
    }
}
