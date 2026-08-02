package J2;

import B90.V;
import C2.AbstractC2714i;
import C2.AbstractC2724t;
import C2.g0;
import C2.h0;
import C2.j0;
import C2.k0;
import C2.l0;
import C2.n0;
import C2.r;
import D2.m;
import D2.o;
import D2.p;
import E.a0;
import E.b0;
import E2.B;
import I2.a;
import L2.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import g7.C6655a;
import g7.C6657c;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class a extends I2.d<g0, BeginSignInRequest, SignInCredential, h0, o> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Context f13667e;

    /* renamed from: f, reason: collision with root package name */
    public r<h0, o> f13668f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f13669g;

    /* renamed from: h, reason: collision with root package name */
    private CancellationSignal f13670h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final h f13671i;

    /* renamed from: J2.a$a, reason: collision with other inner class name */
    static final class C0258a extends AbstractC7737t implements Function2<CancellationSignal, Function0<? extends Unit>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0258a f13672b = new C0258a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(CancellationSignal cancellationSignal, Function0<? extends Unit> function0) {
            Function0<? extends Unit> f7 = function0;
            Intrinsics.checkNotNullParameter(f7, "f");
            int i11 = I2.d.f11803d;
            I2.d.d(cancellationSignal, f7);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<o, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o oVar) {
            o e11 = oVar;
            Intrinsics.checkNotNullParameter(e11, "e");
            a aVar = a.this;
            aVar.m().execute(new C.g0(3, aVar, e11));
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f13675c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h0 h0Var) {
            super(0);
            this.f13675c = h0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            aVar.m().execute(new C.h0(3, aVar, this.f13675c));
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ M<o> f13677c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(M<o> m11) {
            super(0);
            this.f13677c = m11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            aVar.m().execute(new J2.b(0, aVar, this.f13677c));
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f13679c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o oVar) {
            super(0);
            this.f13679c = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            aVar.m().execute(new a0(1, aVar, this.f13679c));
            return Unit.f71690a;
        }
    }

    static final class f extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D2.r f13681c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(D2.r rVar) {
            super(0);
            this.f13681c = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            aVar.m().execute(new b0(1, aVar, this.f13681c));
            return Unit.f71690a;
        }
    }

    static final class g extends AbstractC7737t implements Function0<Unit> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            aVar.m().execute(new V(aVar, 1));
            return Unit.f71690a;
        }
    }

    public static final class h extends ResultReceiver {

        /* renamed from: J2.a$h$a, reason: collision with other inner class name */
        /* synthetic */ class C0259a extends C7735q implements Function2<String, String, o> {
            @Override // kotlin.jvm.functions.Function2
            public final o invoke(String str, String str2) {
                ((a.C0229a) this.receiver).getClass();
                return a.C0229a.b(str, str2);
            }
        }

        h(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i11, @NotNull Bundle resultData) {
            Intrinsics.checkNotNullParameter(resultData, "resultData");
            C0259a c0259a = new C0259a(2, I2.a.f11796a, a.C0229a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
            a aVar = a.this;
            if (a.j(a.this, resultData, c0259a, aVar.m(), aVar.l(), aVar.f13670h)) {
                return;
            }
            aVar.n(resultData.getInt("ACTIVITY_REQUEST_CODE"), i11, (Intent) resultData.getParcelable("RESULT_DATA"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13667e = context;
        this.f13671i = new h(new Handler(Looper.getMainLooper()));
    }

    public static final /* synthetic */ boolean j(a aVar, Bundle bundle, Function2 function2, Executor executor, r rVar, CancellationSignal cancellationSignal) {
        aVar.getClass();
        return I2.d.e(bundle, function2, executor, rVar, cancellationSignal);
    }

    @NotNull
    public final h0 k(@NotNull SignInCredential cred) {
        AbstractC2714i abstractC2714i;
        String json;
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(cred, "response");
        if (cred.getPassword() != null) {
            String id2 = cred.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "response.id");
            String password = cred.getPassword();
            Intrinsics.f(password);
            abstractC2714i = new l0(id2, password);
        } else if (cred.getGoogleIdToken() != null) {
            C6657c.a aVar = new C6657c.a();
            String id3 = cred.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "response.id");
            aVar.e(id3);
            String googleIdToken = cred.getGoogleIdToken();
            Intrinsics.f(googleIdToken);
            aVar.f(googleIdToken);
            if (cred.getDisplayName() != null) {
                aVar.b(cred.getDisplayName());
            }
            if (cred.getGivenName() != null) {
                aVar.d(cred.getGivenName());
            }
            if (cred.getFamilyName() != null) {
                aVar.c(cred.getFamilyName());
            }
            if (cred.getPhoneNumber() != null) {
                aVar.g(cred.getPhoneNumber());
            }
            if (cred.getProfilePictureUri() != null) {
                aVar.h(cred.getProfilePictureUri());
            }
            abstractC2714i = aVar.a();
        } else {
            if (cred.getPublicKeyCredential() != null) {
                int i11 = L2.d.f16232b;
                Intrinsics.checkNotNullParameter(cred, "cred");
                JSONObject jSONObject = new JSONObject();
                PublicKeyCredential publicKeyCredential = cred.getPublicKeyCredential();
                AuthenticatorResponse response = publicKeyCredential != null ? publicKeyCredential.getResponse() : null;
                Intrinsics.f(response);
                if (response instanceof AuthenticatorErrorResponse) {
                    AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
                    ErrorCode code = authenticatorErrorResponse.getErrorCode();
                    Intrinsics.checkNotNullExpressionValue(code, "authenticatorResponse.errorCode");
                    String errorMessage = authenticatorErrorResponse.getErrorMessage();
                    Intrinsics.checkNotNullParameter(code, "code");
                    linkedHashMap = L2.d.f16231a;
                    E2.e eVar = (E2.e) linkedHashMap.get(code);
                    if (eVar == null) {
                        throw new F2.d(new B(), Nk.a.b("unknown fido gms exception - ", errorMessage));
                    }
                    if (code == ErrorCode.NOT_ALLOWED_ERR && errorMessage != null && kotlin.text.h.t(errorMessage, "Unable to get sync account", false)) {
                        throw new m("Passkey retrieval was cancelled by the user.");
                    }
                    throw new F2.d(eVar, errorMessage);
                }
                if (response instanceof AuthenticatorAssertionResponse) {
                    try {
                        json = publicKeyCredential.toJson();
                        Intrinsics.checkNotNullExpressionValue(json, "publicKeyCred.toJson()");
                    } catch (Throwable th2) {
                        throw new D2.r("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(response.getClass().getName()));
                    json = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(json, "json.toString()");
                }
                abstractC2714i = new n0(json);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                abstractC2714i = null;
            }
        }
        if (abstractC2714i != null) {
            return new h0(abstractC2714i);
        }
        throw new D2.r("When attempting to convert get response, null credential found");
    }

    @NotNull
    public final r<h0, o> l() {
        r<h0, o> rVar = this.f13668f;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.n("callback");
        throw null;
    }

    @NotNull
    public final Executor m() {
        Executor executor = this.f13669g;
        if (executor != null) {
            return executor;
        }
        Intrinsics.n("executor");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [D2.r, T] */
    /* JADX WARN: Type inference failed for: r5v7, types: [D2.p, T] */
    /* JADX WARN: Type inference failed for: r5v9, types: [D2.m, T] */
    public final void n(int i11, int i12, Intent intent) {
        Set set;
        if (i11 != I2.a.c()) {
            Log.w("BeginSignIn", "Returned request code " + I2.a.c() + " which  does not match what was given " + i11);
            return;
        }
        if (I2.d.g(i12, C0258a.f13672b, new b(), this.f13670h)) {
            return;
        }
        try {
            SignInCredential signInCredentialFromIntent = Identity.getSignInClient(this.f13667e).getSignInCredentialFromIntent(intent);
            Intrinsics.checkNotNullExpressionValue(signInCredentialFromIntent, "getSignInClient(context)…redentialFromIntent(data)");
            I2.d.d(this.f13670h, new c(k(signInCredentialFromIntent)));
        } catch (o e11) {
            I2.d.d(this.f13670h, new e(e11));
        } catch (ApiException e12) {
            M m11 = new M();
            m11.f71787a = new D2.r(e12.getMessage());
            if (e12.getStatusCode() == 16) {
                m11.f71787a = new m(e12.getMessage());
            } else {
                I2.a.f11796a.getClass();
                set = I2.a.f11797b;
                if (set.contains(Integer.valueOf(e12.getStatusCode()))) {
                    m11.f71787a = new p(e12.getMessage());
                }
            }
            I2.d.d(this.f13670h, new d(m11));
        } catch (Throwable th2) {
            I2.d.d(this.f13670h, new f(new D2.r(th2.getMessage())));
        }
    }

    public final void o(@NotNull g0 request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f13670h = cancellationSignal;
        Intrinsics.checkNotNullParameter(callback, "<set-?>");
        this.f13668f = callback;
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.f13669g = executor;
        CredentialProviderPlayServicesImpl.INSTANCE.getClass();
        if (CredentialProviderPlayServicesImpl.Companion.a(cancellationSignal)) {
            return;
        }
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "request");
        Context context = this.f13667e;
        Intrinsics.checkNotNullParameter(context, "context");
        BeginSignInRequest.Builder builder = new BeginSignInRequest.Builder();
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        long j11 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        boolean z11 = false;
        for (AbstractC2724t abstractC2724t : request.a()) {
            if (abstractC2724t instanceof j0) {
                builder.setPasswordRequestOptions(new BeginSignInRequest.PasswordRequestOptions.Builder().setSupported(true).build());
                abstractC2724t.getClass();
            } else if ((abstractC2724t instanceof k0) && !z11) {
                if (j11 >= 231815000) {
                    int i11 = L2.d.f16232b;
                    k0 option = (k0) abstractC2724t;
                    Intrinsics.checkNotNullParameter(option, "option");
                    BeginSignInRequest.PasskeyJsonRequestOptions.Builder supported = new BeginSignInRequest.PasskeyJsonRequestOptions.Builder().setSupported(true);
                    option.getClass();
                    BeginSignInRequest.PasskeyJsonRequestOptions build = supported.setRequestJson(null).build();
                    Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
                    builder.setPasskeyJsonSignInRequestOptions(build);
                } else {
                    int i12 = L2.d.f16232b;
                    builder.setPasskeysSignInRequestOptions(d.a.b((k0) abstractC2724t));
                }
                z11 = true;
            } else if (abstractC2724t instanceof C6655a) {
                BeginSignInRequest.GoogleIdTokenRequestOptions.Builder builder2 = BeginSignInRequest.GoogleIdTokenRequestOptions.builder();
                ((C6655a) abstractC2724t).getClass();
                BeginSignInRequest.GoogleIdTokenRequestOptions.Builder supported2 = builder2.setFilterByAuthorizedAccounts(false).setNonce(null).setRequestVerifiedPhoneNumber(false).setServerClientId(null).setSupported(true);
                Intrinsics.checkNotNullExpressionValue(supported2, "builder()\n              …      .setSupported(true)");
                BeginSignInRequest.GoogleIdTokenRequestOptions build2 = supported2.build();
                Intrinsics.checkNotNullExpressionValue(build2, "idTokenOption.build()");
                builder.setGoogleIdTokenRequestOptions(build2);
            }
        }
        if (j11 > 241217000) {
            builder.setPreferImmediatelyAvailableCredentials(false);
        }
        BeginSignInRequest build3 = builder.setAutoSelectEnabled(false).build();
        Intrinsics.checkNotNullExpressionValue(build3, "requestBuilder.setAutoSe…abled(autoSelect).build()");
        Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", build3);
        I2.a.b(this.f13671i, intent, "BEGIN_SIGN_IN");
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            I2.d.d(cancellationSignal, new g());
        }
    }
}
