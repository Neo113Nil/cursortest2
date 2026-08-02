package androidx.view.playservices.controllers.identitycredentials.getdigitalcredential;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 /2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001/B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0007@\u0007X\u0086.¢\u0006\u0018\n\u0004\b\r\u0010\u001d\u0012\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0086.¢\u0006\u0018\n\u0004\b\u000f\u0010$\u0012\u0004\b)\u0010#\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010*\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010."}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/CredentialProviderGetDigitalCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/GetCredentialRequest;", "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lcom/google/android/gms/identitycredentials/GetCredentialResponse;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Landroidx/credentials/GetCredentialRequest;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Landroidx/credentials/GetCredentialRequest;)Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/identitycredentials/GetCredentialResponse;)Landroidx/credentials/GetCredentialResponse;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "Landroidx/credentials/CredentialManagerCallback;", "getCallback", "()Landroidx/credentials/CredentialManagerCallback;", "setCallback", "(Landroidx/credentials/CredentialManagerCallback;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "getHighSpeedVideoSizes", "Landroid/os/CancellationSignal;", "Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1;", "Camera2StreamConfigurationMap", "Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1;", "Companion_"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CredentialProviderGetDigitalCredentialController extends androidx.view.playservices.controllers.CredentialProviderController<androidx.view.GetCredentialRequest, com.google.android.gms.identitycredentials.GetCredentialRequest, com.google.android.gms.identitycredentials.GetCredentialResponse, androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> {
    private static final androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.Companion_ Companion_ = new androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.Companion_(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1 getHighSpeedVideoSizes;
    public androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback;
    public java.util.concurrent.Executor executor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.os.CancellationSignal getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1] */
    public CredentialProviderGetDigitalCredentialController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighSpeedVideoSizes = new android.os.ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int resultCode, android.os.Bundle resultData) {
                android.os.CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                android.os.CancellationSignal cancellationSignal2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultData, "");
                androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.this;
                androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1 = new androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1(androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE);
                java.util.concurrent.Executor executor = androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.this.getExecutor();
                androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback = androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.this.getCallback();
                cancellationSignal = androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.this.getHighResolutionOutputSizeshNQ4ISI;
                maybeReportErrorFromResultReceiver = credentialProviderGetDigitalCredentialController.maybeReportErrorFromResultReceiver(resultData, credentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1, executor, callback, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                androidx.view.playservices.controllers.ResponseUtils.Companion companion = androidx.view.playservices.controllers.ResponseUtils.INSTANCE;
                int i = resultData.getInt(androidx.view.playservices.controllers.CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG);
                android.content.Intent intent = (android.content.Intent) androidx.core.os.BundleCompat.getParcelable(resultData, androidx.view.playservices.controllers.CredentialProviderBaseController.RESULT_DATA_TAG, android.content.Intent.class);
                java.util.concurrent.Executor executor2 = androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.this.getExecutor();
                androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback2 = androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.this.getCallback();
                cancellationSignal2 = androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.this.getHighResolutionOutputSizeshNQ4ISI;
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
    public final void invokePlayServices(androidx.view.GetCredentialRequest request, final androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback, final java.util.concurrent.Executor executor, final android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        com.google.android.gms.tasks.Task<com.google.android.gms.identitycredentials.PendingGetCredentialHandle> credential = com.google.android.gms.identitycredentials.IdentityCredentialManager.INSTANCE.getClient(this.getHighSpeedVideoFpsRangesFor).getCredential(convertRequestToPlayServices(request));
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.m9125$r8$lambda$42KrmWHVmTbDLoSyLGZlQ0lLkg(cancellationSignal, this, (com.google.android.gms.identitycredentials.PendingGetCredentialHandle) obj);
            }
        };
        credential.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.$r8$lambda$KpO3c7kfkTMjoR8R2Im41hJ_h0o(androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.this, cancellationSignal, executor, callback, exc);
            }
        });
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final com.google.android.gms.identitycredentials.GetCredentialRequest convertRequestToPlayServices(androidx.view.GetCredentialRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.view.CredentialOption credentialOption : request.getCredentialOptions()) {
            if (credentialOption instanceof androidx.view.GetDigitalCredentialOption) {
                arrayList.add(new com.google.android.gms.identitycredentials.CredentialOption(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData(), ((androidx.view.GetDigitalCredentialOption) credentialOption).getRequestJson(), "", ""));
            }
        }
        return new com.google.android.gms.identitycredentials.GetCredentialRequest(arrayList, androidx.view.GetCredentialRequest.INSTANCE.getRequestMetadataBundle(request), request.getOrigin(), new android.os.ResultReceiver(null));
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final androidx.view.GetCredentialResponse convertResponseToCredentialManager(com.google.android.gms.identitycredentials.GetCredentialResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return new androidx.view.GetCredentialResponse(androidx.view.Credential.INSTANCE.createFrom(androidx.view.DigitalCredential.TYPE_DIGITAL_CREDENTIAL, response.getCredential().getData()));
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/CredentialProviderGetDigitalCredentialController$Companion_;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion_ {
        private Companion_() {
        }

        public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$42KrmWHVmTbDLoSyLGZlQ0lLk-g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9125$r8$lambda$42KrmWHVmTbDLoSyLGZlQ0lLkg(android.os.CancellationSignal cancellationSignal, androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, com.google.android.gms.identitycredentials.PendingGetCredentialHandle pendingGetCredentialHandle) {
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return kotlin.Unit.INSTANCE;
        }
        android.content.Intent intent = new android.content.Intent(credentialProviderGetDigitalCredentialController.getHighSpeedVideoFpsRangesFor, (java.lang.Class<?>) androidx.view.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity.class);
        intent.setFlags(65536);
        intent.putExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.RESULT_RECEIVER_TAG, credentialProviderGetDigitalCredentialController.toIpcFriendlyResultReceiver(credentialProviderGetDigitalCredentialController.getHighSpeedVideoSizes));
        intent.putExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingGetCredentialHandle.getPendingIntent());
        intent.putExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_ERROR_NAME, androidx.view.playservices.controllers.CredentialProviderBaseController.GET_UNKNOWN);
        credentialProviderGetDigitalCredentialController.getHighSpeedVideoFpsRangesFor.startActivity(intent);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DZrKHrlNOV6-KssX_lDQis_nRXs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9126$r8$lambda$DZrKHrlNOV6KssX_lDQis_nRXs(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final androidx.view.exceptions.GetCredentialException getCredentialException) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onError(getCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$KpO3c7kfkTMjoR8R2Im41hJ_h0o(androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, java.lang.Exception exc) {
        final androidx.view.exceptions.GetCredentialUnknownException getCredentialUnknownException;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        java.lang.Exception exc2 = exc;
        if (exc2 instanceof com.google.android.gms.identitycredentials.GetCredentialException) {
            getCredentialUnknownException = androidx.view.internal.ConversionUtilsKt.toJetpackGetException(((com.google.android.gms.identitycredentials.GetCredentialException) exc2).getType(), exc2.getMessage());
        } else if (exc2 instanceof com.google.android.gms.common.api.ApiException) {
            int statusCode = ((com.google.android.gms.common.api.ApiException) exc2).getStatusCode();
            getCredentialUnknownException = statusCode == 16 ? new androidx.view.exceptions.GetCredentialCancellationException(exc2.getMessage()) : androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getRetryables().contains(java.lang.Integer.valueOf(statusCode)) ? new androidx.view.exceptions.GetCredentialInterruptedException(exc2.getMessage()) : new androidx.view.exceptions.GetCredentialUnknownException("Get digital credential failed, failure: ".concat(java.lang.String.valueOf(exc2)));
        } else {
            getCredentialUnknownException = new androidx.view.exceptions.GetCredentialUnknownException("Get digital credential failed, failure: ".concat(java.lang.String.valueOf(exc2)));
        }
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.m9126$r8$lambda$DZrKHrlNOV6KssX_lDQis_nRXs(executor, credentialManagerCallback, getCredentialUnknownException);
            }
        });
    }
}
