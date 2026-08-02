package c2;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f10167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10168c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0814u f10169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0819z f10170e;

    public /* synthetic */ F(I i7, J j, C0814u c0814u, C0819z c0819z, int i8) {
        this.f10166a = i8;
        this.f10167b = i7;
        this.f10168c = j;
        this.f10169d = c0814u;
        this.f10170e = c0819z;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c2.J, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [c2.J, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [c2.J, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10166a) {
            case 0:
                I i7 = this.f10167b;
                int i8 = i7.f10179a;
                this.f10168c.A(i8, i7.f10180b, this.f10169d, this.f10170e);
                break;
            case 1:
                I i9 = this.f10167b;
                int i10 = i9.f10179a;
                this.f10168c.y(i10, i9.f10180b, this.f10169d, this.f10170e);
                break;
            default:
                I i11 = this.f10167b;
                int i12 = i11.f10179a;
                this.f10168c.m(i12, i11.f10180b, this.f10169d, this.f10170e);
                break;
        }
    }
}
