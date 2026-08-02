package Ve;

import Ae.C2406m0;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class T0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4378k7 f30002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f30003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4378k7 c4378k7, Context context) {
        super(2, dVar);
        this.f30001e = c2406m0;
        this.f30002f = c4378k7;
        this.f30003g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new T0(this.f30001e, dVar, this.f30002f, this.f30003g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T0) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30000d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4429m0 c4429m0 = new C4429m0(this.f30002f, this.f30003g);
            this.f30000d = 1;
            if (this.f30001e.collect(c4429m0, this) == aVar) {
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
