package w;

import A0.C0022e0;
import A0.C0028g0;
import B.I;
import E.W;
import K0.O;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0314r0;
import a1.B;
import a1.C0453A;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i0.F;
import i0.v;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import v.q0;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2686J;
import z.C2700b;
import z.C2703e;
import z.C2717s;
import z.C2718t;
import z0.C2751h;
import z0.C2752i;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final C0453A f20487a;

    /* renamed from: b, reason: collision with root package name */
    public static final C2539b f20488b;

    static {
        f20487a = new C0453A((14 & 1) == 0, B.f6375k, true);
        long j5 = i0.p.f17290c;
        long j6 = i0.p.f17289b;
        f20488b = new C2539b(j5, j6, j6, i0.p.b(0.38f, j6), i0.p.b(0.38f, j6));
    }

    public static final void a(C2539b c2539b, X.d dVar, C0315s c0315s, int i) {
        b0.p pVar = b0.m.f7161k;
        c0315s.Z(-921259293);
        if ((((c0315s.f(c2539b) ? 4 : 2) | i | (c0315s.f(pVar) ? 32 : 16)) & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            float f = i.f20468d;
            D.d a5 = D.e.a(i.f20469e);
            float f5 = 0;
            boolean z3 = Float.compare(f, f5) > 0;
            long j5 = v.f17299a;
            if (Float.compare(f, f5) > 0 || z3) {
                pVar = new ShadowGraphicsLayerElement(a5, z3, j5, j5);
            }
            b0.p e3 = q0.e(androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.j(androidx.compose.foundation.a.b(pVar, c2539b.f20448a, F.f17222a)), 0.0f, i.i, 1), q0.c(c0315s));
            C2717s a6 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s, 0);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, e3);
            InterfaceC2753j.f21834j.getClass();
            InterfaceC2015a interfaceC2015a = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(interfaceC2015a);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, a6);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            dVar.b(C2718t.f21569a, c0315s, 54);
            c0315s.q(true);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0022e0(i, 16, c2539b, dVar);
        }
    }

    public static final void b(String str, boolean z3, C2539b c2539b, InterfaceC2015a interfaceC2015a, C0315s c0315s, int i) {
        int i5;
        b0.m mVar = b0.m.f7161k;
        c0315s.Z(791018367);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(str) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.g(z3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.f(c2539b) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= c0315s.f(mVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= c0315s.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= c0315s.h(interfaceC2015a) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.g gVar = i.f;
            C2700b c2700b = AbstractC2706h.f21534a;
            float f = i.f20471h;
            C2703e c2703e = new C2703e(f);
            boolean z5 = ((i5 & 112) == 32) | ((458752 & i5) == 131072);
            Object M5 = c0315s.M();
            if (z5 || M5 == C0302l.f4480a) {
                M5 = new n(interfaceC2015a, z3);
                c0315s.i0(M5);
            }
            b0.p h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.a.d(mVar, z3, str, (InterfaceC2015a) M5, 4), 1.0f)), f, 0.0f, 2);
            C2686J a5 = AbstractC2685I.a(c2703e, gVar, c0315s, 54);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, h3);
            InterfaceC2753j.f21834j.getClass();
            InterfaceC2015a interfaceC2015a2 = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(interfaceC2015a2);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, a5);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            c0315s.X(554568909);
            c0315s.q(false);
            O o5 = new O(z3 ? c2539b.f20449b : c2539b.f20451d, i.f20472j, i.f20473k, i.f20475m, i.f20470g, i.f20474l, 16613240);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            W.a(str, new LayoutWeightElement(1.0f), o5, 0, false, 1, 0, c0315s, (i5 & 14) | 1572864, 440);
            c0315s.q(true);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new o(str, z3, c2539b, interfaceC2015a, i);
        }
    }

    public static final void c(g gVar, InterfaceC2015a interfaceC2015a, C0028g0 c0028g0, C0315s c0315s, int i) {
        g gVar2;
        int i5;
        InterfaceC2015a interfaceC2015a2;
        C0028g0 c0028g02;
        Object obj = b0.m.f7161k;
        c0315s.Z(712057293);
        if ((i & 6) == 0) {
            gVar2 = gVar;
            i5 = (c0315s.f(gVar2) ? 4 : 2) | i;
        } else {
            gVar2 = gVar;
            i5 = i;
        }
        if ((i & 48) == 0) {
            interfaceC2015a2 = interfaceC2015a;
            i5 |= c0315s.h(interfaceC2015a2) ? 32 : 16;
        } else {
            interfaceC2015a2 = interfaceC2015a;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.f(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            c0028g02 = c0028g0;
            i5 |= c0315s.h(c0028g02) ? 2048 : 1024;
        } else {
            c0028g02 = c0028g0;
        }
        if ((i5 & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
        } else {
            Context context = (Context) c0315s.j(AndroidCompositionLocals_androidKt.f6943b);
            boolean f = c0315s.f((Configuration) c0315s.j(AndroidCompositionLocals_androidKt.f6942a)) | c0315s.f(context);
            Object M5 = c0315s.M();
            if (f || M5 == C0302l.f4480a) {
                C2539b c2539b = f20488b;
                long j5 = c2539b.f20448a;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int u5 = F.u(j5);
                int color = obtainStyledAttributes.getColor(0, u5);
                obtainStyledAttributes.recycle();
                if (color != u5) {
                    j5 = F.c(color);
                }
                long j6 = j5;
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
                obtainStyledAttributes2.recycle();
                long j7 = c2539b.f20449b;
                int u6 = F.u(j7);
                Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, u6)) : null;
                if (valueOf != null && valueOf.intValue() != u6) {
                    j7 = F.c(valueOf.intValue());
                }
                long j8 = j7;
                long j9 = c2539b.f20451d;
                int u7 = F.u(j9);
                Integer valueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, u7)) : null;
                if (valueOf2 != null && valueOf2.intValue() != u7) {
                    j9 = F.c(valueOf2.intValue());
                }
                long j10 = j9;
                Object c2539b2 = new C2539b(j6, j8, j8, j10, j10);
                c0315s.i0(c2539b2);
                M5 = c2539b2;
            }
            int i6 = (i5 & 1022) | ((i5 << 3) & 57344);
            d(gVar2, interfaceC2015a2, (C2539b) M5, c0028g02, c0315s, i6);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new I(gVar, interfaceC2015a, c0028g0, i, 4);
        }
    }

    public static final void d(g gVar, InterfaceC2015a interfaceC2015a, C2539b c2539b, C0028g0 c0028g0, C0315s c0315s, int i) {
        int i5;
        b0.m mVar = b0.m.f7161k;
        c0315s.Z(1447189339);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(gVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.h(interfaceC2015a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.f(mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= c0315s.f(c2539b) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= c0315s.h(c0028g0) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
        } else {
            a1.l.a(gVar, interfaceC2015a, f20487a, X.e.d(795909757, new C0022e0(17, c2539b, c0028g0), c0315s), c0315s, (i5 & 14) | 3456 | (i5 & 112), 0);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new M.I(gVar, interfaceC2015a, c2539b, c0028g0, i, 2);
        }
    }
}
