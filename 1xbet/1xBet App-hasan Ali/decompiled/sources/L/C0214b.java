package L;

import A0.C0040k0;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i0.AbstractC1998c;
import i0.InterfaceC2009n;
import java.util.LinkedHashMap;
import k4.AbstractC2036a;
import z0.AbstractC2749f;
import z0.C2733I;

/* renamed from: L.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214b extends w implements s {

    /* renamed from: I, reason: collision with root package name */
    public r f2922I;
    public t J;

    @Override // L.w
    public final void B0(y.l lVar) {
        t tVar = this.J;
        if (tVar != null) {
            tVar.d();
        }
    }

    @Override // L.s
    public final void Y() {
        this.J = null;
        AbstractC2749f.m(this);
    }

    @Override // b0.o
    public final void q0() {
        r rVar = this.f2922I;
        if (rVar != null) {
            Y();
            G.v vVar = rVar.f2969n;
            t tVar = (t) ((LinkedHashMap) vVar.f1749l).get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) vVar.f1749l;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f2968m.add(tVar);
            }
        }
    }

    @Override // L.w
    public final void y0(y.l lVar, long j5, float f) {
        r rVar = this.f2922I;
        if (rVar == null) {
            rVar = A.a(A.b((View) AbstractC2749f.i(this, AndroidCompositionLocals_androidKt.f)));
            this.f2922I = rVar;
            kotlin.jvm.internal.l.c(rVar);
        }
        t a5 = rVar.a(this);
        int U4 = AbstractC2036a.U(f);
        long a6 = this.f2983B.a();
        this.f2984C.invoke();
        a5.b(lVar, this.f2991z, j5, U4, a6, 0.1f, new C0040k0(16, this));
        this.J = a5;
        AbstractC2749f.m(this);
    }

    @Override // L.w
    public final void z0(C2733I c2733i) {
        InterfaceC2009n v4 = c2733i.f21647k.f17540l.v();
        t tVar = this.J;
        if (tVar != null) {
            long j5 = this.f2987F;
            long a5 = this.f2983B.a();
            this.f2984C.invoke();
            tVar.e(0.1f, j5, a5);
            tVar.draw(AbstractC1998c.a(v4));
        }
    }
}
