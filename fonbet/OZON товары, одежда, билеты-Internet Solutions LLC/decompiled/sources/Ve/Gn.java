package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Gn extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Lo f29090f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gn(C2406m0 c2406m0, kotlin.coroutines.d dVar, Lo lo) {
        super(2, dVar);
        this.f29089e = c2406m0;
        this.f29090f = lo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Gn(this.f29089e, dVar, this.f29090f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Gn(this.f29089e, (kotlin.coroutines.d) obj2, this.f29090f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29088d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Nd nd2 = new Nd(this.f29090f, 1);
            this.f29088d = 1;
            if (this.f29089e.collect(nd2, this) == aVar) {
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
