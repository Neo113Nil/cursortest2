package F3;

import F3.T;
import J3.b;
import N3.M;
import j3.InterfaceC7268j;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import m3.C8050C;
import s3.C9589c;

/* loaded from: classes.dex */
final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final J3.b f8524a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8525b;

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f8526c;

    /* renamed from: d, reason: collision with root package name */
    private a f8527d;

    /* renamed from: e, reason: collision with root package name */
    private a f8528e;

    /* renamed from: f, reason: collision with root package name */
    private a f8529f;

    /* renamed from: g, reason: collision with root package name */
    private long f8530g;

    private static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f8531a;

        /* renamed from: b, reason: collision with root package name */
        public long f8532b;

        /* renamed from: c, reason: collision with root package name */
        public J3.a f8533c;

        /* renamed from: d, reason: collision with root package name */
        public a f8534d;

        public a(long j11, int i11) {
            G10.a.h(this.f8533c == null);
            this.f8531a = j11;
            this.f8532b = j11 + i11;
        }

        @Override // J3.b.a
        public final J3.a a() {
            J3.a aVar = this.f8533c;
            aVar.getClass();
            return aVar;
        }

        @Override // J3.b.a
        public final b.a next() {
            a aVar = this.f8534d;
            if (aVar == null || aVar.f8533c == null) {
                return null;
            }
            return aVar;
        }
    }

    public Q(J3.b bVar) {
        this.f8524a = bVar;
        int b11 = ((J3.e) bVar).b();
        this.f8525b = b11;
        this.f8526c = new C8050C(32);
        a aVar = new a(0L, b11);
        this.f8527d = aVar;
        this.f8528e = aVar;
        this.f8529f = aVar;
    }

    private int e(int i11) {
        a aVar = this.f8529f;
        if (aVar.f8533c == null) {
            J3.a a11 = ((J3.e) this.f8524a).a();
            a aVar2 = new a(this.f8529f.f8532b, this.f8525b);
            aVar.f8533c = a11;
            aVar.f8534d = aVar2;
        }
        return Math.min(i11, (int) (this.f8529f.f8532b - this.f8530g));
    }

    private static a f(a aVar, long j11, ByteBuffer byteBuffer, int i11) {
        while (j11 >= aVar.f8532b) {
            aVar = aVar.f8534d;
        }
        while (i11 > 0) {
            int min = Math.min(i11, (int) (aVar.f8532b - j11));
            J3.a aVar2 = aVar.f8533c;
            byteBuffer.put(aVar2.f13748a, ((int) (j11 - aVar.f8531a)) + aVar2.f13749b, min);
            i11 -= min;
            j11 += min;
            if (j11 == aVar.f8532b) {
                aVar = aVar.f8534d;
            }
        }
        return aVar;
    }

    private static a g(a aVar, long j11, byte[] bArr, int i11) {
        while (j11 >= aVar.f8532b) {
            aVar = aVar.f8534d;
        }
        int i12 = i11;
        while (i12 > 0) {
            int min = Math.min(i12, (int) (aVar.f8532b - j11));
            J3.a aVar2 = aVar.f8533c;
            System.arraycopy(aVar2.f13748a, ((int) (j11 - aVar.f8531a)) + aVar2.f13749b, bArr, i11 - i12, min);
            i12 -= min;
            j11 += min;
            if (j11 == aVar.f8532b) {
                aVar = aVar.f8534d;
            }
        }
        return aVar;
    }

    private static a h(a aVar, s3.f fVar, T.a aVar2, C8050C c8050c) {
        a aVar3;
        int i11;
        if (fVar.q()) {
            long j11 = aVar2.f8569b;
            c8050c.O(1);
            a g10 = g(aVar, j11, c8050c.e(), 1);
            long j12 = j11 + 1;
            byte b11 = c8050c.e()[0];
            boolean z11 = (b11 & 128) != 0;
            int i12 = b11 & Byte.MAX_VALUE;
            C9589c c9589c = fVar.f98183c;
            byte[] bArr = c9589c.f98170a;
            if (bArr == null) {
                c9589c.f98170a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar3 = g(g10, j12, c9589c.f98170a, i12);
            long j13 = j12 + i12;
            if (z11) {
                c8050c.O(2);
                aVar3 = g(aVar3, j13, c8050c.e(), 2);
                j13 += 2;
                i11 = c8050c.L();
            } else {
                i11 = 1;
            }
            int[] iArr = c9589c.f98173d;
            if (iArr == null || iArr.length < i11) {
                iArr = new int[i11];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = c9589c.f98174e;
            if (iArr3 == null || iArr3.length < i11) {
                iArr3 = new int[i11];
            }
            int[] iArr4 = iArr3;
            if (z11) {
                int i13 = i11 * 6;
                c8050c.O(i13);
                aVar3 = g(aVar3, j13, c8050c.e(), i13);
                j13 += i13;
                c8050c.R(0);
                for (int i14 = 0; i14 < i11; i14++) {
                    iArr2[i14] = c8050c.L();
                    iArr4[i14] = c8050c.I();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = aVar2.f8568a - ((int) (j13 - aVar2.f8569b));
            }
            M.a aVar4 = aVar2.f8570c;
            int i15 = m3.N.f74289a;
            c9589c.c(i11, iArr2, iArr4, aVar4.f18517b, c9589c.f98170a, aVar4.f18516a, aVar4.f18518c, aVar4.f18519d);
            long j14 = aVar2.f8569b;
            int i16 = (int) (j13 - j14);
            aVar2.f8569b = j14 + i16;
            aVar2.f8568a -= i16;
        } else {
            aVar3 = aVar;
        }
        if (!fVar.h()) {
            fVar.o(aVar2.f8568a);
            return f(aVar3, aVar2.f8569b, fVar.f98184d, aVar2.f8568a);
        }
        c8050c.O(4);
        a g11 = g(aVar3, aVar2.f8569b, c8050c.e(), 4);
        int I11 = c8050c.I();
        aVar2.f8569b += 4;
        aVar2.f8568a -= 4;
        fVar.o(I11);
        a f7 = f(g11, aVar2.f8569b, fVar.f98184d, I11);
        aVar2.f8569b += I11;
        int i17 = aVar2.f8568a - I11;
        aVar2.f8568a = i17;
        ByteBuffer byteBuffer = fVar.f98187g;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            fVar.f98187g = ByteBuffer.allocate(i17);
        } else {
            fVar.f98187g.clear();
        }
        return f(f7, aVar2.f8569b, fVar.f98187g, aVar2.f8568a);
    }

    public final void a(long j11) {
        a aVar;
        if (j11 == -1) {
            return;
        }
        while (true) {
            aVar = this.f8527d;
            if (j11 < aVar.f8532b) {
                break;
            }
            ((J3.e) this.f8524a).d(aVar.f8533c);
            a aVar2 = this.f8527d;
            aVar2.f8533c = null;
            a aVar3 = aVar2.f8534d;
            aVar2.f8534d = null;
            this.f8527d = aVar3;
        }
        if (this.f8528e.f8531a < aVar.f8531a) {
            this.f8528e = aVar;
        }
    }

    public final void b(long j11) {
        G10.a.c(j11 <= this.f8530g);
        this.f8530g = j11;
        J3.b bVar = this.f8524a;
        int i11 = this.f8525b;
        if (j11 != 0) {
            a aVar = this.f8527d;
            if (j11 != aVar.f8531a) {
                while (this.f8530g > aVar.f8532b) {
                    aVar = aVar.f8534d;
                }
                a aVar2 = aVar.f8534d;
                aVar2.getClass();
                if (aVar2.f8533c != null) {
                    ((J3.e) bVar).e(aVar2);
                    aVar2.f8533c = null;
                    aVar2.f8534d = null;
                }
                a aVar3 = new a(aVar.f8532b, i11);
                aVar.f8534d = aVar3;
                if (this.f8530g == aVar.f8532b) {
                    aVar = aVar3;
                }
                this.f8529f = aVar;
                if (this.f8528e == aVar2) {
                    this.f8528e = aVar3;
                    return;
                }
                return;
            }
        }
        a aVar4 = this.f8527d;
        if (aVar4.f8533c != null) {
            ((J3.e) bVar).e(aVar4);
            aVar4.f8533c = null;
            aVar4.f8534d = null;
        }
        a aVar5 = new a(this.f8530g, i11);
        this.f8527d = aVar5;
        this.f8528e = aVar5;
        this.f8529f = aVar5;
    }

    public final long c() {
        return this.f8530g;
    }

    public final void d(s3.f fVar, T.a aVar) {
        h(this.f8528e, fVar, aVar, this.f8526c);
    }

    public final void i(s3.f fVar, T.a aVar) {
        this.f8528e = h(this.f8528e, fVar, aVar, this.f8526c);
    }

    public final void j() {
        a aVar = this.f8527d;
        J3.a aVar2 = aVar.f8533c;
        J3.b bVar = this.f8524a;
        if (aVar2 != null) {
            ((J3.e) bVar).e(aVar);
            aVar.f8533c = null;
            aVar.f8534d = null;
        }
        a aVar3 = this.f8527d;
        G10.a.h(aVar3.f8533c == null);
        aVar3.f8531a = 0L;
        aVar3.f8532b = this.f8525b;
        a aVar4 = this.f8527d;
        this.f8528e = aVar4;
        this.f8529f = aVar4;
        this.f8530g = 0L;
        ((J3.e) bVar).h();
    }

    public final void k() {
        this.f8528e = this.f8527d;
    }

    public final int l(InterfaceC7268j interfaceC7268j, int i11, boolean z11) throws IOException {
        int e11 = e(i11);
        a aVar = this.f8529f;
        J3.a aVar2 = aVar.f8533c;
        int read = interfaceC7268j.read(aVar2.f13748a, ((int) (this.f8530g - aVar.f8531a)) + aVar2.f13749b, e11);
        if (read == -1) {
            if (z11) {
                return -1;
            }
            throw new EOFException();
        }
        long j11 = this.f8530g + read;
        this.f8530g = j11;
        a aVar3 = this.f8529f;
        if (j11 == aVar3.f8532b) {
            this.f8529f = aVar3.f8534d;
        }
        return read;
    }

    public final void m(int i11, C8050C c8050c) {
        while (i11 > 0) {
            int e11 = e(i11);
            a aVar = this.f8529f;
            J3.a aVar2 = aVar.f8533c;
            c8050c.n(((int) (this.f8530g - aVar.f8531a)) + aVar2.f13749b, e11, aVar2.f13748a);
            i11 -= e11;
            long j11 = this.f8530g + e11;
            this.f8530g = j11;
            a aVar3 = this.f8529f;
            if (j11 == aVar3.f8532b) {
                this.f8529f = aVar3.f8534d;
            }
        }
    }
}
