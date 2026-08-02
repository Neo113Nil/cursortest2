package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.api.PaymentResult;

/* loaded from: classes10.dex */
public final class F2 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28960d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f28961e;

    /* renamed from: f, reason: collision with root package name */
    public Object f28962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f28963g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(Ae.M0 m02, kotlin.coroutines.d dVar, C4400l0 c4400l0) {
        super(2, dVar);
        this.f28962f = m02;
        this.f28963g = c4400l0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f28960d) {
            case 0:
                return new F2((C4577r4) this.f28963g, dVar);
            default:
                return new F2((Ae.M0) this.f28962f, dVar, (C4400l0) this.f28963g);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f28960d) {
            case 0:
                return new F2((C4577r4) this.f28963g, dVar).invokeSuspend(Unit.f71690a);
            default:
                return new F2((Ae.M0) this.f28962f, dVar, (C4400l0) this.f28963g).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C4427lr c4427lr;
        PaymentResult paymentResult;
        C4427lr c4427lr2;
        E8 e82;
        switch (this.f28960d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f28961e;
                C4577r4 c4577r4 = (C4577r4) this.f28963g;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    c4427lr = Ul.f30137c;
                    if (c4427lr != null) {
                        paymentResult = c4577r4.f31950x;
                        if (paymentResult == null) {
                            this.f28962f = c4427lr;
                            this.f28961e = 1;
                            Object g02 = C4577r4.g0(c4577r4, this);
                            if (g02 == aVar) {
                                return aVar;
                            }
                            c4427lr2 = c4427lr;
                            obj = g02;
                        }
                        c4427lr.invoke(paymentResult);
                    }
                    if (!(((C4673ud) c4577r4.f31931e).a().f29004a instanceof C4362jk)) {
                        ((C4238fb) c4577r4.f31932f).b(C4825zo.f32678a);
                    }
                    e82 = c4577r4.f32097c;
                    if (e82 != null) {
                        e82.invoke();
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4427lr2 = (C4427lr) this.f28962f;
                Sc.s.b(obj);
                paymentResult = (PaymentResult) obj;
                c4427lr = c4427lr2;
                c4427lr.invoke(paymentResult);
                if (!(((C4673ud) c4577r4.f31931e).a().f29004a instanceof C4362jk)) {
                }
                e82 = c4577r4.f32097c;
                if (e82 != null) {
                }
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f28961e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    Nd nd2 = new Nd((C4400l0) this.f28963g, 0);
                    this.f28961e = 1;
                    if (((Ae.M0) this.f28962f).collect(nd2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(C4577r4 c4577r4, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28963g = c4577r4;
    }
}
