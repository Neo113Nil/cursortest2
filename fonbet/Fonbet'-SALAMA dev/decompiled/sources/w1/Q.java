package w1;

/* loaded from: classes.dex */
public final class Q extends G2 {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f17510B = 0;

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f17511A;

    public /* synthetic */ Q(int i7) {
        this.f17511A = i7;
    }

    @Override // w1.G2
    public void i(I2 i22) {
        switch (this.f17511A) {
            case 0:
                super.i(i22);
                d(new P(i22, 0));
                break;
            case 1:
                super.i(i22);
                d(new P(i22, 1));
                break;
            default:
                super.i(i22);
                break;
        }
    }
}
