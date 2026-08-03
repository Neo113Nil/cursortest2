package V1;

/* loaded from: classes.dex */
public final class g implements V1.i, V1.h, java.lang.Cloneable, java.nio.channels.ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public V1.r f1763a;

    /* renamed from: b, reason: collision with root package name */
    public long f1764b;

    public final boolean a() {
        return this.f1764b == 0;
    }

    public final byte b(long j2) {
        a.AbstractC0059a.f(this.f1764b, j2, 1L);
        V1.r rVar = this.f1763a;
        if (rVar == null) {
            kotlin.jvm.internal.i.b(null);
            throw null;
        }
        long j3 = this.f1764b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                rVar = rVar.f1793g;
                kotlin.jvm.internal.i.b(rVar);
                j3 -= rVar.f1789c - rVar.f1788b;
            }
            return rVar.f1787a[(int) ((rVar.f1788b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i2 = rVar.f1789c;
            int i3 = rVar.f1788b;
            long j5 = (i2 - i3) + j4;
            if (j5 > j2) {
                return rVar.f1787a[(int) ((i3 + j2) - j4)];
            }
            rVar = rVar.f1792f;
            kotlin.jvm.internal.i.b(rVar);
            j4 = j5;
        }
    }

    @Override // V1.w
    public final long c(V1.g sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f1764b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        sink.e(this, j2);
        return j2;
    }

    public final java.lang.Object clone() {
        V1.g gVar = new V1.g();
        if (this.f1764b != 0) {
            V1.r rVar = this.f1763a;
            kotlin.jvm.internal.i.b(rVar);
            V1.r c2 = rVar.c();
            gVar.f1763a = c2;
            c2.f1793g = c2;
            c2.f1792f = c2;
            for (V1.r rVar2 = rVar.f1792f; rVar2 != rVar; rVar2 = rVar2.f1792f) {
                V1.r rVar3 = c2.f1793g;
                kotlin.jvm.internal.i.b(rVar3);
                kotlin.jvm.internal.i.b(rVar2);
                rVar3.b(rVar2.c());
            }
            gVar.f1764b = this.f1764b;
        }
        return gVar;
    }

    @Override // V1.w
    public final V1.y d() {
        return V1.y.f1800d;
    }

    @Override // V1.u
    public final void e(V1.g source, long j2) {
        V1.r b2;
        kotlin.jvm.internal.i.e(source, "source");
        if (source == this) {
            throw new java.lang.IllegalArgumentException("source == this");
        }
        a.AbstractC0059a.f(source.f1764b, 0L, j2);
        while (j2 > 0) {
            V1.r rVar = source.f1763a;
            kotlin.jvm.internal.i.b(rVar);
            int i2 = rVar.f1789c;
            V1.r rVar2 = source.f1763a;
            kotlin.jvm.internal.i.b(rVar2);
            long j3 = i2 - rVar2.f1788b;
            int i3 = 0;
            if (j2 < j3) {
                V1.r rVar3 = this.f1763a;
                V1.r rVar4 = rVar3 != null ? rVar3.f1793g : null;
                if (rVar4 != null && rVar4.f1791e) {
                    if ((rVar4.f1789c + j2) - (rVar4.f1790d ? 0 : rVar4.f1788b) <= 8192) {
                        V1.r rVar5 = source.f1763a;
                        kotlin.jvm.internal.i.b(rVar5);
                        rVar5.d(rVar4, (int) j2);
                        source.f1764b -= j2;
                        this.f1764b += j2;
                        return;
                    }
                }
                V1.r rVar6 = source.f1763a;
                kotlin.jvm.internal.i.b(rVar6);
                int i4 = (int) j2;
                if (i4 <= 0 || i4 > rVar6.f1789c - rVar6.f1788b) {
                    throw new java.lang.IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    b2 = rVar6.c();
                } else {
                    b2 = V1.s.b();
                    int i5 = rVar6.f1788b;
                    i1.AbstractC0189h.K(0, i5, i5 + i4, rVar6.f1787a, b2.f1787a);
                }
                b2.f1789c = b2.f1788b + i4;
                rVar6.f1788b += i4;
                V1.r rVar7 = rVar6.f1793g;
                kotlin.jvm.internal.i.b(rVar7);
                rVar7.b(b2);
                source.f1763a = b2;
            }
            V1.r rVar8 = source.f1763a;
            kotlin.jvm.internal.i.b(rVar8);
            long j4 = rVar8.f1789c - rVar8.f1788b;
            source.f1763a = rVar8.a();
            V1.r rVar9 = this.f1763a;
            if (rVar9 == null) {
                this.f1763a = rVar8;
                rVar8.f1793g = rVar8;
                rVar8.f1792f = rVar8;
            } else {
                V1.r rVar10 = rVar9.f1793g;
                kotlin.jvm.internal.i.b(rVar10);
                rVar10.b(rVar8);
                V1.r rVar11 = rVar8.f1793g;
                if (rVar11 == rVar8) {
                    throw new java.lang.IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.i.b(rVar11);
                if (rVar11.f1791e) {
                    int i6 = rVar8.f1789c - rVar8.f1788b;
                    V1.r rVar12 = rVar8.f1793g;
                    kotlin.jvm.internal.i.b(rVar12);
                    int i7 = 8192 - rVar12.f1789c;
                    V1.r rVar13 = rVar8.f1793g;
                    kotlin.jvm.internal.i.b(rVar13);
                    if (!rVar13.f1790d) {
                        V1.r rVar14 = rVar8.f1793g;
                        kotlin.jvm.internal.i.b(rVar14);
                        i3 = rVar14.f1788b;
                    }
                    if (i6 <= i7 + i3) {
                        V1.r rVar15 = rVar8.f1793g;
                        kotlin.jvm.internal.i.b(rVar15);
                        rVar8.d(rVar15, i6);
                        rVar8.a();
                        V1.s.a(rVar8);
                    }
                }
            }
            source.f1764b -= j4;
            this.f1764b += j4;
            j2 -= j4;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof V1.g) {
                long j2 = this.f1764b;
                V1.g gVar = (V1.g) obj;
                if (j2 == gVar.f1764b) {
                    if (j2 != 0) {
                        V1.r rVar = this.f1763a;
                        kotlin.jvm.internal.i.b(rVar);
                        V1.r rVar2 = gVar.f1763a;
                        kotlin.jvm.internal.i.b(rVar2);
                        int i2 = rVar.f1788b;
                        int i3 = rVar2.f1788b;
                        long j3 = 0;
                        while (j3 < this.f1764b) {
                            long min = java.lang.Math.min(rVar.f1789c - i2, rVar2.f1789c - i3);
                            long j4 = 0;
                            while (j4 < min) {
                                int i4 = i2 + 1;
                                byte b2 = rVar.f1787a[i2];
                                int i5 = i3 + 1;
                                if (b2 == rVar2.f1787a[i3]) {
                                    j4++;
                                    i3 = i5;
                                    i2 = i4;
                                }
                            }
                            if (i2 == rVar.f1789c) {
                                V1.r rVar3 = rVar.f1792f;
                                kotlin.jvm.internal.i.b(rVar3);
                                i2 = rVar3.f1788b;
                                rVar = rVar3;
                            }
                            if (i3 == rVar2.f1789c) {
                                rVar2 = rVar2.f1792f;
                                kotlin.jvm.internal.i.b(rVar2);
                                i3 = rVar2.f1788b;
                            }
                            j3 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // V1.i
    public final byte[] f() {
        return j(this.f1764b);
    }

    public final byte g() {
        if (this.f1764b == 0) {
            throw new java.io.EOFException();
        }
        V1.r rVar = this.f1763a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f1788b;
        int i3 = rVar.f1789c;
        int i4 = i2 + 1;
        byte b2 = rVar.f1787a[i2];
        this.f1764b--;
        if (i4 == i3) {
            this.f1763a = rVar.a();
            V1.s.a(rVar);
        } else {
            rVar.f1788b = i4;
        }
        return b2;
    }

    @Override // V1.h
    public final /* bridge */ /* synthetic */ V1.h h(java.lang.String str) {
        x(str);
        return this;
    }

    public final int hashCode() {
        V1.r rVar = this.f1763a;
        if (rVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = rVar.f1789c;
            for (int i4 = rVar.f1788b; i4 < i3; i4++) {
                i2 = (i2 * 31) + rVar.f1787a[i4];
            }
            rVar = rVar.f1792f;
            kotlin.jvm.internal.i.b(rVar);
        } while (rVar != this.f1763a);
        return i2;
    }

    @Override // V1.i
    public final java.io.InputStream i() {
        return new V1.f(this, 0);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] j(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1764b < j2) {
            throw new java.io.EOFException();
        }
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = read(bArr, i3, i2 - i3);
            if (read == -1) {
                throw new java.io.EOFException();
            }
            i3 += read;
        }
        return bArr;
    }

    public final V1.j k(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1764b < j2) {
            throw new java.io.EOFException();
        }
        if (j2 < 4096) {
            return new V1.j(j(j2));
        }
        V1.j p2 = p((int) j2);
        o(j2);
        return p2;
    }

    public final int l() {
        if (this.f1764b < 4) {
            throw new java.io.EOFException();
        }
        V1.r rVar = this.f1763a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f1788b;
        int i3 = rVar.f1789c;
        if (i3 - i2 < 4) {
            return ((g() & 255) << 24) | ((g() & 255) << 16) | ((g() & 255) << 8) | (g() & 255);
        }
        byte[] bArr = rVar.f1787a;
        int i4 = i2 + 3;
        int i5 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 2] & 255) << 8);
        int i6 = i2 + 4;
        int i7 = i5 | (bArr[i4] & 255);
        this.f1764b -= 4;
        if (i6 == i3) {
            this.f1763a = rVar.a();
            V1.s.a(rVar);
        } else {
            rVar.f1788b = i6;
        }
        return i7;
    }

    public final short m() {
        if (this.f1764b < 2) {
            throw new java.io.EOFException();
        }
        V1.r rVar = this.f1763a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f1788b;
        int i3 = rVar.f1789c;
        if (i3 - i2 < 2) {
            return (short) (((g() & 255) << 8) | (g() & 255));
        }
        int i4 = i2 + 1;
        byte[] bArr = rVar.f1787a;
        int i5 = (bArr[i2] & 255) << 8;
        int i6 = i2 + 2;
        int i7 = (bArr[i4] & 255) | i5;
        this.f1764b -= 2;
        if (i6 == i3) {
            this.f1763a = rVar.a();
            V1.s.a(rVar);
        } else {
            rVar.f1788b = i6;
        }
        return (short) i7;
    }

    public final java.lang.String n(long j2, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.i.e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1764b < j2) {
            throw new java.io.EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        V1.r rVar = this.f1763a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f1788b;
        if (i2 + j2 > rVar.f1789c) {
            return new java.lang.String(j(j2), charset);
        }
        int i3 = (int) j2;
        java.lang.String str = new java.lang.String(rVar.f1787a, i2, i3, charset);
        int i4 = rVar.f1788b + i3;
        rVar.f1788b = i4;
        this.f1764b -= j2;
        if (i4 == rVar.f1789c) {
            this.f1763a = rVar.a();
            V1.s.a(rVar);
        }
        return str;
    }

    public final void o(long j2) {
        while (j2 > 0) {
            V1.r rVar = this.f1763a;
            if (rVar == null) {
                throw new java.io.EOFException();
            }
            int min = (int) java.lang.Math.min(j2, rVar.f1789c - rVar.f1788b);
            long j3 = min;
            this.f1764b -= j3;
            j2 -= j3;
            int i2 = rVar.f1788b + min;
            rVar.f1788b = i2;
            if (i2 == rVar.f1789c) {
                this.f1763a = rVar.a();
                V1.s.a(rVar);
            }
        }
    }

    public final V1.j p(int i2) {
        if (i2 == 0) {
            return V1.j.f1765d;
        }
        a.AbstractC0059a.f(this.f1764b, 0L, i2);
        V1.r rVar = this.f1763a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            kotlin.jvm.internal.i.b(rVar);
            int i6 = rVar.f1789c;
            int i7 = rVar.f1788b;
            if (i6 == i7) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            rVar = rVar.f1792f;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        V1.r rVar2 = this.f1763a;
        int i8 = 0;
        while (i3 < i2) {
            kotlin.jvm.internal.i.b(rVar2);
            bArr[i8] = rVar2.f1787a;
            i3 += rVar2.f1789c - rVar2.f1788b;
            iArr[i8] = java.lang.Math.min(i3, i2);
            iArr[i8 + i5] = rVar2.f1788b;
            rVar2.f1790d = true;
            i8++;
            rVar2 = rVar2.f1792f;
        }
        return new V1.t(bArr, iArr);
    }

    public final V1.r q(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new java.lang.IllegalArgumentException("unexpected capacity");
        }
        V1.r rVar = this.f1763a;
        if (rVar == null) {
            V1.r b2 = V1.s.b();
            this.f1763a = b2;
            b2.f1793g = b2;
            b2.f1792f = b2;
            return b2;
        }
        V1.r rVar2 = rVar.f1793g;
        kotlin.jvm.internal.i.b(rVar2);
        if (rVar2.f1789c + i2 <= 8192 && rVar2.f1791e) {
            return rVar2;
        }
        V1.r b3 = V1.s.b();
        rVar2.b(b3);
        return b3;
    }

    public final void r(V1.j byteString) {
        kotlin.jvm.internal.i.e(byteString, "byteString");
        byteString.i(this, byteString.a());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        V1.r rVar = this.f1763a;
        if (rVar == null) {
            return -1;
        }
        int min = java.lang.Math.min(sink.remaining(), rVar.f1789c - rVar.f1788b);
        sink.put(rVar.f1787a, rVar.f1788b, min);
        int i2 = rVar.f1788b + min;
        rVar.f1788b = i2;
        this.f1764b -= min;
        if (i2 == rVar.f1789c) {
            this.f1763a = rVar.a();
            V1.s.a(rVar);
        }
        return min;
    }

    public final void s(byte[] source, int i2, int i3) {
        kotlin.jvm.internal.i.e(source, "source");
        long j2 = i3;
        a.AbstractC0059a.f(source.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            V1.r q2 = q(1);
            int min = java.lang.Math.min(i4 - i2, 8192 - q2.f1789c);
            int i5 = i2 + min;
            i1.AbstractC0189h.K(q2.f1789c, i2, i5, source, q2.f1787a);
            q2.f1789c += min;
            i2 = i5;
        }
        this.f1764b += j2;
    }

    public final void t(V1.w source) {
        kotlin.jvm.internal.i.e(source, "source");
        while (source.c(this, 8192L) != -1) {
        }
    }

    public final java.lang.String toString() {
        long j2 = this.f1764b;
        if (j2 <= 2147483647L) {
            return p((int) j2).toString();
        }
        throw new java.lang.IllegalStateException(("size > Int.MAX_VALUE: " + this.f1764b).toString());
    }

    public final void u(int i2) {
        V1.r q2 = q(1);
        int i3 = q2.f1789c;
        q2.f1789c = i3 + 1;
        q2.f1787a[i3] = (byte) i2;
        this.f1764b++;
    }

    public final void v(long j2) {
        if (j2 == 0) {
            u(48);
            return;
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        V1.r q2 = q(i2);
        int i3 = q2.f1789c;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            q2.f1787a[i4] = W1.a.f1829a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        q2.f1789c += i2;
        this.f1764b += i2;
    }

    public final void w(int i2) {
        V1.r q2 = q(4);
        int i3 = q2.f1789c;
        byte b2 = (byte) ((i2 >>> 24) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = q2.f1787a;
        bArr[i3] = b2;
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i3 + 3] = (byte) (i2 & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        q2.f1789c = i3 + 4;
        this.f1764b += 4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        int remaining = source.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            V1.r q2 = q(1);
            int min = java.lang.Math.min(i2, 8192 - q2.f1789c);
            source.get(q2.f1787a, q2.f1789c, min);
            i2 -= min;
            q2.f1789c += min;
        }
        this.f1764b += remaining;
        return remaining;
    }

    public final void x(java.lang.String string) {
        kotlin.jvm.internal.i.e(string, "string");
        y(string, 0, string.length());
    }

    public final void y(java.lang.String string, int i2, int i3) {
        char charAt;
        kotlin.jvm.internal.i.e(string, "string");
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(B1.a.f(i2, "beginIndex < 0: ").toString());
        }
        if (i3 < i2) {
            throw new java.lang.IllegalArgumentException(B1.a.h("endIndex < beginIndex: ", i3, i2, " < ").toString());
        }
        if (i3 > string.length()) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + string.length()).toString());
        }
        while (i2 < i3) {
            char charAt2 = string.charAt(i2);
            if (charAt2 < 128) {
                V1.r q2 = q(1);
                int i4 = q2.f1789c - i2;
                int min = java.lang.Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                byte[] bArr = q2.f1787a;
                bArr[i2 + i4] = (byte) charAt2;
                while (true) {
                    i2 = i5;
                    if (i2 >= min || (charAt = string.charAt(i2)) >= 128) {
                        break;
                    }
                    i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) charAt;
                }
                int i6 = q2.f1789c;
                int i7 = (i4 + i2) - i6;
                q2.f1789c = i6 + i7;
                this.f1764b += i7;
            } else {
                if (charAt2 < 2048) {
                    V1.r q3 = q(2);
                    int i8 = q3.f1789c;
                    byte[] bArr2 = q3.f1787a;
                    bArr2[i8] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                    q3.f1789c = i8 + 2;
                    this.f1764b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    V1.r q4 = q(3);
                    int i9 = q4.f1789c;
                    byte[] bArr3 = q4.f1787a;
                    bArr3[i9] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((charAt2 & '?') | 128);
                    q4.f1789c = i9 + 3;
                    this.f1764b += 3;
                } else {
                    int i10 = i2 + 1;
                    char charAt3 = i10 < i3 ? string.charAt(i10) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        u(63);
                        i2 = i10;
                    } else {
                        int i11 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        V1.r q5 = q(4);
                        int i12 = q5.f1789c;
                        byte[] bArr4 = q5.f1787a;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        q5.f1789c = i12 + 4;
                        this.f1764b += 4;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public final void z(int i2) {
        java.lang.String str;
        int i3 = 0;
        if (i2 < 128) {
            u(i2);
            return;
        }
        if (i2 < 2048) {
            V1.r q2 = q(2);
            int i4 = q2.f1789c;
            byte[] bArr = q2.f1787a;
            bArr[i4] = (byte) ((i2 >> 6) | 192);
            bArr[1 + i4] = (byte) ((i2 & 63) | 128);
            q2.f1789c = i4 + 2;
            this.f1764b += 2;
            return;
        }
        if (55296 <= i2 && i2 < 57344) {
            u(63);
            return;
        }
        if (i2 < 65536) {
            V1.r q3 = q(3);
            int i5 = q3.f1789c;
            byte[] bArr2 = q3.f1787a;
            bArr2[i5] = (byte) ((i2 >> 12) | 224);
            bArr2[1 + i5] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[2 + i5] = (byte) ((i2 & 63) | 128);
            q3.f1789c = i5 + 3;
            this.f1764b += 3;
            return;
        }
        if (i2 <= 1114111) {
            V1.r q4 = q(4);
            int i6 = q4.f1789c;
            byte[] bArr3 = q4.f1787a;
            bArr3[i6] = (byte) ((i2 >> 18) | 240);
            bArr3[1 + i6] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[2 + i6] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[3 + i6] = (byte) ((i2 & 63) | 128);
            q4.f1789c = i6 + 4;
            this.f1764b += 4;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected code point: 0x");
        if (i2 != 0) {
            char[] cArr = W1.b.f1830a;
            char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
            while (i3 < 8 && cArr2[i3] == '0') {
                i3++;
            }
            if (i3 < 0) {
                throw new java.lang.IndexOutOfBoundsException(B1.a.g(i3, "startIndex: ", ", endIndex: 8, size: 8"));
            }
            if (i3 > 8) {
                throw new java.lang.IllegalArgumentException(B1.a.g(i3, "startIndex: ", " > endIndex: 8"));
            }
            str = new java.lang.String(cArr2, i3, 8 - i3);
        } else {
            str = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.Values.FALSE_INTEGER;
        }
        sb.append(str);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final int read(byte[] sink, int i2, int i3) {
        kotlin.jvm.internal.i.e(sink, "sink");
        a.AbstractC0059a.f(sink.length, i2, i3);
        V1.r rVar = this.f1763a;
        if (rVar == null) {
            return -1;
        }
        int min = java.lang.Math.min(i3, rVar.f1789c - rVar.f1788b);
        int i4 = rVar.f1788b;
        i1.AbstractC0189h.K(i2, i4, i4 + min, rVar.f1787a, sink);
        int i5 = rVar.f1788b + min;
        rVar.f1788b = i5;
        this.f1764b -= min;
        if (i5 == rVar.f1789c) {
            this.f1763a = rVar.a();
            V1.s.a(rVar);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, V1.u
    public final void close() {
    }

    @Override // V1.u, java.io.Flushable
    public final void flush() {
    }
}
