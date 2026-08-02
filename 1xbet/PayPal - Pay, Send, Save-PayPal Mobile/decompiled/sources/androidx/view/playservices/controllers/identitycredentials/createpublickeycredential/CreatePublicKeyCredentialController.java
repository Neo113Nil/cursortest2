package androidx.view.playservices.controllers.identitycredentials.createpublickeycredential;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 02 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00010B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0004H\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010+R\u0018\u0010%\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/CreatePublicKeyCredentialRequest;", "Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", "Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Landroidx/credentials/CreatePublicKeyCredentialRequest;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "", "e", "fromGmsException", "(Ljava/lang/Throwable;)Landroidx/credentials/exceptions/CreateCredentialException;", "convertRequestToPlayServices", "(Landroidx/credentials/CreatePublicKeyCredentialRequest;)Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;)Landroidx/credentials/CreateCredentialResponse;", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/credentials/CredentialManagerCallback;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/Executor;", "Landroid/os/CancellationSignal;", "Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController$resultReceiver$1;", "getHighSpeedVideoSizes", "Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController$resultReceiver$1;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreatePublicKeyCredentialController extends androidx.view.playservices.controllers.CredentialProviderController<androidx.view.CreatePublicKeyCredentialRequest, com.google.android.gms.identitycredentials.CreateCredentialRequest, com.google.android.gms.identitycredentials.CreateCredentialResponse, androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.Companion INSTANCE = new androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.os.CancellationSignal Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.util.concurrent.Executor getHighSpeedVideoFpsRanges;
    private final androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1 getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1] */
    public CreatePublicKeyCredentialController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighSpeedVideoSizes = new android.os.ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int resultCode, android.os.Bundle resultData) {
                java.util.concurrent.Executor executor;
                java.util.concurrent.Executor executor2;
                androidx.view.CredentialManagerCallback credentialManagerCallback;
                androidx.view.CredentialManagerCallback credentialManagerCallback2;
                android.os.CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultData, "");
                androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController = androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this;
                androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 createPublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE);
                executor = androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this.getHighSpeedVideoFpsRanges;
                if (executor == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    executor2 = null;
                } else {
                    executor2 = executor;
                }
                credentialManagerCallback = androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this.getHighResolutionOutputSizeshNQ4ISI;
                if (credentialManagerCallback == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    credentialManagerCallback2 = null;
                } else {
                    credentialManagerCallback2 = credentialManagerCallback;
                }
                cancellationSignal = androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this.Camera2StreamConfigurationMap;
                maybeReportErrorFromResultReceiver = createPublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, createPublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor2, credentialManagerCallback2, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(androidx.view.playservices.controllers.CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (android.content.Intent) androidx.core.os.BundleCompat.getParcelable(resultData, androidx.view.playservices.controllers.CredentialProviderBaseController.RESULT_DATA_TAG, android.content.Intent.class));
            }
        };
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final void invokePlayServices(androidx.view.CreatePublicKeyCredentialRequest request, final androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> callback, final java.util.concurrent.Executor executor, final android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.Camera2StreamConfigurationMap = cancellationSignal;
        this.getHighResolutionOutputSizeshNQ4ISI = callback;
        this.getHighSpeedVideoFpsRanges = executor;
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        com.google.android.gms.tasks.Task<com.google.android.gms.identitycredentials.CreateCredentialHandle> createCredential = com.google.android.gms.identitycredentials.IdentityCredentialManager.INSTANCE.getClient(this.getHighSpeedVideoFpsRangesFor).createCredential(convertRequestToPlayServices(request));
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges(cancellationSignal, this, executor, callback, (com.google.android.gms.identitycredentials.CreateCredentialHandle) obj);
                return highSpeedVideoFpsRanges;
            }
        };
        createCredential.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda8
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.$r8$lambda$5eAfHzadQGveufyO3aKVWVJxnYA(cancellationSignal, this, executor, callback, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(android.os.CancellationSignal cancellationSignal, final androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, com.google.android.gms.identitycredentials.CreateCredentialHandle createCredentialHandle) {
        android.app.PendingIntent pendingIntent = createCredentialHandle.getPendingIntent();
        com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse = createCredentialHandle.getCreateCredentialResponse();
        if (pendingIntent == null && createCredentialResponse == null) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.$r8$lambda$JzPp6u0vFxBT7amXBQo7hAjU7hk(executor, credentialManagerCallback);
                }
            });
            return kotlin.Unit.INSTANCE;
        }
        if (pendingIntent != null) {
            android.content.Intent intent = new android.content.Intent(createPublicKeyCredentialController.getHighSpeedVideoFpsRangesFor, (java.lang.Class<?>) androidx.view.playservices.controllers.identityauth.HiddenActivity.class);
            createPublicKeyCredentialController.generateHiddenActivityIntent(createPublicKeyCredentialController.getHighSpeedVideoSizes, intent, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            intent.putExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingIntent);
            try {
                createPublicKeyCredentialController.getHighSpeedVideoFpsRangesFor.startActivity(intent);
            } catch (java.lang.Exception unused) {
                androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.m9118$r8$lambda$NUvU9uLBbaGpCZFwQwd4VskAiE(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this);
                    }
                });
            }
        }
        if (createCredentialResponse != null) {
            final androidx.view.CreateCredentialResponse convertResponseToCredentialManager = createPublicKeyCredentialController.convertResponseToCredentialManager(createCredentialResponse);
            if (convertResponseToCredentialManager instanceof androidx.view.CreatePublicKeyCredentialResponse) {
                androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.m9117$r8$lambda$IPLVZqHlSmNylgfZx7pGb8mrc(executor, credentialManagerCallback, convertResponseToCredentialManager);
                    }
                });
                return kotlin.Unit.INSTANCE;
            }
        }
        if (pendingIntent == null) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.m9115$r8$lambda$2dXEBSpVvPiss1fLBTru1342Gs(executor, credentialManagerCallback);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, android.content.Intent data) {
        if (uniqueRequestCode != androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release();
            return;
        }
        if (androidx.view.playservices.controllers.CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new kotlin.jvm.functions.Function2() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.m9123$r8$lambda$uNYywg7u0Ju2PbfZaAH3uLbBsk((android.os.CancellationSignal) obj, (kotlin.jvm.functions.Function0) obj2);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.$r8$lambda$ObdFZZ3D_CJFqKkg7sDONVZu9P0(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this, (androidx.view.exceptions.CreateCredentialException) obj);
            }
        }, this.Camera2StreamConfigurationMap)) {
            return;
        }
        if (data == null) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.$r8$lambda$r_aF5l0yXxsXyuQlxgDu1EBP3Cc(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this);
                }
            });
            return;
        }
        final androidx.view.CreateCredentialResponse retrieveCreateCredentialResponse = androidx.view.provider.PendingIntentHandler.INSTANCE.retrieveCreateCredentialResponse(androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, data);
        if (retrieveCreateCredentialResponse != null) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.$r8$lambda$615JIZZeJmSMnz2njL4toqi7rog(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this, retrieveCreateCredentialResponse);
                }
            });
        } else {
            final androidx.view.exceptions.CreateCredentialException retrieveCreateCredentialException = androidx.view.provider.PendingIntentHandler.INSTANCE.retrieveCreateCredentialException(data);
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.$r8$lambda$uGGeNf4DTEBnyzCV8wtOed3bel4(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this, retrieveCreateCredentialException);
                }
            });
        }
    }

    public final androidx.view.exceptions.CreateCredentialException fromGmsException(java.lang.Throwable e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        if (e instanceof com.google.android.gms.common.api.ApiException) {
            int statusCode = ((com.google.android.gms.common.api.ApiException) e).getStatusCode();
            if (statusCode == 16) {
                return new androidx.view.exceptions.CreateCredentialCancellationException(e.getMessage());
            }
            if (statusCode == 17) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("API is not supported: ");
                sb.append(e.getMessage());
                return new androidx.view.exceptions.CreateCredentialUnsupportedException(sb.toString());
            }
            if (statusCode == 8) {
                return new androidx.view.exceptions.CreateCredentialNoCreateOptionException(e.getMessage());
            }
            if (androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getRetryables().contains(java.lang.Integer.valueOf(statusCode))) {
                return new androidx.view.exceptions.CreateCredentialInterruptedException(e.getMessage());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Conditional create failed, failure: ");
            sb2.append(e.getMessage());
            return new androidx.view.exceptions.CreateCredentialUnknownException(sb2.toString());
        }
        if (e instanceof com.google.android.gms.common.api.UnsupportedApiCallException) {
            return new androidx.view.exceptions.CreateCredentialUnsupportedException("API is unsupported");
        }
        return new androidx.view.exceptions.CreateCredentialUnknownException("Conditional create failed, failure: ".concat(java.lang.String.valueOf(e)));
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final com.google.android.gms.identitycredentials.CreateCredentialRequest convertRequestToPlayServices(androidx.view.CreatePublicKeyCredentialRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return new com.google.android.gms.identitycredentials.CreateCredentialRequest(request.getType(), request.getCredentialData(), request.getCandidateQueryData(), request.getOrigin(), request.getRequestJson(), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final androidx.view.CreateCredentialResponse convertResponseToCredentialManager(com.google.android.gms.identitycredentials.CreateCredentialResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return androidx.view.CreateCredentialResponse.INSTANCE.createFrom(response.getType(), response.getData());
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController;", "getInstance", "(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController(context);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$0rmiB0H5LCLbrg7-ZGARZic3eUk, reason: not valid java name */
    public static /* synthetic */ void m9114$r8$lambda$0rmiB0H5LCLbrg7ZGARZic3eUk(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController, androidx.view.exceptions.CreateCredentialException createCredentialException) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = createPublicKeyCredentialController.getHighResolutionOutputSizeshNQ4ISI;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        if (createCredentialException == null) {
            createCredentialException = new androidx.view.exceptions.CreateCredentialUnknownException("No provider data returned");
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    /* renamed from: $r8$lambda$2dXEBSpVvPiss1fLB-Tru1342Gs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9115$r8$lambda$2dXEBSpVvPiss1fLBTru1342Gs(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onError(new androidx.view.exceptions.CreateCredentialUnknownException(null, 1, null));
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$5eAfHzadQGveufyO3aKVWVJxnYA(android.os.CancellationSignal cancellationSignal, final androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.m9120$r8$lambda$ftRDfJ8N7BXl9x_ciHrzaRfy2s(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this, exc, executor, credentialManagerCallback);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$615JIZZeJmSMnz2njL4toqi7rog(final androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController, final androidx.view.CreateCredentialResponse createCredentialResponse) {
        java.util.concurrent.Executor executor = createPublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.$r8$lambda$fZhp8rUum252ivA4WJjz0cUhUx8(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this, createCredentialResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Gx9sRBD-Cy2dKjJt_8Cw6w3dDKs, reason: not valid java name */
    public static /* synthetic */ void m9116$r8$lambda$Gx9sRBDCy2dKjJt_8Cw6w3dDKs(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = createPublicKeyCredentialController.getHighResolutionOutputSizeshNQ4ISI;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new androidx.view.exceptions.CreateCredentialUnknownException("No provider data returned."));
    }

    /* renamed from: $r8$lambda$IPLVZqHlSmNyl-gf-Zx7pGb8mrc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9117$r8$lambda$IPLVZqHlSmNylgfZx7pGb8mrc(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final androidx.view.CreateCredentialResponse createCredentialResponse) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onResult(createCredentialResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JzPp6u0vFxBT7amXBQo7hAjU7hk(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onError(new androidx.view.exceptions.CreateCredentialUnknownException(null, 1, null));
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$N-UvU9uLBbaGpCZFwQwd4VskAiE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9118$r8$lambda$NUvU9uLBbaGpCZFwQwd4VskAiE(final androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        java.util.concurrent.Executor executor = createPublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.$r8$lambda$oAVvz2dwj65mZsOK5sLt_UgC_xU(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ObdFZZ3D_CJFqKkg7sDONVZu9P0(final androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController, final androidx.view.exceptions.CreateCredentialException createCredentialException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCredentialException, "");
        java.util.concurrent.Executor executor = createPublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.m9121$r8$lambda$hnxZblAxHHESnQ0JXMns8VNWfk(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this, createCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$fZhp8rUum252ivA4WJjz0cUhUx8(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController, androidx.view.CreateCredentialResponse createCredentialResponse) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = createPublicKeyCredentialController.getHighResolutionOutputSizeshNQ4ISI;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onResult(createCredentialResponse);
    }

    /* renamed from: $r8$lambda$ftRDfJ-8N7BXl9x_ciHrzaRfy2s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9120$r8$lambda$ftRDfJ8N7BXl9x_ciHrzaRfy2s(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController, java.lang.Exception exc, java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(exc);
        final androidx.view.exceptions.CreateCredentialException fromGmsException = createPublicKeyCredentialController.fromGmsException(exc);
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onError(fromGmsException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hnxZblAxHH-ESnQ0JXMns8VNWfk, reason: not valid java name */
    public static /* synthetic */ void m9121$r8$lambda$hnxZblAxHHESnQ0JXMns8VNWfk(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController, androidx.view.exceptions.CreateCredentialException createCredentialException) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = createPublicKeyCredentialController.getHighResolutionOutputSizeshNQ4ISI;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    public static /* synthetic */ void $r8$lambda$oAVvz2dwj65mZsOK5sLt_UgC_xU(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = createPublicKeyCredentialController.getHighResolutionOutputSizeshNQ4ISI;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new androidx.view.exceptions.CreateCredentialUnknownException(androidx.view.playservices.controllers.CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r_aF5l0yXxsXyuQlxgDu1EBP3Cc(final androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        java.util.concurrent.Executor executor = createPublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.m9116$r8$lambda$Gx9sRBDCy2dKjJt_8Cw6w3dDKs(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uGGeNf4DTEBnyzCV8wtOed3bel4(final androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController createPublicKeyCredentialController, final androidx.view.exceptions.CreateCredentialException createCredentialException) {
        java.util.concurrent.Executor executor = createPublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.m9114$r8$lambda$0rmiB0H5LCLbrg7ZGARZic3eUk(androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController.this, createCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uNYywg7u0Ju2PbfZaAH3uLb-Bsk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9123$r8$lambda$uNYywg7u0Ju2PbfZaAH3uLbBsk(android.os.CancellationSignal cancellationSignal, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, function0);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }
}
