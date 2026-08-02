package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class RF implements GE {

    /* renamed from: H0, reason: collision with root package name */
    public static final byte[] f11348H0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public C1112iH f11349A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f11350A0;

    /* renamed from: B, reason: collision with root package name */
    public final C1685v8 f11351B;
    public SD B0;

    /* renamed from: C, reason: collision with root package name */
    public final C1543s1 f11352C;

    /* renamed from: C0, reason: collision with root package name */
    public QF f11353C0;

    /* renamed from: D, reason: collision with root package name */
    public final float f11354D;

    /* renamed from: D0, reason: collision with root package name */
    public long f11355D0;

    /* renamed from: E, reason: collision with root package name */
    public final OD f11356E;
    public boolean E0;

    /* renamed from: F, reason: collision with root package name */
    public final OD f11357F;

    /* renamed from: F0, reason: collision with root package name */
    public Dp f11358F0;

    /* renamed from: G, reason: collision with root package name */
    public final OD f11359G;

    /* renamed from: G0, reason: collision with root package name */
    public Dp f11360G0;

    /* renamed from: H, reason: collision with root package name */
    public final IF f11361H;

    /* renamed from: I, reason: collision with root package name */
    public final MediaCodec.BufferInfo f11362I;
    public final ArrayDeque J;
    public final C0783b1 K;

    /* renamed from: L, reason: collision with root package name */
    public C1407p f11363L;

    /* renamed from: M, reason: collision with root package name */
    public C1407p f11364M;

    /* renamed from: N, reason: collision with root package name */
    public C1152jE f11365N;

    /* renamed from: O, reason: collision with root package name */
    public float f11366O;

    /* renamed from: P, reason: collision with root package name */
    public float f11367P;

    /* renamed from: Q, reason: collision with root package name */
    public KF f11368Q;

    /* renamed from: R, reason: collision with root package name */
    public C1407p f11369R;

    /* renamed from: S, reason: collision with root package name */
    public MediaFormat f11370S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f11371T;

    /* renamed from: U, reason: collision with root package name */
    public float f11372U;

    /* renamed from: V, reason: collision with root package name */
    public ArrayDeque f11373V;

    /* renamed from: W, reason: collision with root package name */
    public PF f11374W;

    /* renamed from: X, reason: collision with root package name */
    public NF f11375X;

    /* renamed from: Y, reason: collision with root package name */
    public int f11376Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f11377Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f11378a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f11379b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f11380c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f11381d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f11382e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f11383f0;

    /* renamed from: g0, reason: collision with root package name */
    public long f11384g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f11385h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f11386i0;

    /* renamed from: j0, reason: collision with root package name */
    public ByteBuffer f11387j0;

    /* renamed from: k, reason: collision with root package name */
    public final Object f11388k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f11389k0;

    /* renamed from: l, reason: collision with root package name */
    public final int f11390l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f11391l0;

    /* renamed from: m, reason: collision with root package name */
    public final C1667ur f11392m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f11393m0;

    /* renamed from: n, reason: collision with root package name */
    public KE f11394n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f11395n0;

    /* renamed from: o, reason: collision with root package name */
    public int f11396o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f11397o0;

    /* renamed from: p, reason: collision with root package name */
    public ZE f11398p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f11399p0;

    /* renamed from: q, reason: collision with root package name */
    public Nm f11400q;

    /* renamed from: q0, reason: collision with root package name */
    public int f11401q0;

    /* renamed from: r, reason: collision with root package name */
    public int f11402r;

    /* renamed from: r0, reason: collision with root package name */
    public int f11403r0;

    /* renamed from: s, reason: collision with root package name */
    public NG f11404s;

    /* renamed from: s0, reason: collision with root package name */
    public int f11405s0;

    /* renamed from: t, reason: collision with root package name */
    public C1407p[] f11406t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f11407t0;

    /* renamed from: u, reason: collision with root package name */
    public long f11408u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f11409u0;

    /* renamed from: v, reason: collision with root package name */
    public long f11410v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f11411v0;

    /* renamed from: w, reason: collision with root package name */
    public long f11412w;

    /* renamed from: w0, reason: collision with root package name */
    public long f11413w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11414x;

    /* renamed from: x0, reason: collision with root package name */
    public long f11415x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11416y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f11417y0;

    /* renamed from: z, reason: collision with root package name */
    public AbstractC0715Xa f11418z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f11419z0;

    public RF(int i, C1685v8 c1685v8, float f) {
        C1543s1 c1543s1 = C1543s1.f15417x;
        this.f11388k = new Object();
        this.f11390l = i;
        this.f11392m = new C1667ur(8);
        this.f11412w = Long.MIN_VALUE;
        this.f11418z = AbstractC0715Xa.f12197a;
        this.f11351B = c1685v8;
        this.f11352C = c1543s1;
        this.f11354D = f;
        this.f11356E = new OD(0);
        this.f11357F = new OD(0);
        this.f11359G = new OD(2);
        IF r42 = new IF(2);
        r42.f9538l = 32;
        this.f11361H = r42;
        this.f11362I = new MediaCodec.BufferInfo();
        this.f11366O = 1.0f;
        this.f11367P = 1.0f;
        this.J = new ArrayDeque();
        this.f11353C0 = QF.f11194e;
        r42.e(0);
        r42.f10938e.order(ByteOrder.nativeOrder());
        C0783b1 c0783b1 = new C0783b1();
        c0783b1.f12753m = InterfaceC1431pf.f15014a;
        c0783b1.f12752l = 0;
        c0783b1.f12751k = 2;
        this.K = c0783b1;
        this.f11372U = -1.0f;
        this.f11376Y = 0;
        this.f11401q0 = 0;
        this.f11385h0 = -1;
        this.f11386i0 = -1;
        this.f11384g0 = -9223372036854775807L;
        this.f11413w0 = -9223372036854775807L;
        this.f11415x0 = -9223372036854775807L;
        this.f11355D0 = -9223372036854775807L;
        this.f11383f0 = -9223372036854775807L;
        this.f11403r0 = 0;
        this.f11405s0 = 0;
        this.B0 = new SD();
    }

    public final void A() {
        z();
        this.f11373V = null;
        this.f11375X = null;
        this.f11369R = null;
        this.f11370S = null;
        this.f11371T = false;
        this.f11411v0 = false;
        this.f11372U = -1.0f;
        this.f11376Y = 0;
        this.f11377Z = false;
        this.f11378a0 = false;
        this.f11379b0 = false;
        this.f11382e0 = false;
        this.f11399p0 = false;
        this.f11401q0 = 0;
    }

    public final boolean B() {
        if (this.f11368Q == null) {
            return false;
        }
        int i = this.f11405s0;
        if (i == 3 || ((this.f11377Z && !this.f11411v0) || (this.f11378a0 && this.f11409u0))) {
            y();
            return true;
        }
        if (i == 2) {
            int i5 = AbstractC1260lo.f14419a;
            AbstractC1668us.a0(i5 >= 23);
            if (i5 >= 23) {
                try {
                    Dp dp = this.f11360G0;
                    dp.getClass();
                    this.f11358F0 = dp;
                    this.f11403r0 = 0;
                    this.f11405s0 = 0;
                } catch (XD e3) {
                    JB.n("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e3);
                    y();
                    return true;
                }
            }
        }
        Q();
        return false;
    }

    public boolean C(NF nf) {
        return true;
    }

    public boolean D(OD od) {
        return false;
    }

    public final void E(QF qf) {
        this.f11353C0 = qf;
        if (qf.f11197c != -9223372036854775807L) {
            this.E0 = true;
        }
    }

    public final boolean F() {
        if (this.f11407t0) {
            this.f11403r0 = 1;
            if (this.f11378a0) {
                this.f11405s0 = 3;
                return false;
            }
            this.f11405s0 = 2;
            return true;
        }
        Dp dp = this.f11360G0;
        dp.getClass();
        this.f11358F0 = dp;
        this.f11403r0 = 0;
        this.f11405s0 = 0;
        return true;
    }

    public final boolean G(long j5, long j6) {
        if (j6 >= j5) {
            return false;
        }
        C1407p c1407p = this.f11364M;
        return c1407p == null || !Objects.equals(c1407p.f14904m, "audio/opus") || j5 - j6 > 80000;
    }

    public final boolean H(int i) {
        OD od = this.f11356E;
        C1667ur c1667ur = this.f11392m;
        c1667ur.f15915m = null;
        c1667ur.f15914l = null;
        od.d();
        int c02 = c0(c1667ur, od, i | 4);
        if (c02 == -5) {
            L(c1667ur);
            return true;
        }
        if (c02 != -4 || !od.a(4)) {
            return false;
        }
        this.f11417y0 = true;
        R();
        return false;
    }

    public final boolean I(C1407p c1407p) {
        if (AbstractC1260lo.f14419a >= 23 && this.f11368Q != null && this.f11405s0 != 3 && this.f11402r != 0) {
            float f = this.f11367P;
            c1407p.getClass();
            C1407p[] c1407pArr = this.f11406t;
            c1407pArr.getClass();
            float s2 = s(f, c1407pArr);
            float f5 = this.f11372U;
            if (f5 != s2) {
                if (s2 == -1.0f) {
                    N();
                    return false;
                }
                if (f5 != -1.0f || s2 > this.f11354D) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", s2);
                    KF kf = this.f11368Q;
                    kf.getClass();
                    kf.p(bundle);
                    this.f11372U = s2;
                }
            }
        }
        return true;
    }

    public abstract int J(C1543s1 c1543s1, C1407p c1407p);

    public abstract TD K(NF nf, C1407p c1407p, C1407p c1407p2);

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
    
        if (F() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        if (F() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ca, code lost:
    
        if (F() == false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TD L(C1667ur c1667ur) {
        int i;
        boolean z3 = true;
        this.f11350A0 = true;
        C1407p c1407p = (C1407p) c1667ur.f15914l;
        c1407p.getClass();
        String str = c1407p.f14904m;
        if (str == null) {
            throw d0(new IllegalArgumentException("Sample MIME type is null."), c1407p, false, 4005);
        }
        if (str.equals("video/av01") && !c1407p.f14907p.isEmpty()) {
            C1649uH c1649uH = new C1649uH(c1407p);
            c1649uH.f15851o = null;
            c1407p = new C1407p(c1649uH);
        }
        C1407p c1407p2 = c1407p;
        this.f11360G0 = (Dp) c1667ur.f15915m;
        this.f11363L = c1407p2;
        if (this.f11393m0) {
            this.f11397o0 = true;
            return null;
        }
        KF kf = this.f11368Q;
        if (kf == null) {
            this.f11373V = null;
            u();
            return null;
        }
        NF nf = this.f11375X;
        nf.getClass();
        C1407p c1407p3 = this.f11369R;
        c1407p3.getClass();
        Dp dp = this.f11358F0;
        Dp dp2 = this.f11360G0;
        if (dp != dp2) {
            N();
            return new TD(nf.f10788a, c1407p3, c1407p2, 0, 128);
        }
        boolean z5 = dp2 != dp;
        AbstractC1668us.a0(!z5 || AbstractC1260lo.f14419a >= 23);
        TD K = K(nf, c1407p3, c1407p2);
        int i5 = K.f11634d;
        if (i5 != 0) {
            i = 2;
            if (i5 == 1) {
                if (I(c1407p2)) {
                    this.f11369R = c1407p2;
                    if (!z5) {
                        if (this.f11407t0) {
                            this.f11403r0 = 1;
                            if (this.f11378a0) {
                                this.f11405s0 = 3;
                            } else {
                                this.f11405s0 = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i5 != 2) {
                if (I(c1407p2)) {
                    this.f11369R = c1407p2;
                    if (z5) {
                    }
                }
                i = 16;
            } else {
                if (I(c1407p2)) {
                    this.f11399p0 = true;
                    this.f11401q0 = 1;
                    int i6 = this.f11376Y;
                    if (i6 != 2 && (i6 != 1 || c1407p2.f14911t != c1407p3.f14911t || c1407p2.f14912u != c1407p3.f14912u)) {
                        z3 = false;
                    }
                    this.f11380c0 = z3;
                    this.f11369R = c1407p2;
                    if (z5) {
                    }
                }
                i = 16;
            }
            return (i5 != 0 || (this.f11368Q == kf && this.f11405s0 != 3)) ? K : new TD(nf.f10788a, c1407p3, c1407p2, 0, i);
        }
        N();
        i = 0;
        if (i5 != 0) {
        }
    }

    public final void M() {
        this.f11397o0 = false;
        this.f11361H.d();
        this.f11359G.d();
        this.f11395n0 = false;
        this.f11393m0 = false;
        C0783b1 c0783b1 = this.K;
        c0783b1.getClass();
        c0783b1.f12753m = InterfaceC1431pf.f15014a;
        c0783b1.f12752l = 0;
        c0783b1.f12751k = 2;
    }

    public final void N() {
        if (this.f11407t0) {
            this.f11403r0 = 1;
            this.f11405s0 = 3;
        } else {
            y();
            u();
        }
    }

    public abstract C0375o O(NF nf, C1407p c1407p, float f);

    public abstract ArrayList P(C1543s1 c1543s1, C1407p c1407p);

    public final void Q() {
        try {
            KF kf = this.f11368Q;
            AbstractC1668us.F(kf);
            kf.h();
        } finally {
            z();
        }
    }

    public final void R() {
        int i = this.f11405s0;
        if (i == 1) {
            Q();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.f11419z0 = true;
                Y();
                return;
            } else {
                y();
                u();
                return;
            }
        }
        Q();
        Dp dp = this.f11360G0;
        dp.getClass();
        this.f11358F0 = dp;
        this.f11403r0 = 0;
        this.f11405s0 = 0;
    }

    public abstract void S(OD od);

    public abstract void T(Exception exc);

    public abstract void U(long j5, long j6, String str);

    public abstract void V(String str);

    public abstract void W(C1407p c1407p, MediaFormat mediaFormat);

    public abstract void X();

    public void Y() {
    }

    public abstract boolean Z(long j5, long j6, KF kf, ByteBuffer byteBuffer, int i, int i5, int i6, long j7, boolean z3, boolean z5, C1407p c1407p);

    public boolean a0(C1407p c1407p) {
        return false;
    }

    public final int c0(C1667ur c1667ur, OD od, int i) {
        NG ng = this.f11404s;
        ng.getClass();
        int c5 = ng.c(c1667ur, od, i);
        if (c5 == -4) {
            if (od.a(4)) {
                this.f11412w = Long.MIN_VALUE;
                return this.f11414x ? -4 : -3;
            }
            long j5 = od.f10939g + this.f11408u;
            od.f10939g = j5;
            this.f11412w = Math.max(this.f11412w, j5);
            return c5;
        }
        if (c5 == -5) {
            C1407p c1407p = (C1407p) c1667ur.f15914l;
            c1407p.getClass();
            long j6 = c1407p.f14909r;
            if (j6 != Long.MAX_VALUE) {
                C1649uH c1649uH = new C1649uH(c1407p);
                c1649uH.f15853q = j6 + this.f11408u;
                c1667ur.f15914l = new C1407p(c1649uH);
                return -5;
            }
        }
        return c5;
    }

    public abstract void d();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final XD d0(Exception exc, C1407p c1407p, boolean z3, int i) {
        int i5;
        if (c1407p != null && !this.f11416y) {
            this.f11416y = true;
            try {
                i5 = r(c1407p) & 7;
            } catch (XD unused) {
            } finally {
                this.f11416y = false;
            }
            return new XD(1, exc, i, n(), this.f11396o, c1407p, c1407p != null ? 4 : i5, z3);
        }
        i5 = 4;
        return new XD(1, exc, i, n(), this.f11396o, c1407p, c1407p != null ? 4 : i5, z3);
    }

    public abstract void e();

    public final Nm e0() {
        Nm nm = this.f11400q;
        nm.getClass();
        return nm;
    }

    public abstract void f();

    public InterfaceC1556sE f0() {
        return null;
    }

    public abstract void g();

    public final void g0() {
        this.f11394n.getClass();
    }

    public final void h0() {
        synchronized (this.f11388k) {
            this.f11349A = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(C1407p[] c1407pArr, long j5, long j6, C1603tG c1603tG) {
        if (this.f11353C0.f11197c == -9223372036854775807L) {
            E(new QF(-9223372036854775807L, j5, j6));
            return;
        }
        ArrayDeque arrayDeque = this.J;
        if (arrayDeque.isEmpty()) {
            long j7 = this.f11413w0;
            if (j7 != -9223372036854775807L) {
                long j8 = this.f11355D0;
                if (j8 != -9223372036854775807L) {
                }
            }
            E(new QF(-9223372036854775807L, j5, j6));
            if (this.f11353C0.f11197c != -9223372036854775807L) {
                X();
                return;
            }
            return;
        }
        arrayDeque.add(new QF(this.f11413w0, j5, j6));
    }

    public void j0() {
        this.f11363L = null;
        E(QF.f11194e);
        this.J.clear();
        B();
    }

    public final void k(C1407p[] c1407pArr, NG ng, long j5, long j6, C1603tG c1603tG) {
        AbstractC1668us.a0(!this.f11414x);
        this.f11404s = ng;
        if (this.f11412w == Long.MIN_VALUE) {
            this.f11412w = j5;
        }
        this.f11406t = c1407pArr;
        this.f11408u = j6;
        j(c1407pArr, j5, j6, c1603tG);
    }

    public abstract void k0(boolean z3, boolean z5);

    public void l(float f, float f5) {
        this.f11366O = f;
        this.f11367P = f5;
        I(this.f11369R);
    }

    public void l0(long j5, boolean z3) {
        this.f11417y0 = false;
        this.f11419z0 = false;
        if (this.f11393m0) {
            this.f11361H.d();
            this.f11359G.d();
            this.f11395n0 = false;
            C0783b1 c0783b1 = this.K;
            c0783b1.getClass();
            c0783b1.f12753m = InterfaceC1431pf.f15014a;
            c0783b1.f12752l = 0;
            c0783b1.f12751k = 2;
        } else if (B()) {
            u();
        }
        M0.e eVar = this.f11353C0.f11198d;
        if (eVar.n() > 0) {
            this.f11350A0 = true;
        }
        eVar.s();
        this.J.clear();
    }

    public final boolean m() {
        return this.f11412w == Long.MIN_VALUE;
    }

    public abstract String n();

    /* JADX WARN: Code restructure failed: missing block: B:235:0x0526, code lost:
    
        r29.f11415x0 = r29.f11413w0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x052c, code lost:
    
        if (r29.f11401q0 != 2) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x052e, code lost:
    
        r15.d();
        r29.f11401q0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0533, code lost:
    
        r29.f11417y0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0537, code lost:
    
        if (r29.f11407t0 != false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0539, code lost:
    
        R();
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x053f, code lost:
    
        if (r29.f11382e0 != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0541, code lost:
    
        r29.f11409u0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0547, code lost:
    
        r12 = 1;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0552, code lost:
    
        r4.f(r29.f11385h0, 0, 4, 0);
        r29.f11385h0 = r3;
        r15.f10938e = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x056d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x056e, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0568, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0569, code lost:
    
        r12 = true;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0465, code lost:
    
        if (r29.f11382e0 != false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0467, code lost:
    
        r29.f11409u0 = true;
        r4.f(r29.f11385h0, 0, 4, 0);
        r29.f11385h0 = r3;
        r15.f10938e = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x047c, code lost:
    
        r29.f11403r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03b6, code lost:
    
        r26 = r5;
        r27 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x03ba, code lost:
    
        throw r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x036d, code lost:
    
        if (r29.f11364M != null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x01fc, code lost:
    
        r29.f11395n0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x020e, code lost:
    
        if (r0.k() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0210, code lost:
    
        r0.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0217, code lost:
    
        if (r0.k() != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x021b, code lost:
    
        if (r29.f11417y0 != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x021f, code lost:
    
        if (r29.f11397o0 == false) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x022b, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0221, code lost:
    
        r7 = r9;
        r8 = r12;
        r10 = r22;
        r12 = 65531;
        r9 = r6;
        r6 = r11;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02d0, code lost:
    
        r3 = -1;
        r26 = r11;
        r27 = r19;
        r7 = r22;
        r14 = r23;
        r11 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x060c A[Catch: CryptoException -> 0x0012, IllegalStateException -> 0x0610, TryCatch #19 {CryptoException -> 0x0012, blocks: (B:3:0x0005, B:5:0x0009, B:8:0x0016, B:10:0x001b, B:13:0x0021, B:409:0x0033, B:410:0x0038, B:413:0x0045, B:415:0x0064, B:417:0x0079, B:419:0x0093, B:528:0x0098, B:422:0x009c, B:425:0x00a2, B:539:0x008d, B:72:0x0433, B:74:0x0437, B:76:0x043c, B:78:0x0444, B:80:0x0448, B:82:0x0450, B:83:0x045e, B:278:0x0463, B:280:0x0467, B:281:0x047c, B:87:0x0482, B:199:0x05e2, B:201:0x05f0, B:204:0x05ff, B:205:0x0601, B:207:0x060c, B:208:0x0612, B:210:0x061a, B:212:0x0629, B:214:0x0631, B:330:0x0385, B:334:0x038a, B:337:0x0395, B:341:0x03ae, B:343:0x03f3, B:347:0x0403, B:349:0x0407, B:351:0x040b, B:352:0x0414, B:357:0x041c, B:363:0x03c3, B:365:0x03ca, B:370:0x03ba, B:378:0x03d2, B:380:0x03e8), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x061a A[Catch: CryptoException -> 0x0012, IllegalStateException -> 0x0610, TryCatch #19 {CryptoException -> 0x0012, blocks: (B:3:0x0005, B:5:0x0009, B:8:0x0016, B:10:0x001b, B:13:0x0021, B:409:0x0033, B:410:0x0038, B:413:0x0045, B:415:0x0064, B:417:0x0079, B:419:0x0093, B:528:0x0098, B:422:0x009c, B:425:0x00a2, B:539:0x008d, B:72:0x0433, B:74:0x0437, B:76:0x043c, B:78:0x0444, B:80:0x0448, B:82:0x0450, B:83:0x045e, B:278:0x0463, B:280:0x0467, B:281:0x047c, B:87:0x0482, B:199:0x05e2, B:201:0x05f0, B:204:0x05ff, B:205:0x0601, B:207:0x060c, B:208:0x0612, B:210:0x061a, B:212:0x0629, B:214:0x0631, B:330:0x0385, B:334:0x038a, B:337:0x0395, B:341:0x03ae, B:343:0x03f3, B:347:0x0403, B:349:0x0407, B:351:0x040b, B:352:0x0414, B:357:0x041c, B:363:0x03c3, B:365:0x03ca, B:370:0x03ba, B:378:0x03d2, B:380:0x03e8), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0629 A[Catch: CryptoException -> 0x0012, IllegalStateException -> 0x0610, TryCatch #19 {CryptoException -> 0x0012, blocks: (B:3:0x0005, B:5:0x0009, B:8:0x0016, B:10:0x001b, B:13:0x0021, B:409:0x0033, B:410:0x0038, B:413:0x0045, B:415:0x0064, B:417:0x0079, B:419:0x0093, B:528:0x0098, B:422:0x009c, B:425:0x00a2, B:539:0x008d, B:72:0x0433, B:74:0x0437, B:76:0x043c, B:78:0x0444, B:80:0x0448, B:82:0x0450, B:83:0x045e, B:278:0x0463, B:280:0x0467, B:281:0x047c, B:87:0x0482, B:199:0x05e2, B:201:0x05f0, B:204:0x05ff, B:205:0x0601, B:207:0x060c, B:208:0x0612, B:210:0x061a, B:212:0x0629, B:214:0x0631, B:330:0x0385, B:334:0x038a, B:337:0x0395, B:341:0x03ae, B:343:0x03f3, B:347:0x0403, B:349:0x0407, B:351:0x040b, B:352:0x0414, B:357:0x041c, B:363:0x03c3, B:365:0x03ca, B:370:0x03ba, B:378:0x03d2, B:380:0x03e8), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0463 A[EDGE_INSN: B:277:0x0463->B:278:0x0463 BREAK  A[LOOP:1: B:72:0x0433->B:98:0x04a7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x03ca A[Catch: CryptoException -> 0x0012, IllegalStateException -> 0x0083, TryCatch #19 {CryptoException -> 0x0012, blocks: (B:3:0x0005, B:5:0x0009, B:8:0x0016, B:10:0x001b, B:13:0x0021, B:409:0x0033, B:410:0x0038, B:413:0x0045, B:415:0x0064, B:417:0x0079, B:419:0x0093, B:528:0x0098, B:422:0x009c, B:425:0x00a2, B:539:0x008d, B:72:0x0433, B:74:0x0437, B:76:0x043c, B:78:0x0444, B:80:0x0448, B:82:0x0450, B:83:0x045e, B:278:0x0463, B:280:0x0467, B:281:0x047c, B:87:0x0482, B:199:0x05e2, B:201:0x05f0, B:204:0x05ff, B:205:0x0601, B:207:0x060c, B:208:0x0612, B:210:0x061a, B:212:0x0629, B:214:0x0631, B:330:0x0385, B:334:0x038a, B:337:0x0395, B:341:0x03ae, B:343:0x03f3, B:347:0x0403, B:349:0x0407, B:351:0x040b, B:352:0x0414, B:357:0x041c, B:363:0x03c3, B:365:0x03ca, B:370:0x03ba, B:378:0x03d2, B:380:0x03e8), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x014a A[Catch: IllegalStateException -> 0x00ad, CryptoException -> 0x00b1, TRY_ENTER, TryCatch #1 {CryptoException -> 0x00b1, blocks: (B:501:0x022b, B:243:0x0699, B:427:0x00aa, B:428:0x00b8, B:430:0x00bc, B:433:0x00c2, B:436:0x00dc, B:437:0x00eb, B:514:0x00f8, B:516:0x00fe, B:491:0x020a, B:493:0x0210, B:494:0x0213, B:496:0x0219, B:498:0x021d, B:441:0x010c, B:512:0x0113, B:443:0x0123, B:445:0x0133, B:448:0x0142, B:449:0x0144, B:452:0x014a, B:454:0x014e, B:456:0x0158, B:458:0x0162, B:460:0x017f, B:462:0x018e, B:463:0x018f, B:465:0x0197, B:466:0x0198, B:468:0x019f, B:470:0x01a7, B:472:0x01af, B:473:0x01b6, B:477:0x01c9, B:479:0x01cf, B:481:0x01d5, B:482:0x01da, B:485:0x01f1, B:490:0x01fc, B:505:0x01e1, B:519:0x01ff, B:17:0x0235, B:19:0x0241, B:20:0x024e, B:22:0x0252, B:28:0x025e, B:30:0x0262, B:33:0x0266, B:39:0x028d, B:41:0x0293, B:43:0x029b, B:45:0x02a5, B:52:0x02ad, B:48:0x02b0, B:57:0x02b5, B:59:0x02b6, B:61:0x02ba, B:63:0x02be, B:66:0x02c6, B:68:0x02ca, B:242:0x0675, B:211:0x0641, B:216:0x063e, B:219:0x0657, B:270:0x0659, B:273:0x0674, B:289:0x02db, B:291:0x02e9, B:293:0x02f0, B:296:0x02f6, B:299:0x0300, B:301:0x0304, B:304:0x030a, B:305:0x030e, B:307:0x0318, B:308:0x0327, B:311:0x0333, B:316:0x0342, B:318:0x0350, B:320:0x0354, B:322:0x0358, B:324:0x0364, B:325:0x036f, B:327:0x0373, B:328:0x0381, B:383:0x067d, B:385:0x037d, B:386:0x0367, B:388:0x036b, B:393:0x026b, B:395:0x0272, B:397:0x027f, B:406:0x0680, B:407:0x0681), top: B:15:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x01f8 A[LOOP:4: B:437:0x00eb->B:487:0x01f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x01e1 A[Catch: IllegalStateException -> 0x00ad, CryptoException -> 0x00b1, TryCatch #1 {CryptoException -> 0x00b1, blocks: (B:501:0x022b, B:243:0x0699, B:427:0x00aa, B:428:0x00b8, B:430:0x00bc, B:433:0x00c2, B:436:0x00dc, B:437:0x00eb, B:514:0x00f8, B:516:0x00fe, B:491:0x020a, B:493:0x0210, B:494:0x0213, B:496:0x0219, B:498:0x021d, B:441:0x010c, B:512:0x0113, B:443:0x0123, B:445:0x0133, B:448:0x0142, B:449:0x0144, B:452:0x014a, B:454:0x014e, B:456:0x0158, B:458:0x0162, B:460:0x017f, B:462:0x018e, B:463:0x018f, B:465:0x0197, B:466:0x0198, B:468:0x019f, B:470:0x01a7, B:472:0x01af, B:473:0x01b6, B:477:0x01c9, B:479:0x01cf, B:481:0x01d5, B:482:0x01da, B:485:0x01f1, B:490:0x01fc, B:505:0x01e1, B:519:0x01ff, B:17:0x0235, B:19:0x0241, B:20:0x024e, B:22:0x0252, B:28:0x025e, B:30:0x0262, B:33:0x0266, B:39:0x028d, B:41:0x0293, B:43:0x029b, B:45:0x02a5, B:52:0x02ad, B:48:0x02b0, B:57:0x02b5, B:59:0x02b6, B:61:0x02ba, B:63:0x02be, B:66:0x02c6, B:68:0x02ca, B:242:0x0675, B:211:0x0641, B:216:0x063e, B:219:0x0657, B:270:0x0659, B:273:0x0674, B:289:0x02db, B:291:0x02e9, B:293:0x02f0, B:296:0x02f6, B:299:0x0300, B:301:0x0304, B:304:0x030a, B:305:0x030e, B:307:0x0318, B:308:0x0327, B:311:0x0333, B:316:0x0342, B:318:0x0350, B:320:0x0354, B:322:0x0358, B:324:0x0364, B:325:0x036f, B:327:0x0373, B:328:0x0381, B:383:0x067d, B:385:0x037d, B:386:0x0367, B:388:0x036b, B:393:0x026b, B:395:0x0272, B:397:0x027f, B:406:0x0680, B:407:0x0681), top: B:15:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0448 A[Catch: CryptoException -> 0x0012, IllegalStateException -> 0x0083, TryCatch #19 {CryptoException -> 0x0012, blocks: (B:3:0x0005, B:5:0x0009, B:8:0x0016, B:10:0x001b, B:13:0x0021, B:409:0x0033, B:410:0x0038, B:413:0x0045, B:415:0x0064, B:417:0x0079, B:419:0x0093, B:528:0x0098, B:422:0x009c, B:425:0x00a2, B:539:0x008d, B:72:0x0433, B:74:0x0437, B:76:0x043c, B:78:0x0444, B:80:0x0448, B:82:0x0450, B:83:0x045e, B:278:0x0463, B:280:0x0467, B:281:0x047c, B:87:0x0482, B:199:0x05e2, B:201:0x05f0, B:204:0x05ff, B:205:0x0601, B:207:0x060c, B:208:0x0612, B:210:0x061a, B:212:0x0629, B:214:0x0631, B:330:0x0385, B:334:0x038a, B:337:0x0395, B:341:0x03ae, B:343:0x03f3, B:347:0x0403, B:349:0x0407, B:351:0x040b, B:352:0x0414, B:357:0x041c, B:363:0x03c3, B:365:0x03ca, B:370:0x03ba, B:378:0x03d2, B:380:0x03e8), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0482 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [long] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [long] */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, java.lang.Throwable, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.internal.ads.RF] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(long j5, long j6) {
        boolean z3;
        boolean z5;
        ?? r42;
        boolean z6;
        boolean z7;
        boolean z8;
        OD od;
        C1667ur c1667ur;
        ?? r22;
        ?? r43;
        OD od2;
        char c5;
        char c6;
        int i;
        C1407p c1407p;
        Throwable th;
        KF kf;
        MediaCodec.BufferInfo bufferInfo;
        OD od3;
        C1667ur c1667ur2;
        boolean Z4;
        boolean z9;
        int i5;
        int i6;
        ?? r14;
        boolean z10;
        KF kf2;
        OD od4;
        int c02;
        boolean z11;
        boolean z12;
        boolean z13;
        char c7;
        ?? r11;
        boolean z14;
        ?? r5;
        int i7;
        boolean z15;
        int j7;
        IF r02 = this.f11361H;
        boolean z16 = true;
        try {
            try {
            } catch (MediaCodec.CryptoException e3) {
                e = e3;
                z5 = false;
            }
        } catch (IllegalStateException e5) {
            e = e5;
            z3 = true;
        }
        if (this.f11419z0) {
            Y();
            return;
        }
        ?? r52 = 2;
        int i8 = 2;
        if (this.f11363L != null || H(2)) {
            u();
            boolean z17 = this.f11393m0;
            OD od5 = this.f11357F;
            char c8 = 0;
            char c9 = 0;
            C1667ur c1667ur3 = this.f11392m;
            int i9 = 4;
            Throwable th2 = null;
            char c10 = 65531;
            try {
                try {
                    try {
                        try {
                        } catch (MediaCodec.CryptoException e6) {
                            e = e6;
                            z5 = z17;
                        }
                    } catch (IllegalStateException e7) {
                        e = e7;
                    }
                } catch (IllegalStateException e8) {
                    e = e8;
                    r42 = z17;
                }
            } catch (IllegalStateException e9) {
                e = e9;
                z8 = false;
            }
            if (z17) {
                try {
                    Trace.beginSection("bypassRender");
                    while (true) {
                        AbstractC1668us.a0(this.f11419z0 ^ z16);
                        if (r02.k()) {
                            ByteBuffer byteBuffer = r02.f10938e;
                            int i10 = this.f11386i0;
                            int i11 = r02.i();
                            Throwable th3 = th2;
                            long j8 = r02.f10939g;
                            boolean G5 = G(this.f11410v, r02.f9536j);
                            boolean a5 = r02.a(i9);
                            C1407p c1407p2 = this.f11364M;
                            if (c1407p2 == null) {
                                throw th3;
                            }
                            od = od5;
                            c1667ur = c1667ur3;
                            if (!Z(j5, j6, null, byteBuffer, i10, 0, i11, j8, G5, a5, c1407p2)) {
                                z16 = true;
                                break;
                            } else {
                                v(r02.f9536j);
                                r02.d();
                                r22 = 0;
                            }
                        } else {
                            od = od5;
                            c1667ur = c1667ur3;
                            r22 = th2;
                        }
                        try {
                            if (!this.f11417y0) {
                                z16 = true;
                                boolean z18 = this.f11395n0;
                                OD od6 = this.f11359G;
                                if (z18) {
                                    AbstractC1668us.a0(r02.j(od6));
                                    r43 = 0;
                                    this.f11395n0 = false;
                                } else {
                                    r43 = 0;
                                }
                                if (this.f11397o0) {
                                    if (!r02.k()) {
                                        M();
                                        this.f11397o0 = r43;
                                        u();
                                        if (!this.f11393m0) {
                                            break;
                                        }
                                    } else {
                                        th2 = r22;
                                        od5 = od;
                                        c1667ur3 = c1667ur;
                                        c8 = 0;
                                        c9 = 0;
                                        i9 = 4;
                                        c10 = 65531;
                                    }
                                }
                                AbstractC1668us.a0(!this.f11417y0);
                                C1667ur c1667ur4 = c1667ur;
                                c1667ur4.f15915m = r22;
                                c1667ur4.f15914l = r22;
                                od6.d();
                                while (true) {
                                    od6.d();
                                    int c03 = c0(c1667ur4, od6, r43);
                                    if (c03 == -5) {
                                        od2 = od;
                                        c5 = 0;
                                        c6 = 0;
                                        i = 4;
                                        L(c1667ur4);
                                        break;
                                    }
                                    if (c03 != -4) {
                                        if (m()) {
                                            this.f11415x0 = this.f11413w0;
                                        }
                                        od2 = od;
                                        c5 = 0;
                                        c6 = 0;
                                        i = 4;
                                    } else {
                                        if (od6.a(4)) {
                                            this.f11417y0 = true;
                                            this.f11415x0 = this.f11413w0;
                                            i = 4;
                                            od2 = od;
                                            c5 = 0;
                                            c6 = 0;
                                            break;
                                        }
                                        long max = Math.max(this.f11413w0, od6.f10939g);
                                        this.f11413w0 = max;
                                        if (m()) {
                                            od2 = od;
                                            c6 = 0;
                                        } else {
                                            od2 = od;
                                            c6 = 0;
                                            if (od2.a(536870912)) {
                                            }
                                            if (this.f11350A0) {
                                                C1407p c1407p3 = this.f11363L;
                                                if (c1407p3 == null) {
                                                    throw r22;
                                                }
                                                this.f11364M = c1407p3;
                                                if (Objects.equals(c1407p3.f14904m, "audio/opus") && !this.f11364M.f14907p.isEmpty()) {
                                                    byte[] bArr = (byte[]) this.f11364M.f14907p.get(r43);
                                                    int i12 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                                                    C1407p c1407p4 = this.f11364M;
                                                    if (c1407p4 == null) {
                                                        throw r22;
                                                    }
                                                    C1649uH a6 = c1407p4.a();
                                                    a6.a(i12);
                                                    this.f11364M = new C1407p(a6);
                                                }
                                                W(this.f11364M, r22);
                                                this.f11350A0 = r43;
                                            }
                                            od6.f();
                                            c1407p = this.f11364M;
                                            if (c1407p == null && Objects.equals(c1407p.f14904m, "audio/opus")) {
                                                c5 = 0;
                                                if (od6.a(268435456)) {
                                                    od6.f10936c = this.f11364M;
                                                    S(od6);
                                                }
                                                i = 4;
                                                if (this.f11410v - od6.f10939g <= 80000 ? true : r43) {
                                                    C0783b1 c0783b1 = this.K;
                                                    C1407p c1407p5 = this.f11364M;
                                                    if (c1407p5 == null) {
                                                        throw r22;
                                                    }
                                                    c0783b1.c(od6, c1407p5.f14907p);
                                                }
                                            } else {
                                                i = 4;
                                                c5 = 0;
                                            }
                                            if (!r02.k()) {
                                                long j9 = this.f11410v;
                                                if (G(j9, r02.f9536j) != G(j9, od6.f10939g)) {
                                                    break;
                                                }
                                            }
                                            if (r02.j(od6)) {
                                                break;
                                            } else {
                                                od = od2;
                                            }
                                        }
                                        this.f11415x0 = max;
                                        if (this.f11350A0) {
                                        }
                                        od6.f();
                                        c1407p = this.f11364M;
                                        if (c1407p == null) {
                                        }
                                        i = 4;
                                        c5 = 0;
                                        if (!r02.k()) {
                                        }
                                        if (r02.j(od6)) {
                                        }
                                    }
                                }
                            } else {
                                z16 = true;
                                this.f11419z0 = true;
                                break;
                            }
                        } catch (IllegalStateException e10) {
                            e = e10;
                            z16 = true;
                            z17 = false;
                            r52 = z16;
                            r42 = z17;
                            z6 = e instanceof MediaCodec.CodecException;
                            if (!z6) {
                            }
                            T(e);
                            if (z6) {
                            }
                            if (z7) {
                            }
                            MF t5 = t(e, this.f11375X);
                            throw d0(t5, this.f11363L, z7, t5.f10610k == 1101 ? 4006 : 4003);
                        }
                    }
                } catch (IllegalStateException e11) {
                    e = e11;
                }
            } else {
                ?? r12 = 536870912;
                int i13 = 4;
                Throwable th4 = null;
                boolean z19 = false;
                ?? r112 = od5;
                char c11 = 0;
                if (this.f11368Q != null) {
                    e0();
                    SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    C1667ur c1667ur5 = c1667ur3;
                    while (true) {
                        KF kf3 = this.f11368Q;
                        if (kf3 == null) {
                            throw th4;
                        }
                        boolean z20 = this.f11386i0 >= 0 ? z16 : z19 ? 1 : 0;
                        MediaCodec.BufferInfo bufferInfo2 = this.f11362I;
                        if (z20) {
                            th = th4;
                            kf = kf3;
                        } else {
                            try {
                                if (this.f11379b0 && this.f11409u0) {
                                    try {
                                        j7 = kf3.j(bufferInfo2);
                                    } catch (IllegalStateException unused) {
                                        R();
                                        if (this.f11419z0) {
                                            y();
                                        }
                                        r14 = th4;
                                        i5 = -1;
                                        od3 = r112;
                                        c1667ur2 = c1667ur5;
                                        i6 = i13;
                                        z10 = r112;
                                    }
                                } else {
                                    j7 = kf3.j(bufferInfo2);
                                }
                                if (j7 >= 0) {
                                    th = th4;
                                    if (!this.f11381d0) {
                                        if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                                            R();
                                            break;
                                        }
                                        this.f11386i0 = j7;
                                        ByteBuffer B5 = kf3.B(j7);
                                        this.f11387j0 = B5;
                                        if (B5 != null) {
                                            B5.position(bufferInfo2.offset);
                                            this.f11387j0.limit(bufferInfo2.offset + bufferInfo2.size);
                                        }
                                        long j10 = bufferInfo2.presentationTimeUs;
                                        kf = kf3;
                                        this.f11389k0 = j10 < this.f11410v ? true : z19 ? 1 : 0;
                                        long j11 = this.f11415x0;
                                        this.f11391l0 = (j11 == -9223372036854775807L || j11 > j10) ? z19 ? 1 : 0 : true;
                                        C1407p c1407p6 = (C1407p) this.f11353C0.f11198d.p(j10);
                                        if (c1407p6 == null && this.E0 && this.f11370S != null) {
                                            c1407p6 = (C1407p) this.f11353C0.f11198d.o();
                                        }
                                        if (c1407p6 != null) {
                                            this.f11364M = c1407p6;
                                        } else if (this.f11371T) {
                                        }
                                        C1407p c1407p7 = this.f11364M;
                                        if (c1407p7 == null) {
                                            throw th;
                                        }
                                        W(c1407p7, this.f11370S);
                                        this.f11371T = z19;
                                        this.E0 = z19;
                                    } else {
                                        this.f11381d0 = z19;
                                        kf3.m(j7);
                                        th4 = th;
                                        z16 = true;
                                    }
                                } else if (j7 == -2) {
                                    this.f11411v0 = z16;
                                    KF kf4 = this.f11368Q;
                                    if (kf4 == null) {
                                        throw th4;
                                    }
                                    MediaFormat i14 = kf4.i();
                                    if (this.f11376Y != 0 && i14.getInteger("width") == 32 && i14.getInteger("height") == 32) {
                                        this.f11381d0 = z16;
                                    } else {
                                        this.f11370S = i14;
                                        this.f11371T = z16;
                                    }
                                } else {
                                    if (this.f11382e0) {
                                        if (!this.f11417y0) {
                                            if (this.f11403r0 == i8) {
                                            }
                                        }
                                        R();
                                    }
                                    th = th4;
                                    long j12 = this.f11383f0;
                                    if (j12 != -9223372036854775807L) {
                                        long j13 = j12 + 100;
                                        e0();
                                        if (j13 < System.currentTimeMillis()) {
                                            R();
                                        }
                                    }
                                }
                            } catch (IllegalStateException e12) {
                                e = e12;
                                z8 = z19;
                                r52 = 1;
                                r42 = z8;
                                z6 = e instanceof MediaCodec.CodecException;
                                if (!z6) {
                                }
                                T(e);
                                if (z6) {
                                }
                                if (z7) {
                                }
                                MF t52 = t(e, this.f11375X);
                                throw d0(t52, this.f11363L, z7, t52.f10610k == 1101 ? 4006 : 4003);
                            }
                        }
                        if (this.f11379b0 && this.f11409u0) {
                            try {
                                ByteBuffer byteBuffer2 = this.f11387j0;
                                int i15 = this.f11386i0;
                                int i16 = bufferInfo2.flags;
                                OD od7 = r112;
                                try {
                                    r112 = bufferInfo2.presentationTimeUs;
                                    boolean z21 = this.f11389k0;
                                    boolean z22 = this.f11391l0;
                                    C1407p c1407p8 = this.f11364M;
                                    if (c1407p8 == null) {
                                        break;
                                    }
                                    KF kf5 = kf;
                                    od3 = od7;
                                    bufferInfo = bufferInfo2;
                                    c1667ur2 = c1667ur5;
                                    try {
                                        Z4 = Z(j5, j6, kf5, byteBuffer2, i15, i16, 1, r112, z21, z22, c1407p8);
                                        z9 = r112;
                                    } catch (IllegalStateException unused2) {
                                        th = null;
                                    }
                                } catch (IllegalStateException unused3) {
                                    od3 = od7;
                                    r112 = r112;
                                    c1667ur2 = c1667ur5;
                                    R();
                                    if (this.f11419z0) {
                                    }
                                    r14 = th;
                                    i5 = -1;
                                    i6 = 4;
                                    z10 = r112;
                                    while (true) {
                                        kf2 = this.f11368Q;
                                        if (kf2 != null) {
                                            break;
                                        }
                                        if (this.f11385h0 >= 0) {
                                        }
                                        if (this.f11403r0 != 1) {
                                        }
                                        this.B0.a();
                                        od3 = od4;
                                    }
                                    Trace.endSection();
                                    this.B0.a();
                                }
                            } catch (IllegalStateException unused4) {
                                od3 = r112;
                                r112 = r112;
                            }
                            R();
                            if (this.f11419z0) {
                                y();
                            }
                            r14 = th;
                            i5 = -1;
                            i6 = 4;
                            z10 = r112;
                        } else {
                            KF kf6 = kf;
                            bufferInfo = bufferInfo2;
                            od3 = r112;
                            c1667ur2 = c1667ur5;
                            ByteBuffer byteBuffer3 = this.f11387j0;
                            int i17 = this.f11386i0;
                            int i18 = bufferInfo.flags;
                            ?? r113 = bufferInfo.presentationTimeUs;
                            boolean z23 = this.f11389k0;
                            boolean z24 = this.f11391l0;
                            C1407p c1407p9 = this.f11364M;
                            if (c1407p9 == null) {
                                throw th;
                            }
                            Z4 = Z(j5, j6, kf6, byteBuffer3, i17, i18, 1, r113, z23, z24, c1407p9);
                            z9 = r113;
                        }
                        if (!Z4) {
                            i5 = -1;
                            i6 = 4;
                            r14 = 0;
                            z10 = z9;
                            break;
                        }
                        v(bufferInfo.presentationTimeUs);
                        i6 = 4;
                        boolean z25 = (bufferInfo.flags & 4) != 0;
                        if (!z25 && this.f11409u0 && this.f11391l0) {
                            e0();
                            this.f11383f0 = System.currentTimeMillis();
                        }
                        i5 = -1;
                        this.f11386i0 = -1;
                        r14 = 0;
                        this.f11387j0 = null;
                        if (z25) {
                            R();
                            z10 = z9;
                            break;
                        }
                        i13 = 4;
                        th4 = null;
                        r112 = od3;
                        c1667ur5 = c1667ur2;
                        z16 = true;
                        z19 = false;
                        i8 = 2;
                        c11 = 0;
                        r12 = 536870912;
                    }
                    while (true) {
                        kf2 = this.f11368Q;
                        if (kf2 != null || this.f11403r0 == 2 || this.f11417y0) {
                            break;
                            break;
                        }
                        if (this.f11385h0 >= 0) {
                            int a7 = kf2.a();
                            this.f11385h0 = a7;
                            if (a7 < 0) {
                                break;
                            }
                            od4 = od3;
                            od4.f10938e = kf2.b(a7);
                            od4.d();
                        } else {
                            od4 = od3;
                        }
                        if (this.f11403r0 != 1) {
                            break;
                        }
                        try {
                        } catch (IllegalStateException e13) {
                            e = e13;
                            z3 = true;
                        }
                        if (this.f11380c0) {
                            try {
                                try {
                                    this.f11380c0 = false;
                                    ByteBuffer byteBuffer4 = od4.f10938e;
                                    if (byteBuffer4 == null) {
                                        throw r14;
                                    }
                                    byteBuffer4.put(f11348H0);
                                    z10 = false;
                                    r12 = 0;
                                    z15 = true;
                                    try {
                                        kf2.f(this.f11385h0, 38, 0, 0L);
                                        this.f11385h0 = i5;
                                        od4.f10938e = r14;
                                        this.f11407t0 = true;
                                    } catch (IllegalStateException e14) {
                                        e = e14;
                                        r52 = z15;
                                        r42 = 0;
                                        z6 = e instanceof MediaCodec.CodecException;
                                        if (!z6) {
                                        }
                                        T(e);
                                        if (z6) {
                                        }
                                        if (z7) {
                                        }
                                        MF t522 = t(e, this.f11375X);
                                        throw d0(t522, this.f11363L, z7, t522.f10610k == 1101 ? 4006 : 4003);
                                    }
                                } catch (MediaCodec.CryptoException e15) {
                                    e = e15;
                                    z5 = false;
                                    throw d0(e, this.f11363L, z5, AbstractC1260lo.o(e.getErrorCode()));
                                }
                            } catch (IllegalStateException e16) {
                                e = e16;
                                z15 = true;
                            }
                        } else {
                            if (this.f11401q0 == 1) {
                                int i19 = 0;
                                while (true) {
                                    C1407p c1407p10 = this.f11369R;
                                    if (c1407p10 == null) {
                                        throw r14;
                                    }
                                    if (i19 >= c1407p10.f14907p.size()) {
                                        this.f11401q0 = 2;
                                        break;
                                    }
                                    byte[] bArr2 = (byte[]) this.f11369R.f14907p.get(i19);
                                    ByteBuffer byteBuffer5 = od4.f10938e;
                                    if (byteBuffer5 == null) {
                                        throw r14;
                                    }
                                    byteBuffer5.put(bArr2);
                                    i19++;
                                }
                            }
                            ByteBuffer byteBuffer6 = od4.f10938e;
                            if (byteBuffer6 == null) {
                                throw r14;
                            }
                            int position = byteBuffer6.position();
                            C1667ur c1667ur6 = c1667ur2;
                            c1667ur6.f15915m = r14;
                            c1667ur6.f15914l = r14;
                            try {
                                c02 = c0(c1667ur6, od4, 0);
                            } catch (ND e17) {
                                T(e17);
                                H(0);
                                Q();
                                z10 = z10;
                                r12 = r12;
                            }
                            if (c02 != -3) {
                                if (c02 != -5) {
                                    if (od4.a(i6)) {
                                        try {
                                            break;
                                        } catch (MediaCodec.CryptoException e18) {
                                            e = e18;
                                            z13 = false;
                                        } catch (IllegalStateException e19) {
                                            e = e19;
                                            z11 = true;
                                            z12 = false;
                                        }
                                    } else {
                                        try {
                                            try {
                                                boolean z26 = true;
                                                boolean z27 = false;
                                                if (!this.f11407t0 && !od4.c()) {
                                                    od4.d();
                                                    z10 = z27;
                                                    r12 = z26;
                                                    if (this.f11401q0 == 2) {
                                                        this.f11401q0 = 1;
                                                        z10 = z27;
                                                        r12 = z26;
                                                    }
                                                } else if (D(od4)) {
                                                    od4.d();
                                                    this.B0.f11514d++;
                                                    z10 = z27;
                                                    r12 = z26;
                                                } else {
                                                    boolean g5 = od4.g();
                                                    C1645uD c1645uD = od4.f10937d;
                                                    if (g5) {
                                                        c1645uD.a(position);
                                                    }
                                                    try {
                                                        long j14 = od4.f10939g;
                                                        if (this.f11350A0) {
                                                            ArrayDeque arrayDeque = this.J;
                                                            if (arrayDeque.isEmpty()) {
                                                                M0.e eVar = this.f11353C0.f11198d;
                                                                C1407p c1407p11 = this.f11363L;
                                                                if (c1407p11 == null) {
                                                                    throw r14;
                                                                }
                                                                eVar.r(j14, c1407p11);
                                                            } else {
                                                                M0.e eVar2 = ((QF) arrayDeque.peekLast()).f11198d;
                                                                C1407p c1407p12 = this.f11363L;
                                                                if (c1407p12 == null) {
                                                                    throw r14;
                                                                }
                                                                eVar2.r(j14, c1407p12);
                                                            }
                                                            this.f11350A0 = false;
                                                        }
                                                        try {
                                                            long max2 = Math.max(this.f11413w0, j14);
                                                            this.f11413w0 = max2;
                                                            if (m()) {
                                                                c7 = 0;
                                                            } else {
                                                                r11 = 536870912;
                                                                c7 = 0;
                                                                if (od4.a(536870912)) {
                                                                }
                                                                od4.f();
                                                                if (od4.a(268435456)) {
                                                                    S(od4);
                                                                }
                                                                w();
                                                                b0();
                                                                if (g5) {
                                                                    int i20 = this.f11385h0;
                                                                    ByteBuffer byteBuffer7 = od4.f10938e;
                                                                    if (byteBuffer7 == null) {
                                                                        throw r14;
                                                                    }
                                                                    int limit = byteBuffer7.limit();
                                                                    boolean z28 = r11 == true ? 1 : 0;
                                                                    z14 = false;
                                                                    r5 = 1;
                                                                    i7 = 0;
                                                                    kf2.f(i20, limit, 0, j14);
                                                                } else {
                                                                    kf2.c(this.f11385h0, c1645uD, j14);
                                                                    boolean z29 = r11 == true ? 1 : 0;
                                                                    r5 = 1;
                                                                    i7 = 0;
                                                                    z14 = r11;
                                                                }
                                                                this.f11385h0 = i5;
                                                                od4.f10938e = r14;
                                                                this.f11407t0 = r5;
                                                                this.f11401q0 = i7;
                                                                this.B0.f11513c += r5;
                                                                z10 = z14;
                                                                r12 = j14;
                                                            }
                                                            this.f11415x0 = max2;
                                                            r11 = c7;
                                                            od4.f();
                                                            if (od4.a(268435456)) {
                                                            }
                                                            w();
                                                            b0();
                                                            if (g5) {
                                                            }
                                                            this.f11385h0 = i5;
                                                            od4.f10938e = r14;
                                                            this.f11407t0 = r5;
                                                            this.f11401q0 = i7;
                                                            this.B0.f11513c += r5;
                                                            z10 = z14;
                                                            r12 = j14;
                                                        } catch (IllegalStateException e20) {
                                                            e = e20;
                                                            z3 = true;
                                                            r42 = 0;
                                                            r52 = z3;
                                                            z6 = e instanceof MediaCodec.CodecException;
                                                            if (!z6) {
                                                            }
                                                            T(e);
                                                            if (z6) {
                                                            }
                                                            if (z7) {
                                                            }
                                                            MF t5222 = t(e, this.f11375X);
                                                            throw d0(t5222, this.f11363L, z7, t5222.f10610k == 1101 ? 4006 : 4003);
                                                        }
                                                    } catch (IllegalStateException e21) {
                                                        e = e21;
                                                        r42 = 0;
                                                        r52 = 1;
                                                    }
                                                }
                                            } catch (MediaCodec.CryptoException e22) {
                                                e = e22;
                                                z13 = z10;
                                                z5 = z13;
                                                throw d0(e, this.f11363L, z5, AbstractC1260lo.o(e.getErrorCode()));
                                            }
                                        } catch (IllegalStateException e23) {
                                            e = e23;
                                            z12 = z10;
                                            z11 = r12;
                                        }
                                    }
                                    e = e23;
                                    z12 = z10;
                                    z11 = r12;
                                    r42 = z12;
                                    r52 = z11;
                                    z6 = e instanceof MediaCodec.CodecException;
                                    if (!z6) {
                                        StackTraceElement[] stackTrace = e.getStackTrace();
                                        if (stackTrace.length <= 0 || !stackTrace[r42].getClassName().equals("android.media.MediaCodec")) {
                                            throw e;
                                        }
                                    }
                                    T(e);
                                    z7 = (z6 || !((MediaCodec.CodecException) e).isRecoverable()) ? r42 : r52;
                                    if (z7) {
                                        y();
                                    }
                                    MF t52222 = t(e, this.f11375X);
                                    throw d0(t52222, this.f11363L, z7, t52222.f10610k == 1101 ? 4006 : 4003);
                                }
                                if (this.f11401q0 == 2) {
                                    od4.d();
                                    this.f11401q0 = 1;
                                }
                                L(c1667ur6);
                                z10 = z10;
                                r12 = r12;
                                c1667ur2 = c1667ur6;
                            } else if (m()) {
                                this.f11415x0 = this.f11413w0;
                            }
                        }
                        od3 = od4;
                    }
                    Trace.endSection();
                } else {
                    SD sd = this.B0;
                    int i21 = sd.f11514d;
                    NG ng = this.f11404s;
                    ng.getClass();
                    sd.f11514d = i21 + ng.a(j5 - this.f11408u);
                    H(1);
                }
            }
            this.B0.a();
        }
    }

    public abstract boolean p();

    public boolean q() {
        boolean b3;
        if (this.f11363L == null) {
            return false;
        }
        if (m()) {
            b3 = this.f11414x;
        } else {
            NG ng = this.f11404s;
            ng.getClass();
            b3 = ng.b();
        }
        if (b3 || this.f11386i0 >= 0) {
            return true;
        }
        if (this.f11384g0 == -9223372036854775807L) {
            return false;
        }
        this.f11400q.getClass();
        return SystemClock.elapsedRealtime() < this.f11384g0;
    }

    public final int r(C1407p c1407p) {
        try {
            return J(this.f11352C, c1407p);
        } catch (UF e3) {
            throw d0(e3, c1407p, false, 4002);
        }
    }

    public abstract float s(float f, C1407p[] c1407pArr);

    public MF t(IllegalStateException illegalStateException, NF nf) {
        return new MF(illegalStateException, nf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x058e A[Catch: PF -> 0x0081, TryCatch #0 {PF -> 0x0081, blocks: (B:28:0x0056, B:30:0x005b, B:367:0x005f, B:369:0x0075, B:370:0x0086, B:32:0x0092, B:34:0x009a, B:36:0x009e, B:38:0x00a2, B:40:0x00ab, B:107:0x0574, B:109:0x058e, B:110:0x05ae, B:115:0x05b5, B:116:0x05b7, B:117:0x0591, B:358:0x05ba, B:360:0x05bb, B:363:0x05c0, B:364:0x05c1, B:365:0x05ca, B:374:0x0089, B:375:0x0091, B:377:0x05cc), top: B:27:0x0056, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0591 A[Catch: PF -> 0x0081, TryCatch #0 {PF -> 0x0081, blocks: (B:28:0x0056, B:30:0x005b, B:367:0x005f, B:369:0x0075, B:370:0x0086, B:32:0x0092, B:34:0x009a, B:36:0x009e, B:38:0x00a2, B:40:0x00ab, B:107:0x0574, B:109:0x058e, B:110:0x05ae, B:115:0x05b5, B:116:0x05b7, B:117:0x0591, B:358:0x05ba, B:360:0x05bb, B:363:0x05c0, B:364:0x05c1, B:365:0x05ca, B:374:0x0089, B:375:0x0091, B:377:0x05cc), top: B:27:0x0056, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0543 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04bd A[Catch: Exception -> 0x0491, TryCatch #6 {Exception -> 0x0491, blocks: (B:146:0x0484, B:82:0x0497, B:84:0x049d, B:87:0x04a9, B:89:0x04af, B:93:0x0507, B:95:0x050d, B:124:0x04bd, B:126:0x04c5, B:128:0x04cd, B:130:0x04d5, B:132:0x04dd, B:134:0x04e5, B:136:0x04ed, B:138:0x04f7, B:140:0x0501), top: B:145:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0484 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0472 A[Catch: Exception -> 0x0224, TryCatch #10 {Exception -> 0x0224, blocks: (B:195:0x021d, B:216:0x0209, B:219:0x0226, B:224:0x0250, B:227:0x0264, B:229:0x0269, B:233:0x0273, B:235:0x0279, B:239:0x028b, B:242:0x0298, B:245:0x02a5, B:246:0x02ad, B:248:0x02b1, B:249:0x02bb, B:252:0x02c5, B:253:0x02e1, B:255:0x02e5, B:257:0x02f5, B:258:0x02fa, B:260:0x02fe, B:261:0x0303, B:264:0x0314, B:266:0x0322, B:267:0x0327, B:269:0x032b, B:270:0x0330, B:272:0x0334, B:273:0x0339, B:275:0x033d, B:276:0x0342, B:278:0x0346, B:279:0x034b, B:281:0x034f, B:282:0x0354, B:284:0x0358, B:285:0x035d, B:287:0x0361, B:288:0x0366, B:290:0x036a, B:291:0x036f, B:293:0x0373, B:294:0x0378, B:296:0x037c, B:297:0x0381, B:299:0x0385, B:300:0x038a, B:302:0x038e, B:303:0x0393, B:305:0x0397, B:306:0x039c, B:308:0x03a0, B:309:0x03a5, B:311:0x03a9, B:312:0x03ae, B:313:0x03b8, B:315:0x03bb, B:316:0x03c5, B:60:0x03f8, B:62:0x0404, B:64:0x040c, B:66:0x0416, B:68:0x041e, B:70:0x0426, B:73:0x046c, B:75:0x0472, B:78:0x047e, B:155:0x0435, B:157:0x043d, B:160:0x0448, B:162:0x0452, B:164:0x045a, B:166:0x0462), top: B:215:0x0209 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x049d A[Catch: Exception -> 0x0491, TryCatch #6 {Exception -> 0x0491, blocks: (B:146:0x0484, B:82:0x0497, B:84:0x049d, B:87:0x04a9, B:89:0x04af, B:93:0x0507, B:95:0x050d, B:124:0x04bd, B:126:0x04c5, B:128:0x04cd, B:130:0x04d5, B:132:0x04dd, B:134:0x04e5, B:136:0x04ed, B:138:0x04f7, B:140:0x0501), top: B:145:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04af A[Catch: Exception -> 0x0491, TryCatch #6 {Exception -> 0x0491, blocks: (B:146:0x0484, B:82:0x0497, B:84:0x049d, B:87:0x04a9, B:89:0x04af, B:93:0x0507, B:95:0x050d, B:124:0x04bd, B:126:0x04c5, B:128:0x04cd, B:130:0x04d5, B:132:0x04dd, B:134:0x04e5, B:136:0x04ed, B:138:0x04f7, B:140:0x0501), top: B:145:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x050d A[Catch: Exception -> 0x0491, TRY_LEAVE, TryCatch #6 {Exception -> 0x0491, blocks: (B:146:0x0484, B:82:0x0497, B:84:0x049d, B:87:0x04a9, B:89:0x04af, B:93:0x0507, B:95:0x050d, B:124:0x04bd, B:126:0x04c5, B:128:0x04cd, B:130:0x04d5, B:132:0x04dd, B:134:0x04e5, B:136:0x04ed, B:138:0x04f7, B:140:0x0501), top: B:145:0x0484 }] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v17 */
    /* JADX WARN: Type inference failed for: r23v18 */
    /* JADX WARN: Type inference failed for: r23v19 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v20 */
    /* JADX WARN: Type inference failed for: r23v21 */
    /* JADX WARN: Type inference failed for: r23v22 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.google.android.gms.internal.ads.RF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.v8] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.android.gms.internal.ads.KF] */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v12, types: [Q2.o] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.google.android.gms.internal.ads.Qs] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        C1407p c1407p;
        ArrayDeque arrayDeque;
        int i;
        char c5;
        int i5;
        ?? r23;
        NF nf;
        PF pf;
        C1407p c1407p2;
        float f;
        float s2;
        NF nf2;
        long elapsedRealtime;
        ?? O5;
        boolean equals;
        String stringId;
        long elapsedRealtime2;
        ArrayDeque arrayDeque2;
        int i6;
        ArrayDeque arrayDeque3;
        ArrayDeque arrayDeque4;
        int i7;
        int i8;
        int i9;
        ?? r5;
        ?? r02;
        LogSessionId unused;
        int i10 = 23;
        char c6 = ' ';
        int i11 = 1;
        if (this.f11368Q != null || this.f11393m0 || (c1407p = this.f11363L) == null) {
            return;
        }
        if (this.f11360G0 == null && a0(c1407p)) {
            M();
            String str = c1407p.f14904m;
            boolean equals2 = "audio/mp4a-latm".equals(str);
            IF r32 = this.f11361H;
            if (equals2 || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                r32.f9538l = 32;
            } else {
                r32.f9538l = 1;
            }
            this.f11393m0 = true;
            return;
        }
        Dp dp = this.f11360G0;
        this.f11358F0 = dp;
        if (dp != null) {
            int i12 = BF.f7799a;
        }
        try {
            C1407p c1407p3 = this.f11363L;
            ArrayDeque arrayDeque5 = null;
            if (c1407p3 == null) {
                throw null;
            }
            if (this.f11373V == null) {
                try {
                    ArrayList P5 = P(this.f11352C, c1407p3);
                    P5.isEmpty();
                    this.f11373V = new ArrayDeque();
                    if (!P5.isEmpty()) {
                        this.f11373V.add((NF) P5.get(0));
                    }
                    this.f11374W = null;
                } catch (UF e3) {
                    throw new PF(c1407p3, e3, -49998);
                }
            }
            if (this.f11373V.isEmpty()) {
                throw new PF(c1407p3, (UF) null, -49999);
            }
            ArrayDeque arrayDeque6 = this.f11373V;
            if (arrayDeque6 == null) {
                throw null;
            }
            while (this.f11368Q == null) {
                NF nf3 = (NF) arrayDeque6.peekFirst();
                if (nf3 == null) {
                    throw arrayDeque5;
                }
                if (!C(nf3)) {
                    return;
                }
                try {
                    c1407p2 = this.f11363L;
                } catch (Exception e5) {
                    e = e5;
                    arrayDeque = arrayDeque6;
                    i = i10;
                    c5 = c6;
                    i5 = i11;
                    r23 = arrayDeque5;
                }
                if (c1407p2 == null) {
                    throw arrayDeque5;
                }
                String str2 = nf3.f10788a;
                int i13 = AbstractC1260lo.f14419a;
                if (i13 < i10) {
                    c5 = c6;
                    s2 = -1.0f;
                    f = -1.0f;
                } else {
                    f = -1.0f;
                    float f5 = this.f11367P;
                    c5 = c6;
                    C1407p[] c1407pArr = this.f11406t;
                    c1407pArr.getClass();
                    s2 = s(f5, c1407pArr);
                }
                if (s2 <= this.f11354D) {
                    s2 = f;
                }
                try {
                    x(c1407p2);
                    this.f11400q.getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    O5 = O(nf3, c1407p2, s2);
                    i5 = i11;
                    if (i13 >= 31) {
                        try {
                            ZE ze = this.f11398p;
                            ze.getClass();
                            YE ye = ze.f12471b;
                            ye.getClass();
                            LogSessionId logSessionId = ye.f12310a;
                            unused = LogSessionId.LOG_SESSION_ID_NONE;
                            equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                            if (!equals) {
                                MediaFormat mediaFormat = (MediaFormat) O5.f5043m;
                                stringId = logSessionId.getStringId();
                                mediaFormat.setString("log-session-id", stringId);
                            }
                        } catch (Exception e6) {
                            e = e6;
                            arrayDeque = arrayDeque6;
                            nf2 = nf3;
                            i = i10;
                            r23 = arrayDeque5;
                            nf = nf2;
                            JB.n("MediaCodecRenderer", "Failed to initialize decoder: ".concat(nf.f10788a), e);
                            arrayDeque.removeFirst();
                            PF pf2 = new PF(c1407p3, e, nf);
                            T(pf2);
                            pf = this.f11374W;
                            if (pf == null) {
                                this.f11374W = pf2;
                            } else {
                                this.f11374W = new PF(pf.getMessage(), pf.getCause(), pf.f11074k, pf.f11075l, pf.f11076m);
                            }
                            if (arrayDeque.isEmpty()) {
                                throw this.f11374W;
                            }
                            i10 = i;
                            c6 = c5;
                            i11 = i5;
                            arrayDeque5 = r23;
                            arrayDeque6 = arrayDeque;
                        }
                    }
                    try {
                        Trace.beginSection("createCodec:" + str2);
                        ?? b3 = this.f11351B.b(O5);
                        this.f11368Q = b3;
                        O5 = new Qs(11, (Object) this);
                        b3.o(O5);
                        Trace.endSection();
                        this.f11400q.getClass();
                        elapsedRealtime2 = SystemClock.elapsedRealtime();
                        if (nf3.c(c1407p2)) {
                            arrayDeque = arrayDeque6;
                            r23 = arrayDeque5;
                            i6 = 2;
                        } else {
                            try {
                                StringBuilder sb = new StringBuilder();
                                sb.append("id=");
                                sb.append(c1407p2.f14894a);
                                sb.append(", mimeType=");
                                sb.append(c1407p2.f14904m);
                                String str3 = c1407p2.f14903l;
                                if (str3 != null) {
                                    sb.append(", container=");
                                    sb.append(str3);
                                }
                                int i14 = c1407p2.i;
                                if (i14 != -1) {
                                    sb.append(", bitrate=");
                                    sb.append(i14);
                                }
                                String str4 = c1407p2.f14901j;
                                if (str4 != null) {
                                    sb.append(", codecs=");
                                    sb.append(str4);
                                }
                                C1334nG c1334nG = c1407p2.f14908q;
                                if (c1334nG != null) {
                                    ArrayDeque arrayDeque7 = arrayDeque5;
                                    try {
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        int i15 = 0;
                                        i6 = 2;
                                        while (i15 < c1334nG.f14648n) {
                                            try {
                                                UUID uuid = c1334nG.f14645k[i15].f12192l;
                                                if (uuid.equals(AbstractC1644uC.f15804b)) {
                                                    linkedHashSet.add("cenc");
                                                } else if (uuid.equals(AbstractC1644uC.f15805c)) {
                                                    linkedHashSet.add("clearkey");
                                                } else if (uuid.equals(AbstractC1644uC.f15807e)) {
                                                    linkedHashSet.add("playready");
                                                } else if (uuid.equals(AbstractC1644uC.f15806d)) {
                                                    linkedHashSet.add("widevine");
                                                } else if (uuid.equals(AbstractC1644uC.f15803a)) {
                                                    linkedHashSet.add("universal");
                                                } else {
                                                    String obj = uuid.toString();
                                                    StringBuilder sb2 = new StringBuilder();
                                                    arrayDeque = arrayDeque6;
                                                    try {
                                                        sb2.append("unknown (");
                                                        sb2.append(obj);
                                                        sb2.append(")");
                                                        linkedHashSet.add(sb2.toString());
                                                        i15++;
                                                        arrayDeque6 = arrayDeque;
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        arrayDeque3 = arrayDeque7;
                                                        nf = nf3;
                                                        i = 23;
                                                        r23 = arrayDeque3;
                                                        JB.n("MediaCodecRenderer", "Failed to initialize decoder: ".concat(nf.f10788a), e);
                                                        arrayDeque.removeFirst();
                                                        PF pf22 = new PF(c1407p3, e, nf);
                                                        T(pf22);
                                                        pf = this.f11374W;
                                                        if (pf == null) {
                                                        }
                                                        if (arrayDeque.isEmpty()) {
                                                        }
                                                    }
                                                }
                                                arrayDeque = arrayDeque6;
                                                i15++;
                                                arrayDeque6 = arrayDeque;
                                            } catch (Exception e8) {
                                                e = e8;
                                                arrayDeque = arrayDeque6;
                                                arrayDeque3 = arrayDeque7;
                                            }
                                        }
                                        arrayDeque = arrayDeque6;
                                        sb.append(", drm=[");
                                        AbstractC0952et.O(sb, linkedHashSet.iterator(), ",");
                                        sb.append(']');
                                        arrayDeque4 = arrayDeque7;
                                    } catch (Exception e9) {
                                        e = e9;
                                        arrayDeque = arrayDeque6;
                                        arrayDeque2 = arrayDeque7;
                                        i6 = 2;
                                        arrayDeque3 = arrayDeque2;
                                        nf = nf3;
                                        i = 23;
                                        r23 = arrayDeque3;
                                        JB.n("MediaCodecRenderer", "Failed to initialize decoder: ".concat(nf.f10788a), e);
                                        arrayDeque.removeFirst();
                                        PF pf222 = new PF(c1407p3, e, nf);
                                        T(pf222);
                                        pf = this.f11374W;
                                        if (pf == null) {
                                        }
                                        if (arrayDeque.isEmpty()) {
                                        }
                                    }
                                } else {
                                    arrayDeque = arrayDeque6;
                                    arrayDeque4 = arrayDeque5;
                                    i6 = 2;
                                }
                                int i16 = c1407p2.f14911t;
                                if (i16 != -1 && (i7 = c1407p2.f14912u) != -1) {
                                    sb.append(", res=");
                                    sb.append(i16);
                                    sb.append("x");
                                    sb.append(i7);
                                }
                                C1242lE c1242lE = c1407p2.f14885A;
                                if (c1242lE != null) {
                                    if (((c1242lE.f14336e == -1 || c1242lE.f == -1) ? 0 : i5) != 0 || c1242lE.d()) {
                                        sb.append(", color=");
                                        sb.append(c1242lE.c());
                                    }
                                }
                                float f6 = c1407p2.f14913v;
                                if (f6 != f) {
                                    sb.append(", fps=");
                                    sb.append(f6);
                                }
                                int i17 = c1407p2.f14886B;
                                if (i17 != -1) {
                                    sb.append(", channels=");
                                    sb.append(i17);
                                }
                                int i18 = c1407p2.f14887C;
                                if (i18 != -1) {
                                    sb.append(", sample_rate=");
                                    sb.append(i18);
                                }
                                if (c1407p2.f14897d != null) {
                                    sb.append(", language=");
                                    sb.append(c1407p2.f14897d);
                                }
                                if (!c1407p2.f14896c.isEmpty()) {
                                    sb.append(", labels=[");
                                    AbstractC0952et.O(sb, AbstractC1400ot.z(c1407p2.f14896c, new C1364o1(23)).iterator(), ",");
                                    sb.append("]");
                                }
                                if (c1407p2.f14898e != 0) {
                                    sb.append(", selectionFlags=[");
                                    int i19 = c1407p2.f14898e;
                                    ArrayList arrayList = new ArrayList();
                                    if ((i19 & 1) != 0) {
                                        arrayList.add("default");
                                    }
                                    if ((i19 & 2) != 0) {
                                        arrayList.add("forced");
                                    }
                                    AbstractC0952et.O(sb, arrayList.iterator(), ",");
                                    sb.append("]");
                                }
                                int i20 = c1407p2.f;
                                if (i20 != 0) {
                                    sb.append(", roleFlags=[");
                                    ArrayList arrayList2 = new ArrayList();
                                    if ((i20 & 1) != 0) {
                                        arrayList2.add("main");
                                    }
                                    if ((i20 & 2) != 0) {
                                        arrayList2.add("alt");
                                    }
                                    if ((i20 & 4) != 0) {
                                        arrayList2.add("supplementary");
                                    }
                                    if ((i20 & 8) != 0) {
                                        arrayList2.add("commentary");
                                    }
                                    if ((i20 & 16) != 0) {
                                        arrayList2.add("dub");
                                    }
                                    if ((i20 & 32) != 0) {
                                        arrayList2.add("emergency");
                                    }
                                    if ((i20 & 64) != 0) {
                                        arrayList2.add("caption");
                                    }
                                    if ((i20 & 128) != 0) {
                                        arrayList2.add("subtitle");
                                    }
                                    if ((i20 & 256) != 0) {
                                        arrayList2.add("sign");
                                    }
                                    if ((i20 & 512) != 0) {
                                        arrayList2.add("describes-video");
                                    }
                                    if ((i20 & 1024) != 0) {
                                        arrayList2.add("describes-music");
                                    }
                                    if ((i20 & 2048) != 0) {
                                        arrayList2.add("enhanced-intelligibility");
                                    }
                                    if ((i20 & 4096) != 0) {
                                        arrayList2.add("transcribes-dialog");
                                    }
                                    if ((i20 & 8192) != 0) {
                                        arrayList2.add("easy-read");
                                    }
                                    if ((i20 & 16384) != 0) {
                                        arrayList2.add("trick-play");
                                    }
                                    if ((i20 & 32768) != 0) {
                                        arrayList2.add("auxiliary");
                                    }
                                    AbstractC0952et.O(sb, arrayList2.iterator(), ",");
                                    sb.append("]");
                                }
                                if ((i20 & 32768) != 0) {
                                    sb.append(", auxiliaryTrackType=");
                                    sb.append("undefined");
                                }
                                String sb3 = sb.toString();
                                Locale locale = Locale.US;
                                JB.l("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + sb3 + ", " + str2 + "]");
                                r23 = arrayDeque4;
                            } catch (Exception e10) {
                                e = e10;
                                arrayDeque = arrayDeque6;
                                arrayDeque2 = arrayDeque5;
                            }
                        }
                        this.f11375X = nf3;
                        this.f11372U = s2;
                        this.f11369R = c1407p2;
                        i8 = AbstractC1260lo.f14419a;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    arrayDeque = arrayDeque6;
                    nf2 = nf3;
                    i = i10;
                    i5 = i11;
                }
                if (i8 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                    String str5 = AbstractC1260lo.f14422d;
                    if (str5.startsWith("SM-T585") || str5.startsWith("SM-A510") || str5.startsWith("SM-A520") || str5.startsWith("SM-J700")) {
                        i9 = i6;
                        this.f11376Y = i9;
                        this.f11377Z = (i8 == 29 || !"c2.android.aac.decoder".equals(str2)) ? 0 : i5;
                        i = 23;
                        if (i8 <= 23) {
                            try {
                            } catch (Exception e12) {
                                e = e12;
                                nf = nf3;
                                r23 = r23;
                                JB.n("MediaCodecRenderer", "Failed to initialize decoder: ".concat(nf.f10788a), e);
                                arrayDeque.removeFirst();
                                PF pf2222 = new PF(c1407p3, e, nf);
                                T(pf2222);
                                pf = this.f11374W;
                                if (pf == null) {
                                }
                                if (arrayDeque.isEmpty()) {
                                }
                            }
                            if ("OMX.google.vorbis.decoder".equals(str2)) {
                                r5 = i5;
                                this.f11378a0 = r5;
                                this.f11379b0 = (i8 == 21 || !"OMX.google.aac.decoder".equals(str2)) ? 0 : i5;
                                String str6 = nf3.f10788a;
                                if (i8 <= 25) {
                                    if ("OMX.rk.video_decoder.avc".equals(str6)) {
                                    }
                                    r02 = i5;
                                    this.f11382e0 = r02;
                                    if (this.f11368Q != null) {
                                        throw r23;
                                    }
                                    if (this.f11402r == i6) {
                                        try {
                                            this.f11400q.getClass();
                                            this.f11384g0 = SystemClock.elapsedRealtime() + 1000;
                                        } catch (Exception e13) {
                                            e = e13;
                                            nf = nf3;
                                            r23 = r23;
                                            JB.n("MediaCodecRenderer", "Failed to initialize decoder: ".concat(nf.f10788a), e);
                                            arrayDeque.removeFirst();
                                            PF pf22222 = new PF(c1407p3, e, nf);
                                            T(pf22222);
                                            pf = this.f11374W;
                                            if (pf == null) {
                                            }
                                            if (arrayDeque.isEmpty()) {
                                            }
                                        }
                                    }
                                    this.B0.f11511a++;
                                    O5 = nf3;
                                    try {
                                        U(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str2);
                                    } catch (Exception e14) {
                                        e = e14;
                                        nf = O5;
                                        r23 = r23;
                                    }
                                    i10 = i;
                                    c6 = c5;
                                    i11 = i5;
                                    arrayDeque5 = r23;
                                    arrayDeque6 = arrayDeque;
                                }
                                if ((i8 <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str6) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str6) && !"OMX.bcm.vdec.avc.tunnel".equals(str6) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str6) && !"OMX.bcm.vdec.hevc.tunnel".equals(str6) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str6))) && (!"Amazon".equals(AbstractC1260lo.f14421c) || !"AFTS".equals(AbstractC1260lo.f14422d) || !nf3.f)) {
                                    r02 = 0;
                                    this.f11382e0 = r02;
                                    if (this.f11368Q != null) {
                                    }
                                }
                                r02 = i5;
                                this.f11382e0 = r02;
                                if (this.f11368Q != null) {
                                }
                            }
                        }
                        r5 = 0;
                        this.f11378a0 = r5;
                        this.f11379b0 = (i8 == 21 || !"OMX.google.aac.decoder".equals(str2)) ? 0 : i5;
                        String str62 = nf3.f10788a;
                        if (i8 <= 25) {
                        }
                        if (i8 <= 29) {
                        }
                        r02 = 0;
                        this.f11382e0 = r02;
                        if (this.f11368Q != null) {
                        }
                    }
                }
                if (i8 < 24) {
                    if (!"OMX.Nvidia.h264.decode".equals(str2)) {
                        if ("OMX.Nvidia.h264.decode.secure".equals(str2)) {
                        }
                    }
                    String str7 = AbstractC1260lo.f14420b;
                    if ("flounder".equals(str7) || "flounder_lte".equals(str7) || "grouper".equals(str7) || "tilapia".equals(str7)) {
                        i9 = i5;
                        this.f11376Y = i9;
                        this.f11377Z = (i8 == 29 || !"c2.android.aac.decoder".equals(str2)) ? 0 : i5;
                        i = 23;
                        if (i8 <= 23) {
                        }
                        r5 = 0;
                        this.f11378a0 = r5;
                        this.f11379b0 = (i8 == 21 || !"OMX.google.aac.decoder".equals(str2)) ? 0 : i5;
                        String str622 = nf3.f10788a;
                        if (i8 <= 25) {
                        }
                        if (i8 <= 29) {
                        }
                        r02 = 0;
                        this.f11382e0 = r02;
                        if (this.f11368Q != null) {
                        }
                    }
                }
                i9 = 0;
                this.f11376Y = i9;
                this.f11377Z = (i8 == 29 || !"c2.android.aac.decoder".equals(str2)) ? 0 : i5;
                i = 23;
                if (i8 <= 23) {
                }
                r5 = 0;
                this.f11378a0 = r5;
                this.f11379b0 = (i8 == 21 || !"OMX.google.aac.decoder".equals(str2)) ? 0 : i5;
                String str6222 = nf3.f10788a;
                if (i8 <= 25) {
                }
                if (i8 <= 29) {
                }
                r02 = 0;
                this.f11382e0 = r02;
                if (this.f11368Q != null) {
                }
            }
            this.f11373V = arrayDeque5;
        } catch (PF e15) {
            throw d0(e15, c1407p, false, 4001);
        }
    }

    public void v(long j5) {
        this.f11355D0 = j5;
        while (true) {
            ArrayDeque arrayDeque = this.J;
            if (arrayDeque.isEmpty() || j5 < ((QF) arrayDeque.peek()).f11195a) {
                return;
            }
            QF qf = (QF) arrayDeque.poll();
            qf.getClass();
            E(qf);
            X();
        }
    }

    public void x(C1407p c1407p) {
    }

    public final void y() {
        try {
            KF kf = this.f11368Q;
            if (kf != null) {
                kf.l();
                this.B0.f11512b++;
                NF nf = this.f11375X;
                if (nf == null) {
                    throw null;
                }
                V(nf.f10788a);
            }
            this.f11368Q = null;
            this.f11358F0 = null;
            A();
        } catch (Throwable th) {
            this.f11368Q = null;
            this.f11358F0 = null;
            A();
            throw th;
        }
    }

    public void z() {
        this.f11385h0 = -1;
        this.f11357F.f10938e = null;
        this.f11386i0 = -1;
        this.f11387j0 = null;
        this.f11384g0 = -9223372036854775807L;
        this.f11409u0 = false;
        this.f11383f0 = -9223372036854775807L;
        this.f11407t0 = false;
        this.f11380c0 = false;
        this.f11381d0 = false;
        this.f11389k0 = false;
        this.f11391l0 = false;
        this.f11413w0 = -9223372036854775807L;
        this.f11415x0 = -9223372036854775807L;
        this.f11355D0 = -9223372036854775807L;
        this.f11403r0 = 0;
        this.f11405s0 = 0;
        this.f11401q0 = this.f11399p0 ? 1 : 0;
    }

    public void b0() {
    }

    public void i0() {
    }

    public void w() {
    }
}
