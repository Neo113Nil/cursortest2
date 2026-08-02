package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Wc extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4192dm f30263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H2 f30266h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wc(C4192dm c4192dm, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, H2 h22) {
        super(2, dVar);
        this.f30263e = c4192dm;
        this.f30264f = bVar;
        this.f30265g = c2406m0;
        this.f30266h = h22;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Wc(this.f30263e, this.f30264f, this.f30265g, dVar, this.f30266h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Wc) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30262d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4142c1 c4142c1 = new C4142c1(this.f30265g, null, this.f30266h, 1);
            this.f30262d = 1;
            if (C5412d0.b(this.f30263e, this.f30264f, c4142c1, this) == aVar) {
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
