package p4;

/* renamed from: p4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2272l extends X implements InterfaceC2271k {

    /* renamed from: o, reason: collision with root package name */
    public final b0 f18801o;

    public C2272l(b0 b0Var) {
        this.f18801o = b0Var;
    }

    @Override // p4.InterfaceC2271k
    public final boolean c(Throwable th) {
        return j().D(th);
    }

    @Override // p4.X
    public final boolean k() {
        return true;
    }

    @Override // p4.X
    public final void l(Throwable th) {
        this.f18801o.y(j());
    }
}
