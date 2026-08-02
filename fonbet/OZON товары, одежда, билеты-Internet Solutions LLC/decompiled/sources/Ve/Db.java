package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Db extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4297hc f28850e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Db(C4297hc c4297hc, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28850e = c4297hc;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Db(this.f28850e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Db(this.f28850e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28849d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4258g2 c4258g2 = this.f28850e.f31182e;
            if (c4258g2 != null) {
                this.f28849d = 1;
                ?? r42 = c4258g2.f31072a;
                if (r42 != 0) {
                    obj = r42.invoke(this);
                    if (obj != aVar) {
                        obj = Unit.f71690a;
                    }
                } else {
                    obj = null;
                }
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Sc.s.b(obj);
        return Unit.f71690a;
    }
}
