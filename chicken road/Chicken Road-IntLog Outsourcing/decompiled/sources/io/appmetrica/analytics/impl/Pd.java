package io.appmetrica.analytics.impl;

import E.C0028c;
import android.content.Context;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class Pd {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1441l f7275a;

    public Pd(Ud ud) {
        this.f7275a = ud;
    }

    public final Qd a(Context context, Xg xg) {
        return new Qd(context, xg, this.f7275a, new C0028c(26), EnumC0718ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Qd b(Context context, Xg xg) {
        return new Qd(context, xg, this.f7275a, new C0028c(27), EnumC0718ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final InterfaceC0624el a(E0 e02) {
        return new Nd(e02.f6707f.f6764d);
    }

    public static final InterfaceC0624el b(E0 e02) {
        return new X();
    }
}
