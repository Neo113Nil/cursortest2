package U5;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f6560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6561b;

    public n0(l0 l0Var) {
        super(l0.b(l0Var), l0Var.f6549c);
        this.f6560a = l0Var;
        this.f6561b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f6561b ? super.fillInStackTrace() : this;
    }
}
