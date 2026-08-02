package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import xe.C10720e0;

/* loaded from: classes10.dex */
public final class Li extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29426d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f29427e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f29428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f29429g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Li(Ae.M0 m02, kotlin.coroutines.d dVar, Mq mq) {
        super(2, dVar);
        this.f29428f = m02;
        this.f29429g = mq;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f29426d) {
            case 0:
                return new Li((Ae.M0) this.f29428f, dVar, (Mq) this.f29429g);
            case 1:
                Li li2 = new Li((D1) this.f29429g, dVar);
                li2.f29428f = obj;
                return li2;
            default:
                return new Li((Z2) this.f29428f, (V3) this.f29429g, dVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29426d) {
            case 0:
                return new Li((Ae.M0) this.f29428f, (kotlin.coroutines.d) obj2, (Mq) this.f29429g).invokeSuspend(Unit.f71690a);
            case 1:
                Li li2 = new Li((D1) this.f29429g, (kotlin.coroutines.d) obj2);
                li2.f29428f = (PaymentPlanBnplResponseBody) obj;
                return li2.invokeSuspend(Unit.f71690a);
            default:
                return new Li((Z2) this.f29428f, (V3) this.f29429g, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String offerText;
        Object obj2 = this.f29429g;
        switch (this.f29426d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f29427e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C4389ki c4389ki = new C4389ki((Mq) obj2, 0);
                    this.f29427e = 1;
                    if (((Ae.M0) this.f29428f).collect(c4389ki, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            case 1:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f29427e;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jj jj2 = (Jj) this.f29428f;
                    Sc.s.b(obj);
                    return jj2;
                }
                Sc.s.b(obj);
                PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) this.f29428f;
                Jj p11 = (paymentPlanBnplResponseBody == null || (offerText = paymentPlanBnplResponseBody.getOfferText()) == null) ? null : M1.b.p(offerText);
                if (p11 != null) {
                    C4154cd c4154cd = ((D1) obj2).f28804h;
                    Gd gd2 = new Gd(p11.f29299b);
                    this.f29428f = p11;
                    this.f29427e = 1;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    He.b bVar = He.b.f10879b;
                    c4154cd.getClass();
                    if (c4154cd.t(gd2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return p11;
            default:
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                int i13 = this.f29427e;
                if (i13 == 0) {
                    Sc.s.b(obj);
                    C4605s3 c4605s3 = ((Z2) this.f29428f).f30537f;
                    this.f29427e = 1;
                    C10720e0 c10720e02 = C10720e0.f105451a;
                    if (c4605s3.f((V3) obj2, He.b.f10879b, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Li(D1 d12, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29429g = d12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Li(Z2 z22, V3 v32, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29428f = z22;
        this.f29429g = v32;
    }
}
