package a1;

import A0.C0022e0;
import A0.C0028g0;
import A0.I0;
import E.k0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0310p;
import P.C0315s;
import P.C0326x0;
import P.D;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import P.Z;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i4.InterfaceC2015a;
import java.util.Arrays;
import java.util.UUID;
import n.AbstractC2107A;
import x0.O;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final D f6415a = new D(d.f6389n);

    /* JADX WARN: Removed duplicated region for block: B:102:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(z zVar, InterfaceC2015a interfaceC2015a, C0453A c0453a, X.d dVar, C0315s c0315s, int i, int i5) {
        int i6;
        InterfaceC2015a interfaceC2015a2;
        int i7;
        C0315s c0315s2;
        InterfaceC2015a interfaceC2015a3;
        C0326x0 s2;
        C0315s c0315s3;
        InterfaceC2015a interfaceC2015a4;
        String str;
        boolean z3;
        W0.m mVar;
        int i8;
        w wVar;
        W0.m mVar2;
        z zVar2 = zVar;
        c0315s.Z(-1772091631);
        if ((i & 6) == 0) {
            i6 = (c0315s.f(zVar2) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        int i9 = i5 & 2;
        if (i9 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            interfaceC2015a2 = interfaceC2015a;
            i6 |= c0315s.h(interfaceC2015a2) ? 32 : 16;
            if ((i & 384) == 0) {
                i6 |= c0315s.f(c0453a) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i6 |= c0315s.h(dVar) ? 2048 : 1024;
            }
            i7 = i6;
            if (c0315s.P(i7 & 1, (i7 & 1171) == 1170)) {
                c0315s2 = c0315s;
                c0315s2.S();
                interfaceC2015a3 = interfaceC2015a2;
            } else {
                InterfaceC2015a interfaceC2015a5 = i9 != 0 ? null : interfaceC2015a2;
                View view = (View) c0315s.j(AndroidCompositionLocals_androidKt.f);
                W0.c cVar = (W0.c) c0315s.j(I0.f287h);
                String str2 = (String) c0315s.j(f6415a);
                W0.m mVar3 = (W0.m) c0315s.j(I0.f292n);
                C0310p v4 = AbstractC0329z.v(c0315s);
                InterfaceC0289e0 w5 = AbstractC0329z.w(dVar, c0315s);
                Object[] objArr = new Object[0];
                Object M5 = c0315s.M();
                Z z5 = C0302l.f4480a;
                if (M5 == z5) {
                    M5 = d.f6390o;
                    c0315s.i0(M5);
                }
                boolean z6 = false;
                UUID uuid = (UUID) Y.k.b(Arrays.copyOf(objArr, 0), Y.k.f6119a, (InterfaceC2015a) M5, c0315s, 3456, 0);
                Object M6 = c0315s.M();
                if (M6 == z5) {
                    c0315s3 = c0315s;
                    w wVar2 = new w(interfaceC2015a5, c0453a, str2, view, cVar, zVar, uuid);
                    str = str2;
                    interfaceC2015a4 = interfaceC2015a5;
                    zVar2 = zVar;
                    wVar2.i(v4, new X.d(-297523940, new C0022e0(12, wVar2, w5), true));
                    c0315s3.i0(wVar2);
                    M6 = wVar2;
                } else {
                    c0315s3 = c0315s;
                    interfaceC2015a4 = interfaceC2015a5;
                    str = str2;
                    zVar2 = zVar;
                }
                w wVar3 = (w) M6;
                int i10 = i7 & 112;
                int i11 = i7 & 896;
                boolean h3 = c0315s3.h(wVar3) | (i10 == 32) | (i11 == 256) | c0315s3.f(str) | c0315s3.d(mVar3.ordinal());
                Object M7 = c0315s3.M();
                if (h3 || M7 == z5) {
                    z3 = true;
                    mVar = mVar3;
                    interfaceC2015a3 = interfaceC2015a4;
                    i8 = i7;
                    wVar = wVar3;
                    c0315s2 = c0315s3;
                    k0 k0Var = new k0(wVar, interfaceC2015a3, c0453a, str, mVar, 3);
                    c0315s2.i0(k0Var);
                    M7 = k0Var;
                } else {
                    z3 = true;
                    mVar = mVar3;
                    interfaceC2015a3 = interfaceC2015a4;
                    i8 = i7;
                    wVar = wVar3;
                    c0315s2 = c0315s3;
                }
                AbstractC0329z.c(wVar, (i4.c) M7, c0315s2);
                boolean h4 = (i10 == 32 ? z3 : false) | c0315s2.h(wVar) | (i11 == 256 ? z3 : false) | c0315s2.f(str) | c0315s2.d(mVar.ordinal());
                Object M8 = c0315s2.M();
                if (h4 || M8 == z5) {
                    g gVar = new g(wVar, interfaceC2015a3, c0453a, str, mVar);
                    mVar2 = mVar;
                    c0315s2.i0(gVar);
                    M8 = gVar;
                } else {
                    mVar2 = mVar;
                }
                AbstractC0329z.g((InterfaceC2015a) M8, c0315s2);
                boolean h5 = c0315s2.h(wVar);
                if ((i8 & 14) == 4) {
                    z6 = z3;
                }
                boolean z7 = h5 | z6;
                Object M9 = c0315s2.M();
                if (z7 || M9 == z5) {
                    M9 = new C0028g0(28, wVar, zVar2);
                    c0315s2.i0(M9);
                }
                AbstractC0329z.c(zVar2, (i4.c) M9, c0315s2);
                boolean h6 = c0315s2.h(wVar);
                Object M10 = c0315s2.M();
                if (h6 || M10 == z5) {
                    M10 = new i(wVar, null);
                    c0315s2.i0(M10);
                }
                AbstractC0329z.e(c0315s2, (i4.e) M10, wVar);
                b0.m mVar4 = b0.m.f7161k;
                boolean h7 = c0315s2.h(wVar);
                Object M11 = c0315s2.M();
                if (h7 || M11 == z5) {
                    M11 = new j(wVar, 0);
                    c0315s2.i0(M11);
                }
                b0.p d5 = androidx.compose.ui.layout.a.d(mVar4, (i4.c) M11);
                boolean h8 = c0315s2.h(wVar) | c0315s2.d(mVar2.ordinal());
                Object M12 = c0315s2.M();
                if (h8 || M12 == z5) {
                    M12 = new Z0.e(wVar, mVar2, 1);
                    c0315s2.i0(M12);
                }
                O o5 = (O) M12;
                long j5 = c0315s2.f4531T;
                int i12 = (int) (j5 ^ (j5 >>> 32));
                InterfaceC0314r0 l5 = c0315s2.l();
                b0.p c5 = b0.a.c(c0315s2, d5);
                InterfaceC2753j.f21834j.getClass();
                C2768z c2768z = C2752i.f21830b;
                c0315s2.b0();
                if (c0315s2.f4530S) {
                    c0315s2.k(c2768z);
                } else {
                    c0315s2.l0();
                }
                AbstractC0329z.y(c0315s2, C2752i.f21833e, o5);
                AbstractC0329z.y(c0315s2, C2752i.f21832d, l5);
                C2751h c2751h = C2752i.f;
                if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(i12))) {
                    AbstractC2107A.y(i12, c0315s2, i12, c2751h);
                }
                AbstractC0329z.y(c0315s2, C2752i.f21831c, c5);
                c0315s2.q(z3);
            }
            s2 = c0315s2.s();
            if (s2 == null) {
                s2.f4578d = new k(zVar2, interfaceC2015a3, c0453a, dVar, i, i5);
                return;
            }
            return;
        }
        interfaceC2015a2 = interfaceC2015a;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i7 = i6;
        if (c0315s.P(i7 & 1, (i7 & 1171) == 1170)) {
        }
        s2 = c0315s2.s();
        if (s2 == null) {
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
