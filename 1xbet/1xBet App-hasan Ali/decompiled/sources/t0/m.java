package t0;

import A0.C0064w;
import A0.C0070z;
import A0.I0;
import A0.W;
import android.os.Build;
import z0.A0;
import z0.AbstractC2749f;
import z0.InterfaceC2754k;
import z0.s0;
import z0.y0;

/* loaded from: classes.dex */
public final class m extends b0.o implements A0, s0, InterfaceC2754k {

    /* renamed from: y, reason: collision with root package name */
    public C2404a f19493y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f19494z;

    public final void A0() {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        sVar.f17620k = true;
        AbstractC2749f.z(this, new e0.e(sVar));
        if (sVar.f17620k) {
            y0();
        }
    }

    public final void B0() {
        if (this.f19494z) {
            this.f19494z = false;
            if (this.f7175x) {
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                AbstractC2749f.y(this, new C0064w(wVar, 4));
                m mVar = (m) wVar.f17624k;
                if (mVar != null) {
                    mVar.y0();
                } else {
                    z0(null);
                }
            }
        }
    }

    @Override // z0.s0
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // z0.s0
    public final void U() {
        W();
    }

    @Override // z0.s0
    public final void W() {
        B0();
    }

    @Override // z0.s0
    public final /* synthetic */ void g0() {
    }

    @Override // z0.A0
    public final /* bridge */ /* synthetic */ Object o() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // b0.o
    public final void p0() {
        W();
    }

    @Override // b0.o
    public final void q0() {
        B0();
    }

    @Override // z0.s0
    public final long r() {
        int i = y0.f21874b;
        return y0.f21873a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // z0.s0
    public final void v(j jVar, k kVar, long j5) {
        if (kVar == k.f19490l) {
            ?? r42 = jVar.f19485a;
            int size = r42.size();
            for (int i = 0; i < size; i++) {
                int i5 = ((s) r42.get(i)).i;
                if (i5 != 3 && i5 != 4) {
                    int i6 = jVar.f19488d;
                    if (i6 == 4) {
                        this.f19494z = true;
                        A0();
                        return;
                    } else {
                        if (i6 == 5) {
                            B0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void y0() {
        C2404a c2404a;
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        AbstractC2749f.y(this, new C2408e(1));
        m mVar = (m) wVar.f17624k;
        if (mVar == null || (c2404a = mVar.f19493y) == null) {
            c2404a = this.f19493y;
        }
        z0(c2404a);
    }

    public final void z0(o oVar) {
        p pVar = (p) AbstractC2749f.i(this, I0.f299u);
        if (pVar != null) {
            C0070z c0070z = (C0070z) pVar;
            if (oVar == null) {
                o.f19496a.getClass();
                oVar = q.f19497a;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                W.f401a.a(c0070z.f600a, oVar);
            }
        }
    }
}
