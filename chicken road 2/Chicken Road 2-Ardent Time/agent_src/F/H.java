package F;

/* loaded from: classes.dex */
public final class H extends m1.AbstractC0935f implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f348e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.P f350g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f352i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.io.Serializable f353j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(F.P p2, k1.i iVar, s1.p pVar, k1.d dVar) {
        super(1, dVar);
        this.f350g = p2;
        this.f352i = iVar;
        this.f353j = (m1.AbstractC0935f) pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r6v2, types: [m1.f, s1.p] */
    @Override // m1.AbstractC0931b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g(java.lang.Object obj) {
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.o oVar;
        F.C0004d c0004d;
        java.lang.Object obj2;
        switch (this.f348e) {
            case 0:
                l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                int i2 = this.f349f;
                kotlin.jvm.internal.o oVar2 = (kotlin.jvm.internal.o) this.f353j;
                kotlin.jvm.internal.p pVar2 = (kotlin.jvm.internal.p) this.f352i;
                F.P p2 = this.f350g;
                try {
                } catch (F.C0003c unused) {
                    java.lang.Object obj3 = pVar2.f7960a;
                    this.f351h = oVar2;
                    this.f349f = 3;
                    obj = p2.j(obj3, true, this);
                    if (obj == enumC0927a) {
                        return enumC0927a;
                    }
                }
                if (i2 == 0) {
                    a.AbstractC0059a.A(obj);
                    this.f351h = pVar2;
                    this.f349f = 1;
                    obj = p2.i(this);
                    if (obj == enumC0927a) {
                        return enumC0927a;
                    }
                    pVar = pVar2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oVar = (kotlin.jvm.internal.o) ((java.io.Serializable) this.f351h);
                            a.AbstractC0059a.A(obj);
                            oVar.f7959a = ((java.lang.Number) obj).intValue();
                            return h1.C0177i.f3302a;
                        }
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oVar2 = (kotlin.jvm.internal.o) ((java.io.Serializable) this.f351h);
                        a.AbstractC0059a.A(obj);
                        oVar2.f7959a = ((java.lang.Number) obj).intValue();
                        return h1.C0177i.f3302a;
                    }
                    pVar = (kotlin.jvm.internal.p) ((java.io.Serializable) this.f351h);
                    a.AbstractC0059a.A(obj);
                }
                pVar.f7960a = obj;
                F.j0 g2 = p2.g();
                this.f351h = oVar2;
                this.f349f = 2;
                obj = g2.a();
                if (obj == enumC0927a) {
                    return enumC0927a;
                }
                oVar = oVar2;
                oVar.f7959a = ((java.lang.Number) obj).intValue();
                return h1.C0177i.f3302a;
            default:
                l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
                int i3 = this.f349f;
                F.P p3 = this.f350g;
                if (i3 == 0) {
                    a.AbstractC0059a.A(obj);
                    this.f349f = 1;
                    obj = F.P.f(p3, true, this);
                    if (obj == enumC0927a2) {
                        return enumC0927a2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.Object obj4 = this.f351h;
                            a.AbstractC0059a.A(obj);
                            return obj4;
                        }
                        c0004d = (F.C0004d) this.f351h;
                        a.AbstractC0059a.A(obj);
                        obj2 = c0004d.f432b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == c0004d.f433c) {
                            throw new java.lang.IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!kotlin.jvm.internal.i.a(c0004d.f432b, obj)) {
                            this.f351h = obj;
                            this.f349f = 3;
                            if (p3.j(obj, true, this) == enumC0927a2) {
                                return enumC0927a2;
                            }
                        }
                        return obj;
                    }
                    a.AbstractC0059a.A(obj);
                }
                c0004d = (F.C0004d) obj;
                F.J j2 = new F.J((m1.AbstractC0935f) this.f353j, c0004d, null);
                this.f351h = c0004d;
                this.f349f = 2;
                obj = z1.AbstractC1068v.n((k1.i) this.f352i, j2, this);
                if (obj == enumC0927a2) {
                    return enumC0927a2;
                }
                obj2 = c0004d.f432b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0004d.f433c) {
                }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [m1.f, s1.p] */
    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        k1.d dVar = (k1.d) obj;
        switch (this.f348e) {
            case 0:
                return new F.H((kotlin.jvm.internal.p) this.f352i, this.f350g, (kotlin.jvm.internal.o) this.f353j, dVar).g(h1.C0177i.f3302a);
            default:
                return new F.H(this.f350g, (k1.i) this.f352i, (s1.p) this.f353j, dVar).g(h1.C0177i.f3302a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(kotlin.jvm.internal.p pVar, F.P p2, kotlin.jvm.internal.o oVar, k1.d dVar) {
        super(1, dVar);
        this.f352i = pVar;
        this.f350g = p2;
        this.f353j = oVar;
    }
}
