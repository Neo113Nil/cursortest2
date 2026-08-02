package androidx.view.playservices.controllers.identitycredentials.signalcredentialstate;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001c2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/SignalCredentialStateRequest;", "Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;", "Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;", "Landroidx/credentials/SignalCredentialStateResponse;", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Landroidx/credentials/SignalCredentialStateRequest;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Landroidx/credentials/SignalCredentialStateRequest;)Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;)Landroidx/credentials/SignalCredentialStateResponse;", "getHighSpeedVideoSizes", "Landroid/content/Context;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SignalCredentialStateController extends androidx.view.playservices.controllers.CredentialProviderController<androidx.view.SignalCredentialStateRequest, com.google.android.gms.identitycredentials.SignalCredentialStateRequest, com.google.android.gms.identitycredentials.SignalCredentialStateResponse, androidx.view.SignalCredentialStateResponse, androidx.view.exceptions.publickeycredential.SignalCredentialStateException> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController.Companion INSTANCE = new androidx.view.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController.Companion(null);
    public static final java.lang.String SIGNAL_REQUEST_JSON_KEY = "androidx.credentials.signal_request_json_key";
    private final android.content.Context getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCredentialStateController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = context;
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final void invokePlayServices(androidx.view.SignalCredentialStateRequest request, final androidx.view.CredentialManagerCallback<androidx.view.SignalCredentialStateResponse, androidx.view.exceptions.publickeycredential.SignalCredentialStateException> callback, final java.util.concurrent.Executor executor, android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        com.google.android.gms.tasks.Task<com.google.android.gms.identitycredentials.SignalCredentialStateResponse> signalCredentialState = com.google.android.gms.identitycredentials.IdentityCredentialManager.INSTANCE.getClient(this.getHighSpeedVideoSizes).signalCredentialState(convertRequestToPlayServices(request));
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController.$r8$lambda$SvlpUGCw7Sf2FZdJz4gwYbpL5Uo(executor, this, callback, (com.google.android.gms.identitycredentials.SignalCredentialStateResponse) obj);
            }
        };
        signalCredentialState.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                androidx.view.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController.$r8$lambda$kiw3Dt_EfC98K3mPMJfv7B7kjyA(executor, callback, exc);
            }
        });
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final com.google.android.gms.identitycredentials.SignalCredentialStateRequest convertRequestToPlayServices(androidx.view.SignalCredentialStateRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return new com.google.android.gms.identitycredentials.SignalCredentialStateRequest(request.getType(), request.getOrigin(), request.getRequestData());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final androidx.view.SignalCredentialStateResponse convertResponseToCredentialManager(com.google.android.gms.identitycredentials.SignalCredentialStateResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return new androidx.view.SignalCredentialStateResponse();
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;", "getInstance", "(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;", "", "SIGNAL_REQUEST_JSON_KEY", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new androidx.view.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController(context);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SvlpUGCw7Sf2FZdJz4gwYbpL5Uo(java.util.concurrent.Executor executor, androidx.view.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController signalCredentialStateController, final androidx.view.CredentialManagerCallback credentialManagerCallback, com.google.android.gms.identitycredentials.SignalCredentialStateResponse signalCredentialStateResponse) {
        if (signalCredentialStateResponse == null) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.view.CredentialManagerCallback.this.onError(androidx.view.exceptions.publickeycredential.SignalCredentialStateException.INSTANCE.createFrom("No SignalCredentialStateResponse received"));
                }
            });
            return kotlin.Unit.INSTANCE;
        }
        final androidx.view.SignalCredentialStateResponse convertResponseToCredentialManager = signalCredentialStateController.convertResponseToCredentialManager(signalCredentialStateResponse);
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onResult(convertResponseToCredentialManager);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$kiw3Dt_EfC98K3mPMJfv7B7kjyA(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        final androidx.view.exceptions.publickeycredential.SignalCredentialStateException createFrom = androidx.view.exceptions.publickeycredential.SignalCredentialStateException.INSTANCE.createFrom(exc.getMessage());
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onError(createFrom);
            }
        });
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }
}
