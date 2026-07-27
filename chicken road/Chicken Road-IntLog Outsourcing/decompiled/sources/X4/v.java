package X4;

/* loaded from: classes.dex */
public final class v implements x {

    /* renamed from: a, reason: collision with root package name */
    public final s f3647a;

    public v(s sVar) {
        this.f3647a = sVar;
    }

    @Override // X4.x
    public final x a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // X4.x
    public final w b() {
        throw new IllegalStateException("already connected");
    }

    @Override // X4.x
    public final s c() {
        return this.f3647a;
    }

    @Override // X4.x, Y4.f
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // X4.x
    public final boolean e() {
        return true;
    }

    @Override // X4.x
    public final w g() {
        throw new IllegalStateException("already connected");
    }
}
