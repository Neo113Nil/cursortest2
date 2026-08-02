package androidx.view.playservices.controllers.identityauth.beginsignin;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 62 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00016B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0007@\u0007X\u0086.¢\u0006\u0018\n\u0004\b\r\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0086.¢\u0006\u0018\n\u0004\b\u000f\u0010*\u0012\u0004\b/\u0010)\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00104"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/GetCredentialRequest;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Landroidx/credentials/GetCredentialRequest;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "convertRequestToPlayServices", "(Landroidx/credentials/GetCredentialRequest;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Landroidx/credentials/GetCredentialResponse;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "Landroidx/credentials/CredentialManagerCallback;", "getCallback", "()Landroidx/credentials/CredentialManagerCallback;", "setCallback", "(Landroidx/credentials/CredentialManagerCallback;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "getHighSpeedVideoFpsRanges", "Landroid/os/CancellationSignal;", "getHighSpeedVideoFpsRangesFor", "Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController$resultReceiver$1;", "Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController$resultReceiver$1;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CredentialProviderBeginSignInController extends androidx.view.playservices.controllers.CredentialProviderController<androidx.view.GetCredentialRequest, com.google.android.gms.auth.api.identity.BeginSignInRequest, com.google.android.gms.auth.api.identity.SignInCredential, androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.Companion INSTANCE = new androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.Companion(null);
    public androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback;
    public java.util.concurrent.Executor executor;
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.os.CancellationSignal getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1 Camera2StreamConfigurationMap;

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.Camera2StreamConfigurationMap = new android.os.ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int resultCode, android.os.Bundle resultData) {
                android.os.CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultData, "");
                androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController credentialProviderBeginSignInController = androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this;
                androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 credentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 = new androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE);
                java.util.concurrent.Executor executor = androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this.getExecutor();
                androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback = androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this.getCallback();
                cancellationSignal = androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this.getHighSpeedVideoFpsRangesFor;
                maybeReportErrorFromResultReceiver = credentialProviderBeginSignInController.maybeReportErrorFromResultReceiver(resultData, credentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1, executor, callback, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(androidx.view.playservices.controllers.CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (android.content.Intent) resultData.getParcelable(androidx.view.playservices.controllers.CredentialProviderBaseController.RESULT_DATA_TAG));
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
    public final void invokePlayServices(androidx.view.GetCredentialRequest request, androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback, java.util.concurrent.Executor executor, final android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.getHighSpeedVideoFpsRangesFor = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.BeginSignInResult> beginSignIn = com.google.android.gms.auth.api.identity.Identity.getSignInClient(this.getHighResolutionOutputSizeshNQ4ISI).beginSignIn(convertRequestToPlayServices(request));
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.Camera2StreamConfigurationMap(cancellationSignal, this, (com.google.android.gms.auth.api.identity.BeginSignInResult) obj);
                return Camera2StreamConfigurationMap;
            }
        };
        beginSignIn.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda10
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.m9085$r8$lambda$5OutTd8oFYol8eKyqgeLilv0oM(androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this, cancellationSignal, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(android.os.CancellationSignal cancellationSignal, final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController credentialProviderBeginSignInController, com.google.android.gms.auth.api.identity.BeginSignInResult beginSignInResult) {
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return kotlin.Unit.INSTANCE;
        }
        android.content.Intent intent = new android.content.Intent(credentialProviderBeginSignInController.getHighResolutionOutputSizeshNQ4ISI, (java.lang.Class<?>) androidx.view.playservices.controllers.identityauth.HiddenActivity.class);
        credentialProviderBeginSignInController.generateHiddenActivityIntent(credentialProviderBeginSignInController.Camera2StreamConfigurationMap, intent, androidx.view.playservices.controllers.CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        intent.putExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, beginSignInResult.getPendingIntent());
        try {
            credentialProviderBeginSignInController.getHighResolutionOutputSizeshNQ4ISI.startActivity(intent);
        } catch (java.lang.Exception unused) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.m9089$r8$lambda$vMZdvLj2M7U_B3OleHc0rnE7c0(androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.credentials.exceptions.GetCredentialInterruptedException] */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, android.content.Intent data) {
        if (uniqueRequestCode != androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release();
            return;
        }
        if (androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.maybeReportErrorResultCodeGet$credentials_play_services_auth_release(resultCode, new kotlin.jvm.functions.Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.$r8$lambda$s7gLnk0tya07XH5YR16e_nLUe5Y((android.os.CancellationSignal) obj, (kotlin.jvm.functions.Function0) obj2);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.m9086$r8$lambda$Kaw0gHjDZL9mHvo8F5OH9G13lg(androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this, (androidx.view.exceptions.GetCredentialException) obj);
            }
        }, this.getHighSpeedVideoFpsRangesFor)) {
            return;
        }
        try {
            com.google.android.gms.auth.api.identity.SignInCredential signInCredentialFromIntent = com.google.android.gms.auth.api.identity.Identity.getSignInClient(this.getHighResolutionOutputSizeshNQ4ISI).getSignInCredentialFromIntent(data);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signInCredentialFromIntent, "");
            final androidx.view.GetCredentialResponse convertResponseToCredentialManager = convertResponseToCredentialManager(signInCredentialFromIntent);
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.$r8$lambda$GmaKzmFpLNkNQ0dXrSjERENixQE(androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this, convertResponseToCredentialManager);
                }
            });
        } catch (androidx.view.exceptions.GetCredentialException e) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.$r8$lambda$2UD_RHfg9cTeAm2jLmyhZdS1olQ(androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this, e);
                }
            });
        } catch (com.google.android.gms.common.api.ApiException e2) {
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = new androidx.view.exceptions.GetCredentialUnknownException(e2.getMessage());
            if (e2.getStatusCode() == 16) {
                objectRef.element = new androidx.view.exceptions.GetCredentialCancellationException(e2.getMessage());
            } else if (androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getRetryables().contains(java.lang.Integer.valueOf(e2.getStatusCode()))) {
                objectRef.element = new androidx.view.exceptions.GetCredentialInterruptedException(e2.getMessage());
            }
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.$r8$lambda$ZRRtY65UXrIZMXWE8uWW3tlTLn0(androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this, objectRef);
                }
            });
        } catch (java.lang.Throwable th) {
            final androidx.view.exceptions.GetCredentialUnknownException getCredentialUnknownException = new androidx.view.exceptions.GetCredentialUnknownException(th.getMessage());
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.$r8$lambda$BJyXBVL5EDIGXQsl3o6vL07MP0I(androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this, getCredentialUnknownException);
                }
            });
        }
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final com.google.android.gms.auth.api.identity.BeginSignInRequest convertRequestToPlayServices(androidx.view.GetCredentialRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return androidx.view.playservices.controllers.identityauth.beginsignin.BeginSignInControllerUtility.INSTANCE.constructBeginSignInRequest$credentials_play_services_auth_release(request, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final androidx.view.GetCredentialResponse convertResponseToCredentialManager(com.google.android.gms.auth.api.identity.SignInCredential response) {
        androidx.view.PublicKeyCredential publicKeyCredential;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (response.getPassword() != null) {
            java.lang.String id = response.getId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
            java.lang.String password = response.getPassword();
            kotlin.jvm.internal.Intrinsics.checkNotNull(password);
            publicKeyCredential = new androidx.view.PasswordCredential(id, password);
        } else if (response.getGoogleIdToken() == null) {
            publicKeyCredential = response.getPublicKeyCredential() != null ? new androidx.view.PublicKeyCredential(androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.INSTANCE.toAssertPasskeyResponse(response)) : null;
        } else {
            com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder builder = new com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder();
            java.lang.String id2 = response.getId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id2, "");
            com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder id3 = builder.setId(id2);
            java.lang.String googleIdToken = response.getGoogleIdToken();
            kotlin.jvm.internal.Intrinsics.checkNotNull(googleIdToken);
            com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder idToken = id3.setIdToken(googleIdToken);
            if (response.getDisplayName() != null) {
                idToken.setDisplayName(response.getDisplayName());
            }
            if (response.getGivenName() != null) {
                idToken.setGivenName(response.getGivenName());
            }
            if (response.getFamilyName() != null) {
                idToken.setFamilyName(response.getFamilyName());
            }
            if (response.getPhoneNumber() != null) {
                idToken.setPhoneNumber(response.getPhoneNumber());
            }
            if (response.getProfilePictureUri() != null) {
                idToken.setProfilePictureUri(response.getProfilePictureUri());
            }
            publicKeyCredential = idToken.build();
        }
        if (publicKeyCredential == null) {
            throw new androidx.view.exceptions.GetCredentialUnknownException("When attempting to convert get response, null credential found");
        }
        return new androidx.view.GetCredentialResponse(publicKeyCredential);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController;", "getInstance", "(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController(context);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2UD_RHfg9cTeAm2jLmyhZdS1olQ(final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController credentialProviderBeginSignInController, final androidx.view.exceptions.GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this.getCallback().onError(getCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5Out-Td8oFYol8eKyqgeLilv0oM, reason: not valid java name */
    public static /* synthetic */ void m9085$r8$lambda$5OutTd8oFYol8eKyqgeLilv0oM(final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController credentialProviderBeginSignInController, android.os.CancellationSignal cancellationSignal, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        java.lang.Exception exc2 = exc;
        java.lang.String str = ((exc2 instanceof com.google.android.gms.common.api.ApiException) && androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getRetryables().contains(java.lang.Integer.valueOf(((com.google.android.gms.common.api.ApiException) exc2).getStatusCode()))) ? androidx.view.playservices.controllers.CredentialProviderBaseController.GET_INTERRUPTED : androidx.view.playservices.controllers.CredentialProviderBaseController.GET_NO_CREDENTIALS;
        androidx.view.playservices.controllers.CredentialProviderBaseController.Companion companion = androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("During begin sign in, failure response from one tap: ");
        sb.append(exc2.getMessage());
        final androidx.view.exceptions.GetCredentialException credentialExceptionTypeToException$credentials_play_services_auth_release = companion.getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, sb.toString());
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.m9087$r8$lambda$KhRx7qBazGyA3HwZponk8q2rE(androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this, credentialExceptionTypeToException$credentials_play_services_auth_release);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BJyXBVL5EDIGXQsl3o6vL07MP0I(final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController credentialProviderBeginSignInController, final androidx.view.exceptions.GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderBeginSignInController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this.getCallback().onError(getCredentialUnknownException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GmaKzmFpLNkNQ0dXrSjERENixQE(final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController credentialProviderBeginSignInController, final androidx.view.GetCredentialResponse getCredentialResponse) {
        credentialProviderBeginSignInController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this.getCallback().onResult(getCredentialResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Kaw0gHj-DZL9mHvo8F5OH9G13lg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9086$r8$lambda$Kaw0gHjDZL9mHvo8F5OH9G13lg(final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController credentialProviderBeginSignInController, final androidx.view.exceptions.GetCredentialException getCredentialException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCredentialException, "");
        credentialProviderBeginSignInController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this.getCallback().onError(getCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KhRx7qB-azGyA3HwZponk8q2-rE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9087$r8$lambda$KhRx7qBazGyA3HwZponk8q2rE(final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController credentialProviderBeginSignInController, final androidx.view.exceptions.GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this.getCallback().onError(getCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZRRtY65UXrIZMXWE8uWW3tlTLn0(final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController credentialProviderBeginSignInController, final kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        credentialProviderBeginSignInController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this.getCallback().onError(objectRef.element);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s7gLnk0tya07XH5YR16e_nLUe5Y(android.os.CancellationSignal cancellationSignal, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, function0);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vMZdvLj2M7U_B3OleHc0rnE7-c0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9089$r8$lambda$vMZdvLj2M7U_B3OleHc0rnE7c0(final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        credentialProviderBeginSignInController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.this.getCallback().onError(new androidx.view.exceptions.GetCredentialUnknownException(androidx.view.playservices.controllers.CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }
}
