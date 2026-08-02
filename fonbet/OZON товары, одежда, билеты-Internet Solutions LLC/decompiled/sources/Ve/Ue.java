package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Ue extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pm f30122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f30124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f30125h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ue(Pm pm, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, C4400l0 c4400l0) {
        super(2, dVar);
        this.f30122e = pm;
        this.f30123f = bVar;
        this.f30124g = m02;
        this.f30125h = c4400l0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Ue(this.f30122e, this.f30123f, this.f30124g, dVar, this.f30125h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ue) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30121d;
        if (i11 == 0) {
            Sc.s.b(obj);
            F2 f22 = new F2(this.f30124g, null, this.f30125h);
            this.f30121d = 1;
            if (C5412d0.b(this.f30122e, this.f30123f, f22, this) == aVar) {
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
