package com.onesignal.common.threading;

import D4.AbstractC0024y;
import D4.InterfaceC0022w;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalDispatchers$getStatus$6 extends j implements InterfaceC1430a {
    public static final OneSignalDispatchers$getStatus$6 INSTANCE = new OneSignalDispatchers$getStatus$6();

    public OneSignalDispatchers$getStatus$6() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final Boolean invoke() {
        InterfaceC0022w serialIOScope;
        serialIOScope = OneSignalDispatchers.INSTANCE.getSerialIOScope();
        return Boolean.valueOf(AbstractC0024y.l(serialIOScope));
    }
}
