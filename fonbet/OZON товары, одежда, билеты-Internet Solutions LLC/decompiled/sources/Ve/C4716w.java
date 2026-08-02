package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.RedirectActivity;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import xe.C10720e0;

/* renamed from: Ve.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4716w extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32328d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f32329e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f32330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32331g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4716w(Ae.M0 m02, kotlin.coroutines.d dVar, RedirectActivity redirectActivity) {
        super(2, dVar);
        this.f32330f = m02;
        this.f32331g = redirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f32328d) {
            case 0:
                return new C4716w((Ae.M0) this.f32330f, dVar, (RedirectActivity) this.f32331g);
            default:
                C4716w c4716w = new C4716w((C4092a9) this.f32331g, dVar);
                c4716w.f32330f = obj;
                return c4716w;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32328d) {
            case 0:
                return new C4716w((Ae.M0) this.f32330f, (kotlin.coroutines.d) obj2, (RedirectActivity) this.f32331g).invokeSuspend(Unit.f71690a);
            default:
                C4716w c4716w = new C4716w((C4092a9) this.f32331g, (kotlin.coroutines.d) obj2);
                c4716w.f32330f = (PaymentPlanBnplResponseBody) obj;
                return c4716w.invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String offerText;
        Object obj2 = this.f32331g;
        switch (this.f32328d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f32329e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C4169d c4169d = new C4169d((RedirectActivity) obj2, 3);
                    this.f32329e = 1;
                    if (((Ae.M0) this.f32330f).collect(c4169d, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f32329e;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jj jj2 = (Jj) this.f32330f;
                    Sc.s.b(obj);
                    return jj2;
                }
                Sc.s.b(obj);
                PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) this.f32330f;
                Jj p11 = (paymentPlanBnplResponseBody == null || (offerText = paymentPlanBnplResponseBody.getOfferText()) == null) ? null : M1.b.p(offerText);
                if (p11 != null) {
                    C4154cd c4154cd = ((C4092a9) obj2).f30648f;
                    Gd gd2 = new Gd(p11.f29299b);
                    this.f32330f = p11;
                    this.f32329e = 1;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    He.b bVar = He.b.f10879b;
                    c4154cd.getClass();
                    if (c4154cd.t(gd2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return p11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4716w(C4092a9 c4092a9, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32331g = c4092a9;
    }
}
