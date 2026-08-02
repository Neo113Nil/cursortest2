package androidx.view.playservices.controllers.identityauth.createpassword;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 )2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001)B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u001e\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010#\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010("}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/CreatePasswordRequest;", "Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;", "", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "invokePlayServices", "(Landroidx/credentials/CreatePasswordRequest;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "handleResponse$credentials_play_services_auth_release", "(II)V", "convertRequestToPlayServices", "(Landroidx/credentials/CreatePasswordRequest;)Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;", "response", "convertResponseToCredentialManager", "(Lkotlin/Unit;)Landroidx/credentials/CreateCredentialResponse;", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Landroidx/credentials/CredentialManagerCallback;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/Executor;", "Landroid/os/CancellationSignal;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$resultReceiver$1;", "Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$resultReceiver$1;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CredentialProviderCreatePasswordController extends androidx.view.playservices.controllers.CredentialProviderController<androidx.view.CreatePasswordRequest, com.google.android.gms.auth.api.identity.SavePasswordRequest, kotlin.Unit, androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.Companion INSTANCE = new androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1 getHighSpeedVideoFpsRangesFor;
    private androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.util.concurrent.Executor Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.os.CancellationSignal getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = context;
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighSpeedVideoFpsRangesFor = new android.os.ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int resultCode, android.os.Bundle resultData) {
                java.util.concurrent.Executor executor;
                java.util.concurrent.Executor executor2;
                androidx.view.CredentialManagerCallback credentialManagerCallback;
                androidx.view.CredentialManagerCallback credentialManagerCallback2;
                android.os.CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultData, "");
                androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this;
                androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE);
                executor = androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this.Camera2StreamConfigurationMap;
                if (executor == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    executor2 = null;
                } else {
                    executor2 = executor;
                }
                credentialManagerCallback = androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this.getHighSpeedVideoFpsRanges;
                if (credentialManagerCallback == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    credentialManagerCallback2 = null;
                } else {
                    credentialManagerCallback2 = credentialManagerCallback;
                }
                cancellationSignal = androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this.getHighResolutionOutputSizeshNQ4ISI;
                maybeReportErrorFromResultReceiver = credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor2, credentialManagerCallback2, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(androidx.view.playservices.controllers.CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode);
            }
        };
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final void invokePlayServices(androidx.view.CreatePasswordRequest request, androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> callback, java.util.concurrent.Executor executor, final android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cancellationSignal;
        this.getHighSpeedVideoFpsRanges = callback;
        this.Camera2StreamConfigurationMap = executor;
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.SavePasswordResult> savePassword = com.google.android.gms.auth.api.identity.Identity.getCredentialSavingClient(this.getHighSpeedVideoSizes).savePassword(convertRequestToPlayServices(request));
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.getHighSpeedVideoFpsRanges(cancellationSignal, this, (com.google.android.gms.auth.api.identity.SavePasswordResult) obj);
                return highSpeedVideoFpsRanges;
            }
        };
        savePassword.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda8
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.$r8$lambda$J9CbyL_WD9CjSUdvRbVF8RWSK4A(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this, cancellationSignal, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(android.os.CancellationSignal cancellationSignal, final androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, com.google.android.gms.auth.api.identity.SavePasswordResult savePasswordResult) {
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return kotlin.Unit.INSTANCE;
        }
        android.content.Intent intent = new android.content.Intent(credentialProviderCreatePasswordController.getHighSpeedVideoSizes, (java.lang.Class<?>) androidx.view.playservices.controllers.identityauth.HiddenActivity.class);
        credentialProviderCreatePasswordController.generateHiddenActivityIntent(credentialProviderCreatePasswordController.getHighSpeedVideoFpsRangesFor, intent, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        intent.putExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, savePasswordResult.getPendingIntent());
        try {
            credentialProviderCreatePasswordController.getHighSpeedVideoSizes.startActivity(intent);
        } catch (java.lang.Exception unused) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.m9090$r8$lambda$O_dXPhs_otElnO47Yul8WNmcx0(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode) {
        if (uniqueRequestCode != androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release();
        } else {
            if (androidx.view.playservices.controllers.CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new kotlin.jvm.functions.Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.$r8$lambda$4xsE6_U8LdShzJF3hGdYEfLpzLA((android.os.CancellationSignal) obj, (kotlin.jvm.functions.Function0) obj2);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.$r8$lambda$dG61krnOpNU8yDd_7HmRAO5Cw5s(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this, (androidx.view.exceptions.CreateCredentialException) obj);
                }
            }, this.getHighResolutionOutputSizeshNQ4ISI)) {
                return;
            }
            final androidx.view.CreateCredentialResponse convertResponseToCredentialManager = convertResponseToCredentialManager(kotlin.Unit.INSTANCE);
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighResolutionOutputSizeshNQ4ISI, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.m9091$r8$lambda$7ZCG_wzlYZGh5Xzq4pA4ccls(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this, convertResponseToCredentialManager);
                }
            });
        }
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final com.google.android.gms.auth.api.identity.SavePasswordRequest convertRequestToPlayServices(androidx.view.CreatePasswordRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        com.google.android.gms.auth.api.identity.SavePasswordRequest build = com.google.android.gms.auth.api.identity.SavePasswordRequest.builder().setSignInPassword(new com.google.android.gms.auth.api.identity.SignInPassword(request.getId(), request.getPassword())).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final androidx.view.CreateCredentialResponse convertResponseToCredentialManager(kotlin.Unit response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return new androidx.view.CreatePasswordResponse();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController;", "getInstance", "(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController(context);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$-O_dXPhs_otElnO47Yul8WNmcx0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9090$r8$lambda$O_dXPhs_otElnO47Yul8WNmcx0(final androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        java.util.concurrent.Executor executor = credentialProviderCreatePasswordController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.m9092$r8$lambda$IWne1h8ta349R5WpDNHZFsfTFs(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4xsE6_U8LdShzJF3hGdYEfLpzLA(android.os.CancellationSignal cancellationSignal, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, function0);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7ZCG_w-zlYZ-Gh5Xzq4pA4c-cls, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9091$r8$lambda$7ZCG_wzlYZGh5Xzq4pA4ccls(final androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final androidx.view.CreateCredentialResponse createCredentialResponse) {
        java.util.concurrent.Executor executor = credentialProviderCreatePasswordController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.$r8$lambda$hSbYVe_uh46rxGV4Nmqq4LhWwvg(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this, createCredentialResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$Eb27e2MpWd32Dh7DyNwl1JK6CTE(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, androidx.view.exceptions.CreateCredentialException createCredentialException) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePasswordController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    /* renamed from: $r8$lambda$IWne1h8ta349R5W-pDNHZFsfTFs, reason: not valid java name */
    public static /* synthetic */ void m9092$r8$lambda$IWne1h8ta349R5WpDNHZFsfTFs(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePasswordController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new androidx.view.exceptions.CreateCredentialUnknownException(androidx.view.playservices.controllers.CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public static /* synthetic */ void $r8$lambda$J9CbyL_WD9CjSUdvRbVF8RWSK4A(final androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, android.os.CancellationSignal cancellationSignal, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        java.lang.Exception exc2 = exc;
        java.lang.String str = ((exc2 instanceof com.google.android.gms.common.api.ApiException) && androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getRetryables().contains(java.lang.Integer.valueOf(((com.google.android.gms.common.api.ApiException) exc2).getStatusCode()))) ? androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_INTERRUPTED : androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_UNKNOWN;
        androidx.view.playservices.controllers.CredentialProviderBaseController.Companion companion = androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("During save password, found password failure response from one tap ");
        sb.append(exc2.getMessage());
        final androidx.view.exceptions.CreateCredentialException createCredentialExceptionTypeToException$credentials_play_services_auth_release = companion.createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, sb.toString());
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.m9093$r8$lambda$uORFBoWOmMz5ghwGtghu4RYqeE(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this, createCredentialExceptionTypeToException$credentials_play_services_auth_release);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dG61krnOpNU8yDd_7HmRAO5Cw5s(final androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final androidx.view.exceptions.CreateCredentialException createCredentialException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCredentialException, "");
        java.util.concurrent.Executor executor = credentialProviderCreatePasswordController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.$r8$lambda$Eb27e2MpWd32Dh7DyNwl1JK6CTE(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this, createCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$hSbYVe_uh46rxGV4Nmqq4LhWwvg(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, androidx.view.CreateCredentialResponse createCredentialResponse) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePasswordController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onResult(createCredentialResponse);
    }

    /* renamed from: $r8$lambda$uORFBo-WOmMz5ghwGtghu4RYqeE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9093$r8$lambda$uORFBoWOmMz5ghwGtghu4RYqeE(final androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final androidx.view.exceptions.CreateCredentialException createCredentialException) {
        java.util.concurrent.Executor executor = credentialProviderCreatePasswordController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.$r8$lambda$yEiCcZOvXWfo_8HxjaNJhpaUvSs(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.this, createCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$yEiCcZOvXWfo_8HxjaNJhpaUvSs(androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, androidx.view.exceptions.CreateCredentialException createCredentialException) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePasswordController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }
}
