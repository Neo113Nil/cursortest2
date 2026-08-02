package l0;

import A.B;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import i0.AbstractC1998c;
import i0.C1997b;
import i0.C2006k;
import i0.F;
import i0.InterfaceC2009n;
import i0.o;
import i0.p;
import k0.C2022b;
import m0.AbstractC2081a;

/* renamed from: l0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2048i implements InterfaceC2043d {

    /* renamed from: x, reason: collision with root package name */
    public static final C2047h f17728x = new C2047h();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2081a f17729b;

    /* renamed from: c, reason: collision with root package name */
    public final o f17730c;

    /* renamed from: d, reason: collision with root package name */
    public final m f17731d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f17732e;
    public final Rect f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f17733g;

    /* renamed from: h, reason: collision with root package name */
    public int f17734h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f17735j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17736k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17737l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17738m;

    /* renamed from: n, reason: collision with root package name */
    public int f17739n;

    /* renamed from: o, reason: collision with root package name */
    public int f17740o;

    /* renamed from: p, reason: collision with root package name */
    public float f17741p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17742q;

    /* renamed from: r, reason: collision with root package name */
    public float f17743r;

    /* renamed from: s, reason: collision with root package name */
    public float f17744s;

    /* renamed from: t, reason: collision with root package name */
    public float f17745t;

    /* renamed from: u, reason: collision with root package name */
    public long f17746u;

    /* renamed from: v, reason: collision with root package name */
    public long f17747v;

    /* renamed from: w, reason: collision with root package name */
    public float f17748w;

    public C2048i(AbstractC2081a abstractC2081a) {
        o oVar = new o();
        C2022b c2022b = new C2022b();
        this.f17729b = abstractC2081a;
        this.f17730c = oVar;
        m mVar = new m(abstractC2081a, oVar, c2022b);
        this.f17731d = mVar;
        this.f17732e = abstractC2081a.getResources();
        this.f = new Rect();
        abstractC2081a.addView(mVar);
        mVar.setClipBounds(null);
        this.f17735j = 0L;
        View.generateViewId();
        this.f17739n = 3;
        this.f17740o = 0;
        this.f17741p = 1.0f;
        this.f17743r = 1.0f;
        this.f17744s = 1.0f;
        long j5 = p.f17289b;
        this.f17746u = j5;
        this.f17747v = j5;
    }

    @Override // l0.InterfaceC2043d
    public final void A(float f) {
        this.f17744s = f;
        this.f17731d.setScaleY(f);
    }

    @Override // l0.InterfaceC2043d
    public final Matrix B() {
        return this.f17731d.getMatrix();
    }

    @Override // l0.InterfaceC2043d
    public final void C(int i, int i5, long j5) {
        boolean a5 = W0.l.a(this.f17735j, j5);
        m mVar = this.f17731d;
        if (a5) {
            int i6 = this.f17734h;
            if (i6 != i) {
                mVar.offsetLeftAndRight(i - i6);
            }
            int i7 = this.i;
            if (i7 != i5) {
                mVar.offsetTopAndBottom(i5 - i7);
            }
        } else {
            if (this.f17738m || mVar.getClipToOutline()) {
                this.f17736k = true;
            }
            int i8 = (int) (j5 >> 32);
            int i9 = (int) (4294967295L & j5);
            mVar.layout(i, i5, i + i8, i5 + i9);
            this.f17735j = j5;
            if (this.f17742q) {
                mVar.setPivotX(i8 / 2.0f);
                mVar.setPivotY(i9 / 2.0f);
            }
        }
        this.f17734h = i;
        this.i = i5;
    }

    @Override // l0.InterfaceC2043d
    public final float D() {
        return 0.0f;
    }

    @Override // l0.InterfaceC2043d
    public final void E(float f) {
        this.f17731d.setCameraDistance(f * this.f17732e.getDisplayMetrics().densityDpi);
    }

    @Override // l0.InterfaceC2043d
    public final float F() {
        return this.f17745t;
    }

    @Override // l0.InterfaceC2043d
    public final /* synthetic */ boolean G() {
        return true;
    }

    @Override // l0.InterfaceC2043d
    public final float H() {
        return this.f17744s;
    }

    @Override // l0.InterfaceC2043d
    public final void I(InterfaceC2009n interfaceC2009n) {
        Rect rect;
        boolean z3 = this.f17736k;
        m mVar = this.f17731d;
        if (z3) {
            if ((this.f17738m || mVar.getClipToOutline()) && !this.f17737l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = mVar.getWidth();
                rect.bottom = mVar.getHeight();
            } else {
                rect = null;
            }
            mVar.setClipBounds(rect);
        }
        if (AbstractC1998c.a(interfaceC2009n).isHardwareAccelerated()) {
            this.f17729b.a(interfaceC2009n, mVar, mVar.getDrawingTime());
        }
    }

    @Override // l0.InterfaceC2043d
    public final float J() {
        return this.f17748w;
    }

    @Override // l0.InterfaceC2043d
    public final int K() {
        return this.f17739n;
    }

    @Override // l0.InterfaceC2043d
    public final void L(long j5) {
        long j6 = 9223372034707292159L & j5;
        m mVar = this.f17731d;
        if (j6 != 9205357640488583168L) {
            this.f17742q = false;
            mVar.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
            mVar.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                mVar.resetPivot();
                return;
            }
            this.f17742q = true;
            mVar.setPivotX(((int) (this.f17735j >> 32)) / 2.0f);
            mVar.setPivotY(((int) (4294967295L & this.f17735j)) / 2.0f);
        }
    }

    @Override // l0.InterfaceC2043d
    public final long M() {
        return this.f17746u;
    }

    public final void N(int i) {
        m mVar = this.f17731d;
        boolean z3 = true;
        if (i == 1) {
            mVar.setLayerType(2, this.f17733g);
        } else if (i == 2) {
            mVar.setLayerType(0, this.f17733g);
            z3 = false;
        } else {
            mVar.setLayerType(0, this.f17733g);
        }
        mVar.setCanUseCompositingLayer$ui_graphics_release(z3);
    }

    public final void O() {
        int i = this.f17740o;
        if (i != 1 && this.f17739n == 3) {
            N(i);
        } else {
            N(1);
        }
    }

    @Override // l0.InterfaceC2043d
    public final float a() {
        return this.f17741p;
    }

    @Override // l0.InterfaceC2043d
    public final void b() {
        this.f17731d.setRotationX(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final void c(float f) {
        this.f17741p = f;
        this.f17731d.setAlpha(f);
    }

    @Override // l0.InterfaceC2043d
    public final float d() {
        return this.f17743r;
    }

    @Override // l0.InterfaceC2043d
    public final void e(float f) {
        this.f17745t = f;
        this.f17731d.setElevation(f);
    }

    @Override // l0.InterfaceC2043d
    public final void f(W0.c cVar, W0.m mVar, C2041b c2041b, B b3) {
        m mVar2 = this.f17731d;
        ViewParent parent = mVar2.getParent();
        AbstractC2081a abstractC2081a = this.f17729b;
        if (parent == null) {
            abstractC2081a.addView(mVar2);
        }
        mVar2.f17756q = cVar;
        mVar2.f17757r = mVar;
        mVar2.f17758s = b3;
        mVar2.f17759t = c2041b;
        if (mVar2.isAttachedToWindow()) {
            mVar2.setVisibility(4);
            mVar2.setVisibility(0);
            try {
                o oVar = this.f17730c;
                C2047h c2047h = f17728x;
                C1997b c1997b = oVar.f17288a;
                Canvas canvas = c1997b.f17266a;
                c1997b.f17266a = c2047h;
                abstractC2081a.a(c1997b, mVar2, mVar2.getDrawingTime());
                oVar.f17288a.f17266a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // l0.InterfaceC2043d
    public final float g() {
        return 0.0f;
    }

    @Override // l0.InterfaceC2043d
    public final void h() {
        this.f17731d.setTranslationY(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final void i(float f) {
        this.f17748w = f;
        this.f17731d.setRotation(f);
    }

    @Override // l0.InterfaceC2043d
    public final void j() {
        this.f17731d.setRotationY(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final long k() {
        return this.f17747v;
    }

    @Override // l0.InterfaceC2043d
    public final void l(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17746u = j5;
            this.f17731d.setOutlineAmbientShadowColor(F.u(j5));
        }
    }

    @Override // l0.InterfaceC2043d
    public final void m(Outline outline, long j5) {
        m mVar = this.f17731d;
        mVar.f17754o = outline;
        mVar.invalidateOutline();
        if ((this.f17738m || mVar.getClipToOutline()) && outline != null) {
            mVar.setClipToOutline(true);
            if (this.f17738m) {
                this.f17738m = false;
                this.f17736k = true;
            }
        }
        this.f17737l = outline != null;
    }

    @Override // l0.InterfaceC2043d
    public final void n() {
        Paint paint = this.f17733g;
        if (paint == null) {
            paint = new Paint();
            this.f17733g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // l0.InterfaceC2043d
    public final void o(float f) {
        this.f17743r = f;
        this.f17731d.setScaleX(f);
    }

    @Override // l0.InterfaceC2043d
    public final void p(int i) {
        this.f17739n = i;
        Paint paint = this.f17733g;
        if (paint == null) {
            paint = new Paint();
            this.f17733g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(F.y(i)));
        O();
    }

    @Override // l0.InterfaceC2043d
    public final float q() {
        return this.f17731d.getCameraDistance() / this.f17732e.getDisplayMetrics().densityDpi;
    }

    @Override // l0.InterfaceC2043d
    public final void r() {
        this.f17729b.removeViewInLayout(this.f17731d);
    }

    @Override // l0.InterfaceC2043d
    public final float s() {
        return 0.0f;
    }

    @Override // l0.InterfaceC2043d
    public final void t() {
        this.f17731d.setTranslationX(0.0f);
    }

    @Override // l0.InterfaceC2043d
    public final void u(boolean z3) {
        boolean z5 = false;
        this.f17738m = z3 && !this.f17737l;
        this.f17736k = true;
        if (z3 && this.f17737l) {
            z5 = true;
        }
        this.f17731d.setClipToOutline(z5);
    }

    @Override // l0.InterfaceC2043d
    public final int v() {
        return this.f17740o;
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
        this.f17740o = i;
        O();
    }

    @Override // l0.InterfaceC2043d
    public final void z(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17747v = j5;
            this.f17731d.setOutlineSpotShadowColor(F.u(j5));
        }
    }
}
