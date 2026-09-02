package F;

/* renamed from: F.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0017s implements l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112b;

    public /* synthetic */ C0017s(int i2, Object obj) {
        this.f111a = i2;
        this.f112b = obj;
    }

    @Override // l.a
    public final void accept(Object obj) {
        switch (this.f111a) {
            case 0:
                ((x) this.f112b).setWindowInfoListenerDisplayFeatures((w.k) obj);
                break;
            default:
                ((o0.q) ((o0.r) this.f112b)).i((w.k) obj);
                break;
        }
    }
}
