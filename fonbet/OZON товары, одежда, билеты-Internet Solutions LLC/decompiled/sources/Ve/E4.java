package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class E4 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28901d;

    /* renamed from: e, reason: collision with root package name */
    public int f28902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f28903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f28904g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E4(C2406m0 c2406m0, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f28901d = i11;
        this.f28903f = c2406m0;
        this.f28904g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f28901d) {
            case 0:
                return new E4(this.f28903f, dVar, (Co) this.f28904g, 0);
            case 1:
                return new E4(this.f28903f, dVar, (Pm) this.f28904g, 1);
            default:
                return new E4(this.f28903f, dVar, (J4) this.f28904g, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f28901d) {
            case 0:
                return new E4(this.f28903f, dVar, (Co) this.f28904g, 0).invokeSuspend(Unit.f71690a);
            case 1:
                return new E4(this.f28903f, dVar, (Pm) this.f28904g, 1).invokeSuspend(Unit.f71690a);
            default:
                return new E4(this.f28903f, dVar, (J4) this.f28904g, 2).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f28901d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f28902e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Z3 z32 = new Z3((Co) this.f28904g, 0);
                    this.f28902e = 1;
                    if (this.f28903f.collect(z32, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            case 1:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f28902e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    Z3 z33 = new Z3((Pm) this.f28904g, 1);
                    this.f28902e = 1;
                    if (this.f28903f.collect(z33, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                int i13 = this.f28902e;
                if (i13 == 0) {
                    Sc.s.b(obj);
                    Z3 z34 = new Z3((J4) this.f28904g, 2);
                    this.f28902e = 1;
                    if (this.f28903f.collect(z34, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }
}
