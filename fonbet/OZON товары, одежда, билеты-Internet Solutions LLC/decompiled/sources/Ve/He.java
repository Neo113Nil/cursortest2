package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class He extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4192dm f29152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29154g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4192dm f29155h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public He(C4192dm c4192dm, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4192dm c4192dm2) {
        super(2, dVar);
        this.f29152e = c4192dm;
        this.f29153f = bVar;
        this.f29154g = c2406m0;
        this.f29155h = c4192dm2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new He(this.f29152e, this.f29153f, this.f29154g, dVar, this.f29155h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((He) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29151d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4241fe c4241fe = new C4241fe(this.f29154g, null, this.f29155h, 0);
            this.f29151d = 1;
            if (C5412d0.b(this.f29152e, this.f29153f, c4241fe, this) == aVar) {
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
