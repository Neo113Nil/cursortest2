package I;

import A0.C0036j;
import A0.C0048n0;
import A0.E0;
import A0.J0;
import A0.m1;
import A0.n1;
import A0.o1;
import E.F0;
import E.G0;
import E.Z;
import K0.C0197b;
import K0.C0200e;
import K0.C0201f;
import K0.C0203h;
import P.AbstractC0329z;
import P.C0305m0;
import a.AbstractC0444a;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import android.view.ActionMode;
import e2.C1930k;
import h0.C1988b;
import h0.C1989c;
import java.util.ArrayList;
import java.util.List;
import p0.InterfaceC2241a;
import r3.AbstractC2349a;
import x0.InterfaceC2637x;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f2423a;

    /* renamed from: d, reason: collision with root package name */
    public Z f2426d;
    public E0 f;

    /* renamed from: g, reason: collision with root package name */
    public m1 f2428g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2241a f2429h;
    public g0.o i;

    /* renamed from: j, reason: collision with root package name */
    public final C0305m0 f2430j;

    /* renamed from: k, reason: collision with root package name */
    public final C0305m0 f2431k;

    /* renamed from: l, reason: collision with root package name */
    public long f2432l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f2433m;

    /* renamed from: n, reason: collision with root package name */
    public long f2434n;

    /* renamed from: o, reason: collision with root package name */
    public final C0305m0 f2435o;

    /* renamed from: p, reason: collision with root package name */
    public final C0305m0 f2436p;

    /* renamed from: q, reason: collision with root package name */
    public int f2437q;

    /* renamed from: r, reason: collision with root package name */
    public P0.w f2438r;

    /* renamed from: s, reason: collision with root package name */
    public D3.l f2439s;

    /* renamed from: t, reason: collision with root package name */
    public final M f2440t;

    /* renamed from: u, reason: collision with root package name */
    public final C1930k f2441u;

    /* renamed from: b, reason: collision with root package name */
    public P0.q f2424b = E.W.f1085c;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.m f2425c = B.f2387o;

    /* renamed from: e, reason: collision with root package name */
    public final C0305m0 f2427e = AbstractC0329z.t(new P0.w(7, 0, (String) null));

    public O(G0 g02) {
        this.f2423a = g02;
        Boolean bool = Boolean.TRUE;
        this.f2430j = AbstractC0329z.t(bool);
        this.f2431k = AbstractC0329z.t(bool);
        this.f2432l = 0L;
        this.f2434n = 0L;
        this.f2435o = AbstractC0329z.t(null);
        this.f2436p = AbstractC0329z.t(null);
        this.f2437q = -1;
        this.f2438r = new P0.w(7, 0L, (String) null);
        this.f2440t = new M(this, 1);
        this.f2441u = new C1930k(11, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x012c, code lost:
    
        if (r4.f2503b == r2.f2503b) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0155, code lost:
    
        r6 = ((K0.L) r5.f2501e).f2792a.f2784a.f2829l;
        r7 = (I.C0162o) r14.f962m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0163, code lost:
    
        if (r7 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0169, code lost:
    
        if (r6.length() != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x016d, code lost:
    
        r6 = ((K0.L) r5.f2501e).f2792a.f2784a.f2829l;
        r8 = r6.length();
        r10 = r14.f961l;
        r11 = r5.f2498b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0180, code lost:
    
        if (r11 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0182, code lost:
    
        r6 = E.W.m(r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0187, code lost:
    
        if (r10 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0189, code lost:
    
        r2 = I.C0162o.a(r3, r3.AbstractC2349a.r(r4, r5, r6), null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0195, code lost:
    
        r2 = I.C0162o.a(r3, null, r3.AbstractC2349a.r(r2, r5, r6), false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01a4, code lost:
    
        if (r11 != r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a6, code lost:
    
        r6 = E.W.p(r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01aa, code lost:
    
        if (r10 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ac, code lost:
    
        r2 = I.C0162o.a(r3, r3.AbstractC2349a.r(r4, r5, r6), null, false, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01b5, code lost:
    
        r2 = I.C0162o.a(r3, null, r3.AbstractC2349a.r(r2, r5, r6), true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01c0, code lost:
    
        if (r7.f2507c != true) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01c2, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c7, code lost:
    
        if ((r10 ^ r7) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01c9, code lost:
    
        r6 = E.W.p(r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01d2, code lost:
    
        if (r10 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01d4, code lost:
    
        r2 = I.C0162o.a(r3, r3.AbstractC2349a.r(r4, r5, r6), null, r7, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01de, code lost:
    
        r2 = I.C0162o.a(r3, null, r3.AbstractC2349a.r(r2, r5, r6), r7, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01ce, code lost:
    
        r6 = E.W.m(r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01c4, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0151, code lost:
    
        if (((K0.L) r5.f2501e).f2792a.f2784a.f2829l.length() != (r6 ? r2 : r4).f2503b) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [long] */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r4v11, types: [i4.c, kotlin.jvm.internal.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(O o5, P0.w wVar, long j5, boolean z3, boolean z5, o1 o1Var, boolean z6) {
        F0 d5;
        boolean z7;
        long j6;
        int i;
        ?? r27;
        long j7;
        C0162o c0162o;
        int i5;
        C0162o c0162o2;
        boolean z8;
        InterfaceC2241a interfaceC2241a;
        C0161n l5;
        C0161n c0161n;
        Z z9 = o5.f2426d;
        if (z9 == null || (d5 = z9.d()) == null) {
            return K0.N.f2801b;
        }
        P0.q qVar = o5.f2424b;
        long j8 = wVar.f4680b;
        int i6 = K0.N.f2802c;
        int b3 = qVar.b((int) (j8 >> 32));
        P0.q qVar2 = o5.f2424b;
        long j9 = wVar.f4680b;
        long b5 = K0.F.b(b3, qVar2.b((int) (j9 & 4294967295L)));
        int b6 = d5.b(j5, false);
        int i7 = (z5 || z3) ? b6 : (int) (b5 >> 32);
        if (!z5 || z3) {
            z7 = 32;
            j6 = j9;
            i = b6;
        } else {
            z7 = 32;
            j6 = j9;
            i = (int) (b5 & 4294967295L);
        }
        D3.l lVar = o5.f2439s;
        int i8 = -1;
        if (z3 || lVar == null) {
            r27 = z7;
        } else {
            boolean z10 = z7;
            int i9 = o5.f2437q;
            r27 = z10;
            if (i9 != -1) {
                i8 = i9;
                r27 = z10;
            }
        }
        K0.L l6 = d5.f1029a;
        if (z3) {
            i5 = b6;
            j7 = 4294967295L;
            c0162o = null;
        } else {
            j7 = 4294967295L;
            int i10 = (int) (b5 >> r27);
            int i11 = (int) (b5 & 4294967295L);
            i5 = b6;
            c0162o = new C0162o(new C0161n(G4.d.A(l6, i10), i10, 1L), new C0161n(G4.d.A(l6, i11), i11, 1L), K0.N.f(b5));
        }
        D3.l lVar2 = new D3.l(z5, c0162o, new C0160m(i7, i, i8, l6));
        if (c0162o != null && lVar != null && z5 == lVar.f961l) {
            C0160m c0160m = (C0160m) lVar.f963n;
            if (i7 == c0160m.f2498b && i == c0160m.f2499c) {
                return j6;
            }
        }
        o5.f2439s = lVar2;
        o5.f2437q = i5;
        switch (o1Var.f547a) {
            case 1:
                C0160m c0160m2 = (C0160m) lVar2.f963n;
                c0162o2 = new C0162o(c0160m2.b(c0160m2.f2498b), c0160m2.b(c0160m2.f2499c), lVar2.b() == 1);
                break;
            case 2:
                c0162o2 = AbstractC2349a.i(lVar2, C0163p.f2509c);
                break;
            case 3:
                c0162o2 = AbstractC2349a.i(lVar2, C0163p.f2508b);
                break;
            default:
                c0162o2 = (C0162o) lVar2.f962m;
                if (c0162o2 != null) {
                    C0160m c0160m3 = (C0160m) lVar2.f963n;
                    boolean z11 = lVar2.f961l;
                    C0161n c0161n2 = c0162o2.f2506b;
                    C0161n c0161n3 = c0162o2.f2505a;
                    if (z11) {
                        l5 = AbstractC2349a.l(lVar2, c0160m3, c0161n3);
                        c0161n = c0161n2;
                        c0161n2 = c0161n3;
                        c0161n3 = l5;
                    } else {
                        l5 = AbstractC2349a.l(lVar2, c0160m3, c0161n2);
                        c0161n = l5;
                    }
                    if (!kotlin.jvm.internal.l.a(l5, c0161n2)) {
                        C0162o c0162o3 = new C0162o(c0161n3, c0161n, lVar2.b() == 1 || (lVar2.b() == 3 && c0161n3.f2503b > c0161n.f2503b));
                        C0161n c0161n4 = c0162o3.f2506b;
                        C0161n c0161n5 = c0162o3.f2505a;
                        C0160m c0160m4 = (C0160m) lVar2.f963n;
                        if (c0161n5.f2504c != c0161n4.f2504c) {
                            boolean z12 = c0162o3.f2507c;
                            if ((z12 ? c0161n5 : c0161n4).f2503b == 0) {
                                break;
                            }
                            c0162o2 = c0162o3;
                            break;
                        } else {
                            break;
                        }
                    }
                } else {
                    c0162o2 = AbstractC2349a.i(lVar2, C0163p.f2509c);
                    break;
                }
                break;
        }
        long b7 = K0.F.b(o5.f2424b.a(c0162o2.f2505a.f2503b), o5.f2424b.a(c0162o2.f2506b.f2503b));
        long j10 = j6;
        if (K0.N.a(b7, j10)) {
            return j10;
        }
        boolean z13 = K0.N.f(b7) != K0.N.f(j10) && K0.N.a(K0.F.b((int) (b7 & j7), (int) (b7 >> r27)), j10);
        boolean z14 = K0.N.b(b7) && K0.N.b(j10);
        C0203h c0203h = wVar.f4679a;
        if (z6 && c0203h.f2829l.length() > 0 && !z13 && !z14 && (interfaceC2241a = o5.f2429h) != null) {
            interfaceC2241a.a();
        }
        o5.f2425c.c(c(c0203h, b7));
        if (!z6) {
            o5.p(!K0.N.b(b7));
        }
        Z z15 = o5.f2426d;
        if (z15 != null) {
            z15.f1102q.setValue(Boolean.valueOf(z6));
        }
        Z z16 = o5.f2426d;
        if (z16 != null) {
            z16.f1098m.setValue(Boolean.valueOf(!K0.N.b(b7) && AbstractC0444a.R(o5, true)));
        }
        Z z17 = o5.f2426d;
        if (z17 == null) {
            z8 = false;
        } else {
            z8 = false;
            z17.f1099n.setValue(Boolean.valueOf(!K0.N.b(b7) && AbstractC0444a.R(o5, false)));
        }
        Z z18 = o5.f2426d;
        if (z18 == null) {
            return b7;
        }
        z18.f1100o.setValue(Boolean.valueOf((K0.N.b(b7) && AbstractC0444a.R(o5, true)) ? true : z8));
        return b7;
    }

    public static P0.w c(C0203h c0203h, long j5) {
        return new P0.w(c0203h, j5, (K0.N) null);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [i4.c, kotlin.jvm.internal.m] */
    public final void b(boolean z3) {
        if (K0.N.b(j().f4680b)) {
            return;
        }
        E0 e02 = this.f;
        if (e02 != null) {
            ((C0036j) e02).a(G4.d.w(j()));
        }
        if (z3) {
            int d5 = K0.N.d(j().f4680b);
            this.f2425c.c(c(j().f4679a, K0.F.b(d5, d5)));
            n(E.O.f1064k);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [i4.c, kotlin.jvm.internal.m] */
    public final void d() {
        if (K0.N.b(j().f4680b)) {
            return;
        }
        E0 e02 = this.f;
        if (e02 != null) {
            ((C0036j) e02).a(G4.d.w(j()));
        }
        C0203h z3 = G4.d.z(j(), j().f4679a.f2829l.length());
        C0203h y5 = G4.d.y(j(), j().f4679a.f2829l.length());
        C0200e c0200e = new C0200e(z3);
        c0200e.a(y5);
        C0203h b3 = c0200e.b();
        int e3 = K0.N.e(j().f4680b);
        this.f2425c.c(c(b3, K0.F.b(e3, e3)));
        n(E.O.f1064k);
        this.f2423a.f1037e = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [i4.c, kotlin.jvm.internal.m] */
    public final void e(C1988b c1988b) {
        if (!K0.N.b(j().f4680b)) {
            Z z3 = this.f2426d;
            F0 d5 = z3 != null ? z3.d() : null;
            int d6 = (c1988b == null || d5 == null) ? K0.N.d(j().f4680b) : this.f2424b.a(d5.b(c1988b.f17191a, true));
            this.f2425c.c(P0.w.a(j(), null, K0.F.b(d6, d6), 5));
        }
        n((c1988b == null || j().f4679a.f2829l.length() <= 0) ? E.O.f1064k : E.O.f1066m);
        p(false);
    }

    public final void f(boolean z3) {
        g0.o oVar;
        Z z5 = this.f2426d;
        if (z5 != null && !z5.b() && (oVar = this.i) != null) {
            oVar.a(new g0.l(1, 3));
        }
        this.f2438r = j();
        p(z3);
        n(E.O.f1065l);
    }

    public final C1988b g() {
        return (C1988b) this.f2436p.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.f2431k.getValue()).booleanValue();
    }

    public final long i(boolean z3) {
        F0 d5;
        long j5;
        Z z5 = this.f2426d;
        if (z5 == null || (d5 = z5.d()) == null) {
            return 9205357640488583168L;
        }
        K0.L l5 = d5.f1029a;
        Z z6 = this.f2426d;
        C0203h c0203h = z6 != null ? z6.f1088a.f1193a : null;
        if (c0203h == null) {
            return 9205357640488583168L;
        }
        if (!kotlin.jvm.internal.l.a(c0203h.f2829l, l5.f2792a.f2784a.f2829l)) {
            return 9205357640488583168L;
        }
        P0.w j6 = j();
        if (z3) {
            long j7 = j6.f4680b;
            int i = K0.N.f2802c;
            j5 = j7 >> 32;
        } else {
            long j8 = j6.f4680b;
            int i5 = K0.N.f2802c;
            j5 = j8 & 4294967295L;
        }
        int b3 = this.f2424b.b((int) j5);
        boolean f = K0.N.f(j().f4680b);
        int e3 = l5.e(b3);
        K0.r rVar = l5.f2793b;
        if (e3 >= rVar.f) {
            return 9205357640488583168L;
        }
        boolean z7 = l5.a(((!z3 || f) && (z3 || !f)) ? Math.max(b3 + (-1), 0) : b3) == l5.i(b3);
        rVar.i(b3);
        int length = ((C0203h) rVar.f2853a.f5042l).f2829l.length();
        ArrayList arrayList = rVar.f2859h;
        K0.t tVar = (K0.t) arrayList.get(b3 == length ? X3.n.N(arrayList) : K0.F.d(b3, arrayList));
        C0197b c0197b = tVar.f2862a;
        int d6 = tVar.d(b3);
        L0.k kVar = c0197b.f2815d;
        float h3 = z7 ? kVar.h(d6, false) : kVar.i(d6, false);
        long j9 = l5.f2794c;
        return G4.d.d(AbstractC0444a.s(h3, 0.0f, (int) (j9 >> 32)), AbstractC0444a.s(rVar.b(e3), 0.0f, (int) (j9 & 4294967295L)));
    }

    public final P0.w j() {
        return (P0.w) this.f2427e.getValue();
    }

    public final void k() {
        m1 m1Var = this.f2428g;
        if ((m1Var != null ? ((C0048n0) m1Var).f541d : null) != n1.f542k || m1Var == null) {
            return;
        }
        C0048n0 c0048n0 = (C0048n0) m1Var;
        c0048n0.f541d = n1.f543l;
        ActionMode actionMode = c0048n0.f539b;
        if (actionMode != null) {
            actionMode.finish();
        }
        c0048n0.f539b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x00c8, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [i4.c, kotlin.jvm.internal.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        boolean z3;
        C0203h c0203h;
        byte b3;
        CharSequence charSequence;
        byte b5;
        byte b6;
        byte b7 = 2;
        byte b8 = 0;
        byte b9 = 1;
        E0 e02 = this.f;
        if (e02 == null) {
            return;
        }
        ClipData primaryClip = ((C0036j) e02).f514a.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            CharSequence text = itemAt != null ? itemAt.getText() : null;
            if (text != null) {
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                    ArrayList arrayList = new ArrayList();
                    kotlin.jvm.internal.l.f("<this>", annotationArr);
                    int length = annotationArr.length - 1;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            Annotation annotation = annotationArr[i];
                            if (kotlin.jvm.internal.l.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                int spanStart = spanned.getSpanStart(annotation);
                                int spanEnd = spanned.getSpanEnd(annotation);
                                String value = annotation.getValue();
                                J0 j02 = new J0();
                                Parcel obtain = Parcel.obtain();
                                j02.f304k = obtain;
                                byte[] decode = Base64.decode(value, b8);
                                obtain.unmarshall(decode, b8, decode.length);
                                obtain.setDataPosition(b8);
                                long j5 = i0.p.f17293g;
                                long j6 = j5;
                                long j7 = W0.o.f6021c;
                                long j8 = j7;
                                O0.l lVar = null;
                                O0.j jVar = null;
                                O0.k kVar = null;
                                String str = null;
                                V0.a aVar = null;
                                V0.p pVar = null;
                                V0.l lVar2 = null;
                                i0.I i5 = null;
                                while (true) {
                                    Parcel parcel = (Parcel) j02.f304k;
                                    if (parcel.dataAvail() <= b9) {
                                        break;
                                    }
                                    byte readByte = parcel.readByte();
                                    if (readByte != b9) {
                                        b5 = b8;
                                        if (readByte == b7) {
                                            if (parcel.dataAvail() < 5) {
                                                break;
                                            }
                                            j7 = j02.m();
                                            b8 = b5;
                                        } else if (readByte == 3) {
                                            if (parcel.dataAvail() < 4) {
                                                break;
                                            }
                                            lVar = new O0.l(parcel.readInt());
                                            b8 = b5;
                                        } else if (readByte == 4) {
                                            if (parcel.dataAvail() < b9) {
                                                break;
                                            }
                                            byte readByte2 = parcel.readByte();
                                            jVar = new O0.j((readByte2 != 0 && readByte2 == b9) ? b9 : b5);
                                            b8 = b5;
                                            b7 = 2;
                                        } else if (readByte != 5) {
                                            if (readByte == 6) {
                                                str = parcel.readString();
                                            } else if (readByte != 7) {
                                                if (readByte != 8) {
                                                    if (readByte != 9) {
                                                        if (readByte != 10) {
                                                            if (readByte == 11) {
                                                                if (parcel.dataAvail() < 4) {
                                                                    break;
                                                                }
                                                                int readInt = parcel.readInt();
                                                                byte b10 = (readInt & 2) != 0 ? b9 : b5;
                                                                byte b11 = (readInt & b9) != 0 ? b9 : b5;
                                                                V0.l lVar3 = V0.l.f5946d;
                                                                V0.l lVar4 = V0.l.f5945c;
                                                                if (b10 == 0 || b11 == 0) {
                                                                    lVar2 = b10 != 0 ? lVar3 : b11 != 0 ? lVar4 : V0.l.f5944b;
                                                                } else {
                                                                    V0.l[] lVarArr = new V0.l[2];
                                                                    lVarArr[b5] = lVar3;
                                                                    lVarArr[b9] = lVar4;
                                                                    List O5 = X3.n.O(lVarArr);
                                                                    Integer valueOf = Integer.valueOf(b5);
                                                                    int size = O5.size();
                                                                    for (int i6 = b5; i6 < size; i6 += b9) {
                                                                        valueOf = Integer.valueOf(valueOf.intValue() | ((V0.l) O5.get(i6)).f5947a);
                                                                    }
                                                                    lVar2 = new V0.l(valueOf.intValue());
                                                                }
                                                            } else if (readByte == 12) {
                                                                if (parcel.dataAvail() < 20) {
                                                                    break;
                                                                }
                                                                b9 = b9;
                                                                text = text;
                                                                b8 = b5;
                                                                i5 = new i0.I(parcel.readFloat(), j02.l(), (Float.floatToRawIntBits(parcel.readFloat()) << 32) | (Float.floatToRawIntBits(parcel.readFloat()) & 4294967295L));
                                                                b7 = 2;
                                                            }
                                                        } else if (parcel.dataAvail() < 8) {
                                                            break;
                                                        } else {
                                                            j6 = j02.l();
                                                        }
                                                    } else if (parcel.dataAvail() < 8) {
                                                        break;
                                                    } else {
                                                        pVar = new V0.p(parcel.readFloat(), parcel.readFloat());
                                                    }
                                                } else if (parcel.dataAvail() < 4) {
                                                    break;
                                                } else {
                                                    aVar = new V0.a(parcel.readFloat());
                                                }
                                            } else if (parcel.dataAvail() < 5) {
                                                break;
                                            } else {
                                                j8 = j02.m();
                                            }
                                            b8 = b5;
                                            b7 = 2;
                                        } else {
                                            if (parcel.dataAvail() < b9) {
                                                break;
                                            }
                                            byte readByte3 = parcel.readByte();
                                            if (readByte3 != 0) {
                                                if (readByte3 == b9) {
                                                    b6 = 65535;
                                                } else if (readByte3 == 3) {
                                                    b6 = 2;
                                                } else if (readByte3 == 2) {
                                                    b6 = b9;
                                                }
                                                kVar = new O0.k(b6);
                                                b8 = b5;
                                                b7 = 2;
                                            }
                                            b6 = b5;
                                            kVar = new O0.k(b6);
                                            b8 = b5;
                                            b7 = 2;
                                        }
                                    } else if (parcel.dataAvail() < 8) {
                                        break;
                                    } else {
                                        j5 = j02.l();
                                    }
                                }
                                b3 = b9;
                                charSequence = text;
                                arrayList.add(new C0201f(spanStart, spanEnd, new K0.G(j5, j7, lVar, jVar, kVar, (O0.o) null, str, j8, aVar, pVar, (R0.b) null, j6, lVar2, i5, 49152)));
                            } else {
                                b5 = b8;
                                b3 = b9;
                                charSequence = text;
                            }
                            if (i == length) {
                                break;
                            }
                            i += b3 == true ? 1 : 0;
                            b9 = b3 == true ? 1 : 0;
                            text = charSequence;
                            b8 = b5;
                            b7 = 2;
                        }
                    } else {
                        b3 = 1;
                        charSequence = text;
                    }
                    c0203h = new C0203h(charSequence.toString(), arrayList, 4);
                    z3 = b3;
                } else {
                    c0203h = new C0203h(text.toString());
                    z3 = 1;
                }
                if (c0203h != null) {
                    return;
                }
                C0200e c0200e = new C0200e(G4.d.z(j(), j().f4679a.f2829l.length()));
                c0200e.a(c0203h);
                C0203h b12 = c0200e.b();
                C0203h y5 = G4.d.y(j(), j().f4679a.f2829l.length());
                C0200e c0200e2 = new C0200e(b12);
                c0200e2.a(y5);
                C0203h b13 = c0200e2.b();
                int length2 = c0203h.f2829l.length() + K0.N.e(j().f4680b);
                this.f2425c.c(c(b13, K0.F.b(length2, length2)));
                n(E.O.f1064k);
                this.f2423a.f1037e = z3;
                return;
            }
        }
        z3 = 1;
        c0203h = null;
        if (c0203h != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [i4.c, kotlin.jvm.internal.m] */
    public final void m() {
        P0.w c5 = c(j().f4679a, K0.F.b(0, j().f4679a.f2829l.length()));
        this.f2425c.c(c5);
        this.f2438r = P0.w.a(this.f2438r, null, c5.f4680b, 5);
        f(true);
    }

    public final void n(E.O o5) {
        Z z3 = this.f2426d;
        if (z3 != null) {
            if (z3.a() == o5) {
                z3 = null;
            }
            if (z3 != null) {
                z3.f1096k.setValue(o5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        E.A a5;
        m1 m1Var;
        m1 m1Var2;
        C1989c c1989c;
        ActionMode actionMode;
        float f;
        InterfaceC2637x c5;
        InterfaceC2637x c6;
        InterfaceC2637x c7;
        InterfaceC2637x c8;
        E0 e02;
        if (!h()) {
            return;
        }
        Z z3 = this.f2426d;
        if (z3 != null && !((Boolean) z3.f1102q.getValue()).booleanValue()) {
            return;
        }
        E.A a6 = !K0.N.b(j().f4680b) ? new E.A(this, 4) : null;
        boolean b3 = K0.N.b(j().f4680b);
        C0305m0 c0305m0 = this.f2430j;
        E.A a7 = (b3 || !((Boolean) c0305m0.getValue()).booleanValue()) ? null : new E.A(this, 5);
        if (((Boolean) c0305m0.getValue()).booleanValue() && (e02 = this.f) != null) {
            ClipDescription primaryClipDescription = ((C0036j) e02).f514a.getPrimaryClipDescription();
            if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                a5 = new E.A(this, 6);
                E.A a8 = K0.N.c(j().f4680b) == j().f4679a.f2829l.length() ? new E.A(this, 7) : null;
                m1Var = this.f2428g;
                if (m1Var != null) {
                    return;
                }
                Z z5 = this.f2426d;
                if (z5 != null) {
                    Z z6 = z5.f1101p ? null : z5;
                    if (z6 != null) {
                        int b5 = this.f2424b.b((int) (j().f4680b >> 32));
                        int b6 = this.f2424b.b((int) (j().f4680b & 4294967295L));
                        Z z7 = this.f2426d;
                        long j5 = 0;
                        long J = (z7 == null || (c8 = z7.c()) == null) ? 0L : c8.J(i(true));
                        Z z8 = this.f2426d;
                        if (z8 != null && (c7 = z8.c()) != null) {
                            j5 = c7.J(i(false));
                        }
                        Z z9 = this.f2426d;
                        float f5 = 0.0f;
                        if (z9 == null || (c6 = z9.c()) == null) {
                            m1Var2 = m1Var;
                            f = 0.0f;
                        } else {
                            F0 d5 = z6.d();
                            m1Var2 = m1Var;
                            f = C1988b.e(c6.J(G4.d.d(0.0f, d5 != null ? d5.f1029a.c(b5).f17194b : 0.0f)));
                        }
                        Z z10 = this.f2426d;
                        if (z10 != null && (c5 = z10.c()) != null) {
                            F0 d6 = z6.d();
                            f5 = C1988b.e(c5.J(G4.d.d(0.0f, d6 != null ? d6.f1029a.c(b6).f17194b : 0.0f)));
                        }
                        c1989c = new C1989c(Math.min(C1988b.d(J), C1988b.d(j5)), Math.min(f, f5), Math.max(C1988b.d(J), C1988b.d(j5)), (z6.f1088a.f1198g.c() * 25) + Math.max(C1988b.e(J), C1988b.e(j5)));
                        C0048n0 c0048n0 = (C0048n0) m1Var2;
                        C0.c cVar = c0048n0.f540c;
                        cVar.f812c = c1989c;
                        cVar.f813d = a6;
                        cVar.f = a7;
                        cVar.f814e = a5;
                        cVar.f815g = a8;
                        actionMode = c0048n0.f539b;
                        if (actionMode == null) {
                            actionMode.invalidate();
                            return;
                        } else {
                            c0048n0.f541d = n1.f542k;
                            c0048n0.f539b = c0048n0.f538a.startActionMode(new C0.a(cVar), 1);
                            return;
                        }
                    }
                }
                m1Var2 = m1Var;
                c1989c = C1989c.f17192e;
                C0048n0 c0048n02 = (C0048n0) m1Var2;
                C0.c cVar2 = c0048n02.f540c;
                cVar2.f812c = c1989c;
                cVar2.f813d = a6;
                cVar2.f = a7;
                cVar2.f814e = a5;
                cVar2.f815g = a8;
                actionMode = c0048n02.f539b;
                if (actionMode == null) {
                }
            }
        }
        a5 = null;
        if (K0.N.c(j().f4680b) == j().f4679a.f2829l.length()) {
        }
        m1Var = this.f2428g;
        if (m1Var != null) {
        }
    }

    public final void p(boolean z3) {
        Z z5 = this.f2426d;
        if (z5 != null) {
            z5.f1097l.setValue(Boolean.valueOf(z3));
        }
        if (z3) {
            o();
        } else {
            k();
        }
    }
}
