package W5;

import U5.AbstractC0442i;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class H1 extends AbstractC0442i {

    /* renamed from: b, reason: collision with root package name */
    public final M1 f6816b;

    /* renamed from: c, reason: collision with root package name */
    public long f6817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F0 f6818d;

    public H1(F0 f02, M1 m12) {
        this.f6818d = f02;
        this.f6816b = m12;
    }

    @Override // U5.AbstractC0442i
    public final void l(long j) {
        if (this.f6818d.f6790o.f6835f != null) {
            return;
        }
        synchronized (this.f6818d.f6785i) {
            try {
                if (this.f6818d.f6790o.f6835f == null) {
                    M1 m12 = this.f6816b;
                    if (!m12.f6878b) {
                        long j3 = this.f6817c + j;
                        this.f6817c = j3;
                        F0 f02 = this.f6818d;
                        long j7 = f02.f6795t;
                        if (j3 <= j7) {
                            return;
                        }
                        if (j3 > f02.f6786k) {
                            m12.f6879c = true;
                        } else {
                            long addAndGet = ((AtomicLong) f02.j.f16591b).addAndGet(j3 - j7);
                            F0 f03 = this.f6818d;
                            f03.f6795t = this.f6817c;
                            if (addAndGet > f03.f6787l) {
                                this.f6816b.f6879c = true;
                            }
                        }
                        M1 m13 = this.f6816b;
                        A1 o7 = m13.f6879c ? this.f6818d.o(m13) : null;
                        if (o7 != null) {
                            o7.run();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
