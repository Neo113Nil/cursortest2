package Ve;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.RedirectActivity;
import spay.sdk.api.ErrorCode;
import spay.sdk.domain.model.FakeBankAuthData;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.domain.model.response.SessionIdResponseBody;
import x2.InterfaceC10646a;
import xe.C10737n;

/* renamed from: Ve.n5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4463n5 implements InterfaceC4228f1 {

    /* renamed from: a, reason: collision with root package name */
    public final Vm f31622a;

    /* renamed from: b, reason: collision with root package name */
    public final Te f31623b;

    /* renamed from: c, reason: collision with root package name */
    public final C4776y3 f31624c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4686uq f31625d;

    /* renamed from: e, reason: collision with root package name */
    public final Y9 f31626e;

    /* renamed from: f, reason: collision with root package name */
    public final Vl f31627f;

    /* renamed from: g, reason: collision with root package name */
    public final Fa f31628g;

    public C4463n5(Vm sPayDataContract, Te metricFacade, C4776y3 bankAuthenticationContract, InterfaceC4686uq authHandler, Y9 sPaySdkReducer, Vl sPaySdkConfigRepository, Fa sidLoginManager) {
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(bankAuthenticationContract, "bankAuthenticationContract");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        Intrinsics.checkNotNullParameter(sidLoginManager, "sidLoginManager");
        this.f31622a = sPayDataContract;
        this.f31623b = metricFacade;
        this.f31624c = bankAuthenticationContract;
        this.f31625d = authHandler;
        this.f31626e = sPaySdkReducer;
        this.f31627f = sPaySdkConfigRepository;
        this.f31628g = sidLoginManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.InterfaceC4228f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RedirectActivity context, kotlin.coroutines.d dVar) {
        C4116b4 c4116b4;
        int i11;
        C4463n5 c4463n5;
        SPaySdkConfig sPaySdkConfig;
        String str;
        ArrayList<SPaySdkConfig.Schema> schemas;
        Iterator<T> it;
        Object obj;
        SPaySdkConfig.Schema schema;
        String bankAppAuthUri;
        String stand;
        if (dVar instanceof C4116b4) {
            c4116b4 = (C4116b4) dVar;
            int i12 = c4116b4.f30710h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4116b4.f30710h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c4116b4.f30708f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4116b4.f30710h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    c4116b4.f30706d = this;
                    c4116b4.f30707e = context;
                    c4116b4.f30710h = 1;
                    obj2 = ((C4712vn) this.f31627f).a(c4116b4);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    c4463n5 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = c4116b4.f30707e;
                    c4463n5 = c4116b4.f30706d;
                    Sc.s.b(obj2);
                }
                sPaySdkConfig = (SPaySdkConfig) obj2;
                str = null;
                if (sPaySdkConfig != null && (schemas = sPaySdkConfig.getSchemas()) != null) {
                    it = schemas.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        SPaySdkConfig.Schema schema2 = (SPaySdkConfig.Schema) obj;
                        if (Intrinsics.d((schema2 == null || (stand = schema2.getStand()) == null) ? null : M1.b.m(stand), E.e())) {
                            break;
                        }
                    }
                    schema = (SPaySdkConfig.Schema) obj;
                    if (schema != null && (bankAppAuthUri = schema.getBankAppAuthUri()) != null) {
                        str = M1.b.m(bankAppAuthUri);
                    }
                }
                Fa fa2 = c4463n5.f31628g;
                Intrinsics.checkNotNullParameter(context, "context");
                if (str == null) {
                    str = M1.b.m("c2JlcmJhbmtpZGxvZ2luOi8vc2JlcmJhbmtpZA==");
                }
                Uri parse = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                boolean z11 = new Intent("android.intent.action.VIEW", parse).resolveActivity(context.getPackageManager()) != null;
                c4463n5.f31623b.b(new Bi(z11 ? Ld.LC_BANK_APP_FOUND : Ld.LC_NO_BANK_APP_FOUND, Ur.MERCHANT_VIEW, Pe.LC, null, null, null, null, 120));
                return Boolean.valueOf(!z11);
            }
        }
        c4116b4 = new C4116b4(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj22 = c4116b4.f30708f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4116b4.f30710h;
        if (i11 != 0) {
        }
        sPaySdkConfig = (SPaySdkConfig) obj22;
        str = null;
        if (sPaySdkConfig != null) {
            it = schemas.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            schema = (SPaySdkConfig.Schema) obj;
            if (schema != null) {
                str = M1.b.m(bankAppAuthUri);
            }
        }
        Fa fa22 = c4463n5.f31628g;
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
        }
        Uri parse2 = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse2, "parse(this)");
        if (new Intent("android.intent.action.VIEW", parse2).resolveActivity(context.getPackageManager()) != null) {
        }
        c4463n5.f31623b.b(new Bi(z11 ? Ld.LC_BANK_APP_FOUND : Ld.LC_NO_BANK_APP_FOUND, Ur.MERCHANT_VIEW, Pe.LC, null, null, null, null, 120));
        return Boolean.valueOf(!z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [Ve.c5, x2.a] */
    @Override // Ve.InterfaceC4228f1
    public final Object b(RedirectActivity redirectActivity, EnumC4801z0 enumC4801z0, kotlin.coroutines.d frame) {
        String deeplink;
        String q11;
        String str;
        final C4463n5 c4463n5;
        final EnumC4801z0 enumC4801z02;
        final RedirectActivity redirectActivity2;
        final C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        C4654tn c4654tn = (C4654tn) this.f31622a;
        SessionIdResponseBody l11 = c4654tn.l();
        if (l11 != null && (deeplink = l11.getDeeplink()) != null && (q11 = M1.b.q(deeplink)) != null) {
            Uri parse = Uri.parse(q11);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            if (parse != null) {
                String clientID = parse.getQueryParameter("client_id");
                if (clientID == null) {
                    clientID = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
                }
                Intrinsics.checkNotNullExpressionValue(clientID, "deepLink.getQueryParamet…ID) ?: STRING_UNAVAILABLE");
                String scope = parse.getQueryParameter("scope");
                if (scope == null) {
                    scope = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
                }
                Intrinsics.checkNotNullExpressionValue(scope, "deepLink.getQueryParamet…PE) ?: STRING_UNAVAILABLE");
                String state = parse.getQueryParameter("state");
                if (state == null) {
                    state = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
                }
                Intrinsics.checkNotNullExpressionValue(state, "deepLink.getQueryParamet…TE) ?: STRING_UNAVAILABLE");
                String nonce = parse.getQueryParameter("nonce");
                if (nonce == null) {
                    nonce = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
                    str = nonce;
                } else {
                    str = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
                }
                Intrinsics.checkNotNullExpressionValue(nonce, "deepLink.getQueryParamet…CE) ?: STRING_UNAVAILABLE");
                String queryParameter = parse.getQueryParameter("code_challenge");
                String str2 = queryParameter == null ? str : queryParameter;
                Intrinsics.checkNotNullExpressionValue(str2, "deepLink.getQueryParamet…GE) ?: STRING_UNAVAILABLE");
                String queryParameter2 = parse.getQueryParameter("code_challenge_method");
                String str3 = queryParameter2 == null ? str : queryParameter2;
                Intrinsics.checkNotNullExpressionValue(str3, "deepLink.getQueryParamet…OD) ?: STRING_UNAVAILABLE");
                String redirectUri = parse.getQueryParameter("redirect_uri");
                if (redirectUri == null) {
                    redirectUri = str;
                }
                Intrinsics.checkNotNullExpressionValue(redirectUri, "deepLink.getQueryParamet…RI) ?: STRING_UNAVAILABLE");
                Intrinsics.checkNotNullParameter(clientID, "clientID");
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(nonce, "nonce");
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                Uri parse2 = Uri.parse(M1.b.m("c2JlcmJhbmtpZGxvZ2luOi8vc2JlcmJhbmtpZA=="));
                Intrinsics.checkNotNullExpressionValue(parse2, "parse(this)");
                Uri.Builder buildUpon = parse2.buildUpon();
                buildUpon.appendQueryParameter("code_challenge", str2);
                buildUpon.appendQueryParameter("code_challenge_method", str3);
                buildUpon.appendQueryParameter("client_id", clientID);
                buildUpon.appendQueryParameter("scope", scope);
                buildUpon.appendQueryParameter("state", state);
                buildUpon.appendQueryParameter("nonce", nonce);
                buildUpon.appendQueryParameter("redirect_uri", redirectUri);
                Uri build = buildUpon.build();
                Intrinsics.checkNotNullExpressionValue(build, "uri.buildUpon().apply {\n…                }.build()");
                Uri.Builder buildUpon2 = build.buildUpon();
                MerchantData merchantData = c4654tn.f32130G;
                if (merchantData == null) {
                    throw L3.f29386a;
                }
                Uri uri = buildUpon2.appendQueryParameter("package", merchantData.getAppPackage()).build();
                Intrinsics.checkNotNullExpressionValue(uri, "with(sPayDataContract) {…           .build()\n    }");
                if (Wk.f30290b == 6) {
                    c4463n5 = this;
                    ((C4238fb) c4463n5.f31626e).b(X9.f30343a);
                    redirectActivity2 = redirectActivity;
                    enumC4801z02 = enumC4801z0;
                } else {
                    c4463n5 = this;
                    Fa fa2 = c4463n5.f31628g;
                    RedirectActivity context = redirectActivity;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    fa2.f28983a = uri.getQueryParameter("state");
                    fa2.f28984b = uri.getQueryParameter("nonce");
                    context.startActivity(new Intent("android.intent.action.VIEW", uri.buildUpon().appendQueryParameter("auth_type", "app2app").build()));
                    c4463n5.f31624c.f32533a = false;
                    EnumC4801z0 enumC4801z03 = EnumC4801z0.f32616b;
                    Te te2 = c4463n5.f31623b;
                    enumC4801z02 = enumC4801z0;
                    if (enumC4801z02 == enumC4801z03) {
                        te2.b(new Bi(Xf.LC_BANK_APP_AUTH, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120));
                        redirectActivity2 = context;
                    } else {
                        te2.b(new Bi(S.LC_BANK_APP_SDK_AUTH, Ur.AUTH_VIEW, Pe.LC, null, null, null, null, 120));
                        redirectActivity2 = context;
                    }
                }
                ?? r02 = new InterfaceC10646a() { // from class: Ve.c5
                    @Override // x2.InterfaceC10646a
                    public final void accept(Object obj) {
                        V8 v82;
                        U2 u22;
                        int i11;
                        Intent intent = (Intent) obj;
                        C4463n5 this$0 = C4463n5.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        RedirectActivity activity = redirectActivity2;
                        Intrinsics.checkNotNullParameter(activity, "$activity");
                        EnumC4801z0 reason = enumC4801z02;
                        Intrinsics.checkNotNullParameter(reason, "$reason");
                        C10737n cancellableContinuation = c10737n;
                        Intrinsics.checkNotNullParameter(cancellableContinuation, "$cancellableContinuation");
                        Bundle extras = intent.getExtras();
                        if ((extras == null || !extras.containsKey("FAKE_BANK_AUTH_INTENT_KEY")) && intent.getData() == null) {
                            return;
                        }
                        Intrinsics.checkNotNullExpressionValue(intent, "intent");
                        this$0.getClass();
                        int i12 = Wk.f30290b;
                        if (i12 == 6) {
                            Parcelable parcelableExtra = intent.getParcelableExtra("FAKE_BANK_AUTH_INTENT_KEY");
                            FakeBankAuthData fakeBankAuthData = parcelableExtra instanceof FakeBankAuthData ? (FakeBankAuthData) parcelableExtra : null;
                            v82 = fakeBankAuthData != null ? new V8(Boolean.TRUE, fakeBankAuthData.getState(), fakeBankAuthData.getNonce(), fakeBankAuthData.getAuthCode(), 48) : new V8(Boolean.FALSE, null, null, null, 62);
                        } else {
                            Fa fa3 = this$0.f31628g;
                            if (i12 == 5 || i12 == 4) {
                                V8 a11 = fa3.a(intent);
                                v82 = new V8(Boolean.TRUE, a11.f30184b, a11.f30185c, a11.f30186d, 48);
                            } else {
                                v82 = fa3.a(intent);
                            }
                        }
                        Context baseContext = activity.getBaseContext();
                        Intrinsics.checkNotNullExpressionValue(baseContext, "activity.baseContext");
                        Boolean bool = v82.f30183a;
                        Boolean bool2 = Boolean.TRUE;
                        boolean d11 = Intrinsics.d(bool, bool2);
                        Te te3 = this$0.f31623b;
                        if (d11) {
                            if (reason == EnumC4801z0.f32616b) {
                                te3.b(new Bi(Xf.LC_BANK_APP_AUTH_GOOD, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120));
                            } else {
                                te3.b(new Bi(S.LC_BANK_APP_SDK_AUTH_GOOD, Ur.AUTH_VIEW, Pe.LC, null, null, null, null, 120));
                            }
                            u22 = new U2(v82, null, true, 2);
                        } else if (Intrinsics.d(v82.f30183a, bool2) || !((i11 = Wk.f30290b) == 5 || i11 == 4)) {
                            if (reason == EnumC4801z0.f32616b) {
                                te3.b(new Bi(Xf.LC_BANK_APP_AUTH_FAIL, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120));
                            } else {
                                te3.b(new Bi(S.LC_BANK_APP_SDK_AUTH_FAIL, Ur.AUTH_VIEW, Pe.LC, null, null, null, null, 120));
                            }
                            u22 = new U2(null, baseContext.getString(R.string.spay_exception_bank_auth_failed), false, 1);
                        } else {
                            if (reason == EnumC4801z0.f32616b) {
                                te3.b(new Bi(Xf.LC_BANK_APP_AUTH_GOOD, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120));
                            } else {
                                te3.b(new Bi(S.LC_BANK_APP_SDK_AUTH_GOOD, Ur.AUTH_VIEW, Pe.LC, null, null, null, null, 120));
                            }
                            u22 = new U2(v82, null, true, 2);
                        }
                        boolean z11 = u22.f30093c;
                        InterfaceC4686uq interfaceC4686uq = this$0.f31625d;
                        if (z11) {
                            ((Yq) interfaceC4686uq).f30521b = true;
                        } else {
                            ((Yq) interfaceC4686uq).a(Vp.f30225a);
                        }
                        this$0.f31624c.f32533a = true;
                        Intrinsics.checkNotNullParameter(cancellableContinuation, "<this>");
                        if (cancellableContinuation.isActive()) {
                            cancellableContinuation.u(u22, null);
                        }
                        cancellableContinuation.A(null);
                    }
                };
                redirectActivity2.addOnNewIntentListener(r02);
                c10737n.q(new G4(redirectActivity2, r02));
                Object n11 = c10737n.n();
                if (n11 == Wc.a.COROUTINE_SUSPENDED) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return n11;
            }
        }
        throw C4485nr.f31692a;
    }
}
