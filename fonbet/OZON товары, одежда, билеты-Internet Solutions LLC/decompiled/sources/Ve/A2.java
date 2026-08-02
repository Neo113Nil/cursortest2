package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class A2 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28571d;

    /* renamed from: e, reason: collision with root package name */
    public int f28572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A2(Object obj, kotlin.coroutines.d dVar, int i11) {
        super(2, dVar);
        this.f28571d = i11;
        this.f28573f = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f28571d) {
            case 0:
                return new A2((H3) this.f28573f, dVar, 0);
            default:
                return new A2((A7) this.f28573f, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f28571d) {
            case 0:
                return new A2((H3) this.f28573f, dVar, 0).invokeSuspend(Unit.f71690a);
            default:
                return new A2((A7) this.f28573f, dVar, 1).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f28571d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f28572e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f28572e = 1;
                    if (xe.Y.b(2000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                ((R4) ((H3) this.f28573f).u()).e0(new C4826zp());
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f28572e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    C4258g2 c4258g2 = ((A7) this.f28573f).f28586e;
                    if (c4258g2 != null) {
                        this.f28572e = 1;
                        ?? r42 = c4258g2.f31072a;
                        if (r42 != 0) {
                            obj = r42.invoke(this);
                            if (obj != aVar2) {
                                obj = Unit.f71690a;
                            }
                        } else {
                            obj = null;
                        }
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    return Unit.f71690a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
        }
    }
}
