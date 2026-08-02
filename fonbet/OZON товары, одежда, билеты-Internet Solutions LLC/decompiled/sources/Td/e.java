package Td;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f27061a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27062b;

    /* renamed from: c, reason: collision with root package name */
    private int f27063c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final OutputStream f27064d;

    public static class a extends IOException {
    }

    private e(OutputStream outputStream, byte[] bArr) {
        this.f27064d = outputStream;
        this.f27061a = bArr;
        this.f27062b = bArr.length;
    }

    public static int a(int i11, int i12) {
        return c(i12) + h(i11);
    }

    public static int b(int i11, int i12) {
        return c(i12) + h(i11);
    }

    public static int c(int i11) {
        if (i11 >= 0) {
            return f(i11);
        }
        return 10;
    }

    public static int d(int i11, p pVar) {
        return e(pVar) + h(i11);
    }

    public static int e(p pVar) {
        int serializedSize = pVar.getSerializedSize();
        return f(serializedSize) + serializedSize;
    }

    public static int f(int i11) {
        if ((i11 & (-128)) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g(long j11) {
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (((-16384) & j11) == 0) {
            return 2;
        }
        if (((-2097152) & j11) == 0) {
            return 3;
        }
        if (((-268435456) & j11) == 0) {
            return 4;
        }
        if (((-34359738368L) & j11) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j11) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j11) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j11) == 0) {
            return 8;
        }
        return (j11 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int h(int i11) {
        return f(i11 << 3);
    }

    public static e j(OutputStream outputStream, int i11) {
        return new e(outputStream, new byte[i11]);
    }

    private void k() throws IOException {
        OutputStream outputStream = this.f27064d;
        if (outputStream == null) {
            throw new a("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write(this.f27061a, 0, this.f27063c);
        this.f27063c = 0;
    }

    public final void i() throws IOException {
        if (this.f27064d != null) {
            k();
        }
    }

    public final void l(int i11, int i12) throws IOException {
        x(i11, 0);
        n(i12);
    }

    public final void m(int i11, int i12) throws IOException {
        x(i11, 0);
        n(i12);
    }

    public final void n(int i11) throws IOException {
        if (i11 >= 0) {
            v(i11);
        } else {
            w(i11);
        }
    }

    public final void o(int i11, p pVar) throws IOException {
        x(i11, 2);
        p(pVar);
    }

    public final void p(p pVar) throws IOException {
        v(pVar.getSerializedSize());
        pVar.a(this);
    }

    public final void q(int i11) throws IOException {
        byte b11 = (byte) i11;
        if (this.f27063c == this.f27062b) {
            k();
        }
        int i12 = this.f27063c;
        this.f27063c = i12 + 1;
        this.f27061a[i12] = b11;
    }

    public final void r(c cVar) throws IOException {
        int size = cVar.size();
        int i11 = this.f27063c;
        int i12 = this.f27062b;
        int i13 = i12 - i11;
        byte[] bArr = this.f27061a;
        if (i13 >= size) {
            cVar.f(bArr, 0, i11, size);
            this.f27063c += size;
            return;
        }
        cVar.f(bArr, 0, i11, i13);
        int i14 = size - i13;
        this.f27063c = i12;
        k();
        if (i14 <= i12) {
            cVar.f(bArr, i13, 0, i14);
            this.f27063c = i14;
            return;
        }
        if (i13 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i13);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i14 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i14);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i15 = i13 + i14;
        if (i15 <= cVar.size()) {
            if (i14 > 0) {
                cVar.t(this.f27064d, i13, i14);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i15);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public final void s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i11 = this.f27063c;
        int i12 = this.f27062b;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f27061a;
        if (i13 >= length) {
            System.arraycopy(bArr, 0, bArr2, i11, length);
            this.f27063c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i11, i13);
        int i14 = length - i13;
        this.f27063c = i12;
        k();
        if (i14 > i12) {
            this.f27064d.write(bArr, i13, i14);
        } else {
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            this.f27063c = i14;
        }
    }

    public final void t(int i11) throws IOException {
        q(i11 & 255);
        q((i11 >> 8) & 255);
        q((i11 >> 16) & 255);
        q((i11 >> 24) & 255);
    }

    public final void u(long j11) throws IOException {
        q(((int) j11) & 255);
        q(((int) (j11 >> 8)) & 255);
        q(((int) (j11 >> 16)) & 255);
        q(((int) (j11 >> 24)) & 255);
        q(((int) (j11 >> 32)) & 255);
        q(((int) (j11 >> 40)) & 255);
        q(((int) (j11 >> 48)) & 255);
        q(((int) (j11 >> 56)) & 255);
    }

    public final void v(int i11) throws IOException {
        while ((i11 & (-128)) != 0) {
            q((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i11 >>>= 7;
        }
        q(i11);
    }

    public final void w(long j11) throws IOException {
        while (((-128) & j11) != 0) {
            q((((int) j11) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j11 >>>= 7;
        }
        q((int) j11);
    }

    public final void x(int i11, int i12) throws IOException {
        v((i11 << 3) | i12);
    }
}
