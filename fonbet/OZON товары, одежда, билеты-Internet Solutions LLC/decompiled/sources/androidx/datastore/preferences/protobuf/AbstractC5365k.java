package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5365k extends AbstractC5360f {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f42574b = Logger.getLogger(AbstractC5365k.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f42575c = p0.u();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f42576d = 0;

    /* renamed from: a, reason: collision with root package name */
    C5366l f42577a;

    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
    private static abstract class a extends AbstractC5365k {

        /* renamed from: e, reason: collision with root package name */
        final byte[] f42578e;

        /* renamed from: f, reason: collision with root package name */
        final int f42579f;

        /* renamed from: g, reason: collision with root package name */
        int f42580g;

        a(int i11) {
            super(0);
            if (i11 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            int max = Math.max(i11, 20);
            this.f42578e = new byte[max];
            this.f42579f = max;
        }

        final void I(int i11) {
            int i12 = this.f42580g;
            int i13 = i12 + 1;
            this.f42580g = i13;
            byte[] bArr = this.f42578e;
            bArr[i12] = (byte) (i11 & 255);
            int i14 = i12 + 2;
            this.f42580g = i14;
            bArr[i13] = (byte) ((i11 >> 8) & 255);
            int i15 = i12 + 3;
            this.f42580g = i15;
            bArr[i14] = (byte) ((i11 >> 16) & 255);
            this.f42580g = i12 + 4;
            bArr[i15] = (byte) ((i11 >> 24) & 255);
        }

        final void J(long j11) {
            int i11 = this.f42580g;
            int i12 = i11 + 1;
            this.f42580g = i12;
            byte[] bArr = this.f42578e;
            bArr[i11] = (byte) (j11 & 255);
            int i13 = i11 + 2;
            this.f42580g = i13;
            bArr[i12] = (byte) ((j11 >> 8) & 255);
            int i14 = i11 + 3;
            this.f42580g = i14;
            bArr[i13] = (byte) ((j11 >> 16) & 255);
            int i15 = i11 + 4;
            this.f42580g = i15;
            bArr[i14] = (byte) (255 & (j11 >> 24));
            int i16 = i11 + 5;
            this.f42580g = i16;
            bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
            int i17 = i11 + 6;
            this.f42580g = i17;
            bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
            int i18 = i11 + 7;
            this.f42580g = i18;
            bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
            this.f42580g = i11 + 8;
            bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
        }

        final void K(int i11, int i12) {
            L((i11 << 3) | i12);
        }

        final void L(int i11) {
            boolean z11 = AbstractC5365k.f42575c;
            byte[] bArr = this.f42578e;
            if (z11) {
                while ((i11 & (-128)) != 0) {
                    int i12 = this.f42580g;
                    this.f42580g = i12 + 1;
                    p0.x(bArr, i12, (byte) ((i11 | UserVerificationMethods.USER_VERIFY_PATTERN) & 255));
                    i11 >>>= 7;
                }
                int i13 = this.f42580g;
                this.f42580g = i13 + 1;
                p0.x(bArr, i13, (byte) i11);
                return;
            }
            while ((i11 & (-128)) != 0) {
                int i14 = this.f42580g;
                this.f42580g = i14 + 1;
                bArr[i14] = (byte) ((i11 | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
                i11 >>>= 7;
            }
            int i15 = this.f42580g;
            this.f42580g = i15 + 1;
            bArr[i15] = (byte) i11;
        }

        final void M(long j11) {
            boolean z11 = AbstractC5365k.f42575c;
            byte[] bArr = this.f42578e;
            if (z11) {
                while ((j11 & (-128)) != 0) {
                    int i11 = this.f42580g;
                    this.f42580g = i11 + 1;
                    p0.x(bArr, i11, (byte) ((((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255));
                    j11 >>>= 7;
                }
                int i12 = this.f42580g;
                this.f42580g = i12 + 1;
                p0.x(bArr, i12, (byte) j11);
                return;
            }
            while ((j11 & (-128)) != 0) {
                int i13 = this.f42580g;
                this.f42580g = i13 + 1;
                bArr[i13] = (byte) ((((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
                j11 >>>= 7;
            }
            int i14 = this.f42580g;
            this.f42580g = i14 + 1;
            bArr[i14] = (byte) j11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final int l() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.k$b */
    /* loaded from: classes8.dex */
    static class b extends AbstractC5365k {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f42581e;

        /* renamed from: f, reason: collision with root package name */
        private final int f42582f;

        /* renamed from: g, reason: collision with root package name */
        private int f42583g;

        b(int i11, byte[] bArr) {
            super(0);
            if (((bArr.length - i11) | i11) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            this.f42581e = bArr;
            this.f42583g = 0;
            this.f42582f = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void A(int i11, AbstractC5362h abstractC5362h) throws IOException {
            D(1, 3);
            E(2, i11);
            p(3, abstractC5362h);
            D(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void B(int i11, String str) throws IOException {
            D(i11, 2);
            C(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void C(String str) throws IOException {
            int i11 = this.f42583g;
            try {
                int i12 = AbstractC5365k.i(str.length() * 3);
                int i13 = AbstractC5365k.i(str.length());
                byte[] bArr = this.f42581e;
                if (i13 != i12) {
                    F(q0.c(str));
                    this.f42583g = q0.b(str, bArr, this.f42583g, l());
                    return;
                }
                int i14 = i11 + i13;
                this.f42583g = i14;
                int b11 = q0.b(str, bArr, i14, l());
                this.f42583g = i11;
                F((b11 - i11) - i13);
                this.f42583g = b11;
            } catch (q0.d e11) {
                this.f42583g = i11;
                k(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new c(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void D(int i11, int i12) throws IOException {
            F((i11 << 3) | i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void E(int i11, int i12) throws IOException {
            D(i11, 0);
            F(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void F(int i11) throws IOException {
            while (true) {
                int i12 = i11 & (-128);
                byte[] bArr = this.f42581e;
                if (i12 == 0) {
                    int i13 = this.f42583g;
                    this.f42583g = i13 + 1;
                    bArr[i13] = (byte) i11;
                    return;
                } else {
                    try {
                        int i14 = this.f42583g;
                        this.f42583g = i14 + 1;
                        bArr[i14] = (byte) ((i11 | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
                        i11 >>>= 7;
                    } catch (IndexOutOfBoundsException e11) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f42583g), Integer.valueOf(this.f42582f), 1), e11);
                    }
                }
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f42583g), Integer.valueOf(this.f42582f), 1), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void G(int i11, long j11) throws IOException {
            D(i11, 0);
            H(j11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void H(long j11) throws IOException {
            boolean z11 = AbstractC5365k.f42575c;
            byte[] bArr = this.f42581e;
            if (z11 && l() >= 10) {
                while ((j11 & (-128)) != 0) {
                    int i11 = this.f42583g;
                    this.f42583g = i11 + 1;
                    p0.x(bArr, i11, (byte) ((((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255));
                    j11 >>>= 7;
                }
                int i12 = this.f42583g;
                this.f42583g = i12 + 1;
                p0.x(bArr, i12, (byte) j11);
                return;
            }
            while ((j11 & (-128)) != 0) {
                try {
                    int i13 = this.f42583g;
                    this.f42583g = i13 + 1;
                    bArr[i13] = (byte) ((((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
                    j11 >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f42583g), Integer.valueOf(this.f42582f), 1), e11);
                }
            }
            int i14 = this.f42583g;
            this.f42583g = i14 + 1;
            bArr[i14] = (byte) j11;
        }

        public final void I(byte[] bArr, int i11, int i12) throws IOException {
            try {
                System.arraycopy(bArr, i11, this.f42581e, this.f42583g, i12);
                this.f42583g += i12;
            } catch (IndexOutOfBoundsException e11) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f42583g), Integer.valueOf(this.f42582f), Integer.valueOf(i12)), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5360f
        public final void a(byte[] bArr, int i11, int i12) throws IOException {
            I(bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final int l() {
            return this.f42582f - this.f42583g;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void m(byte b11) throws IOException {
            try {
                byte[] bArr = this.f42581e;
                int i11 = this.f42583g;
                this.f42583g = i11 + 1;
                bArr[i11] = b11;
            } catch (IndexOutOfBoundsException e11) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f42583g), Integer.valueOf(this.f42582f), 1), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void n(int i11, boolean z11) throws IOException {
            D(i11, 0);
            m(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void o(int i11, byte[] bArr) throws IOException {
            F(i11);
            I(bArr, 0, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void p(int i11, AbstractC5362h abstractC5362h) throws IOException {
            D(i11, 2);
            q(abstractC5362h);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void q(AbstractC5362h abstractC5362h) throws IOException {
            F(abstractC5362h.size());
            abstractC5362h.n(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void r(int i11, int i12) throws IOException {
            D(i11, 5);
            s(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void s(int i11) throws IOException {
            try {
                byte[] bArr = this.f42581e;
                int i12 = this.f42583g;
                int i13 = i12 + 1;
                this.f42583g = i13;
                bArr[i12] = (byte) (i11 & 255);
                int i14 = i12 + 2;
                this.f42583g = i14;
                bArr[i13] = (byte) ((i11 >> 8) & 255);
                int i15 = i12 + 3;
                this.f42583g = i15;
                bArr[i14] = (byte) ((i11 >> 16) & 255);
                this.f42583g = i12 + 4;
                bArr[i15] = (byte) ((i11 >> 24) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f42583g), Integer.valueOf(this.f42582f), 1), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void t(int i11, long j11) throws IOException {
            D(i11, 1);
            u(j11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void u(long j11) throws IOException {
            try {
                byte[] bArr = this.f42581e;
                int i11 = this.f42583g;
                int i12 = i11 + 1;
                this.f42583g = i12;
                bArr[i11] = (byte) (((int) j11) & 255);
                int i13 = i11 + 2;
                this.f42583g = i13;
                bArr[i12] = (byte) (((int) (j11 >> 8)) & 255);
                int i14 = i11 + 3;
                this.f42583g = i14;
                bArr[i13] = (byte) (((int) (j11 >> 16)) & 255);
                int i15 = i11 + 4;
                this.f42583g = i15;
                bArr[i14] = (byte) (((int) (j11 >> 24)) & 255);
                int i16 = i11 + 5;
                this.f42583g = i16;
                bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
                int i17 = i11 + 6;
                this.f42583g = i17;
                bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
                int i18 = i11 + 7;
                this.f42583g = i18;
                bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
                this.f42583g = i11 + 8;
                bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f42583g), Integer.valueOf(this.f42582f), 1), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void v(int i11, int i12) throws IOException {
            D(i11, 0);
            w(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void w(int i11) throws IOException {
            if (i11 >= 0) {
                F(i11);
            } else {
                H(i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        final void x(int i11, Q q11, f0 f0Var) throws IOException {
            D(i11, 2);
            F(((AbstractC5355a) q11).e(f0Var));
            f0Var.c(q11, this.f42577a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void y(Q q11) throws IOException {
            F(q11.getSerializedSize());
            q11.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void z(int i11, Q q11) throws IOException {
            D(1, 3);
            E(2, i11);
            D(3, 2);
            y(q11);
            D(1, 4);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k$c */
    /* loaded from: classes8.dex */
    public static class c extends IOException {
        c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.k$d */
    static final class d extends a {

        /* renamed from: h, reason: collision with root package name */
        private final OutputStream f42584h;

        d(OutputStream outputStream, int i11) {
            super(i11);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f42584h = outputStream;
        }

        private void N() throws IOException {
            this.f42584h.write(this.f42578e, 0, this.f42580g);
            this.f42580g = 0;
        }

        private void P(int i11) throws IOException {
            if (this.f42579f - this.f42580g < i11) {
                N();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void A(int i11, AbstractC5362h abstractC5362h) throws IOException {
            D(1, 3);
            E(2, i11);
            p(3, abstractC5362h);
            D(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void B(int i11, String str) throws IOException {
            D(i11, 2);
            C(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void C(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int i11 = AbstractC5365k.i(length);
                int i12 = i11 + length;
                int i13 = this.f42579f;
                if (i12 > i13) {
                    byte[] bArr = new byte[length];
                    int b11 = q0.b(str, bArr, 0, length);
                    F(b11);
                    Q(bArr, 0, b11);
                    return;
                }
                if (i12 > i13 - this.f42580g) {
                    N();
                }
                int i14 = AbstractC5365k.i(str.length());
                int i15 = this.f42580g;
                byte[] bArr2 = this.f42578e;
                try {
                    try {
                        if (i14 == i11) {
                            int i16 = i15 + i14;
                            this.f42580g = i16;
                            int b12 = q0.b(str, bArr2, i16, i13 - i16);
                            this.f42580g = i15;
                            L((b12 - i15) - i14);
                            this.f42580g = b12;
                        } else {
                            int c11 = q0.c(str);
                            L(c11);
                            this.f42580g = q0.b(str, bArr2, this.f42580g, c11);
                        }
                    } catch (ArrayIndexOutOfBoundsException e11) {
                        throw new c(e11);
                    }
                } catch (q0.d e12) {
                    this.f42580g = i15;
                    throw e12;
                }
            } catch (q0.d e13) {
                k(str, e13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void D(int i11, int i12) throws IOException {
            F((i11 << 3) | i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void E(int i11, int i12) throws IOException {
            P(20);
            K(i11, 0);
            L(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void F(int i11) throws IOException {
            P(5);
            L(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void G(int i11, long j11) throws IOException {
            P(20);
            K(i11, 0);
            M(j11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void H(long j11) throws IOException {
            P(10);
            M(j11);
        }

        public final void O() throws IOException {
            if (this.f42580g > 0) {
                N();
            }
        }

        public final void Q(byte[] bArr, int i11, int i12) throws IOException {
            int i13 = this.f42580g;
            int i14 = this.f42579f;
            int i15 = i14 - i13;
            byte[] bArr2 = this.f42578e;
            if (i15 >= i12) {
                System.arraycopy(bArr, i11, bArr2, i13, i12);
                this.f42580g += i12;
                return;
            }
            System.arraycopy(bArr, i11, bArr2, i13, i15);
            int i16 = i11 + i15;
            int i17 = i12 - i15;
            this.f42580g = i14;
            N();
            if (i17 > i14) {
                this.f42584h.write(bArr, i16, i17);
            } else {
                System.arraycopy(bArr, i16, bArr2, 0, i17);
                this.f42580g = i17;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5360f
        public final void a(byte[] bArr, int i11, int i12) throws IOException {
            Q(bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void m(byte b11) throws IOException {
            if (this.f42580g == this.f42579f) {
                N();
            }
            int i11 = this.f42580g;
            this.f42580g = i11 + 1;
            this.f42578e[i11] = b11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void n(int i11, boolean z11) throws IOException {
            P(11);
            K(i11, 0);
            byte b11 = z11 ? (byte) 1 : (byte) 0;
            int i12 = this.f42580g;
            this.f42580g = i12 + 1;
            this.f42578e[i12] = b11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void o(int i11, byte[] bArr) throws IOException {
            F(i11);
            Q(bArr, 0, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void p(int i11, AbstractC5362h abstractC5362h) throws IOException {
            D(i11, 2);
            q(abstractC5362h);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void q(AbstractC5362h abstractC5362h) throws IOException {
            F(abstractC5362h.size());
            abstractC5362h.n(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void r(int i11, int i12) throws IOException {
            P(14);
            K(i11, 5);
            I(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void s(int i11) throws IOException {
            P(4);
            I(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void t(int i11, long j11) throws IOException {
            P(18);
            K(i11, 1);
            J(j11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void u(long j11) throws IOException {
            P(8);
            J(j11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void v(int i11, int i12) throws IOException {
            P(20);
            K(i11, 0);
            if (i12 >= 0) {
                L(i12);
            } else {
                M(i12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void w(int i11) throws IOException {
            if (i11 >= 0) {
                F(i11);
            } else {
                H(i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        final void x(int i11, Q q11, f0 f0Var) throws IOException {
            D(i11, 2);
            F(((AbstractC5355a) q11).e(f0Var));
            f0Var.c(q11, this.f42577a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void y(Q q11) throws IOException {
            F(q11.getSerializedSize());
            q11.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5365k
        public final void z(int i11, Q q11) throws IOException {
            D(1, 3);
            E(2, i11);
            D(3, 2);
            y(q11);
            D(1, 4);
        }
    }

    private AbstractC5365k() {
    }

    public static int c(int i11, AbstractC5362h abstractC5362h) {
        return d(abstractC5362h) + h(i11);
    }

    public static int d(AbstractC5362h abstractC5362h) {
        int size = abstractC5362h.size();
        return i(size) + size;
    }

    public static int e(int i11) {
        return i((i11 >> 31) ^ (i11 << 1));
    }

    public static int f(long j11) {
        return j((j11 >> 63) ^ (j11 << 1));
    }

    public static int g(String str) {
        int length;
        try {
            length = q0.c(str);
        } catch (q0.d unused) {
            length = str.getBytes(C5378y.f42628a).length;
        }
        return i(length) + length;
    }

    public static int h(int i11) {
        return i(i11 << 3);
    }

    public static int i(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int j(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    public abstract void A(int i11, AbstractC5362h abstractC5362h) throws IOException;

    public abstract void B(int i11, String str) throws IOException;

    public abstract void C(String str) throws IOException;

    public abstract void D(int i11, int i12) throws IOException;

    public abstract void E(int i11, int i12) throws IOException;

    public abstract void F(int i11) throws IOException;

    public abstract void G(int i11, long j11) throws IOException;

    public abstract void H(long j11) throws IOException;

    final void k(String str, q0.d dVar) throws IOException {
        f42574b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C5378y.f42628a);
        try {
            F(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e11) {
            throw new c(e11);
        }
    }

    public abstract int l();

    public abstract void m(byte b11) throws IOException;

    public abstract void n(int i11, boolean z11) throws IOException;

    abstract void o(int i11, byte[] bArr) throws IOException;

    public abstract void p(int i11, AbstractC5362h abstractC5362h) throws IOException;

    public abstract void q(AbstractC5362h abstractC5362h) throws IOException;

    public abstract void r(int i11, int i12) throws IOException;

    public abstract void s(int i11) throws IOException;

    public abstract void t(int i11, long j11) throws IOException;

    public abstract void u(long j11) throws IOException;

    public abstract void v(int i11, int i12) throws IOException;

    public abstract void w(int i11) throws IOException;

    abstract void x(int i11, Q q11, f0 f0Var) throws IOException;

    public abstract void y(Q q11) throws IOException;

    public abstract void z(int i11, Q q11) throws IOException;

    /* synthetic */ AbstractC5365k(int i11) {
        this();
    }
}
