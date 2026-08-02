package A0;

import E.C0107l;
import G1.AbstractC0136g;
import G1.C0131b;
import G1.C0140k;
import G1.C0142m;
import K0.C0204i;
import P.C0305m0;
import P.InterfaceC0289e0;
import S3.C0416t;
import android.content.ClipDescription;
import android.content.Context;
import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.InterfaceC0491u;
import b1.AbstractC0507h;
import b1.C0508i;
import com.google.android.gms.internal.ads.C1639u7;
import e2.C1930k;
import g0.C1965j;
import g0.InterfaceC1964i;
import h0.C1991e;
import i0.C2007l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import k0.C2022b;
import k0.C2023c;
import k0.InterfaceC2025e;
import p4.AbstractC2282w;
import p4.C2275o;
import p4.C2285z;
import r0.AbstractC2346c;
import r0.C2345b;
import y.C2654j;
import z.C2681E;
import z0.C2731G;
import z0.C2733I;

/* renamed from: A0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028g0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f503l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f504m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f505n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0028g0(int i, Object obj, Object obj2) {
        super(1);
        this.f503l = i;
        this.f504m = obj;
        this.f505n = obj2;
    }

    private final Object a(Object obj) {
        C0055r0 c0055r0 = (C0055r0) this.f504m;
        ChoreographerFrameCallbackC0057s0 choreographerFrameCallbackC0057s0 = (ChoreographerFrameCallbackC0057s0) this.f505n;
        synchronized (c0055r0.f558o) {
            c0055r0.f560q.remove(choreographerFrameCallbackC0057s0);
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ff  */
    @Override // i4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj) {
        G.D d5;
        View s2;
        androidx.lifecycle.L g5;
        E.Z z3;
        boolean z5;
        E0 e02;
        int i = 5;
        int i5 = 22;
        int i6 = 19;
        int i7 = 3;
        View view = null;
        int i8 = 2;
        int i9 = 0;
        r8 = null;
        r8 = null;
        r8 = null;
        Object[] objArr = null;
        r8 = false;
        r8 = false;
        r8 = false;
        r8 = false;
        r8 = false;
        boolean z6 = false;
        r8 = false;
        r8 = false;
        boolean z7 = false;
        int i10 = 1;
        switch (this.f503l) {
            case 0:
                Context context = (Context) this.f504m;
                Context applicationContext = context.getApplicationContext();
                ComponentCallbacks2C0031h0 componentCallbacks2C0031h0 = (ComponentCallbacks2C0031h0) this.f505n;
                applicationContext.registerComponentCallbacks(componentCallbacks2C0031h0);
                return new C0025f0(i9, context, componentCallbacks2C0031h0);
            case 1:
                Context context2 = (Context) this.f504m;
                Context applicationContext2 = context2.getApplicationContext();
                ComponentCallbacks2C0034i0 componentCallbacks2C0034i0 = (ComponentCallbacks2C0034i0) this.f505n;
                applicationContext2.registerComponentCallbacks(componentCallbacks2C0034i0);
                return new C0025f0(i10, context2, componentCallbacks2C0034i0);
            case 2:
                return new Z0((G.B) this.f504m, new C0040k0(i9, (C0046m0) this.f505n));
            case 3:
                Z0 z02 = (Z0) this.f504m;
                synchronized (z02.f429c) {
                    try {
                        z02.f431e = true;
                        R.e eVar = z02.f430d;
                        Object[] objArr2 = eVar.f5106k;
                        int i11 = eVar.f5108m;
                        while (i9 < i11) {
                            P0.l lVar = (P0.l) ((z0.B0) objArr2[i9]).get();
                            if (lVar != null && (d5 = lVar.f4664b) != null) {
                                lVar.a(d5);
                                lVar.f4664b = null;
                            }
                            i9++;
                        }
                        z02.f430d.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                P0.x xVar = ((C0046m0) this.f505n).f534l;
                xVar.f4683b.set(null);
                xVar.f4682a.h();
                return W3.o.f6046a;
            case 4:
                return a(obj);
            case 5:
                ((Choreographer) ((C0059t0) this.f504m).f578l).removeFrameCallback((ChoreographerFrameCallbackC0057s0) this.f505n);
                return W3.o.f6046a;
            case 6:
                View view2 = (View) obj;
                A a5 = new A(view2.getNextFocusForwardId(), i10);
                View view3 = null;
                while (true) {
                    s2 = Z.s(view2, a5, view3);
                    if (s2 == null && view2 != ((ViewGroup) this.f504m)) {
                        ViewParent parent = view2.getParent();
                        if (parent != null && (parent instanceof View)) {
                            View view4 = (View) parent;
                            view3 = view2;
                            view2 = view4;
                        }
                    }
                }
                view = s2;
                return Boolean.valueOf(view == ((View) this.f505n));
            case 7:
                C0053q c0053q = (C0053q) obj;
                K1 k12 = (K1) this.f504m;
                if (!k12.f317m) {
                    androidx.lifecycle.L g6 = c0053q.f549a.g();
                    X.d dVar = (X.d) this.f505n;
                    k12.f319o = dVar;
                    if (k12.f318n == null) {
                        k12.f318n = g6;
                        g6.a(k12);
                    } else if (g6.h().compareTo(EnumC0487p.f7060m) >= 0) {
                        k12.f316l.A(new X.d(1330788943, new J1(k12, dVar, i10), true));
                    }
                }
                return W3.o.f6046a;
            case 8:
                B.J j5 = (B.J) this.f504m;
                LinkedHashSet linkedHashSet = j5.f635m;
                Object obj2 = this.f505n;
                linkedHashSet.remove(obj2);
                return new C0025f0(i8, j5, obj2);
            case 9:
                KeyEvent keyEvent = ((C2345b) obj).f19083a;
                if (((E.Z) this.f504m).a() == E.O.f1065l && keyEvent.getKeyCode() == 4 && AbstractC2346c.t(keyEvent) == 1) {
                    ((I.O) this.f505n).e(null);
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 10:
                KeyEvent keyEvent2 = ((C2345b) obj).f19083a;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && AbstractC2346c.t(keyEvent2) == 2 && keyEvent2.getSource() != 257) {
                    boolean i12 = E.W.i(19, keyEvent2);
                    InterfaceC1964i interfaceC1964i = (InterfaceC1964i) this.f504m;
                    if (i12) {
                        z6 = ((C1965j) interfaceC1964i).f(5);
                    } else if (E.W.i(20, keyEvent2)) {
                        z6 = ((C1965j) interfaceC1964i).f(6);
                    } else if (E.W.i(21, keyEvent2)) {
                        z6 = ((C1965j) interfaceC1964i).f(3);
                    } else if (E.W.i(22, keyEvent2)) {
                        z6 = ((C1965j) interfaceC1964i).f(4);
                    } else if (E.W.i(23, keyEvent2)) {
                        InterfaceC0044l1 interfaceC0044l1 = ((E.Z) this.f505n).f1090c;
                        if (interfaceC0044l1 != null) {
                            ((L0) interfaceC0044l1).b();
                        }
                        z6 = true;
                    }
                }
                return Boolean.valueOf(z6);
            case 11:
                return new C0025f0(i7, (InterfaceC0289e0) this.f504m, (C2654j) this.f505n);
            case 12:
                G1.I i13 = (G1.I) obj;
                kotlin.jvm.internal.l.f("$this$navOptions", i13);
                G1.G g7 = i13.f1863a;
                g7.f1854d = 0;
                g7.f1855e = 0;
                G1.y yVar = (G1.y) this.f504m;
                if (yVar instanceof G1.B) {
                    int i14 = G1.y.f1963s;
                    Iterator it = AbstractC0136g.b(yVar).iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        G1.E e3 = (G1.E) this.f505n;
                        if (hasNext) {
                            G1.y yVar2 = (G1.y) it.next();
                            C0140k c0140k = (C0140k) e3.f1832g.h();
                            G1.y yVar3 = c0140k != null ? c0140k.f1899l : null;
                            if (kotlin.jvm.internal.l.a(yVar2, yVar3 != null ? yVar3.f1965l : null)) {
                            }
                        } else {
                            int i15 = G1.B.f1815x;
                            Iterator it2 = n4.i.M(e3.g(), C0131b.f1885t).iterator();
                            if (!it2.hasNext()) {
                                throw new NoSuchElementException("Sequence is empty.");
                            }
                            Object next = it2.next();
                            while (it2.hasNext()) {
                                next = it2.next();
                            }
                            i13.f1866d = ((G1.y) next).f1969p;
                            i13.f = true;
                        }
                    }
                }
                return W3.o.f6046a;
            case 13:
                G1.E e5 = (G1.E) this.f504m;
                e5.getClass();
                InterfaceC0491u interfaceC0491u = (InterfaceC0491u) this.f505n;
                kotlin.jvm.internal.l.f("owner", interfaceC0491u);
                if (!interfaceC0491u.equals(e5.f1839o)) {
                    InterfaceC0491u interfaceC0491u2 = e5.f1839o;
                    C0142m c0142m = e5.f1843s;
                    if (interfaceC0491u2 != null && (g5 = interfaceC0491u2.g()) != null) {
                        g5.k(c0142m);
                    }
                    e5.f1839o = interfaceC0491u;
                    interfaceC0491u.g().a(c0142m);
                }
                return new H1.s(0);
            case 14:
                return new C0025f0(i, (P.d1) this.f504m, (H1.i) this.f505n);
            case 15:
                t0.s sVar = (t0.s) obj;
                long j6 = sVar.f19502c;
                o1 o1Var = (o1) this.f505n;
                C1930k c1930k = (C1930k) this.f504m;
                I.O o5 = (I.O) c1930k.f16910l;
                if (o5.h() && o5.j().f4679a.f2829l.length() != 0 && (z3 = o5.f2426d) != null && z3.d() != null) {
                    c1930k.r(o5.j(), j6, false, o1Var);
                    objArr = 1;
                }
                if (objArr != null) {
                    sVar.a();
                }
                return W3.o.f6046a;
            case 16:
                w.h hVar = (w.h) obj;
                I.O o6 = (I.O) this.f504m;
                boolean b3 = K0.N.b(o6.j().f4680b);
                C0305m0 c0305m0 = o6.f2430j;
                boolean z8 = !b3 && ((Boolean) c0305m0.getValue()).booleanValue();
                C0107l c0107l = new C0107l(1);
                w.m mVar = (w.m) this.f505n;
                w.h.b(hVar, c0107l, z8, new I.T(mVar, o6, i9));
                w.h.b(hVar, new C0107l(2), !b3, new I.T(mVar, o6, i10));
                if (((Boolean) c0305m0.getValue()).booleanValue() && (e02 = o6.f) != null) {
                    ClipDescription primaryClipDescription = ((C0036j) e02).f514a.getPrimaryClipDescription();
                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                        z5 = true;
                        w.h.b(hVar, new C0107l(3), z5, new I.T(mVar, o6, i8));
                        w.h.b(hVar, new C0107l(4), K0.N.c(o6.j().f4680b) != o6.j().f4679a.f2829l.length(), new I.T(mVar, o6, i7));
                        return W3.o.f6046a;
                    }
                }
                z5 = false;
                w.h.b(hVar, new C0107l(3), z5, new I.T(mVar, o6, i8));
                w.h.b(hVar, new C0107l(4), K0.N.c(o6.j().f4680b) != o6.j().f4679a.f2829l.length(), new I.T(mVar, o6, i7));
                return W3.o.f6046a;
            case 17:
                Throwable th2 = (Throwable) obj;
                C0508i c0508i = (C0508i) this.f504m;
                if (th2 == null) {
                    C2285z c2285z = (C2285z) this.f505n;
                    c2285z.getClass();
                    Object obj3 = p4.b0.f18780k.get(c2285z);
                    if (obj3 instanceof p4.O) {
                        throw new IllegalStateException("This job has not completed yet");
                    }
                    if (obj3 instanceof C2275o) {
                        throw ((C2275o) obj3).f18812a;
                    }
                    Object u5 = AbstractC2282w.u(obj3);
                    c0508i.f7210d = true;
                    b1.k kVar = c0508i.f7208b;
                    if (kVar != null) {
                        b1.j jVar = kVar.f7213l;
                        jVar.getClass();
                        if (u5 == null) {
                            u5 = AbstractC0507h.f7203q;
                        }
                        if (AbstractC0507h.f7202p.l(jVar, null, u5)) {
                            AbstractC0507h.c(jVar);
                            c0508i.f7207a = null;
                            c0508i.f7208b = null;
                            c0508i.f7209c = null;
                        }
                    }
                } else if (th2 instanceof CancellationException) {
                    c0508i.f7210d = true;
                    b1.k kVar2 = c0508i.f7208b;
                    if (kVar2 != null && kVar2.f7213l.cancel(true)) {
                        c0508i.f7207a = null;
                        c0508i.f7208b = null;
                        c0508i.f7209c = null;
                    }
                } else {
                    c0508i.f7210d = true;
                    b1.k kVar3 = c0508i.f7208b;
                    if (kVar3 != null && kVar3.f7213l.i(th2)) {
                        c0508i.f7207a = null;
                        c0508i.f7208b = null;
                        c0508i.f7209c = null;
                    }
                }
                return W3.o.f6046a;
            case 18:
                C2733I c2733i = (C2733I) obj;
                long j7 = ((C1991e) ((N.f) this.f504m).get()).f17204a;
                float d6 = C1991e.d(j7);
                if (d6 > 0.0f) {
                    float y5 = c2733i.y(M.V.f3256a);
                    float y6 = c2733i.y(((C2681E) this.f505n).a(c2733i.getLayoutDirection())) - y5;
                    float f = 2;
                    float f5 = (y5 * f) + d6 + y6;
                    W0.m layoutDirection = c2733i.getLayoutDirection();
                    int[] iArr = M.U.f3255a;
                    int i16 = iArr[layoutDirection.ordinal()];
                    C2022b c2022b = c2733i.f21647k;
                    float d7 = i16 == 1 ? C1991e.d(c2022b.f17540l.A()) - f5 : y6 < 0.0f ? 0.0f : y6;
                    if (iArr[c2733i.getLayoutDirection().ordinal()] == 1) {
                        f5 = C1991e.d(c2022b.f17540l.A()) - (y6 >= 0.0f ? y6 : 0.0f);
                    }
                    float f6 = f5;
                    float b5 = C1991e.b(j7);
                    float f7 = (-b5) / f;
                    float f8 = b5 / f;
                    v3.e eVar2 = c2022b.f17540l;
                    long A3 = eVar2.A();
                    eVar2.v().k();
                    try {
                        ((v3.e) ((C2023c) eVar2.f20432l).f17544l).v().f(d7, f7, f6, f8, 0);
                        c2733i.a();
                    } finally {
                        eVar2.v().j();
                        eVar2.P(A3);
                    }
                } else {
                    c2733i.a();
                }
                return W3.o.f6046a;
            case 19:
                i0.F.j((InterfaceC2025e) obj, (i0.D) this.f504m, ((M.r0) this.f505n).a());
                return W3.o.f6046a;
            case 20:
                f0.c cVar = (f0.c) obj;
                return cVar.a(new A.B(i5, new C0028g0(i6, ((i0.J) this.f504m).a(cVar.f16923k.d(), cVar.f16923k.getLayoutDirection(), cVar), (M.r0) this.f505n)));
            case C1639u7.zzm /* 21 */:
                return ((C0416t) this.f504m).c(((List) this.f505n).get(((Number) obj).intValue()));
            case 22:
                return ((C0204i) this.f504m).c(((List) this.f505n).get(((Number) obj).intValue()));
            case 23:
                return ((C0416t) this.f504m).c(((List) this.f505n).get(((Number) obj).intValue()));
            case 24:
                int intValue = ((Number) obj).intValue();
                return ((S3.L) this.f504m).invoke(Integer.valueOf(intValue), ((List) this.f505n).get(intValue));
            case 25:
                return ((C0416t) this.f504m).c(((List) this.f505n).get(((Number) obj).intValue()));
            case 26:
                return ((C0416t) this.f504m).c(((List) this.f505n).get(((Number) obj).intValue()));
            case 27:
                ((C2731G) this.f504m).e0(((b0.p) obj).c((b0.p) this.f505n));
                return W3.o.f6046a;
            case 28:
                a1.w wVar = (a1.w) this.f504m;
                wVar.setPositionProvider((a1.z) this.f505n);
                wVar.m();
                return new a1.h();
            default:
                x0.Y.l((x0.Y) obj, (x0.Z) this.f504m, ((C2007l) this.f505n).f17286y);
                return W3.o.f6046a;
        }
    }
}
