package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class KG {

    /* renamed from: a, reason: collision with root package name */
    public final C1617tm f10146a = new C1617tm(32);

    /* renamed from: b, reason: collision with root package name */
    public B.N f10147b;

    /* renamed from: c, reason: collision with root package name */
    public B.N f10148c;

    /* renamed from: d, reason: collision with root package name */
    public B.N f10149d;

    /* renamed from: e, reason: collision with root package name */
    public long f10150e;
    public final C1425pH f;

    public KG(C1425pH c1425pH) {
        this.f = c1425pH;
        B.N n5 = new B.N(0L);
        this.f10147b = n5;
        this.f10148c = n5;
        this.f10149d = n5;
    }

    public static B.N c(B.N n5, long j5, ByteBuffer byteBuffer, int i) {
        while (j5 >= n5.f654l) {
            n5 = (B.N) n5.f656n;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (n5.f654l - j5));
            C1290mH c1290mH = (C1290mH) n5.f655m;
            byte[] bArr = c1290mH.f14494a;
            long j6 = j5 - n5.f653k;
            c1290mH.getClass();
            byteBuffer.put(bArr, (int) j6, min);
            i -= min;
            j5 += min;
            if (j5 == n5.f654l) {
                n5 = (B.N) n5.f656n;
            }
        }
        return n5;
    }

    public static B.N d(B.N n5, long j5, byte[] bArr, int i) {
        while (j5 >= n5.f654l) {
            n5 = (B.N) n5.f656n;
        }
        int i5 = i;
        while (i5 > 0) {
            int min = Math.min(i5, (int) (n5.f654l - j5));
            C1290mH c1290mH = (C1290mH) n5.f655m;
            byte[] bArr2 = c1290mH.f14494a;
            long j6 = j5 - n5.f653k;
            c1290mH.getClass();
            System.arraycopy(bArr2, (int) j6, bArr, i - i5, min);
            i5 -= min;
            j5 += min;
            if (j5 == n5.f654l) {
                n5 = (B.N) n5.f656n;
            }
        }
        return n5;
    }

    public static B.N e(B.N n5, OD od, Q1 q12, C1617tm c1617tm) {
        int i;
        if (od.a(1073741824)) {
            long j5 = q12.f11147m;
            c1617tm.g(1);
            B.N d5 = d(n5, j5, c1617tm.f15724a, 1);
            long j6 = j5 + 1;
            byte b3 = c1617tm.f15724a[0];
            int i5 = b3 & 128;
            int i6 = b3 & Byte.MAX_VALUE;
            C1645uD c1645uD = od.f10937d;
            byte[] bArr = c1645uD.f15808a;
            if (bArr == null) {
                c1645uD.f15808a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z3 = i5 != 0;
            n5 = d(d5, j6, c1645uD.f15808a, i6);
            long j7 = j6 + i6;
            if (z3) {
                c1617tm.g(2);
                n5 = d(n5, j7, c1617tm.f15724a, 2);
                j7 += 2;
                i = c1617tm.z();
            } else {
                i = 1;
            }
            int[] iArr = c1645uD.f15811d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = c1645uD.f15812e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z3) {
                int i7 = i * 6;
                c1617tm.g(i7);
                n5 = d(n5, j7, c1617tm.f15724a, i7);
                j7 += i7;
                c1617tm.j(0);
                for (int i8 = 0; i8 < i; i8++) {
                    iArr[i8] = c1617tm.z();
                    iArr2[i8] = c1617tm.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = q12.f11146l - ((int) (j7 - q12.f11147m));
            }
            Z z5 = (Z) q12.f11148n;
            int i9 = AbstractC1260lo.f14419a;
            byte[] bArr2 = z5.f12384b;
            byte[] bArr3 = c1645uD.f15808a;
            c1645uD.f = i;
            c1645uD.f15811d = iArr;
            c1645uD.f15812e = iArr2;
            c1645uD.f15809b = bArr2;
            c1645uD.f15808a = bArr3;
            int i10 = z5.f12383a;
            c1645uD.f15810c = i10;
            int i11 = z5.f12385c;
            c1645uD.f15813g = i11;
            int i12 = z5.f12386d;
            c1645uD.f15814h = i12;
            MediaCodec.CryptoInfo cryptoInfo = c1645uD.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i10;
            if (AbstractC1260lo.f14419a >= 24) {
                C1667ur c1667ur = c1645uD.f15815j;
                c1667ur.getClass();
                ((MediaCodec.CryptoInfo.Pattern) c1667ur.f15915m).set(i11, i12);
                ((MediaCodec.CryptoInfo) c1667ur.f15914l).setPattern((MediaCodec.CryptoInfo.Pattern) c1667ur.f15915m);
            }
            long j8 = q12.f11147m;
            int i13 = (int) (j7 - j8);
            q12.f11147m = j8 + i13;
            q12.f11146l -= i13;
        }
        if (!od.a(268435456)) {
            od.e(q12.f11146l);
            return c(n5, q12.f11147m, od.f10938e, q12.f11146l);
        }
        c1617tm.g(4);
        B.N d6 = d(n5, q12.f11147m, c1617tm.f15724a, 4);
        int y5 = c1617tm.y();
        q12.f11147m += 4;
        q12.f11146l -= 4;
        od.e(y5);
        B.N c5 = c(d6, q12.f11147m, od.f10938e, y5);
        q12.f11147m += y5;
        int i14 = q12.f11146l - y5;
        q12.f11146l = i14;
        ByteBuffer byteBuffer = od.f10940h;
        if (byteBuffer == null || byteBuffer.capacity() < i14) {
            od.f10940h = ByteBuffer.allocate(i14);
        } else {
            od.f10940h.clear();
        }
        return c(c5, q12.f11147m, od.f10940h, q12.f11146l);
    }

    public final void a(long j5) {
        B.N n5;
        if (j5 != -1) {
            while (true) {
                n5 = this.f10147b;
                if (j5 < n5.f654l) {
                    break;
                }
                C1425pH c1425pH = this.f;
                C1290mH c1290mH = (C1290mH) n5.f655m;
                synchronized (c1425pH) {
                    C1290mH[] c1290mHArr = c1425pH.f14991d;
                    int i = c1425pH.f14990c;
                    c1425pH.f14990c = i + 1;
                    c1290mHArr[i] = c1290mH;
                    c1425pH.f14989b--;
                    c1425pH.notifyAll();
                }
                B.N n6 = this.f10147b;
                n6.f655m = null;
                B.N n7 = (B.N) n6.f656n;
                n6.f656n = null;
                this.f10147b = n7;
            }
            if (this.f10148c.f653k < n5.f653k) {
                this.f10148c = n5;
            }
        }
    }

    public final int b(int i) {
        C1290mH c1290mH;
        B.N n5 = this.f10149d;
        if (((C1290mH) n5.f655m) == null) {
            C1425pH c1425pH = this.f;
            synchronized (c1425pH) {
                try {
                    int i5 = c1425pH.f14989b + 1;
                    c1425pH.f14989b = i5;
                    int i6 = c1425pH.f14990c;
                    if (i6 > 0) {
                        C1290mH[] c1290mHArr = c1425pH.f14991d;
                        int i7 = i6 - 1;
                        c1425pH.f14990c = i7;
                        c1290mH = c1290mHArr[i7];
                        if (c1290mH == null) {
                            throw null;
                        }
                        c1290mHArr[i7] = null;
                    } else {
                        c1290mH = new C1290mH(new byte[65536]);
                        C1290mH[] c1290mHArr2 = c1425pH.f14991d;
                        int length = c1290mHArr2.length;
                        if (i5 > length) {
                            c1425pH.f14991d = (C1290mH[]) Arrays.copyOf(c1290mHArr2, length + length);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            B.N n6 = new B.N(this.f10149d.f654l);
            n5.f655m = c1290mH;
            n5.f656n = n6;
        }
        return Math.min(i, (int) (this.f10149d.f654l - this.f10150e));
    }
}
