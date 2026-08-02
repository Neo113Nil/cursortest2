package androidx.compose.ui.viewinterop;

import A0.I0;
import B.I;
import B.r;
import B1.i;
import P.AbstractC0329z;
import P.C0302l;
import P.C0310p;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0314r0;
import U1.e;
import W0.m;
import Y.f;
import Y.h;
import Z0.b;
import Z0.l;
import Z0.q;
import a3.AbstractC0467k;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0491u;
import b0.o;
import b0.p;
import g0.s;
import i4.InterfaceC2015a;
import i4.c;
import n.AbstractC2107A;
import z0.C2731G;
import z0.C2751h;
import z0.C2752i;
import z0.InterfaceC2753j;
import z0.Z;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(c cVar, p pVar, c cVar2, C0315s c0315s, int i) {
        int i5;
        m mVar;
        Object obj;
        e eVar;
        W0.c cVar3;
        InterfaceC0491u interfaceC0491u;
        InterfaceC0314r0 interfaceC0314r0;
        Object obj2 = b.f6262p;
        c0315s.Z(-180024211);
        if ((i & 6) == 0) {
            i5 = (c0315s.h(cVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.f(pVar) ? 32 : 16;
        }
        int i6 = i5 | 384;
        if ((i & 3072) == 0) {
            i6 |= c0315s.h(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= c0315s.h(cVar2) ? 16384 : 8192;
        }
        if (c0315s.P(i6 & 1, (i6 & 9363) != 9362)) {
            long j5 = c0315s.f4531T;
            int i7 = (int) ((j5 >>> 32) ^ j5);
            p c5 = pVar.c(FocusGroupPropertiesElement.f6950k);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new Z() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                public final boolean equals(Object obj3) {
                    return obj3 == this;
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // z0.Z
                public final o i() {
                    return new s(null, 7);
                }

                @Override // z0.Z
                public final /* bridge */ /* synthetic */ void k(o oVar) {
                }
            };
            p c6 = b0.a.c(c0315s, c5.c(focusTargetNode$FocusTargetElement).c(FocusTargetPropertiesElement.f6951k).c(focusTargetNode$FocusTargetElement));
            W0.c cVar4 = (W0.c) c0315s.j(I0.f287h);
            m mVar2 = (m) c0315s.j(I0.f292n);
            InterfaceC0314r0 l5 = c0315s.l();
            InterfaceC0491u interfaceC0491u2 = (InterfaceC0491u) c0315s.j(i.f751a);
            e eVar2 = (e) c0315s.j(V1.a.f5961a);
            c0315s.X(1314800527);
            int i8 = i6 & 14;
            long j6 = c0315s.f4531T;
            int i9 = (int) (j6 ^ (j6 >>> 32));
            Context context = (Context) c0315s.j(AndroidCompositionLocals_androidKt.f6943b);
            C0310p v4 = AbstractC0329z.v(c0315s);
            f fVar = (f) c0315s.j(h.f6114a);
            View view = (View) c0315s.j(AndroidCompositionLocals_androidKt.f);
            boolean h3 = c0315s.h(context) | ((((i8 & 14) ^ 6) > 4 && c0315s.f(cVar)) || (i8 & 6) == 4) | c0315s.h(v4) | c0315s.h(fVar) | c0315s.d(i9) | c0315s.h(view);
            Object M5 = c0315s.M();
            if (h3 || M5 == C0302l.f4480a) {
                mVar = mVar2;
                obj = obj2;
                eVar = eVar2;
                cVar3 = cVar4;
                interfaceC0491u = interfaceC0491u2;
                interfaceC0314r0 = l5;
                Object mVar3 = new Z0.m(context, cVar, v4, fVar, i9, view);
                c0315s.i0(mVar3);
                M5 = mVar3;
            } else {
                mVar = mVar2;
                cVar3 = cVar4;
                interfaceC0491u = interfaceC0491u2;
                interfaceC0314r0 = l5;
                obj = obj2;
                eVar = eVar2;
            }
            InterfaceC2015a interfaceC2015a = (InterfaceC2015a) M5;
            c0315s.T(125, 1, null, null);
            c0315s.f4548r = true;
            if (c0315s.f4530S) {
                c0315s.k(interfaceC2015a);
            } else {
                c0315s.l0();
            }
            InterfaceC2753j.f21834j.getClass();
            AbstractC0329z.y(c0315s, C2752i.f21832d, interfaceC0314r0);
            AbstractC0329z.y(c0315s, l.f6313o, c6);
            AbstractC0329z.y(c0315s, l.f6314p, cVar3);
            AbstractC0329z.y(c0315s, l.f6315q, interfaceC0491u);
            AbstractC0329z.y(c0315s, l.f6316r, eVar);
            AbstractC0329z.y(c0315s, l.f6317s, mVar);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(i7))) {
                AbstractC2107A.y(i7, c0315s, i7, c2751h);
            }
            AbstractC0329z.y(c0315s, l.f6311m, cVar2);
            AbstractC0329z.y(c0315s, l.f6312n, obj);
            c0315s.q(true);
            c0315s.q(false);
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new I(cVar, pVar, cVar2, i, 2);
        }
    }

    public static final void b(c cVar, p pVar, c cVar2, C0315s c0315s, int i, int i5) {
        int i6;
        c0315s.Z(-1783766393);
        if ((i & 6) == 0) {
            i6 = (c0315s.h(cVar) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        if ((i & 48) == 0) {
            i6 |= c0315s.f(pVar) ? 32 : 16;
        }
        int i7 = i5 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i & 384) == 0) {
            i6 |= c0315s.h(cVar2) ? 256 : 128;
        }
        if (c0315s.P(i6 & 1, (i6 & 147) != 146)) {
            b bVar = b.f6262p;
            if (i7 != 0) {
                cVar2 = bVar;
            }
            a(cVar, pVar, cVar2, c0315s, ((i6 << 6) & 57344) | (i6 & 14) | 3072 | (i6 & 112));
        } else {
            c0315s.S();
        }
        c cVar3 = cVar2;
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new r(cVar, pVar, cVar3, i, i5);
        }
    }

    public static final q c(C2731G c2731g) {
        q qVar = c2731g.f21637x;
        if (qVar != null) {
            return qVar;
        }
        throw AbstractC0467k.u("Required value was null.");
    }
}
