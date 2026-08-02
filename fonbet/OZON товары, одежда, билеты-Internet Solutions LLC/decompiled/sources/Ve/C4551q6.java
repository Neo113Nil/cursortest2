package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.q6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4551q6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4667u7 f31845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4551q6(C4667u7 c4667u7, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31845e = c4667u7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4551q6(this.f31845e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4551q6(this.f31845e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31844d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f31844d = 1;
            if (this.f31845e.e0(this) == aVar) {
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
