package Ve;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.ErrorCode;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.SessionIdResponseBody;

/* loaded from: classes6.dex */
public final class R4 extends Yk {

    /* renamed from: c, reason: collision with root package name */
    public final Y9 f29820c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4686uq f29821d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC4801z0 f29822e;

    /* renamed from: f, reason: collision with root package name */
    public final Ae.x0 f29823f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R4(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Ib sPayStorage, InterfaceC4686uq authHandler) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        String deeplink;
        String q11;
        String a11;
        L5 l52;
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        this.f29820c = sPaySdkReducer;
        this.f29821d = authHandler;
        String str = null;
        Ae.x0 a12 = Ae.O0.a(new L5(null));
        this.f29823f = a12;
        int a13 = Em.a(Wk.f30290b);
        boolean z11 = a13 == 3 || a13 == 4;
        AbstractC4245fi abstractC4245fi = ((Fh) ((C4673ud) sPayStorage).f32205b.getValue()).f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.HandleWebViewAuthorizationWithPhoneNumber");
        C4655to c4655to = (C4655to) abstractC4245fi;
        this.f29822e = c4655to.f32159b;
        SessionIdResponseBody l11 = ((C4654tn) this.f30498b).l();
        if (l11 != null && (deeplink = l11.getDeeplink()) != null && (q11 = M1.b.q(deeplink)) != null) {
            Uri parse = Uri.parse(q11);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            if (parse != null) {
                MerchantData merchantData = ((C4654tn) this.f30498b).f32130G;
                if (merchantData == null) {
                    throw L3.f29386a;
                }
                String appPackage = merchantData.getAppPackage();
                if (Wk.f30290b == 7) {
                    str = "fba99220-c3f6-424d-bbfc-f78e293d1d91";
                } else {
                    SessionIdResponseBody l12 = ((C4654tn) this.f30498b).l();
                    if (l12 != null) {
                        str = l12.getClientIdPhone();
                    }
                }
                String queryParameter = parse.getQueryParameter("scope");
                String str2 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
                queryParameter = queryParameter == null ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : queryParameter;
                String queryParameter2 = parse.getQueryParameter("state");
                queryParameter2 = queryParameter2 == null ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : queryParameter2;
                String queryParameter3 = parse.getQueryParameter("nonce");
                queryParameter3 = queryParameter3 == null ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : queryParameter3;
                String queryParameter4 = parse.getQueryParameter("code_challenge");
                String str3 = queryParameter4 == null ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : queryParameter4;
                boolean z12 = z11;
                String queryParameter5 = parse.getQueryParameter("code_challenge_method");
                str2 = queryParameter5 != null ? queryParameter5 : str2;
                String queryParameter6 = parse.getQueryParameter("redirect_uri");
                queryParameter6 = queryParameter6 == null ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : queryParameter6;
                Uri.Builder scheme = new Uri.Builder().scheme("https");
                switch (Em.a(Wk.f30290b)) {
                    case 0:
                        a11 = C4515p.a("IyNwZRApIXQkOy0HaiI4CRYsQEA=");
                        break;
                    case 1:
                        a11 = C4515p.a("IyN8GDYiOBEZFzEPIxQxAxAiOQkWLEBA");
                        break;
                    case 2:
                        a11 = C4515p.a("IyN8GDYiOBEZFzEPIxRxFw8gOQkWLEBA");
                        break;
                    case 3:
                    case 4:
                        a11 = C4515p.a("IyN8GDYiOBEZFzEPIxRxFw8gOQkWLEBA");
                        break;
                    case 5:
                    case 6:
                        a11 = C4515p.a("IyNwZRApIXQkOy0HaiI4CRYsQEA=");
                        break;
                    default:
                        throw new Sc.o();
                }
                Uri build = scheme.authority(a11).path("CSAFront/oidc/authorize.do").appendQueryParameter("client_id", str).appendQueryParameter("scope", queryParameter).appendQueryParameter("code_challenge_method", str2).appendQueryParameter("nonce", queryParameter3).appendQueryParameter("state", queryParameter2).appendQueryParameter("code_challenge", str3).appendQueryParameter("redirect_uri", queryParameter6).appendQueryParameter("response_type", "code").appendQueryParameter("login_hint", c4655to.f32158a).appendQueryParameter("client_type", "PRIVATE").appendQueryParameter("package", appPackage).build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…age)\n            .build()");
                if (z12) {
                    Uri parse2 = Uri.parse("https://google.com");
                    Intrinsics.checkNotNullExpressionValue(parse2, "parse(this)");
                    l52 = new L5(parse2);
                } else {
                    l52 = new L5(build);
                }
                a12.setValue(l52);
                return;
            }
        }
        throw C4485nr.f31692a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(InterfaceC4195dq event) {
        Ki ki2;
        String str;
        String queryParameter;
        int ordinal;
        Ki o02;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean equals = event.equals(Uo.f30144a);
        Y9 y92 = this.f29820c;
        if (equals) {
            ((C4238fb) y92).b(new O0(new Jr(new C4404l4(this, null))));
            return;
        }
        boolean z11 = event instanceof C4826zp;
        Vf vf2 = Vf.f30201a;
        EnumC4801z0 enumC4801z0 = this.f29822e;
        if (!z11) {
            if (event.equals(C4713vo.f32315a)) {
                int ordinal2 = enumC4801z0.ordinal();
                if (ordinal2 == 0) {
                    ki2 = C4825zo.f32678a;
                } else {
                    if (ordinal2 != 1) {
                        throw new Sc.o();
                    }
                    ki2 = new Oc(vf2, false);
                }
                ((C4238fb) y92).b(ki2);
                return;
            }
            return;
        }
        Uri uri = ((C4826zp) event).f32679a;
        String queryParameter2 = uri != null ? uri.getQueryParameter("state") : null;
        if (Wk.f30290b == 7) {
            queryParameter = "E9604229-C3CC-D584-070A-DE59D36A78C3";
        } else {
            if (uri == null) {
                str = null;
                boolean z12 = queryParameter2 == null && str != null;
                ordinal = enumC4801z0.ordinal();
                InterfaceC4686uq interfaceC4686uq = this.f29821d;
                if (ordinal == 0) {
                    if (ordinal != 1) {
                        throw new Sc.o();
                    }
                    if (z12) {
                        ((Yq) interfaceC4686uq).f30521b = true;
                        o02 = new Wm(vf2, null, false);
                    } else {
                        o02 = new Oc(vf2, false);
                    }
                } else if (z12) {
                    ((Yq) interfaceC4686uq).f30521b = true;
                    o02 = new Dg(new V8(Boolean.TRUE, queryParameter2, null, str, 52), SdkAuthRequestBody.AuthMethod.PHONE);
                } else {
                    o02 = new O0(new Cb(new ErrorEntity.ApiError("-11", "Не удалось авторизоваться по НМТ")));
                }
                ((C4238fb) y92).b(o02);
            }
            queryParameter = uri.getQueryParameter("code");
        }
        str = queryParameter;
        if (queryParameter2 == null) {
        }
        ordinal = enumC4801z0.ordinal();
        InterfaceC4686uq interfaceC4686uq2 = this.f29821d;
        if (ordinal == 0) {
        }
        ((C4238fb) y92).b(o02);
    }
}
