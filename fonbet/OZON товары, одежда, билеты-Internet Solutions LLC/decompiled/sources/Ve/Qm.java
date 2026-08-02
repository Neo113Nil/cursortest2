package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Qm extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4699va f29800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f29802g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S0 f29803h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qm(C4699va c4699va, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, S0 s02) {
        super(2, dVar);
        this.f29800e = c4699va;
        this.f29801f = bVar;
        this.f29802g = m02;
        this.f29803h = s02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Qm(this.f29800e, this.f29801f, this.f29802g, dVar, this.f29803h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Qm) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29799d;
        if (i11 == 0) {
            Sc.s.b(obj);
            B3 b32 = new B3(this.f29802g, null, this.f29803h, 1);
            this.f29799d = 1;
            if (C5412d0.b(this.f29800e, this.f29801f, b32, this) == aVar) {
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
