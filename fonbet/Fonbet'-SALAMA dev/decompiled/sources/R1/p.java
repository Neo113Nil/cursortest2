package R1;

import A1.AbstractC0023i;
import A1.AbstractC0029l;
import A1.X;
import C1.AbstractC0096b;
import K4.C0321h;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import c2.W;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import v2.AbstractC1664a;
import w1.C1719l1;
import w1.V0;

/* loaded from: classes.dex */
public abstract class p extends AbstractC0023i {

    /* renamed from: U0, reason: collision with root package name */
    public static final byte[] f5937U0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0, reason: collision with root package name */
    public boolean f5938A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f5939B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f5940C0;

    /* renamed from: D, reason: collision with root package name */
    public final j f5941D;

    /* renamed from: D0, reason: collision with root package name */
    public int f5942D0;

    /* renamed from: E, reason: collision with root package name */
    public final q f5943E;

    /* renamed from: E0, reason: collision with root package name */
    public int f5944E0;

    /* renamed from: F, reason: collision with root package name */
    public final float f5945F;

    /* renamed from: F0, reason: collision with root package name */
    public int f5946F0;

    /* renamed from: G, reason: collision with root package name */
    public final D1.h f5947G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f5948G0;

    /* renamed from: H, reason: collision with root package name */
    public final D1.h f5949H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f5950H0;

    /* renamed from: I, reason: collision with root package name */
    public final D1.h f5951I;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f5952I0;

    /* renamed from: J, reason: collision with root package name */
    public final g f5953J;

    /* renamed from: J0, reason: collision with root package name */
    public long f5954J0;

    /* renamed from: K, reason: collision with root package name */
    public final C0321h f5955K;

    /* renamed from: K0, reason: collision with root package name */
    public long f5956K0;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList f5957L;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f5958L0;

    /* renamed from: M, reason: collision with root package name */
    public final MediaCodec.BufferInfo f5959M;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f5960M0;

    /* renamed from: N, reason: collision with root package name */
    public final long[] f5961N;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f5962N0;

    /* renamed from: O, reason: collision with root package name */
    public final long[] f5963O;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f5964O0;

    /* renamed from: P, reason: collision with root package name */
    public final long[] f5965P;

    /* renamed from: P0, reason: collision with root package name */
    public A1.r f5966P0;

    /* renamed from: Q, reason: collision with root package name */
    public X f5967Q;

    /* renamed from: Q0, reason: collision with root package name */
    public D1.e f5968Q0;

    /* renamed from: R, reason: collision with root package name */
    public X f5969R;

    /* renamed from: R0, reason: collision with root package name */
    public long f5970R0;

    /* renamed from: S, reason: collision with root package name */
    public C1719l1 f5971S;

    /* renamed from: S0, reason: collision with root package name */
    public long f5972S0;

    /* renamed from: T, reason: collision with root package name */
    public C1719l1 f5973T;

    /* renamed from: T0, reason: collision with root package name */
    public int f5974T0;

    /* renamed from: U, reason: collision with root package name */
    public MediaCrypto f5975U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f5976V;

    /* renamed from: W, reason: collision with root package name */
    public final long f5977W;

    /* renamed from: X, reason: collision with root package name */
    public float f5978X;

    /* renamed from: Y, reason: collision with root package name */
    public float f5979Y;

    /* renamed from: Z, reason: collision with root package name */
    public k f5980Z;

    /* renamed from: a0, reason: collision with root package name */
    public X f5981a0;

    /* renamed from: b0, reason: collision with root package name */
    public MediaFormat f5982b0;
    public boolean c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f5983d0;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayDeque f5984e0;

    /* renamed from: f0, reason: collision with root package name */
    public o f5985f0;

    /* renamed from: g0, reason: collision with root package name */
    public m f5986g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f5987h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f5988i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f5989j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f5990k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f5991l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f5992m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f5993n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f5994o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f5995p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f5996q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f5997r0;

    /* renamed from: s0, reason: collision with root package name */
    public h f5998s0;

    /* renamed from: t0, reason: collision with root package name */
    public long f5999t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f6000u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f6001v0;

