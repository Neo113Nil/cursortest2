package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.a3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4086a3 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4699va f30626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f30628g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S0 f30629h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4086a3(C4699va c4699va, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, S0 s02) {
        super(2, dVar);
        this.f30626e = c4699va;
        this.f30627f = bVar;
        this.f30628g = m02;
        this.f30629h = s02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4086a3(this.f30626e, this.f30627f, this.f30628g, dVar, this.f30629h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4086a3) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30625d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4719w2 c4719w2 = new C4719w2(this.f30628g, null, this.f30629h);
            this.f30625d = 1;
            if (C5412d0.b(this.f30626e, this.f30627f, c4719w2, this) == aVar) {
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
