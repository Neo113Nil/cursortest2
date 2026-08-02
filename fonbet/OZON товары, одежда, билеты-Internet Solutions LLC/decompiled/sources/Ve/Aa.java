package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Aa extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4152cb f28594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Aa(C4152cb c4152cb, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28594e = c4152cb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Aa(this.f28594e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Aa(this.f28594e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28593d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4152cb c4152cb = this.f28594e;
            this.f28593d = 1;
            C4613sb c4613sb = c4152cb.f30792e;
            c4613sb.getClass();
            if (((C4613sb) c4613sb.create(this)).invokeSuspend(Unit.f71690a) == aVar) {
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
