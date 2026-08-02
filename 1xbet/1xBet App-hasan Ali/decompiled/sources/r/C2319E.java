package r;

import b4.EnumC0510a;
import c4.AbstractC0547h;

/* renamed from: r.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2319E extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public V.c f18918l;

    /* renamed from: m, reason: collision with root package name */
    public C2320F f18919m;

    /* renamed from: n, reason: collision with root package name */
    public long[] f18920n;

    /* renamed from: o, reason: collision with root package name */
    public int f18921o;

    /* renamed from: p, reason: collision with root package name */
    public int f18922p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f18923q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2320F f18924r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ V.c f18925s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2319E(C2320F c2320f, V.c cVar, a4.c cVar2) {
        super(cVar2);
        this.f18924r = c2320f;
        this.f18925s = cVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2319E c2319e = new C2319E(this.f18924r, this.f18925s, cVar);
        c2319e.f18923q = obj;
        return c2319e;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2319E) create((n4.h) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        n4.h hVar;
        C2320F c2320f;
        long[] jArr;
        int i;
        V.c cVar;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i5 = this.f18922p;
        if (i5 == 0) {
            G4.l.N(obj);
            hVar = (n4.h) this.f18923q;
            c2320f = this.f18924r;
            C2318D c2318d = c2320f.f18927l;
            jArr = c2318d.f18913c;
            i = c2318d.f18915e;
            cVar = this.f18925s;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f18921o;
            jArr = this.f18920n;
            c2320f = this.f18919m;
            cVar = this.f18918l;
            hVar = (n4.h) this.f18923q;
            G4.l.N(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return W3.o.f6046a;
        }
        int i6 = (int) ((jArr[i] >> 31) & 2147483647L);
        cVar.f5923m = i;
        Object obj2 = c2320f.f18927l.f18912b[i];
        this.f18923q = hVar;
        this.f18918l = cVar;
        this.f18919m = c2320f;
        this.f18920n = jArr;
        this.f18921o = i6;
        this.f18922p = 1;
        hVar.c(obj2, this);
        return enumC0510a;
    }
}
