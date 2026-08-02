package T2;

/* renamed from: T2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5683a;

    /* renamed from: b, reason: collision with root package name */
    public float f5684b;

    public final synchronized float a() {
        if (!e()) {
            return 1.0f;
        }
        return this.f5684b;
    }

    public final synchronized void b(boolean z3) {
        this.f5683a = z3;
    }

    public final synchronized void c(float f) {
        this.f5684b = f;
    }

    public final synchronized boolean d() {
        return this.f5683a;
    }

    public final synchronized boolean e() {
        return this.f5684b >= 0.0f;
    }
}
