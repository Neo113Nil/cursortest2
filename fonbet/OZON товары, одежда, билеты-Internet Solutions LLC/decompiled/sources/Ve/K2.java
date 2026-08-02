package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;
import spay.sdk.domain.model.AuthMethod;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.response.ErrorEntity;
import xe.C10720e0;

/* loaded from: classes10.dex */
public final class K2 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29329d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f29330e;

    /* renamed from: f, reason: collision with root package name */
    public Object f29331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f29332g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(C2406m0 c2406m0, kotlin.coroutines.d dVar, S7 s72) {
        super(2, dVar);
        this.f29331f = c2406m0;
        this.f29332g = s72;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f29329d) {
            case 0:
                return new K2((C2406m0) this.f29331f, dVar, (S7) this.f29332g);
            case 1:
                return new K2((RedirectActivity) this.f29332g, dVar);
            default:
                return new K2((Z2) this.f29331f, (Mf) this.f29332g, dVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f29329d) {
            case 0:
                return new K2((C2406m0) this.f29331f, dVar, (S7) this.f29332g).invokeSuspend(Unit.f71690a);
            case 1:
                return new K2((RedirectActivity) this.f29332g, dVar).invokeSuspend(Unit.f71690a);
            default:
                return new K2((Z2) this.f29331f, (Mf) this.f29332g, dVar).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC4801z0 reason;
        C4744x c4744x;
        Object obj2 = this.f29332g;
        switch (this.f29329d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f29330e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Z z11 = new Z((S7) obj2, 1);
                    this.f29330e = 1;
                    if (((C2406m0) this.f29331f).collect(z11, this) == aVar) {
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
                int i12 = this.f29330e;
                RedirectActivity redirectActivity = (RedirectActivity) obj2;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    this.f29330e = 1;
                    if (xe.Y.b(500L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        reason = (EnumC4801z0) this.f29331f;
                        Sc.s.b(obj);
                        U2 bankAuthResult = (U2) obj;
                        c4744x = redirectActivity.f98833b;
                        if (c4744x != null) {
                            Intrinsics.n("viewModel");
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(bankAuthResult, "bankAuthResult");
                        Intrinsics.checkNotNullParameter(reason, "reason");
                        boolean z12 = bankAuthResult.f30093c;
                        Y9 y92 = c4744x.f32424m;
                        if (z12) {
                            ((C4238fb) y92).b(new Dg(bankAuthResult.f30091a, SdkAuthRequestBody.AuthMethod.SBAPP));
                        } else if ((((C4654tn) c4744x.f32413b).j() instanceof AuthMethod.ByPhoneNumber) && Lf.a.r0(c4744x.f32422k, EnumC4290h5.PHONE_NUMBER_AUTH, null) && Wk.f30290b != 6) {
                            C4661u1 block = new C4661u1(c4744x, 1);
                            Intrinsics.checkNotNullParameter(block, "block");
                            ((C4238fb) y92).b(new C4644td(reason));
                        } else if (reason == EnumC4801z0.f32616b) {
                            ((C4238fb) y92).b(new Oc(Vf.f30201a, false));
                        } else {
                            ((C4238fb) y92).b(new C4085a2(new Sd(ErrorEntity.Unknown.INSTANCE)));
                        }
                        return Unit.f71690a;
                    }
                    Sc.s.b(obj);
                }
                reason = EnumC4801z0.f32615a;
                C4463n5 c4463n5 = redirectActivity.f98834c;
                if (c4463n5 == null) {
                    Intrinsics.n("bankAuthenticator");
                    throw null;
                }
                this.f29331f = reason;
                this.f29330e = 2;
                obj = c4463n5.b(redirectActivity, reason, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                U2 bankAuthResult2 = (U2) obj;
                c4744x = redirectActivity.f98833b;
                if (c4744x != null) {
                }
                break;
            default:
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                int i13 = this.f29330e;
                if (i13 == 0) {
                    Sc.s.b(obj);
                    C4473nf c4473nf = ((Z2) this.f29331f).f30538g;
                    this.f29330e = 1;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    if (c4473nf.f((Mf) obj2, He.b.f10879b, this) == aVar3) {
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
    public K2(Z2 z22, Mf mf2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29331f = z22;
        this.f29332g = mf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(RedirectActivity redirectActivity, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29332g = redirectActivity;
    }
}
