package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Kb implements InterfaceC0551c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0655g0 f7033a;

    /* renamed from: b, reason: collision with root package name */
    public final Fn f7034b = new Fn();

    public Kb(InterfaceC0655g0 interfaceC0655g0) {
        this.f7033a = interfaceC0655g0;
    }

    public static final void a(Kb kb, V v4) {
        kb.f7033a.a(v4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0551c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        Fn fn = this.f7034b;
        Thread a6 = fn.f6811a.a();
        try {
            stackTraceElementArr = fn.f6811a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a6.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        V v4 = new V((C1143yn) fn.f6812b.apply(a6, stackTraceElementArr), fn.a(a6, null), fn.f6813c.a());
        ((G9) C0736j4.l().f8484c.a()).f6828b.post(new B3.c(this, 16, v4));
    }
}
