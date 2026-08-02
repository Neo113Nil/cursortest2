package l0;

import A.B;
import A0.F;
import a.AbstractC0444a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import i0.AbstractC1998c;
import i0.C1997b;
import i0.C2006k;
import i0.InterfaceC2009n;
import i0.o;
import i0.p;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.C2021a;
import k0.C2022b;

/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2044e implements InterfaceC2043d {

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicBoolean f17689x = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final o f17690b;

    /* renamed from: c, reason: collision with root package name */
    public final C2022b f17691c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f17692d;

    /* renamed from: e, reason: collision with root package name */
    public long f17693e;
    public Paint f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f17694g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17695h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f17696j;

    /* renamed from: k, reason: collision with root package name */
    public int f17697k;

    /* renamed from: l, reason: collision with root package name */
    public float f17698l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17699m;

    /* renamed from: n, reason: collision with root package name */
    public float f17700n;

    /* renamed from: o, reason: collision with root package name */
    public float f17701o;

    /* renamed from: p, reason: collision with root package name */
    public float f17702p;

    /* renamed from: q, reason: collision with root package name */
    public long f17703q;

    /* renamed from: r, reason: collision with root package name */
    public long f17704r;

    /* renamed from: s, reason: collision with root package name */
    public float f17705s;

    /* renamed from: t, reason: collision with root package name */
    public float f17706t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17707u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17708v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17709w;

    public C2044e(F f, o oVar, C2022b c2022b) {
        this.f17690b = oVar;
        this.f17691c = c2022b;
        RenderNode create = RenderNode.create("Compose", f);
        this.f17692d = create;
        this.f17693e = 0L;
        this.i = 0L;
        if (f17689x.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                AbstractC2051l.c(create, AbstractC2051l.a(create));
                AbstractC2051l.d(create, AbstractC2051l.b(create));
            }
            if (i >= 24) {
                AbstractC2050k.a(create);
            } else {
                AbstractC2049j.a(create);
            }
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        O(0);
        this.f17696j = 0;
        this.f17697k = 3;
        this.f17698l = 1.0f;
        this.f17700n = 1.0f;
        this.f17701o = 1.0f;
        long j5 = p.f17289b;
        this.f17703q = j5;
        this.f17704r = j5;
        this.f17706t = 8.0f;
    }

    @Override // l0.InterfaceC2043d
    public final void A(float f) {
        this.f17701o = f;
        this.f17692d.setScaleY(f);
    }

    @Override // l0.InterfaceC2043d
    public final Matrix B() {
        Matrix matrix = this.f17694g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f17694g = matrix;
        }
        this.f17692d.getMatrix(matrix);
        return matrix;
    }

    @Override // l0.InterfaceC2043d
    public final void C(int i, int i5, long j5) {
        int i6 = (int) (j5 >> 32);
        int i7 = (int) (4294967295L & j5);
        this.f17692d.setLeftTopRightBottom(i, i5, i + i6, i5 + i7);
        if (W0.l.a(this.f17693e, j5)) {
            return;
        }
        if (this.f17699m) {
            this.f17692d.setPivotX(i6 / 2.0f);
            this.f17692d.setPivotY(i7 / 2.0f);
        }
        this.f17693e = j5;
    }

    @Override // l0.InterfaceC2043d
    public final float D() {
        return 0.0f;
    }

    @Override // l0.InterfaceC2043d
    public final void E(float f) {
        this.f17706t = f;
        this.f17692d.setCameraDistance(-f);
    }

    @Override // l0.InterfaceC2043d
    public final float F() {
        return this.f17702p;
    }

    @Override // l0.InterfaceC2043d
    public final boolean G() {
        return this.f17692d.isValid();
    }

    @Override // l0.InterfaceC2043d
    public final float H() {
        return this.f17701o;
    }

    @Override // l0.InterfaceC2043d
    public final void I(InterfaceC2009n interfaceC2009n) {
        DisplayListCanvas a5 = AbstractC1998c.a(interfaceC2009n);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.DisplayListCanvas", a5);
        a5.drawRenderNode(this.f17692d);
    }

    @Override // l0.InterfaceC2043d
    public final float J() {
        return this.f17705s;
    }

    @Override // l0.InterfaceC2043d
    public final int K() {
        return this.f17697k;
    }

    @Override // l0.InterfaceC2043d
    public final void L(long j5) {
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            this.f17699m = true;
            this.f17692d.setPivotX(((int) (this.f17693e >> 32)) / 2.0f);
            this.f17692d.setPivotY(((int) (4294967295L & this.f17693e)) / 2.0f);
        } else {
            this.f17699m = false;
            this.f17692d.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
            this.f17692d.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
    }

    @Override // l0.InterfaceC2043d
    public final long M() {
        return this.f17703q;
    }

    public final void N() {
        boolean z3 = this.f17707u;
        boolean z5 = false;
        boolean z6 = z3 && !this.f17695h;
        if (z3 && this.f17695h) {
            z5 = true;
        }
        if (z6 != this.f17708v) {
            this.f17708v = z6;
            this.f17692d.setClipToBounds(z6);
        }
        if (z5 != this.f17709w) {
            this.f17709w = z5;
            this.f17692d.setClipToOutline(z5);
        }
    }

    public final void O(int i) {
        RenderNode renderNode = this.f17692d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.f17696j;
        if (i != 1 && this.f17697k == 3) {
            O(i);
        } else {
            O(1);
        }
    }

    @Override // l0.InterfaceC2043d
    public final float a() {
        return this.f17698l;
    }

    @Override // l0.InterfaceC2043d
    public final void b() {
        this.f17692d.setRotationX(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final void c(float f) {
        this.f17698l = f;
        this.f17692d.setAlpha(f);
    }

    @Override // l0.InterfaceC2043d
    public final float d() {
        return this.f17700n;
    }

    @Override // l0.InterfaceC2043d
    public final void e(float f) {
        this.f17702p = f;
        this.f17692d.setElevation(f);
    }

    @Override // l0.InterfaceC2043d
    public final void f(W0.c cVar, W0.m mVar, C2041b c2041b, B b3) {
        Canvas start = this.f17692d.start(Math.max((int) (this.f17693e >> 32), (int) (this.i >> 32)), Math.max((int) (this.f17693e & 4294967295L), (int) (4294967295L & this.i)));
        try {
            C1997b c1997b = this.f17690b.f17288a;
            Canvas canvas = c1997b.f17266a;
            c1997b.f17266a = start;
            C2022b c2022b = this.f17691c;
            v3.e eVar = c2022b.f17540l;
            long d02 = AbstractC0444a.d0(this.f17693e);
            C2021a c2021a = ((C2022b) eVar.f20434n).f17539k;
            W0.c cVar2 = c2021a.f17535a;
            W0.m mVar2 = c2021a.f17536b;
            InterfaceC2009n v4 = eVar.v();
            long A3 = eVar.A();
            C2041b c2041b2 = (C2041b) eVar.f20433m;
            eVar.N(cVar);
            eVar.O(mVar);
            eVar.M(c1997b);
            eVar.P(d02);
            eVar.f20433m = c2041b;
            c1997b.k();
            try {
                b3.c(c2022b);
                c1997b.j();
                eVar.N(cVar2);
                eVar.O(mVar2);
                eVar.M(v4);
                eVar.P(A3);
                eVar.f20433m = c2041b2;
                c1997b.f17266a = canvas;
                this.f17692d.end(start);
            } catch (Throwable th) {
                c1997b.j();
                eVar.N(cVar2);
                eVar.O(mVar2);
                eVar.M(v4);
                eVar.P(A3);
                eVar.f20433m = c2041b2;
                throw th;
            }
        } catch (Throwable th2) {
            this.f17692d.end(start);
            throw th2;
        }
    }

    @Override // l0.InterfaceC2043d
    public final float g() {
        return 0.0f;
    }

    @Override // l0.InterfaceC2043d
    public final void h() {
        this.f17692d.setTranslationY(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final void i(float f) {
        this.f17705s = f;
        this.f17692d.setRotation(f);
    }

    @Override // l0.InterfaceC2043d
    public final void j() {
        this.f17692d.setRotationY(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final long k() {
        return this.f17704r;
    }

    @Override // l0.InterfaceC2043d
    public final void l(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17703q = j5;
            AbstractC2051l.c(this.f17692d, i0.F.u(j5));
        }
    }

    @Override // l0.InterfaceC2043d
    public final void m(Outline outline, long j5) {
        this.i = j5;
        this.f17692d.setOutline(outline);
        this.f17695h = outline != null;
        N();
    }

    @Override // l0.InterfaceC2043d
    public final void n() {
        P();
    }

    @Override // l0.InterfaceC2043d
    public final void o(float f) {
        this.f17700n = f;
        this.f17692d.setScaleX(f);
    }

    @Override // l0.InterfaceC2043d
    public final void p(int i) {
        if (this.f17697k == i) {
            return;
        }
        this.f17697k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(i0.F.y(i)));
        P();
    }

    @Override // l0.InterfaceC2043d
    public final float q() {
        return this.f17706t;
    }

    @Override // l0.InterfaceC2043d
    public final void r() {
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC2050k.a(this.f17692d);
        } else {
            AbstractC2049j.a(this.f17692d);
        }
    }

    @Override // l0.InterfaceC2043d
    public final float s() {
        return 0.0f;
    }

    @Override // l0.InterfaceC2043d
    public final void t() {
        this.f17692d.setTranslationX(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final void u(boolean z3) {
        this.f17707u = z3;
        N();
    }

    @Override // l0.InterfaceC2043d
    public final int v() {
        return this.f17696j;
    }

    @Override // l0.InterfaceC2043d
    public final float w() {
        return 0.0f;
    }

    @Override // l0.InterfaceC2043d
    public final C2006k x() {
        return null;
    }

    @Override // l0.InterfaceC2043d
    public final void y(int i) {
        this.f17696j = i;
        P();
    }

    @Override // l0.InterfaceC2043d
    public final void z(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17704r = j5;
            AbstractC2051l.d(this.f17692d, i0.F.u(j5));
        }
    }
}
