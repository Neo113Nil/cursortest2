package v;

import a3.AbstractC0467k;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import h0.C1988b;
import h0.C1991e;
import i0.AbstractC1998c;
import i0.C1997b;
import i0.InterfaceC2009n;
import k0.C2021a;
import k0.C2022b;
import k0.C2023c;
import k4.AbstractC2036a;
import l0.C2041b;
import z.C2681E;
import z0.C2733I;

/* loaded from: classes.dex */
public final class H extends A0.Z implements f0.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20149l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final C2518m f20150m;

    /* renamed from: n, reason: collision with root package name */
    public final I f20151n;

    /* renamed from: o, reason: collision with root package name */
    public Object f20152o;

    public H(C2518m c2518m, I i) {
        this.f20150m = c2518m;
        this.f20151n = i;
    }

    public static boolean F(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean G(float f, long j5, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(C1988b.d(j5), C1988b.e(j5));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode H() {
        RenderNode renderNode = (RenderNode) this.f20152o;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode e3 = n1.Q.e();
        this.f20152o = e3;
        return e3;
    }

    @Override // b0.p
    public final /* synthetic */ b0.p c(b0.p pVar) {
        int i = this.f20149l;
        return AbstractC0467k.d(this, pVar);
    }

    @Override // b0.p
    public final Object d(i4.e eVar, Object obj) {
        switch (this.f20149l) {
        }
        return eVar.invoke(obj, this);
    }

    @Override // f0.e
    public final void g(C2733I c2733i) {
        RecordingCanvas beginRecording;
        float f;
        v3.e eVar;
        boolean z3;
        float f5;
        float f6;
        float f7;
        switch (this.f20149l) {
            case 0:
                C2022b c2022b = c2733i.f21647k;
                long A3 = c2022b.f17540l.A();
                C2518m c2518m = this.f20150m;
                c2518m.l(A3);
                if (C1991e.e(c2022b.f17540l.A())) {
                    c2733i.a();
                    return;
                }
                c2733i.a();
                c2518m.f20268m.getValue();
                Canvas a5 = AbstractC1998c.a(c2022b.f17540l.v());
                I i = this.f20151n;
                boolean f8 = I.f(i.f);
                C2681E c2681e = ((i0) this.f20152o).f20253b;
                boolean G5 = f8 ? G(270.0f, G4.d.d(-C1991e.b(c2733i.d()), c2733i.y(c2681e.a(c2733i.getLayoutDirection()))), i.c(), a5) : false;
                if (I.f(i.f20156d)) {
                    G5 = G(0.0f, G4.d.d(0.0f, c2733i.y(c2681e.f21475b)), i.e(), a5) || G5;
                }
                if (I.f(i.f20158g)) {
                    G5 = G(90.0f, G4.d.d(0.0f, c2733i.y(c2681e.b(c2733i.getLayoutDirection())) + (-((float) AbstractC2036a.U(C1991e.d(c2733i.d()))))), i.d(), a5) || G5;
                }
                if (I.f(i.f20157e)) {
                    G5 = G(180.0f, G4.d.d(-C1991e.d(c2733i.d()), (-C1991e.b(c2733i.d())) + c2733i.y(c2681e.f21477d)), i.b(), a5) || G5;
                }
                if (G5) {
                    c2518m.g();
                    return;
                }
                return;
            default:
                C2022b c2022b2 = c2733i.f21647k;
                long A5 = c2022b2.f17540l.A();
                C2518m c2518m2 = this.f20150m;
                c2518m2.l(A5);
                if (C1991e.e(c2022b2.f17540l.A())) {
                    c2733i.a();
                    return;
                }
                c2518m2.f20268m.getValue();
                float y5 = c2733i.y(D.f20139a);
                v3.e eVar2 = c2022b2.f17540l;
                Canvas a6 = AbstractC1998c.a(eVar2.v());
                I i5 = this.f20151n;
                boolean z5 = I.f(i5.f20156d) || I.g(i5.f20159h) || I.f(i5.f20157e) || I.g(i5.i);
                boolean z6 = I.f(i5.f) || I.g(i5.f20160j) || I.f(i5.f20158g) || I.g(i5.f20161k);
                if (z5 && z6) {
                    H().setPosition(0, 0, a6.getWidth(), a6.getHeight());
                } else if (z5) {
                    H().setPosition(0, 0, (AbstractC2036a.U(y5) * 2) + a6.getWidth(), a6.getHeight());
                } else {
                    if (!z6) {
                        c2733i.a();
                        return;
                    }
                    H().setPosition(0, 0, a6.getWidth(), (AbstractC2036a.U(y5) * 2) + a6.getHeight());
                }
                beginRecording = H().beginRecording();
                if (I.g(i5.f20160j)) {
                    EdgeEffect edgeEffect = i5.f20160j;
                    if (edgeEffect == null) {
                        edgeEffect = i5.a();
                        i5.f20160j = edgeEffect;
                    }
                    F(90.0f, edgeEffect, beginRecording);
                    edgeEffect.finish();
                }
                boolean f9 = I.f(i5.f);
                C2519n c2519n = C2519n.f20274a;
                if (f9) {
                    EdgeEffect c5 = i5.c();
                    z3 = F(270.0f, c5, beginRecording);
                    if (I.g(i5.f)) {
                        float e3 = C1988b.e(c2518m2.f());
                        EdgeEffect edgeEffect2 = i5.f20160j;
                        if (edgeEffect2 == null) {
                            edgeEffect2 = i5.a();
                            i5.f20160j = edgeEffect2;
                        }
                        f = y5;
                        int i6 = Build.VERSION.SDK_INT;
                        float b3 = i6 >= 31 ? c2519n.b(c5) : 0.0f;
                        eVar = eVar2;
                        float f10 = 1 - e3;
                        if (i6 >= 31) {
                            c2519n.c(edgeEffect2, b3, f10);
                        } else {
                            edgeEffect2.onPull(b3, f10);
                        }
                    } else {
                        f = y5;
                        eVar = eVar2;
                    }
                } else {
                    f = y5;
                    eVar = eVar2;
                    z3 = false;
                }
                if (I.g(i5.f20159h)) {
                    EdgeEffect edgeEffect3 = i5.f20159h;
                    if (edgeEffect3 == null) {
                        edgeEffect3 = i5.a();
                        i5.f20159h = edgeEffect3;
                    }
                    F(180.0f, edgeEffect3, beginRecording);
                    edgeEffect3.finish();
                }
                if (I.f(i5.f20156d)) {
                    EdgeEffect e5 = i5.e();
                    boolean z7 = F(0.0f, e5, beginRecording) || z3;
                    if (I.g(i5.f20156d)) {
                        float d5 = C1988b.d(c2518m2.f());
                        EdgeEffect edgeEffect4 = i5.f20159h;
                        if (edgeEffect4 == null) {
                            edgeEffect4 = i5.a();
                            i5.f20159h = edgeEffect4;
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        float b5 = i7 >= 31 ? c2519n.b(e5) : 0.0f;
                        if (i7 >= 31) {
                            c2519n.c(edgeEffect4, b5, d5);
                        } else {
                            edgeEffect4.onPull(b5, d5);
                        }
                    }
                    z3 = z7;
                }
                if (I.g(i5.f20161k)) {
                    EdgeEffect edgeEffect5 = i5.f20161k;
                    if (edgeEffect5 == null) {
                        edgeEffect5 = i5.a();
                        i5.f20161k = edgeEffect5;
                    }
                    F(270.0f, edgeEffect5, beginRecording);
                    edgeEffect5.finish();
                }
                if (I.f(i5.f20158g)) {
                    EdgeEffect d6 = i5.d();
                    boolean z8 = F(90.0f, d6, beginRecording) || z3;
                    if (I.g(i5.f20158g)) {
                        float e6 = C1988b.e(c2518m2.f());
                        EdgeEffect edgeEffect6 = i5.f20161k;
                        if (edgeEffect6 == null) {
                            edgeEffect6 = i5.a();
                            i5.f20161k = edgeEffect6;
                        }
                        int i8 = Build.VERSION.SDK_INT;
                        float b6 = i8 >= 31 ? c2519n.b(d6) : 0.0f;
                        if (i8 >= 31) {
                            c2519n.c(edgeEffect6, b6, e6);
                        } else {
                            edgeEffect6.onPull(b6, e6);
                        }
                    }
                    z3 = z8;
                }
                if (I.g(i5.i)) {
                    EdgeEffect edgeEffect7 = i5.i;
                    if (edgeEffect7 == null) {
                        edgeEffect7 = i5.a();
                        i5.i = edgeEffect7;
                    }
                    f5 = 0.0f;
                    F(0.0f, edgeEffect7, beginRecording);
                    edgeEffect7.finish();
                } else {
                    f5 = 0.0f;
                }
                if (I.f(i5.f20157e)) {
                    EdgeEffect b7 = i5.b();
                    boolean z9 = F(180.0f, b7, beginRecording) || z3;
                    if (I.g(i5.f20157e)) {
                        float d7 = C1988b.d(c2518m2.f());
                        EdgeEffect edgeEffect8 = i5.i;
                        if (edgeEffect8 == null) {
                            edgeEffect8 = i5.a();
                            i5.i = edgeEffect8;
                        }
                        int i9 = Build.VERSION.SDK_INT;
                        float b8 = i9 >= 31 ? c2519n.b(b7) : f5;
                        float f11 = 1 - d7;
                        if (i9 >= 31) {
                            c2519n.c(edgeEffect8, b8, f11);
                        } else {
                            edgeEffect8.onPull(b8, f11);
                        }
                    }
                    z3 = z9;
                }
                if (z3) {
                    c2518m2.g();
                }
                float f12 = z6 ? 0.0f : f;
                float f13 = z5 ? 0.0f : f;
                W0.m layoutDirection = c2733i.getLayoutDirection();
                C1997b c1997b = new C1997b();
                c1997b.f17266a = beginRecording;
                long A6 = eVar.A();
                v3.e eVar3 = c2022b2.f17540l;
                C2021a c2021a = ((C2022b) eVar3.f20434n).f17539k;
                W0.c cVar = c2021a.f17535a;
                W0.m mVar = c2021a.f17536b;
                InterfaceC2009n v4 = eVar3.v();
                long A7 = c2022b2.f17540l.A();
                v3.e eVar4 = c2022b2.f17540l;
                C2041b c2041b = (C2041b) eVar4.f20433m;
                eVar4.N(c2733i);
                eVar4.O(layoutDirection);
                eVar4.M(c1997b);
                eVar4.P(A6);
                eVar4.f20433m = null;
                c1997b.k();
                try {
                    ((C2023c) c2022b2.f17540l.f20432l).B(f12, f13);
                    try {
                        c2733i.a();
                        c1997b.j();
                        v3.e eVar5 = c2022b2.f17540l;
                        eVar5.N(cVar);
                        eVar5.O(mVar);
                        eVar5.M(v4);
                        eVar5.P(A7);
                        eVar5.f20433m = c2041b;
                        H().endRecording();
                        int save = a6.save();
                        a6.translate(f6, f7);
                        a6.drawRenderNode(H());
                        a6.restoreToCount(save);
                        return;
                    } finally {
                        ((C2023c) c2022b2.f17540l.f20432l).B(-f12, -f13);
                    }
                } catch (Throwable th) {
                    c1997b.j();
                    v3.e eVar6 = c2022b2.f17540l;
                    eVar6.N(cVar);
                    eVar6.O(mVar);
                    eVar6.M(v4);
                    eVar6.P(A7);
                    eVar6.f20433m = c2041b;
                    throw th;
                }
        }
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        switch (this.f20149l) {
        }
        return ((Boolean) cVar.c(this)).booleanValue();
    }

    public H(C2518m c2518m, I i, i0 i0Var) {
        this.f20150m = c2518m;
        this.f20151n = i;
        this.f20152o = i0Var;
    }
}
