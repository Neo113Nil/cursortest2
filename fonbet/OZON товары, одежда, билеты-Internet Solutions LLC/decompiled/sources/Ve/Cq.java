package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Cq extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4283gr f28789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f28790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f28791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4283gr f28792h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cq(C4283gr c4283gr, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, C4283gr c4283gr2) {
        super(2, dVar);
        this.f28789e = c4283gr;
        this.f28790f = bVar;
        this.f28791g = m02;
        this.f28792h = c4283gr2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Cq(this.f28789e, this.f28790f, this.f28791g, dVar, this.f28792h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Cq) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28788d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4546q1 c4546q1 = new C4546q1(this.f28791g, null, this.f28792h, 2);
            this.f28788d = 1;
            if (C5412d0.b(this.f28789e, this.f28790f, c4546q1, this) == aVar) {
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
