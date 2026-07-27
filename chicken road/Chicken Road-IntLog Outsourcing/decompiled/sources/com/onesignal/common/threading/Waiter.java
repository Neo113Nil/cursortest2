package com.onesignal.common.threading;

import F4.f;
import F4.h;
import F4.i;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public final class Waiter {
    private final f channel = i.a(-1, 0, 6);

    public final Object waitForWake(InterfaceC1218d interfaceC1218d) {
        return this.channel.e(interfaceC1218d);
    }

    public final void wake() {
        Object h3 = this.channel.h(null);
        if (h3 instanceof h) {
            throw new Exception("Waiter.wait failed", i.c(h3));
        }
    }
}
