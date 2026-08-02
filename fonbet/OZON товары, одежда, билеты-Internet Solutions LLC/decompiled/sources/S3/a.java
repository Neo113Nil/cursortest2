package S3;

import B90.K;
import N3.AbstractC3654e;
import N3.C3659j;
import N3.v;
import N3.y;
import java.io.IOException;
import java.util.Objects;
import m3.C8050C;

/* loaded from: classes8.dex */
final class a extends AbstractC3654e {

    /* renamed from: S3.a$a, reason: collision with other inner class name */
    private static final class C0511a implements AbstractC3654e.f {

        /* renamed from: a, reason: collision with root package name */
        private final y f25738a;

        /* renamed from: b, reason: collision with root package name */
        private final int f25739b;

        /* renamed from: c, reason: collision with root package name */
        private final v.a f25740c = new v.a();

        C0511a(y yVar, int i11) {
            this.f25738a = yVar;
            this.f25739b = i11;
        }

        private long c(C3659j c3659j) throws IOException {
            v.a aVar;
            y yVar;
            boolean a11;
            int k11;
            while (true) {
                long f7 = c3659j.f();
                long length = c3659j.getLength() - 6;
                aVar = this.f25740c;
                yVar = this.f25738a;
                if (f7 >= length) {
                    break;
                }
                long f11 = c3659j.f();
                byte[] bArr = new byte[2];
                c3659j.d(bArr, 0, 2, false);
                int i11 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                int i12 = this.f25739b;
                if (i11 != i12) {
                    c3659j.e();
                    c3659j.i((int) (f11 - c3659j.getPosition()), false);
                    a11 = false;
                } else {
                    C8050C c8050c = new C8050C(16);
                    System.arraycopy(bArr, 0, c8050c.e(), 0, 2);
                    byte[] e11 = c8050c.e();
                    int i13 = 0;
                    for (int i14 = 2; i13 < 14 && (k11 = c3659j.k(i14 + i13, 14 - i13, e11)) != -1; i14 = 2) {
                        i13 += k11;
                    }
                    c8050c.Q(i13);
                    c3659j.e();
                    c3659j.i((int) (f11 - c3659j.getPosition()), false);
                    a11 = v.a(c8050c, yVar, i12, aVar);
                }
                if (a11) {
                    break;
                }
                c3659j.i(1, false);
            }
            if (c3659j.f() < c3659j.getLength() - 6) {
                return aVar.f18649a;
            }
            c3659j.i((int) (c3659j.getLength() - c3659j.f()), false);
            return yVar.f18662j;
        }

        @Override // N3.AbstractC3654e.f
        public final AbstractC3654e.C0355e a(C3659j c3659j, long j11) throws IOException {
            long position = c3659j.getPosition();
            long c11 = c(c3659j);
            long f7 = c3659j.f();
            c3659j.i(Math.max(6, this.f25738a.f18655c), false);
            long c12 = c(c3659j);
            return (c11 > j11 || c12 <= j11) ? c12 <= j11 ? AbstractC3654e.C0355e.f(c12, c3659j.f()) : AbstractC3654e.C0355e.d(c11, position) : AbstractC3654e.C0355e.e(f7);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(y yVar, int i11, long j11, long j12) {
        super(r1, r2, r3, yVar.f18662j, j11, j12, r5 + r7, Math.max(6, r0));
        long j13;
        long j14;
        Objects.requireNonNull(yVar);
        K k11 = new K(yVar);
        C0511a c0511a = new C0511a(yVar, i11);
        long e11 = yVar.e();
        int i12 = yVar.f18655c;
        int i13 = yVar.f18656d;
        if (i13 > 0) {
            j13 = (i13 + i12) / 2;
            j14 = 1;
        } else {
            int i14 = yVar.f18654b;
            int i15 = yVar.f18653a;
            j13 = ((((i15 != i14 || i15 <= 0) ? 4096L : i15) * yVar.f18659g) * yVar.f18660h) / 8;
            j14 = 64;
        }
    }
}
