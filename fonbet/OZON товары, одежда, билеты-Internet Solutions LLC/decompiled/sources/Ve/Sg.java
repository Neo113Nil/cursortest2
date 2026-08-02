package Ve;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.SessionIdRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.domain.model.response.SessionIdResponseBody;

/* loaded from: classes10.dex */
public final class Sg extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4790yh f29977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Yh f29978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f29979g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sg(C4790yh c4790yh, Yh yh2, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29977e = c4790yh;
        this.f29978f = yh2;
        this.f29979g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Sg(this.f29977e, this.f29978f, this.f29979g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Sg) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r11 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0088, code lost:
    
        if (((Ve.C4249fm) r11).d(r1, r10) == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String getIpUrl;
        String stand;
        Ki c4520p4;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29976d;
        Yh yh2 = this.f29978f;
        C4790yh c4790yh = this.f29977e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) c4790yh.f32576c).b(new C4209eb(new G8()));
            InterfaceC4793yk interfaceC4793yk = c4790yh.f32575b;
            SPaySdkConfig sPaySdkConfig = ((C4712vn) c4790yh.f32579f).f32313c;
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
            String m11 = (schema2 == null || (getIpUrl = schema2.getGetIpUrl()) == null) ? null : M1.b.m(getIpUrl);
            this.f29976d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                ContentResponse contentResponse = (ContentResponse) obj;
                if (contentResponse instanceof ContentResponse.Failure) {
                    ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
                    ErrorEntity error = failure.getError();
                    c4520p4 = error instanceof ErrorEntity.ApiError ? new O0(new Cb(failure.getError())) : Intrinsics.d(error, ErrorEntity.NoInternet.INSTANCE) ? new O0(new Jr(new C4561qg(c4790yh, yh2, this.f29979g, null))) : Intrinsics.d(error, ErrorEntity.TimeOut.INSTANCE) ? new O0(new C4761xg()) : Intrinsics.d(error, ErrorEntity.Unknown.INSTANCE) ? new O0(new Sm("Системная или внутренняя ошибка")) : new O0(new Sm("Некорректный формат запроса или ответа"));
                } else {
                    if (!(contentResponse instanceof ContentResponse.Success)) {
                        throw new Sc.o();
                    }
                    Object data = ((ContentResponse.Success) contentResponse).getData();
                    Intrinsics.f(data);
                    SessionIdResponseBody sessionIdResponseBody = (SessionIdResponseBody) data;
                    C4654tn c4654tn = (C4654tn) c4790yh.f32577d;
                    c4654tn.getClass();
                    c4654tn.f32133b = new L1();
                    EnumC4290h5 tag = EnumC4290h5.BNPL;
                    C4248fl c4248fl = c4790yh.f32578e;
                    c4248fl.getClass();
                    Intrinsics.checkNotNullParameter(tag, "tag");
                    InterfaceC4678ui interfaceC4678ui = (InterfaceC4678ui) c4248fl.f31050d.get(tag);
                    if (interfaceC4678ui != null) {
                        Boolean isBnplEnabled = sessionIdResponseBody.isBnplEnabled();
                        interfaceC4678ui.a(new B9(isBnplEnabled != null ? isBnplEnabled.booleanValue() : false));
                    }
                    c4520p4 = new C4520p4(sessionIdResponseBody);
                }
                ((C4238fb) c4790yh.f32576c).b(c4520p4);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        InterfaceC4524p8 interfaceC4524p8 = c4790yh.f32574a;
        SessionIdRequestBody sessionIdRequestBody = yh2.f30467b;
        this.f29976d = 2;
        obj = ((C4710vl) interfaceC4524p8).t(sessionIdRequestBody, this);
    }
}
