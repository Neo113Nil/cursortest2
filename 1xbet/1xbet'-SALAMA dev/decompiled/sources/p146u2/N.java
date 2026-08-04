package p146u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import p018c2.C0774u;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class N implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0958q f16735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f16737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M f16738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f16739f;

    public N(InterfaceC0954m interfaceC0954m, Uri uri, int i7, M m7) {
        Map mapEmptyMap = Collections.emptyMap();
        if (uri == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        C0958q c0958q = new C0958q(uri, 1, null, mapEmptyMap, 0L, -1L, null, 1);
        this.f16737d = new T(interfaceC0954m);
        this.f16735b = c0958q;
        this.f16736c = i7;
        this.f16738e = m7;
        this.f16734a = C0774u.f10405a.getAndIncrement();
    }

    @Override // p146u2.H
    public final void load() {
        this.f16737d.f16760b = 0L;
        C0956o c0956o = new C0956o(this.f16737d, this.f16735b);
        try {
            c0956o.a();
            Uri uriT = this.f16737d.f16759a.t();
            uriT.getClass();
            this.f16739f = this.f16738e.c(uriT, c0956o);
        } finally {
            t.h(c0956o);
        }
    }

    @Override // p146u2.H
    public final void l() {
    }
}
