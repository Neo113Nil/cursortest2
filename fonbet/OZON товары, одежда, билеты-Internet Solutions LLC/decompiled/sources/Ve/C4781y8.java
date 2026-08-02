package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.BindingCheckResult;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;

/* renamed from: Ve.y8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4781y8 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4150c9 f32543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E9 f32544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f32545g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4781y8(C4150c9 c4150c9, E9 e92, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32543e = c4150c9;
        this.f32544f = e92;
        this.f32545g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4781y8(this.f32543e, this.f32544f, this.f32545g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4781y8) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Dp dp;
        Ki ki2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32542d;
        E9 e92 = this.f32544f;
        C4150c9 c4150c9 = this.f32543e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) c4150c9.f30787b).b(new C4209eb(new C4351j9()));
            InterfaceC4524p8 interfaceC4524p8 = c4150c9.f30786a;
            String str = e92.f28916a;
            this.f32542d = 1;
            obj = ((C4710vl) interfaceC4524p8).d(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        ContentResponse contentResponse = (ContentResponse) obj;
        if (contentResponse instanceof ContentResponse.Failure) {
            ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
            if (failure.getError() instanceof ErrorEntity.NoInternet) {
                ki2 = new O0(new Jr(new V7(c4150c9, e92, this.f32545g, null)));
            } else {
                dp = new Dp(failure.getError(), false);
                ki2 = dp;
            }
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new Sc.o();
            }
            Object data = ((ContentResponse.Success) contentResponse).getData();
            Intrinsics.f(data);
            BindingCheckResult bindingCheckResult = (BindingCheckResult) data;
            if (bindingCheckResult instanceof BindingCheckResult.Available) {
                ki2 = V4.f30176a;
            } else {
                if (!(bindingCheckResult instanceof BindingCheckResult.NotAvailable)) {
                    throw new Sc.o();
                }
                dp = new Dp(new ErrorEntity.BindingPaymentFailed("Deny by check binding result"), ((BindingCheckResult.NotAvailable) bindingCheckResult).getNeedUpdateBinding());
                ki2 = dp;
            }
        }
        ((C4238fb) c4150c9.f30787b).b(ki2);
        return Unit.f71690a;
    }
}
