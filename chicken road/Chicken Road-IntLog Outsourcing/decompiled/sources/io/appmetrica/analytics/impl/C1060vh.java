package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1060vh extends Wg {
    public C1060vh(C0608e5 c0608e5) {
        super(c0608e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        ((C0944r5) this.f7670a.f8100p).e();
        Wk wk = this.f7670a.f8094j;
        synchronized (wk) {
            try {
                Ik b6 = wk.b(w5);
                if (b6.f6971g) {
                    b6.f6971g = false;
                    Zk zk = b6.f6966b;
                    zk.a(Zk.f7801i, Boolean.FALSE);
                    zk.b();
                }
                if (wk.f7679g != 1) {
                    wk.b(wk.f7678f, w5);
                }
                wk.f7679g = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
