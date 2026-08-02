package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class S2 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N5 f29942f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(C2406m0 c2406m0, kotlin.coroutines.d dVar, N5 n52) {
        super(2, dVar);
        this.f29941e = c2406m0;
        this.f29942f = n52;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new S2(this.f29941e, dVar, this.f29942f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new S2(this.f29941e, (kotlin.coroutines.d) obj2, this.f29942f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29940d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4489o2 c4489o2 = new C4489o2(this.f29942f);
            this.f29940d = 1;
            if (this.f29941e.collect(c4489o2, this) == aVar) {
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
