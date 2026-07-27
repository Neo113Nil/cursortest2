package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final List f9010a;

    public V(InterfaceC1028i interfaceC1028i) {
        this.f9010a = interfaceC1028i.a();
    }

    public final void a(C1031l c1031l) {
        for (T t3 : this.f9010a) {
            C1032m c1032m = null;
            if (c1031l != null) {
                C1031l c1031l2 = c1031l.f9055a ? c1031l : null;
                if (c1031l2 != null) {
                    c1032m = c1031l2.f9056b;
                }
            }
            t3.a(c1032m);
        }
    }
}
