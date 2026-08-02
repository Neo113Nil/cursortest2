package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class I1 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4460n2 f29200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29202g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Zn f29203h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(C4460n2 c4460n2, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, Zn zn) {
        super(2, dVar);
        this.f29200e = c4460n2;
        this.f29201f = bVar;
        this.f29202g = c2406m0;
        this.f29203h = zn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new I1(this.f29200e, this.f29201f, this.f29202g, dVar, this.f29203h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((I1) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29199d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4142c1 c4142c1 = new C4142c1(this.f29202g, null, this.f29203h, 0);
            this.f29199d = 1;
            if (C5412d0.b(this.f29200e, this.f29201f, c4142c1, this) == aVar) {
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
