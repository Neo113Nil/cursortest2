package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.ph, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4533ph extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H2 f31797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4192dm f31798g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4533ph(C2406m0 c2406m0, kotlin.coroutines.d dVar, H2 h22, C4192dm c4192dm) {
        super(2, dVar);
        this.f31796e = c2406m0;
        this.f31797f = h22;
        this.f31798g = c4192dm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4533ph(this.f31796e, dVar, this.f31797f, this.f31798g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4533ph) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31795d;
        if (i11 == 0) {
            Sc.s.b(obj);
            X6 x62 = new X6(1, this.f31797f, this.f31798g);
            this.f31795d = 1;
            if (this.f31796e.collect(x62, this) == aVar) {
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
