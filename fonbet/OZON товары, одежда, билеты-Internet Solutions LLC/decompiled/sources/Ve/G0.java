package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class G0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29050d;

    /* renamed from: e, reason: collision with root package name */
    public int f29051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29052f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f29053g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G0(C2406m0 c2406m0, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f29050d = i11;
        this.f29052f = c2406m0;
        this.f29053g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f29050d) {
            case 0:
                return new G0(this.f29052f, dVar, (S0) this.f29053g, 0);
            default:
                return new G0(this.f29052f, dVar, (C4817zg) this.f29053g, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f29050d) {
            case 0:
                return new G0(this.f29052f, dVar, (S0) this.f29053g, 0).invokeSuspend(Unit.f71690a);
            default:
                return new G0(this.f29052f, dVar, (C4817zg) this.f29053g, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29050d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f29051e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Z z11 = new Z((S0) this.f29053g, 0);
                    this.f29051e = 1;
                    if (this.f29052f.collect(z11, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f29051e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    I4 i42 = new I4((C4817zg) this.f29053g, 1);
                    this.f29051e = 1;
                    if (this.f29052f.collect(i42, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }
}
