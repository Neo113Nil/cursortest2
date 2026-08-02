package Ve;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.BindingSessionIdRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.domain.model.response.SessionIdResponseBody;

/* loaded from: classes10.dex */
public final class Wi extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bj f30286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Al f30287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f30288g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wi(Bj bj2, Al al, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30286e = bj2;
        this.f30287f = al;
        this.f30288g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Wi(this.f30286e, this.f30287f, this.f30288g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Wi) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (r12 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (((Ve.C4249fm) r12).d(r1, r11) == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String stand;
        Ki c4520p4;
        Ki ki2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30285d;
        Al al = this.f30287f;
        Bj bj2 = this.f30286e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) bj2.f28716c).b(new C4209eb(new W6()));
            if (!Lf.a.r0(bj2.f28717d, EnumC4290h5.PAY_BINDING, null)) {
                ((C4238fb) bj2.f28716c).b(new Dp(ErrorEntity.AccessDenied.INSTANCE, false));
                return Unit.f71690a;
            }
            InterfaceC4793yk interfaceC4793yk = bj2.f28715b;
            SPaySdkConfig sPaySdkConfig = ((C4712vn) bj2.f28718e).f32313c;
            if (sPaySdkConfig == null) {
                throw C4317i3.f31235a;
            }
            Iterator<T> it = sPaySdkConfig.getSchemas().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                SPaySdkConfig.Schema schema = (SPaySdkConfig.Schema) obj2;
                if (Intrinsics.d((schema == null || (stand = schema.getStand()) == null) ? null : M1.b.m(stand), E.e())) {
                    break;
                }
            }
            SPaySdkConfig.Schema schema2 = (SPaySdkConfig.Schema) obj2;
            String getIpUrl = schema2 != null ? schema2.getGetIpUrl() : null;
            this.f30285d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                ContentResponse contentResponse = (ContentResponse) obj;
                if (contentResponse instanceof ContentResponse.Failure) {
                    ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
                    if (failure.getError() instanceof ErrorEntity.NoInternet) {
                        ki2 = new O0(new Jr(new C4735wi(bj2, al, this.f30288g, null)));
                        ((C4238fb) bj2.f28716c).b(ki2);
                        return Unit.f71690a;
                    }
                    c4520p4 = new Dp(failure.getError(), false);
                } else {
                    if (!(contentResponse instanceof ContentResponse.Success)) {
                        throw new Sc.o();
                    }
                    Object data = ((ContentResponse.Success) contentResponse).getData();
                    Intrinsics.f(data);
                    c4520p4 = new C4520p4((SessionIdResponseBody) data);
                }
                ki2 = c4520p4;
                ((C4238fb) bj2.f28716c).b(ki2);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        InterfaceC4524p8 interfaceC4524p8 = bj2.f28714a;
        BindingSessionIdRequestBody bindingSessionIdRequestBody = new BindingSessionIdRequestBody(al.f28629a, al.f28630b);
        this.f30285d = 2;
        obj = ((C4710vl) interfaceC4524p8).f(bindingSessionIdRequestBody, this);
    }
}
