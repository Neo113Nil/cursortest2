package F;

/* renamed from: F.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008h extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public java.util.Iterator f456e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f457f;

    /* renamed from: g, reason: collision with root package name */
    public int f458g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f459h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f460i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f461j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0008h(java.util.List list, java.util.ArrayList arrayList, k1.d dVar) {
        super(2, dVar);
        this.f460i = list;
        this.f461j = arrayList;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        F.C0008h c0008h = new F.C0008h(this.f460i, this.f461j, dVar);
        c0008h.f459h = obj;
        return c0008h;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        java.util.Iterator it;
        java.util.List list;
        int i2 = this.f458g;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            obj = this.f459h;
            it = this.f460i.iterator();
            list = this.f461j;
        } else if (i2 == 1) {
            java.lang.Object obj2 = this.f457f;
            java.util.Iterator it2 = this.f456e;
            java.util.List list2 = (java.util.List) this.f459h;
            a.AbstractC0059a.A(obj);
            if (((java.lang.Boolean) obj).booleanValue()) {
                list2.add(new F.C0007g(1, null));
                this.f459h = list2;
                this.f456e = it2;
                this.f457f = null;
                this.f458g = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f456e;
            list = (java.util.List) this.f459h;
            a.AbstractC0059a.A(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new java.lang.ClassCastException();
        }
        this.f459h = list;
        this.f456e = it;
        this.f457f = obj;
        this.f458g = 1;
        throw null;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.C0008h) b(obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
