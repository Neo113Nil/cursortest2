package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;

/* loaded from: classes10.dex */
public final class Ud extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4744x f30120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ud(C4744x c4744x, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30120e = c4744x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Ud(this.f30120e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ud(this.f30120e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30119d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4744x c4744x = this.f30120e;
            C4150c9 c4150c9 = c4744x.f32397B;
            E9 e92 = new E9(((C4654tn) c4744x.f32413b).k());
            this.f30119d = 1;
            C10720e0 c10720e0 = C10720e0.f105451a;
            if (c4150c9.f(e92, He.b.f10879b, this) == aVar) {
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
