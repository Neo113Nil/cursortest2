package androidx.view.playservices.controllers.identitycredentials.createpasswordcredential;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 -2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001-B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010#\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010,"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/CreatePasswordRequest;", "Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", "", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "invokePlayServices", "(Landroidx/credentials/CreatePasswordRequest;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Landroidx/credentials/CreatePasswordRequest;)Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lkotlin/Unit;)Landroidx/credentials/CreateCredentialResponse;", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "Landroidx/credentials/CredentialManagerCallback;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/Executor;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroid/os/CancellationSignal;", "Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController$resultReceiver$1;", "Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController$resultReceiver$1;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreatePasswordCredentialController extends androidx.view.playservices.controllers.CredentialProviderController<androidx.view.CreatePasswordRequest, com.google.android.gms.identitycredentials.CreateCredentialRequest, kotlin.Unit, androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.Companion INSTANCE = new androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.Companion(null);
    private final android.content.Context context;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.concurrent.Executor Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1 getHighSpeedVideoFpsRanges;
    private android.os.CancellationSignal getHighSpeedVideoSizes;

    public final android.content.Context getContext() {
        return this.context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1] */
    public CreatePasswordCredentialController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighSpeedVideoFpsRanges = new android.os.ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int resultCode, android.os.Bundle resultData) {
                java.util.concurrent.Executor executor;
                java.util.concurrent.Executor executor2;
                androidx.view.CredentialManagerCallback credentialManagerCallback;
                androidx.view.CredentialManagerCallback credentialManagerCallback2;
                android.os.CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultData, "");
                androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController = androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this;
                androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1 createPasswordCredentialController$resultReceiver$1$onReceiveResult$1 = new androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1(androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE);
                executor = androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this.Camera2StreamConfigurationMap;
                if (executor == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    executor2 = null;
                } else {
                    executor2 = executor;
                }
                credentialManagerCallback = androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this.getHighSpeedVideoFpsRangesFor;
                if (credentialManagerCallback == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    credentialManagerCallback2 = null;
                } else {
                    credentialManagerCallback2 = credentialManagerCallback;
                }
                cancellationSignal = androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this.getHighSpeedVideoSizes;
                maybeReportErrorFromResultReceiver = createPasswordCredentialController.maybeReportErrorFromResultReceiver(resultData, createPasswordCredentialController$resultReceiver$1$onReceiveResult$1, executor2, credentialManagerCallback2, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(androidx.view.playservices.controllers.CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (android.content.Intent) androidx.core.os.BundleCompat.getParcelable(resultData, androidx.view.playservices.controllers.CredentialProviderBaseController.RESULT_DATA_TAG, android.content.Intent.class));
            }
        };
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final void invokePlayServices(final androidx.view.CreatePasswordRequest request, final androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> callback, final java.util.concurrent.Executor executor, final android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.getHighSpeedVideoSizes = cancellationSignal;
        this.getHighSpeedVideoFpsRangesFor = callback;
        this.Camera2StreamConfigurationMap = executor;
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        com.google.android.gms.tasks.Task<com.google.android.gms.identitycredentials.CreateCredentialHandle> createCredential = com.google.android.gms.identitycredentials.IdentityCredentialManager.INSTANCE.getClient(this.context).createCredential(convertRequestToPlayServices(request));
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.getHighSpeedVideoSizes(cancellationSignal, this, (com.google.android.gms.identitycredentials.CreateCredentialHandle) obj);
                return highSpeedVideoSizes;
            }
        };
        createCredential.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda6
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.m9109$r8$lambda$SEpUhc8eTMDMYxewKGgD95FbXo(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this, request, callback, executor, cancellationSignal, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(android.os.CancellationSignal cancellationSignal, final androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController, com.google.android.gms.identitycredentials.CreateCredentialHandle createCredentialHandle) {
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return kotlin.Unit.INSTANCE;
        }
        android.content.Intent intent = new android.content.Intent(createPasswordCredentialController.context, (java.lang.Class<?>) androidx.view.playservices.controllers.identityauth.HiddenActivity.class);
        createPasswordCredentialController.generateHiddenActivityIntent(createPasswordCredentialController.getHighSpeedVideoFpsRanges, intent, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        intent.putExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, createCredentialHandle.getPendingIntent());
        try {
            createPasswordCredentialController.context.startActivity(intent);
        } catch (java.lang.Exception unused) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.m9113$r8$lambda$tfb6AXBCoRjyQ2QcKUlE0DqV0c(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final com.google.android.gms.identitycredentials.CreateCredentialRequest convertRequestToPlayServices(androidx.view.CreatePasswordRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return new com.google.android.gms.identitycredentials.CreateCredentialRequest(request.getType(), request.getCredentialData(), request.getCandidateQueryData(), request.getOrigin(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final androidx.view.CreateCredentialResponse convertResponseToCredentialManager(kotlin.Unit response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return new androidx.view.CreatePasswordResponse();
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, android.content.Intent data) {
        if (uniqueRequestCode != androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release();
            return;
        }
        if (androidx.view.playservices.controllers.CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new kotlin.jvm.functions.Function2() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.$r8$lambda$Quqqj6qbZSWGgsJrcTRm9MJ7N5o((android.os.CancellationSignal) obj, (kotlin.jvm.functions.Function0) obj2);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.$r8$lambda$YDhFzjNy9NBWiLm0kln8k3TttYY(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this, (androidx.view.exceptions.CreateCredentialException) obj);
            }
        }, this.getHighSpeedVideoSizes)) {
            return;
        }
        if (data == null) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoSizes, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.$r8$lambda$BTMHy4P8A0apWaJenJDNr6V_Osw(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this);
                }
            });
            return;
        }
        final androidx.view.CreateCredentialResponse retrieveCreateCredentialResponse = androidx.view.provider.PendingIntentHandler.INSTANCE.retrieveCreateCredentialResponse(androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL, data);
        if (retrieveCreateCredentialResponse != null) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoSizes, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.m9110$r8$lambda$YHYS51_u26JzfMqtTlcITeQI_4(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this, retrieveCreateCredentialResponse);
                }
            });
        } else {
            final androidx.view.exceptions.CreateCredentialException retrieveCreateCredentialException = androidx.view.provider.PendingIntentHandler.INSTANCE.retrieveCreateCredentialException(data);
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoSizes, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.$r8$lambda$ob5GFIyCw7enkrZGpSEdDkNj7TU(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this, retrieveCreateCredentialException);
                }
            });
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController;", "getInstance", "(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController(context);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$-zS4niIIF223q0IeyLb98SRhJ8M, reason: not valid java name */
    public static /* synthetic */ void m9108$r8$lambda$zS4niIIF223q0IeyLb98SRhJ8M(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = createPasswordCredentialController.getHighSpeedVideoFpsRangesFor;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new androidx.view.exceptions.CreateCredentialUnknownException("No provider data returned."));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BTMHy4P8A0apWaJenJDNr6V_Osw(final androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController) {
        java.util.concurrent.Executor executor = createPasswordCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.m9108$r8$lambda$zS4niIIF223q0IeyLb98SRhJ8M(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$HGABGef_07gkBTBNF90kmSKs_Fw(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = createPasswordCredentialController.getHighSpeedVideoFpsRangesFor;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new androidx.view.exceptions.CreateCredentialUnknownException(androidx.view.playservices.controllers.CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public static /* synthetic */ void $r8$lambda$Lyf6Ctlley0nqSHoIbPbzGbFflI(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController, androidx.view.CreateCredentialResponse createCredentialResponse) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = createPasswordCredentialController.getHighSpeedVideoFpsRangesFor;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onResult(createCredentialResponse);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Quqqj6qbZSWGgsJrcTRm9MJ7N5o(android.os.CancellationSignal cancellationSignal, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, function0);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SEpUh-c8eTMDMYxewKGgD95FbXo, reason: not valid java name */
    public static /* synthetic */ void m9109$r8$lambda$SEpUhc8eTMDMYxewKGgD95FbXo(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController, androidx.view.CreatePasswordRequest createPasswordRequest, androidx.view.CredentialManagerCallback credentialManagerCallback, java.util.concurrent.Executor executor, android.os.CancellationSignal cancellationSignal, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        new androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController(createPasswordCredentialController.context).invokePlayServices(createPasswordRequest, (androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException>) credentialManagerCallback, executor, cancellationSignal);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YDhFzjNy9NBWiLm0kln8k3TttYY(final androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController, final androidx.view.exceptions.CreateCredentialException createCredentialException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCredentialException, "");
        java.util.concurrent.Executor executor = createPasswordCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.m9112$r8$lambda$rc7nA7J6B00Sosi6f1jFImhvog(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this, createCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YHYS51_u26JzfM-qtTlcITeQI_4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9110$r8$lambda$YHYS51_u26JzfMqtTlcITeQI_4(final androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController, final androidx.view.CreateCredentialResponse createCredentialResponse) {
        java.util.concurrent.Executor executor = createPasswordCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.$r8$lambda$Lyf6Ctlley0nqSHoIbPbzGbFflI(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this, createCredentialResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_UNO_BsMjdc9-WGtBy0s3f-Wa2c, reason: not valid java name */
    public static /* synthetic */ void m9111$r8$lambda$_UNO_BsMjdc9WGtBy0s3fWa2c(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController, androidx.view.exceptions.CreateCredentialException createCredentialException) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = createPasswordCredentialController.getHighSpeedVideoFpsRangesFor;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        if (createCredentialException == null) {
            createCredentialException = new androidx.view.exceptions.CreateCredentialUnknownException("No provider data returned");
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ob5GFIyCw7enkrZGpSEdDkNj7TU(final androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController, final androidx.view.exceptions.CreateCredentialException createCredentialException) {
        java.util.concurrent.Executor executor = createPasswordCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.m9111$r8$lambda$_UNO_BsMjdc9WGtBy0s3fWa2c(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this, createCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rc7nA7J6B00-Sosi6f1jFImhvog, reason: not valid java name */
    public static /* synthetic */ void m9112$r8$lambda$rc7nA7J6B00Sosi6f1jFImhvog(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController, androidx.view.exceptions.CreateCredentialException createCredentialException) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = createPasswordCredentialController.getHighSpeedVideoFpsRangesFor;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    /* renamed from: $r8$lambda$tfb6AXBCoRjyQ-2QcKUlE0DqV0c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9113$r8$lambda$tfb6AXBCoRjyQ2QcKUlE0DqV0c(final androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController createPasswordCredentialController) {
        java.util.concurrent.Executor executor = createPasswordCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.$r8$lambda$HGABGef_07gkBTBNF90kmSKs_Fw(androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }
}
