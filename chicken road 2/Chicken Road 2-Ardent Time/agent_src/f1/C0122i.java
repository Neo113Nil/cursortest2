package f1;

/* renamed from: f1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122i extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f2842f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122i(java.util.List list, k1.d dVar) {
        super(2, dVar);
        this.f2842f = list;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        f1.C0122i c0122i = new f1.C0122i(this.f2842f, dVar);
        c0122i.f2841e = obj;
        return c0122i;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        a.AbstractC0059a.A(obj);
        I.b bVar = (I.b) this.f2841e;
        java.util.List<java.lang.String> list = this.f2842f;
        if (list != null) {
            for (java.lang.String name : list) {
                kotlin.jvm.internal.i.e(name, "name");
                I.d dVar = new I.d(name);
                bVar.b();
                bVar.f643a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f643a.clear();
        }
        return h1.C0177i.f3302a;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        f1.C0122i c0122i = (f1.C0122i) b((I.b) obj, (k1.d) obj2);
        h1.C0177i c0177i = h1.C0177i.f3302a;
        c0122i.g(c0177i);
        return c0177i;
    }
}
