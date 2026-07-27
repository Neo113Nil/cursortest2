package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class A4 extends Hd {
    public final Object f;

    public A4(int i3, String str, Object obj, InterfaceC0892uo interfaceC0892uo, R2 r22) {
        super(i3, str, interfaceC0892uo, r22);
        this.f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Hd, io.appmetrica.analytics.impl.InterfaceC0530go
    public final void a(C0504fo c0504fo) {
        if (f()) {
            R2 r22 = this.f6031d;
            int i3 = this.f6029b;
            C0556ho a3 = r22.a(c0504fo, (C0556ho) ((HashMap) c0504fo.f7313a.get(i3)).get(this.f6028a), this);
            if (a3 != null) {
                a(a3);
            }
        }
    }

    public abstract void a(C0556ho c0556ho);

    public final Object g() {
        return this.f;
    }
}
