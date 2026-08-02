package androidx.view.playservices.controllers.identityauth.getsigninintent;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 92 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00019B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\"\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0007@\u0007X\u0086.¢\u0006\u0018\n\u0004\b\r\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0086.¢\u0006\u0018\n\u0004\b\u000f\u0010.\u0012\u0004\b3\u0010-\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00107"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/GetCredentialRequest;", "Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Landroidx/credentials/GetCredentialRequest;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Landroidx/credentials/GetCredentialRequest;)Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Landroidx/credentials/GetCredentialResponse;", "Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "createGoogleIdCredential", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "getHighSpeedVideoSizes", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Landroidx/credentials/CredentialManagerCallback;", "getCallback", "()Landroidx/credentials/CredentialManagerCallback;", "setCallback", "(Landroidx/credentials/CredentialManagerCallback;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getHighSpeedVideoFpsRanges", "Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1;", "Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CredentialProviderGetSignInIntentController extends androidx.view.playservices.controllers.CredentialProviderController<androidx.view.GetCredentialRequest, com.google.android.gms.auth.api.identity.GetSignInIntentRequest, com.google.android.gms.auth.api.identity.SignInCredential, androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.Companion INSTANCE = new androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.os.CancellationSignal getHighSpeedVideoFpsRanges;
    public androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback;
    public java.util.concurrent.Executor executor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1 getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighSpeedVideoFpsRangesFor = new android.os.ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int resultCode, android.os.Bundle resultData) {
                android.os.CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultData, "");
                androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this;
                androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 credentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 = new androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE);
                java.util.concurrent.Executor executor = androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.getExecutor();
                androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback = androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.getCallback();
                cancellationSignal = androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.getHighSpeedVideoFpsRanges;
                maybeReportErrorFromResultReceiver = credentialProviderGetSignInIntentController.maybeReportErrorFromResultReceiver(resultData, credentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1, executor, callback, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(androidx.view.playservices.controllers.CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (android.content.Intent) resultData.getParcelable(androidx.view.playservices.controllers.CredentialProviderBaseController.RESULT_DATA_TAG));
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
        this.getHighSpeedVideoFpsRanges = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        try {
            com.google.android.gms.tasks.Task<android.app.PendingIntent> signInIntent = com.google.android.gms.auth.api.identity.Identity.getSignInClient(this.Camera2StreamConfigurationMap).getSignInIntent(convertRequestToPlayServices(request));
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.Camera2StreamConfigurationMap(cancellationSignal, this, (android.app.PendingIntent) obj);
                    return Camera2StreamConfigurationMap;
                }
            };
            signInIntent.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda16
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    kotlin.jvm.functions.Function1.this.invoke(obj);
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda17
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.m9102$r8$lambda$husfLskjWZzxNCAZMKb19QXv10(androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this, cancellationSignal, exc);
                }
            });
        } catch (androidx.view.exceptions.GetCredentialUnsupportedException e) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.$r8$lambda$43r6UtMr8cIQW8tOXhqhWkZwL04(androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this, e);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(android.os.CancellationSignal cancellationSignal, final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, android.app.PendingIntent pendingIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "");
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return kotlin.Unit.INSTANCE;
        }
        android.content.Intent intent = new android.content.Intent(credentialProviderGetSignInIntentController.Camera2StreamConfigurationMap, (java.lang.Class<?>) androidx.view.playservices.controllers.identityauth.HiddenActivity.class);
        credentialProviderGetSignInIntentController.generateHiddenActivityIntent(credentialProviderGetSignInIntentController.getHighSpeedVideoFpsRangesFor, intent, androidx.view.playservices.controllers.CredentialProviderBaseController.SIGN_IN_INTENT_TAG);
        intent.putExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingIntent);
        try {
            credentialProviderGetSignInIntentController.Camera2StreamConfigurationMap.startActivity(intent);
        } catch (java.lang.Exception unused) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.$r8$lambda$u7wv2kswaBWXEwBpH6EydosU28g(androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final com.google.android.gms.auth.api.identity.GetSignInIntentRequest convertRequestToPlayServices(androidx.view.GetCredentialRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        if (request.getCredentialOptions().size() != 1) {
            throw new androidx.view.exceptions.GetCredentialUnsupportedException("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        androidx.view.CredentialOption credentialOption = request.getCredentialOptions().get(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(credentialOption, "");
        com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption getSignInWithGoogleOption = (com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption) credentialOption;
        com.google.android.gms.auth.api.identity.GetSignInIntentRequest build = com.google.android.gms.auth.api.identity.GetSignInIntentRequest.builder().setServerClientId(getSignInWithGoogleOption.getZza()).filterByHostedDomain(getSignInWithGoogleOption.getZzb()).setNonce(getSignInWithGoogleOption.getZzc()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final androidx.view.GetCredentialResponse convertResponseToCredentialManager(com.google.android.gms.auth.api.identity.SignInCredential response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        com.google.android.libraries.identity.googleid.GoogleIdTokenCredential createGoogleIdCredential = response.getGoogleIdToken() != null ? createGoogleIdCredential(response) : null;
        if (createGoogleIdCredential == null) {
            throw new androidx.view.exceptions.GetCredentialUnknownException("When attempting to convert get response, null credential found");
        }
        return new androidx.view.GetCredentialResponse(createGoogleIdCredential);
    }

    public final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential createGoogleIdCredential(com.google.android.gms.auth.api.identity.SignInCredential response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder builder = new com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder();
        java.lang.String id = response.getId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder id2 = builder.setId(id);
        try {
            java.lang.String googleIdToken = response.getGoogleIdToken();
            kotlin.jvm.internal.Intrinsics.checkNotNull(googleIdToken);
            id2.setIdToken(googleIdToken);
            if (response.getDisplayName() != null) {
                id2.setDisplayName(response.getDisplayName());
            }
            if (response.getGivenName() != null) {
                id2.setGivenName(response.getGivenName());
            }
            if (response.getFamilyName() != null) {
                id2.setFamilyName(response.getFamilyName());
            }
            if (response.getPhoneNumber() != null) {
                id2.setPhoneNumber(response.getPhoneNumber());
            }
            if (response.getProfilePictureUri() != null) {
                id2.setProfilePictureUri(response.getProfilePictureUri());
            }
            return id2.build();
        } catch (java.lang.Exception unused) {
            throw new androidx.view.exceptions.GetCredentialUnknownException("When attempting to convert get response, null Google ID Token found");
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.credentials.exceptions.GetCredentialInterruptedException] */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, android.content.Intent data) {
        if (uniqueRequestCode != androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release();
            return;
        }
        if (androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.maybeReportErrorResultCodeGet$credentials_play_services_auth_release(resultCode, new kotlin.jvm.functions.Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.m9099$r8$lambda$2JnOX4lfJWytLDIv3mbXNALxyg((android.os.CancellationSignal) obj, (kotlin.jvm.functions.Function0) obj2);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.m9101$r8$lambda$dLxNKnQqoASPS7_Q4717ihVyag(androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this, (androidx.view.exceptions.GetCredentialException) obj);
            }
        }, this.getHighSpeedVideoFpsRanges)) {
            return;
        }
        try {
            com.google.android.gms.auth.api.identity.SignInCredential signInCredentialFromIntent = com.google.android.gms.auth.api.identity.Identity.getSignInClient(this.Camera2StreamConfigurationMap).getSignInCredentialFromIntent(data);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signInCredentialFromIntent, "");
            final androidx.view.GetCredentialResponse convertResponseToCredentialManager = convertResponseToCredentialManager(signInCredentialFromIntent);
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.$r8$lambda$UhSDzM0pmdaeVGZqWxINriEQ7eY(androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this, convertResponseToCredentialManager);
                }
            });
        } catch (androidx.view.exceptions.GetCredentialException e) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.$r8$lambda$cDcGJWr9HISL5DoZVFkbND_fzX0(androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this, e);
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
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.$r8$lambda$eJWI_MrR4gVa12yiZg2esLoQGk0(androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this, objectRef);
                }
            });
        } catch (java.lang.Throwable th) {
            final androidx.view.exceptions.GetCredentialUnknownException getCredentialUnknownException = new androidx.view.exceptions.GetCredentialUnknownException(th.getMessage());
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.$r8$lambda$YGaSs0XA5hmoYSmLeIfzhFZjZ_Q(androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this, getCredentialUnknownException);
                }
            });
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController;", "getInstance", "(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController(context);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$2JnOX4lfJWytLDIv3mbXNALxy-g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9099$r8$lambda$2JnOX4lfJWytLDIv3mbXNALxyg(android.os.CancellationSignal cancellationSignal, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, function0);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$43r6UtMr8cIQW8tOXhqhWkZwL04(final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final androidx.view.exceptions.GetCredentialUnsupportedException getCredentialUnsupportedException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.getCallback().onError(getCredentialUnsupportedException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UhSDzM0pmdaeVGZqWxINriEQ7eY(final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final androidx.view.GetCredentialResponse getCredentialResponse) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.getCallback().onResult(getCredentialResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YGaSs0XA5hmoYSmLeIfzhFZjZ_Q(final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final androidx.view.exceptions.GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.getCallback().onError(getCredentialUnknownException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cDcGJWr9HISL5DoZVFkbND_fzX0(final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final androidx.view.exceptions.GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.getCallback().onError(getCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dLxNKnQqoASPS7_-Q4717ihVyag, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9101$r8$lambda$dLxNKnQqoASPS7_Q4717ihVyag(final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final androidx.view.exceptions.GetCredentialException getCredentialException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCredentialException, "");
        credentialProviderGetSignInIntentController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.getCallback().onError(getCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eJWI_MrR4gVa12yiZg2esLoQGk0(final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.getCallback().onError(objectRef.element);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$husfLskjWZzxNCAZMKb19-QXv10, reason: not valid java name */
    public static /* synthetic */ void m9102$r8$lambda$husfLskjWZzxNCAZMKb19QXv10(final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, android.os.CancellationSignal cancellationSignal, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        java.lang.Exception exc2 = exc;
        java.lang.String str = ((exc2 instanceof com.google.android.gms.common.api.ApiException) && androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getRetryables().contains(java.lang.Integer.valueOf(((com.google.android.gms.common.api.ApiException) exc2).getStatusCode()))) ? androidx.view.playservices.controllers.CredentialProviderBaseController.GET_INTERRUPTED : androidx.view.playservices.controllers.CredentialProviderBaseController.GET_NO_CREDENTIALS;
        androidx.view.playservices.controllers.CredentialProviderBaseController.Companion companion = androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("During get sign-in intent, failure response from one tap: ");
        sb.append(exc2.getMessage());
        final androidx.view.exceptions.GetCredentialException credentialExceptionTypeToException$credentials_play_services_auth_release = companion.getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, sb.toString());
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.m9103$r8$lambda$qp4JwB_m2XoE4Vo6wMytuYAVw(androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this, credentialExceptionTypeToException$credentials_play_services_auth_release);
            }
        });
    }

    /* renamed from: $r8$lambda$qp4JwB_m2Xo-E4Vo6w-MytuYAVw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9103$r8$lambda$qp4JwB_m2XoE4Vo6wMytuYAVw(final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final androidx.view.exceptions.GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.getCallback().onError(getCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$u7wv2kswaBWXEwBpH6EydosU28g(final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.this.getCallback().onError(new androidx.view.exceptions.GetCredentialUnknownException(androidx.view.playservices.controllers.CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }
}
