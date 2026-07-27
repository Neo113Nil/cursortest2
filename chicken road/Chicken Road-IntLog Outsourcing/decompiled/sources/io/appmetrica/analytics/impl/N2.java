package io.appmetrica.analytics.impl;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class N2 {

    /* renamed from: a, reason: collision with root package name */
    public final Kf f7167a;

    /* renamed from: b, reason: collision with root package name */
    public final La f7168b;

    public N2(Kf kf, La la) {
        this.f7167a = kf;
        this.f7168b = la;
    }

    public final boolean a(W5 w5, M2 m22) {
        Iterator it = ((C0561c9) this.f7167a.a(w5.f7651d)).f7987a.iterator();
        while (it.hasNext()) {
            if (m22.a(it.next(), w5)) {
                return true;
            }
        }
        return false;
    }

    public final Kf b() {
        return this.f7167a;
    }

    public final La a() {
        return this.f7168b;
    }
}
