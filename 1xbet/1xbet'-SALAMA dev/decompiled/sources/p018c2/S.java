package p018c2;

import C1.C0095a;
import D1.h;
import F1.u;
import O1.c;
import android.media.MediaCodec;
import com.google.crypto.tink.shaded.protobuf.C0824d;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p146u2.C0942a;
import p146u2.r;
import p151v2.t;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f10252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0095a f10254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f10255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f10256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f10257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10258g;

    public S(r rVar) {
        this.f10252a = rVar;
        int i7 = rVar.f16823b;
        this.f10253b = i7;
        this.f10254c = new C0095a(32);
        c cVar = new c(0L, i7);
        this.f10255d = cVar;
        this.f10256e = cVar;
        this.f10257f = cVar;
    }

    public static c d(c cVar, long j, ByteBuffer byteBuffer, int i7) {
        while (j >= cVar.f4934b) {
            cVar = (c) cVar.f4936d;
        }
        while (i7 > 0) {
            int iMin = Math.min(i7, (int) (cVar.f4934b - j));
            C0942a c0942a = (C0942a) cVar.f4935c;
            byteBuffer.put(c0942a.f16771a, ((int) (j - cVar.f4933a)) + c0942a.f16772b, iMin);
            i7 -= iMin;
            j += (long) iMin;
            if (j == cVar.f4934b) {
                cVar = (c) cVar.f4936d;
            }
        }
        return cVar;
    }

    public static c e(c cVar, long j, byte[] bArr, int i7) {
        while (j >= cVar.f4934b) {
            cVar = (c) cVar.f4936d;
        }
        int i8 = i7;
        while (i8 > 0) {
            int iMin = Math.min(i8, (int) (cVar.f4934b - j));
            C0942a c0942a = (C0942a) cVar.f4935c;
            System.arraycopy(c0942a.f16771a, ((int) (j - cVar.f4933a)) + c0942a.f16772b, bArr, i7 - i8, iMin);
            i8 -= iMin;
            j += (long) iMin;
            if (j == cVar.f4934b) {
                cVar = (c) cVar.f4936d;
            }
        }
        return cVar;
    }

    public static c f(c cVar, h hVar, C0824d c0824d, C0095a c0095a) {
        int iY;
        if (hVar.f(1073741824)) {
            long j = c0824d.f11762b;
            c0095a.A(1);
            c cVarE = e(cVar, j, (byte[]) c0095a.f1465c, 1);
            long j3 = j + 1;
            byte b7 = ((byte[]) c0095a.f1465c)[0];
            boolean z4 = (b7 & 128) != 0;
            int i7 = b7 & 127;
            D1.c cVar2 = hVar.f1696c;
            byte[] bArr = cVar2.f1676a;
            if (bArr == null) {
                cVar2.f1676a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            cVar = e(cVarE, j3, cVar2.f1676a, i7);
            long j7 = j3 + ((long) i7);
            if (z4) {
                c0095a.A(2);
                cVar = e(cVar, j7, (byte[]) c0095a.f1465c, 2);
                j7 += 2;
                iY = c0095a.y();
            } else {
                iY = 1;
            }
            int[] iArr = cVar2.f1679d;
            if (iArr == null || iArr.length < iY) {
                iArr = new int[iY];
            }
            int[] iArr2 = cVar2.f1680e;
            if (iArr2 == null || iArr2.length < iY) {
                iArr2 = new int[iY];
            }
            if (z4) {
                int i8 = iY * 6;
                c0095a.A(i8);
                cVar = e(cVar, j7, (byte[]) c0095a.f1465c, i8);
                j7 += (long) i8;
                c0095a.D(0);
                for (int i9 = 0; i9 < iY; i9++) {
                    iArr[i9] = c0095a.y();
                    iArr2[i9] = c0095a.w();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c0824d.f11761a - ((int) (j7 - c0824d.f11762b));
            }
            u uVar = (u) c0824d.f11763c;
            int i10 = t.f17159a;
            byte[] bArr2 = uVar.f2573b;
            byte[] bArr3 = cVar2.f1676a;
            cVar2.f1681f = iY;
            cVar2.f1679d = iArr;
            cVar2.f1680e = iArr2;
            cVar2.f1677b = bArr2;
            cVar2.f1676a = bArr3;
            int i11 = uVar.f2572a;
            cVar2.f1678c = i11;
            int i12 = uVar.f2574c;
            cVar2.f1682g = i12;
            int i13 = uVar.f2575d;
            cVar2.f1683h = i13;
            MediaCodec.CryptoInfo cryptoInfo = cVar2.f1684i;
            cryptoInfo.numSubSamples = iY;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i11;
            if (t.f17159a >= 24) {
                V0 v6 = cVar2.j;
                v6.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) v6.f17569c;
                pattern.set(i12, i13);
                ((MediaCodec.CryptoInfo) v6.f17568b).setPattern(pattern);
            }
            long j8 = c0824d.f11762b;
            int i14 = (int) (j7 - j8);
            c0824d.f11762b = j8 + ((long) i14);
            c0824d.f11761a -= i14;
        }
        if (!hVar.f(268435456)) {
            hVar.z(c0824d.f11761a);
            return d(cVar, c0824d.f11762b, hVar.f1697d, c0824d.f11761a);
        }
        c0095a.A(4);
        c cVarE2 = e(cVar, c0824d.f11762b, (byte[]) c0095a.f1465c, 4);
        int iW = c0095a.w();
        c0824d.f11762b += 4;
        c0824d.f11761a -= 4;
        hVar.z(iW);
        c cVarD = d(cVarE2, c0824d.f11762b, hVar.f1697d, iW);
        c0824d.f11762b += (long) iW;
        int i15 = c0824d.f11761a - iW;
        c0824d.f11761a = i15;
        ByteBuffer byteBuffer = hVar.f1700x;
        if (byteBuffer == null || byteBuffer.capacity() < i15) {
            hVar.f1700x = ByteBuffer.allocate(i15);
        } else {
            hVar.f1700x.clear();
        }
        return d(cVarD, c0824d.f11762b, hVar.f1700x, c0824d.f11761a);
    }

    public final void a(c cVar) {
        if (((C0942a) cVar.f4935c) == null) {
            return;
        }
        r rVar = this.f10252a;
        synchronized (rVar) {
            c cVar2 = cVar;
            while (cVar2 != null) {
                try {
                    C0942a[] c0942aArr = rVar.f16827f;
                    int i7 = rVar.f16826e;
                    rVar.f16826e = i7 + 1;
                    C0942a c0942a = (C0942a) cVar2.f4935c;
                    c0942a.getClass();
                    c0942aArr[i7] = c0942a;
                    rVar.f16825d--;
                    cVar2 = (c) cVar2.f4936d;
                    if (cVar2 == null || ((C0942a) cVar2.f4935c) == null) {
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
        c cVar;
        if (j == -1) {
            return;
        }
        while (true) {
            cVar = this.f10255d;
            if (j < cVar.f4934b) {
                break;
            }
            r rVar = this.f10252a;
            C0942a c0942a = (C0942a) cVar.f4935c;
            synchronized (rVar) {
                C0942a[] c0942aArr = rVar.f16827f;
                int i7 = rVar.f16826e;
                rVar.f16826e = i7 + 1;
                c0942aArr[i7] = c0942a;
                rVar.f16825d--;
                rVar.notifyAll();
            }
            c cVar2 = this.f10255d;
            cVar2.f4935c = null;
            c cVar3 = (c) cVar2.f4936d;
            cVar2.f4936d = null;
            this.f10255d = cVar3;
        }
        if (this.f10256e.f4933a < cVar.f4933a) {
            this.f10256e = cVar;
        }
    }

    public final int c(int i7) {
        C0942a c0942a;
        c cVar = this.f10257f;
        if (((C0942a) cVar.f4935c) == null) {
            r rVar = this.f10252a;
            synchronized (rVar) {
                try {
                    int i8 = rVar.f16825d + 1;
                    rVar.f16825d = i8;
                    int i9 = rVar.f16826e;
                    if (i9 > 0) {
                        C0942a[] c0942aArr = rVar.f16827f;
                        int i10 = i9 - 1;
                        rVar.f16826e = i10;
                        c0942a = c0942aArr[i10];
                        c0942a.getClass();
                        rVar.f16827f[rVar.f16826e] = null;
                    } else {
                        C0942a c0942a2 = new C0942a(new byte[rVar.f16823b], 0);
                        C0942a[] c0942aArr2 = rVar.f16827f;
                        if (i8 > c0942aArr2.length) {
                            rVar.f16827f = (C0942a[]) Arrays.copyOf(c0942aArr2, c0942aArr2.length * 2);
                        }
                        c0942a = c0942a2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c cVar2 = new c(this.f10257f.f4934b, this.f10253b);
            cVar.f4935c = c0942a;
            cVar.f4936d = cVar2;
        }
        return Math.min(i7, (int) (this.f10257f.f4934b - this.f10258g));
    }
}
