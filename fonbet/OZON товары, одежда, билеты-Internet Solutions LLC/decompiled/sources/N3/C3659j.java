package N3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p3.InterfaceC8846f;

/* renamed from: N3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3659j implements q {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8846f f18617b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18618c;

    /* renamed from: d, reason: collision with root package name */
    private long f18619d;

    /* renamed from: f, reason: collision with root package name */
    private int f18621f;

    /* renamed from: g, reason: collision with root package name */
    private int f18622g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f18620e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f18616a = new byte[4096];

    static {
        j3.r.a("media3.extractor");
    }

    public C3659j(InterfaceC8846f interfaceC8846f, long j11, long j12) {
        this.f18617b = interfaceC8846f;
        this.f18619d = j11;
        this.f18618c = j12;
    }

    private void j(int i11) {
        int i12 = this.f18621f + i11;
        byte[] bArr = this.f18620e;
        if (i12 > bArr.length) {
            this.f18620e = Arrays.copyOf(this.f18620e, m3.N.i(bArr.length * 2, 65536 + i12, i12 + 524288));
        }
    }

    private int l(byte[] bArr, int i11, int i12, int i13, boolean z11) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f18617b.read(bArr, i11 + i13, i12 - i13);
        if (read != -1) {
            return i13 + read;
        }
        if (i13 == 0 && z11) {
            return -1;
        }
        throw new EOFException();
    }

    private void n(int i11) {
        int i12 = this.f18622g - i11;
        this.f18622g = i12;
        this.f18621f = 0;
        byte[] bArr = this.f18620e;
        byte[] bArr2 = i12 < bArr.length - 524288 ? new byte[65536 + i12] : bArr;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        this.f18620e = bArr2;
    }

    @Override // N3.q
    public final void a(int i11, int i12, byte[] bArr) throws IOException {
        d(bArr, i11, i12, false);
    }

    @Override // N3.q
    public final boolean b(byte[] bArr, int i11, int i12, boolean z11) throws IOException {
        int min;
        int i13 = this.f18622g;
        if (i13 == 0) {
            min = 0;
        } else {
            min = Math.min(i13, i12);
            System.arraycopy(this.f18620e, 0, bArr, i11, min);
            n(min);
        }
        int i14 = min;
        while (i14 < i12 && i14 != -1) {
            i14 = l(bArr, i11, i12, i14, z11);
        }
        if (i14 != -1) {
            this.f18619d += i14;
        }
        return i14 != -1;
    }

    @Override // N3.q
    public final int c(int i11) throws IOException {
        C3659j c3659j;
        int min = Math.min(this.f18622g, i11);
        n(min);
        if (min == 0) {
            byte[] bArr = this.f18616a;
            c3659j = this;
            min = c3659j.l(bArr, 0, Math.min(i11, bArr.length), 0, true);
        } else {
            c3659j = this;
        }
        if (min != -1) {
            c3659j.f18619d += min;
        }
        return min;
    }

    @Override // N3.q
    public final boolean d(byte[] bArr, int i11, int i12, boolean z11) throws IOException {
        if (!i(i12, z11)) {
            return false;
        }
        System.arraycopy(this.f18620e, this.f18621f - i12, bArr, i11, i12);
        return true;
    }

    @Override // N3.q
    public final void e() {
        this.f18621f = 0;
    }

    @Override // N3.q
    public final long f() {
        return this.f18619d + this.f18621f;
    }

    @Override // N3.q
    public final void g(int i11) throws IOException {
        i(i11, false);
    }

    @Override // N3.q
    public final long getLength() {
        return this.f18618c;
    }

    @Override // N3.q
    public final long getPosition() {
        return this.f18619d;
    }

    @Override // N3.q
    public final void h(int i11) throws IOException {
        m(i11, false);
    }

    public final boolean i(int i11, boolean z11) throws IOException {
        j(i11);
        int i12 = this.f18622g - this.f18621f;
        while (i12 < i11) {
            int i13 = i11;
            boolean z12 = z11;
            i12 = l(this.f18620e, this.f18621f, i13, i12, z12);
            if (i12 == -1) {
                return false;
            }
            this.f18622g = this.f18621f + i12;
            i11 = i13;
            z11 = z12;
        }
        this.f18621f += i11;
        return true;
    }

    public final int k(int i11, int i12, byte[] bArr) throws IOException {
        C3659j c3659j;
        int min;
        j(i12);
        int i13 = this.f18622g;
        int i14 = this.f18621f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            c3659j = this;
            min = c3659j.l(this.f18620e, i14, i12, 0, true);
            if (min == -1) {
                return -1;
            }
            c3659j.f18622g += min;
        } else {
            c3659j = this;
            min = Math.min(i12, i15);
        }
        System.arraycopy(c3659j.f18620e, c3659j.f18621f, bArr, i11, min);
        c3659j.f18621f += min;
        return min;
    }

    public final boolean m(int i11, boolean z11) throws IOException {
        int min = Math.min(this.f18622g, i11);
        n(min);
        int i12 = min;
        while (i12 < i11 && i12 != -1) {
            byte[] bArr = this.f18616a;
            i12 = l(bArr, -i12, Math.min(i11, bArr.length + i12), i12, z11);
        }
        if (i12 != -1) {
            this.f18619d += i12;
        }
        return i12 != -1;
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        C3659j c3659j;
        int i13 = this.f18622g;
        int i14 = 0;
        if (i13 != 0) {
            int min = Math.min(i13, i12);
            System.arraycopy(this.f18620e, 0, bArr, i11, min);
            n(min);
            i14 = min;
        }
        if (i14 == 0) {
            c3659j = this;
            i14 = c3659j.l(bArr, i11, i12, 0, true);
        } else {
            c3659j = this;
        }
        if (i14 != -1) {
            c3659j.f18619d += i14;
        }
        return i14;
    }

    @Override // N3.q
    public final void readFully(byte[] bArr, int i11, int i12) throws IOException {
        b(bArr, i11, i12, false);
    }
}
