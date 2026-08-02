package com.google.android.gms.internal.ads;

import A0.AbstractC0039k;
import android.content.Context;
import android.media.AudioManager;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.iE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1109iE extends BC {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f13882f0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final SE f13883A;

    /* renamed from: B, reason: collision with root package name */
    public final Looper f13884B;

    /* renamed from: C, reason: collision with root package name */
    public final C1514rH f13885C;

    /* renamed from: D, reason: collision with root package name */
    public final Nm f13886D;

    /* renamed from: E, reason: collision with root package name */
    public final SurfaceHolderCallbackC0974fE f13887E;

    /* renamed from: F, reason: collision with root package name */
    public final C1019gE f13888F;

    /* renamed from: G, reason: collision with root package name */
    public final RD f13889G;

    /* renamed from: H, reason: collision with root package name */
    public final long f13890H;

    /* renamed from: I, reason: collision with root package name */
    public int f13891I;
    public int J;
    public boolean K;

    /* renamed from: L, reason: collision with root package name */
    public final LE f13892L;

    /* renamed from: M, reason: collision with root package name */
    public final ZD f13893M;

    /* renamed from: N, reason: collision with root package name */
    public M8 f13894N;

    /* renamed from: O, reason: collision with root package name */
    public P4 f13895O;

    /* renamed from: P, reason: collision with root package name */
    public Surface f13896P;

    /* renamed from: Q, reason: collision with root package name */
    public Surface f13897Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f13898R;

    /* renamed from: S, reason: collision with root package name */
    public Bm f13899S;

    /* renamed from: T, reason: collision with root package name */
    public final Mm f13900T;

    /* renamed from: U, reason: collision with root package name */
    public float f13901U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f13902V;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f13903W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f13904X;

    /* renamed from: Y, reason: collision with root package name */
    public final int f13905Y;

    /* renamed from: Z, reason: collision with root package name */
    public P4 f13906Z;

    /* renamed from: a0, reason: collision with root package name */
    public EE f13907a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f13908b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f13909c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Ps f13910d0;

    /* renamed from: e0, reason: collision with root package name */
    public PG f13911e0;

    /* renamed from: m, reason: collision with root package name */
    public final C1245lH f13912m;

    /* renamed from: n, reason: collision with root package name */
    public final M8 f13913n;

    /* renamed from: o, reason: collision with root package name */
    public final H2.j f13914o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f13915p;

    /* renamed from: q, reason: collision with root package name */
    public final ME f13916q;

    /* renamed from: r, reason: collision with root package name */
    public final RF[] f13917r;

    /* renamed from: s, reason: collision with root package name */
    public final C1112iH f13918s;

    /* renamed from: t, reason: collision with root package name */
    public final C1439pn f13919t;

    /* renamed from: u, reason: collision with root package name */
    public final C1332nE f13920u;

    /* renamed from: v, reason: collision with root package name */
    public final Fk f13921v;

    /* renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArraySet f13922w;

    /* renamed from: x, reason: collision with root package name */
    public final C1785xa f13923x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f13924y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f13925z;

    static {
        AbstractC0830c4.a("media3.exoplayer");
    }

    public C1109iE(YD yd, ME me) {
        super(5);
        Throwable th;
        PlaybackSession createPlaybackSession;
        ZE ze;
        LogSessionId sessionId;
        ZE ze2;
        LogSessionId logSessionId;
        boolean equals;
        this.f13914o = new H2.j(2);
        try {
            JB.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + AbstractC1260lo.f14423e + "]");
            this.f13915p = yd.f12292a.getApplicationContext();
            this.f13883A = new SE(yd.f12293b);
            this.f13905Y = yd.i;
            this.f13900T = yd.f12299j;
            this.f13898R = yd.f12300k;
            this.f13902V = false;
            this.f13890H = yd.f12304o;
            SurfaceHolderCallbackC0974fE surfaceHolderCallbackC0974fE = new SurfaceHolderCallbackC0974fE(this);
            this.f13887E = surfaceHolderCallbackC0974fE;
            this.f13888F = new C1019gE();
            Handler handler = new Handler(yd.f12298h);
            this.f13917r = ((Qt) yd.f12294c.f9491l).i(handler, surfaceHolderCallbackC0974fE, surfaceHolderCallbackC0974fE);
            this.f13918s = (C1112iH) yd.f12296e.mo12a();
            Context context = yd.f12295d.f8460l;
            new D();
            new C1667ur(context, 5);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.clear();
            hashMap2.clear();
            this.f13885C = C1514rH.a(yd.f12297g.f10737l);
            this.f13925z = yd.f12301l;
            this.f13892L = yd.f12302m;
            Looper looper = yd.f12298h;
            this.f13884B = looper;
            Nm nm = yd.f12293b;
            this.f13886D = nm;
            this.f13916q = me;
            this.f13921v = new Fk(looper, nm, new Fz(26));
            this.f13922w = new CopyOnWriteArraySet();
            this.f13924y = new ArrayList();
            this.f13911e0 = new PG();
            this.f13893M = ZD.f12469a;
            XE xe = null;
            this.f13912m = new C1245lH(new KE[2], new InterfaceC1200kH[2], C0981fd.f13473b, null);
            this.f13923x = new C1785xa();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i = 0; i < 20; i++) {
                int i5 = iArr[i];
                AbstractC1668us.a0(!false);
                sparseBooleanArray.append(i5, true);
            }
            this.f13918s.getClass();
            AbstractC1668us.a0(!false);
            sparseBooleanArray.append(29, true);
            AbstractC1668us.a0(!false);
            WG wg = new WG(sparseBooleanArray);
            this.f13913n = new M8(wg);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i6 = 0; i6 < wg.f12034a.size(); i6++) {
                int a5 = wg.a(i6);
                AbstractC1668us.a0(!false);
                sparseBooleanArray2.append(a5, true);
            }
            AbstractC1668us.a0(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC1668us.a0(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC1668us.a0(!false);
            this.f13894N = new M8(new WG(sparseBooleanArray2));
            this.f13919t = this.f13886D.a(this.f13884B, null);
            Ps ps = new Ps(this);
            this.f13910d0 = ps;
            this.f13907a0 = EE.g(this.f13912m);
            this.f13883A.f(this.f13916q, this.f13884B);
            if (AbstractC1260lo.f14419a < 31) {
                ze2 = new ZE(yd.f12307r);
                th = null;
            } else {
                Context context2 = this.f13915p;
                boolean z3 = yd.f12305p;
                String str = yd.f12307r;
                MediaMetricsManager e3 = AbstractC0039k.e(context2.getSystemService("media_metrics"));
                if (e3 == null) {
                    th = null;
                } else {
                    th = null;
                    createPlaybackSession = e3.createPlaybackSession();
                    xe = new XE(context2, createPlaybackSession);
                }
                if (xe == null) {
                    JB.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                    ze = new ZE(logSessionId, str);
                } else {
                    if (z3) {
                        I1(xe);
                    }
                    sessionId = xe.f12177m.getSessionId();
                    ze = new ZE(sessionId, str);
                }
                ze2 = ze;
            }
            this.f13920u = new C1332nE(this.f13917r, this.f13918s, this.f13912m, (InterfaceC1422pE) yd.f.mo12a(), this.f13885C, this.f13883A, this.f13892L, yd.f12308s, yd.f12303n, this.f13884B, this.f13886D, ps, ze2, this.f13893M);
            this.f13901U = 1.0f;
            P4 p42 = P4.f11040z;
            this.f13895O = p42;
            this.f13906Z = p42;
            this.f13908b0 = -1;
            AudioManager audioManager = (AudioManager) this.f13915p.getSystemService("audio");
            int generateAudioSessionId = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i7 = AbstractC0623Jg.f10038a;
            this.f13903W = true;
            SE se = this.f13883A;
            Fk fk = this.f13921v;
            if (se == null) {
                throw th;
            }
            fk.a(se);
            C1514rH c1514rH = this.f13885C;
            Handler handler2 = new Handler(this.f13884B);
            SE se2 = this.f13883A;
            c1514rH.getClass();
            se2.getClass();
            Hq hq = c1514rH.f15295l;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) hq.f9491l;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C1380oH c1380oH = (C1380oH) it.next();
                if (c1380oH.f14800b == se2) {
                    c1380oH.f14801c = true;
                    copyOnWriteArrayList.remove(c1380oH);
                }
            }
            ((CopyOnWriteArrayList) hq.f9491l).add(new C1380oH(handler2, se2));
            this.f13922w.add(this.f13887E);
            yd.f12292a.getApplicationContext();
            new PD(handler);
            this.f13889G = new RD(yd.f12292a, handler, this.f13887E);
            yd.f12292a.getApplicationContext();
            yd.f12292a.getApplicationContext();
            C1519re c1519re = C1519re.f15321d;
            this.f13899S = Bm.f7876c;
            C1112iH c1112iH = this.f13918s;
            Mm mm = this.f13900T;
            synchronized (c1112iH.f13932c) {
                equals = c1112iH.f13936h.equals(mm);
                c1112iH.f13936h = mm;
            }
            if (!equals) {
                c1112iH.f();
            }
            y1(1, 10, Integer.valueOf(generateAudioSessionId));
            y1(2, 10, Integer.valueOf(generateAudioSessionId));
            y1(1, 3, this.f13900T);
            y1(2, 4, Integer.valueOf(this.f13898R));
            y1(2, 5, 0);
            y1(1, 9, Boolean.valueOf(this.f13902V));
            y1(2, 7, this.f13888F);
            y1(6, 8, this.f13888F);
            y1(-1, 16, Integer.valueOf(this.f13905Y));
            this.f13914o.f();
        } catch (Throwable th2) {
            this.f13914o.f();
            throw th2;
        }
    }

    public static long u1(EE ee) {
        C0603Ha c0603Ha = new C0603Ha();
        C1785xa c1785xa = new C1785xa();
        ee.f8476a.n(ee.f8477b.f15679a, c1785xa);
        long j5 = ee.f8478c;
        if (j5 != -9223372036854775807L) {
            return j5;
        }
        ee.f8476a.e(c1785xa.f16290c, c0603Ha, 0L).getClass();
        return 0L;
    }

    public final void A1(XD xd) {
        EE ee = this.f13907a0;
        EE a5 = ee.a(ee.f8477b);
        a5.f8489p = a5.f8491r;
        a5.f8490q = 0L;
        EE e3 = a5.e(1);
        if (xd != null) {
            e3 = e3.d(xd);
        }
        EE ee2 = e3;
        this.f13891I++;
        C1439pn c1439pn = this.f13920u.f14636r;
        c1439pn.getClass();
        Vm e5 = C1439pn.e();
        e5.f11938a = c1439pn.f15040a.obtainMessage(6);
        e5.a();
        C1(ee2, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final void B1(int i, int i5, boolean z3) {
        ?? r14 = (!z3 || i == -1) ? 0 : 1;
        int i6 = i == 0 ? 1 : 0;
        EE ee = this.f13907a0;
        if (ee.f8485l == r14 && ee.f8487n == i6 && ee.f8486m == i5) {
            return;
        }
        this.f13891I++;
        EE c5 = ee.c(i5, i6, r14);
        C1439pn c1439pn = this.f13920u.f14636r;
        int i7 = i5 | (i6 << 4);
        c1439pn.getClass();
        Vm e3 = C1439pn.e();
        e3.f11938a = c1439pn.f15040a.obtainMessage(1, r14, i7);
        e3.a();
        C1(c5, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x053e A[LOOP:0: B:103:0x0536->B:105:0x053e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1(final EE ee, int i, boolean z3, int i5, long j5, int i6) {
        int i7;
        boolean z5;
        Pair pair;
        boolean z6;
        int i8;
        Pair pair2;
        boolean booleanValue;
        List list;
        int i9;
        int i10;
        AbstractC0715Xa l12;
        P4 p42;
        boolean equals;
        int i11;
        int c5;
        int i12;
        int i13;
        final int i14;
        C1245lH c1245lH;
        C1245lH c1245lH2;
        final int i15;
        final int i16;
        M8 m8;
        boolean x12;
        boolean z7;
        AbstractC0715Xa l13;
        int i17;
        boolean z8;
        AbstractC0715Xa l14;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean o5;
        WG wg;
        int i18;
        M8 m82;
        int i19;
        Object obj;
        Q3 q32;
        Object obj2;
        int i20;
        long j6;
        long u12;
        Object obj3;
        Q3 q33;
        Object obj4;
        int i21;
        int i22 = i5;
        EE ee2 = this.f13907a0;
        this.f13907a0 = ee;
        boolean equals2 = ee2.f8476a.equals(ee.f8476a);
        AbstractC0715Xa abstractC0715Xa = ee2.f8476a;
        AbstractC0715Xa abstractC0715Xa2 = ee.f8476a;
        int i23 = 0;
        if (abstractC0715Xa2.o() && abstractC0715Xa.o()) {
            pair2 = new Pair(Boolean.FALSE, -1);
        } else {
            if (abstractC0715Xa2.o() == abstractC0715Xa.o()) {
                if (abstractC0715Xa.e(abstractC0715Xa.n(ee2.f8477b.f15679a, this.f13923x).f16290c, (C0603Ha) this.f7794k, 0L).f9397a.equals(abstractC0715Xa2.e(abstractC0715Xa2.n(ee.f8477b.f15679a, this.f13923x).f16290c, (C0603Ha) this.f7794k, 0L).f9397a)) {
                    if (z3) {
                        if (i22 != 0) {
                            i7 = i22;
                        } else if (ee2.f8477b.f15682d < ee.f8477b.f15682d) {
                            pair = new Pair(Boolean.TRUE, 0);
                            z5 = true;
                            i7 = 0;
                        } else {
                            i7 = 0;
                        }
                        z5 = true;
                    } else {
                        i7 = i22;
                        z5 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (!z3) {
                        z6 = false;
                    } else if (i22 == 0) {
                        i22 = 0;
                        z6 = true;
                        i8 = 1;
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i8));
                        boolean z13 = z6;
                        i7 = i22;
                        z5 = z13;
                    } else {
                        z6 = true;
                    }
                    boolean z14 = z6;
                    if (z6 && i22 == 1) {
                        z6 = z14;
                        i8 = 2;
                    } else {
                        if (equals2) {
                            throw new IllegalStateException();
                        }
                        i8 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i8));
                    boolean z132 = z6;
                    i7 = i22;
                    z5 = z132;
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                ((Integer) pair.second).getClass();
                if (booleanValue) {
                    if (!ee.f8476a.o()) {
                        Q3 q34 = ee.f8476a.e(ee.f8476a.n(ee.f8477b.f15679a, this.f13923x).f16290c, (C0603Ha) this.f7794k, 0L).f9398b;
                    }
                    this.f13906Z = P4.f11040z;
                }
                if (booleanValue && ee2.f8483j.equals(ee.f8483j)) {
                    i10 = 1;
                } else {
                    P4 p43 = this.f13906Z;
                    p43.getClass();
                    C1412p4 c1412p4 = new C1412p4(p43);
                    list = ee.f8483j;
                    i9 = 0;
                    i10 = 1;
                    while (i9 < list.size()) {
                        C5 c52 = (C5) list.get(i9);
                        while (true) {
                            InterfaceC1592t5[] interfaceC1592t5Arr = c52.f7964k;
                            if (i23 < interfaceC1592t5Arr.length) {
                                interfaceC1592t5Arr[i23].d(c1412p4);
                                i23++;
                            }
                        }
                        i9++;
                        i23 = 0;
                    }
                    this.f13906Z = new P4(c1412p4);
                }
                l12 = l1();
                if (l12.o()) {
                    Q3 q35 = l12.e(b1(), (C0603Ha) this.f7794k, 0L).f9398b;
                    P4 p44 = this.f13906Z;
                    p44.getClass();
                    C1412p4 c1412p42 = new C1412p4(p44);
                    P4 p45 = q35.f11163d;
                    if (p45 != null) {
                        CharSequence charSequence = p45.f11041a;
                        if (charSequence != null) {
                            c1412p42.f14939a = charSequence;
                        }
                        CharSequence charSequence2 = p45.f11042b;
                        if (charSequence2 != null) {
                            c1412p42.f14940b = charSequence2;
                        }
                        CharSequence charSequence3 = p45.f11043c;
                        if (charSequence3 != null) {
                            c1412p42.f14941c = charSequence3;
                        }
                        CharSequence charSequence4 = p45.f11044d;
                        if (charSequence4 != null) {
                            c1412p42.f14942d = charSequence4;
                        }
                        CharSequence charSequence5 = p45.f11045e;
                        if (charSequence5 != null) {
                            c1412p42.f14943e = charSequence5;
                        }
                        byte[] bArr = p45.f;
                        if (bArr != null) {
                            c1412p42.f = (byte[]) bArr.clone();
                            c1412p42.f14944g = p45.f11046g;
                        }
                        Integer num = p45.f11047h;
                        if (num != null) {
                            c1412p42.f14945h = num;
                        }
                        Integer num2 = p45.i;
                        if (num2 != null) {
                            c1412p42.i = num2;
                        }
                        Integer num3 = p45.f11048j;
                        if (num3 != null) {
                            c1412p42.f14946j = num3;
                        }
                        Boolean bool = p45.f11049k;
                        if (bool != null) {
                            c1412p42.f14947k = bool;
                        }
                        Integer num4 = p45.f11050l;
                        if (num4 != null) {
                            c1412p42.f14948l = num4;
                        }
                        Integer num5 = p45.f11051m;
                        if (num5 != null) {
                            c1412p42.f14948l = num5;
                        }
                        Integer num6 = p45.f11052n;
                        if (num6 != null) {
                            c1412p42.f14949m = num6;
                        }
                        Integer num7 = p45.f11053o;
                        if (num7 != null) {
                            c1412p42.f14950n = num7;
                        }
                        Integer num8 = p45.f11054p;
                        if (num8 != null) {
                            c1412p42.f14951o = num8;
                        }
                        Integer num9 = p45.f11055q;
                        if (num9 != null) {
                            c1412p42.f14952p = num9;
                        }
                        Integer num10 = p45.f11056r;
                        if (num10 != null) {
                            c1412p42.f14953q = num10;
                        }
                        CharSequence charSequence6 = p45.f11057s;
                        if (charSequence6 != null) {
                            c1412p42.f14954r = charSequence6;
                        }
                        CharSequence charSequence7 = p45.f11058t;
                        if (charSequence7 != null) {
                            c1412p42.f14955s = charSequence7;
                        }
                        CharSequence charSequence8 = p45.f11059u;
                        if (charSequence8 != null) {
                            c1412p42.f14956t = charSequence8;
                        }
                        CharSequence charSequence9 = p45.f11060v;
                        if (charSequence9 != null) {
                            c1412p42.f14957u = charSequence9;
                        }
                        CharSequence charSequence10 = p45.f11061w;
                        if (charSequence10 != null) {
                            c1412p42.f14958v = charSequence10;
                        }
                        Integer num11 = p45.f11062x;
                        if (num11 != null) {
                            c1412p42.f14959w = num11;
                        }
                    }
                    p42 = new P4(c1412p42);
                } else {
                    p42 = this.f13906Z;
                }
                equals = p42.equals(this.f13895O);
                this.f13895O = p42;
                int i24 = ee2.f8485l == ee.f8485l ? i10 : 0;
                i11 = ee2.f8480e == ee.f8480e ? i10 : 0;
                if ((i11 == 0 || i24 != 0) && ((c5 = c()) == 2 || c5 == 3)) {
                    t0();
                    this.f13907a0.getClass();
                    G1();
                    G1();
                }
                i12 = ee2.f8481g == ee.f8481g ? i10 : 0;
                if (!equals2) {
                    this.f13921v.c(0, new C0751aE(ee, i));
                }
                if (z5) {
                    i13 = i24;
                } else {
                    C1785xa c1785xa = new C1785xa();
                    if (ee2.f8476a.o()) {
                        i13 = i24;
                        i19 = i6;
                        obj = null;
                        q32 = null;
                        obj2 = null;
                        i20 = -1;
                    } else {
                        Object obj5 = ee2.f8477b.f15679a;
                        ee2.f8476a.n(obj5, c1785xa);
                        int i25 = c1785xa.f16290c;
                        int a5 = ee2.f8476a.a(obj5);
                        i13 = i24;
                        obj = ee2.f8476a.e(i25, (C0603Ha) this.f7794k, 0L).f9397a;
                        q32 = ((C0603Ha) this.f7794k).f9398b;
                        obj2 = obj5;
                        i20 = a5;
                        i19 = i25;
                    }
                    if (i7 == 0) {
                        if (ee2.f8477b.b()) {
                            C1603tG c1603tG = ee2.f8477b;
                            j6 = c1785xa.a(c1603tG.f15680b, c1603tG.f15681c);
                            u12 = u1(ee2);
                            int i26 = AbstractC1260lo.f14419a;
                            C1603tG c1603tG2 = ee2.f8477b;
                            C1327n9 c1327n9 = new C1327n9(obj, i19, q32, obj2, i20, AbstractC1260lo.v(j6), AbstractC1260lo.v(u12), c1603tG2.f15680b, c1603tG2.f15681c);
                            int b12 = b1();
                            if (this.f13907a0.f8476a.o()) {
                                EE ee3 = this.f13907a0;
                                Object obj6 = ee3.f8477b.f15679a;
                                ee3.f8476a.n(obj6, this.f13923x);
                                i21 = this.f13907a0.f8476a.a(obj6);
                                obj3 = this.f13907a0.f8476a.e(b12, (C0603Ha) this.f7794k, 0L).f9397a;
                                obj4 = obj6;
                                q33 = ((C0603Ha) this.f7794k).f9398b;
                            } else {
                                obj3 = null;
                                q33 = null;
                                obj4 = null;
                                i21 = -1;
                            }
                            long v4 = AbstractC1260lo.v(j5);
                            long v5 = !this.f13907a0.f8477b.b() ? AbstractC1260lo.v(u1(this.f13907a0)) : v4;
                            C1603tG c1603tG3 = this.f13907a0.f8477b;
                            this.f13921v.c(11, new G3(i7, c1327n9, new C1327n9(obj3, b12, q33, obj4, i21, v4, v5, c1603tG3.f15680b, c1603tG3.f15681c)));
                        } else {
                            j6 = ee2.f8477b.f15683e != -1 ? u1(this.f13907a0) : c1785xa.f16291d;
                            u12 = j6;
                            int i262 = AbstractC1260lo.f14419a;
                            C1603tG c1603tG22 = ee2.f8477b;
                            C1327n9 c1327n92 = new C1327n9(obj, i19, q32, obj2, i20, AbstractC1260lo.v(j6), AbstractC1260lo.v(u12), c1603tG22.f15680b, c1603tG22.f15681c);
                            int b122 = b1();
                            if (this.f13907a0.f8476a.o()) {
                            }
                            long v42 = AbstractC1260lo.v(j5);
                            if (!this.f13907a0.f8477b.b()) {
                            }
                            C1603tG c1603tG32 = this.f13907a0.f8477b;
                            this.f13921v.c(11, new G3(i7, c1327n92, new C1327n9(obj3, b122, q33, obj4, i21, v42, v5, c1603tG32.f15680b, c1603tG32.f15681c)));
                        }
                    } else if (ee2.f8477b.b()) {
                        j6 = ee2.f8491r;
                        u12 = u1(ee2);
                        int i2622 = AbstractC1260lo.f14419a;
                        C1603tG c1603tG222 = ee2.f8477b;
                        C1327n9 c1327n922 = new C1327n9(obj, i19, q32, obj2, i20, AbstractC1260lo.v(j6), AbstractC1260lo.v(u12), c1603tG222.f15680b, c1603tG222.f15681c);
                        int b1222 = b1();
                        if (this.f13907a0.f8476a.o()) {
                        }
                        long v422 = AbstractC1260lo.v(j5);
                        if (!this.f13907a0.f8477b.b()) {
                        }
                        C1603tG c1603tG322 = this.f13907a0.f8477b;
                        this.f13921v.c(11, new G3(i7, c1327n922, new C1327n9(obj3, b1222, q33, obj4, i21, v422, v5, c1603tG322.f15680b, c1603tG322.f15681c)));
                    } else {
                        j6 = ee2.f8491r;
                        u12 = j6;
                        int i26222 = AbstractC1260lo.f14419a;
                        C1603tG c1603tG2222 = ee2.f8477b;
                        C1327n9 c1327n9222 = new C1327n9(obj, i19, q32, obj2, i20, AbstractC1260lo.v(j6), AbstractC1260lo.v(u12), c1603tG2222.f15680b, c1603tG2222.f15681c);
                        int b12222 = b1();
                        if (this.f13907a0.f8476a.o()) {
                        }
                        long v4222 = AbstractC1260lo.v(j5);
                        if (!this.f13907a0.f8477b.b()) {
                        }
                        C1603tG c1603tG3222 = this.f13907a0.f8477b;
                        this.f13921v.c(11, new G3(i7, c1327n9222, new C1327n9(obj3, b12222, q33, obj4, i21, v4222, v5, c1603tG3222.f15680b, c1603tG3222.f15681c)));
                    }
                }
                if (booleanValue) {
                    i14 = i10;
                } else {
                    i14 = i10;
                    this.f13921v.c(i14, new Fz(27));
                }
                if (ee2.f != ee.f) {
                    this.f13921v.c(10, new Yj() { // from class: com.google.android.gms.internal.ads.cE
                        @Override // com.google.android.gms.internal.ads.Yj
                        /* renamed from: k */
                        public final void mo11k(Object obj7) {
                            C1603tG c1603tG4;
                            EE ee4 = ee;
                            SE se = (SE) obj7;
                            switch (i14) {
                                case 0:
                                    int i27 = C1109iE.f13882f0;
                                    boolean z15 = ee4.f8485l;
                                    se.i(se.g(), -1, new QE(13));
                                    break;
                                default:
                                    int i28 = C1109iE.f13882f0;
                                    XD xd = ee4.f;
                                    se.getClass();
                                    se.i((!AbstractC2107A.A(xd) || (c1603tG4 = xd.f12164r) == null) ? se.g() : se.j(c1603tG4), 10, new QE(20));
                                    break;
                            }
                        }
                    });
                    if (ee.f != null) {
                        final int i27 = 2;
                        this.f13921v.c(10, new Yj() { // from class: com.google.android.gms.internal.ads.dE
                            @Override // com.google.android.gms.internal.ads.Yj
                            /* renamed from: k */
                            public final void mo11k(Object obj7) {
                                C1603tG c1603tG4;
                                EE ee4 = ee;
                                SE se = (SE) obj7;
                                switch (i27) {
                                    case 0:
                                        int i28 = C1109iE.f13882f0;
                                        int i29 = ee4.f8480e;
                                        OE g5 = se.g();
                                        se.i(g5, 4, new f2.m(g5, i29));
                                        break;
                                    case 1:
                                        int i30 = C1109iE.f13882f0;
                                        int i31 = ee4.f8487n;
                                        se.i(se.g(), 6, new QE(18));
                                        break;
                                    default:
                                        int i32 = C1109iE.f13882f0;
                                        XD xd = ee4.f;
                                        se.getClass();
                                        OE g6 = (!AbstractC2107A.A(xd) || (c1603tG4 = xd.f12164r) == null) ? se.g() : se.j(c1603tG4);
                                        se.i(g6, 10, new Qs(g6, xd));
                                        break;
                                }
                            }
                        });
                    }
                }
                c1245lH = ee2.i;
                c1245lH2 = ee.i;
                if (c1245lH != c1245lH2) {
                    C1112iH c1112iH = this.f13918s;
                    Object obj7 = c1245lH2.f14380o;
                    c1112iH.getClass();
                    this.f13921v.c(2, new C0751aE(ee, 3, (byte) 0));
                }
                if (!equals) {
                    this.f13921v.c(14, new Fz(22));
                }
                if (i12 == 0) {
                    i15 = 0;
                    this.f13921v.c(3, new Yj() { // from class: com.google.android.gms.internal.ads.bE
                        @Override // com.google.android.gms.internal.ads.Yj
                        /* renamed from: k */
                        public final void mo11k(Object obj8) {
                            EE ee4 = ee;
                            SE se = (SE) obj8;
                            switch (i15) {
                                case 0:
                                    int i28 = C1109iE.f13882f0;
                                    boolean z15 = ee4.f8481g;
                                    se.i(se.g(), 3, new QE(3));
                                    break;
                                default:
                                    int i29 = C1109iE.f13882f0;
                                    Y7 y7 = ee4.f8488o;
                                    se.i(se.g(), 12, new QE(0));
                                    break;
                            }
                        }
                    });
                } else {
                    i15 = 0;
                }
                if (i11 == 0 || i13 != 0) {
                    this.f13921v.c(-1, new Yj() { // from class: com.google.android.gms.internal.ads.cE
                        @Override // com.google.android.gms.internal.ads.Yj
                        /* renamed from: k */
                        public final void mo11k(Object obj72) {
                            C1603tG c1603tG4;
                            EE ee4 = ee;
                            SE se = (SE) obj72;
                            switch (i15) {
                                case 0:
                                    int i272 = C1109iE.f13882f0;
                                    boolean z15 = ee4.f8485l;
                                    se.i(se.g(), -1, new QE(13));
                                    break;
                                default:
                                    int i28 = C1109iE.f13882f0;
                                    XD xd = ee4.f;
                                    se.getClass();
                                    se.i((!AbstractC2107A.A(xd) || (c1603tG4 = xd.f12164r) == null) ? se.g() : se.j(c1603tG4), 10, new QE(20));
                                    break;
                            }
                        }
                    });
                }
                if (i11 != 0) {
                    this.f13921v.c(4, new Yj() { // from class: com.google.android.gms.internal.ads.dE
                        @Override // com.google.android.gms.internal.ads.Yj
                        /* renamed from: k */
                        public final void mo11k(Object obj72) {
                            C1603tG c1603tG4;
                            EE ee4 = ee;
                            SE se = (SE) obj72;
                            switch (i15) {
                                case 0:
                                    int i28 = C1109iE.f13882f0;
                                    int i29 = ee4.f8480e;
                                    OE g5 = se.g();
                                    se.i(g5, 4, new f2.m(g5, i29));
                                    break;
                                case 1:
                                    int i30 = C1109iE.f13882f0;
                                    int i31 = ee4.f8487n;
                                    se.i(se.g(), 6, new QE(18));
                                    break;
                                default:
                                    int i32 = C1109iE.f13882f0;
                                    XD xd = ee4.f;
                                    se.getClass();
                                    OE g6 = (!AbstractC2107A.A(xd) || (c1603tG4 = xd.f12164r) == null) ? se.g() : se.j(c1603tG4);
                                    se.i(g6, 10, new Qs(g6, xd));
                                    break;
                            }
                        }
                    });
                }
                if (i13 == 0 || ee2.f8486m != ee.f8486m) {
                    i16 = 1;
                    this.f13921v.c(5, new C0751aE(ee, i16, (byte) 0));
                } else {
                    i16 = 1;
                }
                if (ee2.f8487n != ee.f8487n) {
                    this.f13921v.c(6, new Yj() { // from class: com.google.android.gms.internal.ads.dE
                        @Override // com.google.android.gms.internal.ads.Yj
                        /* renamed from: k */
                        public final void mo11k(Object obj72) {
                            C1603tG c1603tG4;
                            EE ee4 = ee;
                            SE se = (SE) obj72;
                            switch (i16) {
                                case 0:
                                    int i28 = C1109iE.f13882f0;
                                    int i29 = ee4.f8480e;
                                    OE g5 = se.g();
                                    se.i(g5, 4, new f2.m(g5, i29));
                                    break;
                                case 1:
                                    int i30 = C1109iE.f13882f0;
                                    int i31 = ee4.f8487n;
                                    se.i(se.g(), 6, new QE(18));
                                    break;
                                default:
                                    int i32 = C1109iE.f13882f0;
                                    XD xd = ee4.f;
                                    se.getClass();
                                    OE g6 = (!AbstractC2107A.A(xd) || (c1603tG4 = xd.f12164r) == null) ? se.g() : se.j(c1603tG4);
                                    se.i(g6, 10, new Qs(g6, xd));
                                    break;
                            }
                        }
                    });
                }
                if (ee2.h() != ee.h()) {
                    this.f13921v.c(7, new C0751aE(ee, 2, (byte) 0));
                }
                if (!ee2.f8488o.equals(ee.f8488o)) {
                    final int i28 = 1;
                    this.f13921v.c(12, new Yj() { // from class: com.google.android.gms.internal.ads.bE
                        @Override // com.google.android.gms.internal.ads.Yj
                        /* renamed from: k */
                        public final void mo11k(Object obj8) {
                            EE ee4 = ee;
                            SE se = (SE) obj8;
                            switch (i28) {
                                case 0:
                                    int i282 = C1109iE.f13882f0;
                                    boolean z15 = ee4.f8481g;
                                    se.i(se.g(), 3, new QE(3));
                                    break;
                                default:
                                    int i29 = C1109iE.f13882f0;
                                    Y7 y7 = ee4.f8488o;
                                    se.i(se.g(), 12, new QE(0));
                                    break;
                            }
                        }
                    });
                }
                m8 = this.f13894N;
                ME me = this.f13916q;
                M8 m83 = this.f13913n;
                int i29 = AbstractC1260lo.f14419a;
                x12 = me.x1();
                AbstractC0715Xa l15 = me.l1();
                z7 = l15.o() && l15.e(me.b1(), (C0603Ha) me.f7794k, 0L).f;
                l13 = me.l1();
                if (l13.o()) {
                    int b13 = me.b1();
                    me.g();
                    me.o1();
                    int k5 = l13.k(b13);
                    i17 = -1;
                    z8 = k5 != -1;
                } else {
                    z8 = false;
                    i17 = -1;
                }
                l14 = me.l1();
                if (l14.o()) {
                    int b14 = me.b1();
                    me.g();
                    me.o1();
                    z9 = false;
                    z10 = l14.j(b14, 0, false) != i17;
                } else {
                    z9 = false;
                    z10 = false;
                }
                AbstractC0715Xa l16 = me.l1();
                z11 = (l16.o() && l16.e(me.b1(), (C0603Ha) me.f7794k, 0L).b()) ? true : z9;
                AbstractC0715Xa l17 = me.l1();
                z12 = l17.o() && l17.e(me.b1(), (C0603Ha) me.f7794k, 0L).f9402g;
                o5 = me.l1().o();
                Sm sm = new Sm();
                wg = m83.f10604a;
                for (i18 = 0; i18 < wg.f12034a.size(); i18++) {
                    sm.a(wg.a(i18));
                }
                if (!x12) {
                    sm.a(4);
                }
                if ((z7 || x12) ? false : true) {
                    sm.a(5);
                }
                if ((z8 || x12) ? false : true) {
                    sm.a(6);
                }
                if (o5 && (z8 || !z11 || z7) && !x12) {
                    sm.a(7);
                }
                if ((z10 || x12) ? false : true) {
                    sm.a(8);
                }
                if (o5 && (z10 || (z11 && z12)) && !x12) {
                    sm.a(9);
                }
                if (!x12) {
                    sm.a(10);
                }
                if ((z7 || x12) ? false : true) {
                    sm.a(11);
                }
                if ((z7 || x12) ? false : true) {
                    sm.a(12);
                }
                m82 = new M8(sm.b());
                this.f13894N = m82;
                if (!m82.equals(m8)) {
                    this.f13921v.c(13, new Qs(6, this));
                }
                this.f13921v.b();
            }
            pair2 = new Pair(Boolean.TRUE, 3);
        }
        pair = pair2;
        i7 = i22;
        z5 = z3;
        booleanValue = ((Boolean) pair.first).booleanValue();
        ((Integer) pair.second).getClass();
        if (booleanValue) {
        }
        if (booleanValue) {
        }
        P4 p432 = this.f13906Z;
        p432.getClass();
        C1412p4 c1412p43 = new C1412p4(p432);
        list = ee.f8483j;
        i9 = 0;
        i10 = 1;
        while (i9 < list.size()) {
        }
        this.f13906Z = new P4(c1412p43);
        l12 = l1();
        if (l12.o()) {
        }
        equals = p42.equals(this.f13895O);
        this.f13895O = p42;
        if (ee2.f8485l == ee.f8485l) {
        }
        if (ee2.f8480e == ee.f8480e) {
        }
        if (i11 == 0) {
        }
        t0();
        this.f13907a0.getClass();
        G1();
        G1();
        if (ee2.f8481g == ee.f8481g) {
        }
        if (!equals2) {
        }
        if (z5) {
        }
        if (booleanValue) {
        }
        if (ee2.f != ee.f) {
        }
        c1245lH = ee2.i;
        c1245lH2 = ee.i;
        if (c1245lH != c1245lH2) {
        }
        if (!equals) {
        }
        if (i12 == 0) {
        }
        if (i11 == 0) {
        }
        this.f13921v.c(-1, new Yj() { // from class: com.google.android.gms.internal.ads.cE
            @Override // com.google.android.gms.internal.ads.Yj
            /* renamed from: k */
            public final void mo11k(Object obj72) {
                C1603tG c1603tG4;
                EE ee4 = ee;
                SE se = (SE) obj72;
                switch (i15) {
                    case 0:
                        int i272 = C1109iE.f13882f0;
                        boolean z15 = ee4.f8485l;
                        se.i(se.g(), -1, new QE(13));
                        break;
                    default:
                        int i282 = C1109iE.f13882f0;
                        XD xd = ee4.f;
                        se.getClass();
                        se.i((!AbstractC2107A.A(xd) || (c1603tG4 = xd.f12164r) == null) ? se.g() : se.j(c1603tG4), 10, new QE(20));
                        break;
                }
            }
        });
        if (i11 != 0) {
        }
        if (i13 == 0) {
        }
        i16 = 1;
        this.f13921v.c(5, new C0751aE(ee, i16, (byte) 0));
        if (ee2.f8487n != ee.f8487n) {
        }
        if (ee2.h() != ee.h()) {
        }
        if (!ee2.f8488o.equals(ee.f8488o)) {
        }
        m8 = this.f13894N;
        ME me2 = this.f13916q;
        M8 m832 = this.f13913n;
        int i292 = AbstractC1260lo.f14419a;
        x12 = me2.x1();
        AbstractC0715Xa l152 = me2.l1();
        if (l152.o()) {
        }
        l13 = me2.l1();
        if (l13.o()) {
        }
        l14 = me2.l1();
        if (l14.o()) {
        }
        AbstractC0715Xa l162 = me2.l1();
        if (l162.o()) {
        }
        AbstractC0715Xa l172 = me2.l1();
        if (l172.o()) {
        }
        o5 = me2.l1().o();
        Sm sm2 = new Sm();
        wg = m832.f10604a;
        while (i18 < wg.f12034a.size()) {
        }
        if (!x12) {
        }
        if ((z7 || x12) ? false : true) {
        }
        if ((z8 || x12) ? false : true) {
        }
        if (o5 && (z8 || !z11 || z7) && !x12) {
        }
        if ((z10 || x12) ? false : true) {
        }
        if (o5 && (z10 || (z11 && z12)) && !x12) {
        }
        if (!x12) {
        }
        if ((z7 || x12) ? false : true) {
        }
        if ((z7 || x12) ? false : true) {
        }
        m82 = new M8(sm2.b());
        this.f13894N = m82;
        if (!m82.equals(m8)) {
        }
        this.f13921v.b();
    }

    public final long D1() {
        t0();
        return AbstractC1260lo.v(s1(this.f13907a0));
    }

    public final long E1() {
        t0();
        if (!H1()) {
            AbstractC0715Xa l12 = l1();
            if (l12.o()) {
                return -9223372036854775807L;
            }
            return AbstractC1260lo.v(l12.e(b1(), (C0603Ha) this.f7794k, 0L).f9404j);
        }
        EE ee = this.f13907a0;
        C1603tG c1603tG = ee.f8477b;
        Object obj = c1603tG.f15679a;
        AbstractC0715Xa abstractC0715Xa = ee.f8476a;
        C1785xa c1785xa = this.f13923x;
        abstractC0715Xa.n(obj, c1785xa);
        return AbstractC1260lo.v(c1785xa.a(c1603tG.f15680b, c1603tG.f15681c));
    }

    public final void F1(boolean z3) {
        t0();
        c();
        RD rd = this.f13889G;
        rd.a();
        rd.b(0);
        B1(1, 1, z3);
    }

    public final boolean G1() {
        t0();
        return this.f13907a0.f8485l;
    }

    public final boolean H1() {
        t0();
        return this.f13907a0.f8477b.b();
    }

    public final void I1(PE pe) {
        this.f13883A.f.a(pe);
    }

    public final void J1() {
        String str;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = AbstractC1260lo.f14423e;
        HashSet hashSet = AbstractC0830c4.f12967a;
        synchronized (AbstractC0830c4.class) {
            str = AbstractC0830c4.f12968b;
        }
        JB.i("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.5.0-beta01] [" + str2 + "] [" + str + "]");
        t0();
        RD rd = this.f13889G;
        rd.f11344c = null;
        rd.a();
        rd.b(0);
        if (!this.f13920u.M()) {
            Fk fk = this.f13921v;
            fk.c(10, new Fz(25));
            fk.b();
        }
        this.f13921v.d();
        this.f13919t.f15040a.removeCallbacksAndMessages(null);
        C1514rH c1514rH = this.f13885C;
        SE se = this.f13883A;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c1514rH.f15295l.f9491l;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1380oH c1380oH = (C1380oH) it.next();
            if (c1380oH.f14800b == se) {
                c1380oH.f14801c = true;
                copyOnWriteArrayList.remove(c1380oH);
            }
        }
        this.f13907a0.getClass();
        EE e3 = this.f13907a0.e(1);
        this.f13907a0 = e3;
        EE a5 = e3.a(e3.f8477b);
        this.f13907a0 = a5;
        a5.f8489p = a5.f8491r;
        this.f13907a0.f8490q = 0L;
        SE se2 = this.f13883A;
        C1439pn c1439pn = se2.f11527h;
        AbstractC1668us.F(c1439pn);
        c1439pn.b(new RunnableC1303mm(19, se2));
        this.f13918s.d();
        Surface surface = this.f13897Q;
        if (surface != null) {
            surface.release();
            this.f13897Q = null;
        }
        int i = AbstractC0623Jg.f10038a;
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final void Y0(int i, long j5) {
        t0();
        if (i == -1) {
            return;
        }
        AbstractC1668us.S(i >= 0);
        AbstractC0715Xa abstractC0715Xa = this.f13907a0.f8476a;
        if (abstractC0715Xa.o() || i < abstractC0715Xa.c()) {
            SE se = this.f13883A;
            if (!se.i) {
                OE g5 = se.g();
                se.i = true;
                se.i(g5, -1, new QE(29));
            }
            this.f13891I++;
            if (H1()) {
                JB.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                T2 t22 = new T2(this.f13907a0);
                t22.a(1);
                C1109iE c1109iE = (C1109iE) this.f13910d0.f11130k;
                c1109iE.getClass();
                c1109iE.f13919t.b(new RunnableC1081hn(14, c1109iE, t22));
                return;
            }
            EE ee = this.f13907a0;
            int i5 = ee.f8480e;
            if (i5 == 3 || (i5 == 4 && !abstractC0715Xa.o())) {
                ee = this.f13907a0.e(2);
            }
            int b12 = b1();
            EE w12 = w1(ee, abstractC0715Xa, v1(abstractC0715Xa, i, j5));
            long s2 = AbstractC1260lo.s(j5);
            C1332nE c1332nE = this.f13920u;
            c1332nE.getClass();
            c1332nE.f14636r.a(3, new C1287mE(abstractC0715Xa, i, s2)).a();
            C1(w12, 0, true, 1, s1(w12), b12);
        }
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final int b1() {
        t0();
        int q12 = q1(this.f13907a0);
        if (q12 == -1) {
            return 0;
        }
        return q12;
    }

    public final int c() {
        t0();
        return this.f13907a0.f8480e;
    }

    @Override // com.google.android.gms.internal.ads.BC, com.google.android.gms.internal.ads.Bi
    public final void g() {
        t0();
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final AbstractC0715Xa l1() {
        t0();
        return this.f13907a0.f8476a;
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final void o1() {
        t0();
    }

    public final void p1(C0614Ie c0614Ie) {
        t0();
        Fk fk = this.f13883A.f;
        fk.e();
        CopyOnWriteArraySet copyOnWriteArraySet = fk.f9106d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C1525rk c1525rk = (C1525rk) it.next();
            if (c1525rk.f15367a.equals(c0614Ie)) {
                c1525rk.f15370d = true;
                if (c1525rk.f15369c) {
                    c1525rk.f15369c = false;
                    WG b3 = c1525rk.f15368b.b();
                    fk.f9105c.c(c1525rk.f15367a, b3);
                }
                copyOnWriteArraySet.remove(c1525rk);
            }
        }
    }

    public final int q1(EE ee) {
        if (ee.f8476a.o()) {
            return this.f13908b0;
        }
        return ee.f8476a.n(ee.f8477b.f15679a, this.f13923x).f16290c;
    }

    public final long r1(EE ee) {
        if (!ee.f8477b.b()) {
            return AbstractC1260lo.v(s1(ee));
        }
        Object obj = ee.f8477b.f15679a;
        C1785xa c1785xa = this.f13923x;
        AbstractC0715Xa abstractC0715Xa = ee.f8476a;
        abstractC0715Xa.n(obj, c1785xa);
        long j5 = ee.f8478c;
        if (j5 == -9223372036854775807L) {
            abstractC0715Xa.e(q1(ee), (C0603Ha) this.f7794k, 0L).getClass();
            return AbstractC1260lo.v(0L);
        }
        return AbstractC1260lo.v(0L) + AbstractC1260lo.v(j5);
    }

    public final long s1(EE ee) {
        if (ee.f8476a.o()) {
            return AbstractC1260lo.s(this.f13909c0);
        }
        long j5 = ee.f8491r;
        if (ee.f8477b.b()) {
            return j5;
        }
        ee.f8476a.n(ee.f8477b.f15679a, this.f13923x);
        return j5;
    }

    public final void t0() {
        this.f13914o.d();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f13884B;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f13903W) {
                throw new IllegalStateException(str);
            }
            JB.n("ExoPlayerImpl", str, this.f13904X ? null : new IllegalStateException());
            this.f13904X = true;
        }
    }

    public final Pair v1(AbstractC0715Xa abstractC0715Xa, int i, long j5) {
        if (abstractC0715Xa.o()) {
            this.f13908b0 = i;
            if (j5 == -9223372036854775807L) {
                j5 = 0;
            }
            this.f13909c0 = j5;
            return null;
        }
        if (i == -1 || i >= abstractC0715Xa.c()) {
            i = abstractC0715Xa.g(false);
            abstractC0715Xa.e(i, (C0603Ha) this.f7794k, 0L).getClass();
            j5 = AbstractC1260lo.v(0L);
        }
        return abstractC0715Xa.l((C0603Ha) this.f7794k, this.f13923x, i, AbstractC1260lo.s(j5));
    }

    public final void w() {
        t0();
        RD rd = this.f13889G;
        G1();
        rd.a();
        rd.b(0);
        A1(null);
        int i = AbstractC0623Jg.f10038a;
        C1761wv c1761wv = C1761wv.f16184o;
        long j5 = this.f13907a0.f8491r;
        AbstractC1044gv.l(c1761wv);
    }

    public final EE w1(EE ee, AbstractC0715Xa abstractC0715Xa, Pair pair) {
        List list;
        AbstractC1668us.S(abstractC0715Xa.o() || pair != null);
        AbstractC0715Xa abstractC0715Xa2 = ee.f8476a;
        long r1 = r1(ee);
        EE f = ee.f(abstractC0715Xa);
        if (abstractC0715Xa.o()) {
            C1603tG c1603tG = EE.f8475t;
            long s2 = AbstractC1260lo.s(this.f13909c0);
            EE a5 = f.b(c1603tG, s2, s2, s2, 0L, TG.f11645d, this.f13912m, C1761wv.f16184o).a(c1603tG);
            a5.f8489p = a5.f8491r;
            return a5;
        }
        Object obj = f.f8477b.f15679a;
        int i = AbstractC1260lo.f14419a;
        boolean equals = obj.equals(pair.first);
        C1603tG c1603tG2 = !equals ? new C1603tG(pair.first, -1L) : f.f8477b;
        long longValue = ((Long) pair.second).longValue();
        long s5 = AbstractC1260lo.s(r1);
        if (!abstractC0715Xa2.o()) {
            abstractC0715Xa2.n(obj, this.f13923x);
        }
        if (!equals || longValue < s5) {
            C1603tG c1603tG3 = c1603tG2;
            AbstractC1668us.a0(!c1603tG3.b());
            TG tg = !equals ? TG.f11645d : f.f8482h;
            C1245lH c1245lH = !equals ? this.f13912m : f.i;
            if (equals) {
                list = f.f8483j;
            } else {
                C0954ev c0954ev = AbstractC1044gv.f13676l;
                list = C1761wv.f16184o;
            }
            EE a6 = f.b(c1603tG3, longValue, longValue, longValue, 0L, tg, c1245lH, list).a(c1603tG3);
            a6.f8489p = longValue;
            return a6;
        }
        if (longValue != s5) {
            C1603tG c1603tG4 = c1603tG2;
            AbstractC1668us.a0(!c1603tG4.b());
            long max = Math.max(0L, f.f8490q - (longValue - s5));
            long j5 = f.f8489p;
            if (f.f8484k.equals(f.f8477b)) {
                j5 = longValue + max;
            }
            EE b3 = f.b(c1603tG4, longValue, longValue, longValue, max, f.f8482h, f.i, f.f8483j);
            b3.f8489p = j5;
            return b3;
        }
        int a7 = abstractC0715Xa.a(f.f8484k.f15679a);
        if (a7 != -1 && abstractC0715Xa.d(a7, this.f13923x, false).f16290c == abstractC0715Xa.n(c1603tG2.f15679a, this.f13923x).f16290c) {
            return f;
        }
        abstractC0715Xa.n(c1603tG2.f15679a, this.f13923x);
        long a8 = c1603tG2.b() ? this.f13923x.a(c1603tG2.f15680b, c1603tG2.f15681c) : this.f13923x.f16291d;
        C1603tG c1603tG5 = c1603tG2;
        EE a9 = f.b(c1603tG5, f.f8491r, f.f8491r, f.f8479d, a8 - f.f8491r, f.f8482h, f.i, f.f8483j).a(c1603tG5);
        a9.f8489p = a8;
        return a9;
    }

    public final void x1(int i, int i5) {
        Bm bm = this.f13899S;
        if (i == bm.f7877a && i5 == bm.f7878b) {
            return;
        }
        this.f13899S = new Bm(i, i5);
        Fz fz = new Fz(24);
        Fk fk = this.f13921v;
        fk.c(24, fz);
        fk.b();
        y1(2, 14, new Bm(i, i5));
    }

    public final void y1(int i, int i5, Object obj) {
        RF[] rfArr = this.f13917r;
        int length = rfArr.length;
        for (int i6 = 0; i6 < 2; i6++) {
            RF rf = rfArr[i6];
            if (i == -1 || rf.f11390l == i) {
                q1(this.f13907a0);
                C1332nE c1332nE = this.f13920u;
                AbstractC0715Xa abstractC0715Xa = this.f13907a0.f8476a;
                HE he = new HE(c1332nE, rf, c1332nE.f14638t);
                AbstractC1668us.a0(!he.f9342e);
                he.f9339b = i5;
                AbstractC1668us.a0(!he.f9342e);
                he.f9340c = obj;
                AbstractC1668us.a0(!he.f9342e);
                he.f9342e = true;
                synchronized (c1332nE) {
                    if (!c1332nE.J && c1332nE.f14638t.getThread().isAlive()) {
                        c1332nE.f14636r.a(14, he).a();
                    }
                    JB.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                    he.a(false);
                }
            }
        }
    }

    public final void z1(Surface surface) {
        Surface surface2 = this.f13896P;
        boolean z3 = false;
        boolean z5 = true;
        if (surface2 != null && surface2 != surface) {
            z3 = true;
        }
        long j5 = z3 ? this.f13890H : -9223372036854775807L;
        C1332nE c1332nE = this.f13920u;
        synchronized (c1332nE) {
            if (!c1332nE.J && c1332nE.f14638t.getThread().isAlive()) {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                c1332nE.f14636r.a(30, new Pair(surface, atomicBoolean)).a();
                if (j5 != -9223372036854775807L) {
                    c1332nE.F(new Dp(11, atomicBoolean), j5);
                    z5 = atomicBoolean.get();
                }
            }
        }
        if (z3) {
            Surface surface3 = this.f13896P;
            Surface surface4 = this.f13897Q;
            if (surface3 == surface4) {
                surface4.release();
                this.f13897Q = null;
            }
        }
        this.f13896P = surface;
        if (z5) {
            return;
        }
        A1(new XD(2, new D2.e("Detaching surface timed out."), 1003));
    }
}
