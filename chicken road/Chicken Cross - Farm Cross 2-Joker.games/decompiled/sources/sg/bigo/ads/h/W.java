package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12858a = false;
    public U b;
    public V c;

    public void a() {
        U u;
        if (this.f12858a || (u = this.b) == null || u.f) {
            return;
        }
        u.d();
    }

    public void b() {
        U u;
        if (this.f12858a || (u = this.b) == null || u.f) {
            return;
        }
        u.e();
    }

    public final void a(int i, Runnable runnable) {
        U u = this.b;
        if (u != null) {
            u.a();
        }
        this.f12858a = false;
        U u2 = new U(this, i * 1000, runnable);
        this.b = u2;
        u2.e();
    }
}
