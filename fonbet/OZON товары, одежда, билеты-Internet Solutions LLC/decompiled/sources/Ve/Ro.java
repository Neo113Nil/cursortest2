package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Ro extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4699va f29870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f29872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S0 f29873h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ro(C4699va c4699va, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, S0 s02) {
        super(2, dVar);
        this.f29870e = c4699va;
        this.f29871f = bVar;
        this.f29872g = m02;
        this.f29873h = s02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Ro(this.f29870e, this.f29871f, this.f29872g, dVar, this.f29873h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ro) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29869d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4597ro c4597ro = new C4597ro(this.f29872g, null, this.f29873h);
            this.f29869d = 1;
            if (C5412d0.b(this.f29870e, this.f29871f, c4597ro, this) == aVar) {
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
