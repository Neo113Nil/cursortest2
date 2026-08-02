package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class K extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4344j2 f29323f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4344j2 c4344j2) {
        super(2, dVar);
        this.f29322e = c2406m0;
        this.f29323f = c4344j2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new K(this.f29322e, dVar, this.f29323f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new K(this.f29322e, (kotlin.coroutines.d) obj2, this.f29323f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29321d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4169d c4169d = new C4169d(this.f29323f, 0);
            this.f29321d = 1;
            if (this.f29322e.collect(c4169d, this) == aVar) {
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
