package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class F implements InterfaceC0250u {

    /* renamed from: i, reason: collision with root package name */
    public static final F f4520i = new F();

    /* renamed from: a, reason: collision with root package name */
    public int f4521a;

    /* renamed from: b, reason: collision with root package name */
    public int f4522b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f4525e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4523c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4524d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C0252w f4526f = new C0252w(this);

    /* renamed from: g, reason: collision with root package name */
    public final B2.b f4527g = new B2.b(5, this);

    /* renamed from: h, reason: collision with root package name */
    public final V0.j f4528h = new V0.j(7, this);

    public final void a() {
        int i2 = this.f4522b + 1;
        this.f4522b = i2;
        if (i2 == 1) {
            if (this.f4523c) {
                this.f4526f.e(EnumC0243m.ON_RESUME);
                this.f4523c = false;
            } else {
                Handler handler = this.f4525e;
                kotlin.jvm.internal.i.b(handler);
                handler.removeCallbacks(this.f4527g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0250u
    public final AbstractC0245o getLifecycle() {
        return this.f4526f;
    }
}
