package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Am extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1 f28632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f28633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f28634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1 f28635h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Am(C1 c12, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C1 c13) {
        super(2, dVar);
        this.f28632e = c12;
        this.f28633f = bVar;
        this.f28634g = c2406m0;
        this.f28635h = c13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Am(this.f28632e, this.f28633f, this.f28634g, dVar, this.f28635h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Am) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28631d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4134bm c4134bm = new C4134bm(this.f28634g, null, this.f28635h);
            this.f28631d = 1;
            if (C5412d0.b(this.f28632e, this.f28633f, c4134bm, this) == aVar) {
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
