package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.uh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4677uh extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uh f32216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f32217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32218g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Uh f32219h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4677uh(Uh uh2, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, Uh uh3) {
        super(2, dVar);
        this.f32216e = uh2;
        this.f32217f = bVar;
        this.f32218g = c2406m0;
        this.f32219h = uh3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4677uh(this.f32216e, this.f32217f, this.f32218g, dVar, this.f32219h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4677uh) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32215d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4530pe c4530pe = new C4530pe(this.f32218g, null, this.f32219h, 1);
            this.f32215d = 1;
            if (C5412d0.b(this.f32216e, this.f32217f, c4530pe, this) == aVar) {
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
