package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Tk extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Mq f30062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Mq f30065h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tk(Mq mq, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, Mq mq2) {
        super(2, dVar);
        this.f30062e = mq;
        this.f30063f = bVar;
        this.f30064g = c2406m0;
        this.f30065h = mq2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Tk(this.f30062e, this.f30063f, this.f30064g, dVar, this.f30065h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Tk) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30061d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4811za c4811za = new C4811za(this.f30064g, (kotlin.coroutines.d) null, this.f30065h);
            this.f30061d = 1;
            if (C5412d0.b(this.f30062e, this.f30063f, c4811za, this) == aVar) {
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
