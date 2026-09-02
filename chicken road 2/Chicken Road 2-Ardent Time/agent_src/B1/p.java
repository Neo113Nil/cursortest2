package B1;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f53e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f54f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i2, java.lang.Object obj) {
        super(1);
        this.f53e = i2;
        this.f54f = obj;
    }

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f53e) {
            case 0:
                h1.C0177i c0177i = h1.C0177i.f3302a;
                ((z1.C1053f) this.f54f).l(c0177i);
                break;
            case 1:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                F.P p2 = (F.P) this.f54f;
                if (th != null) {
                    p2.f385h.p(new F.b0(th));
                }
                if (p2.f387j.f3299b != h1.C0176h.f3301a) {
                    ((F.Y) p2.f387j.a()).close();
                }
                break;
            default:
                ((H1.h) this.f54f).b();
                break;
        }
        return h1.C0177i.f3302a;
    }
}
