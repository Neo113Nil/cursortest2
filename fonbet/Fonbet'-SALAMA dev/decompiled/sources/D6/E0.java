package D6;

import W5.AbstractC0486a1;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class E0 extends I6.t implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f1787e;

    public E0(long j, AbstractC1356c abstractC1356c) {
        super(abstractC1356c, abstractC1356c.getContext());
        this.f1787e = j;
    }

    @Override // D6.s0
    public final String E() {
        return super.E() + "(timeMillis=" + this.f1787e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        E.h(this.f1816c);
        k(new D0(AbstractC0486a1.i(new StringBuilder("Timed out waiting for "), this.f1787e, " ms"), this));
    }
}
