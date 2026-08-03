package f1;

/* renamed from: f1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124k extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I.d f2847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2848g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0124k(I.d dVar, java.lang.String str, k1.d dVar2) {
        super(2, dVar2);
        this.f2847f = dVar;
        this.f2848g = str;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        f1.C0124k c0124k = new f1.C0124k(this.f2847f, this.f2848g, dVar);
        c0124k.f2846e = obj;
        return c0124k;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        a.AbstractC0059a.A(obj);
        ((I.b) this.f2846e).d(this.f2847f, this.f2848g);
        return h1.C0177i.f3302a;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        f1.C0124k c0124k = (f1.C0124k) b((I.b) obj, (k1.d) obj2);
        h1.C0177i c0177i = h1.C0177i.f3302a;
        c0124k.g(c0177i);
        return c0177i;
    }
}
