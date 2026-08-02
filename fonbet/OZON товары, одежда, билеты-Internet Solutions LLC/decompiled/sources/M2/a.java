package M2;

import B90.r0;
import C2.AbstractC2724t;
import C2.g0;
import C2.h0;
import C2.r;
import D2.m;
import D2.o;
import D2.p;
import D2.s;
import I2.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import g7.C6657c;
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

/* loaded from: classes8.dex */
public final class a extends I2.d<g0, GetSignInIntentRequest, SignInCredential, h0, o> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Context f17252e;

    /* renamed from: f, reason: collision with root package name */
    public r<h0, o> f17253f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f17254g;

    /* renamed from: h, reason: collision with root package name */
    private CancellationSignal f17255h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final i f17256i;

    /* renamed from: M2.a$a, reason: collision with other inner class name */
    static final class C0336a extends AbstractC7737t implements Function2<CancellationSignal, Function0<? extends Unit>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0336a f17257b = new C0336a(2);

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
            aVar.n().execute(new IU.e(1, aVar, e11));
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f17260c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h0 h0Var) {
            super(0);
            this.f17260c = h0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            aVar.n().execute(new Dc0.i(1, aVar, this.f17260c));
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ M<o> f17262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(M<o> m11) {
            super(0);
            this.f17262c = m11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            aVar.n().execute(new Dx.a(1, aVar, this.f17262c));
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f17264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o oVar) {
            super(0);
            this.f17264c = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            aVar.n().execute(new Dx.b(1, aVar, this.f17264c));
            return Unit.f71690a;
        }
    }

    static final class f extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D2.r f17266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(D2.r rVar) {
            super(0);
            this.f17266c = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            aVar.n().execute(new M2.b(0, aVar, this.f17266c));
            return Unit.f71690a;
        }
    }

    static final class g extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s f17268c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(s sVar) {
            super(0);
            this.f17268c = sVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            aVar.n().execute(new M2.c(0, aVar, this.f17268c));
            return Unit.f71690a;
        }
    }

    static final class h extends AbstractC7737t implements Function0<Unit> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            aVar.n().execute(new r0(aVar, 1));
            return Unit.f71690a;
        }
    }

    public static final class i extends ResultReceiver {

        /* renamed from: M2.a$i$a, reason: collision with other inner class name */
        /* synthetic */ class C0337a extends C7735q implements Function2<String, String, o> {
            @Override // kotlin.jvm.functions.Function2
            public final o invoke(String str, String str2) {
                ((a.C0229a) this.receiver).getClass();
                return a.C0229a.b(str, str2);
            }
        }

        i(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i11, @NotNull Bundle resultData) {
            Intrinsics.checkNotNullParameter(resultData, "resultData");
            C0337a c0337a = new C0337a(2, I2.a.f11796a, a.C0229a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
            a aVar = a.this;
            if (a.j(a.this, resultData, c0337a, aVar.n(), aVar.m(), aVar.f17255h)) {
                return;
            }
            aVar.o(resultData.getInt("ACTIVITY_REQUEST_CODE"), i11, (Intent) resultData.getParcelable("RESULT_DATA"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17252e = context;
        this.f17256i = new i(new Handler(Looper.getMainLooper()));
    }

    public static final /* synthetic */ boolean j(a aVar, Bundle bundle, Function2 function2, Executor executor, r rVar, CancellationSignal cancellationSignal) {
        aVar.getClass();
        return I2.d.e(bundle, function2, executor, rVar, cancellationSignal);
    }

    @NotNull
    public static GetSignInIntentRequest k(@NotNull g0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.a().size() != 1) {
            throw new s("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        AbstractC2724t abstractC2724t = request.a().get(0);
        Intrinsics.g(abstractC2724t, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        GetSignInIntentRequest build = GetSignInIntentRequest.builder().setServerClientId(null).filterByHostedDomain(null).setNonce(null).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder()\n            .s…nce)\n            .build()");
        return build;
    }

    @NotNull
    protected final h0 l(@NotNull SignInCredential response) {
        C6657c c6657c;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.getGoogleIdToken() != null) {
            Intrinsics.checkNotNullParameter(response, "response");
            C6657c.a aVar = new C6657c.a();
            String id2 = response.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "response.id");
            aVar.e(id2);
            try {
                String googleIdToken = response.getGoogleIdToken();
                Intrinsics.f(googleIdToken);
                aVar.f(googleIdToken);
                if (response.getDisplayName() != null) {
                    aVar.b(response.getDisplayName());
                }
                if (response.getGivenName() != null) {
                    aVar.d(response.getGivenName());
                }
                if (response.getFamilyName() != null) {
                    aVar.c(response.getFamilyName());
                }
                if (response.getPhoneNumber() != null) {
                    aVar.g(response.getPhoneNumber());
                }
                if (response.getProfilePictureUri() != null) {
                    aVar.h(response.getProfilePictureUri());
                }
                c6657c = aVar.a();
            } catch (Exception unused) {
                throw new D2.r("When attempting to convert get response, null Google ID Token found");
            }
        } else {
            Log.w("GetSignInIntent", "Credential returned but no google Id found");
            c6657c = null;
        }
        if (c6657c != null) {
            return new h0(c6657c);
        }
        throw new D2.r("When attempting to convert get response, null credential found");
    }

    @NotNull
    public final r<h0, o> m() {
        r<h0, o> rVar = this.f17253f;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.n("callback");
        throw null;
    }

    @NotNull
    public final Executor n() {
        Executor executor = this.f17254g;
        if (executor != null) {
            return executor;
        }
        Intrinsics.n("executor");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [D2.r, T] */
    /* JADX WARN: Type inference failed for: r5v7, types: [D2.p, T] */
    /* JADX WARN: Type inference failed for: r5v9, types: [D2.m, T] */
    public final void o(int i11, int i12, Intent intent) {
        Set set;
        if (i11 != I2.a.c()) {
            Log.w("GetSignInIntent", "Returned request code " + I2.a.c() + " which  does not match what was given " + i11);
            return;
        }
        if (I2.d.g(i12, C0336a.f17257b, new b(), this.f17255h)) {
            return;
        }
        try {
            SignInCredential signInCredentialFromIntent = Identity.getSignInClient(this.f17252e).getSignInCredentialFromIntent(intent);
            Intrinsics.checkNotNullExpressionValue(signInCredentialFromIntent, "getSignInClient(context)…redentialFromIntent(data)");
            I2.d.d(this.f17255h, new c(l(signInCredentialFromIntent)));
        } catch (o e11) {
            I2.d.d(this.f17255h, new e(e11));
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
            I2.d.d(this.f17255h, new d(m11));
        } catch (Throwable th2) {
            I2.d.d(this.f17255h, new f(new D2.r(th2.getMessage())));
        }
    }

    public final void p(@NotNull g0 request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r callback) {
        Context context = this.f17252e;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f17255h = cancellationSignal;
        Intrinsics.checkNotNullParameter(callback, "<set-?>");
        this.f17253f = callback;
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.f17254g = executor;
        CredentialProviderPlayServicesImpl.INSTANCE.getClass();
        if (CredentialProviderPlayServicesImpl.Companion.a(cancellationSignal)) {
            return;
        }
        try {
            GetSignInIntentRequest k11 = k(request);
            Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
            intent.putExtra("REQUEST_TYPE", k11);
            I2.a.b(this.f17256i, intent, "SIGN_IN_INTENT");
            context.startActivity(intent);
        } catch (Exception e11) {
            if (e11 instanceof s) {
                I2.d.d(cancellationSignal, new g((s) e11));
            } else {
                I2.d.d(cancellationSignal, new h());
            }
        }
    }
}
