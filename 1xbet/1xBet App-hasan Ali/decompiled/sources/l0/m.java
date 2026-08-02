package l0;

import A0.r1;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import i0.C1997b;
import i0.InterfaceC2009n;
import i0.o;
import k0.AbstractC2024d;
import k0.C2021a;
import k0.C2022b;
import m0.AbstractC2081a;

/* loaded from: classes.dex */
public final class m extends View {

    /* renamed from: u, reason: collision with root package name */
    public static final r1 f17749u = new r1(3);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC2081a f17750k;

    /* renamed from: l, reason: collision with root package name */
    public final o f17751l;

    /* renamed from: m, reason: collision with root package name */
    public final C2022b f17752m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17753n;

    /* renamed from: o, reason: collision with root package name */
    public Outline f17754o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17755p;

    /* renamed from: q, reason: collision with root package name */
    public W0.c f17756q;

    /* renamed from: r, reason: collision with root package name */
    public W0.m f17757r;

    /* renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.m f17758s;

    /* renamed from: t, reason: collision with root package name */
    public C2041b f17759t;

    public m(AbstractC2081a abstractC2081a, o oVar, C2022b c2022b) {
        super(abstractC2081a.getContext());
        this.f17750k = abstractC2081a;
        this.f17751l = oVar;
        this.f17752m = c2022b;
        setOutlineProvider(f17749u);
        this.f17755p = true;
        this.f17756q = AbstractC2024d.f17545a;
        this.f17757r = W0.m.f6016k;
        InterfaceC2043d.f17688a.getClass();
        this.f17758s = C2040a.f17663n;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o oVar = this.f17751l;
        C1997b c1997b = oVar.f17288a;
        Canvas canvas2 = c1997b.f17266a;
        c1997b.f17266a = canvas;
        W0.c cVar = this.f17756q;
        W0.m mVar = this.f17757r;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C2041b c2041b = this.f17759t;
        ?? r9 = this.f17758s;
        C2022b c2022b = this.f17752m;
        v3.e eVar = c2022b.f17540l;
        C2021a c2021a = ((C2022b) eVar.f20434n).f17539k;
        W0.c cVar2 = c2021a.f17535a;
        W0.m mVar2 = c2021a.f17536b;
        InterfaceC2009n v4 = eVar.v();
        v3.e eVar2 = c2022b.f17540l;
        long A3 = eVar2.A();
        C2041b c2041b2 = (C2041b) eVar2.f20433m;
        eVar2.N(cVar);
        eVar2.O(mVar);
        eVar2.M(c1997b);
        eVar2.P(floatToRawIntBits);
        eVar2.f20433m = c2041b;
        c1997b.k();
        try {
            r9.c(c2022b);
            c1997b.j();
            eVar2.N(cVar2);
            eVar2.O(mVar2);
            eVar2.M(v4);
            eVar2.P(A3);
            eVar2.f20433m = c2041b2;
            oVar.f17288a.f17266a = canvas2;
            this.f17753n = false;
        } catch (Throwable th) {
            c1997b.j();
            eVar2.N(cVar2);
            eVar2.O(mVar2);
            eVar2.M(v4);
            eVar2.P(A3);
            eVar2.f20433m = c2041b2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f17755p;
    }

    public final o getCanvasHolder() {
        return this.f17751l;
    }

    public final View getOwnerView() {
        return this.f17750k;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f17755p;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f17753n) {
            return;
        }
        this.f17753n = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z3) {
        if (this.f17755p != z3) {
            this.f17755p = z3;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z3) {
        this.f17753n = z3;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
    }
}
