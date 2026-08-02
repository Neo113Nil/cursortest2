package C2;

import F2.a;
import F2.d;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class Y implements InterfaceC2725u {

    /* renamed from: a, reason: collision with root package name */
    private final CredentialManager f4334a;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2718m f4335b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2718m c2718m) {
            super(0);
            this.f4335b = c2718m;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f4335b.a(new D2.d("androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION", "Your device doesn't support credential manager"));
            return Unit.f71690a;
        }
    }

    public static final class b implements OutcomeReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2718m f4336a;

        b(C2718m c2718m) {
            this.f4336a = c2718m;
        }

        public final void onError(Throwable th2) {
            ClearCredentialStateException error = Z.a(th2);
            Intrinsics.checkNotNullParameter(error, "error");
            Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
            this.f4336a.a(new D2.c(null));
        }

        public final void onResult(Object obj) {
            Log.i("CredManProvService", "Clear result returned from framework: ");
            this.f4336a.onResult((Void) obj);
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2720o f4337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C2720o c2720o) {
            super(0);
            this.f4337b = c2720o;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f4337b.a(new D2.l("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION", "Your device doesn't support credential manager"));
            return Unit.f71690a;
        }
    }

    public static final class d implements OutcomeReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2720o f4338a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y f4339b;

        d(C2720o c2720o, C2710e c2710e, Y y11) {
            this.f4338a = c2720o;
            this.f4339b = y11;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onError(Throwable th2) {
            String type;
            String type2;
            D2.g fVar;
            String type3;
            String message;
            String type4;
            String message2;
            String message3;
            String message4;
            String message5;
            String message6;
            CreateCredentialException error = a0.b(th2);
            Intrinsics.checkNotNullParameter(error, "error");
            Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
            C2720o c2720o = this.f4338a;
            this.f4339b.getClass();
            Intrinsics.checkNotNullParameter(error, "error");
            type = error.getType();
            switch (type.hashCode()) {
                case -2055374133:
                    if (type.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                        message3 = error.getMessage();
                        fVar = new D2.e(message3);
                        c2720o.a(fVar);
                        return;
                    }
                    type2 = error.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "error.type");
                    if (kotlin.text.h.e0(type2, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        int i11 = F2.b.f8383a;
                        type4 = error.getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "error.type");
                        message2 = error.getMessage();
                        Intrinsics.checkNotNullParameter(type4, "type");
                        try {
                            if (!kotlin.text.h.t(type4, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                                throw new G2.a();
                            }
                            int i12 = F2.a.f8382b;
                            fVar = a.C0184a.a(type4, message2);
                        } catch (G2.a unused) {
                            fVar = new D2.f(type4, message2);
                        }
                    } else {
                        type3 = error.getType();
                        Intrinsics.checkNotNullExpressionValue(type3, "error.type");
                        message = error.getMessage();
                        fVar = new D2.f(type3, message);
                    }
                    c2720o.a(fVar);
                    return;
                case 1316905704:
                    if (type.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                        message4 = error.getMessage();
                        fVar = new D2.k(message4);
                        c2720o.a(fVar);
                        return;
                    }
                    type2 = error.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "error.type");
                    if (kotlin.text.h.e0(type2, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    }
                    c2720o.a(fVar);
                    return;
                case 2092588512:
                    if (type.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                        message5 = error.getMessage();
                        fVar = new D2.h(message5);
                        c2720o.a(fVar);
                        return;
                    }
                    type2 = error.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "error.type");
                    if (kotlin.text.h.e0(type2, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    }
                    c2720o.a(fVar);
                    return;
                case 2131915191:
                    if (type.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                        message6 = error.getMessage();
                        fVar = new D2.i("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS", message6);
                        c2720o.a(fVar);
                        return;
                    }
                    type2 = error.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "error.type");
                    if (kotlin.text.h.e0(type2, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    }
                    c2720o.a(fVar);
                    return;
                default:
                    type2 = error.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "error.type");
                    if (kotlin.text.h.e0(type2, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    }
                    c2720o.a(fVar);
                    return;
            }
        }

        public final void onResult(Object obj) {
            Bundle data;
            AbstractC2708c c2709d;
            CreateCredentialResponse response = b0.a(obj);
            Intrinsics.checkNotNullParameter(response, "response");
            Log.i("CredManProvService", "Create Result returned from framework: ");
            C2720o c2720o = this.f4338a;
            data = response.getData();
            Intrinsics.checkNotNullExpressionValue(data, "response.data");
            Intrinsics.checkNotNullParameter("android.credentials.TYPE_PASSWORD_CREDENTIAL", "type");
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                Intrinsics.checkNotNullParameter(data, "data");
                c2709d = new C2711f(0, data);
            } catch (G2.a unused) {
                Intrinsics.checkNotNullParameter("android.credentials.TYPE_PASSWORD_CREDENTIAL", "type");
                Intrinsics.checkNotNullParameter(data, "data");
                c2709d = new C2709d("android.credentials.TYPE_PASSWORD_CREDENTIAL", data);
            }
            c2720o.onResult(c2709d);
        }
    }

    static final class e extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2722q f4340b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C2722q c2722q) {
            super(0);
            this.f4340b = c2722q;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f4340b.a(new D2.s("Your device doesn't support credential manager"));
            return Unit.f71690a;
        }
    }

    public static final class f implements OutcomeReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2722q f4341a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y f4342b;

        f(C2722q c2722q, Y y11) {
            this.f4341a = c2722q;
            this.f4342b = y11;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onError(Throwable th2) {
            String type;
            String type2;
            D2.o nVar;
            String type3;
            String message;
            String type4;
            String message2;
            String message3;
            String message4;
            String message5;
            String message6;
            GetCredentialException error = d0.b(th2);
            Intrinsics.checkNotNullParameter(error, "error");
            Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
            C2722q c2722q = this.f4341a;
            this.f4342b.getClass();
            Intrinsics.checkNotNullParameter(error, "error");
            type = error.getType();
            switch (type.hashCode()) {
                case -781118336:
                    if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                        message3 = error.getMessage();
                        nVar = new D2.r(message3);
                        c2722q.a(nVar);
                        return;
                    }
                    type2 = error.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "error.type");
                    if (kotlin.text.h.e0(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        int i11 = F2.e.f8385a;
                        type4 = error.getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "error.type");
                        message2 = error.getMessage();
                        Intrinsics.checkNotNullParameter(type4, "type");
                        try {
                            if (!kotlin.text.h.e0(type4, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                                throw new G2.a();
                            }
                            int i12 = F2.d.f8384b;
                            nVar = d.a.a(type4, message2);
                        } catch (G2.a unused) {
                            nVar = new D2.n(type4, message2);
                        }
                    } else {
                        type3 = error.getType();
                        Intrinsics.checkNotNullExpressionValue(type3, "error.type");
                        message = error.getMessage();
                        nVar = new D2.n(type3, message);
                    }
                    c2722q.a(nVar);
                    return;
                case -45448328:
                    if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                        message4 = error.getMessage();
                        nVar = new D2.p(message4);
                        c2722q.a(nVar);
                        return;
                    }
                    type2 = error.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "error.type");
                    if (kotlin.text.h.e0(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    }
                    c2722q.a(nVar);
                    return;
                case 580557411:
                    if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                        message5 = error.getMessage();
                        nVar = new D2.m(message5);
                        c2722q.a(nVar);
                        return;
                    }
                    type2 = error.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "error.type");
                    if (kotlin.text.h.e0(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    }
                    c2722q.a(nVar);
                    return;
                case 627896683:
                    if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                        message6 = error.getMessage();
                        nVar = new D2.t(message6);
                        c2722q.a(nVar);
                        return;
                    }
                    type2 = error.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "error.type");
                    if (kotlin.text.h.e0(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    }
                    c2722q.a(nVar);
                    return;
                default:
                    type2 = error.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "error.type");
                    if (kotlin.text.h.e0(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    }
                    c2722q.a(nVar);
                    return;
            }
        }

        public final void onResult(Object obj) {
            Credential credential;
            String type;
            Bundle data;
            AbstractC2714i f0Var;
            GetCredentialResponse response = e0.a(obj);
            Intrinsics.checkNotNullParameter(response, "response");
            Log.i("CredManProvService", "GetCredentialResponse returned from framework");
            C2722q c2722q = this.f4341a;
            this.f4342b.getClass();
            Intrinsics.checkNotNullParameter(response, "response");
            credential = response.getCredential();
            Intrinsics.checkNotNullExpressionValue(credential, "response.credential");
            type = credential.getType();
            Intrinsics.checkNotNullExpressionValue(type, "credential.type");
            data = credential.getData();
            Intrinsics.checkNotNullExpressionValue(data, "credential.data");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(data, "data");
            try {
            } catch (G2.a unused) {
                f0Var = new f0(type, data);
            }
            if (Intrinsics.d(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                Intrinsics.checkNotNullParameter(data, "data");
                try {
                    String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                    String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                    Intrinsics.f(string);
                    Intrinsics.f(string2);
                    f0Var = new l0(string, string2, data, 0);
                    c2722q.onResult(new h0(f0Var));
                } catch (Exception unused2) {
                    throw new G2.a();
                }
            }
            if (!Intrinsics.d(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                throw new G2.a();
            }
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                String string3 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                Intrinsics.f(string3);
                f0Var = new n0(string3, 0, data);
                c2722q.onResult(new h0(f0Var));
            } catch (Exception unused3) {
                throw new G2.a();
            }
            f0Var = new f0(type, data);
            c2722q.onResult(new h0(f0Var));
        }
    }

    public Y(@NotNull ContextWrapper context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4334a = P.a(context.getSystemService("credential"));
    }

    @Override // C2.InterfaceC2725u
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f4334a != null;
    }

    @Override // C2.InterfaceC2725u
    public final void onClearCredential(@NotNull C2706a request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r<Void, D2.a> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Log.i("CredManProvService", "In CredentialProviderFrameworkImpl onClearCredential");
        C2718m c2718m = (C2718m) callback;
        a aVar = new a(c2718m);
        CredentialManager credentialManager = this.f4334a;
        if (credentialManager == null) {
            aVar.invoke();
            return;
        }
        b bVar = new b(c2718m);
        Intrinsics.f(credentialManager);
        I.a();
        credentialManager.clearCredentialState(G.a(new Bundle()), cancellationSignal, (ExecutorC2715j) executor, bVar);
    }

    @Override // C2.InterfaceC2725u
    public final void onCreateCredential(@NotNull Context context, @NotNull AbstractC2707b request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r<AbstractC2708c, D2.g> callback) {
        CreateCredentialRequest.Builder isSystemProviderRequired;
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider;
        CreateCredentialRequest build;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C2720o c2720o = (C2720o) callback;
        c cVar = new c(c2720o);
        CredentialManager credentialManager = this.f4334a;
        if (credentialManager == null) {
            cVar.invoke();
            return;
        }
        d dVar = new d(c2720o, (C2710e) request, this);
        Intrinsics.f(credentialManager);
        O.b();
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle b11 = request.b();
        Bundle a11 = request.c().a();
        a11.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, R.drawable.ic_password));
        b11.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", a11);
        isSystemProviderRequired = N.b("android.credentials.TYPE_PASSWORD_CREDENTIAL", b11, request.a()).setIsSystemProviderRequired(false);
        alwaysSendAppInfoToProvider = isSystemProviderRequired.setAlwaysSendAppInfoToProvider(true);
        Intrinsics.checkNotNullExpressionValue(alwaysSendAppInfoToProvider, "Builder(\n               …ndAppInfoToProvider(true)");
        build = alwaysSendAppInfoToProvider.build();
        Intrinsics.checkNotNullExpressionValue(build, "createCredentialRequestBuilder.build()");
        credentialManager.createCredential((Activity) context, build, cancellationSignal, (ExecutorC2715j) executor, dVar);
    }

    @Override // C2.InterfaceC2725u
    public final void onGetCredential(@NotNull Context context, @NotNull g0 request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r<h0, D2.o> callback) {
        GetCredentialRequest build;
        CredentialOption.Builder isSystemProviderRequired;
        CredentialOption.Builder allowedProviders;
        CredentialOption build2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C2722q c2722q = (C2722q) callback;
        e eVar = new e(c2722q);
        CredentialManager credentialManager = this.f4334a;
        if (credentialManager == null) {
            eVar.invoke();
            return;
        }
        f fVar = new f(c2722q, this);
        Intrinsics.f(credentialManager);
        L.c();
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder a11 = J.a(bundle);
        for (AbstractC2724t abstractC2724t : request.a()) {
            M.b();
            abstractC2724t.getClass();
            isSystemProviderRequired = K.a("android.credentials.TYPE_PASSWORD_CREDENTIAL", abstractC2724t.c(), abstractC2724t.b()).setIsSystemProviderRequired(false);
            allowedProviders = isSystemProviderRequired.setAllowedProviders(abstractC2724t.a());
            build2 = allowedProviders.build();
            a11.addCredentialOption(build2);
        }
        build = a11.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        credentialManager.getCredential((Activity) context, build, cancellationSignal, (ExecutorC2715j) executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) fVar);
    }
}
