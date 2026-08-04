package W5;

import U5.AbstractC0442i;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class H1 extends AbstractC0442i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M1 f6816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F0 f6818d;

    public H1(F0 f7, M1 m7) {
        this.f6818d = f7;
        this.f6816b = m7;
    }

    @Override // U5.AbstractC0442i
    public final void l(long j) {
        if (this.f6818d.f6790o.f6835f != null) {
            return;
        }
        synchronized (this.f6818d.f6785i) {
            try {
                if (this.f6818d.f6790o.f6835f == null) {
                    M1 m7 = this.f6816b;
                    if (!m7.f6878b) {
                        long j3 = this.f6817c + j;
                        this.f6817c = j3;
                        F0 f7 = this.f6818d;
                        long j7 = f7.f6795t;
                        if (j3 <= j7) {
                            return;
                        }
                        if (j3 > f7.f6786k) {
                            m7.f6879c = true;
                        } else {
                            long jAddAndGet = ((AtomicLong) f7.j.f16597b).addAndGet(j3 - j7);
                            F0 f8 = this.f6818d;
                            f8.f6795t = this.f6817c;
                            if (jAddAndGet > f8.f6787l) {
                                this.f6816b.f6879c = true;
                            }
                        }
                        M1 m8 = this.f6816b;
                        A1 a1O = m8.f6879c ? this.f6818d.o(m8) : null;
                        if (a1O != null) {
                            a1O.run();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
