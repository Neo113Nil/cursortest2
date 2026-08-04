package p155w1;

/* JADX INFO: loaded from: classes.dex */
public final class F2 extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I2 f17385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G2 f17386c;

    public /* synthetic */ F2(G2 g3, I2 i7, int i8) {
        this.f17384a = i8;
        this.f17386c = g3;
        this.f17385b = i7;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f17384a) {
            case 0:
                this.f17386c.f17391z.add(this.f17385b);
                break;
            default:
                this.f17386c.f17391z.remove(this.f17385b);
                break;
        }
    }
}
