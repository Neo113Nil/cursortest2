package u2;

import android.net.Uri;
import c2.C0814u;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class N implements H {

    /* renamed from: a, reason: collision with root package name */
    public final long f16728a;

    /* renamed from: b, reason: collision with root package name */
    public final C1640q f16729b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16730c;

    /* renamed from: d, reason: collision with root package name */
    public final T f16731d;

    /* renamed from: e, reason: collision with root package name */
    public final M f16732e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f16733f;

    public N(InterfaceC1636m interfaceC1636m, Uri uri, int i7, M m7) {
        Map emptyMap = Collections.emptyMap();
        if (uri == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        C1640q c1640q = new C1640q(uri, 1, null, emptyMap, 0L, -1L, null, 1);
        this.f16731d = new T(interfaceC1636m);
        this.f16729b = c1640q;
        this.f16730c = i7;
        this.f16732e = m7;
        this.f16728a = C0814u.f10405a.getAndIncrement();
    }

    @Override // u2.H
    public final void load() {
        this.f16731d.f16754b = 0L;
        C1638o c1638o = new C1638o(this.f16731d, this.f16729b);
        try {
            c1638o.a();
            Uri t7 = this.f16731d.f16753a.t();
            t7.getClass();
            this.f16733f = this.f16732e.c(t7, c1638o);
        } finally {
            v2.t.h(c1638o);
        }
    }

    @Override // u2.H
    public final void l() {
    }
}
