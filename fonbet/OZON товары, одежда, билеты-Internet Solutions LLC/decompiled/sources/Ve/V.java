package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class V extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J4 f30168f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C2406m0 c2406m0, kotlin.coroutines.d dVar, J4 j42) {
        super(2, dVar);
        this.f30167e = c2406m0;
        this.f30168f = j42;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new V(this.f30167e, dVar, this.f30168f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new V(this.f30167e, (kotlin.coroutines.d) obj2, this.f30168f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30166d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4457n c4457n = new C4457n(this.f30168f);
            this.f30166d = 1;
            if (this.f30167e.collect(c4457n, this) == aVar) {
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
