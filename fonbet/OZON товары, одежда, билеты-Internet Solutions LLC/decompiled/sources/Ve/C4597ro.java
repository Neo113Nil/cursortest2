package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.ro, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4597ro extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f31986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S0 f31987f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4597ro(Ae.M0 m02, kotlin.coroutines.d dVar, S0 s02) {
        super(2, dVar);
        this.f31986e = m02;
        this.f31987f = s02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4597ro(this.f31986e, dVar, this.f31987f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4597ro(this.f31986e, (kotlin.coroutines.d) obj2, this.f31987f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31985d;
        if (i11 == 0) {
            Sc.s.b(obj);
            L0 l02 = new L0(this.f31987f, 4);
            this.f31985d = 1;
            if (this.f31986e.collect(l02, this) == aVar) {
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
