package io.appmetrica.analytics.impl;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class N2 {

    /* renamed from: a, reason: collision with root package name */
    public final Kf f6310a;

    /* renamed from: b, reason: collision with root package name */
    public final La f6311b;

    public N2(Kf kf, La la) {
        this.f6310a = kf;
        this.f6311b = la;
    }

    public final boolean a(W5 w5, M2 m22) {
        Iterator it = ((C0412c9) this.f6310a.a(w5.f6778d)).f7099a.iterator();
        while (it.hasNext()) {
            if (m22.a(it.next(), w5)) {
                return true;
            }
        }
        return false;
    }

    public final Kf b() {
        return this.f6310a;
    }

    public final La a() {
        return this.f6311b;
    }
}
