package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final List f9991a;

    public V(InterfaceC1177i interfaceC1177i) {
        this.f9991a = interfaceC1177i.a();
    }

    public final void a(C1180l c1180l) {
        for (T t5 : this.f9991a) {
            C1181m c1181m = null;
            if (c1180l != null) {
                C1180l c1180l2 = c1180l.f10037a ? c1180l : null;
                if (c1180l2 != null) {
                    c1181m = c1180l2.f10038b;
                }
            }
            t5.a(c1181m);
        }
    }
}
