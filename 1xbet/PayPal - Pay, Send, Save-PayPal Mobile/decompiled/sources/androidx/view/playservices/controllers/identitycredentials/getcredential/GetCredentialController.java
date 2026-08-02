package androidx.view.playservices.controllers.identitycredentials.getcredential;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 12 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00011B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0007@\u0007X\u0086.¢\u0006\u0018\n\u0004\b\r\u0010\u001d\u0012\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0086.¢\u0006\u0018\n\u0004\b\u000f\u0010$\u0012\u0004\b)\u0010#\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/GetCredentialRequest;", "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lcom/google/android/gms/identitycredentials/GetCredentialResponse;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Landroidx/credentials/GetCredentialRequest;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Landroidx/credentials/GetCredentialRequest;)Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/identitycredentials/GetCredentialResponse;)Landroidx/credentials/GetCredentialResponse;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/credentials/CredentialManagerCallback;", "getCallback", "()Landroidx/credentials/CredentialManagerCallback;", "setCallback", "(Landroidx/credentials/CredentialManagerCallback;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Camera2StreamConfigurationMap", "Landroid/os/CancellationSignal;", "getHighSpeedVideoFpsRangesFor", "Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController$resultReceiver$1;", "getHighSpeedVideoSizes", "Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController$resultReceiver$1;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCredentialController extends androidx.view.playservices.controllers.CredentialProviderController<androidx.view.GetCredentialRequest, com.google.android.gms.identitycredentials.GetCredentialRequest, com.google.android.gms.identitycredentials.GetCredentialResponse, androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.os.CancellationSignal getHighSpeedVideoFpsRangesFor;
    public androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback;
    private final android.content.Context context;
    public java.util.concurrent.Executor executor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1 getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1] */
    public GetCredentialController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighResolutionOutputSizeshNQ4ISI = new android.os.ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int resultCode, android.os.Bundle resultData) {
                android.os.CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                android.os.CancellationSignal cancellationSignal2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultData, "");
                androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController getCredentialController = androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController.this;
                androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1$onReceiveResult$1 getCredentialController$resultReceiver$1$onReceiveResult$1 = new androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1$onReceiveResult$1(androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE);
                java.util.concurrent.Executor executor = androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController.this.getExecutor();
                androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback = androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController.this.getCallback();
                cancellationSignal = androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController.this.getHighSpeedVideoFpsRangesFor;
                maybeReportErrorFromResultReceiver = getCredentialController.maybeReportErrorFromResultReceiver(resultData, getCredentialController$resultReceiver$1$onReceiveResult$1, executor, callback, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                androidx.view.playservices.controllers.ResponseUtils.Companion companion = androidx.view.playservices.controllers.ResponseUtils.INSTANCE;
                int i = resultData.getInt(androidx.view.playservices.controllers.CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG);
                android.content.Intent intent = (android.content.Intent) androidx.core.os.BundleCompat.getParcelable(resultData, androidx.view.playservices.controllers.CredentialProviderBaseController.RESULT_DATA_TAG, android.content.Intent.class);
                java.util.concurrent.Executor executor2 = androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController.this.getExecutor();
                androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback2 = androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController.this.getCallback();
                cancellationSignal2 = androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController.this.getHighSpeedVideoFpsRangesFor;
                companion.handleGetCredentialResponse(i, resultCode, intent, executor2, callback2, cancellationSignal2);
            }
        };
    }

    public final androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> getCallback() {
        androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> credentialManagerCallback = this.callback;
        if (credentialManagerCallback != null) {
            return credentialManagerCallback;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setCallback(androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> credentialManagerCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialManagerCallback, "");
        this.callback = credentialManagerCallback;
    }

    public final java.util.concurrent.Executor getExecutor() {
        java.util.concurrent.Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setExecutor(java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.executor = executor;
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final void invokePlayServices(final androidx.view.GetCredentialRequest request, final androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback, final java.util.concurrent.Executor executor, final android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.getHighSpeedVideoFpsRangesFor = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        com.google.android.gms.tasks.Task<com.google.android.gms.identitycredentials.PendingGetCredentialHandle> credential = com.google.android.gms.identitycredentials.IdentityCredentialManager.INSTANCE.getClient(this.context).getCredential(convertRequestToPlayServices(request));
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController.getHighSpeedVideoSizes(cancellationSignal, this, executor, callback, (com.google.android.gms.identitycredentials.PendingGetCredentialHandle) obj);
                return highSpeedVideoSizes;
            }
        };
        credential.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController.$r8$lambda$TQX2ZrS59LpBRnV6cJA_BHM6Wp8(androidx.view.GetCredentialRequest.this, this, callback, executor, cancellationSignal, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(android.os.CancellationSignal cancellationSignal, androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController getCredentialController, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, com.google.android.gms.identitycredentials.PendingGetCredentialHandle pendingGetCredentialHandle) {
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return kotlin.Unit.INSTANCE;
        }
        android.content.Intent intent = new android.content.Intent(getCredentialController.context, (java.lang.Class<?>) androidx.view.playservices.controllers.identityauth.HiddenActivity.class);
        getCredentialController.generateHiddenActivityIntent(getCredentialController.getHighResolutionOutputSizeshNQ4ISI, intent, androidx.view.playservices.controllers.CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        intent.putExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingGetCredentialHandle.getPendingIntent());
        try {
            getCredentialController.context.startActivity(intent);
        } catch (java.lang.Exception unused) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController.$r8$lambda$rE6XMHZGxZyRyYgvwQx1lvROGmw(executor, credentialManagerCallback);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final com.google.android.gms.identitycredentials.GetCredentialRequest convertRequestToPlayServices(androidx.view.GetCredentialRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        android.os.Bundle requestMetadataBundle = androidx.view.GetCredentialRequest.INSTANCE.getRequestMetadataBundle(request);
        java.util.List<androidx.view.CredentialOption> credentialOptions = request.getCredentialOptions();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(credentialOptions, 10));
        for (androidx.view.CredentialOption credentialOption : credentialOptions) {
            arrayList.add(new com.google.android.gms.identitycredentials.CredentialOption(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData(), "", "", ""));
        }
        return new com.google.android.gms.identitycredentials.GetCredentialRequest(arrayList, requestMetadataBundle, request.getOrigin(), new android.os.ResultReceiver(null));
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final androidx.view.GetCredentialResponse convertResponseToCredentialManager(com.google.android.gms.identitycredentials.GetCredentialResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return new androidx.view.GetCredentialResponse(androidx.view.Credential.INSTANCE.createFrom(response.getCredential().getType(), response.getCredential().getData()));
    }

    public static /* synthetic */ void $r8$lambda$TQX2ZrS59LpBRnV6cJA_BHM6Wp8(androidx.view.GetCredentialRequest getCredentialRequest, androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController getCredentialController, androidx.view.CredentialManagerCallback credentialManagerCallback, java.util.concurrent.Executor executor, android.os.CancellationSignal cancellationSignal, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.isGetSignInIntentRequest$credentials_play_services_auth_release(getCredentialRequest)) {
            new androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController(getCredentialController.context).invokePlayServices(getCredentialRequest, (androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException>) credentialManagerCallback, executor, cancellationSignal);
        } else {
            new androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController(getCredentialController.context).invokePlayServices(getCredentialRequest, (androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException>) credentialManagerCallback, executor, cancellationSignal);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rE6XMHZGxZyRyYgvwQx1lvROGmw(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onError(new androidx.view.exceptions.GetCredentialUnknownException(androidx.view.playservices.controllers.CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
