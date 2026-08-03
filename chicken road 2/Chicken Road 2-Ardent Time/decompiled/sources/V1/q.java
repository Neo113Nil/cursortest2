package V1;

/* loaded from: classes.dex */
public final class q implements V1.i {

    /* renamed from: a, reason: collision with root package name */
    public final V1.w f1784a;

    /* renamed from: b, reason: collision with root package name */
    public final V1.g f1785b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1786c;

    public q(V1.w source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f1784a = source;
        this.f1785b = new V1.g();
    }

    public final boolean a() {
        if (this.f1786c) {
            throw new java.lang.IllegalStateException("closed");
        }
        V1.g gVar = this.f1785b;
        return gVar.a() && this.f1784a.c(gVar, 8192L) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f1764b + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(byte b2, long j2, long j3) {
        long j4;
        V1.r rVar;
        V1.q qVar = this;
        long j5 = j3;
        if (qVar.f1786c) {
            throw new java.lang.IllegalStateException("closed");
        }
        long j6 = 0;
        if (0 > j5) {
            throw new java.lang.IllegalArgumentException(("fromIndex=0 toIndex=" + j5).toString());
        }
        while (true) {
            if (j6 >= j5) {
                j4 = -1;
                break;
            }
            V1.g gVar = qVar.f1785b;
            gVar.getClass();
            long j7 = 0;
            if (0 > j6 || j6 > j5) {
                break;
            }
            long j8 = gVar.f1764b;
            long j9 = j5 > j8 ? j8 : j5;
            long j10 = -1;
            if (j6 != j9 && (rVar = gVar.f1763a) != null) {
                if (j8 - j6 >= j6) {
                    while (true) {
                        long j11 = (rVar.f1789c - rVar.f1788b) + j7;
                        if (j11 > j6) {
                            break;
                        }
                        rVar = rVar.f1792f;
                        kotlin.jvm.internal.i.b(rVar);
                        j7 = j11;
                    }
                    long j12 = j6;
                    while (true) {
                        if (j7 >= j9) {
                            break;
                        }
                        int min = (int) java.lang.Math.min(rVar.f1789c, (rVar.f1788b + j9) - j7);
                        for (int i2 = (int) ((rVar.f1788b + j12) - j7); i2 < min; i2++) {
                            if (rVar.f1787a[i2] == b2) {
                                j10 = (i2 - rVar.f1788b) + j7;
                                break;
                            }
                        }
                        j12 = (rVar.f1789c - rVar.f1788b) + j7;
                        rVar = rVar.f1792f;
                        kotlin.jvm.internal.i.b(rVar);
                        j7 = j12;
                    }
                } else {
                    while (j8 > j6) {
                        rVar = rVar.f1793g;
                        kotlin.jvm.internal.i.b(rVar);
                        j8 -= rVar.f1789c - rVar.f1788b;
                    }
                    long j13 = j6;
                    while (true) {
                        if (j8 >= j9) {
                            break;
                        }
                        int min2 = (int) java.lang.Math.min(rVar.f1789c, (rVar.f1788b + j9) - j8);
                        for (int i3 = (int) ((rVar.f1788b + j13) - j8); i3 < min2; i3++) {
                            if (rVar.f1787a[i3] == b2) {
                                j10 = (i3 - rVar.f1788b) + j8;
                                break;
                            }
                        }
                        j13 = j8 + (rVar.f1789c - rVar.f1788b);
                        rVar = rVar.f1792f;
                        kotlin.jvm.internal.i.b(rVar);
                        j8 = j13;
                    }
                }
            }
            j4 = -1;
            if (j10 != -1) {
                return j10;
            }
            long j14 = gVar.f1764b;
            if (j14 >= j3) {
                break;
            }
            qVar = this;
            if (qVar.f1784a.c(gVar, 8192L) == -1) {
                break;
            }
            j6 = java.lang.Math.max(j6, j14);
            j5 = j3;
        }
        return j4;
    }

    @Override // V1.w
    public final long c(V1.g sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f1786c) {
            throw new java.lang.IllegalStateException("closed");
        }
        V1.g gVar = this.f1785b;
        if (gVar.f1764b == 0 && this.f1784a.c(gVar, 8192L) == -1) {
            return -1L;
        }
        return gVar.c(sink, java.lang.Math.min(j2, gVar.f1764b));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f1786c) {
            return;
        }
        this.f1786c = true;
        this.f1784a.close();
        V1.g gVar = this.f1785b;
        gVar.o(gVar.f1764b);
    }

    @Override // V1.w
    public final V1.y d() {
        return this.f1784a.d();
    }

    @Override // V1.i
    public final byte[] f() {
        V1.g gVar = this.f1785b;
        gVar.t(this.f1784a);
        return gVar.j(gVar.f1764b);
    }

    public final byte g() {
        q(1L);
        return this.f1785b.g();
    }

    @Override // V1.i
    public final java.io.InputStream i() {
        return new V1.f(this, 1);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1786c;
    }

    public final V1.j j(long j2) {
        q(j2);
        return this.f1785b.k(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r14.f1764b -= r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        V1.g gVar;
        long j2;
        int i2;
        int i3;
        byte b2;
        q(1L);
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            boolean p2 = p(i5);
            gVar = this.f1785b;
            if (!p2) {
                break;
            }
            b2 = gVar.b(i4);
            if ((b2 < 48 || b2 > 57) && ((b2 < 97 || b2 > 102) && (b2 < 65 || b2 > 70))) {
                break;
            }
            i4 = i5;
        }
        if (i4 == 0) {
            u0.AbstractC0995a.b(16);
            u0.AbstractC0995a.b(16);
            java.lang.String num = java.lang.Integer.toString(b2, 16);
            kotlin.jvm.internal.i.d(num, "toString(this, checkRadix(radix))");
            throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j3 = 0;
        if (gVar.f1764b == 0) {
            throw new java.io.EOFException();
        }
        long j4 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (true) {
            V1.r rVar = gVar.f1763a;
            kotlin.jvm.internal.i.b(rVar);
            int i7 = rVar.f1788b;
            int i8 = rVar.f1789c;
            int i9 = i6;
            while (i7 < i8) {
                byte b3 = rVar.f1787a[i7];
                if (b3 >= 48 && b3 <= 57) {
                    i3 = b3 - 48;
                } else if (b3 >= 97 && b3 <= 102) {
                    i3 = b3 - 87;
                } else if (b3 < 65 || b3 > 70) {
                    i2 = i9;
                    j2 = 0;
                    if (i2 == 0) {
                        char[] cArr = W1.b.f1830a;
                        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new java.lang.String(new char[]{cArr[(b3 >> 4) & 15], cArr[b3 & 15]})));
                    }
                    z2 = true;
                    if (i7 != i8) {
                        gVar.f1763a = rVar.a();
                        V1.s.a(rVar);
                    } else {
                        rVar.f1788b = i7;
                    }
                    if (!!z2 || gVar.f1763a == null) {
                        break;
                    }
                    i6 = i2;
                    j3 = j2;
                } else {
                    i3 = b3 - 55;
                }
                if ((j4 & (-1152921504606846976L)) != 0) {
                    V1.g gVar2 = new V1.g();
                    gVar2.v(j4);
                    gVar2.u(b3);
                    throw new java.lang.NumberFormatException("Number too large: ".concat(gVar2.n(gVar2.f1764b, y1.a.f8486a)));
                }
                j4 = (j4 << 4) | i3;
                i7++;
                i9++;
                j3 = 0;
            }
            j2 = j3;
            i2 = i9;
            if (i7 != i8) {
            }
            if (!z2) {
                break;
            }
            break;
        }
    }

    public final int l() {
        q(4L);
        return this.f1785b.l();
    }

    public final int m() {
        q(4L);
        int l2 = this.f1785b.l();
        return ((l2 & kotlin.KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & l2) >>> 24) | ((16711680 & l2) >>> 8) | ((65280 & l2) << 8);
    }

    public final short n() {
        q(2L);
        return this.f1785b.m();
    }

    public final java.lang.String o(long j2) {
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long b2 = b((byte) 10, 0L, j3);
        V1.g gVar = this.f1785b;
        if (b2 != -1) {
            return W1.a.a(gVar, b2);
        }
        if (j3 < Long.MAX_VALUE && p(j3) && gVar.b(j3 - 1) == 13 && p(1 + j3) && gVar.b(j3) == 10) {
            return W1.a.a(gVar, j3);
        }
        V1.g out = new V1.g();
        long min = java.lang.Math.min(32, gVar.f1764b);
        long j4 = 0;
        gVar.getClass();
        kotlin.jvm.internal.i.e(out, "out");
        a.AbstractC0059a.f(gVar.f1764b, 0L, min);
        if (min != 0) {
            out.f1764b += min;
            V1.r rVar = gVar.f1763a;
            while (true) {
                kotlin.jvm.internal.i.b(rVar);
                long j5 = rVar.f1789c - rVar.f1788b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                rVar = rVar.f1792f;
            }
            while (min > 0) {
                kotlin.jvm.internal.i.b(rVar);
                V1.r c2 = rVar.c();
                int i2 = c2.f1788b + ((int) j4);
                c2.f1788b = i2;
                c2.f1789c = java.lang.Math.min(i2 + ((int) min), c2.f1789c);
                V1.r rVar2 = out.f1763a;
                if (rVar2 == null) {
                    c2.f1793g = c2;
                    c2.f1792f = c2;
                    out.f1763a = c2;
                } else {
                    V1.r rVar3 = rVar2.f1793g;
                    kotlin.jvm.internal.i.b(rVar3);
                    rVar3.b(c2);
                }
                min -= c2.f1789c - c2.f1788b;
                rVar = rVar.f1792f;
                j4 = 0;
            }
        }
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(gVar.f1764b, j2) + " content=" + out.k(out.f1764b).b() + (char) 8230);
    }

    public final boolean p(long j2) {
        V1.g gVar;
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f1786c) {
            throw new java.lang.IllegalStateException("closed");
        }
        do {
            gVar = this.f1785b;
            if (gVar.f1764b >= j2) {
                return true;
            }
        } while (this.f1784a.c(gVar, 8192L) != -1);
        return false;
    }

    public final void q(long j2) {
        if (!p(j2)) {
            throw new java.io.EOFException();
        }
    }

    public final void r(long j2) {
        if (this.f1786c) {
            throw new java.lang.IllegalStateException("closed");
        }
        while (j2 > 0) {
            V1.g gVar = this.f1785b;
            if (gVar.f1764b == 0 && this.f1784a.c(gVar, 8192L) == -1) {
                throw new java.io.EOFException();
            }
            long min = java.lang.Math.min(j2, gVar.f1764b);
            gVar.o(min);
            j2 -= min;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        V1.g gVar = this.f1785b;
        if (gVar.f1764b == 0 && this.f1784a.c(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.read(sink);
    }

    public final java.lang.String toString() {
        return "buffer(" + this.f1784a + ')';
    }
}
