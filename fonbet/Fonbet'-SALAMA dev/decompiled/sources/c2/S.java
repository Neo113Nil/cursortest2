package c2;

import C1.C0095a;
import android.media.MediaCodec;
import com.google.crypto.tink.shaded.protobuf.C0868d;
import java.nio.ByteBuffer;
import java.util.Arrays;
import u2.C1624a;
import w1.V0;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final u2.r f10252a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10253b;

    /* renamed from: c, reason: collision with root package name */
    public final C0095a f10254c;

    /* renamed from: d, reason: collision with root package name */
    public O1.c f10255d;

    /* renamed from: e, reason: collision with root package name */
    public O1.c f10256e;

    /* renamed from: f, reason: collision with root package name */
    public O1.c f10257f;

    /* renamed from: g, reason: collision with root package name */
    public long f10258g;

    public S(u2.r rVar) {
        this.f10252a = rVar;
        int i7 = rVar.f16817b;
        this.f10253b = i7;
        this.f10254c = new C0095a(32);
        O1.c cVar = new O1.c(0L, i7);
        this.f10255d = cVar;
        this.f10256e = cVar;
        this.f10257f = cVar;
    }

    public static O1.c d(O1.c cVar, long j, ByteBuffer byteBuffer, int i7) {
        while (j >= cVar.f4934b) {
            cVar = (O1.c) cVar.f4936d;
        }
        while (i7 > 0) {
            int min = Math.min(i7, (int) (cVar.f4934b - j));
            C1624a c1624a = (C1624a) cVar.f4935c;
            byteBuffer.put(c1624a.f16765a, ((int) (j - cVar.f4933a)) + c1624a.f16766b, min);
            i7 -= min;
            j += min;
            if (j == cVar.f4934b) {
                cVar = (O1.c) cVar.f4936d;
            }
        }
        return cVar;
    }

    public static O1.c e(O1.c cVar, long j, byte[] bArr, int i7) {
        while (j >= cVar.f4934b) {
            cVar = (O1.c) cVar.f4936d;
        }
        int i8 = i7;
        while (i8 > 0) {
            int min = Math.min(i8, (int) (cVar.f4934b - j));
            C1624a c1624a = (C1624a) cVar.f4935c;
            System.arraycopy(c1624a.f16765a, ((int) (j - cVar.f4933a)) + c1624a.f16766b, bArr, i7 - i8, min);
            i8 -= min;
            j += min;
            if (j == cVar.f4934b) {
                cVar = (O1.c) cVar.f4936d;
            }
        }
        return cVar;
    }

    public static O1.c f(O1.c cVar, D1.h hVar, C0868d c0868d, C0095a c0095a) {
        int i7;
        if (hVar.f(1073741824)) {
            long j = c0868d.f11762b;
            c0095a.A(1);
            O1.c e7 = e(cVar, j, (byte[]) c0095a.f1465c, 1);
            long j3 = j + 1;
            byte b7 = ((byte[]) c0095a.f1465c)[0];
            boolean z4 = (b7 & 128) != 0;
            int i8 = b7 & Byte.MAX_VALUE;
            D1.c cVar2 = hVar.f1696c;
            byte[] bArr = cVar2.f1676a;
            if (bArr == null) {
                cVar2.f1676a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            cVar = e(e7, j3, cVar2.f1676a, i8);
            long j7 = j3 + i8;
            if (z4) {
                c0095a.A(2);
                cVar = e(cVar, j7, (byte[]) c0095a.f1465c, 2);
                j7 += 2;
                i7 = c0095a.y();
            } else {
                i7 = 1;
            }
            int[] iArr = cVar2.f1679d;
            if (iArr == null || iArr.length < i7) {
                iArr = new int[i7];
            }
            int[] iArr2 = cVar2.f1680e;
            if (iArr2 == null || iArr2.length < i7) {
                iArr2 = new int[i7];
            }
            if (z4) {
                int i9 = i7 * 6;
                c0095a.A(i9);
                cVar = e(cVar, j7, (byte[]) c0095a.f1465c, i9);
                j7 += i9;
                c0095a.D(0);
                for (int i10 = 0; i10 < i7; i10++) {
                    iArr[i10] = c0095a.y();
                    iArr2[i10] = c0095a.w();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c0868d.f11761a - ((int) (j7 - c0868d.f11762b));
            }
            F1.u uVar = (F1.u) c0868d.f11763c;
            int i11 = v2.t.f17153a;
            byte[] bArr2 = uVar.f2573b;
            byte[] bArr3 = cVar2.f1676a;
            cVar2.f1681f = i7;
            cVar2.f1679d = iArr;
            cVar2.f1680e = iArr2;
            cVar2.f1677b = bArr2;
            cVar2.f1676a = bArr3;
            int i12 = uVar.f2572a;
            cVar2.f1678c = i12;
            int i13 = uVar.f2574c;
            cVar2.f1682g = i13;
            int i14 = uVar.f2575d;
            cVar2.f1683h = i14;
            MediaCodec.CryptoInfo cryptoInfo = cVar2.f1684i;
            cryptoInfo.numSubSamples = i7;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i12;
            if (v2.t.f17153a >= 24) {
                V0 v02 = cVar2.j;
                v02.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) v02.f17563c;
                pattern.set(i13, i14);
                ((MediaCodec.CryptoInfo) v02.f17562b).setPattern(pattern);
            }
            long j8 = c0868d.f11762b;
            int i15 = (int) (j7 - j8);
            c0868d.f11762b = j8 + i15;
            c0868d.f11761a -= i15;
        }
        if (!hVar.f(268435456)) {
            hVar.z(c0868d.f11761a);
            return d(cVar, c0868d.f11762b, hVar.f1697d, c0868d.f11761a);
        }
        c0095a.A(4);
        O1.c e8 = e(cVar, c0868d.f11762b, (byte[]) c0095a.f1465c, 4);
        int w7 = c0095a.w();
        c0868d.f11762b += 4;
        c0868d.f11761a -= 4;
        hVar.z(w7);
        O1.c d7 = d(e8, c0868d.f11762b, hVar.f1697d, w7);
        c0868d.f11762b += w7;
        int i16 = c0868d.f11761a - w7;
        c0868d.f11761a = i16;
        ByteBuffer byteBuffer = hVar.f1700x;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            hVar.f1700x = ByteBuffer.allocate(i16);
        } else {
            hVar.f1700x.clear();
        }
        return d(d7, c0868d.f11762b, hVar.f1700x, c0868d.f11761a);
    }

    public final void a(O1.c cVar) {
        if (((C1624a) cVar.f4935c) == null) {
            return;
        }
        u2.r rVar = this.f10252a;
        synchronized (rVar) {
            O1.c cVar2 = cVar;
            while (cVar2 != null) {
                try {
                    C1624a[] c1624aArr = rVar.f16821f;
                    int i7 = rVar.f16820e;
                    rVar.f16820e = i7 + 1;
                    C1624a c1624a = (C1624a) cVar2.f4935c;
                    c1624a.getClass();
                    c1624aArr[i7] = c1624a;
                    rVar.f16819d--;
                    cVar2 = (O1.c) cVar2.f4936d;
                    if (cVar2 == null || ((C1624a) cVar2.f4935c) == null) {
                        cVar2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.notifyAll();
        }
        cVar.f4935c = null;
        cVar.f4936d = null;
    }

    public final void b(long j) {
        O1.c cVar;
        if (j == -1) {
            return;
        }
        while (true) {
            cVar = this.f10255d;
            if (j < cVar.f4934b) {
                break;
            }
            u2.r rVar = this.f10252a;
            C1624a c1624a = (C1624a) cVar.f4935c;
            synchronized (rVar) {
                C1624a[] c1624aArr = rVar.f16821f;
                int i7 = rVar.f16820e;
                rVar.f16820e = i7 + 1;
                c1624aArr[i7] = c1624a;
                rVar.f16819d--;
                rVar.notifyAll();
            }
            O1.c cVar2 = this.f10255d;
            cVar2.f4935c = null;
            O1.c cVar3 = (O1.c) cVar2.f4936d;
            cVar2.f4936d = null;
            this.f10255d = cVar3;
        }
        if (this.f10256e.f4933a < cVar.f4933a) {
            this.f10256e = cVar;
        }
    }

    public final int c(int i7) {
        C1624a c1624a;
        O1.c cVar = this.f10257f;
        if (((C1624a) cVar.f4935c) == null) {
            u2.r rVar = this.f10252a;
            synchronized (rVar) {
                try {
                    int i8 = rVar.f16819d + 1;
                    rVar.f16819d = i8;
                    int i9 = rVar.f16820e;
                    if (i9 > 0) {
                        C1624a[] c1624aArr = rVar.f16821f;
                        int i10 = i9 - 1;
                        rVar.f16820e = i10;
                        c1624a = c1624aArr[i10];
                        c1624a.getClass();
                        rVar.f16821f[rVar.f16820e] = null;
                    } else {
                        C1624a c1624a2 = new C1624a(new byte[rVar.f16817b], 0);
                        C1624a[] c1624aArr2 = rVar.f16821f;
                        if (i8 > c1624aArr2.length) {
                            rVar.f16821f = (C1624a[]) Arrays.copyOf(c1624aArr2, c1624aArr2.length * 2);
                        }
                        c1624a = c1624a2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            O1.c cVar2 = new O1.c(this.f10257f.f4934b, this.f10253b);
            cVar.f4935c = c1624a;
            cVar.f4936d = cVar2;
        }
        return Math.min(i7, (int) (this.f10257f.f4934b - this.f10258g));
    }
}
