package M4;

import L4.C0226i;
import L4.I;
import L4.q;
import java.io.IOException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: l, reason: collision with root package name */
    public final long f3628l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3629m;

    /* renamed from: n, reason: collision with root package name */
    public long f3630n;

    public e(I i, long j5, boolean z3) {
        super(i);
        this.f3628l = j5;
        this.f3629m = z3;
    }

    @Override // L4.q, L4.I
    public final long e(C0226i c0226i, long j5) {
        l.f("sink", c0226i);
        long j6 = this.f3630n;
        long j7 = this.f3628l;
        if (j6 > j7) {
            j5 = 0;
        } else if (this.f3629m) {
            long j8 = j7 - j6;
            if (j8 == 0) {
                return -1L;
            }
            j5 = Math.min(j5, j8);
        }
        long e3 = super.e(c0226i, j5);
        if (e3 != -1) {
            this.f3630n += e3;
        }
        long j9 = this.f3630n;
        if ((j9 >= j7 || e3 != -1) && j9 <= j7) {
            return e3;
        }
        if (e3 > 0 && j9 > j7) {
            long j10 = c0226i.f3091l - (j9 - j7);
            C0226i c0226i2 = new C0226i();
            c0226i2.O(c0226i);
            c0226i.D(c0226i2, j10);
            c0226i2.b();
        }
        throw new IOException("expected " + j7 + " bytes but got " + this.f3630n);
    }
}
