package F0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f553c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f554d;

    public /* synthetic */ d(java.lang.Object obj, int i2, java.lang.Object obj2, int i3) {
        this.f551a = i3;
        this.f553c = obj;
        this.f552b = i2;
        this.f554d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f551a) {
            case 0:
                com.yandex.varioqub.config.impl.B.a((com.yandex.varioqub.config.impl.B) this.f553c, this.f552b, (s1.InterfaceC0991a) this.f554d);
                break;
            default:
                ((N.d) ((N.a) this.f553c).f1104c).a(this.f552b, (java.io.Serializable) this.f554d);
                break;
        }
    }
}
