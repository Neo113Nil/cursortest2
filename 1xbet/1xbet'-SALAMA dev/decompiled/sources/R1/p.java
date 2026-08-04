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
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p018c2.W;
import p155w1.C1010l1;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends AbstractC0023i {

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final byte[] f5937U0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f5938A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f5939B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f5940C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final j f5941D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f5942D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final q f5943E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f5944E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final float f5945F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f5946F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final D1.h f5947G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f5948G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final D1.h f5949H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f5950H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final D1.h f5951I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f5952I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final g f5953J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public long f5954J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C0321h f5955K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public long f5956K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ArrayList f5957L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f5958L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final MediaCodec.BufferInfo f5959M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f5960M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final long[] f5961N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f5962N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final long[] f5963O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f5964O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final long[] f5965P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public A1.r f5966P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public X f5967Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public D1.e f5968Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public X f5969R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public long f5970R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C1010l1 f5971S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public long f5972S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C1010l1 f5973T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public int f5974T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public MediaCrypto f5975U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f5976V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final long f5977W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public float f5978X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float f5979Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public k f5980Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public X f5981a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public MediaFormat f5982b0;
    public boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f5983d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ArrayDeque f5984e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public o f5985f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public m f5986g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f5987h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f5988i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f5989j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f5990k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f5991l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f5992m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f5993n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f5994o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f5995p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f5996q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f5997r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public h f5998s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f5999t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f6000u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f6001v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ByteBuffer f6002w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f6003x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f6004y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
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
    public final boolean B(long j, long j3) throws A1.r {
        boolean z4;
        g gVar;
        p151v2.a.h(!this.f5960M0);
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
            p151v2.a.h(gVar.B(hVar));
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
        p151v2.a.h(!this.f5958L0);
        V0 v6 = this.f376b;
        v6.k();
        hVar.t();
        while (true) {
            hVar.t();
            int iU = u(v6, hVar, z4);
            if (iU == -5) {
                X(v6);
                break;
            }
            if (iU != -4) {
                if (iU == -3) {
                    break;
                }
                throw new IllegalStateException();
            }
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

    public final boolean F() throws A1.r {
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

    public final boolean G(long j, long j3) throws A1.r {
        boolean z4;
        MediaCodec.BufferInfo bufferInfo;
        boolean zD0;
        int iS;
        boolean z7;
        boolean z8 = this.f6001v0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f5959M;
        if (!z8) {
            if (this.f5992m0 && this.f5950H0) {
                try {
                    iS = this.f5980Z.s(bufferInfo2);
                } catch (IllegalStateException unused) {
                    c0();
                    if (this.f5960M0) {
                        f0();
                    }
                    return false;
                }
            } else {
                iS = this.f5980Z.s(bufferInfo2);
            }
            if (iS < 0) {
                if (iS != -2) {
                    if (this.f5997r0 && (this.f5958L0 || this.f5944E0 == 2)) {
                        c0();
                    }
                    return false;
                }
                this.f5952I0 = true;
                MediaFormat mediaFormatK = this.f5980Z.k();
                if (this.f5987h0 != 0 && mediaFormatK.getInteger("width") == 32 && mediaFormatK.getInteger("height") == 32) {
                    this.f5996q0 = true;
                } else {
                    if (this.f5994o0) {
                        mediaFormatK.setInteger("channel-count", 1);
                    }
                    this.f5982b0 = mediaFormatK;
                    this.c0 = true;
                }
                return true;
            }
            if (this.f5996q0) {
                this.f5996q0 = false;
                this.f5980Z.w(iS, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                c0();
                return false;
            }
            this.f6001v0 = iS;
            ByteBuffer byteBufferI = this.f5980Z.I(iS);
            this.f6002w0 = byteBufferI;
            if (byteBufferI != null) {
                byteBufferI.position(bufferInfo2.offset);
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
                    z7 = false;
                    break;
                }
                if (((Long) arrayList.get(i7)).longValue() == j8) {
                    arrayList.remove(i7);
                    z7 = true;
                    break;
                }
                i7++;
            }
            this.f6003x0 = z7;
            long j9 = this.f5956K0;
            long j10 = bufferInfo2.presentationTimeUs;
            this.f6004y0 = j9 == j10;
            p0(j10);
        }
        if (this.f5992m0 && this.f5950H0) {
            try {
                z4 = false;
                try {
                    zD0 = d0(j, j3, this.f5980Z, this.f6002w0, this.f6001v0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f6003x0, this.f6004y0, this.f5969R);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    c0();
                    if (this.f5960M0) {
                        f0();
                    }
                    return z4;
                }
            } catch (IllegalStateException unused3) {
                z4 = false;
            }
        } else {
            z4 = false;
            bufferInfo = bufferInfo2;
            zD0 = d0(j, j3, this.f5980Z, this.f6002w0, this.f6001v0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f6003x0, this.f6004y0, this.f5969R);
        }
        if (zD0) {
            Z(bufferInfo.presentationTimeUs);
            boolean z9 = (bufferInfo.flags & 4) != 0 ? true : z4;
            this.f6001v0 = -1;
            this.f6002w0 = null;
            if (!z9) {
                return r13;
            }
            c0();
        }
        return z4;
    }

    public final boolean H() throws A1.r {
        k kVar = this.f5980Z;
        if (kVar == null || this.f5944E0 == 2 || this.f5958L0) {
            return false;
        }
        if (this.f6000u0 < 0) {
            int iO = kVar.o();
            this.f6000u0 = iO;
            if (iO < 0) {
                return false;
            }
            this.f5949H.f1697d = this.f5980Z.C(iO);
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
        int iPosition = this.f5949H.f1697d.position();
        V0 v6 = this.f376b;
        v6.k();
        try {
            int iU = u(v6, this.f5949H, 0);
            if (k()) {
                this.f5956K0 = this.f5954J0;
            }
            if (iU == -3) {
                return false;
            }
            if (iU == -5) {
                if (this.f5942D0 == 2) {
                    this.f5949H.t();
                    this.f5942D0 = 1;
                }
                X(v6);
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
                    throw f(e7, this.f5967Q, false, p151v2.t.r(e7.getErrorCode()));
                }
            }
            if (!this.f5948G0 && !this.f5949H.f(1)) {
                this.f5949H.t();
                if (this.f5942D0 == 2) {
                    this.f5942D0 = 1;
                }
                return true;
            }
            boolean zF = this.f5949H.f(1073741824);
            if (zF) {
                D1.c cVar = this.f5949H.f1696c;
                if (iPosition == 0) {
                    cVar.getClass();
                } else {
                    if (cVar.f1679d == null) {
                        int[] iArr = new int[1];
                        cVar.f1679d = iArr;
                        cVar.f1684i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = cVar.f1679d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.f5988i0 && !zF) {
                ByteBuffer byteBuffer = this.f5949H.f1697d;
                int iPosition2 = byteBuffer.position();
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    int i10 = i8 + 1;
                    if (i10 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i11 = byteBuffer.get(i8) & 255;
                    if (i9 == 3) {
                        if (i11 == 1 && (byteBuffer.get(i10) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            byteBufferDuplicate.position(i8 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer.position(0);
                            byteBuffer.put(byteBufferDuplicate);
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
            long jMax = hVar.f1699f;
            h hVar2 = this.f5998s0;
            if (hVar2 != null) {
                X x4 = this.f5967Q;
                if (hVar2.f5917b == 0) {
                    hVar2.f5916a = jMax;
                }
                if (!hVar2.f5918c) {
                    ByteBuffer byteBuffer2 = hVar.f1697d;
                    byteBuffer2.getClass();
                    int i12 = 0;
                    for (int i13 = 0; i13 < 4; i13++) {
                        i12 = (i12 << 8) | (byteBuffer2.get(i13) & 255);
                    }
                    int iH = AbstractC0096b.h(i12);
                    if (iH == -1) {
                        hVar2.f5918c = true;
                        hVar2.f5917b = 0L;
                        hVar2.f5916a = hVar.f1699f;
                        Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        jMax = hVar.f1699f;
                    } else {
                        jMax = Math.max(0L, ((hVar2.f5917b - 529) * 1000000) / x4.f297Q) + hVar2.f5916a;
                        hVar2.f5917b += (long) iH;
                    }
                }
                long j = this.f5954J0;
                h hVar3 = this.f5998s0;
                X x7 = this.f5967Q;
                hVar3.getClass();
                this.f5954J0 = Math.max(j, Math.max(0L, ((hVar3.f5917b - 529) * 1000000) / x7.f297Q) + hVar3.f5916a);
                jMax = jMax;
            } else {
                zF = zF;
            }
            if (this.f5949H.f(Integer.MIN_VALUE)) {
                this.f5957L.add(Long.valueOf(jMax));
            }
            if (this.f5962N0) {
                C0321h c0321h = this.f5955K;
                X x8 = this.f5967Q;
                synchronized (c0321h) {
                    int i14 = c0321h.f4017c;
                    if (i14 > 0) {
                        if (jMax <= ((long[]) c0321h.f4018d)[((c0321h.f4016b + i14) - 1) % ((Object[]) c0321h.f4019e).length]) {
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
                    ((long[]) c0321h.f4018d)[length] = jMax;
                    objArr[length] = x8;
                    c0321h.f4017c = i16 + 1;
                }
                this.f5962N0 = false;
            }
            this.f5954J0 = Math.max(this.f5954J0, jMax);
            this.f5949H.A();
            if (this.f5949H.f(268435456)) {
                Q(this.f5949H);
            }
            b0(this.f5949H);
            try {
                if (zF) {
                    this.f5980Z.N(this.f6000u0, this.f5949H.f1696c, jMax);
                } else {
                    this.f5980Z.P(this.f6000u0, this.f5949H.f1697d.limit(), jMax, 0);
                }
                this.f6000u0 = -1;
                this.f5949H.f1697d = null;
                this.f5948G0 = true;
                this.f5942D0 = 0;
                this.f5968Q0.f1687c++;
                return true;
            } catch (MediaCodec.CryptoException e8) {
                throw f(e8, this.f5967Q, false, p151v2.t.r(e8.getErrorCode()));
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
            int i8 = p151v2.t.f17159a;
            p151v2.a.h(i8 >= 23);
            if (i8 >= 23) {
                try {
                    o0();
                } catch (A1.r e7) {
                    p151v2.a.G(e7, "MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.");
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
        ArrayList arrayListN = N(qVar, x4, z4);
        if (arrayListN.isEmpty() && z4) {
            arrayListN = N(qVar, this.f5967Q, false);
            if (!arrayListN.isEmpty()) {
                Log.w("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f5967Q.f283C + ", but no secure decoder available. Trying to proceed with " + arrayListN + ".");
            }
        }
        return arrayListN;
    }

    public boolean L() {
        return false;
    }

    public abstract float M(float f7, X[] xArr);

    public abstract ArrayList N(q qVar, X x4, boolean z4);

    public final E1.i O(C1010l1 c1010l1) {
        c1010l1.getClass();
        return null;
    }

    public abstract i P(m mVar, X x4, MediaCrypto mediaCrypto, float f7);

    /* JADX WARN: Code duplicated, block: B:114:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0161  */
    public final void R(m mVar, MediaCrypto mediaCrypto) {
        float fM;
        int i7;
        boolean z4;
        boolean z7;
        String str = mVar.f5925a;
        int i8 = p151v2.t.f17159a;
        if (i8 < 23) {
            fM = -1.0f;
        } else {
            float f7 = this.f5979Y;
            X[] xArr = this.f382y;
            xArr.getClass();
            fM = M(f7, xArr);
        }
        float f8 = fM > this.f5945F ? fM : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        i iVarP = P(mVar, this.f5967Q, mediaCrypto, f8);
        if (i8 >= 31) {
            B1.p pVar = this.f379e;
            pVar.getClass();
            n.a(iVarP, pVar);
        }
        try {
            p151v2.a.c("createCodec:" + str);
            this.f5980Z = this.f5941D.a(iVarP);
            p151v2.a.m();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f5986g0 = mVar;
            this.f5983d0 = f8;
            this.f5981a0 = this.f5967Q;
            if (i8 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = p151v2.t.f17162d;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i7 = 2;
                } else if (i8 < 24) {
                    i7 = 0;
                } else {
                    i7 = 0;
                }
            } else if (i8 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i7 = 0;
            } else {
                String str3 = p151v2.t.f17160b;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
            }
            this.f5987h0 = i7;
            this.f5988i0 = i8 < 21 && this.f5981a0.f285E.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.f5989j0 = i8 < 18 || (i8 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i8 == 19 && p151v2.t.f17162d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            this.f5990k0 = i8 == 29 && "c2.android.aac.decoder".equals(str);
            if (i8 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
                if (i8 <= 19) {
                    String str4 = p151v2.t.f17160b;
                    z4 = ("hb2000".equals(str4) || "stvm8".equals(str4)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str));
                }
            }
            this.f5991l0 = z4;
            this.f5992m0 = i8 == 21 && "OMX.google.aac.decoder".equals(str);
            if (i8 < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(p151v2.t.f17161c)) {
                String str5 = p151v2.t.f17160b;
                if (str5.startsWith("baffin") || str5.startsWith("grand") || str5.startsWith("fortuna") || str5.startsWith("gprimelte") || str5.startsWith("j2y18lte") || str5.startsWith("ms01")) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            } else {
                z7 = false;
            }
            this.f5993n0 = z7;
            this.f5994o0 = i8 <= 18 && this.f5981a0.f296P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            String str6 = mVar.f5925a;
            this.f5997r0 = (i8 <= 25 && "OMX.rk.video_decoder.avc".equals(str6)) || (i8 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str6)) || ((i8 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str6) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6))) || (("Amazon".equals(p151v2.t.f17161c) && "AFTS".equals(p151v2.t.f17162d) && mVar.f5930f) || L()));
            this.f5980Z.getClass();
            if ("c2.android.mp3.decoder".equals(str6)) {
                this.f5998s0 = new h();
            }
            if (this.f380f == 2) {
                this.f5999t0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f5968Q0.f1685a++;
            V(jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime, str);
        } catch (Throwable th) {
            p151v2.a.m();
            throw th;
        }
    }

    public final void S() throws A1.r {
        X x4;
        if (this.f5980Z != null || this.f6005z0 || (x4 = this.f5967Q) == null) {
            return;
        }
        if (this.f5973T == null && l0(x4)) {
            X x7 = this.f5967Q;
            E();
            String str = x7.f283C;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            g gVar = this.f5953J;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
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
        C1010l1 c1010l1 = this.f5971S;
        if (c1010l1 != null) {
            if (this.f5975U == null) {
                O(c1010l1);
                if (this.f5971S.w() == null) {
                    return;
                }
            }
            if (E1.i.f1905a) {
                int iZ = this.f5971S.z();
                if (iZ == 1) {
                    E1.c cVarW = this.f5971S.w();
                    cVarW.getClass();
                    throw f(cVarW, this.f5967Q, false, cVarW.f1901a);
                }
                if (iZ != 4) {
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

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0043 A[SYNTHETIC] */
    public final void T(MediaCrypto mediaCrypto, boolean z4) throws o {
        o oVar;
        String str;
        o oVar2;
        String diagnosticInfo;
        if (this.f5984e0 == null) {
            try {
                List listK = K(z4);
                this.f5984e0 = new ArrayDeque();
                if (!listK.isEmpty()) {
                    this.f5984e0.add((m) listK.get(0));
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
                    p151v2.a.G(e9, "MediaCodecRenderer", "Failed to initialize decoder: " + mVar2);
                    this.f5984e0.removeFirst();
                    X x4 = this.f5967Q;
                    String str2 = "Decoder init failed: " + mVar2.f5925a + ", " + x4;
                    String str3 = x4.f283C;
                    if (p151v2.t.f17159a >= 21) {
                        if (e9 instanceof MediaCodec.CodecException) {
                            diagnosticInfo = ((MediaCodec.CodecException) e9).getDiagnosticInfo();
                        } else {
                            diagnosticInfo = null;
                        }
                        str = diagnosticInfo;
                    } else {
                        str = null;
                    }
                    oVar = new o(str2, e9, str3, z4, mVar2, str);
                    U(oVar);
                    oVar2 = this.f5985f0;
                    if (oVar2 == null) {
                        this.f5985f0 = oVar;
                    } else {
                        this.f5985f0 = new o(oVar2.getMessage(), oVar2.getCause(), oVar2.f5933a, oVar2.f5934b, oVar2.f5935c, oVar2.f5936d);
                    }
                    if (!this.f5984e0.isEmpty()) {
                        throw this.f5985f0;
                    }
                }
                p151v2.a.G(e9, "MediaCodecRenderer", "Failed to initialize decoder: " + mVar2);
                this.f5984e0.removeFirst();
                X x7 = this.f5967Q;
                String str4 = "Decoder init failed: " + mVar2.f5925a + ", " + x7;
                String str5 = x7.f283C;
                if (p151v2.t.f17159a >= 21) {
                    if (e9 instanceof MediaCodec.CodecException) {
                        diagnosticInfo = ((MediaCodec.CodecException) e9).getDiagnosticInfo();
                    } else {
                        diagnosticInfo = null;
                    }
                    str = diagnosticInfo;
                } else {
                    str = null;
                }
                oVar = new o(str4, e9, str5, z4, mVar2, str);
                U(oVar);
                oVar2 = this.f5985f0;
                if (oVar2 == null) {
                    this.f5985f0 = oVar;
                } else {
                    this.f5985f0 = new o(oVar2.getMessage(), oVar2.getCause(), oVar2.f5933a, oVar2.f5934b, oVar2.f5935c, oVar2.f5936d);
                }
                if (!this.f5984e0.isEmpty()) {
                    throw this.f5985f0;
                }
            }
        }
        this.f5984e0 = null;
    }

    public abstract void U(Exception exc);

    public abstract void V(long j, long j3, String str);

    public abstract void W(String str);

    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    public D1.i X(V0 v6) {
        int i7;
        boolean z4 = true;
        this.f5962N0 = true;
        X x4 = (X) v6.f17569c;
        x4.getClass();
        if (x4.f283C == null) {
            throw f(new IllegalArgumentException(), x4, false, 4005);
        }
        C1010l1 c1010l1 = (C1010l1) v6.f17568b;
        C1010l1 c1010l2 = this.f5973T;
        if (c1010l2 != c1010l1) {
            if (c1010l1 != null) {
                c1010l1.getClass();
            }
            if (c1010l2 != null) {
                c1010l2.getClass();
            }
        }
        this.f5973T = c1010l1;
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
        C1010l1 c1010l3 = this.f5971S;
        if (c1010l3 != c1010l1) {
            if (c1010l1 != null && c1010l3 != null && p151v2.t.f17159a >= 23) {
                UUID uuid = AbstractC0029l.f466e;
                if (!uuid.equals(c1010l3.x()) && !uuid.equals(c1010l1.x())) {
                    O(c1010l1);
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
        p151v2.a.h(!z7 || p151v2.t.f17159a >= 23);
        D1.i iVarC = C(mVar, x7, x4);
        int i8 = iVarC.f1705d;
        if (i8 != 0) {
            i7 = 2;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new IllegalStateException();
                    }
                    if (n0(x4)) {
                        this.f5981a0 = x4;
                        if (!z7 || F()) {
                        }
                    } else {
                        i7 = 16;
                    }
                } else if (n0(x4)) {
                    this.f5940C0 = true;
                    this.f5942D0 = 1;
                    int i9 = this.f5987h0;
                    if (i9 != 2) {
                        if (i9 == 1) {
                            if (x4.f288H != x7.f288H || x4.f289I != x7.f289I) {
                                z4 = false;
                            }
                        } else {
                            z4 = false;
                        }
                    }
                    this.f5995p0 = z4;
                    this.f5981a0 = x4;
                    if (!z7 || F()) {
                    }
                } else {
                    i7 = 16;
                }
            } else if (n0(x4)) {
                this.f5981a0 = x4;
                if (z7) {
                    if (F()) {
                    }
                } else if (this.f5948G0) {
                    this.f5944E0 = 1;
                    if (this.f5989j0 || this.f5991l0) {
                        this.f5946F0 = 3;
                    } else {
                        this.f5946F0 = 1;
                    }
                }
            } else {
                i7 = 16;
            }
            return (i8 != 0 || (this.f5980Z == kVar && this.f5946F0 != 3)) ? iVarC : new D1.i(mVar.f5925a, x7, x4, 0, i7);
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

    public final void c0() throws A1.r {
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

    public final boolean e0(int i7) throws A1.r {
        V0 v6 = this.f376b;
        v6.k();
        D1.h hVar = this.f5947G;
        hVar.t();
        int iU = u(v6, hVar, i7 | 4);
        if (iU == -5) {
            X(v6);
            return true;
        }
        if (iU != -4 || !hVar.f(4)) {
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
                this.f5975U = null;
                j0(null);
                i0();
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
                this.f5975U = null;
                j0(null);
                i0();
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

    public final void j0(C1010l1 c1010l1) {
        C1010l1 c1010l2 = this.f5971S;
        if (c1010l2 != c1010l1) {
            if (c1010l1 != null) {
                c1010l1.t(null);
            }
            if (c1010l2 != null) {
                c1010l2.F(null);
            }
        }
        this.f5971S = c1010l1;
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
        boolean zB;
        if (this.f5967Q == null) {
            return false;
        }
        if (k()) {
            zB = this.f373B;
        } else {
            W w7 = this.f381x;
            w7.getClass();
            zB = w7.b();
        }
        if (!zB) {
            if (!(this.f6001v0 >= 0) && (this.f5999t0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f5999t0)) {
                return false;
            }
        }
        return true;
    }

    public abstract int m0(q qVar, X x4);

    public final boolean n0(X x4) throws A1.r {
        if (p151v2.t.f17159a >= 23 && this.f5980Z != null && this.f5946F0 != 3 && this.f380f != 0) {
            float f7 = this.f5979Y;
            X[] xArr = this.f382y;
            xArr.getClass();
            float fM = M(f7, xArr);
            float f8 = this.f5983d0;
            if (f8 == fM) {
                return true;
            }
            if (fM == -1.0f) {
                if (this.f5948G0) {
                    this.f5944E0 = 1;
                    this.f5946F0 = 3;
                    return false;
                }
                f0();
                S();
                return false;
            }
            if (f8 == -1.0f && fM <= this.f5945F) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fM);
            this.f5980Z.l(bundle);
            this.f5983d0 = fM;
        }
        return true;
    }

    public final void o0() throws A1.r {
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
        Object objF;
        Object objF2;
        C0321h c0321h = this.f5955K;
        synchronized (c0321h) {
            objF = null;
            objF2 = null;
            while (c0321h.f4017c > 0 && j - ((long[]) c0321h.f4018d)[c0321h.f4016b] >= 0) {
                objF2 = c0321h.f();
            }
        }
        X x4 = (X) objF2;
        if (x4 == null && this.c0) {
            C0321h c0321h2 = this.f5955K;
            synchronized (c0321h2) {
                if (c0321h2.f4017c != 0) {
                    objF = c0321h2.f();
                }
            }
            x4 = (X) objF;
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
            p151v2.a.h(this.f5970R0 == -9223372036854775807L);
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

    @Override // A1.AbstractC0023i
    public final void v(long j, long j3) throws A1.r {
        boolean z4 = false;
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
                    p151v2.a.c("bypassRender");
                    while (B(j, j3)) {
                    }
                    p151v2.a.m();
                } else if (this.f5980Z != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    p151v2.a.c("drainAndFeed");
                    while (G(j, j3)) {
                        long j7 = this.f5977W;
                        if (!(j7 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j7)) {
                            break;
                        }
                    }
                    while (H()) {
                        long j8 = this.f5977W;
                        if (!(j8 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j8)) {
                            break;
                        }
                    }
                    p151v2.a.m();
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
            int i8 = p151v2.t.f17159a;
            if (i8 < 21 || !(e7 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e7.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e7;
                }
            }
            U(e7);
            if (i8 >= 21) {
                if (e7 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e7).isRecoverable() : false) {
                    z4 = true;
                }
            }
            if (z4) {
                f0();
            }
            throw f(D(e7, this.f5986g0), this.f5967Q, z4, 4003);
        }
    }

    @Override // A1.AbstractC0023i
    public void y(float f7, float f8) throws A1.r {
        this.f5978X = f7;
        this.f5979Y = f8;
        n0(this.f5981a0);
    }

    @Override // A1.AbstractC0023i
    public final int z(X x4) throws A1.r {
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
