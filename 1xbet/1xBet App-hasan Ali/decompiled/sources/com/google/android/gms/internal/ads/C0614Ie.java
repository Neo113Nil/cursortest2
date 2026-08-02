package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.SparseBooleanArray;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Ie, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614Ie implements RB, PE {

    /* renamed from: E, reason: collision with root package name */
    public static final AtomicInteger f9545E = new AtomicInteger(0);

    /* renamed from: F, reason: collision with root package name */
    public static final AtomicInteger f9546F = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    public Integer f9547A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f9548B;

    /* renamed from: C, reason: collision with root package name */
    public volatile C0585Ee f9549C;

    /* renamed from: k, reason: collision with root package name */
    public final Context f9551k;

    /* renamed from: l, reason: collision with root package name */
    public final C0577De f9552l;

    /* renamed from: m, reason: collision with root package name */
    public final C1112iH f9553m;

    /* renamed from: n, reason: collision with root package name */
    public final C0804be f9554n;

    /* renamed from: o, reason: collision with root package name */
    public final WeakReference f9555o;

    /* renamed from: p, reason: collision with root package name */
    public final C0901dm f9556p;

    /* renamed from: q, reason: collision with root package name */
    public ME f9557q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f9558r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9559s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0718Xd f9560t;

    /* renamed from: u, reason: collision with root package name */
    public int f9561u;

    /* renamed from: v, reason: collision with root package name */
    public int f9562v;

    /* renamed from: w, reason: collision with root package name */
    public long f9563w;

    /* renamed from: x, reason: collision with root package name */
    public final String f9564x;

    /* renamed from: y, reason: collision with root package name */
    public final int f9565y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f9566z = new Object();

    /* renamed from: D, reason: collision with root package name */
    public final HashSet f9550D = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010f, code lost:
    
        if (((java.lang.Boolean) r1.f5056c.a(com.google.android.gms.internal.ads.F7.f8741P1)).booleanValue() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0614Ie(Context context, C0804be c0804be, InterfaceC0677Re interfaceC0677Re, Integer num) {
        Xu xu;
        Xu c1390oj;
        this.f9551k = context;
        this.f9554n = c0804be;
        this.f9547A = num;
        this.f9555o = new WeakReference(interfaceC0677Re);
        C0577De c0577De = new C0577De();
        this.f9552l = c0577De;
        C1112iH c1112iH = new C1112iH(context);
        this.f9553m = c1112iH;
        if (T2.G.o()) {
            T2.G.m("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        f9545E.incrementAndGet();
        YD yd = new YD(context, new Qt(11, this));
        final boolean z3 = true;
        AbstractC1668us.a0(!yd.f12306q);
        yd.f12296e = new Hq(9, c1112iH);
        AbstractC1668us.a0(!yd.f12306q);
        yd.f = new Qs(5, c0577De);
        AbstractC1668us.a0(!yd.f12306q);
        yd.f12306q = true;
        ME me = new ME(yd);
        this.f9557q = me;
        me.f10609n.d();
        me.f10608m.I1(this);
        this.f9561u = 0;
        this.f9563w = 0L;
        this.f9562v = 0;
        this.f9548B = new ArrayList();
        this.f9549C = null;
        String t5 = interfaceC0677Re != null ? interfaceC0677Re.t() : null;
        this.f9564x = (String) (t5 == null ? C1176ju.f14188k : new C1535ru(t5)).b();
        this.f9565y = interfaceC0677Re != null ? interfaceC0677Re.c() : 0;
        final String x5 = P2.o.f4767B.f4771c.x(context, interfaceC0677Re.m().f5852k);
        if (!this.f9559s || this.f9558r.limit() <= 0) {
            A7 a7 = F7.f8783X1;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            }
            if (c0804be.i) {
                z3 = false;
            }
            if (c0804be.f12845l) {
                final int i = 0;
                xu = new Xu(this) { // from class: com.google.android.gms.internal.ads.Ge

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ C0614Ie f9193l;

                    {
                        this.f9193l = this;
                    }

                    @Override // com.google.android.gms.internal.ads.Xu
                    /* renamed from: a */
                    public final InterfaceC1402ov mo19a() {
                        switch (i) {
                            case 0:
                                C0614Ie c0614Ie = this.f9193l;
                                c0614Ie.getClass();
                                C0614Ie c0614Ie2 = true != z3 ? null : c0614Ie;
                                C0804be c0804be2 = c0614Ie.f9554n;
                                return new C0628Ke(x5, c0614Ie2, c0804be2.f12839d, c0804be2.f12840e, c0804be2.f12846m, c0804be2.f12847n);
                            case 1:
                                C0614Ie c0614Ie3 = this.f9193l;
                                c0614Ie3.getClass();
                                C0614Ie c0614Ie4 = true != z3 ? null : c0614Ie3;
                                C0804be c0804be3 = c0614Ie3.f9554n;
                                C0569Ce c0569Ce = new C0569Ce(x5, c0614Ie4, c0804be3.f12839d, c0804be3.f12840e, c0804be3.f12842h);
                                c0614Ie3.f9550D.add(new WeakReference(c0569Ce));
                                return c0569Ce;
                            default:
                                C0614Ie c0614Ie5 = this.f9193l;
                                c0614Ie5.getClass();
                                Er er = new Er(4);
                                C0614Ie c0614Ie6 = true != z3 ? null : c0614Ie5;
                                C0804be c0804be4 = c0614Ie5.f9554n;
                                Dy dy = new Dy(x5, c0804be4.f12839d, c0804be4.f12840e, true, er);
                                if (c0614Ie6 != null) {
                                    dy.d(c0614Ie6);
                                }
                                return dy;
                        }
                    }
                };
            } else if (c0804be.f12842h > 0) {
                final int i5 = 1;
                xu = new Xu(this) { // from class: com.google.android.gms.internal.ads.Ge

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ C0614Ie f9193l;

                    {
                        this.f9193l = this;
                    }

                    @Override // com.google.android.gms.internal.ads.Xu
                    /* renamed from: a */
                    public final InterfaceC1402ov mo19a() {
                        switch (i5) {
                            case 0:
                                C0614Ie c0614Ie = this.f9193l;
                                c0614Ie.getClass();
                                C0614Ie c0614Ie2 = true != z3 ? null : c0614Ie;
                                C0804be c0804be2 = c0614Ie.f9554n;
                                return new C0628Ke(x5, c0614Ie2, c0804be2.f12839d, c0804be2.f12840e, c0804be2.f12846m, c0804be2.f12847n);
                            case 1:
                                C0614Ie c0614Ie3 = this.f9193l;
                                c0614Ie3.getClass();
                                C0614Ie c0614Ie4 = true != z3 ? null : c0614Ie3;
                                C0804be c0804be3 = c0614Ie3.f9554n;
                                C0569Ce c0569Ce = new C0569Ce(x5, c0614Ie4, c0804be3.f12839d, c0804be3.f12840e, c0804be3.f12842h);
                                c0614Ie3.f9550D.add(new WeakReference(c0569Ce));
                                return c0569Ce;
                            default:
                                C0614Ie c0614Ie5 = this.f9193l;
                                c0614Ie5.getClass();
                                Er er = new Er(4);
                                C0614Ie c0614Ie6 = true != z3 ? null : c0614Ie5;
                                C0804be c0804be4 = c0614Ie5.f9554n;
                                Dy dy = new Dy(x5, c0804be4.f12839d, c0804be4.f12840e, true, er);
                                if (c0614Ie6 != null) {
                                    dy.d(c0614Ie6);
                                }
                                return dy;
                        }
                    }
                };
            } else {
                final int i6 = 2;
                xu = new Xu(this) { // from class: com.google.android.gms.internal.ads.Ge

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ C0614Ie f9193l;

                    {
                        this.f9193l = this;
                    }

                    @Override // com.google.android.gms.internal.ads.Xu
                    /* renamed from: a */
                    public final InterfaceC1402ov mo19a() {
                        switch (i6) {
                            case 0:
                                C0614Ie c0614Ie = this.f9193l;
                                c0614Ie.getClass();
                                C0614Ie c0614Ie2 = true != z3 ? null : c0614Ie;
                                C0804be c0804be2 = c0614Ie.f9554n;
                                return new C0628Ke(x5, c0614Ie2, c0804be2.f12839d, c0804be2.f12840e, c0804be2.f12846m, c0804be2.f12847n);
                            case 1:
                                C0614Ie c0614Ie3 = this.f9193l;
                                c0614Ie3.getClass();
                                C0614Ie c0614Ie4 = true != z3 ? null : c0614Ie3;
                                C0804be c0804be3 = c0614Ie3.f9554n;
                                C0569Ce c0569Ce = new C0569Ce(x5, c0614Ie4, c0804be3.f12839d, c0804be3.f12840e, c0804be3.f12842h);
                                c0614Ie3.f9550D.add(new WeakReference(c0569Ce));
                                return c0569Ce;
                            default:
                                C0614Ie c0614Ie5 = this.f9193l;
                                c0614Ie5.getClass();
                                Er er = new Er(4);
                                C0614Ie c0614Ie6 = true != z3 ? null : c0614Ie5;
                                C0804be c0804be4 = c0614Ie5.f9554n;
                                Dy dy = new Dy(x5, c0804be4.f12839d, c0804be4.f12840e, true, er);
                                if (c0614Ie6 != null) {
                                    dy.d(c0614Ie6);
                                }
                                return dy;
                        }
                    }
                };
            }
            c1390oj = c0804be.i ? new C1390oj(12, this, xu) : xu;
            ByteBuffer byteBuffer = this.f9558r;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                byte[] bArr = new byte[this.f9558r.limit()];
                this.f9558r.get(bArr);
                c1390oj = new C0709Wb(12, c1390oj, bArr);
            }
        } else {
            byte[] bArr2 = new byte[this.f9558r.limit()];
            this.f9558r.get(bArr2);
            c1390oj = new C1529ro(12, bArr2);
        }
        this.f9556p = new C0901dm(c1390oj, new Ps(((Boolean) Q2.r.f5053d.f5056c.a(F7.f8853l)).booleanValue() ? new V9(23) : new V9(22)));
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void C(int i) {
        InterfaceC0718Xd interfaceC0718Xd = this.f9560t;
        if (interfaceC0718Xd != null) {
            interfaceC0718Xd.a(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final /* synthetic */ void a(OE oe, C1469qG c1469qG) {
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void d(K7 k7) {
        InterfaceC0718Xd interfaceC0718Xd = this.f9560t;
        if (interfaceC0718Xd != null) {
            interfaceC0718Xd.h("onPlayerError", k7);
        }
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void e(C1407p c1407p) {
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f9555o.get();
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8741P1)).booleanValue() || interfaceC0677Re == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(c1407p.f14913v));
        hashMap.put("bitRate", String.valueOf(c1407p.i));
        hashMap.put("resolution", c1407p.f14911t + "x" + c1407p.f14912u);
        String str = c1407p.f14903l;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = c1407p.f14904m;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = c1407p.f14901j;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        interfaceC0677Re.a("onMetadataEvent", hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.RB
    public final void f(Lt lt, Ww ww, boolean z3) {
        if (lt instanceof JA) {
            synchronized (this.f9566z) {
                this.f9548B.add((JA) lt);
            }
        } else if (lt instanceof C0585Ee) {
            this.f9549C = (C0585Ee) lt;
            InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f9555o.get();
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8741P1)).booleanValue() && interfaceC0677Re != null && this.f9549C.f8533x) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f9549C.f8535z));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f9549C.f8519A));
                T2.L.f5672l.post(new Kw(14, interfaceC0677Re, hashMap));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void f0(int i) {
        this.f9562v += i;
    }

    public final void finalize() {
        f9545E.decrementAndGet();
        if (T2.G.o()) {
            T2.G.m("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.RB
    public final void g(Ww ww, boolean z3, int i) {
        this.f9561u += i;
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void h(IOException iOException) {
        InterfaceC0718Xd interfaceC0718Xd = this.f9560t;
        if (interfaceC0718Xd != null) {
            if (this.f9554n.f12843j) {
                interfaceC0718Xd.e(iOException);
            } else {
                interfaceC0718Xd.h("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void k(C1407p c1407p) {
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f9555o.get();
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8741P1)).booleanValue() || interfaceC0677Re == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = c1407p.f14903l;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = c1407p.f14904m;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = c1407p.f14901j;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        interfaceC0677Re.a("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void m(C1519re c1519re) {
        InterfaceC0718Xd interfaceC0718Xd = this.f9560t;
        if (interfaceC0718Xd != null) {
            interfaceC0718Xd.b(c1519re.f15322a, c1519re.f15323b);
        }
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void n() {
        InterfaceC0718Xd interfaceC0718Xd = this.f9560t;
        if (interfaceC0718Xd != null) {
            interfaceC0718Xd.y();
        }
    }

    public final long o() {
        if (this.f9549C != null && this.f9549C.f8534y) {
            return this.f9549C.l();
        }
        synchronized (this.f9566z) {
            while (!this.f9548B.isEmpty()) {
                long j5 = this.f9563w;
                Map b3 = ((JA) this.f9548B.remove(0)).b();
                long j6 = 0;
                if (b3 != null) {
                    Iterator it = b3.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && AbstractC0952et.Q((CharSequence) entry.getKey(), "content-length") && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j6 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f9563w = j5 + j6;
            }
        }
        return this.f9563w;
    }

    public final void p(Uri[] uriArr, ByteBuffer byteBuffer, boolean z3) {
        Object bg;
        if (this.f9557q != null) {
            this.f9558r = byteBuffer;
            this.f9559s = z3;
            int length = uriArr.length;
            if (length == 1) {
                bg = r(uriArr[0]);
            } else {
                ZF[] zfArr = new ZF[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zfArr[i] = r(uriArr[i]);
                }
                bg = new BG(new RE(10), zfArr);
            }
            ME me = this.f9557q;
            me.f10609n.d();
            C1109iE c1109iE = me.f10608m;
            c1109iE.t0();
            List singletonList = Collections.singletonList(bg);
            c1109iE.t0();
            c1109iE.t0();
            c1109iE.q1(c1109iE.f13907a0);
            c1109iE.D1();
            c1109iE.f13891I++;
            ArrayList arrayList = c1109iE.f13924y;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i5 = size - 1; i5 >= 0; i5--) {
                    arrayList.remove(i5);
                }
                PG pg = c1109iE.f13911e0;
                int[] iArr = pg.f11078b;
                int[] iArr2 = new int[iArr.length - size];
                int i6 = 0;
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    int i8 = iArr[i7];
                    if (i8 < 0 || i8 >= size) {
                        int i9 = i7 - i6;
                        if (i8 >= 0) {
                            i8 -= size;
                        }
                        iArr2[i9] = i8;
                    } else {
                        i6++;
                    }
                }
                c1109iE.f13911e0 = new PG(iArr2, new Random(pg.f11077a.nextLong()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < singletonList.size(); i10++) {
                CE ce = new CE((ZF) singletonList.get(i10), c1109iE.f13925z);
                arrayList2.add(ce);
                arrayList.add(i10, new C1064hE(ce.f7982b, ce.f7981a));
            }
            c1109iE.f13911e0 = c1109iE.f13911e0.a(arrayList2.size());
            JE je = new JE(arrayList, c1109iE.f13911e0);
            boolean o5 = je.o();
            int i11 = je.f9918d;
            if (!o5 && i11 < 0) {
                throw new D3.b();
            }
            int g5 = je.g(false);
            EE w12 = c1109iE.w1(c1109iE.f13907a0, je, c1109iE.v1(je, g5, -9223372036854775807L));
            int i12 = w12.f8480e;
            if (g5 != -1 && i12 != 1) {
                i12 = 4;
                if (!je.o() && g5 < i11) {
                    i12 = 2;
                }
            }
            EE e3 = w12.e(i12);
            long s2 = AbstractC1260lo.s(-9223372036854775807L);
            PG pg2 = c1109iE.f13911e0;
            C1332nE c1332nE = c1109iE.f13920u;
            c1332nE.getClass();
            c1332nE.f14636r.a(17, new C1197kE(arrayList2, pg2, g5, s2)).a();
            c1109iE.C1(e3, 0, (c1109iE.f13907a0.f8477b.f15679a.equals(e3.f8477b.f15679a) || c1109iE.f13907a0.f8476a.o()) ? false : true, 4, c1109iE.s1(e3), -1);
            ME me2 = this.f9557q;
            me2.f10609n.d();
            C1109iE c1109iE2 = me2.f10608m;
            c1109iE2.t0();
            boolean G12 = c1109iE2.G1();
            RD rd = c1109iE2.f13889G;
            rd.a();
            rd.b(0);
            c1109iE2.B1(1, 1, G12);
            EE ee = c1109iE2.f13907a0;
            if (ee.f8480e == 1) {
                EE d5 = ee.d(null);
                EE e5 = d5.e(true != d5.f8476a.o() ? 2 : 4);
                c1109iE2.f13891I++;
                C1439pn c1439pn = c1109iE2.f13920u.f14636r;
                c1439pn.getClass();
                Vm e6 = C1439pn.e();
                e6.f11938a = c1439pn.f15040a.obtainMessage(29);
                e6.a();
                c1109iE2.C1(e5, 1, false, 5, -9223372036854775807L, -1);
            }
            f9546F.incrementAndGet();
        }
    }

    public final void q(boolean z3) {
        C0843cH c0843cH;
        if (this.f9557q == null) {
            return;
        }
        int i = 0;
        while (true) {
            ME me = this.f9557q;
            me.f10609n.d();
            C1109iE c1109iE = me.f10608m;
            c1109iE.t0();
            int length = c1109iE.f13917r.length;
            if (i >= 2) {
                return;
            }
            C1112iH c1112iH = this.f9553m;
            synchronized (c1112iH.f13932c) {
                c0843cH = c1112iH.f;
            }
            c0843cH.getClass();
            C0799bH c0799bH = new C0799bH(c0843cH);
            boolean z5 = !z3;
            SparseBooleanArray sparseBooleanArray = c0799bH.f12809t;
            if (sparseBooleanArray.get(i) != z5) {
                if (z3) {
                    sparseBooleanArray.delete(i);
                } else {
                    sparseBooleanArray.put(i, true);
                }
            }
            c1112iH.e(c0799bH);
            i++;
        }
    }

    public final JG r(Uri uri) {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        C1761wv c1761wv = C1761wv.f16184o;
        List list = Collections.EMPTY_LIST;
        C1761wv c1761wv2 = C1761wv.f16184o;
        C0918e3 c0918e3 = C0918e3.f13233a;
        Q3 q32 = new Q3("", new C1184k1(), uri != null ? new C1859z2(uri, c1761wv2) : null, new C1052h2(), P4.f11040z);
        int i = this.f9554n.f;
        C0901dm c0901dm = this.f9556p;
        c0901dm.f13164a = i;
        q32.f11161b.getClass();
        return new JG(q32, (Xu) c0901dm.f13165b, (Ps) c0901dm.f13166c, (RE) c0901dm.f13167d, c0901dm.f13164a);
    }

    public final long s() {
        if (this.f9549C != null && this.f9549C.f8534y && this.f9549C.f8535z) {
            return Math.min(this.f9561u, this.f9549C.f8520B);
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final /* synthetic */ void i(SD sd) {
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final /* synthetic */ void l(int i) {
    }

    @Override // com.google.android.gms.internal.ads.RB
    public final void c(Ww ww, boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final /* synthetic */ void j(ME me, Er er) {
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final /* synthetic */ void b(OE oe, int i, long j5) {
    }
}
