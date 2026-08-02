package Ve;

import B0.C2454a;
import Lm0.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import spay.sdk.data.dto.response.SPayErrorDto;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.BindingSessionIdRequestBody;
import spay.sdk.domain.model.request.BindingV3SessionIdRequestBody;
import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;
import spay.sdk.domain.model.request.ConfirmOtpRequestBody;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.PayBindingRequestBody;
import spay.sdk.domain.model.request.PayOnlineRequestBody;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.request.PaymentOrderRequestBody;
import spay.sdk.domain.model.request.PaymentTokenRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.request.SessionIdRequestBody;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;
import spay.sdk.domain.model.response.BindingSessionId;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.PartsPaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.PartsPaymentPlanBnplResponseBodyKt;
import spay.sdk.domain.model.response.PaymentOrderResponseBody;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.SdkAuthResponseBody;
import spay.sdk.domain.model.response.SessionIdResponseBody;
import spay.sdk.domain.model.response.bnpl.PartsGraphBnpl;
import spay.sdk.domain.model.response.bnpl.SixPartPay;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.domain.model.response.otp.ConfirmOtpResponseBody;
import spay.sdk.domain.model.response.otp.CreateBindingOtpResponseBody;
import spay.sdk.domain.model.response.otp.CreateOtpSdkResponseBody;
import spay.sdk.domain.model.response.paymentToken.successResponse.PaymentTokenResponseBody;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* renamed from: Ve.vl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4710vl extends AbstractC4184de implements InterfaceC4524p8 {

    /* renamed from: a, reason: collision with root package name */
    public final Un f32303a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f32304b;

    /* renamed from: c, reason: collision with root package name */
    public final C4248fl f32305c;

    /* renamed from: d, reason: collision with root package name */
    public final Te f32306d;

    /* renamed from: e, reason: collision with root package name */
    public final C4131bj f32307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4710vl(Un sPayDataSource, Vm sPayDataContract, C4248fl featuresHandler, Te metricUtil, C4131bj networkErrorHandler, C4131bj networkErrorHandlerImpl, Xh apiResponseErrorHandlerImpl) {
        super(networkErrorHandlerImpl, apiResponseErrorHandlerImpl);
        Intrinsics.checkNotNullParameter(sPayDataSource, "sPayDataSource");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(metricUtil, "metricUtil");
        Intrinsics.checkNotNullParameter(networkErrorHandler, "networkErrorHandler");
        Intrinsics.checkNotNullParameter(networkErrorHandlerImpl, "networkErrorHandlerImpl");
        Intrinsics.checkNotNullParameter(apiResponseErrorHandlerImpl, "apiResponseErrorHandlerImpl");
        this.f32303a = sPayDataSource;
        this.f32304b = sPayDataContract;
        this.f32305c = featuresHandler;
        this.f32306d = metricUtil;
        this.f32307e = networkErrorHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0065, B:17:0x008e, B:19:0x00a9, B:22:0x00b4, B:25:0x00bc), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0065, B:17:0x008e, B:19:0x00a9, B:22:0x00b4, B:25:0x00bc), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, kotlin.coroutines.jvm.internal.c cVar) {
        R8 r82;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Object obj;
        Response response;
        if (cVar instanceof R8) {
            r82 = (R8) cVar;
            int i12 = r82.f29838g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                r82.f29838g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = r82.f29836e;
                Object obj3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = r82.f29838g;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    this.f32306d.b(new Bi(EnumC4568qn.RQ_CHECK_BINDING, Ur.OTP_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        r82.f29835d = this;
                        r82.f29838g = 1;
                        Object a11 = un.a(str, r82);
                        if (a11 == obj3) {
                            return obj3;
                        }
                        c4710vl = this;
                        obj = a11;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = r82.f29835d;
                    try {
                        Sc.s.b(obj2);
                        obj = obj2;
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!response.isSuccessful()) {
                    Te te2 = c4710vl.f32306d;
                    EnumC4568qn enumC4568qn = EnumC4568qn.RQ_GOOD_CHECK_BINDING;
                    Ur ur = Ur.OTP_VIEW;
                    te2.b(new Bi(enumC4568qn, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success(AbstractC4184de.b(response, c4710vl.f32306d, EnumC4568qn.RS_GOOD_CHECK_BINDING, EnumC4568qn.RS_FAIL_CHECK_BINDING, ur, C4669u9.f32198b));
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                ErrorEntity c11 = c4710vl.c(response, g10);
                Te te3 = c4710vl.f32306d;
                EnumC4568qn enumC4568qn2 = EnumC4568qn.RQ_FAIL_CHECK_BINDING;
                Ur ur2 = Ur.OTP_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te3.b(new Bi(enumC4568qn2, ur2, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c11);
            }
        }
        r82 = new R8(this, cVar);
        Object obj22 = r82.f29836e;
        Object obj32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = r82.f29838g;
        if (i11 != 0) {
        }
        response = (Response) obj;
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x0046, B:14:0x004f, B:17:0x006b, B:19:0x0085, B:22:0x0090, B:25:0x0098), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x0046, B:14:0x004f, B:17:0x006b, B:19:0x0085, B:22:0x0090, B:25:0x0098), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kotlin.coroutines.jvm.internal.c cVar) {
        Rk rk;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof Rk) {
            rk = (Rk) cVar;
            int i12 = rk.f29866g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                rk.f29866g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = rk.f29864e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = rk.f29866g;
                int i13 = 1;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    try {
                        Un un = this.f32303a;
                        rk.f29863d = this;
                        rk.f29866g = 1;
                        obj = un.a(rk);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = rk.f29863d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (!response.isSuccessful()) {
                    c4710vl.f32306d.b(new Bi(Ap.RQ_GOOD_REVOKE_TOKEN_SDK, Ur.PROFILE_VIEW, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success(objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0);
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                ErrorEntity c11 = c4710vl.c(response, g10);
                Te te2 = c4710vl.f32306d;
                Ap ap = Ap.RQ_FAIL_REVOKE_TOKEN_SDK;
                Ur ur = Ur.PROFILE_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te2.b(new Bi(ap, ur, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c11);
            }
        }
        rk = new Rk(this, cVar);
        Object obj2 = rk.f29864e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = rk.f29866g;
        int i132 = 1;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x009f, B:19:0x00b6, B:22:0x00c1, B:26:0x00cc, B:28:0x00d5, B:31:0x00dd), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x009f, B:19:0x00b6, B:22:0x00c1, B:26:0x00cc, B:28:0x00d5, B:31:0x00dd), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(BindingSessionIdRequestBody bindingSessionIdRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        C4412lc c4412lc;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof C4412lc) {
            c4412lc = (C4412lc) cVar;
            int i12 = c4412lc.f31523g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4412lc.f31523g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4412lc.f31521e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4412lc.f31523g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(EnumC4568qn.RQ_BINDING_SESSION_ID, Ur.MERCHANT_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        c4412lc.f31520d = this;
                        c4412lc.f31523g = 1;
                        obj = un.a(bindingSessionIdRequestBody, c4412lc);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = c4412lc.f31520d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4710vl.f32306d;
                    EnumC4568qn enumC4568qn = EnumC4568qn.RQ_GOOD_BINDING_SESSION_ID;
                    Ur ur = Ur.MERCHANT_VIEW;
                    te2.b(new Bi(enumC4568qn, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    SessionIdResponseBody sessionIdResponseBody = (SessionIdResponseBody) AbstractC4184de.a(response, c4710vl.f32306d, EnumC4568qn.RS_GOOD_BINDING_SESSION_ID, EnumC4568qn.RS_FAIL_BINDING_SESSION_ID, ur);
                    Vm vm = c4710vl.f32304b;
                    ContentResponse.Success response2 = new ContentResponse.Success(sessionIdResponseBody);
                    C4654tn c4654tn = (C4654tn) vm;
                    c4654tn.getClass();
                    Intrinsics.checkNotNullParameter(response2, "response");
                    c4654tn.f32134c = response2;
                    return new ContentResponse.Success(sessionIdResponseBody);
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te3 = c4710vl.f32306d;
                EnumC4568qn enumC4568qn2 = EnumC4568qn.RQ_FAIL_BINDING_SESSION_ID;
                Ur ur2 = Ur.MERCHANT_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                String str = "";
                if (description == null) {
                    description = "";
                }
                Pair pair = new Pair("Description", description);
                String info = g10 != null ? g10.getInfo() : null;
                if (info != null) {
                    str = info;
                }
                te3.b(new Bi(enumC4568qn2, ur2, pe2, kotlin.collections.U.j(pair, new Pair("Info", str)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        c4412lc = new C4412lc(this, cVar);
        Object obj2 = c4412lc.f31521e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4412lc.f31523g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x0061, B:14:0x0069, B:17:0x00bc, B:19:0x00d3, B:22:0x00de, B:26:0x00e9, B:28:0x00f2, B:31:0x00fa), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x0061, B:14:0x0069, B:17:0x00bc, B:19:0x00d3, B:22:0x00de, B:26:0x00e9, B:28:0x00f2, B:31:0x00fa), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(BindingV3SessionIdRequestBody bindingV3SessionIdRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        Wd wd2;
        int i11;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof Wd) {
            wd2 = (Wd) cVar;
            int i12 = wd2.f30270g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                wd2.f30270g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = wd2.f30268e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = wd2.f30270g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(EnumC4568qn.RQ_BINDING_SESSION_ID, Ur.MERCHANT_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        wd2.f30267d = this;
                        wd2.f30270g = 1;
                        obj = un.a(bindingV3SessionIdRequestBody, wd2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        e = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(e);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(e));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = wd2.f30267d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(e);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(e));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4710vl.f32306d;
                    EnumC4568qn enumC4568qn = EnumC4568qn.RQ_GOOD_BINDING_SESSION_ID;
                    Ur ur = Ur.MERCHANT_VIEW;
                    te2.b(new Bi(enumC4568qn, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    BindingSessionId bindingSessionId = (BindingSessionId) AbstractC4184de.a(response, c4710vl.f32306d, EnumC4568qn.RS_GOOD_BINDING_SESSION_ID, EnumC4568qn.RS_FAIL_BINDING_SESSION_ID, ur);
                    Vm vm = c4710vl.f32304b;
                    ContentResponse.Success response2 = new ContentResponse.Success(new SessionIdResponseBody(null, null, bindingSessionId.getSessionId(), null, null, null, null, null, null, null, null, 2043, null));
                    C4654tn c4654tn = (C4654tn) vm;
                    c4654tn.getClass();
                    Intrinsics.checkNotNullParameter(response2, "response");
                    c4654tn.f32134c = response2;
                    return new ContentResponse.Success(bindingSessionId);
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te3 = c4710vl.f32306d;
                EnumC4568qn enumC4568qn2 = EnumC4568qn.RQ_FAIL_BINDING_SESSION_ID;
                Ur ur2 = Ur.MERCHANT_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                String str = "";
                if (description == null) {
                    description = "";
                }
                Pair pair = new Pair("Description", description);
                String info = g10 != null ? g10.getInfo() : null;
                if (info != null) {
                    str = info;
                }
                te3.b(new Bi(enumC4568qn2, ur2, pe2, kotlin.collections.U.j(pair, new Pair("Info", str)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        wd2 = new Wd(this, cVar);
        Object obj2 = wd2.f30268e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = wd2.f30270g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0065, B:17:0x0081, B:19:0x009b, B:22:0x00a6, B:25:0x00ae), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0065, B:17:0x0081, B:19:0x009b, B:22:0x00a6, B:25:0x00ae), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        W9 w92;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof W9) {
            w92 = (W9) cVar;
            int i12 = w92.f30254g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                w92.f30254g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = w92.f30252e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = w92.f30254g;
                int i13 = 1;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(EnumC4568qn.RQ_CONFIRM_BINDING, Ur.OTP_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        w92.f30251d = this;
                        w92.f30254g = 1;
                        obj = un.a(confirmBindingOtpRequestBody, w92);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = w92.f30251d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (!response.isSuccessful()) {
                    c4710vl.f32306d.b(new Bi(EnumC4568qn.RQ_GOOD_CONFIRM_BINDING, Ur.OTP_VIEW, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success(objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0);
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                ErrorEntity c11 = c4710vl.c(response, g10);
                Te te2 = c4710vl.f32306d;
                EnumC4568qn enumC4568qn = EnumC4568qn.RQ_FAIL_CONFIRM_BINDING;
                Ur ur = Ur.OTP_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te2.b(new Bi(enumC4568qn, ur, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c11);
            }
        }
        w92 = new W9(this, cVar);
        Object obj2 = w92.f30252e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = w92.f30254g;
        int i132 = 1;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008c, B:19:0x00a3, B:22:0x00ae, B:25:0x00b6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008c, B:19:0x00a3, B:22:0x00ae, B:25:0x00b6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ConfirmOtpRequestBody confirmOtpRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        Ba ba;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof Ba) {
            ba = (Ba) cVar;
            int i12 = ba.f28687g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                ba.f28687g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = ba.f28685e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = ba.f28687g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(Fr.RQ_CONFIRM_OTP, Ur.OTP_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        ba.f28684d = this;
                        ba.f28687g = 1;
                        obj = un.a(confirmOtpRequestBody, ba);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = ba.f28684d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4710vl.f32306d;
                    Fr fr = Fr.RQ_GOOD_CONFIRM_OTP;
                    Ur ur = Ur.OTP_VIEW;
                    te2.b(new Bi(fr, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((ConfirmOtpResponseBody) AbstractC4184de.a(response, c4710vl.f32306d, Fr.RS_GOOD_CONFIRM_OTP, Fr.RS_FAIL_CONFIRM_OTP, ur));
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te3 = c4710vl.f32306d;
                Fr fr2 = Fr.RQ_FAIL_CONFIRM_OTP;
                Ur ur2 = Ur.OTP_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te3.b(new Bi(fr2, ur2, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        ba = new Ba(this, cVar);
        Object obj2 = ba.f28685e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = ba.f28687g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:11:0x002d, B:12:0x006e, B:14:0x0076, B:16:0x007e, B:18:0x0085, B:21:0x0082, B:22:0x00a7, B:24:0x00b5, B:26:0x00bc, B:28:0x00c5, B:31:0x00d0, B:34:0x00d8, B:37:0x00b9), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:11:0x002d, B:12:0x006e, B:14:0x0076, B:16:0x007e, B:18:0x0085, B:21:0x0082, B:22:0x00a7, B:24:0x00b5, B:26:0x00bc, B:28:0x00c5, B:31:0x00d0, B:34:0x00d8, B:37:0x00b9), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(CreateBindingOtpRequestBody createBindingOtpRequestBody, boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        C4181db c4181db;
        int i11;
        C4710vl c4710vl;
        Response response;
        boolean z12 = z11;
        if (cVar instanceof C4181db) {
            c4181db = (C4181db) cVar;
            int i12 = c4181db.f30868h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4181db.f30868h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4181db.f30866f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4181db.f30868h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(EnumC4568qn.RQ_CREATE_BINDING, z12 ? Ur.OTP_VIEW : Ur.MERCHANT_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        c4181db.f30864d = this;
                        c4181db.f30865e = z12;
                        c4181db.f30868h = 1;
                        obj = un.a(createBindingOtpRequestBody, c4181db);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        e = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(e);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(e));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z12 = c4181db.f30865e;
                    c4710vl = c4181db.f30864d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(e);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(e));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    c4710vl.f32306d.b(new Bi(EnumC4568qn.RQ_GOOD_CREATE_BINDING, z12 ? Ur.OTP_VIEW : Ur.MERCHANT_VIEW, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((CreateBindingOtpResponseBody) AbstractC4184de.a(response, c4710vl.f32306d, EnumC4568qn.RS_GOOD_CREATE_BINDING, EnumC4568qn.RS_FAIL_CREATE_BINDING, Ur.MERCHANT_VIEW));
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te2 = c4710vl.f32306d;
                EnumC4568qn enumC4568qn = EnumC4568qn.RQ_FAIL_CREATE_BINDING;
                Ur ur = z12 ? Ur.OTP_VIEW : Ur.MERCHANT_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te2.b(new Bi(enumC4568qn, ur, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        c4181db = new C4181db(this, cVar);
        Object obj2 = c4181db.f30866f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4181db.f30868h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008c, B:19:0x00a3, B:22:0x00ae, B:25:0x00b6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008c, B:19:0x00a3, B:22:0x00ae, B:25:0x00b6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(CreateOtpSdkRequestBody createOtpSdkRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        Gb gb2;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof Gb) {
            gb2 = (Gb) cVar;
            int i12 = gb2.f29070g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gb2.f29070g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = gb2.f29068e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = gb2.f29070g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(Fr.RQ_CREATE_OTP, Ur.OTP_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        gb2.f29067d = this;
                        gb2.f29070g = 1;
                        obj = un.a(createOtpSdkRequestBody, gb2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = gb2.f29067d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4710vl.f32306d;
                    Fr fr = Fr.RQ_GOOD_CREATE_OTP;
                    Ur ur = Ur.OTP_VIEW;
                    te2.b(new Bi(fr, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((CreateOtpSdkResponseBody) AbstractC4184de.a(response, c4710vl.f32306d, Fr.RS_GOOD_CREATE_OTP, Fr.RS_FAIL_CREATE_OTP, ur));
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te3 = c4710vl.f32306d;
                Fr fr2 = Fr.RQ_FAIL_CREATE_OTP;
                Ur ur2 = Ur.OTP_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te3.b(new Bi(fr2, ur2, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        gb2 = new Gb(this, cVar);
        Object obj2 = gb2.f29068e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gb2.f29070g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c0 A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:11:0x002e, B:12:0x00b8, B:14:0x00c0, B:16:0x00d0, B:17:0x00d5, B:19:0x00df, B:20:0x00e4, B:22:0x00fe, B:23:0x0103, B:25:0x010d, B:26:0x0112, B:28:0x011c, B:29:0x0121, B:32:0x011f, B:33:0x0110, B:34:0x0101, B:35:0x00e2, B:36:0x00d3, B:37:0x013d, B:39:0x0153, B:41:0x015a, B:43:0x0164, B:45:0x016b, B:47:0x0173, B:50:0x017e, B:53:0x0186, B:56:0x0168, B:57:0x0157), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:11:0x002e, B:12:0x00b8, B:14:0x00c0, B:16:0x00d0, B:17:0x00d5, B:19:0x00df, B:20:0x00e4, B:22:0x00fe, B:23:0x0103, B:25:0x010d, B:26:0x0112, B:28:0x011c, B:29:0x0121, B:32:0x011f, B:33:0x0110, B:34:0x0101, B:35:0x00e2, B:36:0x00d3, B:37:0x013d, B:39:0x0153, B:41:0x015a, B:43:0x0164, B:45:0x016b, B:47:0x0173, B:50:0x017e, B:53:0x0186, B:56:0x0168, B:57:0x0157), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ListOfCardsRequestBody listOfCardsRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        C4615sd c4615sd;
        int i11;
        C4710vl c4710vl;
        C4654tn c4654tn;
        List h11;
        Response response;
        ListOfCardsRequestBody listOfCardsRequestBody2 = listOfCardsRequestBody;
        if (cVar instanceof C4615sd) {
            c4615sd = (C4615sd) cVar;
            int i12 = c4615sd.f32046h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4615sd.f32046h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4615sd.f32044f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4615sd.f32046h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (Lf.a.r0(this.f32305c, EnumC4290h5.USE_CACHED_CARDS_LIST, null) && (h11 = (c4654tn = (C4654tn) this.f32304b).h()) != null && !h11.isEmpty() && c4654tn.b(listOfCardsRequestBody2.getPriorityCardOnly()) != null) {
                        ContentResponse.Success b11 = c4654tn.b(listOfCardsRequestBody2.getPriorityCardOnly());
                        Intrinsics.f(b11);
                        return b11;
                    }
                    Boolean priorityCardOnly = listOfCardsRequestBody2.getPriorityCardOnly();
                    Boolean bool = Boolean.TRUE;
                    this.f32306d.b(new Bi(Intrinsics.d(priorityCardOnly, bool) ? S.RQ_LIST_CARDS : Xf.RQ_LIST_CARDS, Intrinsics.d(listOfCardsRequestBody2.getPriorityCardOnly(), bool) ? Ur.AUTH_VIEW : Ur.PAY_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        c4615sd.f32042d = this;
                        c4615sd.f32043e = listOfCardsRequestBody2;
                        c4615sd.f32046h = 1;
                        obj = un.b(listOfCardsRequestBody2, c4615sd);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        e = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(e);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(e));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    listOfCardsRequestBody2 = c4615sd.f32043e;
                    c4710vl = c4615sd.f32042d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(e);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(e));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4710vl.f32306d;
                    Boolean priorityCardOnly2 = listOfCardsRequestBody2.getPriorityCardOnly();
                    Boolean bool2 = Boolean.TRUE;
                    te2.b(new Bi(Intrinsics.d(priorityCardOnly2, bool2) ? S.RQ_GOOD_LIST_CARDS : Xf.RQ_GOOD_LIST_CARDS, Intrinsics.d(listOfCardsRequestBody2.getPriorityCardOnly(), bool2) ? Ur.AUTH_VIEW : Ur.PAY_VIEW, Pe.RQ_GOOD, null, null, null, null, 120));
                    ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) AbstractC4184de.a(response, c4710vl.f32306d, Intrinsics.d(listOfCardsRequestBody2.getPriorityCardOnly(), bool2) ? S.RS_GOOD_LIST_CARDS : Xf.RS_GOOD_LIST_CARDS, Intrinsics.d(listOfCardsRequestBody2.getPriorityCardOnly(), bool2) ? S.RS_FAIL_LIST_CARDS : Xf.RS_FAIL_LIST_CARDS, Intrinsics.d(listOfCardsRequestBody2.getPriorityCardOnly(), bool2) ? Ur.AUTH_VIEW : Ur.PAY_VIEW);
                    ((C4654tn) c4710vl.f32304b).e(new ContentResponse.Success(listOfCardsResponseBody), listOfCardsRequestBody2.getPriorityCardOnly());
                    return new ContentResponse.Success(listOfCardsResponseBody);
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te3 = c4710vl.f32306d;
                Boolean priorityCardOnly3 = listOfCardsRequestBody2.getPriorityCardOnly();
                Boolean bool3 = Boolean.TRUE;
                InterfaceC4443me interfaceC4443me = Intrinsics.d(priorityCardOnly3, bool3) ? S.RQ_FAIL_LIST_CARDS : Xf.RQ_FAIL_LIST_CARDS;
                Ur ur = Intrinsics.d(listOfCardsRequestBody2.getPriorityCardOnly(), bool3) ? Ur.AUTH_VIEW : Ur.PAY_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te3.b(new Bi(interfaceC4443me, ur, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        c4615sd = new C4615sd(this, cVar);
        Object obj2 = c4615sd.f32044f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4615sd.f32046h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0065, B:17:0x0081, B:19:0x009b, B:22:0x00a6, B:25:0x00ae), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0065, B:17:0x0081, B:19:0x009b, B:22:0x00a6, B:25:0x00ae), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(PayBindingRequestBody payBindingRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        C4448mj c4448mj;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof C4448mj) {
            c4448mj = (C4448mj) cVar;
            int i12 = c4448mj.f31597g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4448mj.f31597g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4448mj.f31595e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4448mj.f31597g;
                int i13 = 1;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(EnumC4568qn.RQ_PAY_BINDING, Ur.OTP_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        c4448mj.f31594d = this;
                        c4448mj.f31597g = 1;
                        obj = un.a(payBindingRequestBody, c4448mj);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = c4448mj.f31594d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (!response.isSuccessful()) {
                    c4710vl.f32306d.b(new Bi(EnumC4568qn.RQ_GOOD_PAY_BINDING, Ur.OTP_VIEW, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success(objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0);
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                ErrorEntity c11 = c4710vl.c(response, g10);
                Te te2 = c4710vl.f32306d;
                EnumC4568qn enumC4568qn = EnumC4568qn.RQ_FAIL_PAY_BINDING;
                Ur ur = Ur.OTP_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te2.b(new Bi(enumC4568qn, ur, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c11);
            }
        }
        c4448mj = new C4448mj(this, cVar);
        Object obj2 = c4448mj.f31595e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4448mj.f31597g;
        int i132 = 1;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x0071, B:14:0x0079, B:16:0x008f, B:17:0x0094, B:20:0x0092, B:21:0x00aa, B:24:0x00c7, B:26:0x00cf, B:28:0x00d3, B:29:0x00da, B:31:0x00cd, B:32:0x00d6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x0071, B:14:0x0079, B:16:0x008f, B:17:0x0094, B:20:0x0092, B:21:0x00aa, B:24:0x00c7, B:26:0x00cf, B:28:0x00d3, B:29:0x00da, B:31:0x00cd, B:32:0x00d6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(PayOnlineRequestBody payOnlineRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        C4185df c4185df;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        ErrorEntity b11;
        Response response;
        ErrorEntity c11;
        if (cVar instanceof C4185df) {
            c4185df = (C4185df) cVar;
            int i12 = c4185df.f30877g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4185df.f30877g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4185df.f30875e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4185df.f30877g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(EnumC4500od.RQ_PAY_ONLINE, Intrinsics.d(((C4654tn) this.f32304b).j(), PayStrategy.PartsStartPay.INSTANCE) ? Ur.PAY_VIEW : Ur.BNPL_PARTS_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        c4185df.f30874d = this;
                        c4185df.f30877g = 1;
                        obj = un.a(payOnlineRequestBody, c4185df);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        b11 = C4131bj.b(exc);
                        if (b11 instanceof ErrorEntity.Unknown) {
                            b11 = ErrorEntity.PayBnplPartsFail.INSTANCE;
                        }
                        return new ContentResponse.Failure(b11);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = c4185df.f30874d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        b11 = C4131bj.b(exc);
                        if (b11 instanceof ErrorEntity.Unknown) {
                        }
                        return new ContentResponse.Failure(b11);
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    c4710vl.f32306d.b(new Bi(EnumC4500od.RQ_GOOD_PAY_ONLINE, Intrinsics.d(((C4654tn) c4710vl.f32304b).j(), PayStrategy.PartsStartPay.INSTANCE) ? Ur.PAY_VIEW : Ur.BNPL_PARTS_VIEW, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success(Unit.f71690a);
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                c4710vl.y(response, g10);
                if (Intrinsics.d(((C4654tn) c4710vl.f32304b).j(), PayStrategy.PayWithPartsOnly.INSTANCE)) {
                    if (g10 == null || (c11 = c4710vl.c(response, g10)) == null) {
                        c11 = ErrorEntity.PayBnplPartsFail.INSTANCE;
                    }
                    if (c11 instanceof ErrorEntity.Unknown) {
                        c11 = ErrorEntity.PayBnplPartsFail.INSTANCE;
                    }
                } else {
                    c11 = c4710vl.c(response, g10);
                }
                return new ContentResponse.Failure(c11);
            }
        }
        c4185df = new C4185df(this, cVar);
        Object obj2 = c4185df.f30875e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4185df.f30877g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x0098, B:19:0x00af, B:22:0x00ba, B:25:0x00c2), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x0098, B:19:0x00af, B:22:0x00ba, B:25:0x00c2), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        Nc nc2;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof Nc) {
            nc2 = (Nc) cVar;
            int i12 = nc2.f29553g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nc2.f29553g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = nc2.f29551e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = nc2.f29553g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    try {
                        this.f32306d.b(new Bi(S.RQ_PAYMENT_PLAN_BNPL, Ur.AUTH_VIEW, Pe.RQ, null, null, null, null, 120));
                        Un un = this.f32303a;
                        nc2.f29550d = this;
                        nc2.f29553g = 1;
                        obj = un.b(paymentBnplPlanRequestBody, nc2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = nc2.f29550d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4710vl.f32306d;
                    S s11 = S.RQ_GOOD_PAYMENT_PLAN_BNPL;
                    Ur ur = Ur.AUTH_VIEW;
                    te2.b(new Bi(s11, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) AbstractC4184de.a(response, c4710vl.f32306d, S.RS_GOOD_PAYMENT_PLAN_BNPL, S.RS_FAIL_PAYMENT_PLAN_BNPL, ur);
                    ((C4654tn) c4710vl.f32304b).d(new ContentResponse.Success(paymentPlanBnplResponseBody));
                    return new ContentResponse.Success(paymentPlanBnplResponseBody);
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te3 = c4710vl.f32306d;
                S s12 = S.RQ_FAIL_PAYMENT_PLAN_BNPL;
                Ur ur2 = Ur.AUTH_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te3.b(new Bi(s12, ur2, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        nc2 = new Nc(this, cVar);
        Object obj2 = nc2.f29551e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = nc2.f29553g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008c, B:19:0x00a3, B:22:0x00ae, B:26:0x00b9, B:28:0x00c2, B:31:0x00ca), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008c, B:19:0x00a3, B:22:0x00ae, B:26:0x00b9, B:28:0x00c2, B:31:0x00ca), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(PaymentOrderRequestBody paymentOrderRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        Cg cg2;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof Cg) {
            cg2 = (Cg) cVar;
            int i12 = cg2.f28767g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cg2.f28767g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cg2.f28765e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cg2.f28767g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(Xf.RQ_PAYMENT_ORDER, Ur.PAY_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        cg2.f28764d = this;
                        cg2.f28767g = 1;
                        obj = un.a(paymentOrderRequestBody, cg2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = cg2.f28764d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4710vl.f32306d;
                    Xf xf2 = Xf.RQ_GOOD_PAYMENT_ORDER;
                    Ur ur = Ur.PAY_VIEW;
                    te2.b(new Bi(xf2, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((PaymentOrderResponseBody) AbstractC4184de.a(response, c4710vl.f32306d, Xf.RS_GOOD_PAYMENT_ORDER, Xf.RS_FAIL_PAYMENT_ORDER, ur));
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te3 = c4710vl.f32306d;
                Xf xf3 = Xf.RQ_FAIL_PAYMENT_ORDER;
                Ur ur2 = Ur.PAY_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                String str = "";
                if (description == null) {
                    description = "";
                }
                Pair pair = new Pair("Description", description);
                String info = g10 != null ? g10.getInfo() : null;
                if (info != null) {
                    str = info;
                }
                te3.b(new Bi(xf3, ur2, pe2, kotlin.collections.U.j(pair, new Pair("Info", str)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        cg2 = new Cg(this, cVar);
        Object obj2 = cg2.f28765e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cg2.f28767g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r6 = Lm0.a.f17149a;
        r6.b("SPAY_REPO_EXCEPTION");
        r6.e(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(PaymentTokenRequestBody paymentTokenRequestBody, kotlin.coroutines.d dVar) {
        C4536pk c4536pk;
        int i11;
        if (dVar instanceof C4536pk) {
            c4536pk = (C4536pk) dVar;
            int i12 = c4536pk.f31807f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4536pk.f31807f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4536pk.f31805d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4536pk.f31807f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Un un = this.f32303a;
                    c4536pk.f31807f = 1;
                    if (un.b(paymentTokenRequestBody, c4536pk) == aVar) {
                        return aVar;
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
        c4536pk = new C4536pk(this, dVar);
        Object obj2 = c4536pk.f31805d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4536pk.f31807f;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008c, B:19:0x00a3, B:22:0x00ae, B:25:0x00b6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008c, B:19:0x00a3, B:22:0x00ae, B:25:0x00b6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(PaymentTokenRequestBody paymentTokenRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        C4215eh c4215eh;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof C4215eh) {
            c4215eh = (C4215eh) cVar;
            int i12 = c4215eh.f30932g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4215eh.f30932g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4215eh.f30930e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4215eh.f30932g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(Xf.RQ_PAYMENT_TOKEN, Ur.PAY_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        c4215eh.f30929d = this;
                        c4215eh.f30932g = 1;
                        obj = un.a(paymentTokenRequestBody, c4215eh);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = c4215eh.f30929d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4710vl.f32306d;
                    Xf xf2 = Xf.RQ_GOOD_PAYMENT_TOKEN;
                    Ur ur = Ur.PAY_VIEW;
                    te2.b(new Bi(xf2, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((PaymentTokenResponseBody) AbstractC4184de.a(response, c4710vl.f32306d, Xf.RS_GOOD_PAYMENT_TOKEN, Xf.RS_FAIL_PAYMENT_TOKEN, ur));
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te3 = c4710vl.f32306d;
                Xf xf3 = Xf.RQ_FAIL_PAYMENT_TOKEN;
                Ur ur2 = Ur.PAY_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te3.b(new Bi(xf3, ur2, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        c4215eh = new C4215eh(this, cVar);
        Object obj2 = c4215eh.f30930e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4215eh.f30932g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x002a, B:12:0x0068, B:16:0x008a, B:26:0x00af, B:28:0x00c1, B:31:0x00cc, B:34:0x00d6), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(SdkAuthRequestBody sdkAuthRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        Kh kh2;
        int i11;
        C4710vl c4710vl;
        Object sdkAuthResponseBody;
        C4654tn c4654tn;
        ContentResponse.Success success;
        SdkAuthResponseBody sdkAuthResponseBody2;
        boolean j11;
        if (cVar instanceof Kh) {
            kh2 = (Kh) cVar;
            int i12 = kh2.f29357g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kh2.f29357g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = kh2.f29355e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = kh2.f29357g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(S.RQ_SDK_AUTH, Ur.AUTH_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        String m11 = M1.b.m("c2JlcnBheS1hdXRoL3YyL3Nka0F1dGg=");
                        kh2.f29354d = this;
                        kh2.f29357g = 1;
                        obj = un.a(m11, sdkAuthRequestBody, kh2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        e = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(e);
                        c4710vl.f32307e.getClass();
                        sdkAuthResponseBody = new ContentResponse.Failure(C4131bj.b(e));
                        c4654tn = (C4654tn) c4710vl.f32304b;
                        c4654tn.getClass();
                        Intrinsics.checkNotNullParameter(sdkAuthResponseBody, "sdkAuthResponseBody");
                        if (sdkAuthResponseBody instanceof ContentResponse.Success) {
                        }
                        if (success != null) {
                        }
                        return sdkAuthResponseBody;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = kh2.f29354d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(e);
                        c4710vl.f32307e.getClass();
                        sdkAuthResponseBody = new ContentResponse.Failure(C4131bj.b(e));
                        c4654tn = (C4654tn) c4710vl.f32304b;
                        c4654tn.getClass();
                        Intrinsics.checkNotNullParameter(sdkAuthResponseBody, "sdkAuthResponseBody");
                        if (sdkAuthResponseBody instanceof ContentResponse.Success) {
                        }
                        if (success != null) {
                        }
                        return sdkAuthResponseBody;
                    }
                }
                Response response = (Response) obj;
                Te te2 = c4710vl.f32306d;
                S s11 = S.ST_SAVE_REFRESH;
                Ur ur = Ur.AUTH_VIEW;
                te2.b(new Bi(s11, ur, Pe.ST_SAVE, null, null, null, null, 120));
                j11 = M1.b.j(response);
                Te te3 = c4710vl.f32306d;
                if (j11) {
                    SPayErrorDto g10 = M1.b.g(response.errorBody());
                    S s12 = S.RQ_FAIL_SDK_AUTH;
                    Pe pe2 = Pe.RQ_FAIL;
                    int code = response.code();
                    String errorCode = g10 != null ? g10.getErrorCode() : null;
                    String description = g10 != null ? g10.getDescription() : null;
                    if (description == null) {
                        description = "";
                    }
                    te3.b(new Bi(s12, ur, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                    sdkAuthResponseBody = new ContentResponse.Failure(c4710vl.c(response, g10));
                } else {
                    te3.b(new Bi(S.RQ_GOOD_SDK_AUTH, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    sdkAuthResponseBody = new ContentResponse.Success((SdkAuthResponseBody) AbstractC4184de.a(response, te3, S.RS_GOOD_SDK_AUTH, S.RS_FAIL_SDK_AUTH, ur));
                }
                c4654tn = (C4654tn) c4710vl.f32304b;
                c4654tn.getClass();
                Intrinsics.checkNotNullParameter(sdkAuthResponseBody, "sdkAuthResponseBody");
                success = sdkAuthResponseBody instanceof ContentResponse.Success ? (ContentResponse.Success) sdkAuthResponseBody : null;
                if (success != null && (sdkAuthResponseBody2 = (SdkAuthResponseBody) success.getData()) != null) {
                    c4654tn.f32137f.setValue(sdkAuthResponseBody2.getUserInfo().toModel());
                }
                return sdkAuthResponseBody;
            }
        }
        kh2 = new Kh(this, cVar);
        Object obj2 = kh2.f29355e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = kh2.f29357g;
        if (i11 != 0) {
        }
        Response response2 = (Response) obj2;
        Te te22 = c4710vl.f32306d;
        S s112 = S.ST_SAVE_REFRESH;
        Ur ur2 = Ur.AUTH_VIEW;
        te22.b(new Bi(s112, ur2, Pe.ST_SAVE, null, null, null, null, 120));
        j11 = M1.b.j(response2);
        Te te32 = c4710vl.f32306d;
        if (j11) {
        }
        c4654tn = (C4654tn) c4710vl.f32304b;
        c4654tn.getClass();
        Intrinsics.checkNotNullParameter(sdkAuthResponseBody, "sdkAuthResponseBody");
        if (sdkAuthResponseBody instanceof ContentResponse.Success) {
        }
        if (success != null) {
            c4654tn.f32137f.setValue(sdkAuthResponseBody2.getUserInfo().toModel());
        }
        return sdkAuthResponseBody;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x009f, B:19:0x00b6, B:22:0x00c1, B:26:0x00cc, B:28:0x00d5, B:31:0x00dd), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x009f, B:19:0x00b6, B:22:0x00c1, B:26:0x00cc, B:28:0x00d5, B:31:0x00dd), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(SessionIdRequestBody sessionIdRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        C4331ii c4331ii;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof C4331ii) {
            c4331ii = (C4331ii) cVar;
            int i12 = c4331ii.f31306g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4331ii.f31306g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4331ii.f31304e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4331ii.f31306g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(S.RQ_SESSION_ID, Ur.AUTH_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        c4331ii.f31303d = this;
                        c4331ii.f31306g = 1;
                        obj = un.a(sessionIdRequestBody, c4331ii);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = c4331ii.f31303d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4710vl.f32306d;
                    S s11 = S.RQ_GOOD_SESSION_ID;
                    Ur ur = Ur.AUTH_VIEW;
                    te2.b(new Bi(s11, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    SessionIdResponseBody sessionIdResponseBody = (SessionIdResponseBody) AbstractC4184de.a(response, c4710vl.f32306d, S.RS_GOOD_SESSION_ID, S.RS_FAIL_SESSION_ID, ur);
                    Vm vm = c4710vl.f32304b;
                    ContentResponse.Success response2 = new ContentResponse.Success(sessionIdResponseBody);
                    C4654tn c4654tn = (C4654tn) vm;
                    c4654tn.getClass();
                    Intrinsics.checkNotNullParameter(response2, "response");
                    c4654tn.f32134c = response2;
                    return new ContentResponse.Success(sessionIdResponseBody);
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te3 = c4710vl.f32306d;
                S s12 = S.RQ_FAIL_SESSION_ID;
                Ur ur2 = Ur.AUTH_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                String str = "";
                if (description == null) {
                    description = "";
                }
                Pair pair = new Pair("Description", description);
                String info = g10 != null ? g10.getInfo() : null;
                if (info != null) {
                    str = info;
                }
                te3.b(new Bi(s12, ur2, pe2, kotlin.collections.U.j(pair, new Pair("Info", str)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        c4331ii = new C4331ii(this, cVar);
        Object obj2 = c4331ii.f31304e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4331ii.f31306g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008c, B:19:0x00a3, B:22:0x00ae, B:25:0x00b6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c A[Catch: Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008c, B:19:0x00a3, B:22:0x00ae, B:25:0x00b6), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(SpasiboBonusesRequestBody spasiboBonusesRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        Ji ji2;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof Ji) {
            ji2 = (Ji) cVar;
            int i12 = ji2.f29297g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                ji2.f29297g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = ji2.f29295e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = ji2.f29297g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(Xf.RQ_ORDER_SPASIBO_BONUSES, Ur.AUTH_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        ji2.f29294d = this;
                        ji2.f29297g = 1;
                        obj = un.a(spasiboBonusesRequestBody, ji2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = ji2.f29294d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4710vl.f32306d;
                    S s11 = S.RQ_GOOD_SPASIBO_BONUSES;
                    Ur ur = Ur.AUTH_VIEW;
                    te2.b(new Bi(s11, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((SpasiboBonusesResponseBody) AbstractC4184de.a(response, c4710vl.f32306d, S.RS_GOOD_SPASIBO_BONUSES, S.RS_FAIL_SPASIBO_BONUSES, ur));
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te3 = c4710vl.f32306d;
                S s12 = S.RQ_FAIL_SPASIBO_BONUSES;
                Ur ur2 = Ur.AUTH_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te3.b(new Bi(s12, ur2, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        ji2 = new Ji(this, cVar);
        Object obj2 = ji2.f29295e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = ji2.f29297g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0060, B:14:0x0068, B:17:0x00a0, B:19:0x00b7, B:22:0x00c2, B:25:0x00ca), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0060, B:14:0x0068, B:17:0x00a0, B:19:0x00b7, B:22:0x00c2, B:25:0x00ca), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(ListOfCardsRequestBody listOfCardsRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        Cf cf2;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof Cf) {
            cf2 = (Cf) cVar;
            int i12 = cf2.f28763h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cf2.f28763h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cf2.f28761f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cf2.f28763h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(Xf.RQ_PAYMENT_ACCOUNTS, Ur.AUTH_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        cf2.f28759d = this;
                        cf2.f28760e = listOfCardsRequestBody;
                        cf2.f28763h = 1;
                        obj = un.a(listOfCardsRequestBody, cf2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    listOfCardsRequestBody = cf2.f28760e;
                    c4710vl = cf2.f28759d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!M1.b.j(response)) {
                    Te te2 = c4710vl.f32306d;
                    Xf xf2 = Xf.RQ_GOOD_PAYMENT_ACCOUNTS;
                    Ur ur = Ur.AUTH_VIEW;
                    te2.b(new Bi(xf2, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) AbstractC4184de.a(response, c4710vl.f32306d, Xf.RS_GOOD_PAYMENT_ACCOUNTS, Xf.RS_FAIL_PAYMENT_ACCOUNTS, ur);
                    ((C4654tn) c4710vl.f32304b).e(new ContentResponse.Success(listOfCardsResponseBody), listOfCardsRequestBody.getPriorityCardOnly());
                    return new ContentResponse.Success(listOfCardsResponseBody);
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                Te te3 = c4710vl.f32306d;
                Xf xf3 = Xf.RQ_FAIL_PAYMENT_ACCOUNTS;
                Ur ur2 = Ur.AUTH_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te3.b(new Bi(xf3, ur2, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c4710vl.c(response, g10));
            }
        }
        cf2 = new Cf(this, cVar);
        Object obj2 = cf2.f28761f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cf2.f28763h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!M1.b.j(response)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008a, B:19:0x00a5, B:22:0x00b0, B:25:0x00b8), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0064, B:17:0x008a, B:19:0x00a5, B:22:0x00b0, B:25:0x00b8), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(PayBindingRequestBody payBindingRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        Oj oj2;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        if (cVar instanceof Oj) {
            oj2 = (Oj) cVar;
            int i12 = oj2.f29634g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                oj2.f29634g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = oj2.f29632e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = oj2.f29634g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f32306d.b(new Bi(EnumC4568qn.RQ_PAY_BINDING_V2, Ur.OTP_VIEW, Pe.RQ, null, null, null, null, 120));
                    try {
                        Un un = this.f32303a;
                        oj2.f29631d = this;
                        oj2.f29634g = 1;
                        obj = un.b(payBindingRequestBody, oj2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = oj2.f29631d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                if (!response.isSuccessful()) {
                    Te te2 = c4710vl.f32306d;
                    EnumC4568qn enumC4568qn = EnumC4568qn.RQ_GOOD_PAY_BINDING_V2;
                    Ur ur = Ur.OTP_VIEW;
                    te2.b(new Bi(enumC4568qn, ur, Pe.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success(AbstractC4184de.a(response, c4710vl.f32306d, EnumC4568qn.RS_GOOD_PAY_BINDING, EnumC4568qn.RS_FAIL_PAY_BINDING, ur));
                }
                SPayErrorDto g10 = M1.b.g(response.errorBody());
                ErrorEntity c11 = c4710vl.c(response, g10);
                Te te3 = c4710vl.f32306d;
                EnumC4568qn enumC4568qn2 = EnumC4568qn.RQ_FAIL_PAY_BINDING_V2;
                Ur ur2 = Ur.OTP_VIEW;
                Pe pe2 = Pe.RQ_FAIL;
                int code = response.code();
                String errorCode = g10 != null ? g10.getErrorCode() : null;
                String description = g10 != null ? g10.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                te3.b(new Bi(enumC4568qn2, ur2, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                return new ContentResponse.Failure(c11);
            }
        }
        oj2 = new Oj(this, cVar);
        Object obj2 = oj2.f29632e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = oj2.f29634g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0065, B:16:0x008b, B:17:0x00b4, B:20:0x00bc, B:22:0x00cb, B:25:0x00d3, B:27:0x00df, B:29:0x00e5, B:31:0x00ed, B:33:0x00f8, B:34:0x00fc, B:36:0x00a0, B:37:0x0108, B:39:0x011e, B:42:0x0129, B:45:0x0131), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x005c, B:14:0x0065, B:16:0x008b, B:17:0x00b4, B:20:0x00bc, B:22:0x00cb, B:25:0x00d3, B:27:0x00df, B:29:0x00e5, B:31:0x00ed, B:33:0x00f8, B:34:0x00fc, B:36:0x00a0, B:37:0x0108, B:39:0x011e, B:42:0x0129, B:45:0x0131), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        C4815ze c4815ze;
        int i11;
        Exception exc;
        C4710vl c4710vl;
        Response response;
        List<SixPartPay> sixPartPay;
        SixPartPay sixPartPay2;
        if (cVar instanceof C4815ze) {
            c4815ze = (C4815ze) cVar;
            int i12 = c4815ze.f32652g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4815ze.f32652g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4815ze.f32650e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4815ze.f32652g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    try {
                        this.f32306d.b(new Bi(S.RQ_CREATE_PAYMENT_PLAN, Ur.AUTH_VIEW, Pe.RQ, null, null, null, null, 120));
                        Un un = this.f32303a;
                        c4815ze.f32649d = this;
                        c4815ze.f32652g = 1;
                        obj = un.a(paymentBnplPlanRequestBody, c4815ze);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c4710vl = this;
                    } catch (Exception e11) {
                        exc = e11;
                        c4710vl = this;
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("SPAY_REPO_EXCEPTION");
                        bVar.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4710vl = c4815ze.f32649d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("SPAY_REPO_EXCEPTION");
                        bVar2.e(exc);
                        c4710vl.f32307e.getClass();
                        return new ContentResponse.Failure(C4131bj.b(exc));
                    }
                }
                response = (Response) obj;
                r1 = null;
                r1 = null;
                Integer num = null;
                if (M1.b.j(response)) {
                    SPayErrorDto g10 = M1.b.g(response.errorBody());
                    Te te2 = c4710vl.f32306d;
                    S s11 = S.RQ_FAIL_CREATE_PAYMENT_PLAN;
                    Ur ur = Ur.AUTH_VIEW;
                    Pe pe2 = Pe.RQ_FAIL;
                    int code = response.code();
                    String errorCode = g10 != null ? g10.getErrorCode() : null;
                    String description = g10 != null ? g10.getDescription() : null;
                    if (description == null) {
                        description = "";
                    }
                    te2.b(new Bi(s11, ur, pe2, kotlin.collections.U.i(new Pair("Description", description)), new Integer(code), errorCode, null, 64));
                    return new ContentResponse.Failure(c4710vl.c(response, g10));
                }
                Te te3 = c4710vl.f32306d;
                S s12 = S.RQ_GOOD_CREATE_PAYMENT_PLAN;
                Ur ur2 = Ur.AUTH_VIEW;
                te3.b(new Bi(s12, ur2, Pe.RQ_GOOD, null, null, null, null, 120));
                PartsPaymentPlanBnplResponseBody partsPaymentPlanBnplResponseBody = (PartsPaymentPlanBnplResponseBody) AbstractC4184de.a(response, te3, S.RS_GOOD_CREATE_PAYMENT_PLAN, S.RS_FAIL_CREATE_PAYMENT_PLAN, ur2);
                if (partsPaymentPlanBnplResponseBody.isBnplEnabled()) {
                    te3.b(new Bi(Xf.LC_PAY_BNPL_AVAILABLE, Ur.NONE, Pe.LC, null, null, null, null, 120));
                } else {
                    te3.b(new Bi(Xf.LC_PAY_BNPL_UNAVAILABLE, Ur.NONE, Pe.LC, null, null, null, null, 120));
                }
                boolean isBnplEnabled = partsPaymentPlanBnplResponseBody.isBnplEnabled();
                Vm vm = c4710vl.f32304b;
                if (!isBnplEnabled && Intrinsics.d(((C4654tn) vm).j(), PayStrategy.PayWithPartsOnly.INSTANCE)) {
                    return new ContentResponse.Failure(ErrorEntity.Unknown.INSTANCE);
                }
                C4654tn c4654tn = (C4654tn) vm;
                c4654tn.g(partsPaymentPlanBnplResponseBody);
                PartsGraphBnpl graphBnpl = partsPaymentPlanBnplResponseBody.getGraphBnpl();
                if (graphBnpl != null && (sixPartPay = graphBnpl.getSixPartPay()) != null && (sixPartPay2 = sixPartPay.get(0)) != null) {
                    num = new Integer(sixPartPay2.getClientCommission());
                }
                c4654tn.f32154w = num != null ? num.intValue() : 0;
                return new ContentResponse.Success(PartsPaymentPlanBnplResponseBodyKt.mapToPaymentPlanBnplResponseBody(partsPaymentPlanBnplResponseBody));
            }
        }
        c4815ze = new C4815ze(this, cVar);
        Object obj2 = c4815ze.f32650e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4815ze.f32652g;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        num = null;
        num = null;
        Integer num2 = null;
        if (M1.b.j(response)) {
        }
    }

    public final void y(Response response, SPayErrorDto sPayErrorDto) {
        EnumC4500od enumC4500od = EnumC4500od.RQ_FAIL_PAY_ONLINE;
        Ur ur = Intrinsics.d(((C4654tn) this.f32304b).j(), PayStrategy.PartsStartPay.INSTANCE) ? Ur.PAY_VIEW : Ur.BNPL_PARTS_VIEW;
        Pe pe2 = Pe.RQ_FAIL;
        int code = response.code();
        String errorCode = sPayErrorDto != null ? sPayErrorDto.getErrorCode() : null;
        String description = sPayErrorDto != null ? sPayErrorDto.getDescription() : null;
        if (description == null) {
            description = "";
        }
        this.f32306d.b(new Bi(enumC4500od, ur, pe2, C2454a.b("Description", description), Integer.valueOf(code), errorCode, null, 64));
    }
}
