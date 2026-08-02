package E;

/* loaded from: classes.dex */
public final class H0 implements P0.q {

    /* renamed from: a, reason: collision with root package name */
    public int f1041a;

    /* renamed from: b, reason: collision with root package name */
    public int f1042b;

    public /* synthetic */ H0(int i, int i5) {
        this.f1041a = i;
        this.f1042b = i5;
    }

    @Override // P0.q
    public int a(int i) {
        if (i >= 0 && i <= this.f1042b) {
            W.u(i, this.f1041a, i);
        }
        return i;
    }

    @Override // P0.q
    public int b(int i) {
        if (i >= 0 && i <= this.f1041a) {
            W.t(i, this.f1042b, i);
        }
        return i;
    }
}
