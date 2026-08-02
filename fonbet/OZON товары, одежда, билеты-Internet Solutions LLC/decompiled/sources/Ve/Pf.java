package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Pf extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4474ng f29713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4474ng f29716h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pf(C4474ng c4474ng, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4474ng c4474ng2) {
        super(2, dVar);
        this.f29713e = c4474ng;
        this.f29714f = bVar;
        this.f29715g = c2406m0;
        this.f29716h = c4474ng2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Pf(this.f29713e, this.f29714f, this.f29715g, dVar, this.f29716h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Pf) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29712d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4560qf c4560qf = new C4560qf(this.f29715g, null, this.f29716h);
            this.f29712d = 1;
            if (C5412d0.b(this.f29713e, this.f29714f, c4560qf, this) == aVar) {
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
