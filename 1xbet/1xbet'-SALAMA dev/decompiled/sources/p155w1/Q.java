package p155w1;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends G2 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f17516B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f17517A;

    public /* synthetic */ Q(int i7) {
        this.f17517A = i7;
    }

    @Override // p155w1.G2
    public void i(I2 i7) {
        switch (this.f17517A) {
            case 0:
                super.i(i7);
                d(new P(i7, 0));
                break;
            case 1:
                super.i(i7);
                d(new P(i7, 1));
                break;
            default:
                super.i(i7);
                break;
        }
    }
}
