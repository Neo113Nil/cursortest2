package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f7523a;

    public V(io.appmetrica.analytics.screenshot.impl.InterfaceC0893i interfaceC0893i) {
        this.f7523a = interfaceC0893i.a();
    }

    public final void a(io.appmetrica.analytics.screenshot.impl.C0896l c0896l) {
        for (io.appmetrica.analytics.screenshot.impl.T t : this.f7523a) {
            io.appmetrica.analytics.screenshot.impl.C0897m c0897m = null;
            if (c0896l != null) {
                io.appmetrica.analytics.screenshot.impl.C0896l c0896l2 = c0896l.f7569a ? c0896l : null;
                if (c0896l2 != null) {
                    c0897m = c0896l2.f7570b;
                }
            }
            t.a(c0897m);
        }
    }
}
