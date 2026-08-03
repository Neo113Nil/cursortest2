package I1;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I1.e f698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f700h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(I1.e eVar, java.lang.Object obj, java.lang.Object obj2, int i2) {
        super(0);
        this.f697e = i2;
        this.f698f = eVar;
        this.f699g = obj;
        this.f700h = obj2;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        switch (this.f697e) {
            case 0:
                Q1.l lVar = this.f698f.f703b;
                java.util.List list = (java.util.List) this.f699g;
                java.util.List e2 = lVar == null ? null : lVar.e((java.lang.String) this.f700h, list);
                if (e2 != null) {
                    list = e2;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(list));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.security.cert.X509Certificate) ((java.security.cert.Certificate) it.next()));
                }
                return arrayList;
            default:
                Q1.l lVar2 = this.f698f.f703b;
                kotlin.jvm.internal.i.b(lVar2);
                return lVar2.e(((I1.C0026a) this.f700h).f677h.f764d, ((I1.k) this.f699g).a());
        }
    }
}
