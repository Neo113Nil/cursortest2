package l0;

import A.B;
import a.AbstractC0444a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import i0.AbstractC1998c;
import i0.C1997b;
import i0.C2006k;
import i0.F;
import i0.InterfaceC2009n;
import i0.o;
import i0.p;
import k0.C2022b;

/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2046g implements InterfaceC2043d {

    /* renamed from: b, reason: collision with root package name */
    public final o f17710b;

    /* renamed from: c, reason: collision with root package name */
    public final C2022b f17711c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f17712d;

    /* renamed from: e, reason: collision with root package name */
    public long f17713e;
    public Paint f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f17714g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17715h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f17716j;

    /* renamed from: k, reason: collision with root package name */
    public float f17717k;

    /* renamed from: l, reason: collision with root package name */
    public float f17718l;

    /* renamed from: m, reason: collision with root package name */
    public float f17719m;

    /* renamed from: n, reason: collision with root package name */
    public long f17720n;

    /* renamed from: o, reason: collision with root package name */
    public long f17721o;

    /* renamed from: p, reason: collision with root package name */
    public float f17722p;

    /* renamed from: q, reason: collision with root package name */
    public float f17723q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17724r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17725s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17726t;

    /* renamed from: u, reason: collision with root package name */
    public int f17727u;

    public C2046g() {
        o oVar = new o();
        C2022b c2022b = new C2022b();
        this.f17710b = oVar;
        this.f17711c = c2022b;
        RenderNode a5 = AbstractC2045f.a();
        this.f17712d = a5;
        this.f17713e = 0L;
        a5.setClipToBounds(false);
        O(a5, 0);
        this.i = 1.0f;
        this.f17716j = 3;
        this.f17717k = 1.0f;
        this.f17718l = 1.0f;
        long j5 = p.f17289b;
        this.f17720n = j5;
        this.f17721o = j5;
        this.f17723q = 8.0f;
        this.f17727u = 0;
    }

    @Override // l0.InterfaceC2043d
    public final void A(float f) {
        this.f17718l = f;
        this.f17712d.setScaleY(f);
    }

    @Override // l0.InterfaceC2043d
    public final Matrix B() {
        Matrix matrix = this.f17714g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f17714g = matrix;
        }
        this.f17712d.getMatrix(matrix);
        return matrix;
    }

    @Override // l0.InterfaceC2043d
    public final void C(int i, int i5, long j5) {
        this.f17712d.setPosition(i, i5, ((int) (j5 >> 32)) + i, ((int) (4294967295L & j5)) + i5);
        this.f17713e = AbstractC0444a.d0(j5);
    }

    @Override // l0.InterfaceC2043d
    public final float D() {
        return 0.0f;
    }

    @Override // l0.InterfaceC2043d
    public final void E(float f) {
        this.f17723q = f;
        this.f17712d.setCameraDistance(f);
    }

    @Override // l0.InterfaceC2043d
    public final float F() {
        return this.f17719m;
    }

    @Override // l0.InterfaceC2043d
    public final boolean G() {
        boolean hasDisplayList;
        hasDisplayList = this.f17712d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // l0.InterfaceC2043d
    public final float H() {
        return this.f17718l;
    }

    @Override // l0.InterfaceC2043d
    public final void I(InterfaceC2009n interfaceC2009n) {
        AbstractC1998c.a(interfaceC2009n).drawRenderNode(this.f17712d);
    }

    @Override // l0.InterfaceC2043d
    public final float J() {
        return this.f17722p;
    }

    @Override // l0.InterfaceC2043d
    public final int K() {
        return this.f17716j;
    }

    @Override // l0.InterfaceC2043d
    public final void L(long j5) {
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            this.f17712d.resetPivot();
        } else {
            this.f17712d.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
            this.f17712d.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
    }

    @Override // l0.InterfaceC2043d
    public final long M() {
        return this.f17720n;
    }

    public final void N() {
        boolean z3 = this.f17724r;
        boolean z5 = false;
        boolean z6 = z3 && !this.f17715h;
        if (z3 && this.f17715h) {
            z5 = true;
        }
        if (z6 != this.f17725s) {
            this.f17725s = z6;
            this.f17712d.setClipToBounds(z6);
        }
        if (z5 != this.f17726t) {
            this.f17726t = z5;
            this.f17712d.setClipToOutline(z5);
        }
    }

    public final void O(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.f17727u;
        if (i != 1 && this.f17716j == 3) {
            O(this.f17712d, i);
        } else {
            O(this.f17712d, 1);
        }
    }

    @Override // l0.InterfaceC2043d
    public final float a() {
        return this.i;
    }

    @Override // l0.InterfaceC2043d
    public final void b() {
        this.f17712d.setRotationX(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final void c(float f) {
        this.i = f;
        this.f17712d.setAlpha(f);
    }

    @Override // l0.InterfaceC2043d
    public final float d() {
        return this.f17717k;
    }

    @Override // l0.InterfaceC2043d
    public final void e(float f) {
        this.f17719m = f;
        this.f17712d.setElevation(f);
    }

    @Override // l0.InterfaceC2043d
    public final void f(W0.c cVar, W0.m mVar, C2041b c2041b, B b3) {
        RecordingCanvas beginRecording;
        C2022b c2022b = this.f17711c;
        beginRecording = this.f17712d.beginRecording();
        try {
            o oVar = this.f17710b;
            C1997b c1997b = oVar.f17288a;
            Canvas canvas = c1997b.f17266a;
            c1997b.f17266a = beginRecording;
            v3.e eVar = c2022b.f17540l;
            eVar.N(cVar);
            eVar.O(mVar);
            eVar.f20433m = c2041b;
            eVar.P(this.f17713e);
            eVar.M(c1997b);
            b3.c(c2022b);
            oVar.f17288a.f17266a = canvas;
        } finally {
            this.f17712d.endRecording();
        }
    }

    @Override // l0.InterfaceC2043d
    public final float g() {
        return 0.0f;
    }

    @Override // l0.InterfaceC2043d
    public final void h() {
        this.f17712d.setTranslationY(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final void i(float f) {
        this.f17722p = f;
        this.f17712d.setRotationZ(f);
    }

    @Override // l0.InterfaceC2043d
    public final void j() {
        this.f17712d.setRotationY(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final long k() {
        return this.f17721o;
    }

    @Override // l0.InterfaceC2043d
    public final void l(long j5) {
        this.f17720n = j5;
        this.f17712d.setAmbientShadowColor(F.u(j5));
    }

    @Override // l0.InterfaceC2043d
    public final void m(Outline outline, long j5) {
        this.f17712d.setOutline(outline);
        this.f17715h = outline != null;
        N();
    }

    @Override // l0.InterfaceC2043d
    public final void n() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // l0.InterfaceC2043d
    public final void o(float f) {
        this.f17717k = f;
        this.f17712d.setScaleX(f);
    }

    @Override // l0.InterfaceC2043d
    public final void p(int i) {
        this.f17716j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(F.q(i));
        P();
    }

    @Override // l0.InterfaceC2043d
    public final float q() {
        return this.f17723q;
    }

    @Override // l0.InterfaceC2043d
    public final void r() {
        this.f17712d.discardDisplayList();
    }

    @Override // l0.InterfaceC2043d
    public final float s() {
        return 0.0f;
    }

    @Override // l0.InterfaceC2043d
    public final void t() {
        this.f17712d.setTranslationX(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final void u(boolean z3) {
        this.f17724r = z3;
        N();
    }

    @Override // l0.InterfaceC2043d
    public final int v() {
        return this.f17727u;
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
        this.f17727u = i;
        P();
    }

    @Override // l0.InterfaceC2043d
    public final void z(long j5) {
        this.f17721o = j5;
        this.f17712d.setSpotShadowColor(F.u(j5));
    }
}
