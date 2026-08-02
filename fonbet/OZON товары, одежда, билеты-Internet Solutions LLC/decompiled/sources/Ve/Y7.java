package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Y7 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4796yn f30442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y7(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4796yn c4796yn) {
        super(2, dVar);
        this.f30441e = c2406m0;
        this.f30442f = c4796yn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Y7(this.f30441e, dVar, this.f30442f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Y7(this.f30441e, (kotlin.coroutines.d) obj2, this.f30442f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30440d;
        if (i11 == 0) {
            Sc.s.b(obj);
            L0 l02 = new L0(this.f30442f, 2);
            this.f30440d = 1;
            if (this.f30441e.collect(l02, this) == aVar) {
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
