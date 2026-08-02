package V5;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
final class p<Z> implements v<Z> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28274a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28275b;

    /* renamed from: c, reason: collision with root package name */
    private final v<Z> f28276c;

    /* renamed from: d, reason: collision with root package name */
    private final l f28277d;

    /* renamed from: e, reason: collision with root package name */
    private final T5.f f28278e;

    /* renamed from: f, reason: collision with root package name */
    private int f28279f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28280g;

    p(v vVar, boolean z11, boolean z12, T5.f fVar, l lVar) {
        p6.k.c(vVar, "Argument must not be null");
        this.f28276c = vVar;
        this.f28274a = z11;
        this.f28275b = z12;
        this.f28278e = fVar;
        p6.k.c(lVar, "Argument must not be null");
        this.f28277d = lVar;
    }

    @Override // V5.v
    public final synchronized void a() {
        if (this.f28279f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f28280g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f28280g = true;
        if (this.f28275b) {
            this.f28276c.a();
        }
    }

    @Override // V5.v
    @NonNull
    public final Class<Z> b() {
        return this.f28276c.b();
    }

    final synchronized void c() {
        if (this.f28280g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f28279f++;
    }

    final v<Z> d() {
        return this.f28276c;
    }

    final boolean e() {
        return this.f28274a;
    }

    final void f() {
        boolean z11;
        synchronized (this) {
            int i11 = this.f28279f;
            if (i11 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z11 = true;
            int i12 = i11 - 1;
            this.f28279f = i12;
            if (i12 != 0) {
                z11 = false;
            }
        }
        if (z11) {
            this.f28277d.f(this.f28278e, this);
        }
    }

    @Override // V5.v
    @NonNull
    public final Z get() {
        return this.f28276c.get();
    }

    @Override // V5.v
    public final int getSize() {
        return this.f28276c.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f28274a + ", listener=" + this.f28277d + ", key=" + this.f28278e + ", acquired=" + this.f28279f + ", isRecycled=" + this.f28280g + ", resource=" + this.f28276c + '}';
    }
}
