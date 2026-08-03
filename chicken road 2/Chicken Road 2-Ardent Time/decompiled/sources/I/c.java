package I;

/* loaded from: classes.dex */
public final class c extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f645e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m1.AbstractC0935f f647g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(s1.p pVar, k1.d dVar) {
        super(2, dVar);
        this.f647g = (m1.AbstractC0935f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m1.f, s1.p] */
    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        I.c cVar = new I.c(this.f647g, dVar);
        cVar.f646f = obj;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [m1.f, s1.p] */
    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f645e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            I.b bVar = (I.b) this.f646f;
            this.f645e = 1;
            obj = this.f647g.invoke(bVar, this);
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.AbstractC0059a.A(obj);
        }
        I.b bVar2 = (I.b) obj;
        kotlin.jvm.internal.i.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((java.util.concurrent.atomic.AtomicBoolean) bVar2.f644b.f88b).set(true);
        return bVar2;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((I.c) b((I.b) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
