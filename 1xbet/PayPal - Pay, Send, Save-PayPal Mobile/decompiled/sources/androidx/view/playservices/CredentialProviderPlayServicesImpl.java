package androidx.view.playservices;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010#\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"0\fH\u0016¢\u0006\u0004\b#\u0010$J3\u0010(\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\fH\u0016¢\u0006\u0004\b(\u0010)J?\u0010*\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"0\fH\u0002¢\u0006\u0004\b*\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R(\u0010-\u001a\u00020,8\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Landroidx/credentials/CredentialProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/credentials/GetCredentialRequest;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", com.sun.jna.Callback.METHOD_NAME, "", "onGetCredential", "(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "Landroidx/credentials/CreateCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Landroidx/credentials/CreateCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "", "isAvailableOnDevice", "()Z", "", "minApkVersion", "(I)Z", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "Landroidx/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Landroidx/credentials/ClearCredentialStateRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "Landroidx/credentials/SignalCredentialStateRequest;", "Landroidx/credentials/SignalCredentialStateResponse;", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "onSignalCredentialState", "(Landroidx/credentials/SignalCredentialStateRequest;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "runFallbackClearCredFlow", "Landroid/content/Context;", "Lcom/google/android/gms/common/GoogleApiAvailability;", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/GoogleApiAvailability;)V", "getGoogleApiAvailability$annotations", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CredentialProviderPlayServicesImpl implements androidx.view.CredentialProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.CredentialProviderPlayServicesImpl.Companion INSTANCE = new androidx.view.playservices.CredentialProviderPlayServicesImpl.Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final java.lang.String TAG = "PlayServicesImpl";
    private final android.content.Context context;
    private com.google.android.gms.common.GoogleApiAvailability googleApiAvailability;

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    public CredentialProviderPlayServicesImpl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "");
        this.googleApiAvailability = googleApiAvailability;
    }

    public final com.google.android.gms.common.GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final void setGoogleApiAvailability(com.google.android.gms.common.GoogleApiAvailability googleApiAvailability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleApiAvailability, "");
        this.googleApiAvailability = googleApiAvailability;
    }

    @Override // androidx.view.CredentialProvider
    public final void onGetCredential(android.content.Context context, androidx.view.GetCredentialRequest request, android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        androidx.view.playservices.CredentialProviderPlayServicesImpl.Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isDigitalCredentialRequest$credentials_play_services_auth_release(request)) {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit onGetCredential$lambda$1;
                        onGetCredential$lambda$1 = androidx.view.playservices.CredentialProviderPlayServicesImpl.onGetCredential$lambda$1(executor, callback);
                        return onGetCredential$lambda$1;
                    }
                });
                return;
            } else {
                new androidx.view.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            }
        }
        if (companion.isGetRestoreCredentialRequest$credentials_play_services_auth_release(request)) {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit onGetCredential$lambda$3;
                        onGetCredential$lambda$3 = androidx.view.playservices.CredentialProviderPlayServicesImpl.onGetCredential$lambda$3(executor, callback);
                        return onGetCredential$lambda$3;
                    }
                });
                return;
            } else {
                new androidx.view.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            }
        }
        if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            new androidx.view.playservices.controllers.identitycredentials.getcredential.GetCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new androidx.view.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new androidx.view.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onGetCredential$lambda$1(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$lambda$0(androidx.view.CredentialManagerCallback.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(androidx.view.CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new androidx.view.exceptions.GetCredentialProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onGetCredential$lambda$3(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.CredentialProviderPlayServicesImpl.onGetCredential$lambda$3$lambda$2(androidx.view.CredentialManagerCallback.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(androidx.view.CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new androidx.view.exceptions.GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    @Override // androidx.view.CredentialProvider
    public final void onCreateCredential(android.content.Context context, androidx.view.CreateCredentialRequest request, android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        androidx.view.playservices.CredentialProviderPlayServicesImpl.Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (request instanceof androidx.view.CreatePasswordRequest) {
            if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.INSTANCE.getInstance(context).invokePlayServices((androidx.view.CreatePasswordRequest) request, callback, executor, cancellationSignal);
                return;
            } else {
                androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.INSTANCE.getInstance(context).invokePlayServices((androidx.view.CreatePasswordRequest) request, callback, executor, cancellationSignal);
                return;
            }
        }
        if (request instanceof androidx.view.CreatePublicKeyCredentialRequest) {
            if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                androidx.view.CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = (androidx.view.CreatePublicKeyCredentialRequest) request;
                if (!createPublicKeyCredentialRequest.getIsConditional()) {
                    androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices(createPublicKeyCredentialRequest, callback, executor, cancellationSignal);
                    return;
                }
            }
            androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices((androidx.view.CreatePublicKeyCredentialRequest) request, callback, executor, cancellationSignal);
            return;
        }
        if (request instanceof androidx.view.CreateRestoreCredentialRequest) {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit onCreateCredential$lambda$5;
                        onCreateCredential$lambda$5 = androidx.view.playservices.CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5(executor, callback);
                        return onCreateCredential$lambda$5;
                    }
                });
                return;
            } else {
                new androidx.view.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController(context).invokePlayServices((androidx.view.CreateRestoreCredentialRequest) request, callback, executor, cancellationSignal);
                return;
            }
        }
        if (request instanceof androidx.view.CreateDigitalCredentialRequest) {
            new androidx.view.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController(context).invokePlayServices((androidx.view.CreateDigitalCredentialRequest) request, callback, executor, cancellationSignal);
            return;
        }
        throw new java.lang.UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onCreateCredential$lambda$5(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5$lambda$4(androidx.view.CredentialManagerCallback.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(androidx.view.CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new androidx.view.exceptions.CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    @Override // androidx.view.CredentialProvider
    public final boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z = isGooglePlayServicesAvailable == 0;
        if (!z) {
            new com.google.android.gms.common.ConnectionResult(isGooglePlayServicesAvailable);
        }
        return z;
    }

    private final int isGooglePlayServicesAvailable(android.content.Context context, int minApkVersion) {
        return this.googleApiAvailability.isGooglePlayServicesAvailable(context, minApkVersion);
    }

    @Override // androidx.view.CredentialProvider
    public final void onClearCredential(final androidx.view.ClearCredentialStateRequest request, final android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback<java.lang.Void, androidx.view.exceptions.ClearCredentialException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        androidx.view.playservices.CredentialProviderPlayServicesImpl.Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(request.getRequestType(), androidx.view.ClearCredentialStateRequest.TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit onClearCredential$lambda$7;
                        onClearCredential$lambda$7 = androidx.view.playservices.CredentialProviderPlayServicesImpl.onClearCredential$lambda$7(executor, callback);
                        return onClearCredential$lambda$7;
                    }
                });
                return;
            }
            com.google.android.gms.tasks.Task<java.lang.Boolean> clearRestoreCredential = com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential.getRestoreCredentialClient(this.context).clearRestoreCredential(new com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest(request.getRequestBundle()));
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit onClearCredential$lambda$10;
                    onClearCredential$lambda$10 = androidx.view.playservices.CredentialProviderPlayServicesImpl.onClearCredential$lambda$10(cancellationSignal, executor, callback, (java.lang.Boolean) obj);
                    return onClearCredential$lambda$10;
                }
            };
            kotlin.jvm.internal.Intrinsics.checkNotNull(clearRestoreCredential.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    kotlin.jvm.functions.Function1.this.invoke(obj);
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    androidx.view.playservices.CredentialProviderPlayServicesImpl.onClearCredential$lambda$14(cancellationSignal, executor, callback, exc);
                }
            }));
            return;
        }
        if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            com.google.android.gms.tasks.Task<com.google.android.gms.identitycredentials.ClearCredentialStateResponse> clearCredentialState = com.google.android.gms.identitycredentials.IdentityCredentialManager.INSTANCE.getClient(this.context).clearCredentialState(new com.google.android.gms.identitycredentials.ClearCredentialStateRequest());
            final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit onClearCredential$lambda$17;
                    onClearCredential$lambda$17 = androidx.view.playservices.CredentialProviderPlayServicesImpl.onClearCredential$lambda$17(cancellationSignal, executor, callback, (com.google.android.gms.identitycredentials.ClearCredentialStateResponse) obj);
                    return onClearCredential$lambda$17;
                }
            };
            kotlin.jvm.internal.Intrinsics.checkNotNull(clearCredentialState.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda5
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    kotlin.jvm.functions.Function1.this.invoke(obj);
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda6
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    androidx.view.playservices.CredentialProviderPlayServicesImpl.onClearCredential$lambda$19(androidx.view.playservices.CredentialProviderPlayServicesImpl.this, request, cancellationSignal, executor, callback, exc);
                }
            }));
            return;
        }
        runFallbackClearCredFlow(request, cancellationSignal, executor, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onClearCredential$lambda$7(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.CredentialProviderPlayServicesImpl.onClearCredential$lambda$7$lambda$6(androidx.view.CredentialManagerCallback.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(androidx.view.CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new androidx.view.exceptions.ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onClearCredential$lambda$10(android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, java.lang.Boolean bool) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit onClearCredential$lambda$10$lambda$9;
                onClearCredential$lambda$10$lambda$9 = androidx.view.playservices.CredentialProviderPlayServicesImpl.onClearCredential$lambda$10$lambda$9(executor, credentialManagerCallback);
                return onClearCredential$lambda$10$lambda$9;
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onClearCredential$lambda$10$lambda$9(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onResult(null);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    public static final void onClearCredential$lambda$14(android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = new androidx.view.exceptions.ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((exc instanceof com.google.android.gms.common.api.ApiException) && ((com.google.android.gms.common.api.ApiException) exc).getStatusCode() == 40201) {
            objectRef.element = new androidx.view.exceptions.ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit onClearCredential$lambda$14$lambda$13;
                onClearCredential$lambda$14$lambda$13 = androidx.view.playservices.CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13(executor, credentialManagerCallback, objectRef);
                return onClearCredential$lambda$14$lambda$13;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onClearCredential$lambda$14$lambda$13(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12(androidx.view.CredentialManagerCallback.this, objectRef);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(androidx.view.CredentialManagerCallback credentialManagerCallback, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        credentialManagerCallback.onError(objectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onClearCredential$lambda$17(android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, com.google.android.gms.identitycredentials.ClearCredentialStateResponse clearCredentialStateResponse) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit onClearCredential$lambda$17$lambda$16;
                onClearCredential$lambda$17$lambda$16 = androidx.view.playservices.CredentialProviderPlayServicesImpl.onClearCredential$lambda$17$lambda$16(executor, credentialManagerCallback);
                return onClearCredential$lambda$17$lambda$16;
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onClearCredential$lambda$17$lambda$16(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onResult(null);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$19(androidx.view.playservices.CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, androidx.view.ClearCredentialStateRequest clearCredentialStateRequest, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, androidx.view.CredentialManagerCallback credentialManagerCallback, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(clearCredentialStateRequest, cancellationSignal, executor, credentialManagerCallback);
    }

    @Override // androidx.view.CredentialProvider
    public final void onSignalCredentialState(androidx.view.SignalCredentialStateRequest request, java.util.concurrent.Executor executor, androidx.view.CredentialManagerCallback<androidx.view.SignalCredentialStateResponse, androidx.view.exceptions.publickeycredential.SignalCredentialStateException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        androidx.view.playservices.controllers.CredentialProviderController.invokePlayServices$default(androidx.view.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController.INSTANCE.getInstance(this.context), request, callback, executor, null, 8, null);
    }

    private final void runFallbackClearCredFlow(androidx.view.ClearCredentialStateRequest request, final android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback<java.lang.Void, androidx.view.exceptions.ClearCredentialException> callback) {
        com.google.android.gms.tasks.Task<java.lang.Void> signOut = com.google.android.gms.auth.api.identity.Identity.getSignInClient(this.context).signOut();
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit runFallbackClearCredFlow$lambda$22;
                runFallbackClearCredFlow$lambda$22 = androidx.view.playservices.CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, callback, (java.lang.Void) obj);
                return runFallbackClearCredFlow$lambda$22;
            }
        };
        signOut.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda16
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda17
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                androidx.view.playservices.CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27(androidx.view.playservices.CredentialProviderPlayServicesImpl.this, cancellationSignal, executor, callback, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit runFallbackClearCredFlow$lambda$22(android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, java.lang.Void r4) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit runFallbackClearCredFlow$lambda$22$lambda$21;
                runFallbackClearCredFlow$lambda$22$lambda$21 = androidx.view.playservices.CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22$lambda$21(executor, credentialManagerCallback);
                return runFallbackClearCredFlow$lambda$22$lambda$21;
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit runFallbackClearCredFlow$lambda$22$lambda$21(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onResult(null);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(androidx.view.playservices.CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25;
                runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25 = androidx.view.playservices.CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(exc, executor, credentialManagerCallback);
                return runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(final java.lang.Exception exc, java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(androidx.view.CredentialManagerCallback.this, exc);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(androidx.view.CredentialManagerCallback credentialManagerCallback, java.lang.Exception exc) {
        credentialManagerCallback.onError(new androidx.view.exceptions.ClearCredentialUnknownException(exc.getMessage()));
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "", com.sun.jna.Callback.METHOD_NAME, "cancellationReviewerWithCallback$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function0;)V", "", "cancellationReviewer$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;)Z", "Landroidx/credentials/GetCredentialRequest;", "request", "isGetSignInIntentRequest$credentials_play_services_auth_release", "(Landroidx/credentials/GetCredentialRequest;)Z", "isGetRestoreCredentialRequest$credentials_play_services_auth_release", "isDigitalCredentialRequest$credentials_play_services_auth_release", "", "TAG", "Ljava/lang/String;", "", "MIN_GMS_APK_VERSION", com.visa.cbp.getEncExpo.warmup, "PRE_U_MIN_GMS_APK_VERSION", "MIN_GMS_APK_VERSION_RESTORE_CRED", "MIN_GMS_APK_VERSION_DIGITAL_CRED"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(android.os.CancellationSignal cancellationSignal, kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(android.os.CancellationSignal cancellationSignal) {
            return cancellationSignal != null && cancellationSignal.isCanceled();
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(androidx.view.GetCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            java.util.Iterator<androidx.view.CredentialOption> it = request.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetRestoreCredentialRequest$credentials_play_services_auth_release(androidx.view.GetCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            java.util.Iterator<androidx.view.CredentialOption> it = request.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof androidx.view.GetRestoreCredentialOption) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isDigitalCredentialRequest$credentials_play_services_auth_release(androidx.view.GetCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            java.util.Iterator<androidx.view.CredentialOption> it = request.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof androidx.view.GetDigitalCredentialOption) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
