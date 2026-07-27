package com.onesignal.common.threading;

import D4.AbstractC0024y;
import D4.InterfaceC0022w;
import kotlin.jvm.internal.j;
import n2.AbstractC1341c;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalDispatchers$SerialIOScope$2 extends j implements InterfaceC1430a {
    public static final OneSignalDispatchers$SerialIOScope$2 INSTANCE = new OneSignalDispatchers$SerialIOScope$2();

    public OneSignalDispatchers$SerialIOScope$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final InterfaceC0022w invoke() {
        return AbstractC0024y.b(AbstractC1341c.A(AbstractC0024y.c(), OneSignalDispatchers.INSTANCE.getSerialIO()));
    }
}
