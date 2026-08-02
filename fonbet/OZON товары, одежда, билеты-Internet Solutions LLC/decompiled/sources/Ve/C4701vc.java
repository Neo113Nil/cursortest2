package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.otp.CreateBindingOtpResponseBody;
import spay.sdk.domain.model.response.otp.OneTimePasswordStateBuilderKt;

/* renamed from: Ve.vc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4701vc extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Zc f32272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Cd f32273f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f32274g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4701vc(Zc zc2, Cd cd2, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32272e = zc2;
        this.f32273f = cd2;
        this.f32274g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4701vc(this.f32272e, this.f32273f, this.f32274g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4701vc) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ki c4800z;
        Ki ki2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32271d;
        Cd cd2 = this.f32273f;
        Zc zc2 = this.f32272e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) zc2.f30583b).b(new C4209eb(new C4178d8()));
            InterfaceC4524p8 interfaceC4524p8 = zc2.f30582a;
            CreateBindingOtpRequestBody createBindingOtpRequestBody = cd2.f28757a;
            this.f32271d = 1;
            obj = ((C4710vl) interfaceC4524p8).j(createBindingOtpRequestBody, cd2.f28758b, this);
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
                ki2 = new O0(new Jr(new Sb(zc2, cd2, this.f32274g, null)));
                ((C4238fb) zc2.f30583b).b(ki2);
                return Unit.f71690a;
            }
            c4800z = new Dp(failure.getError(), false);
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new Sc.o();
            }
            ContentResponse.Success success = (ContentResponse.Success) contentResponse;
            Object data = success.getData();
            Intrinsics.f(data);
            AbstractC4182dc creationOneTimePasswordState$default = OneTimePasswordStateBuilderKt.creationOneTimePasswordState$default(((CreateBindingOtpResponseBody) data).getMobilePhone(), 0, null, ((CreateBindingOtpResponseBody) success.getData()).getCardNumber(), 4, null);
            cd2.getClass();
            c4800z = new C4800z(creationOneTimePasswordState$default);
        }
        ki2 = c4800z;
        ((C4238fb) zc2.f30583b).b(ki2);
        return Unit.f71690a;
    }
}
