package O5;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class e extends a implements Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name */
    private B5.g f19981l;

    /* renamed from: d, reason: collision with root package name */
    private float f19973d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19974e = false;

    /* renamed from: f, reason: collision with root package name */
    private long f19975f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float f19976g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f19977h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private int f19978i = 0;

    /* renamed from: j, reason: collision with root package name */
    private float f19979j = -2.1474836E9f;

    /* renamed from: k, reason: collision with root package name */
    private float f19980k = 2.1474836E9f;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f19982m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19983n = false;

    private boolean n() {
        return this.f19973d < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        super.a();
        b(n());
        q(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        boolean z11 = false;
        if (this.f19982m) {
            q(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        B5.g gVar = this.f19981l;
        if (gVar == null || !this.f19982m) {
            return;
        }
        int i11 = B5.c.f2729d;
        float i12 = (this.f19975f != 0 ? j11 - r2 : 0L) / ((1.0E9f / gVar.i()) / Math.abs(this.f19973d));
        float f7 = this.f19976g;
        if (n()) {
            i12 = -i12;
        }
        float f11 = f7 + i12;
        float l11 = l();
        float k11 = k();
        int i13 = f.f19985b;
        if (f11 >= l11 && f11 <= k11) {
            z11 = true;
        }
        float f12 = this.f19976g;
        float b11 = f.b(f11, l(), k());
        this.f19976g = b11;
        if (this.f19983n) {
            b11 = (float) Math.floor(b11);
        }
        this.f19977h = b11;
        this.f19975f = j11;
        if (!this.f19983n || this.f19976g != f12) {
            g();
        }
        if (!z11) {
            if (getRepeatCount() == -1 || this.f19978i < getRepeatCount()) {
                d();
                this.f19978i++;
                if (getRepeatMode() == 2) {
                    this.f19974e = !this.f19974e;
                    this.f19973d = -this.f19973d;
                } else {
                    float k12 = n() ? k() : l();
                    this.f19976g = k12;
                    this.f19977h = k12;
                }
                this.f19975f = j11;
            } else {
                float l12 = this.f19973d < 0.0f ? l() : k();
                this.f19976g = l12;
                this.f19977h = l12;
                q(true);
                b(n());
            }
        }
        if (this.f19981l == null) {
            return;
        }
        float f13 = this.f19977h;
        if (f13 < this.f19979j || f13 > this.f19980k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f19979j), Float.valueOf(this.f19980k), Float.valueOf(this.f19977h)));
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float l11;
        float k11;
        float l12;
        if (this.f19981l == null) {
            return 0.0f;
        }
        if (n()) {
            l11 = k() - this.f19977h;
            k11 = k();
            l12 = l();
        } else {
            l11 = this.f19977h - l();
            k11 = k();
            l12 = l();
        }
        return l11 / (k11 - l12);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(j());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        B5.g gVar = this.f19981l;
        if (gVar == null) {
            return 0L;
        }
        return (long) gVar.d();
    }

    public final void h() {
        this.f19981l = null;
        this.f19979j = -2.1474836E9f;
        this.f19980k = 2.1474836E9f;
    }

    public final void i() {
        q(true);
        b(n());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f19982m;
    }

    public final float j() {
        B5.g gVar = this.f19981l;
        if (gVar == null) {
            return 0.0f;
        }
        return (this.f19977h - gVar.o()) / (this.f19981l.f() - this.f19981l.o());
    }

    public final float k() {
        B5.g gVar = this.f19981l;
        if (gVar == null) {
            return 0.0f;
        }
        float f7 = this.f19980k;
        return f7 == 2.1474836E9f ? gVar.f() : f7;
    }

    public final float l() {
        B5.g gVar = this.f19981l;
        if (gVar == null) {
            return 0.0f;
        }
        float f7 = this.f19979j;
        return f7 == -2.1474836E9f ? gVar.o() : f7;
    }

    public final float m() {
        return this.f19973d;
    }

    public final void o() {
        q(true);
        c();
    }

    public final void p() {
        this.f19982m = true;
        f(n());
        t((int) (n() ? k() : l()));
        this.f19975f = 0L;
        this.f19978i = 0;
        if (this.f19982m) {
            q(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected final void q(boolean z11) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z11) {
            this.f19982m = false;
        }
    }

    public final void r() {
        this.f19982m = true;
        q(false);
        Choreographer.getInstance().postFrameCallback(this);
        this.f19975f = 0L;
        if (n() && this.f19977h == l()) {
            t(k());
        } else if (!n() && this.f19977h == k()) {
            t(l());
        }
        e();
    }

    public final void s(B5.g gVar) {
        boolean z11 = this.f19981l == null;
        this.f19981l = gVar;
        if (z11) {
            u(Math.max(this.f19979j, gVar.o()), Math.min(this.f19980k, gVar.f()));
        } else {
            u((int) gVar.o(), (int) gVar.f());
        }
        float f7 = this.f19977h;
        this.f19977h = 0.0f;
        this.f19976g = 0.0f;
        t((int) f7);
        g();
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i11) {
        super.setRepeatMode(i11);
        if (i11 == 2 || !this.f19974e) {
            return;
        }
        this.f19974e = false;
        this.f19973d = -this.f19973d;
    }

    public final void t(float f7) {
        if (this.f19976g == f7) {
            return;
        }
        float b11 = f.b(f7, l(), k());
        this.f19976g = b11;
        if (this.f19983n) {
            b11 = (float) Math.floor(b11);
        }
        this.f19977h = b11;
        this.f19975f = 0L;
        g();
    }

    public final void u(float f7, float f11) {
        if (f7 > f11) {
            throw new IllegalArgumentException("minFrame (" + f7 + ") must be <= maxFrame (" + f11 + ")");
        }
        B5.g gVar = this.f19981l;
        float o11 = gVar == null ? -3.4028235E38f : gVar.o();
        B5.g gVar2 = this.f19981l;
        float f12 = gVar2 == null ? Float.MAX_VALUE : gVar2.f();
        float b11 = f.b(f7, o11, f12);
        float b12 = f.b(f11, o11, f12);
        if (b11 == this.f19979j && b12 == this.f19980k) {
            return;
        }
        this.f19979j = b11;
        this.f19980k = b12;
        t((int) f.b(this.f19977h, b11, b12));
    }

    public final void v(float f7) {
        this.f19973d = f7;
    }

    public final void w(boolean z11) {
        this.f19983n = z11;
    }
}
