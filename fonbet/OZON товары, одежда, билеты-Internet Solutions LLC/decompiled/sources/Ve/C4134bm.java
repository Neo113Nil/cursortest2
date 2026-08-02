package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.bm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4134bm extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1 f30741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4134bm(C2406m0 c2406m0, kotlin.coroutines.d dVar, C1 c12) {
        super(2, dVar);
        this.f30740e = c2406m0;
        this.f30741f = c12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4134bm(this.f30740e, dVar, this.f30741f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4134bm(this.f30740e, (kotlin.coroutines.d) obj2, this.f30741f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30739d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4160cj c4160cj = new C4160cj(this.f30741f, 1);
            this.f30739d = 1;
            if (this.f30740e.collect(c4160cj, this) == aVar) {
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
