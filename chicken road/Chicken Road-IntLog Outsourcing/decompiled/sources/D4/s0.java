package D4;

import b2.AbstractC0279e;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class s0 extends I4.t implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f535e;

    public s0(long j2, AbstractC1295c abstractC1295c) {
        super(abstractC1295c, abstractC1295c.getContext());
        this.f535e = j2;
    }

    @Override // D4.g0
    public final String N() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.N());
        sb.append("(timeMillis=");
        return AbstractC0279e.g(sb, this.f535e, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0024y.g(this.f486c);
        n(new r0("Timed out waiting for " + this.f535e + " ms", this));
    }
}
