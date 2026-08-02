package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Ch extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f28769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D f28770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Hk f28771g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ch(C2406m0 c2406m0, kotlin.coroutines.d dVar, D d11, Hk hk) {
        super(2, dVar);
        this.f28769e = c2406m0;
        this.f28770f = d11;
        this.f28771g = hk;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Ch(this.f28769e, dVar, this.f28770f, this.f28771g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ch) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28768d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Tb tb2 = new Tb(1, this.f28770f, this.f28771g);
            this.f28768d = 1;
            if (this.f28769e.collect(tb2, this) == aVar) {
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