    /* renamed from: w0, reason: collision with root package name */
    public ByteBuffer f6002w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f6003x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f6004y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f6005z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i7, j jVar, float f7) {
        super(i7);
        q qVar = q.f6006b;
        this.f5941D = jVar;
        this.f5943E = qVar;
        this.f5945F = f7;
        this.f5947G = new D1.h(0);
        this.f5949H = new D1.h(0);
        this.f5951I = new D1.h(2);
        g gVar = new g(2);
        gVar.f5914B = 32;
        this.f5953J = gVar;
        C0321h c0321h = new C0321h();
        c0321h.f4018d = new long[10];
        c0321h.f4019e = new Object[10];
        this.f5955K = c0321h;
        this.f5957L = new ArrayList();
        this.f5959M = new MediaCodec.BufferInfo();
        this.f5978X = 1.0f;
        this.f5979Y = 1.0f;
        this.f5977W = -9223372036854775807L;
        this.f5961N = new long[10];
        this.f5963O = new long[10];
        this.f5965P = new long[10];
        this.f5970R0 = -9223372036854775807L;
        this.f5972S0 = -9223372036854775807L;
        gVar.z(0);
        gVar.f1697d.order(ByteOrder.nativeOrder());
        this.f5983d0 = -1.0f;
        this.f5987h0 = 0;
        this.f5942D0 = 0;
        this.f6000u0 = -1;
        this.f6001v0 = -1;
        this.f5999t0 = -9223372036854775807L;
        this.f5954J0 = -9223372036854775807L;
        this.f5956K0 = -9223372036854775807L;
        this.f5944E0 = 0;
        this.f5946F0 = 0;
    }

    @Override // A1.AbstractC0023i
    public final int A() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final boolean B(long j, long j3) {
        boolean z4;
        g gVar;
        AbstractC1664a.h(!this.f5960M0);
        g gVar2 = this.f5953J;
        int i7 = gVar2.f5913A;
        if (!(i7 > 0)) {
            z4 = 0;
            gVar = gVar2;
        } else {
            if (!d0(j, j3, null, gVar2.f1697d, this.f6001v0, 0, i7, gVar2.f1699f, gVar2.f(Integer.MIN_VALUE), gVar2.f(4), this.f5969R)) {
                return false;
            }
            gVar = gVar2;
            Z(gVar.f5915z);
            gVar.t();
            z4 = 0;
        }
        if (this.f5958L0) {
            this.f5960M0 = true;
            return z4;
        }
        boolean z7 = this.f5938A0;
        D1.h hVar = this.f5951I;
        if (z7) {
            AbstractC1664a.h(gVar.B(hVar));
            this.f5938A0 = z4;
        }
        if (this.f5939B0) {
            if (gVar.f5913A > 0) {
                return true;
            }
            E();
            this.f5939B0 = z4;
            S();
            if (!this.f6005z0) {
                return z4;
            }
        }
        AbstractC1664a.h(!this.f5958L0);
        V0 v02 = this.f376b;
        v02.k();
        hVar.t();
        while (true) {
            hVar.t();
            int u4 = u(v02, hVar, z4);
            if (u4 == -5) {
                X(v02);
                break;
            }
            if (u4 != -4) {
                if (u4 != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (hVar.f(4)) {
                    this.f5958L0 = true;
                    break;
                }
                if (this.f5962N0) {
                    X x4 = this.f5967Q;
                    x4.getClass();
                    this.f5969R = x4;
                    Y(x4, null);
                    this.f5962N0 = z4;
                }
                hVar.A();
                if (!gVar.B(hVar)) {
                    this.f5938A0 = true;
                    break;
                }
            }
        }
        if (gVar.f5913A > 0) {
            gVar.A();
        }
        if (gVar.f5913A > 0 || this.f5958L0 || this.f5939B0) {
            return true;
        }
        return z4;
    }

    public abstract D1.i C(m mVar, X x4, X x7);

    public l D(IllegalStateException illegalStateException, m mVar) {
        return new l(illegalStateException, mVar);
    }

    public final void E() {
        this.f5939B0 = false;
        this.f5953J.t();
        this.f5951I.t();
        this.f5938A0 = false;
        this.f6005z0 = false;
    }

    public final boolean F() {
        if (this.f5948G0) {
            this.f5944E0 = 1;
            if (this.f5989j0 || this.f5991l0) {
                this.f5946F0 = 3;
                return false;
            }
            this.f5946F0 = 2;
        } else {
            o0();
        }
        return true;
    }

    public final boolean G(long j, long j3) {
        boolean z4;
        boolean z7;
        MediaCodec.BufferInfo bufferInfo;
        boolean d02;
        int s7;
        boolean z8;
        boolean z9 = this.f6001v0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f5959M;
        if (!z9) {
            if (this.f5992m0 && this.f5950H0) {
                try {
                    s7 = this.f5980Z.s(bufferInfo2);
                } catch (IllegalStateException unused) {
                    c0();
                    if (this.f5960M0) {
                        f0();
                    }
                    return false;
                }
            } else {
                s7 = this.f5980Z.s(bufferInfo2);
            }
            if (s7 < 0) {
                if (s7 != -2) {
                    if (this.f5997r0 && (this.f5958L0 || this.f5944E0 == 2)) {
                        c0();
                    }
                    return false;
                }
                this.f5952I0 = true;
                MediaFormat k7 = this.f5980Z.k();
                if (this.f5987h0 != 0 && k7.getInteger("width") == 32 && k7.getInteger("height") == 32) {
                    this.f5996q0 = true;
                } else {
                    if (this.f5994o0) {
                        k7.setInteger("channel-count", 1);
                    }
                    this.f5982b0 = k7;
                    this.c0 = true;
                }
                return true;
            }
            if (this.f5996q0) {
                this.f5996q0 = false;
                this.f5980Z.w(s7, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                c0();
                return false;
            }
            this.f6001v0 = s7;
            ByteBuffer I7 = this.f5980Z.I(s7);
            this.f6002w0 = I7;
            if (I7 != null) {
                I7.position(bufferInfo2.offset);
                this.f6002w0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f5993n0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j7 = this.f5954J0;
                if (j7 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j7;
                }
            }
            long j8 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.f5957L;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z8 = false;
                    break;
                }
                if (((Long) arrayList.get(i7)).longValue() == j8) {
                    arrayList.remove(i7);
                    z8 = true;
                    break;
                }
                i7++;
            }
            this.f6003x0 = z8;
            long j9 = this.f5956K0;
            long j10 = bufferInfo2.presentationTimeUs;
            this.f6004y0 = j9 == j10;
            p0(j10);
        }
        if (this.f5992m0 && this.f5950H0) {
            try {
                z4 = true;
                z7 = false;
            } catch (IllegalStateException unused2) {
                z7 = false;
            }
            try {
                d02 = d0(j, j3, this.f5980Z, this.f6002w0, this.f6001v0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f6003x0, this.f6004y0, this.f5969R);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                c0();
                if (this.f5960M0) {
                    f0();
                }
                return z7;
            }
        } else {
            z4 = true;
            z7 = false;
            bufferInfo = bufferInfo2;
            d02 = d0(j, j3, this.f5980Z, this.f6002w0, this.f6001v0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f6003x0, this.f6004y0, this.f5969R);
        }
        if (d02) {
            Z(bufferInfo.presentationTimeUs);
            boolean z10 = (bufferInfo.flags & 4) != 0 ? z4 : z7;
            this.f6001v0 = -1;
            this.f6002w0 = null;
            if (!z10) {
                return z4;
            }
            c0();
        }
        return z7;
    }

    public final boolean H() {
        boolean z4;
        k kVar = this.f5980Z;
        if (kVar == null || this.f5944E0 == 2 || this.f5958L0) {
            return false;
        }
        if (this.f6000u0 < 0) {
            int o7 = kVar.o();
            this.f6000u0 = o7;
            if (o7 < 0) {
                return false;
            }
            this.f5949H.f1697d = this.f5980Z.C(o7);
            this.f5949H.t();
        }
        if (this.f5944E0 == 1) {
            if (!this.f5997r0) {
                this.f5950H0 = true;
                this.f5980Z.P(this.f6000u0, 0, 0L, 4);
                this.f6000u0 = -1;
                this.f5949H.f1697d = null;
            }
            this.f5944E0 = 2;
            return false;
        }
        if (this.f5995p0) {
            this.f5995p0 = false;
            this.f5949H.f1697d.put(f5937U0);
            this.f5980Z.P(this.f6000u0, 38, 0L, 0);
            this.f6000u0 = -1;
            this.f5949H.f1697d = null;
            this.f5948G0 = true;
            return true;
        }
        if (this.f5942D0 == 1) {
            for (int i7 = 0; i7 < this.f5981a0.f285E.size(); i7++) {
                this.f5949H.f1697d.put((byte[]) this.f5981a0.f285E.get(i7));
            }
            this.f5942D0 = 2;
        }
        int position = this.f5949H.f1697d.position();
        V0 v02 = this.f376b;
        v02.k();
        try {
            int u4 = u(v02, this.f5949H, 0);
            if (k()) {
                this.f5956K0 = this.f5954J0;
            }
            if (u4 == -3) {
                return false;
            }
            if (u4 == -5) {
                if (this.f5942D0 == 2) {
                    this.f5949H.t();
                    this.f5942D0 = 1;
                }
                X(v02);
                return true;
            }
            if (this.f5949H.f(4)) {
                if (this.f5942D0 == 2) {
                    this.f5949H.t();
                    this.f5942D0 = 1;
                }
                this.f5958L0 = true;
                if (!this.f5948G0) {
                    c0();
                    return false;
                }
                try {
                    if (!this.f5997r0) {
                        this.f5950H0 = true;
                        this.f5980Z.P(this.f6000u0, 0, 0L, 4);
                        this.f6000u0 = -1;
                        this.f5949H.f1697d = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e7) {
                    throw f(e7, this.f5967Q, false, v2.t.r(e7.getErrorCode()));
                }
            }
            if (!this.f5948G0 && !this.f5949H.f(1)) {
                this.f5949H.t();
                if (this.f5942D0 == 2) {
                    this.f5942D0 = 1;
                }
                return true;
            }
            boolean f7 = this.f5949H.f(1073741824);
            if (f7) {
                D1.c cVar = this.f5949H.f1696c;
                if (position == 0) {
                    cVar.getClass();
                } else {
                    if (cVar.f1679d == null) {
                        int[] iArr = new int[1];
                        cVar.f1679d = iArr;
                        cVar.f1684i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = cVar.f1679d;
                    iArr2[0] = iArr2[0] + position;
                }
            }
            if (this.f5988i0 && !f7) {
                ByteBuffer byteBuffer = this.f5949H.f1697d;
                int position2 = byteBuffer.position();
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    int i10 = i8 + 1;
                    if (i10 >= position2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i11 = byteBuffer.get(i8) & 255;
                    if (i9 == 3) {
                        if (i11 == 1 && (byteBuffer.get(i10) & 31) == 7) {
                            ByteBuffer duplicate = byteBuffer.duplicate();
                            duplicate.position(i8 - 3);
                            duplicate.limit(position2);
                            byteBuffer.position(0);
                            byteBuffer.put(duplicate);
                            break;
                        }
                    } else if (i11 == 0) {
                        i9++;
                    }
                    if (i11 != 0) {
                        i9 = 0;
                    }
                    i8 = i10;
                }
                if (this.f5949H.f1697d.position() == 0) {
                    return true;
                }
                this.f5988i0 = false;
            }
            D1.h hVar = this.f5949H;
            long j = hVar.f1699f;
            h hVar2 = this.f5998s0;
            if (hVar2 != null) {
                X x4 = this.f5967Q;
                if (hVar2.f5917b == 0) {
                    hVar2.f5916a = j;
                }
                if (!hVar2.f5918c) {
                    ByteBuffer byteBuffer2 = hVar.f1697d;
                    byteBuffer2.getClass();
                    int i12 = 0;
                    for (int i13 = 0; i13 < 4; i13++) {
                        i12 = (i12 << 8) | (byteBuffer2.get(i13) & 255);
                    }
                    int h6 = AbstractC0096b.h(i12);
                    if (h6 == -1) {
                        hVar2.f5918c = true;
                        hVar2.f5917b = 0L;
                        hVar2.f5916a = hVar.f1699f;
                        Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j = hVar.f1699f;
                    } else {
                        z4 = f7;
                        j = Math.max(0L, ((hVar2.f5917b - 529) * 1000000) / x4.f297Q) + hVar2.f5916a;
                        hVar2.f5917b += h6;
                        long j3 = this.f5954J0;
                        h hVar3 = this.f5998s0;
                        X x7 = this.f5967Q;
                        hVar3.getClass();
                        this.f5954J0 = Math.max(j3, Math.max(0L, ((hVar3.f5917b - 529) * 1000000) / x7.f297Q) + hVar3.f5916a);
                        j = j;
                    }
                }
                z4 = f7;
                long j32 = this.f5954J0;
                h hVar32 = this.f5998s0;
                X x72 = this.f5967Q;
                hVar32.getClass();
                this.f5954J0 = Math.max(j32, Math.max(0L, ((hVar32.f5917b - 529) * 1000000) / x72.f297Q) + hVar32.f5916a);
                j = j;
            } else {
                z4 = f7;
            }
            if (this.f5949H.f(Integer.MIN_VALUE)) {
                this.f5957L.add(Long.valueOf(j));
            }
            if (this.f5962N0) {
                C0321h c0321h = this.f5955K;
                X x8 = this.f5967Q;
                synchronized (c0321h) {
                    int i14 = c0321h.f4017c;
                    if (i14 > 0) {
                        if (j <= ((long[]) c0321h.f4018d)[((c0321h.f4016b + i14) - 1) % ((Object[]) c0321h.f4019e).length]) {
                            synchronized (c0321h) {
                                c0321h.f4016b = 0;
                                c0321h.f4017c = 0;
                                Arrays.fill((Object[]) c0321h.f4019e, (Object) null);
                            }
                        }
                    }
                    c0321h.c();
                    int i15 = c0321h.f4016b;
                    int i16 = c0321h.f4017c;
                    Object[] objArr = (Object[]) c0321h.f4019e;
                    int length = (i15 + i16) % objArr.length;
                    ((long[]) c0321h.f4018d)[length] = j;
                    objArr[length] = x8;
                    c0321h.f4017c = i16 + 1;
                }
                this.f5962N0 = false;
            }
            this.f5954J0 = Math.max(this.f5954J0, j);
            this.f5949H.A();
            if (this.f5949H.f(268435456)) {
                Q(this.f5949H);
            }
            b0(this.f5949H);
            try {
                if (z4) {
                    this.f5980Z.N(this.f6000u0, this.f5949H.f1696c, j);
                } else {
                    this.f5980Z.P(this.f6000u0, this.f5949H.f1697d.limit(), j, 0);
                }
                this.f6000u0 = -1;
                this.f5949H.f1697d = null;
                this.f5948G0 = true;
                this.f5942D0 = 0;
                this.f5968Q0.f1687c++;
                return true;
            } catch (MediaCodec.CryptoException e8) {
                throw f(e8, this.f5967Q, false, v2.t.r(e8.getErrorCode()));
            }
        } catch (D1.g e9) {
            U(e9);
            e0(0);
            I();
            return true;
        }
    }

    public final void I() {
        try {
            this.f5980Z.flush();
        } finally {
            h0();
        }
    }

    public final boolean J() {
        if (this.f5980Z == null) {
            return false;
        }
        int i7 = this.f5946F0;
        if (i7 == 3 || this.f5989j0 || ((this.f5990k0 && !this.f5952I0) || (this.f5991l0 && this.f5950H0))) {
            f0();
            return true;
        }
        if (i7 == 2) {
            int i8 = v2.t.f17153a;
            AbstractC1664a.h(i8 >= 23);
            if (i8 >= 23) {
                try {
                    o0();
                } catch (A1.r e7) {
                    AbstractC1664a.G(e7, "MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.");
                    f0();
                    return true;
                }
            }
        }
        I();
        return false;
    }

    public final List K(boolean z4) {
        X x4 = this.f5967Q;
        q qVar = this.f5943E;
        ArrayList N7 = N(qVar, x4, z4);
        if (N7.isEmpty() && z4) {
            N7 = N(qVar, this.f5967Q, false);
            if (!N7.isEmpty()) {
                Log.w("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f5967Q.f283C + ", but no secure decoder available. Trying to proceed with " + N7 + ".");
            }
        }
        return N7;
    }

    public boolean L() {
        return false;
    }

    public abstract float M(float f7, X[] xArr);

    public abstract ArrayList N(q qVar, X x4, boolean z4);

    public final E1.i O(C1719l1 c1719l1) {
        c1719l1.getClass();
        return null;
    }

    public abstract i P(m mVar, X x4, MediaCrypto mediaCrypto, float f7);

    /* JADX WARN: Code restructure failed: missing block: B:127:0x014f, code lost:
    
        if ("stvm8".equals(r3) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x015f, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r6) == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(m mVar, MediaCrypto mediaCrypto) {
        float M7;
        int i7;
        boolean z4;
        boolean z7;
        String str;
        String str2;
        String str3 = mVar.f5925a;
        int i8 = v2.t.f17153a;
        if (i8 < 23) {
            M7 = -1.0f;
        } else {
            float f7 = this.f5979Y;
            X[] xArr = this.f382y;
            xArr.getClass();
            M7 = M(f7, xArr);
        }
        float f8 = M7 > this.f5945F ? M7 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        i P7 = P(mVar, this.f5967Q, mediaCrypto, f8);
        if (i8 >= 31) {
            B1.p pVar = this.f379e;
            pVar.getClass();
            n.a(P7, pVar);
        }
        try {
            AbstractC1664a.c("createCodec:" + str3);
            this.f5980Z = this.f5941D.a(P7);
            AbstractC1664a.m();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f5986g0 = mVar;
            this.f5983d0 = f8;
            this.f5981a0 = this.f5967Q;
            if (i8 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                String str4 = v2.t.f17156d;
                if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                    i7 = 2;
                    this.f5987h0 = i7;
                    this.f5988i0 = i8 >= 21 && this.f5981a0.f285E.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str3);
                    this.f5989j0 = i8 >= 18 || (i8 == 18 && ("OMX.SEC.avc.dec".equals(str3) || "OMX.SEC.avc.dec.secure".equals(str3))) || (i8 == 19 && v2.t.f17156d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str3) || "OMX.Exynos.avc.dec.secure".equals(str3)));
                    this.f5990k0 = i8 != 29 && "c2.android.aac.decoder".equals(str3);
                    if (i8 <= 23 || !"OMX.google.vorbis.decoder".equals(str3)) {
                        if (i8 <= 19) {
                            String str5 = v2.t.f17154b;
                            if (!"hb2000".equals(str5)) {
                            }
                            if (!"OMX.amlogic.avc.decoder.awesome".equals(str3)) {
                            }
                        }
                        z4 = false;
                        this.f5991l0 = z4;
                        this.f5992m0 = i8 != 21 && "OMX.google.aac.decoder".equals(str3);
                        if (i8 < 21 && "OMX.SEC.mp3.dec".equals(str3) && "samsung".equals(v2.t.f17155c)) {
                            str2 = v2.t.f17154b;
                            if (!str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                                z7 = true;
                                this.f5993n0 = z7;
                                this.f5994o0 = i8 > 18 && this.f5981a0.f296P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str3);
                                str = mVar.f5925a;
                                this.f5997r0 = (i8 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i8 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i8 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || (("Amazon".equals(v2.t.f17155c) && "AFTS".equals(v2.t.f17156d) && mVar.f5930f) || L()));
                                this.f5980Z.getClass();
                                if ("c2.android.mp3.decoder".equals(str)) {
                                    this.f5998s0 = new h();
                                }
                                if (this.f380f == 2) {
                                    this.f5999t0 = SystemClock.elapsedRealtime() + 1000;
                                }
                                this.f5968Q0.f1685a++;
                                V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str3);
                            }
                        }
                        z7 = false;
                        this.f5993n0 = z7;
                        this.f5994o0 = i8 > 18 && this.f5981a0.f296P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str3);
                        str = mVar.f5925a;
                        this.f5997r0 = (i8 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i8 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i8 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || (("Amazon".equals(v2.t.f17155c) && "AFTS".equals(v2.t.f17156d) && mVar.f5930f) || L()));
                        this.f5980Z.getClass();
                        if ("c2.android.mp3.decoder".equals(str)) {
                        }
                        if (this.f380f == 2) {
                        }
                        this.f5968Q0.f1685a++;
                        V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str3);
                    }
                    z4 = true;
                    this.f5991l0 = z4;
                    this.f5992m0 = i8 != 21 && "OMX.google.aac.decoder".equals(str3);
                    if (i8 < 21) {
                        str2 = v2.t.f17154b;
                        if (!str2.startsWith("baffin")) {
                        }
                        z7 = true;
                        this.f5993n0 = z7;
                        this.f5994o0 = i8 > 18 && this.f5981a0.f296P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str3);
                        str = mVar.f5925a;
                        this.f5997r0 = (i8 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i8 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i8 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || (("Amazon".equals(v2.t.f17155c) && "AFTS".equals(v2.t.f17156d) && mVar.f5930f) || L()));
                        this.f5980Z.getClass();
                        if ("c2.android.mp3.decoder".equals(str)) {
                        }
                        if (this.f380f == 2) {
                        }
                        this.f5968Q0.f1685a++;
                        V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str3);
                    }
                    z7 = false;
                    this.f5993n0 = z7;
                    this.f5994o0 = i8 > 18 && this.f5981a0.f296P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str3);
                    str = mVar.f5925a;
                    this.f5997r0 = (i8 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i8 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i8 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || (("Amazon".equals(v2.t.f17155c) && "AFTS".equals(v2.t.f17156d) && mVar.f5930f) || L()));
                    this.f5980Z.getClass();
                    if ("c2.android.mp3.decoder".equals(str)) {
                    }
                    if (this.f380f == 2) {
                    }
                    this.f5968Q0.f1685a++;
                    V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str3);
                }
            }
            if (i8 < 24 && ("OMX.Nvidia.h264.decode".equals(str3) || "OMX.Nvidia.h264.decode.secure".equals(str3))) {
                String str6 = v2.t.f17154b;
                if ("flounder".equals(str6) || "flounder_lte".equals(str6) || "grouper".equals(str6) || "tilapia".equals(str6)) {
                    i7 = 1;
                    this.f5987h0 = i7;
                    this.f5988i0 = i8 >= 21 && this.f5981a0.f285E.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str3);
                    this.f5989j0 = i8 >= 18 || (i8 == 18 && ("OMX.SEC.avc.dec".equals(str3) || "OMX.SEC.avc.dec.secure".equals(str3))) || (i8 == 19 && v2.t.f17156d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str3) || "OMX.Exynos.avc.dec.secure".equals(str3)));
                    this.f5990k0 = i8 != 29 && "c2.android.aac.decoder".equals(str3);
                    if (i8 <= 23) {
                    }
                    if (i8 <= 19) {
                    }
                    z4 = false;
                    this.f5991l0 = z4;
                    this.f5992m0 = i8 != 21 && "OMX.google.aac.decoder".equals(str3);
                    if (i8 < 21) {
                    }
                    z7 = false;
                    this.f5993n0 = z7;
                    this.f5994o0 = i8 > 18 && this.f5981a0.f296P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str3);
                    str = mVar.f5925a;
                    this.f5997r0 = (i8 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i8 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i8 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || (("Amazon".equals(v2.t.f17155c) && "AFTS".equals(v2.t.f17156d) && mVar.f5930f) || L()));
                    this.f5980Z.getClass();
                    if ("c2.android.mp3.decoder".equals(str)) {
                    }
                    if (this.f380f == 2) {
                    }
                    this.f5968Q0.f1685a++;
                    V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str3);
                }
            }
            i7 = 0;
            this.f5987h0 = i7;
            this.f5988i0 = i8 >= 21 && this.f5981a0.f285E.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str3);
            this.f5989j0 = i8 >= 18 || (i8 == 18 && ("OMX.SEC.avc.dec".equals(str3) || "OMX.SEC.avc.dec.secure".equals(str3))) || (i8 == 19 && v2.t.f17156d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str3) || "OMX.Exynos.avc.dec.secure".equals(str3)));
            this.f5990k0 = i8 != 29 && "c2.android.aac.decoder".equals(str3);
            if (i8 <= 23) {
            }
            if (i8 <= 19) {
            }
            z4 = false;
            this.f5991l0 = z4;
            this.f5992m0 = i8 != 21 && "OMX.google.aac.decoder".equals(str3);
            if (i8 < 21) {
            }
            z7 = false;
            this.f5993n0 = z7;
            this.f5994o0 = i8 > 18 && this.f5981a0.f296P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str3);
            str = mVar.f5925a;
            this.f5997r0 = (i8 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i8 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i8 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || (("Amazon".equals(v2.t.f17155c) && "AFTS".equals(v2.t.f17156d) && mVar.f5930f) || L()));
            this.f5980Z.getClass();
            if ("c2.android.mp3.decoder".equals(str)) {
            }
            if (this.f380f == 2) {
            }
            this.f5968Q0.f1685a++;
            V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str3);
        } catch (Throwable th) {
            AbstractC1664a.m();
            throw th;
        }
    }

    public final void S() {
        X x4;
        if (this.f5980Z != null || this.f6005z0 || (x4 = this.f5967Q) == null) {
            return;
        }
        if (this.f5973T == null && l0(x4)) {
            X x7 = this.f5967Q;
            E();
            String str = x7.f283C;
            boolean equals = "audio/mp4a-latm".equals(str);
            g gVar = this.f5953J;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                gVar.getClass();
                gVar.f5914B = 32;
            } else {
                gVar.getClass();
                gVar.f5914B = 1;
            }
            this.f6005z0 = true;
            return;
        }
        j0(this.f5973T);
        String str2 = this.f5967Q.f283C;
        C1719l1 c1719l1 = this.f5971S;
        if (c1719l1 != null) {
            if (this.f5975U == null) {
                O(c1719l1);
                if (this.f5971S.w() == null) {
                    return;
                }
            }
            if (E1.i.f1905a) {
                int z4 = this.f5971S.z();
                if (z4 == 1) {
                    E1.c w7 = this.f5971S.w();
                    w7.getClass();
                    throw f(w7, this.f5967Q, false, w7.f1901a);
                }
                if (z4 != 4) {
                    return;
                }
            }
        }
        try {
            T(this.f5975U, this.f5976V);
        } catch (o e7) {
            throw f(e7, this.f5967Q, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(MediaCrypto mediaCrypto, boolean z4) {
        String str;
        o oVar;
        if (this.f5984e0 == null) {
            try {
                List K7 = K(z4);
                this.f5984e0 = new ArrayDeque();
                if (!K7.isEmpty()) {
                    this.f5984e0.add((m) K7.get(0));
                }
                this.f5985f0 = null;
            } catch (t e7) {
                throw new o(this.f5967Q, e7, z4, -49998);
            }
        }
        if (this.f5984e0.isEmpty()) {
            throw new o(this.f5967Q, null, z4, -49999);
        }
        m mVar = (m) this.f5984e0.peekFirst();
        while (this.f5980Z == null) {
            m mVar2 = (m) this.f5984e0.peekFirst();
            if (!k0(mVar2)) {
                return;
            }
            try {
                R(mVar2, mediaCrypto);
            } catch (Exception e8) {
                if (mVar2 != mVar) {
                    throw e8;
                }
                try {
                    Log.w("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    R(mVar2, mediaCrypto);
                } catch (Exception e9) {
                    AbstractC1664a.G(e9, "MediaCodecRenderer", "Failed to initialize decoder: " + mVar2);
                    this.f5984e0.removeFirst();
                    X x4 = this.f5967Q;
                    String str2 = "Decoder init failed: " + mVar2.f5925a + ", " + x4;
                    String str3 = x4.f283C;
                    if (v2.t.f17153a < 21) {
                        str = e9 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e9).getDiagnosticInfo() : null;
                    } else {
                        str = null;
                    }
                    o oVar2 = new o(str2, e9, str3, z4, mVar2, str);
                    U(oVar2);
                    oVar = this.f5985f0;
                    if (oVar != null) {
                        this.f5985f0 = oVar2;
                    } else {
                        this.f5985f0 = new o(oVar.getMessage(), oVar.getCause(), oVar.f5933a, oVar.f5934b, oVar.f5935c, oVar.f5936d);
                    }
                    if (!this.f5984e0.isEmpty()) {
                        throw this.f5985f0;
                    }
                }
                AbstractC1664a.G(e9, "MediaCodecRenderer", "Failed to initialize decoder: " + mVar2);
                this.f5984e0.removeFirst();
                X x42 = this.f5967Q;
                String str22 = "Decoder init failed: " + mVar2.f5925a + ", " + x42;
                String str32 = x42.f283C;
                if (v2.t.f17153a < 21) {
                }
                o oVar22 = new o(str22, e9, str32, z4, mVar2, str);
                U(oVar22);
                oVar = this.f5985f0;
                if (oVar != null) {
                }
                if (!this.f5984e0.isEmpty()) {
                }
            }
        }
        this.f5984e0 = null;
    }

    public abstract void U(Exception exc);

    public abstract void V(long j, long j3, String str);

    public abstract void W(String str);

    /* JADX WARN: Code restructure failed: missing block: B:47:0x007c, code lost:
    
        if (F() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
    
        if (r5.f289I == r4.f289I) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00af, code lost:
    
        if (F() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c1, code lost:
    
        if (F() == false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D1.i X(V0 v02) {
        int i7;
        boolean z4 = true;
        this.f5962N0 = true;
        X x4 = (X) v02.f17563c;
        x4.getClass();
        if (x4.f283C == null) {
            throw f(new IllegalArgumentException(), x4, false, 4005);
        }
        C1719l1 c1719l1 = (C1719l1) v02.f17562b;
        C1719l1 c1719l12 = this.f5973T;
        if (c1719l12 != c1719l1) {
            if (c1719l1 != null) {
                c1719l1.getClass();
            }
            if (c1719l12 != null) {
                c1719l12.getClass();
            }
        }
        this.f5973T = c1719l1;
        this.f5967Q = x4;
        if (this.f6005z0) {
            this.f5939B0 = true;
            return null;
        }
        k kVar = this.f5980Z;
        if (kVar == null) {
            this.f5984e0 = null;
            S();
            return null;
        }
        m mVar = this.f5986g0;
        X x7 = this.f5981a0;
        C1719l1 c1719l13 = this.f5971S;
        if (c1719l13 != c1719l1) {
            if (c1719l1 != null && c1719l13 != null && v2.t.f17153a >= 23) {
                UUID uuid = AbstractC0029l.f466e;
                if (!uuid.equals(c1719l13.x()) && !uuid.equals(c1719l1.x())) {
                    O(c1719l1);
                }
            }
            if (this.f5948G0) {
                this.f5944E0 = 1;
                this.f5946F0 = 3;
            } else {
                f0();
                S();
            }
            return new D1.i(mVar.f5925a, x7, x4, 0, 128);
        }
        boolean z7 = this.f5973T != this.f5971S;
        AbstractC1664a.h(!z7 || v2.t.f17153a >= 23);
        D1.i C3 = C(mVar, x7, x4);
        int i8 = C3.f1705d;
        if (i8 != 0) {
            i7 = 2;
            if (i8 == 1) {
                if (n0(x4)) {
                    this.f5981a0 = x4;
                    if (!z7) {
                        if (this.f5948G0) {
                            this.f5944E0 = 1;
                            if (this.f5989j0 || this.f5991l0) {
                                this.f5946F0 = 3;
                            } else {
                                this.f5946F0 = 1;
                            }
                        }
                    }
                }
                i7 = 16;
            } else if (i8 == 2) {
                if (n0(x4)) {
                    this.f5940C0 = true;
                    this.f5942D0 = 1;
                    int i9 = this.f5987h0;
                    if (i9 != 2) {
                        if (i9 == 1) {
                            if (x4.f288H == x7.f288H) {
                            }
                        }
                        z4 = false;
                    }
                    this.f5995p0 = z4;
                    this.f5981a0 = x4;
                    if (z7) {
                    }
                }
                i7 = 16;
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException();
                }
                if (n0(x4)) {
                    this.f5981a0 = x4;
                    if (z7) {
                    }
                }
                i7 = 16;
            }
            return (i8 != 0 || (this.f5980Z == kVar && this.f5946F0 != 3)) ? C3 : new D1.i(mVar.f5925a, x7, x4, 0, i7);
        }
        if (this.f5948G0) {
            this.f5944E0 = 1;
            this.f5946F0 = 3;
        } else {
            f0();
            S();
        }
        i7 = 0;
        if (i8 != 0) {
        }
    }

    public abstract void Y(X x4, MediaFormat mediaFormat);

    public void Z(long j) {
        while (true) {
            int i7 = this.f5974T0;
            if (i7 == 0) {
                return;
            }
            long[] jArr = this.f5965P;
            if (j < jArr[0]) {
                return;
            }
            long[] jArr2 = this.f5961N;
            this.f5970R0 = jArr2[0];
            long[] jArr3 = this.f5963O;
            this.f5972S0 = jArr3[0];
            int i8 = i7 - 1;
            this.f5974T0 = i8;
            System.arraycopy(jArr2, 1, jArr2, 0, i8);
            System.arraycopy(jArr3, 1, jArr3, 0, this.f5974T0);
            System.arraycopy(jArr, 1, jArr, 0, this.f5974T0);
            a0();
        }
    }

    public abstract void a0();

    public abstract void b0(D1.h hVar);

    public final void c0() {
        int i7 = this.f5946F0;
        if (i7 == 1) {
            I();
            return;
        }
        if (i7 == 2) {
            I();
            o0();
        } else if (i7 != 3) {
            this.f5960M0 = true;
            g0();
        } else {
            f0();
            S();
        }
    }

    public abstract boolean d0(long j, long j3, k kVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j7, boolean z4, boolean z7, X x4);

    public final boolean e0(int i7) {
        V0 v02 = this.f376b;
        v02.k();
        D1.h hVar = this.f5947G;
        hVar.t();
        int u4 = u(v02, hVar, i7 | 4);
        if (u4 == -5) {
            X(v02);
            return true;
        }
        if (u4 != -4 || !hVar.f(4)) {
            return false;
        }
        this.f5958L0 = true;
        c0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0() {
        try {
            k kVar = this.f5980Z;
            if (kVar != null) {
                kVar.release();
                this.f5968Q0.f1686b++;
                W(this.f5986g0.f5925a);
            }
            this.f5980Z = null;
            try {
                MediaCrypto mediaCrypto = this.f5975U;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f5980Z = null;
            try {
                MediaCrypto mediaCrypto2 = this.f5975U;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void h0() {
        this.f6000u0 = -1;
        this.f5949H.f1697d = null;
        this.f6001v0 = -1;
        this.f6002w0 = null;
        this.f5999t0 = -9223372036854775807L;
        this.f5950H0 = false;
        this.f5948G0 = false;
        this.f5995p0 = false;
        this.f5996q0 = false;
        this.f6003x0 = false;
        this.f6004y0 = false;
        this.f5957L.clear();
        this.f5954J0 = -9223372036854775807L;
        this.f5956K0 = -9223372036854775807L;
        h hVar = this.f5998s0;
        if (hVar != null) {
            hVar.f5916a = 0L;
            hVar.f5917b = 0L;
            hVar.f5918c = false;
        }
        this.f5944E0 = 0;
        this.f5946F0 = 0;
        this.f5942D0 = this.f5940C0 ? 1 : 0;
    }

    public final void i0() {
        h0();
        this.f5966P0 = null;
        this.f5998s0 = null;
        this.f5984e0 = null;
        this.f5986g0 = null;
        this.f5981a0 = null;
        this.f5982b0 = null;
        this.c0 = false;
        this.f5952I0 = false;
        this.f5983d0 = -1.0f;
        this.f5987h0 = 0;
        this.f5988i0 = false;
        this.f5989j0 = false;
        this.f5990k0 = false;
        this.f5991l0 = false;
        this.f5992m0 = false;
        this.f5993n0 = false;
        this.f5994o0 = false;
        this.f5997r0 = false;
        this.f5940C0 = false;
        this.f5942D0 = 0;
        this.f5976V = false;
    }

    public final void j0(C1719l1 c1719l1) {
        C1719l1 c1719l12 = this.f5971S;
        if (c1719l12 != c1719l1) {
            if (c1719l1 != null) {
                c1719l1.t(null);
            }
            if (c1719l12 != null) {
                c1719l12.F(null);
            }
        }
        this.f5971S = c1719l1;
    }

    public boolean k0(m mVar) {
        return true;
    }

    @Override // A1.AbstractC0023i
    public boolean l() {
        return this.f5960M0;
    }

    public boolean l0(X x4) {
        return false;
    }

    @Override // A1.AbstractC0023i
    public boolean m() {
        boolean b7;
        if (this.f5967Q == null) {
            return false;
        }
        if (k()) {
            b7 = this.f373B;
        } else {
            W w7 = this.f381x;
            w7.getClass();
            b7 = w7.b();
        }
        if (!b7) {
            if (!(this.f6001v0 >= 0) && (this.f5999t0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f5999t0)) {
                return false;
            }
        }
        return true;
    }

    public abstract int m0(q qVar, X x4);

    public final boolean n0(X x4) {
        if (v2.t.f17153a >= 23 && this.f5980Z != null && this.f5946F0 != 3 && this.f380f != 0) {
            float f7 = this.f5979Y;
            X[] xArr = this.f382y;
            xArr.getClass();
            float M7 = M(f7, xArr);
            float f8 = this.f5983d0;
            if (f8 == M7) {
                return true;
            }
            if (M7 == -1.0f) {
                if (this.f5948G0) {
                    this.f5944E0 = 1;
                    this.f5946F0 = 3;
                    return false;
                }
                f0();
                S();
                return false;
            }
            if (f8 == -1.0f && M7 <= this.f5945F) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", M7);
            this.f5980Z.l(bundle);
            this.f5983d0 = M7;
        }
        return true;
    }

    public final void o0() {
        try {
            MediaCrypto mediaCrypto = this.f5975U;
            O(this.f5973T).getClass();
            mediaCrypto.setMediaDrmSession(null);
            j0(this.f5973T);
            this.f5944E0 = 0;
            this.f5946F0 = 0;
        } catch (MediaCryptoException e7) {
            throw f(e7, this.f5967Q, false, 6006);
        }
    }

    @Override // A1.AbstractC0023i
    public void p(long j, boolean z4) {
        int i7;
        this.f5958L0 = false;
        this.f5960M0 = false;
        this.f5964O0 = false;
        if (this.f6005z0) {
            this.f5953J.t();
            this.f5951I.t();
            this.f5938A0 = false;
        } else if (J()) {
            S();
        }
        C0321h c0321h = this.f5955K;
        synchronized (c0321h) {
            i7 = c0321h.f4017c;
        }
        if (i7 > 0) {
            this.f5962N0 = true;
        }
        C0321h c0321h2 = this.f5955K;
        synchronized (c0321h2) {
            c0321h2.f4016b = 0;
            c0321h2.f4017c = 0;
            Arrays.fill((Object[]) c0321h2.f4019e, (Object) null);
        }
        int i8 = this.f5974T0;
        if (i8 != 0) {
            int i9 = i8 - 1;
            this.f5972S0 = this.f5963O[i9];
            this.f5970R0 = this.f5961N[i9];
            this.f5974T0 = 0;
        }
    }

    public final void p0(long j) {
        Object obj;
        Object obj2;
        C0321h c0321h = this.f5955K;
        synchronized (c0321h) {
            obj = null;
            obj2 = null;
            while (c0321h.f4017c > 0 && j - ((long[]) c0321h.f4018d)[c0321h.f4016b] >= 0) {
                obj2 = c0321h.f();
            }
        }
        X x4 = (X) obj2;
        if (x4 == null && this.c0) {
            C0321h c0321h2 = this.f5955K;
            synchronized (c0321h2) {
                if (c0321h2.f4017c != 0) {
                    obj = c0321h2.f();
                }
            }
            x4 = (X) obj;
        }
        if (x4 != null) {
            this.f5969R = x4;
        } else if (!this.c0 || this.f5969R == null) {
            return;
        }
        Y(this.f5969R, this.f5982b0);
        this.c0 = false;
    }

    @Override // A1.AbstractC0023i
    public final void t(X[] xArr, long j, long j3) {
        if (this.f5972S0 == -9223372036854775807L) {
            AbstractC1664a.h(this.f5970R0 == -9223372036854775807L);
            this.f5970R0 = j;
            this.f5972S0 = j3;
            return;
        }
        int i7 = this.f5974T0;
        long[] jArr = this.f5963O;
        if (i7 == jArr.length) {
            Log.w("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + jArr[this.f5974T0 - 1]);
        } else {
            this.f5974T0 = i7 + 1;
        }
        int i8 = this.f5974T0 - 1;
        this.f5961N[i8] = j;
        jArr[i8] = j3;
        this.f5965P[i8] = this.f5954J0;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006b A[LOOP:1: B:33:0x004b->B:42:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006c A[EDGE_INSN: B:43:0x006c->B:44:? BREAK  A[LOOP:1: B:33:0x004b->B:42:0x006b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087 A[LOOP:2: B:45:0x006c->B:54:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088 A[EDGE_INSN: B:55:0x0088->B:56:0x0088 BREAK  A[LOOP:2: B:45:0x006c->B:54:0x0087], SYNTHETIC] */
    @Override // A1.AbstractC0023i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j, long j3) {
        boolean z4;
        boolean z7;
        boolean z8 = false;
        if (this.f5964O0) {
            this.f5964O0 = false;
            c0();
        }
        A1.r rVar = this.f5966P0;
        if (rVar != null) {
            this.f5966P0 = null;
            throw rVar;
        }
        try {
            if (this.f5960M0) {
                g0();
                return;
            }
            if (this.f5967Q != null || e0(2)) {
                S();
                if (this.f6005z0) {
                    AbstractC1664a.c("bypassRender");
                    while (B(j, j3)) {
                    }
                    AbstractC1664a.m();
                } else if (this.f5980Z != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AbstractC1664a.c("drainAndFeed");
                    while (G(j, j3)) {
                        long j7 = this.f5977W;
                        if (j7 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j7) {
                            z7 = false;
                            if (z7) {
                                break;
                            }
                        }
                        z7 = true;
                        if (z7) {
                        }
                    }
                    while (H()) {
                        long j8 = this.f5977W;
                        if (j8 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j8) {
                            z4 = false;
                            if (z4) {
                                break;
                            }
                        }
                        z4 = true;
                        if (z4) {
                        }
                    }
                    AbstractC1664a.m();
                } else {
                    D1.e eVar = this.f5968Q0;
                    int i7 = eVar.f1688d;
                    W w7 = this.f381x;
                    w7.getClass();
                    eVar.f1688d = i7 + w7.d(j - this.f383z);
                    e0(1);
                }
                synchronized (this.f5968Q0) {
                }
            }
        } catch (IllegalStateException e7) {
            int i8 = v2.t.f17153a;
            if (i8 < 21 || !(e7 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e7.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e7;
                }
            }
            U(e7);
            if (i8 >= 21) {
                if (e7 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e7).isRecoverable() : false) {
                    z8 = true;
                }
            }
            if (z8) {
                f0();
            }
            throw f(D(e7, this.f5986g0), this.f5967Q, z8, 4003);
        }
    }

    @Override // A1.AbstractC0023i
    public void y(float f7, float f8) {
        this.f5978X = f7;
        this.f5979Y = f8;
        n0(this.f5981a0);
    }

    @Override // A1.AbstractC0023i
    public final int z(X x4) {
        try {
            return m0(this.f5943E, x4);
        } catch (t e7) {
            throw f(e7, x4, false, 4002);
        }
    }

    public void g0() {
    }

    public void Q(D1.h hVar) {
    }
}
