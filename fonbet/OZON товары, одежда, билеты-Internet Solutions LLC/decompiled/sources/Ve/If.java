package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class If extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4592rj f29229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29231g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4592rj f29232h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public If(C4592rj c4592rj, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4592rj c4592rj2) {
        super(2, dVar);
        this.f29229e = c4592rj;
        this.f29230f = bVar;
        this.f29231g = c2406m0;
        this.f29232h = c4592rj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new If(this.f29229e, this.f29230f, this.f29231g, dVar, this.f29232h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((If) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29228d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4142c1 c4142c1 = new C4142c1(this.f29231g, null, this.f29232h, 2);
            this.f29228d = 1;
            if (C5412d0.b(this.f29229e, this.f29230f, c4142c1, this) == aVar) {
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
