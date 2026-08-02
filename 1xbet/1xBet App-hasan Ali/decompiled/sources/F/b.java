package F;

import G4.l;
import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import t0.v;
import v.r;

/* loaded from: classes.dex */
public final class b extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1508k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f1510m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, a4.c cVar) {
        super(2, cVar);
        this.f1510m = dVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        b bVar = new b(this.f1510m, cVar);
        bVar.f1509l = obj;
        return bVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((v) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1508k;
        if (i == 0) {
            l.N(obj);
            v vVar = (v) this.f1509l;
            a aVar = new a(this.f1510m, null);
            this.f1508k = 1;
            if (r.b(vVar, aVar, this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
        }
        return o.f6046a;
    }
}
