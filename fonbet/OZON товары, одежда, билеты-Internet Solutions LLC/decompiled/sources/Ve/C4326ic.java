package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.ic, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4326ic extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4817zg f31282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.x0 f31284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4817zg f31285h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4326ic(C4817zg c4817zg, AbstractC5434v.b bVar, Ae.x0 x0Var, kotlin.coroutines.d dVar, C4817zg c4817zg2) {
        super(2, dVar);
        this.f31282e = c4817zg;
        this.f31283f = bVar;
        this.f31284g = x0Var;
        this.f31285h = c4817zg2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4326ic(this.f31282e, this.f31283f, this.f31284g, dVar, this.f31285h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4326ic) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31281d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4342j0 c4342j0 = new C4342j0(this.f31284g, (kotlin.coroutines.d) null, this.f31285h);
            this.f31281d = 1;
            if (C5412d0.b(this.f31282e, this.f31283f, c4342j0, this) == aVar) {
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
