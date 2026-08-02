package i0;

import a3.AbstractC0467k;
import h0.C1989c;
import h0.C1990d;

/* loaded from: classes.dex */
public final class C extends D {

    /* renamed from: a, reason: collision with root package name */
    public final C1990d f17220a;

    /* renamed from: b, reason: collision with root package name */
    public final C2003h f17221b;

    public C(C1990d c1990d) {
        C2003h c2003h;
        this.f17220a = c1990d;
        if (N4.b.I(c1990d)) {
            c2003h = null;
        } else {
            c2003h = AbstractC2005j.a();
            AbstractC0467k.g(c2003h, c1990d);
        }
        this.f17221b = c2003h;
    }

    @Override // i0.D
    public final C1989c a() {
        C1990d c1990d = this.f17220a;
        return new C1989c(c1990d.f17197a, c1990d.f17198b, c1990d.f17199c, c1990d.f17200d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C) {
            return kotlin.jvm.internal.l.a(this.f17220a, ((C) obj).f17220a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17220a.hashCode();
    }
}
