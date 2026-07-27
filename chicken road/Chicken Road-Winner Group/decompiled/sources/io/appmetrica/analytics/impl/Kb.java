package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Kb implements InterfaceC0402c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0506g0 f6180a;

    /* renamed from: b, reason: collision with root package name */
    public final Fn f6181b = new Fn();

    public Kb(InterfaceC0506g0 interfaceC0506g0) {
        this.f6180a = interfaceC0506g0;
    }

    public static final void a(Kb kb, V v3) {
        kb.f6180a.a(v3);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0402c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        Fn fn = this.f6181b;
        Thread a3 = fn.f5966a.a();
        try {
            stackTraceElementArr = fn.f5966a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a3.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        V v3 = new V((C0994yn) fn.f5967b.apply(a3, stackTraceElementArr), fn.a(a3, null), fn.f5968c.a());
        ((G9) C0587j4.l().f7572c.a()).f5983b.post(new D1.a(this, 14, v3));
    }
}
