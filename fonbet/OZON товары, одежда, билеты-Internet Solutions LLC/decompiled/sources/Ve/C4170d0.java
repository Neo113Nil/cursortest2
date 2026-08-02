package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.d0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4170d0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H3 f30840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.x0 f30842g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H3 f30843h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4170d0(H3 h32, AbstractC5434v.b bVar, Ae.x0 x0Var, kotlin.coroutines.d dVar, H3 h33) {
        super(2, dVar);
        this.f30840e = h32;
        this.f30841f = bVar;
        this.f30842g = x0Var;
        this.f30843h = h33;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4170d0(this.f30840e, this.f30841f, this.f30842g, dVar, this.f30843h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4170d0) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30839d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4688v c4688v = new C4688v(this.f30842g, null, this.f30843h, 0);
            this.f30839d = 1;
            if (C5412d0.b(this.f30840e, this.f30841f, c4688v, this) == aVar) {
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
