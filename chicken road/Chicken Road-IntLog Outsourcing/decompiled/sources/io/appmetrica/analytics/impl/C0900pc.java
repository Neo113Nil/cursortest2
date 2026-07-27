package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900pc {

    /* renamed from: a, reason: collision with root package name */
    public int f9002a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final C0602e f9003b;

    public C0900pc(InterfaceC0655g0 interfaceC0655g0) {
        this.f9003b = new C0602e(new Kb(interfaceC0655g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C0602e c0602e = this.f9003b;
        c0602e.f8061a.add(new InterfaceC0551c() { // from class: io.appmetrica.analytics.impl.Wo
            @Override // io.appmetrica.analytics.impl.InterfaceC0551c
            public final void onAppNotResponding() {
                C0900pc.b(AnrListener.this);
            }
        });
    }
}
