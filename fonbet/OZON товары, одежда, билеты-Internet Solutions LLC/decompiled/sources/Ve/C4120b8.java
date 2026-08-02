package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;
import spay.sdk.api.MerchantError;
import spay.sdk.api.PaymentResult;

/* renamed from: Ve.b8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4120b8 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public C4427lr f30717d;

    /* renamed from: e, reason: collision with root package name */
    public int f30718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC4497oa f30719f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4120b8(AbstractC4497oa abstractC4497oa, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30719f = abstractC4497oa;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4120b8(this.f30719f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4120b8(this.f30719f, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C4427lr c4427lr;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30718e;
        AbstractC4497oa abstractC4497oa = this.f30719f;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4427lr c4427lr2 = Ul.f30137c;
            if (c4427lr2 != null) {
                InterfaceC4436m7 interfaceC4436m7 = abstractC4497oa.f31718e;
                if (interfaceC4436m7 == null) {
                    Intrinsics.n("userIdManager");
                    throw null;
                }
                this.f30717d = c4427lr2;
                this.f30718e = 1;
                Object b11 = ((C4180da) interfaceC4436m7).b(this);
                if (b11 == aVar) {
                    return aVar;
                }
                c4427lr = c4427lr2;
                obj = b11;
            }
            androidx.fragment.app.r requireActivity = abstractC4497oa.requireActivity();
            Intrinsics.g(requireActivity, "null cannot be cast to non-null type spay.sdk.RedirectActivity");
            ((RedirectActivity) requireActivity).finish();
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c4427lr = this.f30717d;
        Sc.s.b(obj);
        c4427lr.invoke(new PaymentResult.Error((String) obj, "000000000000", new MerchantError.UnexpectedError("Ошибка внутренних компонентов SPaySdk")));
        androidx.fragment.app.r requireActivity2 = abstractC4497oa.requireActivity();
        Intrinsics.g(requireActivity2, "null cannot be cast to non-null type spay.sdk.RedirectActivity");
        ((RedirectActivity) requireActivity2).finish();
        return Unit.f71690a;
    }
}
