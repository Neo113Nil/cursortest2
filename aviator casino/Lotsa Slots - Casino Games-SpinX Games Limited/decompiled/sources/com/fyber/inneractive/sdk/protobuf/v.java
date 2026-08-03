package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class v extends com.fyber.inneractive.sdk.protobuf.w {
    public final java.nio.ByteBuffer e;
    public final long f;
    public long g;
    public long h;
    public final long i;
    public int j;
    public int k;
    public int l = Integer.MAX_VALUE;

    public v(java.nio.ByteBuffer byteBuffer, boolean z) {
        this.e = byteBuffer;
        long j = com.fyber.inneractive.sdk.protobuf.x3.c.f4226a.getLong(byteBuffer, com.fyber.inneractive.sdk.protobuf.x3.g);
        this.f = j;
        this.g = byteBuffer.limit() + j;
        long position = j + byteBuffer.position();
        this.h = position;
        this.i = position;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i) {
        if (this.k != i) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int b() {
        return (int) (this.h - this.i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i) {
        this.l = i;
        z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean d() {
        return y() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final double f() {
        return java.lang.Double.longBitsToDouble(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int g() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int h() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long i() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final float j() {
        return java.lang.Float.intBitsToFloat(w());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int k() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long l() {
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int m() {
        int i;
        long j = this.h;
        if (this.g != j) {
            long j2 = j + 1;
            com.fyber.inneractive.sdk.protobuf.w3 w3Var = com.fyber.inneractive.sdk.protobuf.x3.c;
            byte a2 = w3Var.a(j);
            if (a2 >= 0) {
                this.h = j2;
                return a2;
            }
            if (this.g - j2 >= 9) {
                long j3 = 2 + j;
                int a3 = (w3Var.a(j2) << 7) ^ a2;
                if (a3 < 0) {
                    i = a3 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int a4 = a3 ^ (w3Var.a(j3) << com.google.common.base.Ascii.SO);
                    if (a4 >= 0) {
                        i = a4 ^ 16256;
                        j3 = j4;
                    } else {
                        j3 = j + 4;
                        int a5 = a4 ^ (w3Var.a(j4) << com.google.common.base.Ascii.NAK);
                        if (a5 < 0) {
                            i = (-2080896) ^ a5;
                        } else {
                            long j5 = 5 + j;
                            byte a6 = w3Var.a(j3);
                            int i2 = (a5 ^ (a6 << com.google.common.base.Ascii.FS)) ^ 266354560;
                            if (a6 < 0) {
                                long j6 = 6 + j;
                                if (w3Var.a(j5) < 0) {
                                    j5 = 7 + j;
                                    if (w3Var.a(j6) < 0) {
                                        j6 = 8 + j;
                                        if (w3Var.a(j5) < 0) {
                                            long j7 = 9 + j;
                                            if (w3Var.a(j6) < 0) {
                                                long j8 = j + 10;
                                                if (w3Var.a(j7) >= 0) {
                                                    j3 = j8;
                                                }
                                            } else {
                                                j3 = j7;
                                            }
                                            i = i2;
                                        }
                                    }
                                }
                                j3 = j6;
                                i = i2;
                            }
                            j3 = j5;
                            i = i2;
                        }
                    }
                }
                this.h = j3;
                return i;
            }
        }
        long j9 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            long j10 = this.h;
            if (j10 == this.g) {
                throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.h = j10 + 1;
            j9 |= (r3 & Byte.MAX_VALUE) << i3;
            if ((com.fyber.inneractive.sdk.protobuf.x3.c.a(j10) & 128) == 0) {
                return (int) j9;
            }
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int n() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long o() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int p() {
        return com.fyber.inneractive.sdk.protobuf.w.b(m());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long q() {
        return com.fyber.inneractive.sdk.protobuf.w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final java.lang.String r() {
        int m = m();
        if (m > 0) {
            long j = this.g;
            long j2 = this.h;
            if (m <= ((int) (j - j2))) {
                byte[] bArr = new byte[m];
                long j3 = m;
                com.fyber.inneractive.sdk.protobuf.x3.c.a(j2, bArr, j3);
                java.lang.String str = new java.lang.String(bArr, com.fyber.inneractive.sdk.protobuf.l1.f4203a);
                this.h += j3;
                return str;
            }
        }
        if (m == 0) {
            return "";
        }
        if (m < 0) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final java.lang.String s() {
        int m = m();
        if (m > 0) {
            long j = this.g;
            long j2 = this.h;
            if (m <= ((int) (j - j2))) {
                int i = (int) (j2 - this.f);
                java.nio.ByteBuffer byteBuffer = this.e;
                com.fyber.inneractive.sdk.protobuf.z3 z3Var = com.fyber.inneractive.sdk.protobuf.d4.f4185a;
                z3Var.getClass();
                java.lang.String a2 = byteBuffer.hasArray() ? z3Var.a(byteBuffer.array(), byteBuffer.arrayOffset() + i, m) : byteBuffer.isDirect() ? z3Var.b(byteBuffer, i, m) : com.fyber.inneractive.sdk.protobuf.z3.a(byteBuffer, i, m);
                this.h += m;
                return a2;
            }
        }
        if (m == 0) {
            return "";
        }
        if (m <= 0) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int t() {
        if (c()) {
            this.k = 0;
            return 0;
        }
        int m = m();
        this.k = m;
        if ((m >>> 3) != 0) {
            return m;
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int u() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long v() {
        return y();
    }

    public final int w() {
        long j = this.h;
        if (this.g - j < 4) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.h = 4 + j;
        com.fyber.inneractive.sdk.protobuf.w3 w3Var = com.fyber.inneractive.sdk.protobuf.x3.c;
        return ((w3Var.a(j + 3) & 255) << 24) | (w3Var.a(j) & 255) | ((w3Var.a(1 + j) & 255) << 8) | ((w3Var.a(2 + j) & 255) << 16);
    }

    public final long x() {
        long j = this.h;
        if (this.g - j < 8) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.h = 8 + j;
        com.fyber.inneractive.sdk.protobuf.w3 w3Var = com.fyber.inneractive.sdk.protobuf.x3.c;
        return ((w3Var.a(j + 7) & 255) << 56) | (w3Var.a(j) & 255) | ((w3Var.a(1 + j) & 255) << 8) | ((w3Var.a(2 + j) & 255) << 16) | ((w3Var.a(3 + j) & 255) << 24) | ((w3Var.a(4 + j) & 255) << 32) | ((w3Var.a(5 + j) & 255) << 40) | ((w3Var.a(6 + j) & 255) << 48);
    }

    public final long y() {
        long j;
        long j2;
        long j3;
        int i;
        long j4 = this.h;
        long j5 = 0;
        if (this.g != j4) {
            long j6 = j4 + 1;
            com.fyber.inneractive.sdk.protobuf.w3 w3Var = com.fyber.inneractive.sdk.protobuf.x3.c;
            byte a2 = w3Var.a(j4);
            if (a2 >= 0) {
                this.h = j6;
                return a2;
            }
            if (this.g - j6 >= 9) {
                long j7 = 2 + j4;
                int a3 = (w3Var.a(j6) << 7) ^ a2;
                if (a3 >= 0) {
                    long j8 = j4 + 3;
                    int a4 = a3 ^ (w3Var.a(j7) << com.google.common.base.Ascii.SO);
                    if (a4 >= 0) {
                        j = a4 ^ 16256;
                    } else {
                        j7 = j4 + 4;
                        int a5 = a4 ^ (w3Var.a(j8) << com.google.common.base.Ascii.NAK);
                        if (a5 < 0) {
                            i = (-2080896) ^ a5;
                        } else {
                            j8 = 5 + j4;
                            long a6 = a5 ^ (w3Var.a(j7) << 28);
                            if (a6 < 0) {
                                j7 = j4 + 6;
                                long a7 = a6 ^ (w3Var.a(j8) << 35);
                                if (a7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j8 = 7 + j4;
                                    a6 = a7 ^ (w3Var.a(j7) << 42);
                                    if (a6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j7 = j4 + 8;
                                        a7 = a6 ^ (w3Var.a(j8) << 49);
                                        if (a7 >= 0) {
                                            long j9 = 9 + j4;
                                            long a8 = (a7 ^ (w3Var.a(j7) << 56)) ^ 71499008037633920L;
                                            if (a8 < 0) {
                                                long j10 = j4 + 10;
                                                if (w3Var.a(j9) >= 0) {
                                                    j7 = j10;
                                                }
                                            } else {
                                                j7 = j9;
                                            }
                                            j = a8;
                                            this.h = j7;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                                j = j2 ^ a7;
                                this.h = j7;
                                return j;
                            }
                            j3 = 266354560;
                            j = j3 ^ a6;
                        }
                    }
                    j7 = j8;
                    this.h = j7;
                    return j;
                }
                i = a3 ^ (-128);
                j = i;
                this.h = j7;
                return j;
            }
        }
        for (int i2 = 0; i2 < 64; i2 += 7) {
            long j11 = this.h;
            if (j11 == this.g) {
                throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.h = j11 + 1;
            j5 |= (r2 & Byte.MAX_VALUE) << i2;
            if ((com.fyber.inneractive.sdk.protobuf.x3.c.a(j11) & 128) == 0) {
                return j5;
            }
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        long j = this.g + this.j;
        this.g = j;
        int i = (int) (j - this.i);
        int i2 = this.l;
        if (i <= i2) {
            this.j = 0;
            return;
        }
        int i3 = i - i2;
        this.j = i3;
        this.g = j - i3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i) {
        if (i < 0) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + ((int) (this.h - this.i));
        int i3 = this.l;
        if (i2 > i3) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = i2;
        z();
        return i3;
    }

    public final void f(int i) {
        if (i >= 0) {
            long j = this.g;
            long j2 = this.h;
            if (i <= ((int) (j - j2))) {
                this.h = j2 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.h == this.g;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i, com.fyber.inneractive.sdk.protobuf.c2 c2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        int i2 = this.f4222a;
        if (i2 < this.b) {
            this.f4222a = i2 + 1;
            ((com.fyber.inneractive.sdk.protobuf.t0) c2Var).a(this, h0Var);
            a((i << 3) | 4);
            this.f4222a--;
            return;
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean e(int i) {
        int t;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (((int) (this.g - this.h)) >= 10) {
                while (i3 < 10) {
                    long j = this.h;
                    this.h = j + 1;
                    if (com.fyber.inneractive.sdk.protobuf.x3.c.a(j) < 0) {
                        i3++;
                    }
                }
                throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                long j2 = this.h;
                if (j2 == this.g) {
                    throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.h = j2 + 1;
                if (com.fyber.inneractive.sdk.protobuf.x3.c.a(j2) < 0) {
                    i3++;
                }
            }
            throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            f(8);
            return true;
        }
        if (i2 == 2) {
            f(m());
            return true;
        }
        if (i2 == 3) {
            do {
                t = t();
                if (t == 0) {
                    break;
                }
            } while (e(t));
            a(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            return false;
        }
        if (i2 == 5) {
            f(4);
            return true;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(com.fyber.inneractive.sdk.protobuf.c2 c2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        int m = m();
        if (this.f4222a < this.b) {
            int d = d(m);
            this.f4222a++;
            ((com.fyber.inneractive.sdk.protobuf.t0) c2Var).a(this, h0Var);
            a(0);
            this.f4222a--;
            this.l = d;
            z();
            return;
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final com.fyber.inneractive.sdk.protobuf.q e() {
        int m = m();
        if (m > 0) {
            long j = this.g;
            long j2 = this.h;
            if (m <= ((int) (j - j2))) {
                byte[] bArr = new byte[m];
                long j3 = m;
                com.fyber.inneractive.sdk.protobuf.x3.c.a(j2, bArr, j3);
                this.h += j3;
                com.fyber.inneractive.sdk.protobuf.q qVar = com.fyber.inneractive.sdk.protobuf.s.b;
                return new com.fyber.inneractive.sdk.protobuf.q(bArr);
            }
        }
        if (m == 0) {
            return com.fyber.inneractive.sdk.protobuf.s.b;
        }
        if (m < 0) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i = this.l;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - ((int) (this.h - this.i));
    }
}
