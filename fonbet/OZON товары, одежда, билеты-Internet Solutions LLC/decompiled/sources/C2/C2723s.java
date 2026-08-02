package C2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.CancellationSignal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: C2.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2723s implements InterfaceC2716k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f4360a;

    public C2723s(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4360a = context;
    }

    @Override // C2.InterfaceC2716k
    public final void a(@NotNull Activity context, @NotNull g0 request, CancellationSignal cancellationSignal, @NotNull ExecutorC2715j executor, @NotNull C2722q callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC2725u a11 = C2726v.a(new C2726v(context));
        if (a11 == null) {
            callback.a(new D2.q("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            a11.onGetCredential(context, request, cancellationSignal, executor, callback);
        }
    }

    @Override // C2.InterfaceC2716k
    public final void e(@NotNull C2706a request, CancellationSignal cancellationSignal, @NotNull ExecutorC2715j executor, @NotNull C2718m callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC2725u a11 = C2726v.a(new C2726v(this.f4360a));
        if (a11 == null) {
            callback.a(new D2.b("androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            a11.onClearCredential(request, cancellationSignal, executor, callback);
        }
    }

    @Override // C2.InterfaceC2716k
    public final void f(@NotNull Activity context, @NotNull C2710e request, CancellationSignal cancellationSignal, @NotNull ExecutorC2715j executor, @NotNull C2720o callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC2725u a11 = C2726v.a(new C2726v(this.f4360a));
        if (a11 == null) {
            callback.a(new D2.j("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            a11.onCreateCredential(context, request, cancellationSignal, executor, callback);
        }
    }
}
