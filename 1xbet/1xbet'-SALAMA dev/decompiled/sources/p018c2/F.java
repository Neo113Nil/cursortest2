package p018c2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f10167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0774u f10169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0779z f10170e;

    public /* synthetic */ F(I i7, J j, C0774u c0774u, C0779z c0779z, int i8) {
        this.f10166a = i8;
        this.f10167b = i7;
        this.f10168c = j;
        this.f10169d = c0774u;
        this.f10170e = c0779z;
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
