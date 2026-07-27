package X4;

/* loaded from: classes.dex */
public final class k implements x {

    /* renamed from: a, reason: collision with root package name */
    public final w f3574a;

    public k(Throwable th) {
        this.f3574a = new w(this, th, 2);
    }

    @Override // X4.x
    public final x a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // X4.x
    public final w b() {
        return this.f3574a;
    }

    @Override // X4.x
    public final s c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // X4.x, Y4.f
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // X4.x
    public final boolean e() {
        return false;
    }

    @Override // X4.x
    public final w g() {
        return this.f3574a;
    }
}
