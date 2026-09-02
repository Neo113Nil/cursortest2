package E1;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.l f297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k1.i f299g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s1.l lVar, java.lang.Object obj, k1.i iVar) {
        super(1);
        this.f297e = lVar;
        this.f298f = obj;
        this.f299g = iVar;
    }

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        E1.A a2 = E1.AbstractC0000a.a(this.f297e, this.f298f, null);
        if (a2 != null) {
            z1.AbstractC1068v.d(a2, this.f299g);
        }
        return h1.C0177i.f3302a;
    }
}
