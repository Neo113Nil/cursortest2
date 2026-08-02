package K2;

import C.h0;
import C2.AbstractC2708c;
import C2.C2710e;
import C2.C2711f;
import C2.r;
import D2.g;
import I.j;
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
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a extends I2.d<C2710e, SavePasswordRequest, Unit, AbstractC2708c, g> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15111j = 0;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Context f15112e;

    /* renamed from: f, reason: collision with root package name */
    private r<AbstractC2708c, g> f15113f;

    /* renamed from: g, reason: collision with root package name */
    private Executor f15114g;

    /* renamed from: h, reason: collision with root package name */
    private CancellationSignal f15115h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final e f15116i;

    /* renamed from: K2.a$a, reason: collision with other inner class name */
    static final class C0290a extends AbstractC7737t implements Function2<CancellationSignal, Function0<? extends Unit>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0290a f15117b = new C0290a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(CancellationSignal cancellationSignal, Function0<? extends Unit> function0) {
            Function0<? extends Unit> f7 = function0;
            Intrinsics.checkNotNullParameter(f7, "f");
            int i11 = I2.d.f11803d;
            I2.d.d(cancellationSignal, f7);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<g, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(g gVar) {
            g e11 = gVar;
            Intrinsics.checkNotNullParameter(e11, "e");
            a aVar = a.this;
            Executor executor = aVar.f15114g;
            if (executor != null) {
                executor.execute(new h0(4, aVar, e11));
                return Unit.f71690a;
            }
            Intrinsics.n("executor");
            throw null;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2711f f15120c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C2711f c2711f) {
            super(0);
            this.f15120c = c2711f;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            Executor executor = aVar.f15114g;
            if (executor == null) {
                Intrinsics.n("executor");
                throw null;
            }
            executor.execute(new J2.b(1, aVar, this.f15120c));
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            Executor executor = aVar.f15114g;
            if (executor != null) {
                executor.execute(new j(aVar, 1));
                return Unit.f71690a;
            }
            Intrinsics.n("executor");
            throw null;
        }
    }

    public static final class e extends ResultReceiver {

        /* renamed from: K2.a$e$a, reason: collision with other inner class name */
        /* synthetic */ class C0291a extends C7735q implements Function2<String, String, g> {
            @Override // kotlin.jvm.functions.Function2
            public final g invoke(String str, String str2) {
                ((a.C0229a) this.receiver).getClass();
                return a.C0229a.a(str, str2);
            }
        }

        e(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i11, @NotNull Bundle resultData) {
            Intrinsics.checkNotNullParameter(resultData, "resultData");
            C0291a c0291a = new C0291a(2, I2.a.f11796a, a.C0229a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
            a aVar = a.this;
            Executor executor = aVar.f15114g;
            if (executor == null) {
                Intrinsics.n("executor");
                throw null;
            }
            r rVar = aVar.f15113f;
            if (rVar == null) {
                Intrinsics.n("callback");
                throw null;
            }
            if (a.l(a.this, resultData, c0291a, executor, rVar, aVar.f15115h)) {
                return;
            }
            aVar.m(resultData.getInt("ACTIVITY_REQUEST_CODE"), i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15112e = context;
        this.f15116i = new e(new Handler(Looper.getMainLooper()));
    }

    public static final /* synthetic */ boolean l(a aVar, Bundle bundle, Function2 function2, Executor executor, r rVar, CancellationSignal cancellationSignal) {
        aVar.getClass();
        return I2.d.e(bundle, function2, executor, rVar, cancellationSignal);
    }

    public final void m(int i11, int i12) {
        if (i11 != I2.a.c()) {
            Log.w("CreatePassword", "Returned request code " + I2.a.c() + " which does not match what was given " + i11);
            return;
        }
        if (I2.d.f(i12, C0290a.f15117b, new b(), this.f15115h)) {
            return;
        }
        Unit response = Unit.f71690a;
        Intrinsics.checkNotNullParameter(response, "response");
        I2.d.d(this.f15115h, new c(new C2711f()));
    }

    public final void n(@NotNull C2710e request, @NotNull r<AbstractC2708c, g> callback, @NotNull Executor executor, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f15115h = cancellationSignal;
        this.f15113f = callback;
        this.f15114g = executor;
        CredentialProviderPlayServicesImpl.INSTANCE.getClass();
        if (CredentialProviderPlayServicesImpl.Companion.a(cancellationSignal)) {
            return;
        }
        Intrinsics.checkNotNullParameter(request, "request");
        SavePasswordRequest build = SavePasswordRequest.builder().setSignInPassword(new SignInPassword(request.d(), request.e())).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder()\n            .s…rd))\n            .build()");
        Context context = this.f15112e;
        Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", build);
        I2.a.b(this.f15116i, intent, "CREATE_PASSWORD");
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            I2.d.d(cancellationSignal, new d());
        }
    }
}
