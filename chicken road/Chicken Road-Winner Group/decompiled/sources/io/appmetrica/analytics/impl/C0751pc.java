package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751pc {

    /* renamed from: a, reason: collision with root package name */
    public int f8066a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final C0453e f8067b;

    public C0751pc(InterfaceC0506g0 interfaceC0506g0) {
        this.f8067b = new C0453e(new Kb(interfaceC0506g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C0453e c0453e = this.f8067b;
        c0453e.f7171a.add(new InterfaceC0402c() { // from class: io.appmetrica.analytics.impl.Wo
            @Override // io.appmetrica.analytics.impl.InterfaceC0402c
            public final void onAppNotResponding() {
                C0751pc.b(AnrListener.this);
            }
        });
    }
}
