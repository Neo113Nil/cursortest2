package R3;

import P.AbstractC0320u0;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import S3.C0416t;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.regex.Pattern;
import o0.C2201e;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import o4.C2226d;
import r3.AbstractC2349a;
import t2.C2413a;
import t2.C2421i;
import u2.AbstractC2485C;
import u2.C2497l;
import u2.u;
import u2.v;
import x0.InterfaceC2624j;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final C2226d f5223a;

    static {
        Pattern compile = Pattern.compile("^https?://media-\\d+\\.api-sports\\.io", 66);
        kotlin.jvm.internal.l.e("compile(...)", compile);
        f5223a = new C2226d(compile);
    }

    public static final void a(String str, b0.p pVar, InterfaceC2624j interfaceC2624j, C2201e c2201e, C0315s c0315s, int i) {
        int i5;
        InterfaceC2624j interfaceC2624j2;
        int i6;
        C2201e x5;
        String obj;
        C2201e c2201e2;
        c0315s.Z(1814998214);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(str) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        Object obj2 = null;
        if ((i & 48) == 0) {
            i5 |= c0315s.f(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.f(pVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            interfaceC2624j2 = interfaceC2624j;
            i5 |= c0315s.f(interfaceC2624j2) ? 2048 : 1024;
        } else {
            interfaceC2624j2 = interfaceC2624j;
        }
        if ((i & 24576) == 0) {
            i5 |= 8192;
        }
        if ((i5 & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
            c2201e2 = c2201e;
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                i6 = i5 & (-57345);
                x5 = G4.d.x();
            } else {
                c0315s.S();
                i6 = i5 & (-57345);
                x5 = c2201e;
            }
            c0315s.r();
            AbstractC0320u0 abstractC0320u0 = AndroidCompositionLocals_androidKt.f6943b;
            Context context = (Context) c0315s.j(abstractC0320u0);
            c0315s.X(1987723391);
            boolean z3 = (i6 & 14) == 4;
            Object M5 = c0315s.M();
            if (z3 || M5 == C0302l.f4480a) {
                if (str != null && (obj = AbstractC2227e.Q0(str).toString()) != null) {
                    if (obj.length() <= 0) {
                        obj = null;
                    }
                    if (obj != null) {
                        if (AbstractC2234l.x0(obj, "//", false)) {
                            obj = "https:".concat(obj);
                        }
                        C2226d c2226d = f5223a;
                        c2226d.getClass();
                        kotlin.jvm.internal.l.f("input", obj);
                        obj2 = c2226d.f18666k.matcher(obj).replaceAll("https://media.api-sports.io");
                        kotlin.jvm.internal.l.e("replaceAll(...)", obj2);
                    }
                }
                c0315s.i0(obj2);
                M5 = obj2;
            }
            String str2 = (String) M5;
            c0315s.q(false);
            c0315s.X(1987726580);
            boolean f = c0315s.f(context) | c0315s.f(str2);
            Object M6 = c0315s.M();
            if (f || M6 == C0302l.f4480a) {
                E2.h hVar = new E2.h(context);
                hVar.f1424c = str2;
                hVar.f1427g = new G2.a(100);
                M6 = hVar.a();
                c0315s.i0(M6);
            }
            E2.i iVar = (E2.i) M6;
            c0315s.q(false);
            X.d dVar = s.f5245a;
            X.d d5 = X.e.d(-1520989821, new T3.i(str2, x5), c0315s);
            int i7 = (i6 & 112) | 1597440 | (i6 & 896);
            int i8 = (i6 >> 6) & 112;
            c0315s.Y(-1555574782);
            C0416t c0416t = C2497l.f20006C;
            b0.h hVar2 = b0.c.f7141o;
            u uVar = u2.n.f20022b;
            C2421i c2421i = (C2421i) c0315s.j(v.f20046a);
            if (c2421i == null) {
                Context context2 = (Context) c0315s.j(abstractC0320u0);
                c2421i = C2413a.f19537b;
                if (c2421i == null) {
                    synchronized (C2413a.f19536a) {
                        c2421i = C2413a.f19537b;
                        if (c2421i == null) {
                            context2.getApplicationContext();
                            C2421i s2 = AbstractC2349a.s(context2);
                            C2413a.f19537b = s2;
                            c2421i = s2;
                        }
                    }
                }
            }
            int i9 = (i7 & 112) | 520 | ((i7 << 3) & 7168) | 12779520;
            c0315s.Y(-1545157471);
            u2.o oVar = new u2.o(iVar, uVar, c2421i);
            F2.e eVar = AbstractC2485C.f19986b;
            u2.n.a(oVar, pVar, c0416t, null, hVar2, interfaceC2624j2, new X.d(750771424, new O3.r(d5), true), c0315s, (i9 & 112) | ((i9 >> 3) & 896) | ((((i8 << 3) & 896) << 12) & 3670016), 0);
            c0315s.q(false);
            c0315s.q(false);
            c2201e2 = x5;
        }
        C0326x0 s5 = c0315s.s();
        if (s5 != null) {
            s5.f4578d = new B1.a(str, pVar, interfaceC2624j, c2201e2, i, 1);
        }
    }
}
