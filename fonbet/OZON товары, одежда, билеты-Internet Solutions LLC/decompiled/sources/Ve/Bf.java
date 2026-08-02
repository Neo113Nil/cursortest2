package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class Bf extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4744x f28699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ListOfCardsResponseBody.PaymentToolInfo.Tool f28700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f28701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bf(C4744x c4744x, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28699e = c4744x;
        this.f28700f = tool;
        this.f28701g = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Bf(this.f28699e, this.f28700f, this.f28701g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Bf) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28698d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4744x c4744x = this.f28699e;
            if (!(((C4654tn) c4744x.f32413b).j() instanceof PayStrategy.PayWithBinding)) {
                this.f28698d = 1;
                if (C4744x.e0(c4744x, this.f28700f, this.f28701g, this) == aVar) {
                    return aVar;
                }
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
