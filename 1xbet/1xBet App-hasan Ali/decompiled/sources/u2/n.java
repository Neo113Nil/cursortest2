package u2;

import A0.AbstractC0011a1;
import A0.C0040k0;
import E.E0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0314r0;
import P.K0;
import a.AbstractC0444a;
import android.content.Context;
import android.os.Trace;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.ContentPainterElement;
import i0.C2001f;
import i4.InterfaceC2015a;
import java.util.HashMap;
import n.AbstractC2107A;
import n0.AbstractC2157b;
import o0.C2201e;
import t2.C2421i;
import x0.C2623i;
import x0.InterfaceC2624j;
import z.AbstractC2701c;
import z.AbstractC2710l;
import z.C2713o;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final C2498m f20021a = new C2498m();

    /* renamed from: b, reason: collision with root package name */
    public static final u f20022b = new u();

    /* JADX WARN: Removed duplicated region for block: B:106:0x020f A[Catch: all -> 0x0395, TRY_ENTER, TryCatch #0 {all -> 0x0395, blocks: (B:103:0x01f8, B:106:0x020f, B:107:0x0217), top: B:102:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final o oVar, final b0.p pVar, final i4.c cVar, AbstractC2484B abstractC2484B, final b0.d dVar, final InterfaceC2624j interfaceC2624j, final X.d dVar2, C0315s c0315s, final int i, final int i5) {
        int i6;
        AbstractC2484B abstractC2484B2;
        int i7;
        F2.i iVar;
        int i8;
        Object M5;
        F2.i iVar2;
        X.d dVar3;
        C0315s c0315s2;
        C0326x0 s2;
        c0315s.Z(-605638725);
        if ((i & 14) == 0) {
            i6 = (c0315s.f(oVar) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        if ((i & 112) == 0) {
            i6 |= c0315s.f(null) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i6 |= c0315s.f(pVar) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i6 |= c0315s.h(cVar) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            abstractC2484B2 = abstractC2484B;
            i6 |= c0315s.h(abstractC2484B2) ? 16384 : 8192;
        } else {
            abstractC2484B2 = abstractC2484B;
        }
        if ((458752 & i) == 0) {
            i6 |= c0315s.f(dVar) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i6 |= c0315s.f(interfaceC2624j) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i6 |= c0315s.c(1.0f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i6 |= c0315s.f(null) ? 67108864 : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i6 |= c0315s.d(1) ? 536870912 : 268435456;
        }
        if ((i5 & 14) == 0) {
            i7 = i5 | (c0315s.g(true) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 112) == 0) {
            i7 |= c0315s.h(dVar2) ? 32 : 16;
        }
        if ((1533916891 & i6) == 306783378 && (i7 & 91) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            F2.e eVar = AbstractC2485C.f19986b;
            c0315s.Y(1677680258);
            E2.i iVar3 = oVar.f20023a;
            boolean A3 = AbstractC2107A.A(iVar3);
            Object obj = C0302l.f4480a;
            try {
                if (!A3 || iVar3.f1459y.f1414a == null) {
                    c0315s.Y(408306591);
                    if (kotlin.jvm.internal.l.a(interfaceC2624j, C2623i.f21003d)) {
                        iVar = AbstractC2485C.f19986b;
                    } else {
                        c0315s.Y(408309406);
                        Object M6 = c0315s.M();
                        if (M6 == obj) {
                            M6 = new r();
                            c0315s.i0(M6);
                        }
                        iVar = (r) M6;
                        c0315s.q(false);
                    }
                    c0315s.q(false);
                    if (A3) {
                        c0315s.Y(-227230258);
                        c0315s.Y(408312509);
                        boolean f = c0315s.f(iVar3) | c0315s.f(iVar);
                        Object M7 = c0315s.M();
                        if (f || M7 == obj) {
                            E2.h a5 = E2.i.a(iVar3);
                            a5.f1432m = iVar;
                            a5.f1434o = null;
                            a5.f1435p = null;
                            a5.f1436q = null;
                            M7 = a5.a();
                            c0315s.i0(M7);
                        }
                        iVar3 = (E2.i) M7;
                        c0315s.q(false);
                        c0315s.q(false);
                        c0315s.q(false);
                    } else {
                        c0315s.Y(-227066702);
                        Context context = (Context) c0315s.j(AndroidCompositionLocals_androidKt.f6943b);
                        c0315s.Y(408319118);
                        boolean f5 = c0315s.f(context) | c0315s.f(iVar3) | c0315s.f(iVar);
                        i8 = i6;
                        Object M8 = c0315s.M();
                        if (f5 || M8 == obj) {
                            E2.h hVar = new E2.h(context);
                            hVar.f1424c = iVar3;
                            hVar.f1432m = iVar;
                            hVar.f1434o = null;
                            hVar.f1435p = null;
                            hVar.f1436q = null;
                            M8 = hVar.a();
                            c0315s.i0(M8);
                        }
                        iVar3 = (E2.i) M8;
                        c0315s.q(false);
                        c0315s.q(false);
                        c0315s.q(false);
                        int i9 = i8 >> 6;
                        int i10 = i8 >> 12;
                        c0315s.Y(1645646697);
                        c0315s.Y(952940650);
                        Trace.beginSection("rememberAsyncImagePainter");
                        E2.i a6 = AbstractC2485C.a(iVar3, c0315s);
                        d(a6);
                        c0315s.Y(1094691773);
                        M5 = c0315s.M();
                        int i11 = i7;
                        C2421i c2421i = oVar.f20025c;
                        if (M5 == obj) {
                            M5 = new C2497l(a6, c2421i);
                            c0315s.i0(M5);
                        }
                        C2497l c2497l = (C2497l) M5;
                        c0315s.q(false);
                        c2497l.f20016v = cVar;
                        c2497l.f20017w = interfaceC2624j;
                        c2497l.f20018x = 1;
                        c2497l.f20019y = ((Boolean) c0315s.j(AbstractC0011a1.f462a)).booleanValue();
                        c2497l.f20008B.setValue(c2421i);
                        c2497l.f20007A.setValue(a6);
                        c2497l.a();
                        c0315s.q(false);
                        Trace.endSection();
                        c0315s.q(false);
                        iVar2 = iVar3.f1456v;
                        if (!(iVar2 instanceof r)) {
                            c0315s.Y(-2079329304);
                            z zVar = new z(iVar2, dVar2, c2497l, dVar, interfaceC2624j);
                            c0315s.T(Integer.rotateLeft(-888190719, 1), 0, X.e.f6054a, null);
                            Object M9 = c0315s.M();
                            if (M9 == obj) {
                                dVar3 = new X.d(-888190719, zVar, true);
                                c0315s.i0(dVar3);
                            } else {
                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl", M9);
                                dVar3 = (X.d) M9;
                                dVar3.h(zVar);
                            }
                            X.d dVar4 = dVar3;
                            c0315s.q(false);
                            c0315s2 = c0315s;
                            AbstractC2701c.a(pVar, dVar, true, dVar4, c0315s2, (i9 & 14) | 3456 | (i10 & 112));
                            c0315s2.q(false);
                            s2 = c0315s2.s();
                            if (s2 == null) {
                                final AbstractC2484B abstractC2484B3 = abstractC2484B2;
                                s2.f4578d = new i4.e(pVar, cVar, abstractC2484B3, dVar, interfaceC2624j, dVar2, i, i5) { // from class: u2.y

                                    /* renamed from: l, reason: collision with root package name */
                                    public final /* synthetic */ b0.p f20060l;

                                    /* renamed from: m, reason: collision with root package name */
                                    public final /* synthetic */ i4.c f20061m;

                                    /* renamed from: n, reason: collision with root package name */
                                    public final /* synthetic */ b0.d f20062n;

                                    /* renamed from: o, reason: collision with root package name */
                                    public final /* synthetic */ InterfaceC2624j f20063o;

                                    /* renamed from: p, reason: collision with root package name */
                                    public final /* synthetic */ X.d f20064p;

                                    /* renamed from: q, reason: collision with root package name */
                                    public final /* synthetic */ int f20065q;

                                    /* renamed from: r, reason: collision with root package name */
                                    public final /* synthetic */ int f20066r;

                                    {
                                        this.f20062n = dVar;
                                        this.f20063o = interfaceC2624j;
                                        this.f20064p = dVar2;
                                        this.f20065q = i;
                                        this.f20066r = i5;
                                    }

                                    @Override // i4.e
                                    public final Object invoke(Object obj2, Object obj3) {
                                        ((Integer) obj3).getClass();
                                        int B5 = AbstractC0329z.B(this.f20065q | 1);
                                        int B6 = AbstractC0329z.B(this.f20066r);
                                        o oVar2 = o.this;
                                        X.d dVar5 = this.f20064p;
                                        n.a(oVar2, this.f20060l, this.f20061m, null, this.f20062n, this.f20063o, dVar5, (C0315s) obj2, B5, B6);
                                        return W3.o.f6046a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        c0315s.Y(-2080018031);
                        c0315s.Y(733328855);
                        int i12 = (((((i9 & 14) | 384) | (i10 & 112)) >> 3) & 14) | 48;
                        HashMap hashMap = AbstractC2710l.f21547a;
                        kotlin.jvm.internal.l.a(dVar, b0.c.f7137k);
                        c0315s.X(-1710100211);
                        boolean z3 = (((i12 & 14) ^ 6) > 4 && c0315s.f(dVar)) || (i12 & 6) == 4;
                        Object M10 = c0315s.M();
                        if (z3 || M10 == obj) {
                            M10 = new C2713o(dVar, true);
                            c0315s.i0(M10);
                        }
                        C2713o c2713o = (C2713o) M10;
                        c0315s.q(false);
                        c0315s.Y(-1323940314);
                        int p5 = AbstractC0329z.p(c0315s);
                        InterfaceC0314r0 l5 = c0315s.l();
                        InterfaceC2753j.f21834j.getClass();
                        InterfaceC2015a interfaceC2015a = C2752i.f21830b;
                        X.d dVar5 = new X.d(-511438721, new E0(5, pVar), true);
                        c0315s.b0();
                        if (c0315s.f4530S) {
                            c0315s.k(interfaceC2015a);
                        } else {
                            c0315s.l0();
                        }
                        AbstractC0329z.y(c0315s, C2752i.f21833e, c2713o);
                        AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
                        C2751h c2751h = C2752i.f;
                        if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                            AbstractC2107A.y(p5, c0315s, p5, c2751h);
                        }
                        dVar5.b(new K0(c0315s), c0315s, 0);
                        c0315s.Y(2058660585);
                        dVar2.b(new w(androidx.compose.foundation.layout.a.f6865a, c2497l, dVar, interfaceC2624j), c0315s, Integer.valueOf(i11 & 112));
                        c0315s.q(false);
                        c0315s.q(true);
                        c0315s.q(false);
                        c0315s.q(false);
                        c0315s.q(false);
                    }
                } else {
                    c0315s.q(false);
                }
                E2.i a62 = AbstractC2485C.a(iVar3, c0315s);
                d(a62);
                c0315s.Y(1094691773);
                M5 = c0315s.M();
                int i112 = i7;
                C2421i c2421i2 = oVar.f20025c;
                if (M5 == obj) {
                }
                C2497l c2497l2 = (C2497l) M5;
                c0315s.q(false);
                c2497l2.f20016v = cVar;
                c2497l2.f20017w = interfaceC2624j;
                c2497l2.f20018x = 1;
                c2497l2.f20019y = ((Boolean) c0315s.j(AbstractC0011a1.f462a)).booleanValue();
                c2497l2.f20008B.setValue(c2421i2);
                c2497l2.f20007A.setValue(a62);
                c2497l2.a();
                c0315s.q(false);
                Trace.endSection();
                c0315s.q(false);
                iVar2 = iVar3.f1456v;
                if (!(iVar2 instanceof r)) {
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
            i8 = i6;
            int i92 = i8 >> 6;
            int i102 = i8 >> 12;
            c0315s.Y(1645646697);
            c0315s.Y(952940650);
            Trace.beginSection("rememberAsyncImagePainter");
        }
        c0315s2 = c0315s;
        s2 = c0315s2.s();
        if (s2 == null) {
        }
    }

    public static final void b(final w wVar, b0.m mVar, C2497l c2497l, b0.d dVar, InterfaceC2624j interfaceC2624j, float f, boolean z3, C0315s c0315s, final int i) {
        int i5;
        b0.m mVar2;
        C2497l c2497l2;
        b0.d dVar2;
        InterfaceC2624j interfaceC2624j2;
        float f5;
        boolean z5;
        final b0.m mVar3;
        final C2497l c2497l3;
        final b0.d dVar3;
        final InterfaceC2624j interfaceC2624j3;
        final float f6;
        final boolean z6;
        c0315s.Z(880638523);
        if ((i & 14) == 0) {
            i5 = (c0315s.f(wVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        int i6 = i5 | 176;
        if ((i & 7168) == 0) {
            i6 = i5 | 1200;
        }
        if ((57344 & i) == 0) {
            i6 |= 8192;
        }
        if ((458752 & i) == 0) {
            i6 |= 65536;
        }
        if ((3670016 & i) == 0) {
            i6 |= 524288;
        }
        if ((29360128 & i) == 0) {
            i6 |= 4194304;
        }
        if ((234881024 & i) == 0) {
            i6 |= 33554432;
        }
        if ((191739611 & i6) == 38347922 && c0315s.B()) {
            c0315s.S();
            mVar3 = mVar;
            c2497l3 = c2497l;
            dVar3 = dVar;
            interfaceC2624j3 = interfaceC2624j;
            f6 = f;
            z6 = z3;
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                mVar2 = b0.m.f7161k;
                c2497l2 = wVar.f20048b;
                wVar.getClass();
                dVar2 = wVar.f20049c;
                interfaceC2624j2 = wVar.f20050d;
                wVar.getClass();
                wVar.getClass();
                wVar.getClass();
                f5 = 1.0f;
                z5 = true;
            } else {
                c0315s.S();
                mVar2 = mVar;
                c2497l2 = c2497l;
                dVar2 = dVar;
                interfaceC2624j2 = interfaceC2624j;
                f5 = f;
                z5 = z3;
            }
            c0315s.r();
            F2.e eVar = AbstractC2485C.f19986b;
            b0.p c5 = (z5 ? AbstractC0444a.o(mVar2) : mVar2).c(new ContentPainterElement(c2497l2, dVar2, interfaceC2624j2, f5));
            C2483A c2483a = C2483A.f19984a;
            c0315s.Y(544976794);
            int p5 = AbstractC0329z.p(c0315s);
            b0.p c6 = b0.a.c(c0315s, c5);
            InterfaceC0314r0 l5 = c0315s.l();
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.Y(1405779621);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(new C0040k0(27, c2768z));
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, c2483a);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            AbstractC0329z.y(c0315s, C2752i.f21831c, c6);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            c0315s.q(true);
            c0315s.q(false);
            c0315s.q(false);
            mVar3 = mVar2;
            c2497l3 = c2497l2;
            dVar3 = dVar2;
            interfaceC2624j3 = interfaceC2624j2;
            f6 = f5;
            z6 = z5;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new i4.e() { // from class: u2.x
                @Override // i4.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int B5 = AbstractC0329z.B(i | 1);
                    float f7 = f6;
                    boolean z7 = z6;
                    n.b(w.this, mVar3, c2497l3, dVar3, interfaceC2624j3, f7, z7, (C0315s) obj, B5);
                    return W3.o.f6046a;
                }
            };
        }
    }

    public static void c(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + L1.a.n("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }

    public static final void d(E2.i iVar) {
        Object obj = iVar.f1438b;
        if (obj instanceof E2.h) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof C2001f) {
            c("ImageBitmap");
            throw null;
        }
        if (obj instanceof C2201e) {
            c("ImageVector");
            throw null;
        }
        if (obj instanceof AbstractC2157b) {
            c("Painter");
            throw null;
        }
        if (iVar.f1439c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
