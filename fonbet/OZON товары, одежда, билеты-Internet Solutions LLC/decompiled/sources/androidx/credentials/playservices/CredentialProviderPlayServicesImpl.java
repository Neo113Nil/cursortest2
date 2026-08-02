package androidx.credentials.playservices;

import C2.AbstractC2707b;
import C2.AbstractC2708c;
import C2.AbstractC2724t;
import C2.C2706a;
import C2.C2710e;
import C2.C2712g;
import C2.InterfaceC2725u;
import C2.g0;
import C2.h0;
import C2.m0;
import C2.r;
import D2.g;
import D2.o;
import Fn.C3055d;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnFailureListener;
import g7.C6656b;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "LC2/u;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isGooglePlayServicesAvailable", "(Landroid/content/Context;)I", "LC2/g0;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "LC2/r;", "LC2/h0;", "LD2/o;", "callback", "", "onGetCredential", "(Landroid/content/Context;LC2/g0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LC2/r;)V", "LC2/b;", "LC2/c;", "LD2/g;", "onCreateCredential", "(Landroid/content/Context;LC2/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LC2/r;)V", "", "isAvailableOnDevice", "()Z", "LC2/a;", "Ljava/lang/Void;", "LD2/a;", "onClearCredential", "(LC2/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LC2/r;)V", "Landroid/content/Context;", "Lcom/google/android/gms/common/GoogleApiAvailability;", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/GoogleApiAvailability;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CredentialProviderPlayServicesImpl implements InterfaceC2725u {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final int MIN_GMS_APK_VERSION = 230815045;

    @NotNull
    private static final String TAG = "PlayServicesImpl";

    @NotNull
    private final Context context;

    @NotNull
    private GoogleApiAvailability googleApiAvailability;

    /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$a, reason: from kotlin metadata */
    public static final class Companion {
        public static boolean a(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }
    }

    static final class b extends AbstractC7737t implements Function1<Void, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f42437b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f42438c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r<Void, D2.a> f42439d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CancellationSignal cancellationSignal, Executor executor, r<Void, D2.a> rVar) {
            super(1);
            this.f42437b = cancellationSignal;
            this.f42438c = executor;
            this.f42439d = rVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Void r42) {
            Companion companion = CredentialProviderPlayServicesImpl.INSTANCE;
            a callback = new a(this.f42438c, this.f42439d);
            companion.getClass();
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (!Companion.a(this.f42437b)) {
                callback.invoke();
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Exception f42440b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f42441c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r<Void, D2.a> f42442d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Exception exc, Executor executor, r<Void, D2.a> rVar) {
            super(0);
            this.f42440b = exc;
            this.f42441c = executor;
            this.f42442d = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            StringBuilder sb2 = new StringBuilder("During clear credential sign out failed with ");
            Exception exc = this.f42440b;
            sb2.append(exc);
            Log.w(CredentialProviderPlayServicesImpl.TAG, sb2.toString());
            this.f42441c.execute(new H2.b(0, this.f42442d, exc));
            return Unit.f71690a;
        }
    }

    public CredentialProviderPlayServicesImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance()");
        this.googleApiAvailability = googleApiAvailability;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.isGooglePlayServicesAvailable(context, MIN_GMS_APK_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl this$0, CancellationSignal cancellationSignal, Executor executor, r callback, Exception e11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(e11, "e");
        Companion companion = INSTANCE;
        c callback2 = new c(e11, executor, callback);
        companion.getClass();
        Intrinsics.checkNotNullParameter(callback2, "callback");
        if (Companion.a(cancellationSignal)) {
            return;
        }
        callback2.invoke();
    }

    @NotNull
    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // C2.InterfaceC2725u
    public boolean isAvailableOnDevice() {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z11 = isGooglePlayServicesAvailable == 0;
        if (!z11) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(isGooglePlayServicesAvailable));
        }
        return z11;
    }

    @Override // C2.InterfaceC2725u
    public void onClearCredential(@NotNull C2706a request, final CancellationSignal cancellationSignal, @NotNull final Executor executor, @NotNull final r<Void, D2.a> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        INSTANCE.getClass();
        if (Companion.a(cancellationSignal)) {
            return;
        }
        Identity.getSignInClient(this.context).signOut().addOnSuccessListener(new C3055d(new b(cancellationSignal, executor, callback), 2)).addOnFailureListener(new OnFailureListener() { // from class: H2.a
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(CredentialProviderPlayServicesImpl.this, cancellationSignal, executor, callback, exc);
            }
        });
    }

    @Override // C2.InterfaceC2725u
    public void onCreateCredential(@NotNull Context context, @NotNull AbstractC2707b request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r<AbstractC2708c, g> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        INSTANCE.getClass();
        if (Companion.a(cancellationSignal)) {
            return;
        }
        if (request instanceof C2710e) {
            int i11 = K2.a.f15111j;
            Intrinsics.checkNotNullParameter(context, "context");
            new K2.a(context).n((C2710e) request, callback, executor, cancellationSignal);
        } else {
            if (!(request instanceof C2712g)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            int i12 = L2.a.f16203j;
            Intrinsics.checkNotNullParameter(context, "context");
            new L2.a(context).p((C2712g) request, callback, executor, cancellationSignal);
        }
    }

    public void onGetCredential(@NotNull Context context, @NotNull m0 pendingGetCredentialHandle, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void onPrepareCredential(@NotNull g0 request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public final void setGoogleApiAvailability(@NotNull GoogleApiAvailability googleApiAvailability) {
        Intrinsics.checkNotNullParameter(googleApiAvailability, "<set-?>");
        this.googleApiAvailability = googleApiAvailability;
    }

    @Override // C2.InterfaceC2725u
    public void onGetCredential(@NotNull Context context, @NotNull g0 request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r<h0, o> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        INSTANCE.getClass();
        if (Companion.a(cancellationSignal)) {
            return;
        }
        Intrinsics.checkNotNullParameter(request, "request");
        Iterator<AbstractC2724t> it = request.a().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof C6656b) {
                new M2.a(context).p(request, cancellationSignal, executor, callback);
                return;
            }
        }
        new J2.a(context).o(request, cancellationSignal, executor, callback);
    }
}
