package L;

import P.AbstractC0329z;
import P.C0305m0;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import h0.C1988b;
import p4.AbstractC2282w;
import p4.C2265e;
import p4.C2273m;
import p4.C2275o;
import p4.O;
import p4.T;
import p4.Y;
import p4.b0;
import r0.AbstractC2346c;
import u.AbstractC2453d;
import u.C2451c;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public C1988b f2956a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2957b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2958c;

    /* renamed from: d, reason: collision with root package name */
    public Float f2959d;

    /* renamed from: e, reason: collision with root package name */
    public C1988b f2960e;
    public final C2451c f = AbstractC2453d.a();

    /* renamed from: g, reason: collision with root package name */
    public final C2451c f2961g = AbstractC2453d.a();

    /* renamed from: h, reason: collision with root package name */
    public final C2451c f2962h = AbstractC2453d.a();
    public final C2273m i;

    /* renamed from: j, reason: collision with root package name */
    public final C0305m0 f2963j;

    /* renamed from: k, reason: collision with root package name */
    public final C0305m0 f2964k;

    public p(C1988b c1988b, float f, boolean z3) {
        this.f2956a = c1988b;
        this.f2957b = f;
        this.f2958c = z3;
        C2273m c2273m = new C2273m(true);
        c2273m.N(null);
        this.i = c2273m;
        Boolean bool = Boolean.FALSE;
        this.f2963j = AbstractC0329z.t(bool);
        this.f2964k = AbstractC0329z.t(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r11 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC0542c abstractC0542c) {
        i iVar;
        int i;
        p pVar;
        C2273m c2273m;
        Object obj;
        Object u5;
        if (abstractC0542c instanceof i) {
            iVar = (i) abstractC0542c;
            int i5 = iVar.f2943n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iVar.f2943n = i5 - Integer.MIN_VALUE;
                Object obj2 = iVar.f2941l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = iVar.f2943n;
                W3.o oVar = W3.o.f6046a;
                if (i != 0) {
                    G4.l.N(obj2);
                    iVar.f2940k = this;
                    iVar.f2943n = 1;
                    Object e3 = AbstractC2282w.e(new m(this, null), iVar);
                    if (e3 != enumC0510a) {
                        e3 = oVar;
                    }
                    if (e3 != enumC0510a) {
                        pVar = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        G4.l.N(obj2);
                        return oVar;
                    }
                    pVar = iVar.f2940k;
                    G4.l.N(obj2);
                    iVar.f2940k = null;
                    iVar.f2943n = 3;
                    pVar.getClass();
                    Object e5 = AbstractC2282w.e(new o(pVar, null), iVar);
                    if (e5 != enumC0510a) {
                        e5 = oVar;
                    }
                    return e5 == enumC0510a ? enumC0510a : oVar;
                }
                pVar = iVar.f2940k;
                G4.l.N(obj2);
                pVar.f2963j.setValue(Boolean.TRUE);
                iVar.f2940k = pVar;
                iVar.f2943n = 2;
                c2273m = pVar.i;
                c2273m.getClass();
                while (true) {
                    obj = b0.f18780k.get(c2273m);
                    if (obj instanceof O) {
                        if (obj instanceof C2275o) {
                            throw ((C2275o) obj).f18812a;
                        }
                        u5 = AbstractC2282w.u(obj);
                    } else if (c2273m.Y(obj) >= 0) {
                        Y y5 = new Y(AbstractC2346c.v(iVar), c2273m);
                        y5.r();
                        y5.v(new C2265e(1, AbstractC2282w.m(c2273m, true, new T(1, y5))));
                        u5 = y5.q();
                        break;
                    }
                }
            }
        }
        iVar = new i(this, abstractC0542c);
        Object obj22 = iVar.f2941l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = iVar.f2943n;
        W3.o oVar2 = W3.o.f6046a;
        if (i != 0) {
        }
        pVar.f2963j.setValue(Boolean.TRUE);
        iVar.f2940k = pVar;
        iVar.f2943n = 2;
        c2273m = pVar.i;
        c2273m.getClass();
        while (true) {
            obj = b0.f18780k.get(c2273m);
            if (obj instanceof O) {
            }
        }
    }
}
