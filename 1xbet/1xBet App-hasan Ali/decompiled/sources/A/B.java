package A;

import A0.C0016c0;
import A0.C0028g0;
import A0.M0;
import A0.V0;
import A0.W0;
import A0.Z;
import A0.Z0;
import E.N;
import G1.C0140k;
import G1.C0141l;
import G1.C0143n;
import G1.O;
import I.InterfaceC0159l;
import P.C0297i0;
import P.d1;
import X3.C0442b;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.view.MotionEvent;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import com.google.android.gms.internal.ads.C1639u7;
import e2.C1930k;
import h0.C1988b;
import i0.C2003h;
import i0.InterfaceC2009n;
import i0.L;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import k0.C2023c;
import k0.InterfaceC2025e;
import l0.C2041b;
import o0.C2198b;
import r.C2343v;
import r0.AbstractC2346c;
import t.C2400l;
import u.C2469p;
import u.r0;
import x0.InterfaceC2637x;
import x0.f0;
import z0.AbstractC2749f;
import z0.B0;
import z0.C2731G;
import z0.C2733I;
import z0.z0;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(int i, Object obj) {
        super(1);
        this.f2l = i;
        this.f3m = obj;
    }

    /* JADX WARN: Type inference failed for: r0v76, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f2l) {
            case 0:
                float f = -((Number) obj).floatValue();
                E e3 = (E) this.f3m;
                if ((f < 0.0f && !e3.c()) || (f > 0.0f && !e3.a())) {
                    f = 0.0f;
                } else {
                    if (Math.abs(e3.f14g) > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + e3.f14g).toString());
                    }
                    float f5 = e3.f14g + f;
                    e3.f14g = f5;
                    if (Math.abs(f5) > 0.5f) {
                        t tVar = (t) e3.f13e.getValue();
                        float f6 = e3.f14g;
                        int round = Math.round(f6);
                        t tVar2 = e3.f11c;
                        boolean e5 = tVar.e(round, !e3.f10b);
                        if (e5 && tVar2 != null) {
                            e5 = tVar2.e(round, true);
                        }
                        if (e5) {
                            e3.f(tVar, e3.f10b, true);
                            e3.f27u.setValue(W3.o.f6046a);
                            e3.h(f6 - e3.f14g, tVar);
                        } else {
                            C2731G c2731g = e3.f16j;
                            if (c2731g != null) {
                                c2731g.k();
                            }
                            e3.h(f6 - e3.f14g, e3.g());
                        }
                    }
                    if (Math.abs(e3.f14g) > 0.5f) {
                        f -= e3.f14g;
                        e3.f14g = 0.0f;
                    }
                }
                return Float.valueOf(-f);
            case 1:
                return Boolean.valueOf(((C2343v) this.f3m).a(((H0.n) obj).f2116g));
            case 2:
                return Boolean.valueOf(Z.l((H0.n) obj, (Resources) this.f3m));
            case 3:
                return new C0016c0(0, (M0) this.f3m);
            case 4:
                boolean compareAndSet = V0.f400b.compareAndSet(false, true);
                W3.o oVar = W3.o.f6046a;
                if (compareAndSet) {
                    ((r4.c) this.f3m).q(oVar);
                }
                return oVar;
            case 5:
                InterfaceC2025e interfaceC2025e = (InterfaceC2025e) obj;
                InterfaceC2009n v4 = interfaceC2025e.B().v();
                i4.e eVar = ((W0) this.f3m).f410n;
                if (eVar != null) {
                    eVar.invoke(v4, (C2041b) interfaceC2025e.B().f20433m);
                }
                return W3.o.f6046a;
            case 6:
                P0.l lVar = (P0.l) obj;
                G.D d5 = lVar.f4664b;
                if (d5 != null) {
                    lVar.a(d5);
                    lVar.f4664b = null;
                }
                Z0 z02 = (Z0) this.f3m;
                R.e eVar2 = z02.f430d;
                Object[] objArr = eVar2.f5106k;
                int i = eVar2.f5108m;
                int i5 = 0;
                while (true) {
                    if (i5 >= i) {
                        i5 = -1;
                    } else if (!kotlin.jvm.internal.l.a((B0) objArr[i5], lVar)) {
                        i5++;
                    }
                }
                R.e eVar3 = z02.f430d;
                if (i5 >= 0) {
                    eVar3.l(i5);
                }
                if (eVar3.f5108m == 0) {
                    z02.f428b.invoke();
                }
                return W3.o.f6046a;
            case 7:
                return new C0016c0(1, (B.p) this.f3m);
            case 8:
                return new C0016c0(3, (B.w) this.f3m);
            case 9:
                ((H0.j) obj).f(I.A.f2384c, new I.z(N.f1060k, ((InterfaceC0159l) this.f3m).a(), 2, true));
                return W3.o.f6046a;
            case 10:
                float[] fArr = ((i0.z) obj).f17303a;
                InterfaceC2637x interfaceC2637x = (InterfaceC2637x) this.f3m;
                if (interfaceC2637x.F()) {
                    f0.h(interfaceC2637x).R(interfaceC2637x, fArr);
                }
                return W3.o.f6046a;
            case 11:
                float floatValue = ((Number) obj).floatValue();
                E.B0 b02 = (E.B0) this.f3m;
                float h3 = b02.f994a.h() + floatValue;
                C0297i0 c0297i0 = b02.f995b;
                float h4 = c0297i0.h();
                C0297i0 c0297i02 = b02.f994a;
                if (h3 > h4) {
                    floatValue = c0297i0.h() - c0297i02.h();
                } else if (h3 < 0.0f) {
                    floatValue = -c0297i02.h();
                }
                c0297i02.i(c0297i02.h() + floatValue);
                return Float.valueOf(floatValue);
            case 12:
                ((G.D) this.f3m).a((P0.g) obj);
                return W3.o.f6046a;
            case 13:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f3m).cancel();
                }
                return W3.o.f6046a;
            case 14:
                C0140k c0140k = (C0140k) obj;
                kotlin.jvm.internal.l.f("backStackEntry", c0140k);
                G1.y yVar = c0140k.f1899l;
                if (!(yVar != null)) {
                    yVar = null;
                }
                if (yVar != null) {
                    c0140k.c();
                    O o5 = (O) this.f3m;
                    G1.y c5 = o5.c(yVar);
                    if (c5 != null) {
                        if (c5.equals(yVar)) {
                            return c0140k;
                        }
                        C0143n b3 = o5.b();
                        Bundle c6 = c5.c(c0140k.c());
                        G1.E e6 = b3.f1922h;
                        return j3.i.l(e6.f1827a, c5, c6, e6.h(), e6.f1840p);
                    }
                }
                return null;
            case 15:
                H0.u.b((H0.j) obj, ((H0.g) this.f3m).f2074a);
                return W3.o.f6046a;
            case 16:
                ((List) obj).add((Float) ((B.C) this.f3m).invoke());
                return true;
            case 17:
                Bundle bundle = (Bundle) obj;
                G1.E d6 = AbstractC2346c.d((Context) this.f3m);
                if (bundle != null) {
                    bundle.setClassLoader(d6.f1827a.getClassLoader());
                    d6.f1830d = bundle.getBundle("android-support-nav:controller:navigatorState");
                    d6.f1831e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = d6.f1838n;
                    linkedHashMap.clear();
                    int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    int i6 = 0;
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < length) {
                            d6.f1837m.put(Integer.valueOf(intArray[i7]), stringArrayList.get(i8));
                            i7++;
                            i8++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        int size = stringArrayList2.size();
                        while (i6 < size) {
                            String str = stringArrayList2.get(i6);
                            i6++;
                            String str2 = str;
                            Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str2);
                            if (parcelableArray != null) {
                                kotlin.jvm.internal.l.e("id", str2);
                                X3.k kVar = new X3.k(parcelableArray.length);
                                C0442b i9 = kotlin.jvm.internal.l.i(parcelableArray);
                                while (i9.hasNext()) {
                                    Parcelable parcelable = (Parcelable) i9.next();
                                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState", parcelable);
                                    kVar.addLast((C0141l) parcelable);
                                }
                                linkedHashMap.put(str2, kVar);
                            }
                        }
                    }
                    d6.f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                return d6;
            case 18:
                return new C1988b(((C1988b) ((InterfaceC2015a) this.f3m).invoke()).f17191a);
            case 19:
                ((i0.G) obj).a(((Number) ((r0) this.f3m).f19908t.getValue()).floatValue());
                return W3.o.f6046a;
            case 20:
                ((C2731G) this.f3m).a0((W0.c) obj);
                return W3.o.f6046a;
            case C1639u7.zzm /* 21 */:
                e0.f fVar = (e0.f) obj;
                if (!fVar.f7162k.f7175x) {
                    return z0.f21877l;
                }
                e0.f fVar2 = fVar.f16900z;
                z0 z0Var = z0.f21876k;
                if (fVar2 != null) {
                    B b5 = new B(21, (C1930k) this.f3m);
                    if (b5.c(fVar2) == z0Var) {
                        AbstractC2749f.z(fVar2, b5);
                    }
                }
                fVar.f16900z = null;
                fVar.f16899y = null;
                return z0Var;
            case 22:
                C2733I c2733i = (C2733I) obj;
                ((C0028g0) this.f3m).c(c2733i);
                c2733i.a();
                return W3.o.f6046a;
            case 23:
                i0.G g5 = (i0.G) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.f3m;
                shadowGraphicsLayerElement.getClass();
                g5.h(g5.f17240x.c() * w.i.f20468d);
                g5.j(shadowGraphicsLayerElement.f6910k);
                g5.e(shadowGraphicsLayerElement.f6911l);
                g5.b(shadowGraphicsLayerElement.f6912m);
                g5.k(shadowGraphicsLayerElement.f6913n);
                return W3.o.f6046a;
            case 24:
                i0.G g6 = (i0.G) obj;
                L l5 = (L) this.f3m;
                g6.f(l5.f17260y);
                g6.g(l5.f17261z);
                g6.a(l5.f17251A);
                g6.h(l5.f17252B);
                float f7 = l5.f17253C;
                if (g6.f17234r != f7) {
                    g6.f17227k |= 1024;
                    g6.f17234r = f7;
                }
                float f8 = l5.f17254D;
                if (g6.f17235s != f8) {
                    g6.f17227k |= 2048;
                    g6.f17235s = f8;
                }
                g6.l(l5.f17255E);
                g6.j(l5.f17256F);
                g6.e(l5.f17257G);
                g6.b(l5.f17258H);
                g6.k(l5.f17259I);
                int i10 = l5.J;
                if (g6.f17242z != i10) {
                    g6.f17227k |= 524288;
                    g6.f17242z = i10;
                }
                return W3.o.f6046a;
            case 25:
                InterfaceC2025e interfaceC2025e2 = (InterfaceC2025e) obj;
                C2041b c2041b = (C2041b) this.f3m;
                C2003h c2003h = c2041b.f17674l;
                if (c2041b.f17676n && c2041b.f17685w && c2003h != null) {
                    v3.e B5 = interfaceC2025e2.B();
                    long A3 = B5.A();
                    B5.v().k();
                    try {
                        ((v3.e) ((C2023c) B5.f20432l).f17544l).v().d(c2003h);
                        c2041b.c(interfaceC2025e2);
                    } finally {
                        B5.v().j();
                        B5.P(A3);
                    }
                } else {
                    c2041b.c(interfaceC2025e2);
                }
                return W3.o.f6046a;
            case 26:
                o0.v vVar = (o0.v) obj;
                C2198b c2198b = (C2198b) this.f3m;
                c2198b.g(vVar);
                ?? r02 = c2198b.i;
                if (r02 != 0) {
                    r02.c(vVar);
                }
                return W3.o.f6046a;
            case 27:
                d1 d1Var = (d1) ((C2400l) this.f3m).f19388d.g(obj);
                return new W0.l(d1Var != null ? ((W0.l) d1Var.getValue()).f6015a : 0L);
            case 28:
                C2469p c2469p = (C2469p) obj;
                float f9 = c2469p.f19894b;
                if (f9 < 0.0f) {
                    f9 = 0.0f;
                }
                if (f9 > 1.0f) {
                    f9 = 1.0f;
                }
                float f10 = c2469p.f19895c;
                if (f10 < -0.5f) {
                    f10 = -0.5f;
                }
                if (f10 > 0.5f) {
                    f10 = 0.5f;
                }
                float f11 = c2469p.f19896d;
                float f12 = f11 >= -0.5f ? f11 : -0.5f;
                float f13 = f12 <= 0.5f ? f12 : 0.5f;
                float f14 = c2469p.f19893a;
                float f15 = f14 >= 0.0f ? f14 : 0.0f;
                return new i0.p(i0.p.a(i0.F.b(f9, f10, f13, f15 <= 1.0f ? f15 : 1.0f, j0.d.f17436x), (j0.c) this.f3m));
            default:
                ((Z0.d) ((t0.x) this.f3m).i()).c((MotionEvent) obj);
                return W3.o.f6046a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(O o5, G1.H h3) {
        super(1);
        this.f2l = 14;
        this.f3m = o5;
    }
}
