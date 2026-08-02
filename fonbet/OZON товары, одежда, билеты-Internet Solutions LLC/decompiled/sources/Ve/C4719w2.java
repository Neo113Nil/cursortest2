package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.w2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4719w2 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f32335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S0 f32336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4719w2(Ae.M0 m02, kotlin.coroutines.d dVar, S0 s02) {
        super(2, dVar);
        this.f32335e = m02;
        this.f32336f = s02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4719w2(this.f32335e, dVar, this.f32336f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4719w2(this.f32335e, (kotlin.coroutines.d) obj2, this.f32336f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32334d;
        if (i11 == 0) {
            Sc.s.b(obj);
            S1 s12 = new S1(this.f32336f);
            this.f32334d = 1;
            if (this.f32335e.collect(s12, this) == aVar) {
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
