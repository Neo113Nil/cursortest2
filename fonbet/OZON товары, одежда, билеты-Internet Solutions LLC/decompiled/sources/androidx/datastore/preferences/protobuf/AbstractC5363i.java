package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5362h;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5363i {

    /* renamed from: a, reason: collision with root package name */
    int f42532a;

    /* renamed from: b, reason: collision with root package name */
    int f42533b = 100;

    /* renamed from: c, reason: collision with root package name */
    int f42534c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    C5364j f42535d;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    private static final class a extends AbstractC5363i {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f42536e;

        /* renamed from: f, reason: collision with root package name */
        private int f42537f;

        /* renamed from: g, reason: collision with root package name */
        private int f42538g;

        /* renamed from: h, reason: collision with root package name */
        private int f42539h;

        /* renamed from: i, reason: collision with root package name */
        private int f42540i;

        /* renamed from: j, reason: collision with root package name */
        private int f42541j;

        /* renamed from: k, reason: collision with root package name */
        private int f42542k;

        a(byte[] bArr, int i11, int i12, boolean z11) {
            super(0);
            this.f42542k = Integer.MAX_VALUE;
            this.f42536e = bArr;
            this.f42537f = i12 + i11;
            this.f42539h = i11;
            this.f42540i = i11;
        }

        private void F() {
            int i11 = this.f42537f + this.f42538g;
            this.f42537f = i11;
            int i12 = i11 - this.f42540i;
            int i13 = this.f42542k;
            if (i12 <= i13) {
                this.f42538g = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f42538g = i14;
            this.f42537f = i11 - i14;
        }

        public final int A() throws IOException {
            int i11 = this.f42539h;
            if (this.f42537f - i11 < 4) {
                throw C5379z.i();
            }
            this.f42539h = i11 + 4;
            byte[] bArr = this.f42536e;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        public final long B() throws IOException {
            int i11 = this.f42539h;
            if (this.f42537f - i11 < 8) {
                throw C5379z.i();
            }
            this.f42539h = i11 + 8;
            byte[] bArr = this.f42536e;
            return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
        }

        public final int C() throws IOException {
            int i11;
            int i12 = this.f42539h;
            int i13 = this.f42537f;
            if (i13 != i12) {
                int i14 = i12 + 1;
                byte[] bArr = this.f42536e;
                byte b11 = bArr[i12];
                if (b11 >= 0) {
                    this.f42539h = i14;
                    return b11;
                }
                if (i13 - i14 >= 9) {
                    int i15 = i12 + 2;
                    int i16 = (bArr[i14] << 7) ^ b11;
                    if (i16 < 0) {
                        i11 = i16 ^ (-128);
                    } else {
                        int i17 = i12 + 3;
                        int i18 = (bArr[i15] << 14) ^ i16;
                        if (i18 >= 0) {
                            i11 = i18 ^ 16256;
                        } else {
                            int i19 = i12 + 4;
                            int i21 = i18 ^ (bArr[i17] << 21);
                            if (i21 < 0) {
                                i11 = (-2080896) ^ i21;
                            } else {
                                i17 = i12 + 5;
                                byte b12 = bArr[i19];
                                int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                                if (b12 < 0) {
                                    i19 = i12 + 6;
                                    if (bArr[i17] < 0) {
                                        i17 = i12 + 7;
                                        if (bArr[i19] < 0) {
                                            i19 = i12 + 8;
                                            if (bArr[i17] < 0) {
                                                i17 = i12 + 9;
                                                if (bArr[i19] < 0) {
                                                    int i23 = i12 + 10;
                                                    if (bArr[i17] >= 0) {
                                                        i15 = i23;
                                                        i11 = i22;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i11 = i22;
                                }
                                i11 = i22;
                            }
                            i15 = i19;
                        }
                        i15 = i17;
                    }
                    this.f42539h = i15;
                    return i11;
                }
            }
            return (int) E();
        }

        public final long D() throws IOException {
            long j11;
            long j12;
            long j13;
            long j14;
            int i11 = this.f42539h;
            int i12 = this.f42537f;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f42536e;
                byte b11 = bArr[i11];
                if (b11 >= 0) {
                    this.f42539h = i13;
                    return b11;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b11;
                    if (i15 < 0) {
                        j11 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            j11 = i17 ^ 16256;
                            i14 = i16;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                j14 = (-2080896) ^ i19;
                            } else {
                                long j15 = i19;
                                i14 = i11 + 5;
                                long j16 = j15 ^ (bArr[i18] << 28);
                                if (j16 >= 0) {
                                    j13 = 266354560;
                                } else {
                                    i18 = i11 + 6;
                                    long j17 = j16 ^ (bArr[i14] << 35);
                                    if (j17 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i14 = i11 + 7;
                                        j16 = j17 ^ (bArr[i18] << 42);
                                        if (j16 >= 0) {
                                            j13 = 4363953127296L;
                                        } else {
                                            i18 = i11 + 8;
                                            j17 = j16 ^ (bArr[i14] << 49);
                                            if (j17 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                i14 = i11 + 9;
                                                long j18 = (j17 ^ (bArr[i18] << 56)) ^ 71499008037633920L;
                                                if (j18 < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        i14 = i21;
                                                    }
                                                }
                                                j11 = j18;
                                            }
                                        }
                                    }
                                    j14 = j12 ^ j17;
                                }
                                j11 = j13 ^ j16;
                            }
                            i14 = i18;
                            j11 = j14;
                        }
                    }
                    this.f42539h = i14;
                    return j11;
                }
            }
            return E();
        }

        final long E() throws IOException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                int i12 = this.f42539h;
                if (i12 == this.f42537f) {
                    throw C5379z.i();
                }
                this.f42539h = i12 + 1;
                j11 |= (r3 & Byte.MAX_VALUE) << i11;
                if ((this.f42536e[i12] & 128) == 0) {
                    return j11;
                }
            }
            throw C5379z.e();
        }

        public final void G(int i11) throws IOException {
            if (i11 >= 0) {
                int i12 = this.f42537f;
                int i13 = this.f42539h;
                if (i11 <= i12 - i13) {
                    this.f42539h = i13 + i11;
                    return;
                }
            }
            if (i11 >= 0) {
                throw C5379z.i();
            }
            throw C5379z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final void a(int i11) throws C5379z {
            if (this.f42541j != i11) {
                throw new C5379z("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int b() {
            return this.f42539h - this.f42540i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final boolean c() throws IOException {
            return this.f42539h == this.f42537f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final void e(int i11) {
            this.f42542k = i11;
            F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int f(int i11) throws C5379z {
            if (i11 < 0) {
                throw C5379z.f();
            }
            int b11 = i11 + b();
            if (b11 < 0) {
                throw new C5379z("Failed to parse the message.");
            }
            int i12 = this.f42542k;
            if (b11 > i12) {
                throw C5379z.i();
            }
            this.f42542k = b11;
            F();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final boolean g() throws IOException {
            return D() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final AbstractC5362h h() throws IOException {
            byte[] bArr;
            int C11 = C();
            byte[] bArr2 = this.f42536e;
            if (C11 > 0) {
                int i11 = this.f42537f;
                int i12 = this.f42539h;
                if (C11 <= i11 - i12) {
                    AbstractC5362h e11 = AbstractC5362h.e(i12, C11, bArr2);
                    this.f42539h += C11;
                    return e11;
                }
            }
            if (C11 == 0) {
                return AbstractC5362h.f42524b;
            }
            if (C11 > 0) {
                int i13 = this.f42537f;
                int i14 = this.f42539h;
                if (C11 <= i13 - i14) {
                    int i15 = C11 + i14;
                    this.f42539h = i15;
                    bArr = Arrays.copyOfRange(bArr2, i14, i15);
                    AbstractC5362h abstractC5362h = AbstractC5362h.f42524b;
                    return new AbstractC5362h.g(bArr);
                }
            }
            if (C11 > 0) {
                throw C5379z.i();
            }
            if (C11 != 0) {
                throw C5379z.f();
            }
            bArr = C5378y.f42629b;
            AbstractC5362h abstractC5362h2 = AbstractC5362h.f42524b;
            return new AbstractC5362h.g(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final double i() throws IOException {
            return Double.longBitsToDouble(B());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int j() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int k() throws IOException {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final long l() throws IOException {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final float m() throws IOException {
            return Float.intBitsToFloat(A());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int n() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final long o() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int p() throws IOException {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final long q() throws IOException {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int r() throws IOException {
            int C11 = C();
            return (-(C11 & 1)) ^ (C11 >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final long s() throws IOException {
            long D11 = D();
            return (-(D11 & 1)) ^ (D11 >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final String t() throws IOException {
            int C11 = C();
            if (C11 > 0) {
                int i11 = this.f42537f;
                int i12 = this.f42539h;
                if (C11 <= i11 - i12) {
                    String str = new String(this.f42536e, i12, C11, C5378y.f42628a);
                    this.f42539h += C11;
                    return str;
                }
            }
            if (C11 == 0) {
                return "";
            }
            if (C11 < 0) {
                throw C5379z.f();
            }
            throw C5379z.i();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final String u() throws IOException {
            int C11 = C();
            if (C11 > 0) {
                int i11 = this.f42537f;
                int i12 = this.f42539h;
                if (C11 <= i11 - i12) {
                    String a11 = q0.a(this.f42536e, i12, C11);
                    this.f42539h += C11;
                    return a11;
                }
            }
            if (C11 == 0) {
                return "";
            }
            if (C11 <= 0) {
                throw C5379z.f();
            }
            throw C5379z.i();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int v() throws IOException {
            if (c()) {
                this.f42541j = 0;
                return 0;
            }
            int C11 = C();
            this.f42541j = C11;
            if ((C11 >>> 3) != 0) {
                return C11;
            }
            throw new C5379z("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int w() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final long x() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final boolean y(int i11) throws IOException {
            int i12 = i11 & 7;
            int i13 = 0;
            if (i12 != 0) {
                if (i12 == 1) {
                    G(8);
                    return true;
                }
                if (i12 == 2) {
                    G(C());
                    return true;
                }
                if (i12 == 3) {
                    z();
                    a(((i11 >>> 3) << 3) | 4);
                    return true;
                }
                if (i12 == 4) {
                    return false;
                }
                if (i12 != 5) {
                    throw C5379z.d();
                }
                G(4);
                return true;
            }
            int i14 = this.f42537f - this.f42539h;
            byte[] bArr = this.f42536e;
            if (i14 >= 10) {
                while (i13 < 10) {
                    int i15 = this.f42539h;
                    this.f42539h = i15 + 1;
                    if (bArr[i15] < 0) {
                        i13++;
                    }
                }
                throw C5379z.e();
            }
            while (i13 < 10) {
                int i16 = this.f42539h;
                if (i16 == this.f42537f) {
                    throw C5379z.i();
                }
                this.f42539h = i16 + 1;
                if (bArr[i16] < 0) {
                    i13++;
                }
            }
            throw C5379z.e();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.i$b */
    static final class b extends AbstractC5363i {

        /* renamed from: e, reason: collision with root package name */
        private final InputStream f42543e;

        /* renamed from: f, reason: collision with root package name */
        private final byte[] f42544f;

        /* renamed from: g, reason: collision with root package name */
        private int f42545g;

        /* renamed from: h, reason: collision with root package name */
        private int f42546h;

        /* renamed from: i, reason: collision with root package name */
        private int f42547i;

        /* renamed from: j, reason: collision with root package name */
        private int f42548j;

        /* renamed from: k, reason: collision with root package name */
        private int f42549k;

        /* renamed from: l, reason: collision with root package name */
        private int f42550l;

        b(InputStream inputStream) {
            super(0);
            this.f42550l = Integer.MAX_VALUE;
            C5378y.a(inputStream, "input");
            this.f42543e = inputStream;
            this.f42544f = new byte[4096];
            this.f42545g = 0;
            this.f42547i = 0;
            this.f42549k = 0;
        }

        private byte[] A(int i11) throws IOException {
            byte[] B11 = B(i11);
            if (B11 != null) {
                return B11;
            }
            int i12 = this.f42547i;
            int i13 = this.f42545g;
            int i14 = i13 - i12;
            this.f42549k += i13;
            this.f42547i = 0;
            this.f42545g = 0;
            ArrayList C11 = C(i11 - i14);
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f42544f, i12, bArr, 0, i14);
            Iterator it = C11.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                i14 += bArr2.length;
            }
            return bArr;
        }

        private byte[] B(int i11) throws IOException {
            if (i11 == 0) {
                return C5378y.f42629b;
            }
            if (i11 < 0) {
                throw C5379z.f();
            }
            int i12 = this.f42549k;
            int i13 = this.f42547i;
            int i14 = i12 + i13 + i11;
            if (i14 - this.f42534c > 0) {
                throw new C5379z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i15 = this.f42550l;
            if (i14 > i15) {
                K((i15 - i12) - i13);
                throw C5379z.i();
            }
            int i16 = this.f42545g - i13;
            int i17 = i11 - i16;
            InputStream inputStream = this.f42543e;
            if (i17 >= 4096) {
                try {
                    if (i17 > inputStream.available()) {
                        return null;
                    }
                } catch (C5379z e11) {
                    e11.g();
                    throw e11;
                }
            }
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f42544f, this.f42547i, bArr, 0, i16);
            this.f42549k += this.f42545g;
            this.f42547i = 0;
            this.f42545g = 0;
            while (i16 < i11) {
                try {
                    int read = inputStream.read(bArr, i16, i11 - i16);
                    if (read == -1) {
                        throw C5379z.i();
                    }
                    this.f42549k += read;
                    i16 += read;
                } catch (C5379z e12) {
                    e12.g();
                    throw e12;
                }
            }
            return bArr;
        }

        private ArrayList C(int i11) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i11 > 0) {
                int min = Math.min(i11, 4096);
                byte[] bArr = new byte[min];
                int i12 = 0;
                while (i12 < min) {
                    int read = this.f42543e.read(bArr, i12, min - i12);
                    if (read == -1) {
                        throw C5379z.i();
                    }
                    this.f42549k += read;
                    i12 += read;
                }
                i11 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void I() {
            int i11 = this.f42545g + this.f42546h;
            this.f42545g = i11;
            int i12 = this.f42549k + i11;
            int i13 = this.f42550l;
            if (i12 <= i13) {
                this.f42546h = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f42546h = i14;
            this.f42545g = i11 - i14;
        }

        private void J(int i11) throws IOException {
            if (L(i11)) {
                return;
            }
            if (i11 <= (this.f42534c - this.f42549k) - this.f42547i) {
                throw C5379z.i();
            }
            throw new C5379z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        private boolean L(int i11) throws IOException {
            int i12 = this.f42547i;
            int i13 = i12 + i11;
            int i14 = this.f42545g;
            if (i13 <= i14) {
                throw new IllegalStateException(T7.E.a(i11, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i15 = this.f42549k;
            int i16 = this.f42534c;
            if (i11 <= (i16 - i15) - i12 && i15 + i12 + i11 <= this.f42550l) {
                byte[] bArr = this.f42544f;
                if (i12 > 0) {
                    if (i14 > i12) {
                        System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
                    }
                    this.f42549k += i12;
                    this.f42545g -= i12;
                    this.f42547i = 0;
                }
                int i17 = this.f42545g;
                int min = Math.min(bArr.length - i17, (i16 - this.f42549k) - i17);
                InputStream inputStream = this.f42543e;
                try {
                    int read = inputStream.read(bArr, i17, min);
                    if (read == 0 || read < -1 || read > bArr.length) {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                    if (read > 0) {
                        this.f42545g += read;
                        I();
                        if (this.f42545g >= i11) {
                            return true;
                        }
                        return L(i11);
                    }
                } catch (C5379z e11) {
                    e11.g();
                    throw e11;
                }
            }
            return false;
        }

        public final int D() throws IOException {
            int i11 = this.f42547i;
            if (this.f42545g - i11 < 4) {
                J(4);
                i11 = this.f42547i;
            }
            this.f42547i = i11 + 4;
            byte[] bArr = this.f42544f;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        public final long E() throws IOException {
            int i11 = this.f42547i;
            if (this.f42545g - i11 < 8) {
                J(8);
                i11 = this.f42547i;
            }
            this.f42547i = i11 + 8;
            byte[] bArr = this.f42544f;
            return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
        }

        public final int F() throws IOException {
            int i11;
            int i12 = this.f42547i;
            int i13 = this.f42545g;
            if (i13 != i12) {
                int i14 = i12 + 1;
                byte[] bArr = this.f42544f;
                byte b11 = bArr[i12];
                if (b11 >= 0) {
                    this.f42547i = i14;
                    return b11;
                }
                if (i13 - i14 >= 9) {
                    int i15 = i12 + 2;
                    int i16 = (bArr[i14] << 7) ^ b11;
                    if (i16 < 0) {
                        i11 = i16 ^ (-128);
                    } else {
                        int i17 = i12 + 3;
                        int i18 = (bArr[i15] << 14) ^ i16;
                        if (i18 >= 0) {
                            i11 = i18 ^ 16256;
                        } else {
                            int i19 = i12 + 4;
                            int i21 = i18 ^ (bArr[i17] << 21);
                            if (i21 < 0) {
                                i11 = (-2080896) ^ i21;
                            } else {
                                i17 = i12 + 5;
                                byte b12 = bArr[i19];
                                int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                                if (b12 < 0) {
                                    i19 = i12 + 6;
                                    if (bArr[i17] < 0) {
                                        i17 = i12 + 7;
                                        if (bArr[i19] < 0) {
                                            i19 = i12 + 8;
                                            if (bArr[i17] < 0) {
                                                i17 = i12 + 9;
                                                if (bArr[i19] < 0) {
                                                    int i23 = i12 + 10;
                                                    if (bArr[i17] >= 0) {
                                                        i15 = i23;
                                                        i11 = i22;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i11 = i22;
                                }
                                i11 = i22;
                            }
                            i15 = i19;
                        }
                        i15 = i17;
                    }
                    this.f42547i = i15;
                    return i11;
                }
            }
            return (int) H();
        }

        public final long G() throws IOException {
            long j11;
            long j12;
            long j13;
            long j14;
            int i11 = this.f42547i;
            int i12 = this.f42545g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f42544f;
                byte b11 = bArr[i11];
                if (b11 >= 0) {
                    this.f42547i = i13;
                    return b11;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b11;
                    if (i15 < 0) {
                        j11 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            j11 = i17 ^ 16256;
                            i14 = i16;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                j14 = (-2080896) ^ i19;
                            } else {
                                long j15 = i19;
                                i14 = i11 + 5;
                                long j16 = j15 ^ (bArr[i18] << 28);
                                if (j16 >= 0) {
                                    j13 = 266354560;
                                } else {
                                    i18 = i11 + 6;
                                    long j17 = j16 ^ (bArr[i14] << 35);
                                    if (j17 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i14 = i11 + 7;
                                        j16 = j17 ^ (bArr[i18] << 42);
                                        if (j16 >= 0) {
                                            j13 = 4363953127296L;
                                        } else {
                                            i18 = i11 + 8;
                                            j17 = j16 ^ (bArr[i14] << 49);
                                            if (j17 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                i14 = i11 + 9;
                                                long j18 = (j17 ^ (bArr[i18] << 56)) ^ 71499008037633920L;
                                                if (j18 < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        i14 = i21;
                                                    }
                                                }
                                                j11 = j18;
                                            }
                                        }
                                    }
                                    j14 = j12 ^ j17;
                                }
                                j11 = j13 ^ j16;
                            }
                            i14 = i18;
                            j11 = j14;
                        }
                    }
                    this.f42547i = i14;
                    return j11;
                }
            }
            return H();
        }

        final long H() throws IOException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                if (this.f42547i == this.f42545g) {
                    J(1);
                }
                int i12 = this.f42547i;
                this.f42547i = i12 + 1;
                j11 |= (r3 & Byte.MAX_VALUE) << i11;
                if ((this.f42544f[i12] & 128) == 0) {
                    return j11;
                }
            }
            throw C5379z.e();
        }

        public final void K(int i11) throws IOException {
            int i12 = this.f42545g;
            int i13 = this.f42547i;
            if (i11 <= i12 - i13 && i11 >= 0) {
                this.f42547i = i13 + i11;
                return;
            }
            InputStream inputStream = this.f42543e;
            if (i11 < 0) {
                throw C5379z.f();
            }
            int i14 = this.f42549k;
            int i15 = i14 + i13;
            int i16 = i15 + i11;
            int i17 = this.f42550l;
            if (i16 > i17) {
                K((i17 - i14) - i13);
                throw C5379z.i();
            }
            this.f42549k = i15;
            int i18 = i12 - i13;
            this.f42545g = 0;
            this.f42547i = 0;
            while (i18 < i11) {
                long j11 = i11 - i18;
                try {
                    try {
                        long skip = inputStream.skip(j11);
                        if (skip < 0 || skip > j11) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                        if (skip == 0) {
                            break;
                        } else {
                            i18 += (int) skip;
                        }
                    } catch (C5379z e11) {
                        e11.g();
                        throw e11;
                    }
                } catch (Throwable th2) {
                    this.f42549k += i18;
                    I();
                    throw th2;
                }
            }
            this.f42549k += i18;
            I();
            if (i18 >= i11) {
                return;
            }
            int i19 = this.f42545g;
            int i21 = i19 - this.f42547i;
            this.f42547i = i19;
            J(1);
            while (true) {
                int i22 = i11 - i21;
                int i23 = this.f42545g;
                if (i22 <= i23) {
                    this.f42547i = i22;
                    return;
                } else {
                    i21 += i23;
                    this.f42547i = i23;
                    J(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final void a(int i11) throws C5379z {
            if (this.f42548j != i11) {
                throw new C5379z("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int b() {
            return this.f42549k + this.f42547i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final boolean c() throws IOException {
            return this.f42547i == this.f42545g && !L(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final void e(int i11) {
            this.f42550l = i11;
            I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int f(int i11) throws C5379z {
            if (i11 < 0) {
                throw C5379z.f();
            }
            int i12 = this.f42549k + this.f42547i + i11;
            if (i12 < 0) {
                throw new C5379z("Failed to parse the message.");
            }
            int i13 = this.f42550l;
            if (i12 > i13) {
                throw C5379z.i();
            }
            this.f42550l = i12;
            I();
            return i13;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final boolean g() throws IOException {
            return G() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final AbstractC5362h h() throws IOException {
            int F11 = F();
            int i11 = this.f42545g;
            int i12 = this.f42547i;
            int i13 = i11 - i12;
            byte[] bArr = this.f42544f;
            if (F11 <= i13 && F11 > 0) {
                AbstractC5362h e11 = AbstractC5362h.e(i12, F11, bArr);
                this.f42547i += F11;
                return e11;
            }
            if (F11 == 0) {
                return AbstractC5362h.f42524b;
            }
            if (F11 < 0) {
                throw C5379z.f();
            }
            byte[] B11 = B(F11);
            if (B11 != null) {
                return AbstractC5362h.e(0, B11.length, B11);
            }
            int i14 = this.f42547i;
            int i15 = this.f42545g;
            int i16 = i15 - i14;
            this.f42549k += i15;
            this.f42547i = 0;
            this.f42545g = 0;
            ArrayList C11 = C(F11 - i16);
            byte[] bArr2 = new byte[F11];
            System.arraycopy(bArr, i14, bArr2, 0, i16);
            Iterator it = C11.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i16, bArr3.length);
                i16 += bArr3.length;
            }
            AbstractC5362h abstractC5362h = AbstractC5362h.f42524b;
            return new AbstractC5362h.g(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final double i() throws IOException {
            return Double.longBitsToDouble(E());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int j() throws IOException {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int k() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final long l() throws IOException {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final float m() throws IOException {
            return Float.intBitsToFloat(D());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int n() throws IOException {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final long o() throws IOException {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int p() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final long q() throws IOException {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int r() throws IOException {
            int F11 = F();
            return (-(F11 & 1)) ^ (F11 >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final long s() throws IOException {
            long G11 = G();
            return (-(G11 & 1)) ^ (G11 >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final String t() throws IOException {
            int F11 = F();
            byte[] bArr = this.f42544f;
            if (F11 > 0) {
                int i11 = this.f42545g;
                int i12 = this.f42547i;
                if (F11 <= i11 - i12) {
                    String str = new String(bArr, i12, F11, C5378y.f42628a);
                    this.f42547i += F11;
                    return str;
                }
            }
            if (F11 == 0) {
                return "";
            }
            if (F11 < 0) {
                throw C5379z.f();
            }
            if (F11 > this.f42545g) {
                return new String(A(F11), C5378y.f42628a);
            }
            J(F11);
            String str2 = new String(bArr, this.f42547i, F11, C5378y.f42628a);
            this.f42547i += F11;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final String u() throws IOException {
            int F11 = F();
            int i11 = this.f42547i;
            int i12 = this.f42545g;
            int i13 = i12 - i11;
            byte[] bArr = this.f42544f;
            if (F11 <= i13 && F11 > 0) {
                this.f42547i = i11 + F11;
            } else {
                if (F11 == 0) {
                    return "";
                }
                if (F11 < 0) {
                    throw C5379z.f();
                }
                i11 = 0;
                if (F11 <= i12) {
                    J(F11);
                    this.f42547i = F11;
                } else {
                    bArr = A(F11);
                }
            }
            return q0.a(bArr, i11, F11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int v() throws IOException {
            if (c()) {
                this.f42548j = 0;
                return 0;
            }
            int F11 = F();
            this.f42548j = F11;
            if ((F11 >>> 3) != 0) {
                return F11;
            }
            throw new C5379z("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final int w() throws IOException {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final long x() throws IOException {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5363i
        public final boolean y(int i11) throws IOException {
            int i12 = i11 & 7;
            int i13 = 0;
            if (i12 != 0) {
                if (i12 == 1) {
                    K(8);
                    return true;
                }
                if (i12 == 2) {
                    K(F());
                    return true;
                }
                if (i12 == 3) {
                    z();
                    a(((i11 >>> 3) << 3) | 4);
                    return true;
                }
                if (i12 == 4) {
                    return false;
                }
                if (i12 != 5) {
                    throw C5379z.d();
                }
                K(4);
                return true;
            }
            int i14 = this.f42545g - this.f42547i;
            byte[] bArr = this.f42544f;
            if (i14 >= 10) {
                while (i13 < 10) {
                    int i15 = this.f42547i;
                    this.f42547i = i15 + 1;
                    if (bArr[i15] < 0) {
                        i13++;
                    }
                }
                throw C5379z.e();
            }
            while (i13 < 10) {
                if (this.f42547i == this.f42545g) {
                    J(1);
                }
                int i16 = this.f42547i;
                this.f42547i = i16 + 1;
                if (bArr[i16] < 0) {
                    i13++;
                }
            }
            throw C5379z.e();
            return true;
        }
    }

    AbstractC5363i(int i11) {
    }

    static AbstractC5363i d(byte[] bArr, int i11, int i12, boolean z11) {
        a aVar = new a(bArr, i11, i12, z11);
        try {
            aVar.f(i12);
            return aVar;
        } catch (C5379z e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public abstract void a(int i11) throws C5379z;

    public abstract int b();

    public abstract boolean c() throws IOException;

    public abstract void e(int i11);

    public abstract int f(int i11) throws C5379z;

    public abstract boolean g() throws IOException;

    public abstract AbstractC5362h h() throws IOException;

    public abstract double i() throws IOException;

    public abstract int j() throws IOException;

    public abstract int k() throws IOException;

    public abstract long l() throws IOException;

    public abstract float m() throws IOException;

    public abstract int n() throws IOException;

    public abstract long o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract String t() throws IOException;

    public abstract String u() throws IOException;

    public abstract int v() throws IOException;

    public abstract int w() throws IOException;

    public abstract long x() throws IOException;

    public abstract boolean y(int i11) throws IOException;

    public final void z() throws IOException {
        int v11;
        do {
            v11 = v();
            if (v11 == 0) {
                return;
            }
            int i11 = this.f42532a;
            if (i11 >= this.f42533b) {
                throw new C5379z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f42532a = i11 + 1;
            this.f42532a--;
        } while (y(v11));
    }
}
