package androidx.lifecycle;

/* loaded from: classes.dex */
public final class r implements androidx.lifecycle.j {

    /* renamed from: i, reason: collision with root package name */
    public static final androidx.lifecycle.r f2402i = new androidx.lifecycle.r();

    /* renamed from: a, reason: collision with root package name */
    public int f2403a;

    /* renamed from: b, reason: collision with root package name */
    public int f2404b;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f2407e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2405c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2406d = true;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.l f2408f = new androidx.lifecycle.l(this);

    /* renamed from: g, reason: collision with root package name */
    public final F0.a f2409g = new F0.a(4, this);

    /* renamed from: h, reason: collision with root package name */
    public final Z0.h f2410h = new Z0.h(13, this);

    @Override // androidx.lifecycle.j
    public final androidx.lifecycle.l b() {
        return this.f2408f;
    }

    public final void c() {
        int i2 = this.f2404b + 1;
        this.f2404b = i2;
        if (i2 == 1) {
            if (this.f2405c) {
                this.f2408f.d(androidx.lifecycle.d.ON_RESUME);
                this.f2405c = false;
            } else {
                android.os.Handler handler = this.f2407e;
                kotlin.jvm.internal.i.b(handler);
                handler.removeCallbacks(this.f2409g);
            }
        }
    }
}
