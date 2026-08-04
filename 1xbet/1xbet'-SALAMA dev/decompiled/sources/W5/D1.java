package W5;

/* JADX INFO: loaded from: classes2.dex */
public final class D1 implements G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6759b;

    public /* synthetic */ D1(int i7, int i8) {
        this.f6758a = i8;
        this.f6759b = i7;
    }

    @Override // W5.G1
    public final void a(M1 m7) {
        switch (this.f6758a) {
            case 0:
                m7.f6877a.j(this.f6759b);
                break;
            case 1:
                m7.f6877a.c(this.f6759b);
                break;
            default:
                m7.f6877a.i(this.f6759b);
                break;
        }
    }
}
