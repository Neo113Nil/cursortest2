package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Af extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4817zg f28604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f28605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f28606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4817zg f28607h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Af(C4817zg c4817zg, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4817zg c4817zg2) {
        super(2, dVar);
        this.f28604e = c4817zg;
        this.f28605f = bVar;
        this.f28606g = c2406m0;
        this.f28607h = c4817zg2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Af(this.f28604e, this.f28605f, this.f28606g, dVar, this.f28607h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Af) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28603d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4098af c4098af = new C4098af(this.f28606g, null, this.f28607h);
            this.f28603d = 1;
            if (C5412d0.b(this.f28604e, this.f28605f, c4098af, this) == aVar) {
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
