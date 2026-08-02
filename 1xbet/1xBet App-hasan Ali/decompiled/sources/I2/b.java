package I2;

import A0.C0040k0;
import D2.e;
import P.AbstractC0329z;
import P.C0305m0;
import P.G0;
import W3.m;
import a.AbstractC0444a;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import h0.C1991e;
import i0.AbstractC1998c;
import i0.C2006k;
import i0.InterfaceC2009n;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import n0.AbstractC2157b;
import z0.C2733I;

/* loaded from: classes.dex */
public final class b extends AbstractC2157b implements G0 {

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f2599o;

    /* renamed from: p, reason: collision with root package name */
    public final C0305m0 f2600p;

    /* renamed from: q, reason: collision with root package name */
    public final C0305m0 f2601q;

    /* renamed from: r, reason: collision with root package name */
    public final m f2602r;

    public b(Drawable drawable) {
        l.f("drawable", drawable);
        this.f2599o = drawable;
        this.f2600p = AbstractC0329z.t(0);
        Object obj = d.f2604a;
        this.f2601q = AbstractC0329z.t(new C1991e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC0444a.d(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f2602r = G4.d.E(new C0040k0(14, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // P.G0
    public final void a() {
        Drawable.Callback callback = (Drawable.Callback) this.f2602r.getValue();
        Drawable drawable = this.f2599o;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // n0.AbstractC2157b
    public final void b(float f) {
        this.f2599o.setAlpha(AbstractC0444a.t(AbstractC2036a.U(f * 255), 0, 255));
    }

    @Override // P.G0
    public final void c() {
        e();
    }

    @Override // n0.AbstractC2157b
    public final void d(C2006k c2006k) {
        this.f2599o.setColorFilter(c2006k != null ? c2006k.f17283a : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // P.G0
    public final void e() {
        Drawable drawable = this.f2599o;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // n0.AbstractC2157b
    public final void f(W0.m mVar) {
        int i;
        l.f("layoutDirection", mVar);
        int ordinal = mVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new e();
            }
        } else {
            i = 0;
        }
        this.f2599o.setLayoutDirection(i);
    }

    @Override // n0.AbstractC2157b
    public final long h() {
        return ((C1991e) this.f2601q.getValue()).f17204a;
    }

    @Override // n0.AbstractC2157b
    public final void i(C2733I c2733i) {
        InterfaceC2009n v4 = c2733i.f21647k.f17540l.v();
        ((Number) this.f2600p.getValue()).intValue();
        int U4 = AbstractC2036a.U(C1991e.d(c2733i.d()));
        int U5 = AbstractC2036a.U(C1991e.b(c2733i.d()));
        Drawable drawable = this.f2599o;
        drawable.setBounds(0, 0, U4, U5);
        try {
            v4.k();
            drawable.draw(AbstractC1998c.a(v4));
        } finally {
            v4.j();
        }
    }
}
