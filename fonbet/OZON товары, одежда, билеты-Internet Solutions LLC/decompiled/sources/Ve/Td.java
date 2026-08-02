package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Td extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4817zg f30036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f30038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4817zg f30039h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Td(C4817zg c4817zg, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, C4817zg c4817zg2) {
        super(2, dVar);
        this.f30036e = c4817zg;
        this.f30037f = bVar;
        this.f30038g = m02;
        this.f30039h = c4817zg2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Td(this.f30036e, this.f30037f, this.f30038g, dVar, this.f30039h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Td) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30035d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4529pd c4529pd = new C4529pd(this.f30038g, null, this.f30039h, 0);
            this.f30035d = 1;
            if (C5412d0.b(this.f30036e, this.f30037f, c4529pd, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
