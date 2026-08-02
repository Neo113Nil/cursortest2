package L2;

import B90.f0;
import B90.l0;
import C2.AbstractC2708c;
import C2.C2712g;
import C2.C2713h;
import C2.r;
import D2.k;
import E2.B;
import I2.a;
import L2.d;
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
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class a extends I2.d<C2712g, PublicKeyCredentialCreationOptions, PublicKeyCredential, AbstractC2708c, D2.g> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f16203j = 0;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Context f16204e;

    /* renamed from: f, reason: collision with root package name */
    private r<AbstractC2708c, D2.g> f16205f;

    /* renamed from: g, reason: collision with root package name */
    private Executor f16206g;

    /* renamed from: h, reason: collision with root package name */
    private CancellationSignal f16207h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final j f16208i;

    /* renamed from: L2.a$a, reason: collision with other inner class name */
    static final class C0308a extends AbstractC7737t implements Function2<CancellationSignal, Function0<? extends Unit>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0308a f16209b = new C0308a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(CancellationSignal cancellationSignal, Function0<? extends Unit> function0) {
            Function0<? extends Unit> f7 = function0;
            Intrinsics.checkNotNullParameter(f7, "f");
            int i11 = I2.d.f11803d;
            I2.d.d(cancellationSignal, f7);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<D2.g, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(D2.g gVar) {
            D2.g e11 = gVar;
            Intrinsics.checkNotNullParameter(e11, "e");
            a aVar = a.this;
            Executor executor = aVar.f16206g;
            if (executor != null) {
                executor.execute(new B.f(1, aVar, e11));
                return Unit.f71690a;
            }
            Intrinsics.n("executor");
            throw null;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D2.g f16212c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(D2.g gVar) {
            super(0);
            this.f16212c = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            Executor executor = aVar.f16206g;
            if (executor == null) {
                Intrinsics.n("executor");
                throw null;
            }
            executor.execute(new Hm.a(1, aVar, this.f16212c));
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2713h f16214c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C2713h c2713h) {
            super(0);
            this.f16214c = c2713h;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            Executor executor = aVar.f16206g;
            if (executor == null) {
                Intrinsics.n("executor");
                throw null;
            }
            executor.execute(new JL.a(2, aVar, this.f16214c));
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONException f16216c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(JSONException jSONException) {
            super(0);
            this.f16216c = jSONException;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            Executor executor = aVar.f16206g;
            if (executor == null) {
                Intrinsics.n("executor");
                throw null;
            }
            executor.execute(new H2.b(2, aVar, this.f16216c));
            return Unit.f71690a;
        }
    }

    static final class f extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f16218c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Throwable th2) {
            super(0);
            this.f16218c = th2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            Executor executor = aVar.f16206g;
            if (executor != null) {
                executor.execute(new IU.b(aVar, this.f16218c, 1));
                return Unit.f71690a;
            }
            Intrinsics.n("executor");
            throw null;
        }
    }

    static final class g extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONException f16220c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(JSONException jSONException) {
            super(0);
            this.f16220c = jSONException;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            Executor executor = aVar.f16206g;
            if (executor == null) {
                Intrinsics.n("executor");
                throw null;
            }
            executor.execute(new L2.b(0, aVar, this.f16220c));
            return Unit.f71690a;
        }
    }

    static final class h extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f16222c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Throwable th2) {
            super(0);
            this.f16222c = th2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            Executor executor = aVar.f16206g;
            if (executor == null) {
                Intrinsics.n("executor");
                throw null;
            }
            executor.execute(new L2.c(0, aVar, this.f16222c));
            return Unit.f71690a;
        }
    }

    static final class i extends AbstractC7737t implements Function0<Unit> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            Executor executor = aVar.f16206g;
            if (executor != null) {
                executor.execute(new l0(aVar, 3));
                return Unit.f71690a;
            }
            Intrinsics.n("executor");
            throw null;
        }
    }

    public static final class j extends ResultReceiver {

        /* renamed from: L2.a$j$a, reason: collision with other inner class name */
        /* synthetic */ class C0309a extends C7735q implements Function2<String, String, D2.g> {
            @Override // kotlin.jvm.functions.Function2
            public final D2.g invoke(String str, String str2) {
                ((a.C0229a) this.receiver).getClass();
                return a.C0229a.a(str, str2);
            }
        }

        j(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i11, @NotNull Bundle resultData) {
            Intrinsics.checkNotNullParameter(resultData, "resultData");
            C0309a c0309a = new C0309a(2, I2.a.f11796a, a.C0229a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
            a aVar = a.this;
            Executor executor = aVar.f16206g;
            if (executor == null) {
                Intrinsics.n("executor");
                throw null;
            }
            r rVar = aVar.f16205f;
            if (rVar == null) {
                Intrinsics.n("callback");
                throw null;
            }
            if (a.m(a.this, resultData, c0309a, executor, rVar, aVar.f16207h)) {
                return;
            }
            aVar.o(resultData.getInt("ACTIVITY_REQUEST_CODE"), i11, (Intent) resultData.getParcelable("RESULT_DATA"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16204e = context;
        this.f16208i = new j(new Handler(Looper.getMainLooper()));
    }

    public static void h(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        r<AbstractC2708c, D2.g> rVar = this$0.f16205f;
        if (rVar != null) {
            rVar.a(new F2.a(new B(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
        } else {
            Intrinsics.n("callback");
            throw null;
        }
    }

    public static final /* synthetic */ boolean m(a aVar, Bundle bundle, Function2 function2, Executor executor, r rVar, CancellationSignal cancellationSignal) {
        aVar.getClass();
        return I2.d.e(bundle, function2, executor, rVar, cancellationSignal);
    }

    @NotNull
    public static C2713h n(@NotNull PublicKeyCredential response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String json = response.toJson();
            Intrinsics.checkNotNullExpressionValue(json, "response.toJson()");
            return new C2713h(json);
        } catch (Throwable th2) {
            throw new k("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
        }
    }

    public final void o(int i11, int i12, Intent intent) {
        LinkedHashMap linkedHashMap;
        if (i11 != I2.a.c()) {
            Log.w("CreatePublicKey", "Returned request code " + I2.a.c() + " does not match what was given " + i11);
            return;
        }
        if (I2.d.f(i12, C0308a.f16209b, new b(), this.f16207h)) {
            return;
        }
        D2.g gVar = null;
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra(Fido.FIDO2_KEY_CREDENTIAL_EXTRA) : null;
        if (byteArrayExtra == null) {
            CredentialProviderPlayServicesImpl.Companion companion = CredentialProviderPlayServicesImpl.INSTANCE;
            CancellationSignal cancellationSignal = this.f16207h;
            companion.getClass();
            if (CredentialProviderPlayServicesImpl.Companion.a(cancellationSignal)) {
                return;
            }
            Executor executor = this.f16206g;
            if (executor != null) {
                executor.execute(new f0(this, 2));
                return;
            } else {
                Intrinsics.n("executor");
                throw null;
            }
        }
        PublicKeyCredential cred = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
        Intrinsics.checkNotNullExpressionValue(cred, "deserializeFromBytes(bytes)");
        int i13 = L2.d.f16232b;
        Intrinsics.checkNotNullParameter(cred, "cred");
        AuthenticatorResponse response = cred.getResponse();
        Intrinsics.checkNotNullExpressionValue(response, "cred.response");
        if (response instanceof AuthenticatorErrorResponse) {
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
            ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode, "authenticatorResponse.errorCode");
            linkedHashMap = L2.d.f16231a;
            E2.e eVar = (E2.e) linkedHashMap.get(errorCode);
            String errorMessage = authenticatorErrorResponse.getErrorMessage();
            gVar = eVar == null ? new F2.a(new B(), Nk.a.b("unknown fido gms exception - ", errorMessage)) : (errorCode == ErrorCode.NOT_ALLOWED_ERR && errorMessage != null && kotlin.text.h.t(errorMessage, "Unable to get sync account", false)) ? new D2.e("Passkey registration was cancelled by the user.") : new F2.a(eVar, errorMessage);
        }
        if (gVar != null) {
            I2.d.d(this.f16207h, new c(gVar));
            return;
        }
        try {
            I2.d.d(this.f16207h, new d(n(cred)));
        } catch (JSONException e11) {
            I2.d.d(this.f16207h, new e(e11));
        } catch (Throwable th2) {
            I2.d.d(this.f16207h, new f(th2));
        }
    }

    public final void p(@NotNull C2712g request, @NotNull r<AbstractC2708c, D2.g> callback, @NotNull Executor executor, CancellationSignal cancellationSignal) {
        Context context = this.f16204e;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f16207h = cancellationSignal;
        this.f16205f = callback;
        this.f16206g = executor;
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            int i11 = L2.d.f16232b;
            PublicKeyCredentialCreationOptions a11 = d.a.a(request, context);
            CredentialProviderPlayServicesImpl.INSTANCE.getClass();
            if (CredentialProviderPlayServicesImpl.Companion.a(cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
            intent.putExtra("REQUEST_TYPE", a11);
            I2.a.b(this.f16208i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                I2.d.d(cancellationSignal, new i());
            }
        } catch (JSONException e11) {
            I2.d.d(cancellationSignal, new g(e11));
        } catch (Throwable th2) {
            I2.d.d(cancellationSignal, new h(th2));
        }
    }
}
