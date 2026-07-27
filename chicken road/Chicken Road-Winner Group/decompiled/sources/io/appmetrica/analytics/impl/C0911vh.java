package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911vh extends Wg {
    public C0911vh(C0459e5 c0459e5) {
        super(c0459e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        ((C0795r5) this.f6796a.f7207p).e();
        Wk wk = this.f6796a.f7201j;
        synchronized (wk) {
            try {
                Ik b3 = wk.b(w5);
                if (b3.f6120g) {
                    b3.f6120g = false;
                    Zk zk = b3.f6116b;
                    zk.a(Zk.f6922i, Boolean.FALSE);
                    zk.b();
                }
                if (wk.f6804g != 1) {
                    wk.b(wk.f, w5);
                }
                wk.f6804g = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
