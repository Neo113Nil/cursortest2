package U5;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f6556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6557b;

    public m0(l0 l0Var) {
        super(l0.b(l0Var), l0Var.f6549c);
        this.f6556a = l0Var;
        this.f6557b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f6557b ? super.fillInStackTrace() : this;
    }
}
