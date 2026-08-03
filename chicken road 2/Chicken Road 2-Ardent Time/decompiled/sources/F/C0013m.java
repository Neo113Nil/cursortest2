package F;

/* renamed from: F.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013m extends m1.AbstractC0935f implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.Serializable f489f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f490g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f491h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Iterator f492i;

    /* renamed from: j, reason: collision with root package name */
    public int f493j;

    /* renamed from: k, reason: collision with root package name */
    public int f494k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F.P f495l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F.C0014n f496m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013m(F.P p2, F.C0014n c0014n, k1.d dVar) {
        super(1, dVar);
        this.f495l = p2;
        this.f496m = c0014n;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // m1.AbstractC0931b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g(java.lang.Object obj) {
        H1.a a2;
        kotlin.jvm.internal.n nVar;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.p pVar2;
        java.util.Iterator it;
        H1.a aVar;
        kotlin.jvm.internal.n nVar2;
        kotlin.jvm.internal.p pVar3;
        F.C0012l c0012l;
        H1.d dVar;
        kotlin.jvm.internal.p pVar4;
        kotlin.jvm.internal.n nVar3;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Integer a3;
        int i2;
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i3 = this.f494k;
        F.C0014n c0014n = this.f496m;
        F.P p2 = this.f495l;
        if (i3 == 0) {
            a.AbstractC0059a.A(obj);
            a2 = H1.e.a();
            nVar = new kotlin.jvm.internal.n();
            pVar = new kotlin.jvm.internal.p();
            this.f488e = a2;
            this.f489f = nVar;
            this.f490g = pVar;
            this.f491h = pVar;
            this.f494k = 1;
            obj = F.P.f(p2, true, this);
            if (obj == enumC0927a) {
                return enumC0927a;
            }
            pVar2 = pVar;
        } else if (i3 == 1) {
            pVar = (kotlin.jvm.internal.p) this.f491h;
            pVar2 = (kotlin.jvm.internal.p) this.f490g;
            nVar = (kotlin.jvm.internal.n) this.f489f;
            a2 = (H1.a) this.f488e;
            a.AbstractC0059a.A(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f493j;
                    obj3 = this.f488e;
                    a.AbstractC0059a.A(obj);
                    return new F.C0004d(i2, ((java.lang.Number) obj).intValue(), obj3);
                }
                java.lang.Object obj4 = (H1.a) this.f490g;
                pVar4 = (kotlin.jvm.internal.p) this.f489f;
                nVar3 = (kotlin.jvm.internal.n) this.f488e;
                a.AbstractC0059a.A(obj);
                obj2 = obj4;
                try {
                    nVar3.f7958a = true;
                    ((H1.d) obj2).e(null);
                    obj3 = pVar4.f7960a;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    F.j0 g2 = p2.g();
                    this.f488e = obj3;
                    this.f489f = null;
                    this.f490g = null;
                    this.f493j = hashCode;
                    this.f494k = 4;
                    a3 = g2.a();
                    if (a3 != enumC0927a) {
                        return enumC0927a;
                    }
                    i2 = hashCode;
                    obj = a3;
                    return new F.C0004d(i2, ((java.lang.Number) obj).intValue(), obj3);
                } catch (java.lang.Throwable th) {
                    ((H1.d) obj2).e(null);
                    throw th;
                }
            }
            it = this.f492i;
            c0012l = (F.C0012l) this.f491h;
            pVar3 = (kotlin.jvm.internal.p) this.f490g;
            nVar2 = (kotlin.jvm.internal.n) this.f489f;
            aVar = (H1.a) this.f488e;
            a.AbstractC0059a.A(obj);
            while (it.hasNext()) {
                s1.p pVar5 = (s1.p) it.next();
                this.f488e = aVar;
                this.f489f = nVar2;
                this.f490g = pVar3;
                this.f491h = c0012l;
                this.f492i = it;
                this.f494k = 2;
                if (pVar5.invoke(c0012l, this) == enumC0927a) {
                    return enumC0927a;
                }
            }
            pVar2 = pVar3;
            nVar = nVar2;
            a2 = aVar;
            c0014n.f500c = null;
            this.f488e = nVar;
            this.f489f = pVar2;
            this.f490g = a2;
            this.f491h = null;
            this.f492i = null;
            this.f494k = 3;
            dVar = (H1.d) a2;
            if (dVar.c(this) != enumC0927a) {
                return enumC0927a;
            }
            pVar4 = pVar2;
            nVar3 = nVar;
            obj2 = dVar;
            nVar3.f7958a = true;
            ((H1.d) obj2).e(null);
            obj3 = pVar4.f7960a;
            if (obj3 == null) {
            }
            F.j0 g22 = p2.g();
            this.f488e = obj3;
            this.f489f = null;
            this.f490g = null;
            this.f493j = hashCode;
            this.f494k = 4;
            a3 = g22.a();
            if (a3 != enumC0927a) {
            }
        }
        pVar.f7960a = ((F.C0004d) obj).f432b;
        F.C0012l c0012l2 = new F.C0012l(a2, nVar, pVar2, p2);
        java.util.List list = (java.util.List) c0014n.f500c;
        if (list != null) {
            it = list.iterator();
            aVar = a2;
            nVar2 = nVar;
            pVar3 = pVar2;
            c0012l = c0012l2;
            while (it.hasNext()) {
            }
            pVar2 = pVar3;
            nVar = nVar2;
            a2 = aVar;
        }
        c0014n.f500c = null;
        this.f488e = nVar;
        this.f489f = pVar2;
        this.f490g = a2;
        this.f491h = null;
        this.f492i = null;
        this.f494k = 3;
        dVar = (H1.d) a2;
        if (dVar.c(this) != enumC0927a) {
        }
    }

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new F.C0013m(this.f495l, this.f496m, (k1.d) obj).g(h1.C0177i.f3302a);
    }
}
