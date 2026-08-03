package P0;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements x.InterfaceC1010a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1379b;

    public /* synthetic */ q(int i2, java.lang.Object obj) {
        this.f1378a = i2;
        this.f1379b = obj;
    }

    @Override // x.InterfaceC1010a
    public final void accept(java.lang.Object obj) {
        switch (this.f1378a) {
            case 0:
                ((P0.t) this.f1379b).setWindowInfoListenerDisplayFeatures((Z.j) obj);
                break;
            default:
                ((B1.q) ((B1.r) this.f1379b)).h((Z.j) obj);
                break;
        }
    }
}
