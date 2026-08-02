package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Qh extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4192dm f29785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H2 f29788h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C4192dm f29789i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qh(C4192dm c4192dm, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, H2 h22, C4192dm c4192dm2) {
        super(2, dVar);
        this.f29785e = c4192dm;
        this.f29786f = bVar;
        this.f29787g = c2406m0;
        this.f29788h = h22;
        this.f29789i = c4192dm2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Qh(this.f29785e, this.f29786f, this.f29787g, dVar, this.f29788h, this.f29789i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Qh) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29784d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4533ph c4533ph = new C4533ph(this.f29787g, null, this.f29788h, this.f29789i);
            this.f29784d = 1;
            if (C5412d0.b(this.f29785e, this.f29786f, c4533ph, this) == aVar) {
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
