package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Pd {

    /* renamed from: a, reason: collision with root package name */
    public final o2.l f6418a;

    public Pd(Ud ud) {
        this.f6418a = ud;
    }

    public final Qd a(Context context, Xg xg) {
        return new Qd(context, xg, this.f6418a, new A0.r(9), EnumC0569ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Qd b(Context context, Xg xg) {
        return new Qd(context, xg, this.f6418a, new A0.r(10), EnumC0569ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final InterfaceC0475el a(E0 e02) {
        return new Nd(e02.f.f5923d);
    }

    public static final InterfaceC0475el b(E0 e02) {
        return new X();
    }
}
