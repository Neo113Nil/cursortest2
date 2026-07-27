package com.onesignal.session.internal.session.impl;

import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class SessionService$endSession$1 extends j implements InterfaceC1441l {
    final /* synthetic */ long $activeDuration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionService$endSession$1(long j2) {
        super(1);
        this.$activeDuration = j2;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ISessionLifecycleHandler) obj);
        return v.f5689a;
    }

    public final void invoke(ISessionLifecycleHandler it) {
        i.e(it, "it");
        it.onSessionEnded(this.$activeDuration);
    }
}
