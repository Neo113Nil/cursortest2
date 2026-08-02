package Ve;

import Lm0.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import spay.sdk.data.dto.response.SPayErrorDto;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* renamed from: Ve.fm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4249fm extends AbstractC4184de implements InterfaceC4793yk {

    /* renamed from: a, reason: collision with root package name */
    public final npi.spay.Kq f31051a;

    /* renamed from: b, reason: collision with root package name */
    public final C4131bj f31052b;

    /* renamed from: c, reason: collision with root package name */
    public final Te f31053c;

    /* renamed from: d, reason: collision with root package name */
    public final X3 f31054d;

    /* renamed from: e, reason: collision with root package name */
    public final Vm f31055e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4249fm(npi.spay.Kq sdkFlowSPayApi, C4131bj networkErrorHandler, Te metricFacade, X3 apiResponseErrorHandler, Vm sPayDataContract, C4131bj networkErrorHandlerImpl, Xh apiResponseErrorHandlerImpl) {
        super(networkErrorHandlerImpl, apiResponseErrorHandlerImpl);
        Intrinsics.checkNotNullParameter(sdkFlowSPayApi, "sdkFlowSPayApi");
        Intrinsics.checkNotNullParameter(networkErrorHandler, "networkErrorHandler");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(apiResponseErrorHandler, "apiResponseErrorHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(networkErrorHandlerImpl, "networkErrorHandlerImpl");
        Intrinsics.checkNotNullParameter(apiResponseErrorHandlerImpl, "apiResponseErrorHandlerImpl");
        this.f31051a = sdkFlowSPayApi;
        this.f31052b = networkErrorHandler;
        this.f31053c = metricFacade;
        this.f31054d = apiResponseErrorHandler;
        this.f31055e = sPayDataContract;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x0066, B:14:0x006e, B:17:0x008f, B:19:0x0097, B:20:0x00c5, B:24:0x00b3, B:25:0x00d1, B:27:0x00ec, B:30:0x00f7, B:33:0x00ff), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x0066, B:14:0x006e, B:17:0x008f, B:19:0x0097, B:20:0x00c5, B:24:0x00b3, B:25:0x00d1, B:27:0x00ec, B:30:0x00f7, B:33:0x00ff), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, kotlin.coroutines.jvm.internal.c cVar) {
        Dl dl;
        int i11;
        Exception exc;
        C4249fm c4249fm;
        Response response;
        if (cVar instanceof Dl) {
            dl = (Dl) cVar;
            int i12 = dl.f28878g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dl.f28878g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dl.f28876e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dl.f28878g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f31053c.b(new Bi(S.RQ_IP, Ur.AUTH_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        npi.spay.Kq kq2 = this.f31051a;
                        if (str == null) {
                            str = "https://safepayonline.ru/sdk-api/getIp";
                        }
                        dl.f28875d = this;
                        dl.f28878g = 1;
                        obj = kq2.a(str, dl);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4249fm = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4249fm = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("COMMON REPO EXCEPTION");
                        bVar.e(exc);
                        c4249fm.f31052b.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4249fm = dl.f28875d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("COMMON REPO EXCEPTION");
                        bVar2.e(exc);
                        c4249fm.f31052b.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4249fm.f31053c;
                    S s11 = S.RQ_GOOD_IP;
                    Ur ur = Ur.AUTH_VIEW;
                    te2.b(new Bi(s11, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    String str2 = (String) response.body();
                    Te te3 = c4249fm.f31053c;
                    if (str2 == null || kotlin.text.h.K(str2)) {
                        te3.b(new Bi(S.RS_FAIL_IP, ur, Pe.RS_FAIL, null, null, null, null, 120));
                    } else {
                        te3.b(new Bi(S.RS_GOOD_IP, ur, Pe.RS_GOOD, null, new Integer(response.code()), null, null, 104));
                    }
                    ((C4654tn) c4249fm.f31055e).f32144m = str2;
                    return new ContentResponse.Success(str2);
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                ErrorEntity c11 = c4249fm.c(response, g10);
                Te te4 = c4249fm.f31053c;
                S s12 = S.RQ_FAIL_IP;
                Ur ur2 = Ur.AUTH_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te4.b(new Bi(s12, ur2, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c11);
            }
        }
        dl = new Dl(this, cVar);
        Object obj2 = dl.f28876e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dl.f28878g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005b, B:14:0x0064, B:17:0x008b, B:19:0x009f, B:22:0x00aa, B:25:0x00b2, B:27:0x00ce, B:29:0x00d8, B:31:0x00d6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005b, B:14:0x0064, B:17:0x008b, B:19:0x009f, B:22:0x00aa, B:25:0x00b2, B:27:0x00ce, B:29:0x00d8, B:31:0x00d6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kotlin.coroutines.jvm.internal.c cVar) {
        C4162cl c4162cl;
        int i11;
        Exception exc;
        C4249fm c4249fm;
        Response response;
        ErrorEntity errorEntity;
        if (cVar instanceof C4162cl) {
            c4162cl = (C4162cl) cVar;
            int i12 = c4162cl.f30822g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4162cl.f30822g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4162cl.f30820e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4162cl.f30822g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    try {
                        this.f31053c.b(new Bi(Ld.RQ_REMOTE_CONFIG, null, Pe.RQ, null, null, null, null, 122));
                        npi.spay.Kq kq2 = this.f31051a;
                        c4162cl.f30819d = this;
                        c4162cl.f30822g = 1;
                        obj = kq2.a(c4162cl);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4249fm = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4249fm = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("COMMON REPO EXCEPTION");
                        bVar.e(exc);
                        c4249fm.f31052b.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4249fm = c4162cl.f30819d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("COMMON REPO EXCEPTION");
                        bVar2.e(exc);
                        c4249fm.f31052b.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    c4249fm.f31053c.b(new Bi(Ld.RQ_GOOD_REMOTE_CONFIG, null, Pe.RQ_GOOD, null, null, null, null, 122));
                    return new ContentResponse.Success((SPaySdkConfig) AbstractC4184de.a(response, null, Ld.RS_GOOD_REMOTE_CONFIG, Ld.RS_FAIL_REMOTE_CONFIG, Ur.MERCHANT_VIEW));
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te2 = c4249fm.f31053c;
                Ld ld2 = Ld.RQ_FAIL_REMOTE_CONFIG;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te2.b(new Bi(ld2, null, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 66));
                if (g10 == null || (errorEntity = c4249fm.f31054d.a(g10)) == null) {
                    errorEntity = ErrorEntity.Unknown.INSTANCE;
                }
                return new ContentResponse.Failure(errorEntity);
            }
        }
        c4162cl = new C4162cl(this, cVar);
        Object obj2 = c4162cl.f30820e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4162cl.f30822g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }
}
