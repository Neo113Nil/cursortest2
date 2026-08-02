package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Zk extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1 f30605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1 f30608h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zk(C1 c12, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C1 c13) {
        super(2, dVar);
        this.f30605e = c12;
        this.f30606f = bVar;
        this.f30607g = c2406m0;
        this.f30608h = c13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Zk(this.f30605e, this.f30606f, this.f30607g, dVar, this.f30608h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Zk) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30604d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4737wk c4737wk = new C4737wk(this.f30607g, null, this.f30608h);
            this.f30604d = 1;
            if (C5412d0.b(this.f30605e, this.f30606f, c4737wk, this) == aVar) {
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
